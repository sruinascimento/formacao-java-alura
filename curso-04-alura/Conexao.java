
public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conexao");
		throw new IllegalStateException();
	}
	
	public void lerDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException("Falha ao ler os dados");
	}
	

	@Override
	public void close(){
		// TODO Auto-generated method stub
		System.out.println("Fechando a conexao"); 
		
	}
}
