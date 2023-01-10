package EstoreApp2;

public class BillingInformation {
    private static  String receiverPhoneNumber;
    private static String receiverName;
    private static Address deliveryAddress;
    private static CreditCardInformation creditCardInformation;

    public static String getReceiverName() {
        return receiverName;
    }

    public static void setReceiverName(String receiverName) {
        BillingInformation.receiverName = receiverName;
    }
}
