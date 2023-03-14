package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class AccountDataSet {
    public static List<Account> getAccountList(){
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Manish pudasaini","02346543687","Saving",100000.0f));

        return accounts;
    }
}
