package main;

public class LancamentoHQmarvel implements Observer{
	public LancamentoHQmarvel() {	
	}
	public void update(String message) {
		System.out.println(message + " |> Previsão de Lançamento 30/05/2023");
	}

}