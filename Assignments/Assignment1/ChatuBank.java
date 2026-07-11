public class ChatuBank {
    String UID;
    String ACCOUNT_NUMBER;
    String IFSC_CODE;
    String PASSWORD;
    String NAME;
    double BALANCE;
    String ACCOUNT_TYPE;
    String BRANCH;

    public ChatuBank(String UID,
            String ACCOUNT_NUMBER,
            String IFSC_CODE,
            String PASSWORD,
            String NAME,
            Double BALANCE,
            String ACCOUNT_TYPE,
            String BRANCH) {
        this.UID = UID;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.ACCOUNT_TYPE = ACCOUNT_TYPE;
        this.IFSC_CODE = IFSC_CODE;
        this.PASSWORD = PASSWORD;
        this.NAME = NAME;
        this.BALANCE = BALANCE;
        this.BRANCH = BRANCH;
    }

    public double BALANCE_CHECK() {
        System.out.println(this.BALANCE);
        return this.BALANCE;
    }

    public void WITHDRAWL(double amount) {
        if (amount <= this.BALANCE) {
            this.BALANCE = this.BALANCE - amount;
            System.out.println("Successfully WITHDRAWLED!");
        } else {
            System.out.println("Not Enough Balance");
            System.out.println("Your Current Balance: " + this.BALANCE);
        }
    }

    public void DEPOSIT(double amount) {
        this.BALANCE = this.BALANCE + amount;
        System.out.println("Successfully DEPOSITTED!");
    }

    public String toString() {
        return "NAME: " + this.NAME + " UID: " + this.UID;
    }

}