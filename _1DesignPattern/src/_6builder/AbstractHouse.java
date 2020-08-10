package _6builder;

public abstract class AbstractHouse {

	//打地基
	public abstract void buildBasic();
	//砌 墙
	public abstract void buildWalls();
	//封 顶
	public abstract void roofed();

	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}

}

