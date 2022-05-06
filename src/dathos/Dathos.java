/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dathos;

/**
 *
 * @author invitado
 */
public class Dathos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando objeto "inf"
        Informacion inf = new Informacion("Brandon","Sistemas",2);
        // Encapsular
        String NumCon = inf.getNombre()+""+inf.getCarrera()+""+inf.getSemestre()+"";
        System.out.println("Datos del alumno:     "+NumCon);
    }
    
}
