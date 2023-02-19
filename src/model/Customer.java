package model;

public class Customer {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    private int Wallet;

    public int getWallet() {
        return Wallet;
    }

    public void setWallet(int wallet) {
        Wallet = wallet;
    }
}
