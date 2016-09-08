/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

/**
 *
 * @author Alumno
 */
public class BeanUsuario extends BeanPersonal {
    private Integer userCodigo;
    private String userLogin;
    private String userEstado;
   

    public Integer getUserCodigo() {
        return userCodigo;
    }

    public void setUserCodigo(Integer userCodigo) {
        this.userCodigo = userCodigo;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserEstado() {
        return userEstado;
    }

    public void setUserEstado(String userEstado) {
        this.userEstado = userEstado;
    }

    
    
    
    
    
}
