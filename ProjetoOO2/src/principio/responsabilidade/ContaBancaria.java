package principio.responsabilidade;

public class ContaBancaria {
	
	private String descricao ;
	private double saldo = 8000;
	
	public void somarSaldo() {
		
		saldo  +=100;
		
		
	}
	
	public void diminuir() {
		
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		
		saldo -=saque;
	}
	
	public void depositarDinheiro(double depositar) {
		
		saldo += depositar;
	}
	
	
   public double getSaldo() {
	return saldo;
}
   
  public String getDescricao() {
	return descricao;
}
  public void setDescricao(String descricao) {
	this.descricao = descricao;
}

@Override
public String toString() {
	return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
}
  
  
}
