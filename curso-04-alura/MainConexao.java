
public class MainConexao {
	public static void main(String[] args) {
		
		try (Conexao con = new Conexao()) {
			con.lerDados();
		} catch(IllegalStateException ex) {
			System.out.println("Message: " + ex.getMessage());
			
			
		}
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.lerDados();
//			
//		} catch (Exception ex) {
//			System.out.println("Message: " + ex.getMessage());
//			ex.printStackTrace();
//		} finally {			
//			con.fecha();
//		}
	}
}
