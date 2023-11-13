import java.util.*;

public abstract class Bill {
    String ID;
    double amount;
    boolean status;
    Date date;
    public Bill(String id, double amount, boolean status, Date date) {
        this.ID = id;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public String getID() {
        return ID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
