
public class Atleta {
	public double peso, altura, imc;
	
	public void obterIMC() {
		imc = peso /(altura*altura);
	   
		System.out.println(imc);
	}

     public void classificar(){
    	 if(imc < 18.5) {
    	 System.out.println("Abaixo do Peso");
    	 }
    	 else if(imc >= 18.5 && imc <24.9) {
    		 System.out.println("Peso Normal");
    	 }
    	 else if(imc >= 25.0 && imc >= 29.9) {
    		 System.out.println("Pré-Obesidade");
    	 }
    	 else if(imc >= 30.0 && imc >= 34.9) {
    		 System.out.println("Obesidade Grau I");
    	 }
    	 else if(imc >= 35.0 && imc >= 39.9) {
    		 System.out.println("Obesidade Grau II");
    	 }
    	 else if(imc > 40.0) {
    		 System.out.println("Obesidade Grau III");
    	 }
    	 
   }
     public void obterRisco(){
    	 if(imc < 18.5) {
    	 System.out.println("Muito alto");
    	 }
    	 else if(imc >= 18.5 && imc <24.9) {
    		 System.out.println("Baixo");
    	 }
    	 else if(imc >= 25.0 && imc >= 29.9) {
    		 System.out.println("Médio");
    	 }
    	 else if(imc >= 30.0 && imc >= 34.9) {
    		 System.out.println("Alto");
    	 }
    	 else if(imc >= 35.0 && imc >= 39.9) {
    		 System.out.println("Muito Alto");
    	 }
    	 else if(imc > 40.0) {
    		 System.out.println("Muitíssimo alto");
    	 }
    	 
   }  
}