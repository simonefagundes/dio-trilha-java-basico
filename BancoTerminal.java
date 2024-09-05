public class BancoTerminal {
    public static void main(String[] args) {
        double saldo = 15;
        double valor_solicitado = 22;
        if (saldo > valor_solicitado)
            saldo = saldo - valor_solicitado;
        else
            System.out.println("Saldo insuficiente");
        System.out.println("Seu saldo é:" + " " + "R$" + saldo);
    }
}
