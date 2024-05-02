public class Main {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Yuri Ramos");

        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setDdd("12");
        tel.setNumero("98218645");

        Telefone tel2 = new Telefone();
        tel2.setTipo("fixo");
        tel2.setDdd("13");
        tel2.setNumero("98218647");

       Telefone[] telefones = new Telefone[2];
       telefones[0] = tel;
       telefones[1] = tel2;

        contato.setTelefones(telefones);

        Endereco end = new Endereco();
        end.setNomeRua("Rua Palestra");
        end.setNumero("382");
        end.setBairro("Morumbi");
        end.setCidade("SJC");
        end.setComplemento("Casa");
        end.setCep("1293200");

        contato.setEndereco(end);

        System.out.println(contato.getNome());

        if( contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if( contato.getTelefones() != null ){
            for (Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}