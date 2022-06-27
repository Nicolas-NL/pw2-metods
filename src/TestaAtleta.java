
public class TestaAtleta {
	public static void main(String[] args) {
        double peso, altura;
		peso=68;
		altura=1.74;
		
        Atleta at = new Atleta();	
		at.obterIMC(peso, altura);
		at.classificar();
		at.obterRisco();
	}

}
