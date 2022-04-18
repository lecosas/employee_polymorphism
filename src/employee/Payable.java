package employee;

public interface Payable {
    double getPaymentAmount();

    default void teste() {
        System.out.println("Este é um teste de método default da interface Payable.");
    }
}
