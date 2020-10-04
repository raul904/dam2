package exercici2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import exercici2.Coche;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumne
 */

public class EscriureFitxerObject{
    private static Object coche;
    
  
    public static void main(String[] args) throws IOException {
		//Camp variable tipus Comarca
		Coche coche;
		//Declaració del fitxer
		File fitxer = new File("C:\\Users\\Raul\\Desktop\\coches.txt");
		//Crea el flux de sortida
		FileOutputStream fileout = new FileOutputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectOutputStream dataOuCoche = new ObjectOutputStream(fileout);
		
                 
                 
                String[] marca = {"BMW", "AUDI", "FERRARI", "MERCEDES"};
		int[] any = {2015, 2012, 1997, 1999};
                String[] model ={"M3","TT","458","Amg"};
                String[] matricula = {"2017DPF","6754FGH","TRE9021","7624GHF"};
		//Recorre els arrays
		for (int i=0; i<marca.length; i++){//Crea la comarca
			coche = new Coche (marca[i], model[i],any[i],matricula[i]);
			dataOuCoche.writeObject(coche);//L'escriu al fixer
		}
		dataOuCoche.close();//Tanca el stream de sortida
	}

}