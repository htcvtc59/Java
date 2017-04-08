/**
 * Order.java
 *
 *  This program takes the order for a pizza using a parameterized query. It
 *  displays final result by calculating the total price for the pizza based
 *  on the toppings choosen by the user. The application connects to a
 *  ToppingDetails table in a database named HealthyFillers.
 *
 *  Copyright (c) 2006 Aptech Software Limited. All Rights Reserved.
 */

package order;

import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * This program uses a PreparedStatement object to calculate and display records
 * from ToppingDetails table.
 * @author  vincent
 */
public class Order extends javax.swing.JFrame {
  
  /** Creates new form Order */
  public Order() {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows." +
          "WindowsLookAndFeel");
      UIManager.put("Button.showMnemonics", Boolean.TRUE);
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    } catch (UnsupportedLookAndFeelException ex) {
      ex.printStackTrace();
    } catch (InstantiationException ex) {
      ex.printStackTrace();
    } catch (IllegalAccessException ex) {
      ex.printStackTrace();
    }
    getContentPane().setBackground(new Color(212, 208, 200));
    
    // Load a Type 4 driver for connecting to SQL Server 2005 database.
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      
      // Obtain a connection to the database
      cnPizza = java.sql.DriverManager.getConnection(getConnectionUrl(),
          userName, password);
      
      if(cnPizza != null) {
        System.out.println("Connection Successful!!");
        
        //String variable to store the parameterized query string.
        String sqlStmt = "Select ToppingPrice from ToppingDetails where " +
            "ToppingName = ?";
        
        // PreparedStatement object for sending SQL statement to the database.
        pstmt = cnPizza.prepareStatement(sqlStmt);
      }
      
    } catch (SQLException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
    initComponents();
  }
  
  /**
   * This method returns the URL for the SQL Server 2005 database.
   * @return The string contaning the URL, server name, instance name
   * and database name.
   */
  private String getConnectionUrl() {
    return url + serverName + ";instanceName=" + instanceName +
        ";databaseName="+ databaseName;
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents() {
    bgrType = new javax.swing.ButtonGroup();
    pnlType = new javax.swing.JPanel();
    radNonVeg = new javax.swing.JRadioButton();
    radVeg = new javax.swing.JRadioButton();
    pnlFilling = new javax.swing.JPanel();
    chkOlives = new javax.swing.JCheckBox();
    chkChicken = new javax.swing.JCheckBox();
    chkPepperoni = new javax.swing.JCheckBox();
    chkCheese = new javax.swing.JCheckBox();
    pnlContact = new javax.swing.JPanel();
    lblName = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    lblPhone = new javax.swing.JLabel();
    txtPhone = new javax.swing.JTextField();
    lblAddress = new javax.swing.JLabel();
    scpAddress = new javax.swing.JScrollPane();
    txaAddress = new javax.swing.JTextArea();
    btnSubmit = new javax.swing.JButton();
    pnlResult = new javax.swing.JPanel();
    lblOrder = new javax.swing.JLabel();
    lblResult = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btnExit = new javax.swing.JButton();

    getContentPane().setLayout(null);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Order Form");
    pnlType.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pizza Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11)));
    pnlType.setPreferredSize(new java.awt.Dimension(300, 60));
    bgrType.add(radNonVeg);
    radNonVeg.setText("Non-Vegetarian");
    radNonVeg.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    radNonVeg.setMargin(new java.awt.Insets(0, 0, 0, 0));
    radNonVeg.setPreferredSize(new java.awt.Dimension(100, 15));
    pnlType.add(radNonVeg);

    bgrType.add(radVeg);
    radVeg.setText("Vegetarian");
    radVeg.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    radVeg.setMargin(new java.awt.Insets(0, 0, 0, 0));
    radVeg.setPreferredSize(new java.awt.Dimension(100, 15));
    pnlType.add(radVeg);

    getContentPane().add(pnlType);
    pnlType.setBounds(20, 70, 300, 60);

    pnlFilling.setLayout(null);

    pnlFilling.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose Toppings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11)));
    pnlFilling.setPreferredSize(new java.awt.Dimension(300, 70));
    chkOlives.setText("Olives");
    chkOlives.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    chkOlives.setMargin(new java.awt.Insets(0, 0, 0, 0));
    chkOlives.setPreferredSize(new java.awt.Dimension(80, 15));
    pnlFilling.add(chkOlives);
    chkOlives.setBounds(180, 20, 80, 20);

    chkChicken.setText("Chicken");
    chkChicken.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    chkChicken.setMargin(new java.awt.Insets(0, 0, 0, 0));
    chkChicken.setPreferredSize(new java.awt.Dimension(80, 15));
    pnlFilling.add(chkChicken);
    chkChicken.setBounds(20, 20, 80, 20);

    chkPepperoni.setText("Pepperoni");
    chkPepperoni.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    chkPepperoni.setMargin(new java.awt.Insets(0, 0, 0, 0));
    chkPepperoni.setPreferredSize(new java.awt.Dimension(80, 15));
    pnlFilling.add(chkPepperoni);
    chkPepperoni.setBounds(20, 40, 80, 20);

    chkCheese.setText("Cheese");
    chkCheese.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    chkCheese.setMargin(new java.awt.Insets(0, 0, 0, 0));
    chkCheese.setPreferredSize(new java.awt.Dimension(80, 15));
    pnlFilling.add(chkCheese);
    chkCheese.setBounds(180, 40, 80, 20);

    getContentPane().add(pnlFilling);
    pnlFilling.setBounds(20, 140, 300, 70);

    pnlContact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11)));
    pnlContact.setPreferredSize(new java.awt.Dimension(300, 190));
    lblName.setText("Name:");
    lblName.setPreferredSize(new java.awt.Dimension(45, 20));
    pnlContact.add(lblName);

    txtName.setPreferredSize(new java.awt.Dimension(210, 20));
    pnlContact.add(txtName);

    lblPhone.setText("Phone:");
    lblPhone.setPreferredSize(new java.awt.Dimension(45, 20));
    pnlContact.add(lblPhone);

    txtPhone.setPreferredSize(new java.awt.Dimension(210, 20));
    txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPhoneKeyTyped(evt);
      }
    });

    pnlContact.add(txtPhone);

    lblAddress.setText("Address:");
    lblAddress.setPreferredSize(new java.awt.Dimension(45, 20));
    pnlContact.add(lblAddress);

    scpAddress.setPreferredSize(new java.awt.Dimension(210, 94));
    txaAddress.setColumns(20);
    txaAddress.setFont(new java.awt.Font("Tahoma", 0, 11));
    txaAddress.setRows(5);
    scpAddress.setViewportView(txaAddress);

    pnlContact.add(scpAddress);

    getContentPane().add(pnlContact);
    pnlContact.setBounds(20, 220, 300, 190);

    btnSubmit.setMnemonic('S');
    btnSubmit.setText("Submit");
    btnSubmit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSubmitActionPerformed(evt);
      }
    });

    getContentPane().add(btnSubmit);
    btnSubmit.setBounds(80, 420, 67, 23);

    pnlResult.setPreferredSize(new java.awt.Dimension(300, 60));
    lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblOrder.setPreferredSize(new java.awt.Dimension(290, 20));
    pnlResult.add(lblOrder);

    lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblResult.setPreferredSize(new java.awt.Dimension(290, 20));
    pnlResult.add(lblResult);

    getContentPane().add(pnlResult);
    pnlResult.setBounds(20, 460, 300, 60);

    jPanel1.setLayout(null);

    jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
    jLabel1.setForeground(new java.awt.Color(153, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Pizza Italiano");
    jPanel1.add(jLabel1);
    jLabel1.setBounds(50, 10, 180, 22);

    getContentPane().add(jPanel1);
    jPanel1.setBounds(30, 10, 290, 40);

    btnExit.setText("Exit");
    btnExit.setPreferredSize(new java.awt.Dimension(67, 23));
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });

    getContentPane().add(btnExit);
    btnExit.setBounds(200, 420, 60, 23);

    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width-349)/2, (screenSize.height-570)/2, 349, 570);
  }// </editor-fold>//GEN-END:initComponents
  
  /**
   * This method is used to exit the application and to close all the JDBC
   * resources.
   * @param evt ActionEvent object to store information about the click on the
   * Exit button.
   */
  private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
