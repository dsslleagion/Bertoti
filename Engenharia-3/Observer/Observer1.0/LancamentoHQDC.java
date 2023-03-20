package main;

public class LancamentoHQDC implements Observer{
	public LancamentoHQDC() {	
	}
	public void update(String message) {
		System.out.println(message + " |> Previsão de Lançamento 30/06/2023");
	}

}