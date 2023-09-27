import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.List;

public class InputValidation {
    double amount;
    String category;

    public InputValidation(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public static boolean validateTransaction(double amount, String category) {
        // Validate the integer
        List<String> Categories = Arrays.asList("food", "other", "travel", "bills", "entertainment");
        // check if the amount is within the range
        if (amount > 0 && amount < 1000) {

            return true;

        } else {
            return false;

        }

    }

}