// TODO add your handling code here:
    System.exit(0);
    try {
      rs.close();
      pstmt.close();
      cnPizza.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }//GEN-LAST:event_btnExitActionPerformed
  
  /**
   * This method is invoked to calculate and display the total price of pizza
   * ordered from the ToppingDetails table.
   * @param evt ActionEvent object to store information about the click on the
   * Submit button.
   */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

      String []parameters = new String[4];
      float fillingPrice = 0.0f;
      if(txaAddress.getText().length() == 0) {
        lblResult.setText("Address field cannot be left blank!");
      } else {
        Component boxes[] = pnlFilling.getComponents();
        
        int j =0;
        for(int i = 0 ; i < boxes.length ;i++){
          JCheckBox box = (JCheckBox)boxes[i];
          if(box.isSelected()){
            System.out.println(box.getText());
            parameters[j] = box.getText();
            j++;
          }
        }
        
        for(int i = 0 ; i < parameters.length ;i++){
          if(parameters[i] != null){
            try {
              
              // Execute SQL statement in PreparedStatement object and return
              // the ResultSet object generated by the query.
              pstmt.setString(1,parameters[i]);
              rs = pstmt.executeQuery();
              
              // Calculate the total price of the pizza by adding the price of
              // each topping to the base price of pizza till the last record
              // in the ResultSet is traversed.
              while(rs.next()){
                fillingPrice = fillingPrice + rs.getFloat("ToppingPrice");
              }
            } catch (SQLException ex) {
              ex.printStackTrace();
            }
          }
        }
        
        // Display the total price of the pizza calculated.
        lblOrder.setText("This Pizza will cost you : $"+ fillingPrice);
        lblResult.setText("Thanks for ordering from Pizza Italiano!!!");
      }
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    /**
     * This method is invoked to allow the user to enter only numeric values
     * for the phone text field.
     * @param evt ActionEvent object to store information about entering values
     * in the Phone text field.
     */
    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
