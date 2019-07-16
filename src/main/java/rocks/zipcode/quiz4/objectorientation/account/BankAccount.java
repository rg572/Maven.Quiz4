package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    Double balance;

    public void setBalance(Double val) {
        balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy < 0 ){
            throw new IllegalArgumentException("Can't deposit a negative amount");
        }
        balance+= amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
