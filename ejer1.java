import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// 
		int N,pos=0,nega=0,acupos=0,acunega=0;
		Scanner sc=new Scanner(System.in);
		int guar[]=new int [10];
		System.out.println("ingrese 10 numeros positivos o negativos");
		for(int i =0;i<10;i++){
			N=sc.nextInt();
			guar[i]=N;
		}for (int j=0;j<10;j++){
			if(guar[j]>=1){
				pos=pos+guar[j];
				acupos=acupos+1;
			}else{
				nega=nega-guar[j];
				acunega=acunega+1;
			}
		}System.out.println("la media de los positivos es: "+(pos/acupos));
		System.out.println("la media de los negativos es: "+(nega/acunega));

	}

}
