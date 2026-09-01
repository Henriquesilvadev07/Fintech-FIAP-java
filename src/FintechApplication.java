import Conta.ContaEntity;
import Investimento.InvestimentoEntity;
import Transacao.TransacaoEntity;
import Usuario.LoginEntity;
import Usuario.UsuarioEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FintechApplication {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA FINTECH - INICIALIZANDO ===\n");

        LoginEntity login = new LoginEntity("carlos.silva", "Senha@123");
        login.doLogin();
        System.out.println("----------------------------------------");

        UsuarioEntity usuario = new UsuarioEntity(
                "USR-001",
                "Carlos Silva",
                "123.456.789-00",
                "carlos.silva@email.com",
                LocalDate.of(1995, 5, 20)
        );
        usuario.exibirdetalhesUsuario();
        usuario.atualizarPerfil("Carlos Silva Junior", "carlos.junior@email.com");
        System.out.println("----------------------------------------");

        ContaEntity conta = new ContaEntity("12345-6", "0001", 1500.00, "Corrente");
        conta.consultarSaldo();
        conta.depositar(500.00);
        conta.sacar(200.00);
        System.out.println("----------------------------------------");

        TransacaoEntity transacao = new TransacaoEntity(
                "TRX-9876",
                150.00,
                LocalDateTime.now(),
                "DESPESA",
                "Pagamento de conta de luz"
        );
        transacao.registrarTransacao();
        transacao.gerarComprovante();
        System.out.println("----------------------------------------");

        InvestimentoEntity investimento = new InvestimentoEntity(
                "INV-555",
                "CDB Banco Inter 100% CDI",
                1000.00,
                12.5,
                "Renda Fixa"
        );
        investimento.aplicarRecurso(500.00);
        investimento.calcularRendimentoEstimado();
        investimento.resgatarInvestimento();
        System.out.println("----------------------------------------");

        login.logout();
        System.out.println("\n=== EXECUÇÃO FINALIZADA COM SUCESSO ===");
    }
}