public class Main {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Yuri Ramos");
        // contato.setEndereco();
        contato.setTelefone("12981946294");

        Endereco end = new Endereco();
        end.setNomeRua("Rua Palestra");
        end.setNumero("382");
        end.setBairro("Morumbi");
        end.setCidade("SJC");
        end.setComplemento("Casa");
        end.setCep("1293200");

        contato.setEndereco(end);

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if( contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

    }
}