class Bill {
    private static int counter;
    private String billId;
    private String paymentMode;

    static {
        // Initialize counter in static block
        counter = 9000;
    }

    // Constructor to initialize paymentMode and generate billId
    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
        counter++; // Increment counter
        this.billId = "B" + counter; // Generate billId
    }

    // Getter for billId
    public String getBillId() {
        return billId;
    }

    // Getter for paymentMode
    public String getPaymentMode() {
        return paymentMode;
    }

    // Setter for paymentMode
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}

class Tester {
    public static void main(String[] args) {
        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");

        // Create more objects if needed
        // Bill bill3 = new Bill("CreditCard");
        // Bill bill4 = new Bill("BankTransfer");

        Bill[] bills = { bill1, bill2 };

        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}
