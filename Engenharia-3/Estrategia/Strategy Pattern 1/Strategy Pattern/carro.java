
public class Carro {
 Aceleracao aceleracao;

  public void setTipoMotor(Aceleracao acelera) {
    this.aceleracao = acelera;
  }

  public Carro(Aceleracao acelera){
    setTipoMotor(acelera);
}

  public void acelerar() {
    this.aceleracao.acelera();
  }

}
