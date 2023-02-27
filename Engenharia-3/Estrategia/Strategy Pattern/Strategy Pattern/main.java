
public class main {

	public static void main(String[] args) {
		carro Palio = new carro(new motor1_0());
		carro Onix = new carro(new motor1_3());
		carro Fiesta = new carro(new motor1_5());
		
		Palio.acelerar();
		Onix.acelerar();
		Fiesta.acelerar();

	}

}