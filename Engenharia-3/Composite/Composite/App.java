
public class App {

	public static void main(String[] args) {
		
		Governo GovernoAfrica = new Governo();
		Governo GovernoBrasil = new Governo();
		Governo GovernoEUA = new Governo();
		
		GovernoAfrica.add(new Funcionarios("David","Carlos","João"));
		GovernoBrasil.add(new Funcionarios("Jonnathan","John","Peter"));
		GovernoEUA.add(new Funcionarios("Biden","Edward","Donald"));

		
		GovernoAfrica.executarOrdem("Combater a fome do pais");
		GovernoEUA.executarOrdem("Combater o Terrorismo");
		GovernoBrasil.executarOrdem("Combater A Corrupção");
	}

}