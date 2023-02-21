public class Codigo5 

import java.util.Scanner;
{
	public static void main(String args[]){//el metodo public
	    Scanner s = new Scanner(System.in); // faltaba el system in dentro del parentesis
	    System.out.print("Introduzca un número:" ); // va " en lugar de ' dentro de los aprentesis
	    String ni = s.nextLine();
	    int c = ParseInt(ni); // creo que quiere tomar un dato numerico a travez de ni pero ni es string asi que debe convertirse a INT
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ParseInt(ni) > 0) {
		  int digito = (ParseInt(ni) % 10); // casi casi cambiando los ni con ParseInt
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.prinln("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}

}










