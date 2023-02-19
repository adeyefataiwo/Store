package model;

import enums.CashierStatus;

public class Cashier extends Staff {
    private CashierStatus cashierStatus;

    public Cashier(String name, String age, String address, Long id, String email) {
        super(name, age, address, id, email);
    }

    public Cashier() {
    }

    public CashierStatus getCashierStatus() {
        return cashierStatus;
    }

    public void setCashierStatus(CashierStatus cashierStatus) {
        this.cashierStatus = cashierStatus;
    }

}
