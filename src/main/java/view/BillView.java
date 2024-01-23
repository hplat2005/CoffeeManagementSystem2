package view;
  
import javax.swing.JPanel; 
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.BillController;
import model.Bill;
import model.Product;

import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;

import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
 
public class BillView extends JPanel {
	private JTextField productNameText;
	public JTextField quantityText;
	private JLabel productIdLabel;
	private JTextField productIdText;
	private JTextField productPriceText;
	private JTextField totalPriceText;
	public JTextField cashText;
	public JTextField balanceText;
	private JLabel subTotalLabel;
	private JTextField subTotalText;
	private JTextArea textArea;
	
	public JLabel dedutionLabel;
	public JLabel addLabel;
	public JLabel printLabel;
	public JLabel calculateLabel;
	public JLabel searchLabel;
	public JLabel resetLabel;
	private JLabel decorateLabel;
	public JLabel showLabel;


	
	/**
	 * Create the panel.
	 */
	public BillView() {
		BillController billController = new BillController(this);
		setLayout(null);
		this.setBounds(170,1,908,704);
		this.setBackground(new Color(224, 220, 206)); 
		this.repaint();
		JPanel panel = new JPanel();
		panel.setBounds(22, 437, 418, 246);
		add(panel);

		
		panel.setLayout(null);
		
		
		
		JLabel totalPriceLabel = new JLabel("Total Price");
		totalPriceLabel.setBounds(27, 10, 107, 39);
		panel.add(totalPriceLabel);
		totalPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalPriceLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		totalPriceLabel.setBackground( new Color(51,47,24) );
		totalPriceLabel.setForeground(  new Color(222, 217, 200) ) ;
		totalPriceLabel.setOpaque(true);
		
		JLabel cashLabel = new JLabel("Cash");
		cashLabel.setBounds(27, 65, 107, 39);
		panel.add(cashLabel);
		cashLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cashLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		cashLabel.setForeground(  new Color(222, 217, 200));
		cashLabel.setBackground( new Color(51,47,24));
		cashLabel.setOpaque(true);
		
		JLabel balanceLabel = new JLabel("Balance");
		balanceLabel.setBounds(27, 119, 107, 39);
		panel.add(balanceLabel);
		balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		balanceLabel.setBackground( new Color(51,47,24) );
		balanceLabel.setForeground(  new Color(222, 217, 200) ) ;
		balanceLabel.setOpaque(true);
		
		balanceText = new JTextField();
		balanceText.setBounds(127, 119, 256, 39);
		panel.add(balanceText);
		balanceText.setText("0");
		balanceText.setColumns(10);
		
		totalPriceText = new JTextField();
		totalPriceText.setBounds(127, 10, 256, 39);
		panel.add(totalPriceText);
		totalPriceText.setText("0");
		totalPriceText.setColumns(10);
		
		cashText = new JTextField();
		cashText.setBounds(127, 65, 167, 39);
		panel.add(cashText);
		cashText.setText("0");
		cashText.setColumns(10);
		cashText.addMouseListener(billController);
		
		textArea = new JTextArea();
		textArea.setBounds(499, 10, 376, 588);
		add(textArea);
		textArea.setText("******************************************************************************"+
				"\n" +
				"\n" +
			             "*	                        PAYMENT BILL                                       *"+
				"\n" +
				"\n" +
			             "******************************************************************************"+
				         "                           PhatLa Coffee                                                   "
				
				
				
				);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 10, 418, 394);
		add(panel_1);
		panel_1.setLayout(null);
		
		productIdText = new JTextField();
		productIdText.setBounds(129, 82, 154, 39);
		panel_1.add(productIdText);
		productIdText.setColumns(10);
		
		productNameText = new JTextField();
		productNameText.setBounds(129, 131, 256, 39);
		panel_1.add(productNameText);
		productNameText.setColumns(10);
		
		searchLabel = new JLabel("Search");
		searchLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\icons8-search-30.png")));
		searchLabel.setBounds(283, 81, 102, 39);
		panel_1.add(searchLabel);
		searchLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		searchLabel.setHorizontalAlignment(SwingConstants.CENTER);
		searchLabel.setBackground(new Color(42,59,56));
		searchLabel.setOpaque(true);
		searchLabel.setForeground( new Color(247, 209, 82) );
		
