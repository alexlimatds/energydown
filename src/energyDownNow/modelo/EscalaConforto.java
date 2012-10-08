package energyDownNow.modelo;

public enum EscalaConforto {
   
   OTIMO(5), BOM(4), REGULAR(3), RUIM(2), PESSIMO(1);
   
   private Integer valor;
   
   EscalaConforto (int valor){
       this.valor = valor;
   }
   
  public double getValor() {
        return valor;
   }
}
