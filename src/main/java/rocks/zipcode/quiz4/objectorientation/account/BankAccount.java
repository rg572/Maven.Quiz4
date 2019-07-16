package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable{

    private Double balance = 0D;

    public void setBalance(Double val) {
        balance = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy < 0 ){
            throw new IllegalArgumentException();
        }
        balance+= amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if(amountToDecreaseBy < 0 || amountToDecreaseBy > balance){
            throw new IllegalArgumentException();
        }
        balance-= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
