public class bankUser extends User {
    String walletNumber;
    bankApi api;

    public String getWalletNumber() {
        return walletNumber;
    }

    public void setApi(bankApi api) {
        this.api = api;
    }

    public void setWalletNumber(String walletNumber) {
        this.walletNumber = walletNumber;
    }

    public bankApi getApi() {
        return api;
    }
}
