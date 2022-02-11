package controles;

import java.util.Scanner;

public class If {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Infome nota da média:");
	double media = entrada.nextDouble();
	
	if(media >= 7.0)
		System.out.println("aprovado!");
	
	entrada.close();
}
}