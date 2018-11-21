import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// declaro e inicio variables
		String N;
		int pos=0,nega=0,acupos=0,acunega=0,n=0;
		Scanner sc=new Scanner(System.in);
		int guar[]=new int [10];
		System.out.println("ingrese 10 numeros positivos o negativos");
		for(int i =0;i<10;i++){    //relleno el arreglo
			N=sc.nextLine();
			try{n=Integer.parseInt(N);}
			catch (NumberFormatException ex){
				System.out.println("ingrese UN NUMERO!");
			}
			guar[i]=n;
		}for (int j=0;j<10;j++){         //recorro el arreglo separando positivos de negativos, sumandolos y agragando un contador
			if(guar[j]>=1){              
				pos=pos+guar[j];
				acupos=acupos+1;
			}else{
				nega=nega-guar[j];
				acunega=acunega+1;
			}
		}System.out.println("la media de los positivos es: "+(pos/acupos));   //se calcula y muestra la media de los positivos
		System.out.println("la media de los negativos es: "+"-"+(nega/acunega));  //y negativos
		sc.close();    //se cierra el scanner
	}

}
