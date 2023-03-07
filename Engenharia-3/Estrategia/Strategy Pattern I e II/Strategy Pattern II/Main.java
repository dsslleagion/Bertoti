public class Main {
    public static void main(String[] args){
        System.out.println("Simulação de Veiculo em Movimento");
        System.out.println("\nCadastro Carro/Moto:");
        Carros veiculo1 = new Carros();
        veiculo1.setCarros(new Carro());
        veiculo1.realizarcadastro();

        Carros veiculo2 = new Carros();
        veiculo2.setCarros(new Carro());
        veiculo2.realizarcadastro();
    }

}
