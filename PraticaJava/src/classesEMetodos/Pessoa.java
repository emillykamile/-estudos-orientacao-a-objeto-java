package classesEMetodos;

public class Pessoa {
 String nome;
 double peso;
public Object comer;

 Pessoa(String nome, double peso) {
	 this.nome = nome;
	 this.peso = peso;
 }
 String apresentar() {
	 return "Ol� eu sou o " + nome + "e tenho" + peso + "Kgs.";
 }
 }
