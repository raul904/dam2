/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;


/**
 *
 * @author Raul
 */
public class leer1x1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
     Scanner sc = new Scanner(System.in);    
        
    int chivato=0;    
                Coche coche;
		//Declaració del fitxer
		File fitxer = new File("C:\\Users\\Raul\\Desktop\\cochesRaul.txt");
		//Crea el flux d'entrada
		FileInputStream filein = new FileInputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectInputStream dataInCoche = new ObjectInputStream(filein);
            
        
                    //arrays
                    int[] any= new int[10];   
                    String[] marca = new String[10]; 
                    String[] model= new String[10];
                    String[] matricula=new String[10];
                    int i=0;
                    
                            while(chivato!=1){
                 
                                int option=0;   
                               
                              
                                System.out.println("1.Ficar coche (Màxim 10 coches)");
                                System.out.println("2.Mostrar coche");
                                System.out.println("3.Salir");
                                
                                int opcion = sc.nextInt();
                                
                                switch(opcion){
                              //(String marca, String model,int any,String matricula
                                case 1:
                                   System.out.print("Marca:");
                                   marca[i] =sc.next();
                                   System.out.print("Modelo:");
                                   model[i] =sc.next();
                                   System.out.print("Año:");
                                   any[i]=sc.nextInt();
                                   System.out.print("Matricula:");
                                   matricula[i]=sc.next();
                                   i++;
                                   
                                break;
                                
                                case 2:
                                  for(int j=0;j<i;j++){
                                  System.out.println(marca[j]);
                                  System.out.println(model[j]);
                                  System.out.println(any[j]);
                                  System.out.println(matricula[j]);
                                  System.out.println();
                                  }  
                                                    
                                break;
                                
                                case 3:
                                 chivato=1;
                                break;
                                
                                    
                            
                            
                                }


                                


                                    }




                          }

  

}
