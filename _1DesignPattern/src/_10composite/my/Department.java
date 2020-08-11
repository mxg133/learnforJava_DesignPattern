package _10composite.my;

/**
 * @author 孟享广
 * @date 2020-08-11 10:22 下午
 * @description
 */
public class Department extends OrganizationComponent {

    public Department(String m_name, String m_des) {
        super(m_name, m_des);
    }

    @Override
    public String getM_name() {
        return super.getM_name();
    }

    @Override
    public String getM_des() {
        return super.getM_des();
    }

    @Override
    protected void print() {
        System.out.println(getM_name());
    }
}
