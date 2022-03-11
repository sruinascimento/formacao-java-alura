public class MainSistema {
    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setSenha(2222);
        
        SistemaInterno si = new SistemaInterno();
        si.autenticar(ger);

        Comprador comp = new Comprador();
        comp.setSenha(4321);
        si.autenticar(comp);
        

        Administrador adm = new Administrador();
        adm.setSenha(2222);

        si.autenticar(adm);
    }
}
