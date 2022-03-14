package excecao;

public class MainException {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		try {
			c1.deposita();
			
		} catch (ExceptionExample ex) {
			System.out.println(ex.getMessage());
		}
	}
}
