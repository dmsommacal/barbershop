
public class Main {
    public static void main(String[] args) {

            Barbeiros barbeiro = new Barbeiros();
            barbeiro.setNome("Paulo");
            barbeiro.setEspecialidade("barba");
            barbeiro.setSalario(3500.00);

            System.out.println("Você será atendido pelo "+ barbeiro.getNome()+"sua especialidade é "+barbeiro.getEspecialidade());

            Clientes cliente = new Clientes();
            cliente.setNome("Pedro");
            cliente.setContato("48 999999999");

            System.out.println("Sr "+cliente.getNome()+"contato "+cliente.getContato());
    }
}