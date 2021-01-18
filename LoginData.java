/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LoginData {
    
    private int empid;
    private String loginid,username,password;
    
    public LoginData(String loginid,String username,String password,int empid)
    {
        this.loginid=loginid;
        this.username=username;
        this.password=password;
        this.empid=empid;
    }

    /**
     * @return the empid
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    /**
     * @return the loginid
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * @param loginid the loginid to set
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
