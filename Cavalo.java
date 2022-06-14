package br.com.generation.animais;

public class Cavalo extends Animais{
	private String correr;
	
	@Override
	public String somAnimal(String som) {
		return som;	
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
	

}
