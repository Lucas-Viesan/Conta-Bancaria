package conta.model;

public class ContaCorrente extends Conta  {
	//Atributos 
	private float limite;
	
	
	//Método construtor
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // Invocando o método construtor Conta
		this.limite = limite;
	}

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}

	//Métodos de acesso da classe conta corrente
	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente");
			return false;
		} 
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	//Polimofirsmo de Sobrescrita => adciona mais lógica a um método existente
	public void visualizar() {
		super.visualizar();
		System.out.print("Limite de crédito: " + this.limite);
	}
	
	

}




