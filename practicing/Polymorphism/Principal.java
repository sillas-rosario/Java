package poli;

public class Principal {

	public static void main( String[] args){
		
		
	//	Animal a = new Animal();    Animal nao pode ser instanciada pois é uma classe Abstrata
		
		Reptil    r = new Reptil();
		Mamifero  m = new Mamifero();
		Canguru   c = new Canguru();
		
		m.setPeso(10);
		m.setIdade(2);
		m.Locomover();  // vai retornar o metodo implementado em mamifero
		m.Alimentar();  // vai retornar o metodo implementado em mamifero
		m.EmitirSom();  // vai retornar o metodo implementado em mamifero
		
		r.setPeso(30);
		r.setIdade(4);
		r.Locomover();  // vai retornar o metodo implementado em reptil
		r.Alimentar();  // vai retornar o metodo implementado em reptil
		r.EmitirSom();  // vai retornar o metodo implementado em reptil

		c.setPeso(1);
		c.setIdade(4);
		c.Locomover();  // vai retornar o metodo implementado em Canguru Override
		c.Alimentar();  // vai retornar o metodo implementado em mamifero
		c.EmitirSom();  // vai retornar o metodo implementado em mamifero
		
		
		// Issoo é polimorfismos  pois usamos 
		// locomover , alimentar , emitir som  
		// ou seja mesmos metodos ( MESMAS ASSINATURAS em classes diferentes) porem com acoes diferentes
		// Polimorfismos de superposiçao ´pois usamos o metodo de uma superclasse em 
		// subclasses
		
		 System.out.println(" teste com objetos  :"+ "\n");	 
		
		 Mamifero mami= new Canguru();  // mesma coisa 
		 Canguru mami1=new Canguru();  // mesma coisa 
		 mami.Locomover();
		 mami1.Locomover();
		 m.Locomover();
		
		 
		
	
		
		
		/// POLIMORFISMOS DE SOBRECARGA :
		
		// (ASSINATURAS DIFERENTESSS) POREM NA MESMA CLASSE ex
	    // criar uma classe Dog e outra lobo
		// analisar na classe Dog que tem 4 metodos  reagir 
		// porem o tipo de cada uma dessas classe sao totalmente diferente 
		// por isso que o metodo esta sobrecarregado !!
		
	
		for(int i=1; i<5; i++) {
            Movie movie = randomMovie();
            Movie m1= new Jaws();
            Jaws m2=new Jaws();
            
            System.out.println("Movie #" + i +
                            " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 2) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
        }

        return null;
		
		
		
	
	
		}
		
	}



class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}


// super por causa do construtor
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    // reescreveu um metodo da classe mae
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

	// super por causa do construtor
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override// reescreveu um metodo da classe mae
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}