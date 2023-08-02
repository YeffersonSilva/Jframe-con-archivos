
class Cachorro {
	private String nome;
	private int idade;
	private int quantVida;
	private String corDoPelo;
	private String FoaDaMordida;
	//private String tamanho;
	
	
	
	
	void setNome(String temp) {
		nome = temp;
		System.out.println("El Nombre del perro es "+this.nome);
	}
	String getNome() {
		return nome;
	}

	
	void setIdade(int temp) {
		idade = temp;
		System.out.println("La edad "+this.idade+" anhos");
	}
	int getIdade() {
		return idade;
	}
	void setColor(String temp) {
		corDoPelo = temp;
		System.out.println("El color del perro "+this.corDoPelo);
	}
	String getColor() {
		return corDoPelo;
	}
	
	void setFuerza(String temp) {
		FoaDaMordida = temp;
		System.out.println("Su mordida es "+this.FoaDaMordida);
		if(this.FoaDaMordida == "Forte" && this.FoaDaMordida=="forte") {
			System.out.println("Perro tiene una mordida Fuerte");
		}if(this.FoaDaMordida == "Medio" && this.FoaDaMordida=="medio") {
			System.out.println("Perro tiene una mordida media");
		}if(this.FoaDaMordida == "Poca" && this.FoaDaMordida=="poca") {
			System.out.println("Perro tiene una mordida poca");
		}
	}
	String getTamanho() {
		return FoaDaMordida;
	}


void setPorcentajeVida(int temp) {
	quantVida = temp;
	System.out.println("Su porcentaje de vida es: "+this.quantVida);
}
int getVida() {
	return quantVida;
	
}





}
