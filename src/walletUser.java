public class walletUser extends User {
    String walletNumber;
    walletApi api;

    public String getWalletNumber() {
        return walletNumber;
    }

    public void setApi(walletApi api) {
        this.api = api;
    }

    public void setWalletNumber(String walletNumber) {
        this.walletNumber = walletNumber;
    }

    public walletApi getApi() {
        return api;
    }
}