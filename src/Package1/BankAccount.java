
package Package1;
/**
 * Representa la clase BankAccount compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
public class BankAccount {
    //Atributos
    private int accountNumber;
    protected boolean activated;
    //Metodos

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Muestra el parametro accountNumber
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }
    /**
     * Muestra el parametro activated
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
