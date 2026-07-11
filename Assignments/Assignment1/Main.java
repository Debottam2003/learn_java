public class Main {
    public static void main(String[] args) {
        Main.UserCreation("U179874", "R6H5H1GREHR4ERG", "SBI7988124", "OKUDERA", "DEBOTTAM KAR", 3000.0, "SALARY",
                "NAIHATI");
    }

    public static void UserCreation(String UID,
            String ACCOUNT_NUMBER,
            String IFSC_CODE,
            String PASSWORD,
            String NAME,
            Double BALANCE,
            String ACCOUNT_TYPE,
            String BRANCH) {
        ChatuBank user1 = new ChatuBank(UID, ACCOUNT_NUMBER, IFSC_CODE, PASSWORD, NAME, BALANCE, ACCOUNT_TYPE, BRANCH);
        System.out.println(user1);
    }
}
