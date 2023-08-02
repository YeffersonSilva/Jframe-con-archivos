class Pessoa {
	
	private String nome;
	private int idade;
	private int quantVida;
	private boolean habildadeParaAtirar;
	private boolean curacion;
	
	
	void setNome(String temp) {
		nome = temp;
		
	}
	String getNome() {
		return nome;
	}
	void setIdade(int temp) {
		idade = temp;
		
	}
	int getIdade() {
		return idade;
		
	}
	void setPorcentajeVida(int temp) {
		quantVida = temp;
		
	}
	int getVida() {
		return quantVida;
		
	}
	
	
	void setHabilidadTiro(boolean temp) {
		
		habildadeParaAtirar = temp;
		if(this.habildadeParaAtirar==true) {
			System.out.println("Tiene una buena mira: Pro");
		}
		else System.out.println("Tiene pessima mira");
		}
	boolean getHabilidadTiro() {
		//this.curacion=true;	
		return habildadeParaAtirar;
		
	}
		
		//Metodo Curacion
		void tengoCuracion(boolean temp) {
			//this.curacion =true;
			
			curacion = temp;
			
		}
		boolean getTengoCuracion() {
			//this.curacion=true;	
			return curacion;}
		
		void vida() {
			if(this.quantVida == 100) {
				System.out.println("Su vida esta completa");
				}
			if(this.quantVida<100) {
				System.out.println("Tiene poca vida: "+this.quantVida+ " Tome una curacion!!");
				//Curacion
				if(this.curacion==true) {
					if(this.quantVida<50  && this.quantVida > 0) {
					int vidaFinal = this.quantVida+40;
					System.out.println("tomo una curacion!! Su vida ahora es de: "+vidaFinal);
					}if (this.quantVida>=50 && this.quantVida <90) {
						int vidaFinal = this.quantVida+10;
						System.out.println("tomo una curacion!! Su vida ahora es de: "+vidaFinal);
					}
					if(this.quantVida>=90 && this.quantVida<=99) {
						int vidaFinal = this.quantVida+1;
						System.out.println("tomo una curacion!! Su vida ahora es de: "+vidaFinal);
					}
						
					}else System.out.println("No tiene curacion");	
			}if(this.quantVida == 0) {
				System.out.println("Game over");
			}
				
		}
	
		
		void status() {
			System.out.println("Nome: "+this.nome);
			System.out.println("idade: "+this.idade);
			//System.out.println("cuantidad de vida: "+this.getVida());
			//System.out.println("Hababilidad de tiro: "+this.habildadeParaAtirar);
		}
	} 



