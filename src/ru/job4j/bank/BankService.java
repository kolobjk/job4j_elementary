package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> findUser = findByPassport(passport);
        if (findUser.isPresent()) {
            if (!users.get(findUser.get()).contains(account)) {
                users.get(findUser.get()).add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
        return rsl;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> findAccount = Optional.empty();
        Optional<User> findUser = findByPassport(passport);
        if (findUser.isPresent()) {
            for (Account account : users.get(findUser.get())) {
                if (requisite.equals(account.getRequisite())) {
                    findAccount = Optional.of(account);
                    break;
                }
            }
        }
        return findAccount;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount.isPresent()) {
            if (srcAccount.get().getBalance() >= amount) {
                Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
                if (destAccount.isPresent()) {
                    srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                    destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                    rsl = true;
                }
            }
        }
        return rsl;
    }
}