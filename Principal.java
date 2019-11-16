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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrupoDeFisica s = new GrupoDeFisica();
        
        Usuario u=new Usuario(s);
        u.setNombre("Juan");
        s.registra(u);
        
        Usuario u1 = new Usuario(s);
        u1.setNombre("Pepe");
        s.registra(u1);
        
        Usuario u2 = new Usuario(s);
        u2.setNombre("Pedro");
        s.registra(u2);
        
        u.envia("Pepe", "Qué hay de tarea?");
        u1.envia("Juan", "Los ejercicios del libro?");
        u2.envia("Daniel", "Mañana hay clases?");
    }

  
}
