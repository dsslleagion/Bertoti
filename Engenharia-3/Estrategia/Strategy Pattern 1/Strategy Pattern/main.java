
public class Main {

	public static void main(String[] args) {
		Carro Palio = new Carro(new Motor1_0());
		Carro Onix = new Carro(new Motor1_3());
		Carro Fiesta = new Carro(new Motor1_5());
		
		Palio.acelerar();
		Onix.acelerar();
		Fiesta.acelerar();

	}

}