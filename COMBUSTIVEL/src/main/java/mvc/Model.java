package mvc;

public class Model {
  private Double palcool;
  private Double pgasolina;
  private Double resultado;
  private String imprimir;

  public Double getPalcool() {
    return palcool;
  }

  public void setPalcool(Double palcool) {
    this.palcool = palcool;
  }

  public Double getPgasolina() {
    return pgasolina;
  }

  public void setPgasolina(Double pgasolina) {
    this.pgasolina = pgasolina;
  }
  
  public Double getResultado() {
    return resultado;
  }

  public void setResultado(Double resultado) {
    this.resultado = resultado;
  }

  public String getImprimir() {
  return imprimir;
}

  public void setImprimir(String imprimir) {
  this.imprimir = imprimir;
  }
  
  public void calcularResultado() {
    resultado = palcool / pgasolina;
  }

  public void ifResultado() {
    if (resultado < 0.7) {
      imprimir = "Use Alcool !";
    } 
    else {
      imprimir = "Use Gasolina !";
    }
  }

}