		calculateLabel = new JLabel("Calculate");
		calculateLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\math20.png")));
		calculateLabel.setBounds(283, 227, 102, 39);
		panel_1.add(calculateLabel);
		calculateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		calculateLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		calculateLabel.setBackground(new Color(42, 59, 56));
		calculateLabel.setForeground(new Color(247, 209, 82));
		calculateLabel.setOpaque(true);
		
		printLabel = new JLabel("PRINT");
		printLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\print 20.png")));
		printLabel.setBounds(227, 186, 156, 31);
		panel.add(printLabel);
		printLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		printLabel.setHorizontalAlignment(SwingConstants.CENTER);
		printLabel.setBackground(new Color(42,59,56));
		printLabel.setOpaque(true);
		printLabel.addMouseListener(billController);
		printLabel.setForeground(new Color(247, 209, 82));
		
		resetLabel = new JLabel("RESET");
		resetLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\icons8-reset-20.png")));
		resetLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		resetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resetLabel.setBounds(631, 651, 131, 32);
		resetLabel.setBackground(new Color(42,59,56));
		resetLabel.setOpaque(true);
		resetLabel.setForeground( new Color(247, 209, 82) );
		add(resetLabel);
		resetLabel.addMouseListener(billController);
		
		addLabel = new JLabel("ADD");
		addLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\icons8-add-20.png")));
		addLabel.setBounds(151, 352, 154, 32);
		panel_1.add(addLabel);
		addLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		addLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addLabel.setBackground(new Color(42,59,56));
		addLabel.setOpaque(true);
		addLabel.setForeground(new Color(247, 209, 82));
		

		dedutionLabel = new JLabel("Dedution");
		dedutionLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\dedution20.png")));
		dedutionLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		dedutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dedutionLabel.setBounds(304, 65, 79, 39);
		dedutionLabel.setBackground(new Color(42, 59, 56));
		dedutionLabel.setForeground(new Color(247, 209, 82));
		dedutionLabel.setOpaque(true);
		dedutionLabel.addMouseListener(billController);
		panel.add(dedutionLabel);
		

		showLabel = new JLabel("SHOW BILL");
		showLabel.setIcon(new ImageIcon(("C:\\Users\\latru\\Desktop\\icon\\show 20 icons8.png")));
		showLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		showLabel.setHorizontalAlignment(SwingConstants.CENTER);
		showLabel.setBounds(27, 186, 139, 31);
		showLabel.setBackground(new Color(42, 59, 56));
		showLabel.setForeground(new Color(247, 209, 82));
		showLabel.setOpaque(true);
        showLabel.addMouseListener(billController);
		panel.add(showLabel);
		
		
		
		
		subTotalLabel = new JLabel("Sub Total");
		subTotalLabel.setBounds(29, 303, 102, 39);
		panel_1.add(subTotalLabel);
		subTotalLabel.setOpaque(true);
		subTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subTotalLabel.setForeground(new Color(222, 217, 200));
		subTotalLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		subTotalLabel.setBackground(new Color(51, 47, 24));
		
		subTotalText = new JTextField();
		subTotalText.setBounds(129, 303, 256, 39);
		panel_1.add(subTotalText);
		subTotalText.setColumns(10);
		
		JLabel quantityLabel = new JLabel("Quantity");
		quantityLabel.setBounds(29, 228, 101, 39);
		panel_1.add(quantityLabel);
		quantityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quantityLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		quantityLabel.setBackground(new Color(51,47,24));
		quantityLabel.setOpaque(true);
		quantityLabel.setForeground(new Color(222, 217, 200));
		
		JLabel productPriceLabel = new JLabel("Product Price");
		productPriceLabel.setBounds(29, 179, 101, 39);
		panel_1.add(productPriceLabel);
		productPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productPriceLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		productPriceLabel.setBackground( new Color(51,47,24)) ;
		productPriceLabel.setOpaque(true);
		productPriceLabel.setForeground( new Color(222, 217, 200) );
		
		
		JLabel productNameLabel = new JLabel("ProductName");
		productNameLabel.setBounds(29, 130, 101, 39);
		panel_1.add(productNameLabel);
		productNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		productNameLabel.setBackground(new Color(51,47,24));
		productNameLabel.setOpaque(true);
		productNameLabel.setForeground(new Color(222, 217, 200));
		
		quantityText = new JTextField();
		quantityText.setBounds(129, 228, 154, 39);
		panel_1.add(quantityText);
		quantityText.addMouseListener(billController);
		quantityText.setColumns(10);
		
		productPriceText = new JTextField();
		productPriceText.setBounds(129, 178, 259, 39);
		panel_1.add(productPriceText);
		productPriceText.setColumns(10);
		
