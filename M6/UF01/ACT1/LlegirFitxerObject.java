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

/**
 *
 * @author Raul
 */
public class LlegirFitxerObject {
       public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Camp variable tipus Comarca
		Coche coche;
		//Declaració del fitxer
		File fitxer = new File("C:\\Users\\Raul\\Desktop\\coches.txt");
		//Crea el flux d'entrada
		FileInputStream filein = new FileInputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectInputStream dataInCoche = new ObjectInputStream(filein);
		
		try {
			while (true){//Llegeix el fitxer
				//Llegeix la comarca
				coche = (Coche) dataInCoche.readObject();
				System.out.println("marca: " +coche.getMarca()+ " Any: "+ coche.getAny()+"model:"+coche.getModel()+"matricula:"+coche.getMatricula());
			}
		} catch (EOFException eo) {}
		dataInCoche.close();//Tanca el stream d'entrada

}

}
