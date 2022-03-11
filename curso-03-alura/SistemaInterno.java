public  class SistemaInterno {
    
    private int senha = 2222;

    public void autenticar( Autenticavel a1) {
        boolean autenticado = a1.autenticar(this.senha);
        String msgDeAutenticacao = autenticado ? "Autenticado com sucesso!" : "Não autenticado, credenciais inválidas!";
        System.out.println(msgDeAutenticacao);
        
    }
}
