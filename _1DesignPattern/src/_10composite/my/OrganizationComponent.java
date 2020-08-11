package _10composite.my;

/**
 * @author 孟享广
 * @date 2020-08-11 9:59 下午
 * @description
 */
public abstract class OrganizationComponent {
    private String m_name;
    private String m_des;

    public OrganizationComponent(String m_name, String m_des) {
        this.m_name = m_name;
        this.m_des = m_des;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_des() {
        return m_des;
    }

    public void setM_des(String m_des) {
        this.m_des = m_des;
    }

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

}
