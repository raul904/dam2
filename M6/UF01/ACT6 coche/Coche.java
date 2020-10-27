/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT6;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Raul
 */
public class Coche {
    
        private int id;
        private int notaFinal;	
        private String matricula;
        private String marca;
        private int precio;
        
        
        @XmlAttribute(name="id")        
        public int getId() {
		return this.id;
	}        
            
	public void setId(int id) {
		this.id = id;
	}
        
        public String getMatricula(){
                return matricula;
        }
        
        public void setMatricula(String matricula) {
		this.matricula = matricula;
	}   
        
        public String getMarca(){
            return this.marca;
        }
        
        public void setMarca(String marca){
             this.marca=marca;
        }
        
        public int getPrecio(){
                return this.precio;
        }
        
        public void setPrecio(int precio){
                this.precio=precio;
        }
    
    
    
}
