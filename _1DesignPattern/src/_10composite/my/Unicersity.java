package _10composite.my;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-08-11 10:08 下午
 * @description
 */
public class Unicersity extends OrganizationComponent {

     List<OrganizationComponent> collages = new ArrayList<>();

    public Unicersity(String m_name, String m_des) {
        super(m_name, m_des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        collages.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        collages.remove(organizationComponent);
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
        for (OrganizationComponent organizationComponent : collages){
            organizationComponent.print();
        }
    }
}
