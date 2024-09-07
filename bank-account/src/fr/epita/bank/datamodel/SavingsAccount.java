package fr.epita.bank.datamodel;



public class SavingsAccount extends Account {

    private float interestRate;

    public SavingsAccount(float interestRate) {
        super();
        setInterestRate(interestRate);

    }

    public SavingsAccount(float balance, float interestRate) {
        super(balance);
        setInterestRate(interestRate);
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
