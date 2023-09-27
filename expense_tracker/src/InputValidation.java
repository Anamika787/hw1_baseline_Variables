
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
            // check if the categories are in the give list that is mentioned above
            if (Categories.contains(category.toLowerCase())) {

                return true;
            }
        } else {
            throw new IllegalArgumentException("InValid Input. Please enter a valid input");
        }

        // Both the integer and string are valid
        return false;
    }

}