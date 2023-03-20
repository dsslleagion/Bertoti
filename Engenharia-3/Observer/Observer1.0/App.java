package main;

public class App {

	public static void main(String[] args) {
		
		LojaBankaiMangasouHQs Dionisio = new LojaBankaiMangasouHQs();
		LojaBankaiMangasouHQs Andre = new LojaBankaiMangasouHQs();
		
		Dionisio.event.subscribe(new LancamentoHQmarvel());
		Andre.event.subscribe(new LancamentoHQDC());
		

		Dionisio.newEdition1("World War Hulk");
		Andre.newEdition2("Batman the Dark Knight");

	}

}