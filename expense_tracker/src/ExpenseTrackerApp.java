import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

  public static void main(String[] args) {

    // Create MVC components
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Serial");
    tableModel.addColumn("Amount");
    tableModel.addColumn("Category");
    tableModel.addColumn("Date");

    ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

    // Initialize view
    view.setVisible(true);

    // Handle add transaction button clicks
    view.getAddTransactionBtn().addActionListener(e -> {

      // Get transaction data from view
      double amount = view.getAmountField();
      String category = view.getCategoryField();

      // validate
      InputValidation validate = new InputValidation(amount, category);

      // Initialize view
      view.setVisible(true);
      try {
        if (validate.validateTransaction(amount, category) == true) {
          // Create transaction object
          Transaction t = new Transaction(amount, category);

          // Call controller to add transaction
          view.addTransaction(t);
        }

      }

      catch (IllegalArgumentException ef) {

        JOptionPane.showMessageDialog(null, "An error occurred: " + ef.getMessage(), "Error",
            JOptionPane.ERROR_MESSAGE);

      }
    });

  }

}