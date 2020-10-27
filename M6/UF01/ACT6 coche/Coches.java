/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT6;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raul
 */
@XmlRootElement
public class Coches {
   
   private Coche[] coches;
   
   public Coche[] getCoches(){
     return coches;
   }
    
    public void setCoches(Coche[] coches){
        this.coches=coches;
    }
    
}

//
//@XmlRootElement
//class Alumnes {
//	
//	private Alumne[] alumnes;
// 
//	
//	public Alumne[] getAlumnes() {
//		return alumnes;
//	}
//	public void setAlumnes(Alumne[] alumnes) {
//		this.alumnes = alumnes;
//	}