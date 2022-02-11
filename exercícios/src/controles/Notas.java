package controles;

import java.util.Scanner;

public class Notas {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
    int quantidadedenotas = 0;
    double nota = 0;
    double total = 0;
    
    
	while(nota != -1) {
    System.out.print("Informe a nota: ");
    nota = entrada.nextDouble();
    
    if(nota <= 10 && nota >= 0) {
    total += nota;
    quantidadedenotas++; 
    } else if(nota != -1) { 
    	System.out.println("Nota Inválida: ");
    }
    }

    //Calcular nota
    double media = total / quantidadedenotas;
    System.out.print("Média é: " + media);
	
	entrada.close();
 }
}
