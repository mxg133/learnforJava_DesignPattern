package principle._3inversion.improve;

public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

		//通过构造器进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose(changHong);5
//		openAndClose.open();
		//通过setter方法进行依赖传递
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.setTv(changHong);
		openAndClose.open();

	}

}

// 方式1： 通过接口传递实现依赖
// 开关的接口
 interface IOpenAndClose1 {
 	public void open1(ITV1 tv); //抽象方法,接收接口
 }

 interface ITV1 { //ITV接口
 	public void play1();
 }

 class ChangHong1 implements ITV1 {

	@Override
	public void play1() {
		// TODO Auto-generated method stub
		System.out.println("长虹电视机，打开");
	}
 }
// 实现接口
 class OpenAndClose1 implements IOpenAndClose1{
 	public void open1(ITV1 tv){
 		tv.play1();
 }
 }

// 方式2: 通过构造方法依赖传递
 interface IOpenAndClose2 {
 	public void open2(); //抽象方法
 }
 interface ITV2 { //ITV接口
 	public void play2();
 }
 class OpenAndClose2 implements IOpenAndClose2{
	 public ITV2 tv; //成员
	 public OpenAndClose2(ITV2 tv){ //构造器
	 	this.tv = tv;
 	}
 	public void open2(){
	 	this.tv.play2();
	 }
 }


// 方式3 , 通过setter方法传递
interface IOpenAndClose {
	public void open(); // 抽象方法
	public void setTv(ITV tv);
}

interface ITV { // ITV接口
	public void play();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}

class ChangHong implements ITV {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("长虹电视机，打开");
	}
}