		productIdLabel = new JLabel("ProductId");
		productIdLabel.setBounds(29, 81, 101, 39);
		panel_1.add(productIdLabel);
		productIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productIdLabel.setFont(new Font("Poppins", Font.PLAIN, 12));
		productIdLabel.setBackground(new Color(21,30,28));
		productIdLabel.setOpaque(true);
		productIdLabel.setForeground(new Color(222, 217, 200));
		
		decorateLabel = new JLabel("BILL");
		decorateLabel.setIcon(new ImageIcon(("/C:\\Users\\latru\\Desktop\\icon\\bill 64.png")));
		decorateLabel.setFont(new Font("Georgia", Font.BOLD, 32));
		decorateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		decorateLabel.setBounds(0, 0, 418, 72);
		panel_1.add(decorateLabel);
		decorateLabel.setBackground(new Color(21,30,28));
		decorateLabel.setOpaque(true);
		decorateLabel.setForeground(new Color(240, 192, 31));
		
		addLabel.addMouseListener(billController);
		calculateLabel.addMouseListener(billController);
		searchLabel.addMouseListener(billController);
		
		
		
	
   }
	public void pressSearch() {
		Product product = new Product();
		product.setProductId(productIdText.getText());
		dao.ProductDAO.getInstance().selectById(product);
		
		productNameText.setText(product.getProductName());
		productPriceText.setText(product.getProductPrice());
//		productIdText.setText(null);
		
	}
	public void pressCalculate() {
		int quantity = Integer.valueOf(quantityText.getText());	
		int productPrice = Integer.valueOf(productPriceText.getText());
		int subTotal = quantity * productPrice;
		String subTotalString = String.valueOf(subTotal);
		subTotalText.setText(subTotalString);
		
		
	}
	public void pressAdd() {
		int subTotalInt = Integer.valueOf(subTotalText.getText());
		int totalPriceInt = Integer.valueOf(totalPriceText.getText());
		int total = subTotalInt + totalPriceInt;
		totalPriceText.setText(String.valueOf(total));
	}
	public void clickCashText() {
		cashText.setText(null);
	}
	public void clickQuantityText() {
		quantityText.setText(null);
	}
	public void pressDedutionLabel() {
		int totalPriceInt = Integer.valueOf(totalPriceText.getText());
		int cashInt = Integer.valueOf(cashText.getText());
		int deduction = totalPriceInt - cashInt;
		balanceText.setText(String.valueOf(deduction));
	}
	public void pressReset() {
		productIdText.setText(null);
		productNameText.setText(null);
		productPriceText.setText(null);
		quantityText.setText(null);
		subTotalText.setText(null);
		textArea.setText(null);
		
		totalPriceText.setText("0");
		cashText.setText("0");
		balanceText.setText("0");
	}
	public void pressShow() {
		long now = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(now);
		java.sql.Time time = new java.sql.Time(now);
		textArea.setText("******************************************************************************"+
				"\n" +
				"\n" +
			 "*	                        PAYMENT BILL                                       *"+
				"\n" +
				"\n" +
			 "******************************************************************************"+
				"\n" +
	         "*                                                  PhatLa Coffee                                  *"+
				"\n" +
			 "*               Address:D.Tran Hung Dao, An Hai, Son Tra, Da Nang              *"+
				"\n" +
			 "*                                        Contact: 0912485084                          *"+
				"\n"+
			 "---------------------------------------------------------------------------------------------"+
			 	"\n"+
			 "*                                            Ngay: " + date+ "                                     *"+
				"\n"+
				"*                                             Gio:  " + time +"+                                 *"+
				"\n"+
				"-------------------------------------------------------------------------------------------------------"+
				"\n"+
				"*ProductName               Price                   Quantity                    SubTotal*"+
				"\n"+
			    "*" + productNameText.getText() +"                        "+productPriceText.getText()+"                   "+ quantityText.getText()+"                             " + subTotalText.getText()+ "*"+
				"\n"+
			    "-------------------------------------------------------------------------------------------------------------"+
				"\n"+
				"Total"+"                                                                                            "+totalPriceText.getText()+
				"\n"+
				"Cash"+"                                                                                            "+cashText.getText()+
				"\n"+
				"Balance"+"                                                                                      "+balanceText.getText()
			);
	}
	public void pressPrint() {
		
		try {
			textArea.print();
		} catch (PrinterException e) {
			e.printStackTrace();
		}
		
		
	
	}
}
