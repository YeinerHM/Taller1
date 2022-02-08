
package Package1;
/**
 * Representa la clase BankAccount compuestas por algunos atributos y metodos
 * @author Yeiner Hidalgo Molina
 */
public class BankAccount {
    /**
     * Atributos de la clase BankAccount
     */
    private int accountNumber;
    protected boolean activated;
    /**
     * Metodo constructor de la clase BankAccount
     * @param accountNumber
     * @param activated 
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    /**
     * Modifica el parametro accounNumber
     * @return retorna un int de accounNumber
     */
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
    /**
     * Modifica el parametro activated
     * @return retorna un boolean de activated
     */
    public boolean getActivated() {
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
