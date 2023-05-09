


public class OrdemFacade {
	private Pagamento pago = new Pagamento();
	private Estoque Esto = new Estoque();

	public void localOrdem(String ordemId) {
	    String passo1 = Esto.checarEstoque(ordemId);
	    String passo2 = pago.deduzirPagamento(ordemId);
	    System.out.println("Seguintes Passos concluidos:" + passo1+ " & " + passo2);
	   }
	

}
