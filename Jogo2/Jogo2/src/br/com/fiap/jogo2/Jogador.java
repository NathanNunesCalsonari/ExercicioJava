package br.com.fiap.jogo2;

public abstract class Jogador {
	
	private String nome = "";
	private int xp;
	private int hp;
	private boolean envenenado;
	
	//sobrecarga de métodos
	public Jogador() {
		
	}
	
	public Jogador(String nome) {
		System.out.println("Criando jogador chamado " + nome);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}
	
	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void receberDano(int pontos) {
		this.hp -= pontos;
		if(this.hp <= 0) {
			System.out.println("Game Over");
			this.hp = 0;
		}
	}

	public void receberCura(int pontos) {
		this.hp += pontos;		
	}

	public void ganharExperiencia(int pontos) {
		this.xp += pontos;		
	}
	
	public void receberAntidoto() { //code smell
//		if(isEnvenenado()) {
//			envenenado = false;
//		}else {
//			envenenado = true;
//		}
		
//		envenenado = isEnvenenado() ? false : true;
		
		envenenado = !envenenado;
		
	}

	public void atacar(Jogador jogador) {
		jogador.receberDano(this.xp);
		
		if(jogador.foiDerrotado()) 
			this.ganharExperiencia(jogador.getXp());
		
	}

	private boolean foiDerrotado() {
		return hp == 0;
	}

	
	

	
	
	
	
	
	
	
	
	
	
	

}
