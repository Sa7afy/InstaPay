public abstract class User {
    protected String username;
    protected String password;

    protected String email;

    protected double balance;

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
