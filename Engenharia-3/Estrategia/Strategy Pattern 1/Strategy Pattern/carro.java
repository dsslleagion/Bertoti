
public class carro{
	private aceleracao aceleracao;

    public carro(aceleracao aceleracao){
        setTipoMotor(aceleracao);
    }
    public void setTipoMotor(aceleracao aceleracao) {
		this.aceleracao = aceleracao;
	}
    public void acelerar() {
		this.aceleracao.acelera();
	}
	
}
