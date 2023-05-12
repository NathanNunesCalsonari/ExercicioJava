package br.com.fiap.jogo2;

public class Jogo {

public static void main(String[] args) {
	Guerreiro player1 = new Guerreiro("Nathan");
	player1.setXp(20);
	player1.setHp(100);
	Mago player2 = new Mago("Nathalia", 50);
	player2.setXp(30);
	player2.setHp(80);
	Dragao dragao = new Dragao();
	BolaDeFogo bolaDeFogo = new BolaDeFogo();
	bolaDeFogo.setPoder(100);
	
	System.out.println("\nGuerreiro " + player1.getNome()+ 
								"\nXP = " + player1.getXp() +
								"\nHP = " + player1.getHp() +   
								"\nEnvenenado = " + player1.isEnvenenado()   
								);
		
	System.out.println("\nMago " + player2.getNome()+ 
								"\nXP = " + player2.getXp() +
								"\nHP = " + player2.getHp() +   
								"\nEnvenenado = " + player2.isEnvenenado()   
								);
	
	System.out.println("\nBola de fogo com o poder de " + bolaDeFogo.getPoder());
	
	player1.mover(10, 10);
	player2.mover(10, 5);
	dragao.mover(50, 10);
	bolaDeFogo.mover(40, 10);
	
	
}

}