import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException{

        Gerente gerente  = new Gerente();
        gerente.setLogin("Login");
        gerente.setSenha("Senha");
        gerente.setNome("Adalberto");
        gerente.setEmail("adalberto@email.com");
        gerente.setDocumento("01121212");
        gerente.setIdFunc(1);


        Secretaria secretaria = new Secretaria();
        secretaria.setRamal("23");
        secretaria.setNome("Leonardo");
        secretaria.setEmail("leonardo@gmail.com");
        secretaria.setDocumento("012212");
        secretaria.setIdFunc(2);
        secretaria.setTelefone("19971720317");

        Operador operador = new Operador();
        operador.setValorHora(17.00);
        operador.setNome("Vinicius");
        operador.setEmail("vinicius@email.com");
        operador.setDocumento("021212");
        operador.setIdFunc(3);

        RegistroPonto gerente1 = new RegistroPonto();
        RegistroPonto secretaria1 = new RegistroPonto();
        RegistroPonto operador1 = new RegistroPonto();

        Thread.sleep(1000);
        gerente1.setFunc(gerente);
        gerente1.setDataRegistro(LocalDate.now());
        gerente1.setHoraEntrada(LocalDateTime.now());
        gerente1.apresenatarRegistroPonto();

        Thread.sleep(1000);
        secretaria1.setFunc(secretaria);
        secretaria1.setDataRegistro(LocalDate.now());
        secretaria1.setHoraEntrada(LocalDateTime.now());
        secretaria1.apresenatarRegistroPonto();

        Thread.sleep(1000);
        operador1.setFunc(operador);
        operador1.setDataRegistro(LocalDate.now());
        operador1.setHoraEntrada(LocalDateTime.now());
        operador1.apresenatarRegistroPonto();

        Thread.sleep(1000);
        gerente1.setHoraSaida(LocalDateTime.now());
        gerente1.apresenatarRegistroPonto();

        Thread.sleep(1000);
        secretaria1.setHoraSaida(LocalDateTime.now());
        secretaria1.apresenatarRegistroPonto();

        Thread.sleep(1000);
        operador1.setHoraSaida(LocalDateTime.now());
        operador1.apresenatarRegistroPonto();
    }
}