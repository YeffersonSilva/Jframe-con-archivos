
class ContaBancaria {
	private double numeroDeCuenta;
	private String nome;
	private double saldo;
	private String socursal;
	private double retiro;
	
	
	void setNome(String temp) {
		nome = temp;
		System.out.println("El Nombre del cliente es "+this.nome);
	}
	String getNome() {
		return nome;
	}
	
	void setNDeCuenta(double temp) {
		numeroDeCuenta = temp;
		System.out.println("El numero del cliente es "+this.numeroDeCuenta);
	}
	double getNDeCuenta() {
		return numeroDeCuenta;
	}

	
	void setSocursal(String temp) {
		socursal = temp;
		System.out.println("La socursal es "+this.socursal);
	}
	String getSocursal() {
		return socursal;
	}
	
	void setSaldo(double temp) {
		saldo = temp;
		System.out.println("Su saldo es de  "+this.saldo);
	}
	double getSaldo() {
		return saldo;
	}
	
	
	void setRetiro(double temp) {
		retiro = temp;
		double re;
		re= this.saldo-this.retiro;
		System.out.println("Su Saldo despues del retiro es "+re);
	}
	double geRetiro() {
		return retiro;
	}
}
