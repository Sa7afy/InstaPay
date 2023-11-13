import java.util.Date;

public class waterBill extends Bill{
    String serviceAddress,accountNumber;

    public waterBill(String id, double amount, boolean status, Date date) {
        super(id, amount, status, date);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
