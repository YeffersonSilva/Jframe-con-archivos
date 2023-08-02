
public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Yefferson");
		p1.setIdade(21);
		p1.setPorcentajeVida(10);
		p1.tengoCuracion(true);
		p1.vida();
		p1.setHabilidadTiro(true);
		p1.status();
		
		System.out.println("");
		
	
		Cachorro c1 = new Cachorro();
		c1.setNome("firulais");
		c1.setIdade(2);
		c1.setColor("Marron");
		c1.setFuerza("Forte");
		c1.setPorcentajeVida(70);
		
		
		System.out.println("");
		
		ContaBancaria b1 = new ContaBancaria();

		b1.setNome("Marcos");
		b1.setNDeCuenta(1229);
		b1.setSocursal("Rivera");
		b1.setSaldo(348);
		b1.setRetiro(76);
		
		
		
		
		
	

	
	
	}

}
