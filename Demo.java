public class DuplicationTest {

    public void processOrder() {
        System.out.println("Starting order processing flow");
        System.out.println("Fetching customer details from DB");
        System.out.println("Calculating total order cost and taxes");
        System.out.println("Applying discount codes if applicable");
        System.out.println("Generating invoice for customer transaction");
        System.out.println("Sending payment request to gateway");
        System.out.println("Awaiting response from payment gateway");
        System.out.println("Order status updated to completed");
        System.out.println("Sending confirmation email to user");
        System.out.println("Order processing successfully finished");
    }

    // --- REPEATED BLOCK (10 Lines) ---
    public void validateTransaction() {
        System.out.println("Fetching customer details from DB");
        System.out.println("Calculating total order cost and taxes");
        System.out.println("Applying discount codes if applicable");
        System.out.println("Generating invoice for customer transaction");
        System.out.println("Sending payment request to gateway");
        System.out.println("Awaiting response from payment gateway");
        System.out.println("Order status updated to completed");
        System.out.println("Sending confirmation email to user");
        System.out.println("Order processing successfully finished");
    }

    public void cancelOrder() {
        System.out.println("Initiating cancellation sequence");
        System.out.println("Verifying order eligibility for refund");
        System.out.println("Contacting payment gateway for refund request");
        System.out.println("Processing partial or full refund amount");
        System.out.println("Updating inventory count for cancelled items");
        System.out.println("Sending cancellation confirmation to customer");
        System.out.println("Logging cancellation event in admin panel");
        System.out.println("Closing customer support ticket automatically");
        System.out.println("Notifying warehouse team to halt shipping");
        System.out.println("Transaction successfully rolled back");
        System.out.println("Database records synchronized with new state");
        System.out.println("System audit log entry created");
        System.out.println("Cleanup completed for order session");
        System.out.println("Cancellation routine finished without errors");
        System.out.println("Returning control to main application pipeline");
        System.out.println("End of cancellation method execution");
    }
}
