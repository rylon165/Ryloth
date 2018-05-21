/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author 4100887818
 */
public class Loginon {
    private String name;
    private String lastName;
    private String password;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public void loginDetails(String name, String password){
    System.out.println("User: "+name+"");
    System.out.println("Password: "+password+"");
    
    }
    
}
    