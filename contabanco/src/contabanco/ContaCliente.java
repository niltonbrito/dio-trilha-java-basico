package contabanco;

public class ContaCliente {

	private String numeroAgencia;
	private int numeroConta;
	private String nomeCliente;
	private Double saldo;

	public ContaCliente() {
		super();
	}

	public ContaCliente(String numeroAgencia, int numeroConta, String nomeCliente, Double saldo) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Olá "+ nomeCliente+", obrigado por criar a conta em nosso banco, sua agência é " + numeroAgencia + ", Conta " + numeroConta + " e seu saldo é R$ " + saldo;
	}

}
