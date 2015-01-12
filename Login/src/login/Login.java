/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

/**
 *
 * @author c0642703
 */
public class Login {
    
    public String doLogin(String username, String password){
        if(username.isEmpty()){
            return "ERROR: Invalid Username";
        }
        if(password.isEmpty()){
            return "ERROR: Invalid Password";
        }
        return null;
    }
}
