/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACT6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Raul
 */
public class JAXB {
    
    private static final String COCHES_XML_FILE = "coches.xml";
 
	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Coches.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Coches coches = ompleCoches();
		
		//Mostrem el document XML generat por la sortida estandard
		marshaller.marshal(coches, System.out);
		
		FileOutputStream fos = new FileOutputStream(COCHES_XML_FILE);
		//guardem l'objecte serializat en un document XML
		marshaller.marshal(coches, fos);
		fos.close();
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//Deserialitzem a partir de un document XML
		Coches cochesAux = (Coches) unmarshaller.unmarshal(new File(COCHES_XML_FILE));
		System.out.println("********* Alumnes carregat desde fitxer XML***************");
		//Mostrem l'objeto Java obtingut
		marshaller.marshal(cochesAux, System.out);
                
                
    
}

    private static Coches ompleCoches(){

                    String[] marca = {"AUDI", "SEAT","BMW", "TOYOTA"};
                    String[] matricula = {"30000", "2222BBB", "3333CCC","4444DDD"};
                    int[] precio = {20000, 10000, 4700, 8000};
                    Coche[] ArrayCoches = new Coche[4];

                    for(int i=0; i<4; i++){
                            ArrayCoches[i] = new Coche();
                            ArrayCoches[i].setMarca(marca[i]);
                            ArrayCoches[i].setMatricula(matricula[i]);
                            ArrayCoches[i].setPrecio(precio[i]);
                            ArrayCoches[i].setId(i);			
                    }

                    Coches coches = new Coches();
                    coches.setCoches(ArrayCoches);

                    return coches;
            }













}