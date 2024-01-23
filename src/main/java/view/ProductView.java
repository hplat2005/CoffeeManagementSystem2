package view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.ProductController;
import model.Product;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ProductView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField productIdText;
	public static  JTable table = new JTable();
	public static  DefaultTableModel model;
	private JTextField productNameText;
	private JTextField productPriceText;
	public static JLabel addLabel;
	public static JLabel deleteLabel;
	public static JLabel updateLabel;
	public JScrollPane scrollPane;
	private ProductController productController = new ProductController(this);
	private JLabel decorateLabel;

	/**
	 * Create the panel.
	 */
	public ProductView() {
		setLayout(null);
		this.setBounds(170,1,908,704);
		this.setBackground(new Color(230, 224, 207));
		this.repaint();
		init();
		
		

	}
	public void init() {
		JLabel productIdLabel = new JLabel("Product Id");
		productIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productIdLabel.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		productIdLabel.setBounds(116, 422, 119, 34);
		productIdLabel.setBackground(new Color(46, 45, 41));
		productIdLabel.setOpaque(true);
		productIdLabel.setForeground(new Color(235, 209, 103));
		add(productIdLabel);
		
		JLabel productNameLabel= new JLabel("Product Name");
		productNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLabel.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		productNameLabel.setBounds(116, 466, 119, 34);
		productNameLabel.setBackground(new Color(46, 45, 41));
		productNameLabel.setOpaque(true);
		productNameLabel.setForeground(new Color(235, 209, 103));
		add(productNameLabel);
		
		JLabel productPriceLabel= new JLabel("Product Price");
		productPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productPriceLabel.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		productPriceLabel.setBounds(116, 510, 119, 34);
		productPriceLabel.setBackground(new Color(46, 45, 41));
		productPriceLabel.setOpaque(true);
		productPriceLabel.setForeground(new Color(235, 209, 103));
		add(productPriceLabel);
		
		productIdText = new JTextField();
		productIdText.setBounds(234, 421, 560, 34);
		add(productIdText);
		
		productIdText.setColumns(10);
		
		
		
		productNameText = new JTextField();
		productNameText.setColumns(10);
		productNameText.setBounds(234, 510, 560, 34);
		add(productNameText);
		
		productPriceText = new JTextField();
		productPriceText.setColumns(10);
		productPriceText.setBounds(234, 466, 560, 34);
		add(productPriceText);
		
		addLabel = new JLabel("ADD");
		addLabel.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\add 30.png"));
		addLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		addLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addLabel.setBounds(234, 600, 129, 40);
		addLabel.setBackground(new Color(46, 45, 41) );
		addLabel.setOpaque(true);
		addLabel.setForeground(new Color(235, 204, 101));
		add(addLabel);
		addLabel.addMouseListener(productController);
		
		updateLabel = new JLabel("UPDATE");
		updateLabel.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\edit 20.png"));
		updateLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		updateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		updateLabel.setBounds(447, 600, 129, 40);
		updateLabel.setBackground(new Color(46, 45, 41));
		updateLabel.setOpaque(true);
		updateLabel.setForeground(new Color(235, 204, 101));
		add(updateLabel);
		updateLabel.addMouseListener(productController);
		
		deleteLabel = new JLabel("DELETE");
	deleteLabel.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\delete20.png"));
		deleteLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		deleteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		deleteLabel.setBounds(665, 600, 129, 40);
		deleteLabel.setBackground(new Color(46, 45, 41));
		deleteLabel.setOpaque(true);
		deleteLabel.setForeground(new Color(235, 204, 101));
		add(deleteLabel);
		deleteLabel.addMouseListener(productController);
		
        scrollPane = new JScrollPane();
		scrollPane.setBounds(116, 128, 683, 258);
		add(scrollPane);
		table.addMouseListener(productController);
		scrollPane.setViewportView(table);
		model = (DefaultTableModel) table.getModel();
		dao.ProductDAO.getInstance().selecetAll();
		table.setModel(model);
		 
		decorateLabel = new JLabel("PRODUCT MANAGEMENT");
		decorateLabel.setIcon(new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\product management 100.png"));
		decorateLabel.setFont(new Font("Newake Demo", Font.BOLD, 26));
		decorateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		decorateLabel.setBounds(0, 0, 908, 118);
		decorateLabel.setBackground(new Color(46, 45, 41));
		decorateLabel.setOpaque(true);
		decorateLabel.setForeground(new Color(196, 166, 43));
		add(decorateLabel);
	}
	 
	public void pressAddLabel() {
		Product product = new Product();
		product.setProductId(productIdText.getText());
		product.setProductName(productNameText.getText());
		product.setProductPrice(productPriceText.getText());
		
		int ketqua = dao.ProductDAO.getInstance().insert(product);
		if(ketqua ==0) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { productIdText.getText(),productNameText.getText(),productPriceText.getText()});
			JOptionPane.showMessageDialog(null, "Add Product Successfully");
			
			productIdText.setText(null);
			productNameText.setText(null);
			productPriceText.setText(null);
		}else if(ketqua ==1) { 
			JOptionPane.showMessageDialog(null,"Product Id Already Exists ");
	    }
	}
	public void pressDeleteLabel() {
		if(table.getSelectedRowCount() ==1) {
			//backend
			Product product = new Product();
			product.setProductId(productIdText.getText());
			product.setProductName(productNameText.getText());
			product.setProductPrice(productPriceText.getText());
			int ketqua =dao.ProductDAO.getInstance().delete(product);
			if(ketqua == 0) {
				//frontend
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.removeRow(table.getSelectedRow());
				JOptionPane.showMessageDialog(null, "Delete Successfully");
			}else if(ketqua ==1) {
				JOptionPane.showMessageDialog(null,"Not found data to delete");
			}
		}else if(table.getSelectedRow() == 0) {
			JOptionPane.showMessageDialog(null, "Please Select Row");
		}
	}
	public void pressUpdateLabel() {
		if(table.getSelectedRowCount() == 1) {
			//backend
			Product product = new Product();
			product.setProductId(productIdText.getText());
			product.setProductName(productNameText.getText());
			product.setProductPrice(productPriceText.getText());
			int ketQua =dao.ProductDAO.getInstance().update(product);
			if(ketQua == 0) {
				model.setValueAt(product.getProductId(), table.getSelectedRow(), 0);
				model.setValueAt(product.getProductName(), table.getSelectedRow(), 1);
				model.setValueAt(product.getProductPrice(), table.getSelectedRow(), 2);
				JOptionPane.showMessageDialog(null,"Update Successfully");
			  }else if(ketQua ==1 ) {
				JOptionPane.showMessageDialog(null,"StaffIdCard has already exist");
			} 
			 
		}else if(table.getSelectedRowCount() == 0) {
			     JOptionPane.showMessageDialog(null, "Please Select Row");
		 }
	}
	public void pressTable() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int selectedRowIndex = table.getSelectedRow();
		productIdText.setText(model.getValueAt(selectedRowIndex, 0).toString());
		productNameText.setText(model.getValueAt(selectedRowIndex, 1).toString());
		productPriceText.setText(model.getValueAt(selectedRowIndex, 2).toString());
	}


}

