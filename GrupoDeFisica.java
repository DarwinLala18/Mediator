/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.HashMap;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Equipo
 */
    public class GrupoDeFisica implements IGrupoDeFisica{
    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();
    
    public void registra(Usuario user){
        participantes.put(user.getNombre(), user);
        
    }
    public void envia(String de, String a, String msg){
        if(participantes.containsKey(de) && participantes.containsKey(a)){
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
            
        }else{
            System.out.println("Usuario Inexistente");
        }
    }
    
}
