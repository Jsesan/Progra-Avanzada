package unlam.progava.utils;

import static unlam.progava.DatosDelAlumno.apellidos;
import static unlam.progava.DatosDelAlumno.documento;
import static unlam.progava.DatosDelAlumno.nombres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import unlam.progava.Ejercicio2;
import unlam.progava.Ejercicio3;
import unlam.progava.Ejercicio4;
import unlam.progava.oia.EjercicioOIA;

public class Entrega {

	private String instancia() {
		return "Evaluación de Aprendizajes 2";
	}

	private String fecha() {
		return "16 y 17 de Noviembre de 2020";
	}

	private String timestamp() {
		return new Date().toString();
	}

	private String nombreCompleto() {
		return apellidos().toUpperCase() + ", " + nombres();
	}

	public boolean generar() throws IOException {
		FileWriter myWriter = new FileWriter(documento() + "-" + nombreCompleto() + ".html");
		myWriter.write(interpolar(archivoCompleto("entrega.tpl")));
		myWriter.close();
		return true;
	}

	private String archivoCompleto(String ruta) throws FileNotFoundException {
		File myObj = new File(ruta);
		Scanner myReader = new Scanner(myObj);
		String contenido = "";
		while (myReader.hasNextLine()) {
			contenido += myReader.nextLine() + "\n";
		}
		myReader.close();
		return contenido;
	}

	private String interpolar(String template) throws FileNotFoundException {
		Map<String, String> data = new HashMap<String, String>();
		
		data.put("%%INSTANCIA%%", instancia());
		data.put("%%NOMBRECOMPLETO%%", nombreCompleto());
		data.put("%%FECHA%%", fecha());
		data.put("%%DOCUMENTO%%", "" + documento());
		data.put("%%TIMESTAMP%%", timestamp());
		
		EjercicioOIA ejercicio1 = new EjercicioOIA();
		Ejercicio2 ejercicio2 = new Ejercicio2();
		Ejercicio3 ejercicio3 = new Ejercicio3();
		Ejercicio4 ejercicio4 = new Ejercicio4();
		
		data.put("%%EJ1CC%%", ejercicio1.complejidadDeMiSolucion().toString());
		
		String code = codigoEjercicio2().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		data.put("%%EJ2%%", code);
		data.put("%%EJ2CC%%", ejercicio2.complejidadDeMiSolucion().toString());
		
		data.put("%%EJ3A%%", ejercicio3.puntoA() + "");
		data.put("%%EJ3B%%", Arrays.toString(ejercicio3.puntoB()));
		data.put("%%EJ3C%%", ejercicio3.puntoC() + "");
		
		
		data.put("%%EJ4A%%", ejercicio4.puntoA() + "");
		data.put("%%EJ4AJ%%", ejercicio4.puntoAjustificacion());
		data.put("%%EJ4B%%", ejercicio4.puntoB() + "");
		data.put("%%EJ4BJ%%", ejercicio4.puntoBjustificacion());
		data.put("%%EJ4C%%", ejercicio4.puntoC() + "");
		data.put("%%EJ4CJ%%", ejercicio4.puntoCjustificacion());
		
		data.put("%%FIRMA%%", firma());
		data.put("%%INFO%%", System.getProperties().toString());
		
		String result = template;
		for (Entry<String, String> datum : data.entrySet()) {
			result = result.replaceAll(datum.getKey(), datum.getValue());
		}
		return result;
	}

	private String firma() {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(("" + documento()).getBytes("UTF-8"));
			byte[] digest = md.digest();
			return toHexString(digest).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	private String toHexString(byte[] bytes) {
	    StringBuilder hexString = new StringBuilder();
	    for (int i = 0; i < bytes.length; i++) {
	        String hex = Integer.toHexString(0xFF & bytes[i]);
	        if (hex.length() == 1) {
	            hexString.append('0');
	        }
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}

	private String codigoEjercicio2() throws FileNotFoundException {
		return archivoCompleto("src/unlam/progava/Ejercicio2.java");
	}
}
