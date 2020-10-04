/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m9;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class ac1Desencriptar {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int [] resultado2=new int[15];
        int resultado;
        char[] texto= new char[15];
        String temp = null;
        int [] ascitemp=new int[15];
        int n;
        char asciivalue;
        char [] asciivalue2 = new char[15];
        
        
        System.out.print("Clau de desencripció:");
        n=sc.nextInt();
        
       System.out.print("Entra el teu text de maxim 15 caracters s'han d'omplir tots osigui 15 (introdueix d'un en un):");
        
        
        for(int i=0;i<15;i++){  
        temp=sc.next();
        if(temp.length()==1){
        texto[i]=temp.charAt(0);
        resultado=texto[i]-n;
        asciivalue= (char) resultado;//pasar a char
        }else{
        System.out.println("Només es poden entrar caracters:");    
        }
        }
        
        for(int i=0;i<15;i++){
        resultado2[i]=texto[i]-n;
        asciivalue2[i] = (char) resultado2[i];
        }
        System.out.println(String.valueOf(asciivalue2));//Passar array a string
        }
    
}
