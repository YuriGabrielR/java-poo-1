public class Main {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Yuri Ramos");
        contato.setEndereco("Cpo");
        contato.setTelefone("12981946294");

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());

    }
}