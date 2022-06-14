package br.com.generation.animais;

public class TestaTodoMundo {
	
	public static void emitirSom(Animais emitirSom, String som) {
		System.out.println(emitirSom.somAnimal(som));
	}

	public static void main(String[] args) {
		System.out.println("Sons que o cachorro emite: ");
		emitirSom(new Cachorro(), "latir");
		System.out.println("Sons que o cavalo emite: ");
		emitirSom(new Cavalo(), "relinchar");
		System.out.println("Sons que a preguiça emite: ");
		emitirSom(new Preguica(), "Sons de Alta frequência");
		
		System.out.println("=======DADOS DO CACHORRO========");
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Gus");
		cachorro1.setIdade(14);
		cachorro1.setCorrer("correr");
		
		System.out.println("Nome do cachorro:  " + cachorro1.getNome());
		System.out.println("Idade:  " + cachorro1.getIdade() + " anos.");
		System.out.println("Este animal possui a habilidade de  " + cachorro1.getCorrer() );
		System.out.println();
		
		System.out.println("========DADOS DO CAVALO=======");
		Cavalo cavalo1 = new Cavalo();
		cavalo1.setNome("Sansão");
		cavalo1.setIdade(4);
		cavalo1.setCorrer("correr");

		
		
		System.out.println("Nome : " + cavalo1.getNome());
		System.out.println("Idade: " + cavalo1.getIdade() + " anos.");
		System.out.println("Este animal possui a habilidade de " + cavalo1.getCorrer());
		System.out.println();
		
		
		System.out.println("=========DADOS DA PREGUIÇA========");
		Preguica preguica1 = new Preguica();
		preguica1.setNome("Sid");
		preguica1.setIdade(4);
		preguica1.setSubir("subir");
		
		
		System.out.println("Nome da Preguiça: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade() + " anos.");
		System.out.println("Este animal possui a habilidade de " + preguica1.getSubir() + " em árvores.");
		

	}

}
