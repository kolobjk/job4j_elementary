package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User findUser = findByPassport(passport);
        if (findUser != null) {
            if (!users.get(findUser).contains(account)) {
                users.get(findUser).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User findUser = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                findUser = user;
                break;
            }
        }
        return findUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account findAccount = null;
        User findUser = findByPassport(passport);
        if (findUser != null) {
            for (Account account : users.get(findUser)) {
                if (requisite.equals(account.getRequisite())) {
                    findAccount = account;
                    break;
                }
            }
        }
        return findAccount;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount != null) {
            if (srcAccount.getBalance() >= amount) {
                Account destAccount = findByRequisite(destPassport, destRequisite);
                if (destAccount != null) {
                    srcAccount.setBalance(srcAccount.getBalance() - amount);
                    destAccount.setBalance(destAccount.getBalance() + amount);
                    rsl = true;
                }
            }
        }
        return rsl;
    }
}