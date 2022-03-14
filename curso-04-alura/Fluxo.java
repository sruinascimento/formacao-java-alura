import excecao.*;


public class Fluxo {
	 public static void main(String[] args)  {
	        System.out.println("Ini do main");
	        metodo1();
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	    	        
	        try {
	        	int a = 2 / 0;
//	        	Conta c = null;
//	        	
//	        	c.deposita();
	        	
	        	//throw new ArithmeticException("deu pane no codigo");
	        	//throw new MinhaExcecao("MinhaExcecao disparou");
	        	//throw new ExceptionExample("nova excessão");
	        	
	        } catch(Exception ex ) {
//	        	String messagemDeError = ex.getMessage();
//	        	System.out.println("ArithmeticException " + messagemDeError);
//	        	ex.printStackTrace();
	        	//ex.printStackTrace();
	        	System.out.println(ex.getMessage());
	        	ex.printStackTrace();
	        	
	        	
	        }
	        
	        System.out.println("Fim do metodo2");
	    }
}
