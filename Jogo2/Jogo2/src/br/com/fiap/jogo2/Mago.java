package br.com.fiap.jogo2;

public class Mago extends Jogador implements Movimentacao {
	
	private int mp = 50;

	public Mago() {
		super();
	}

	public Mago(String nome, int mp) {
		super(nome);
	}

	@Override
	public void mover(int x, int y) {
		
	}

	@Override
	public int getX() {
		return 0;
	}

	@Override
	public int getY() {
		return 0;
	}

	@Override
	public void setX(int x) {
		
	}

	@Override
	public void setY(int y) {
		
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

}
