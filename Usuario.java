/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Equipo
 */
public class Usuario implements IUsuarioChat{
    private String nombre;
    private GrupoDeFisica grupo;
    
    public Usuario(GrupoDeFisica salonDeChat){
        grupo = salonDeChat;
    }
    public void recibe(String de, String msg){
        String  s="el usuario "+ de + " te dice: " + msg;
            System.out.println(nombre + ": "+s);
    }
     public void envia(String a, String msg){
        grupo.envia(nombre, a, msg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
         
     
}
