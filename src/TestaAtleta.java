
public class TestaAtleta {
	public static void main(String[] args) {
		Atleta at = new Atleta();
		at.peso=68;
		at.altura=1.74;
		
		at.obterIMC();
		at.classificar();
		at.obterRisco();
	}

}
