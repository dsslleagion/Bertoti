package main;

public class LojaBankaiMangasouHQs {
	public Estoque event;
	
	public LojaBankaiMangasouHQs() {
		event = new Estoque();
	}
	
	public void newEdition1(String message) {
		event.notify(new LancamentoHQmarvel(), message);
	}
	
	public void newEdition2(String message) {
		event.notify(new LancamentoHQDC(), message);
	}

}