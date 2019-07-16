package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> bankAccountList = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        if(indexNumber >= bankAccountList.size()){
            return null;
        }
        else{
            BankAccount temp = bankAccountList.get(indexNumber);
            bankAccountList.remove(indexNumber.intValue());
            return temp;
        }
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccountList.contains(bankAccount);
    }
}
