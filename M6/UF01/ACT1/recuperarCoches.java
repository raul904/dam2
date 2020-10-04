/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import exercici2.leer1x1;
import exercici.
/**
 *
 * @author Raul
 */
public class recuperarCoches {
                
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);   

	//Declaració del fitxer
	File fitxer = new File("C:\\Users\\Raul\\Desktop\\coches.txt");
		//Crea el flux d'entrada
	FileInputStream filein = new FileInputStream(fitxer);
	//Connectar el flux de bytes al flux de dades
	ObjectInputStream dataInCoche = new ObjectInputStream(filein);
        int i=0;
        int opcio=0;
        String marcaEnt;
        
        
        try {
			while (true){//Llegeix el fitxer
				//Llegeix la comarca
                            
                              
                             
                              
                                System.out.println("1.Cercar coches per marca:)");
                                System.out.println("2.Cercar coches per model");
                                System.out.println("3.Cercar coches per any");
                                System.out.println("4.Cercar coches per matricula");
                              
                              
                              switch (opcio){
                                case 1:
                                    marcaEnt=sc.next();
                                for(i=0;i<marcaEnt.length();i++){   
                                    if (marcaEnt.equalsIgnoreCase()) {
                                    System.out.println("a y b son iguales");
                                    }
                                    } 
                                 break;   
                              }
                              
                              
                              
                              
                              
				//coche = (Coche) dataInCoche.readObject();
				//System.out.println("marca: " +coche.getMarca()+ " Any: "+ coche.getAny()+"model:"+coche.getModel()+"matricula:"+coche.getMatricula());
			}
		} catch (EOFException eo) {}
		dataInCoche.close();//Tanca el stream d'entrada
                
                
                
    }
}
