package payment;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da fachada
        PaymentFacade paymentFacade = new PaymentFacade();
        
        // Exemplo de uso da fachada
        double amount = 100.0;
        String accountNumber = "123456789";
        String password = "secretpassword";
        
        // Processar pagamento
        paymentFacade.processPayment(amount, accountNumber, password);
        
        // Cancelar pagamento
        String transactionId = "987654321";
        paymentFacade.cancelPayment(transactionId, accountNumber, password);
        
        // Obter status do pagamento
        String paymentStatus = paymentFacade.getPaymentStatus(transactionId, accountNumber, password);
        System.out.println("Status do pagamento: " + paymentStatus);
    }
}

