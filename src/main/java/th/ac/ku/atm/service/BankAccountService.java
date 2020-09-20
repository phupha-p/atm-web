package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> BankAccountList;

    @PostConstruct
    public void postContruct() {
        BankAccountList = new ArrayList<>();
    }

    public void createBankAccount(BankAccount bankAccount){
        BankAccountList.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts(){
        return new ArrayList<>(this.BankAccountList);
    }
}
