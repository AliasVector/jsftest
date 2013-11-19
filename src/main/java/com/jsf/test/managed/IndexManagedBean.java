package com.jsf.test.managed;

import com.jsf.test.navigation.Navigation;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author roman
 */
@ManagedBean
@RequestScoped
public class IndexManagedBean {

    private String firstName;
    
    public IndexManagedBean() {
    }
 
    @PostConstruct
    private void init() {
        firstName = "Faces";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String goToUserDatails() {
        return Navigation.SUCCESS;
    }
}
