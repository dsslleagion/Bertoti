import java.util.Scanner;

public class Carro implements Aceleracao{
    private String nome;
    private String motor;
    


    public void solicitarcasdastrar(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("\nDigite o nome do Carro/Moto:");
        nome = leitura.nextLine();

        System.out.println("Digite os cavalos do Carro/Moto ex.:1.0/150cc :");
        motor = leitura.nextLine();

        

        System.out.println("\nVeiculo Cadastrado!!!");

        System.out.println("Inicio do processo de aceleração do veiculo:");
        System.out.println("Nome: " + nome);
        System.out.println("\nIniciando a aceleração do Motor....");
        System.out.println("Motor: " + motor);
        System.out.println("\nO veiculo chegou ao seu destino!!!");
       
       
    }
}