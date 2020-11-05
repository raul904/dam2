/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act4;

/**
 *
 * @author Raul
 */
import java.io.FileOutputStream;
import static Act2.SecretKey.Act2Key.keygenKeyGeneration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import static sun.security.krb5.internal.ktab.KeyTabConstants.keySize;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Act4 {

	public static void main(String[] args) throws IOException {
		
	
	Scanner sc = new Scanner (System.in);
        
        byte [] c1 = null;
	byte [] c2 = null;
	byte [] c3 = null;
	String clave;
	String frase = null;
	String linea;
	String linea2;
	String linea3;
	
	String s1=null;
    
  
	System.out.println("Clave:");
	clave=sc.next();
	
	System.out.println("Texto inicial: ");
        

	
        byte [] c10 = passwordKeyGeneration(clave).getEncoded();
	SecretKey sKey = passwordKeyGeneration(clave);
        

        
        byte[] content = Files.readAllBytes(Paths.get("C:\\Users\\Raul\\Documents\\NetBeansProjects\\m9\\src\\Act4\\texto.txt"));
            

        c1 =encryptData(sKey,content);
                System.out.println("mensaje encriptado:"); 
                System.out.println(c1); 
                

         
            
       
           byte[] d1=decryptData(sKey,c1);

           try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Raul\\Documents\\NetBeansProjects\\m9\\src\\Act4\\texto2.txt")) {
        fos.write(d1);

}
  

}
	

	public static byte[] encryptData(SecretKey sKey, byte[] data) {
		byte[] encryptedData = null;
		
		try {
                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    cipher.init(Cipher.ENCRYPT_MODE, sKey);
                    encryptedData = cipher.doFinal(data);
		}
                
		catch (Exception ex) {
                    System.err.println("Error xifrant les dades: " + ex);
		}
                
		return encryptedData;
		}
	

	public static byte[] decryptData(SecretKey sKey1, byte[] data) {
		
                byte[] encoded = null;
		
		try {
                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    cipher.init(Cipher.DECRYPT_MODE, sKey1);
                    encoded = cipher.doFinal(data);
		}
		catch (Exception ex) {
                    System.err.println("Error desxifrant les dades: " + ex);
		}
		return encoded;
		}
	

	public static SecretKey passwordKeyGeneration(String text) {
		SecretKeySpec sKey = null;
		int keySize=128;
		if ((keySize == 128)|| (keySize==192)||(keySize==256)) {
			try {
				
				byte[] data = text.getBytes("UTF-8");
				MessageDigest md = MessageDigest.getInstance("SHA-256");
				byte [] hash = md.digest(data);
			    byte [] key = Arrays.copyOf(hash, keySize/8);
				sKey = new SecretKeySpec(key, "AES");
				
			
				
			}catch(Exception ex) {
				System.err.println("Error al generar la clau."+ ex);
			}
		} return sKey;
	}
	
	
		public static SecretKey passwordKeyGeneration2(String text) {
			SecretKeySpec sKey = null;
			
			int keySize=128;
			if ((keySize == 128)|| (keySize==192)||(keySize==256)) {
				try {
					
					byte[] data = text.getBytes("UTF-8");
					MessageDigest md = MessageDigest.getInstance("SHA-256");
					byte [] hash = md.digest(data);
                                        byte [] key = Arrays.copyOf(hash, keySize/8);
					sKey = new SecretKeySpec(key, "AES");
					
				
					
				}catch(Exception ex) {
					System.err.println("Error al generar la clau."+ ex);
				}
                                
			} return sKey;
		}
	
	


}