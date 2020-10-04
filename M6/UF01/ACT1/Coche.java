/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

/**
 *
 * @author Raul
 */
public class Coche implements java.io.Serializable {
    private String marca;
    private String model;
    private int any;
    private String matricula;
    
    
    
    public Coche(String marca, String model,int any,String matricula){
        this.marca=marca;
        this.model=model;
        this.any=any;
        this.matricula=matricula;
    }

    
    
    public void setMarca(String marca) {
        this.marca=marca;
		}
    public String getMarca() {
            return this.marca;
		}
    
    
    public void setModel(String model) {
	this.model=model;	
		}
    public String getModel() {
        return this.model;
		}

    
    
    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
    
    
    
    public void setMatricula(String matricula) {
        this.matricula=matricula;
		}
    public String getMatricula() {
            return this.matricula;
		}
    
    
    
}
