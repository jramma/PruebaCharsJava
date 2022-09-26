package chars;

public class Main {

	public static void main(String[] args) {
		String word=Entrada.leerString("Introduce la palabra");
		word = word.toLowerCase();
		System.out.println("----------------------------------------------");
		SeRepite(word);
		System.out.println("----------------------------------------------");
		NoSeRepit(word);
		System.out.println("----------------------------------------------");

		PrimeroEnNoRepetirse(word);
		System.out.println("----------------------------------------------");

	}

	private static void PrimeroEnNoRepetirse(String word) {
		String auxiliar = word;
		for(int i=0;i<word.length()-1;i++) {
			for(int j=0;j<word.length();j++) {
				if(word.charAt(i)== word.charAt(j)& j!=i) 
					auxiliar = auxiliar.replace(word.charAt(i), ' ');
			}
		}
		System.out.println("El primer carácter que no se repite>");
		Boolean encontrado=false;
		int i=-1;
		while(encontrado==false & i<auxiliar.length()-1) {
			i++;
			if(auxiliar.charAt(i)!= ' ') {			
				System.out.println(auxiliar.charAt(i)+ " en la palabra "+ word);
				encontrado=true;
			}}
		if(encontrado == false)
			System.out.println("Ninguno, todos los carácteres se repiten");
	}
		
		
	

	private static void NoSeRepit(String word) {
		String auxiliar = word;
		for(int i=0;i<word.length()-1;i++) {
			for(int j=0;j<word.length();j++) {
				if(word.charAt(i)== word.charAt(j)& j!=i) 
					auxiliar = auxiliar.replace(word.charAt(i), ' ');
			}
		}
		System.out.println("Carácteres que no se repiten>");
		System.out.println(auxiliar + " en la palabra "+ word);
	}

	private static void SeRepite(String word) {
		Boolean repite=false;
		int i=-1;
		int j=0;
		while(repite==false & i<word.length()-1) {
			i++;
			j=-1;
			while(repite==false & j<word.length()-1) {
					j++;
				if(word.charAt(i)== word.charAt(j)& j!=i) 
				repite=true;
			}
		}
		if(repite == true) {
		System.out.println("La letra> "+word.charAt(i)+" es la primera en repetirse \n en la palabra "+ word);
		}else {
		System.out.println("Ninguna letra se repite");	
		}
		}

}