// TODO add your handling code here:
      String numbers = "0123456789 ";
      if(numbers.indexOf(evt.getKeyChar()) == -1){
        evt.consume();
        lblResult.setText("Phone field accepts numeric values only!");
      }
    }//GEN-LAST:event_txtPhoneKeyTyped
    
    /**
     * This is the entry point of the application.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
          new Order().setVisible(true);
        }
      });
    }
    
    /**
     * Variable to store a reference to a Connection object.
     */
    private java.sql.Connection cnPizza = null;
    /**
     * Variable to store the URL connection string.
     */
    private final String url = "jdbc:sqlserver://";
    /**
     * Variable to store the IP address of the machine on which SQL Server 2005
     * database is located.
     */
    private final String serverName = "10.2.1.51";
    /**
     * Variable to store the default port number of SQL Server Database.
     */
    private final String portNumber = "1433";
    /**
     * Variable to store the instance name of the SQL Server.
     */
    private final String instanceName = "martin";
    /**
     * Variable to store the name of the database to connect to.
     */
    private final String databaseName = "DeveloperApps";
    /**
     * Variable to store the user name to connect to SQL Server.
     */
    private final String userName = "sa";
    /**
     * Variable to store the pasword to connect to SQL Server.
     */
    private final String password = "playware";
    /**
     * Statement object to hold a reference to the PreparedStatement object.
     */
    private PreparedStatement pstmt;
    /**
     * ResultSet object to hold a reference to the ResultSet object.
     */
    private ResultSet rs= null;
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup bgrType;
  private javax.swing.JButton btnExit;
  private javax.swing.JButton btnSubmit;
  private javax.swing.JCheckBox chkCheese;
  private javax.swing.JCheckBox chkChicken;
  private javax.swing.JCheckBox chkOlives;
  private javax.swing.JCheckBox chkPepperoni;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblAddress;
  private javax.swing.JLabel lblName;
  private javax.swing.JLabel lblOrder;
  private javax.swing.JLabel lblPhone;
  private javax.swing.JLabel lblResult;
  private javax.swing.JPanel pnlContact;
  private javax.swing.JPanel pnlFilling;
  private javax.swing.JPanel pnlResult;
  private javax.swing.JPanel pnlType;
  private javax.swing.JRadioButton radNonVeg;
  private javax.swing.JRadioButton radVeg;
  private javax.swing.JScrollPane scpAddress;
  private javax.swing.JTextArea txaAddress;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPhone;
  // End of variables declaration//GEN-END:variables
}