public class Funcionarios implements Politicos {
	private String presidente;
	private String deputados;
	private String governadores;
	
	public Funcionarios (String presidente, String deputados,String governadores) {
		this.presidente = presidente;
		this.deputados = deputados;
		this.governadores = governadores;
	}
	
	public void executarOrdem(String ordem) {
		System.out.println(String.format("Ordem \"{0}\" executada por {1}/{2}/{3}.", ordem, presidente, deputados, governadores));
	}

}