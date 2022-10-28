package variavél;
import java.util.Scanner;
public class atividadecmd {
public static void main (String []args) {
	int numero=1, somanumero=0, totalnumero=0, maiornumero=0,cont=0, menornumero=0, contador=0;
	Scanner ler= new Scanner (System.in);

	while (numero!=0) {
	System.out.println("Digite um numero: ");
	numero=ler.nextInt();
	contador++;
     totalnumero=numero+totalnumero;
     if (numero>0) {
     if (numero>maiornumero) {
    	   maiornumero=numero; 
     }
     cont++;
     if (cont==1) {
    	 menornumero=numero;
     }
     }
     if (numero<=0){
    	 System.out.println("Os numero não entraram na soma.");
     }
	}
     
     System.out.println("O maior numero é:"+maiornumero);
     System.out.println("O menor numero é:"+menornumero);
     
}
}
