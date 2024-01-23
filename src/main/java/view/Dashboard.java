package view;
  

import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.MouseMenuListener;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.SwingConstants;


import javax.swing.ImageIcon;
import view.BillView;

public class Dashboard extends JFrame {
	public Dashboard() {
		this.setResizable(false);
//		this.setFocusCycleRoot(true);
//		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

//		this.setUndecorated(true);
//		this.setLocationRelativeTo(null);

		this.setFocusable(true);
    	this.setBounds(100, 100, 1092, 742);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("Coffee Management System");
		this.setVisible(true);
		init();
	}
    private JPanel contentPane;

    static ProductView productView = new ProductView();
    static StaffView staffView = new StaffView();
    static BillView billView = new BillView();
	
    
	public JLabel homeLabel  = new JLabel("Home");
	public JLabel productsLabel = new JLabel("Products");
	public JLabel staffLabel = new JLabel("Staff");
	public JLabel orderLabel = new JLabel("Order");
	private final JLabel decorateLabel = new JLabel("HPLAT COFFEE");
	
	
	public void init(){

		MouseMenuListener mousemenulistener = new MouseMenuListener(this);
	this.repaint();
		ImageIcon productLabelIcon = new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\drink (1).png");
		productsLabel.setIcon( productLabelIcon);
		ImageIcon staffLabelIcon = new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\management (1).png");
		staffLabel.setIcon(staffLabelIcon);
		ImageIcon orderLabelIcon = new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\checklist (1).png");
		orderLabel.setIcon(orderLabelIcon);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel functionPanel = new JPanel();
		functionPanel.setBackground(new Color(46, 45, 41));
		functionPanel.setBounds(0, 86, 169, 619);
		functionPanel.setLayout(null);
// LEFT MENU
		//bản menu - home
		homeLabel.setOpaque(true);
		homeLabel.setBackground(new Color(51, 255, 102));
		homeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		homeLabel.setBounds(0, 28, 169, 39);
		functionPanel.add(homeLabel);
		homeLabel.setBackground(new Color(252, 186, 3));
		homeLabel.setOpaque(true);
		homeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		ImageIcon homeLabelIcon = new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\home42.png");
		homeLabel.setIcon(homeLabelIcon);
		homeLabel.setForeground(new Color(249,211,66));
		homeLabel.addMouseListener(mousemenulistener);

		// bản menu - products
		productsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		productsLabel.setForeground(new Color(249, 211, 66));
		productsLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		productsLabel.setBackground(new Color(46,45,41));
		productsLabel.setOpaque(true);
		productsLabel.setBounds(0, 97, 169, 39);
		functionPanel.add(productsLabel);
		productsLabel.addMouseListener(mousemenulistener);

		// bản menu - staff
		staffLabel.setHorizontalAlignment(SwingConstants.LEFT);
		staffLabel.setForeground(new Color(249, 211, 66));
		staffLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		staffLabel.setBackground(new Color(46, 45, 41));
		staffLabel.setOpaque(true);
		staffLabel.setBounds(0, 159, 169, 39);
		functionPanel.add(staffLabel);
		staffLabel.addMouseListener(mousemenulistener);

		//bản menu - order
		orderLabel.setHorizontalAlignment(SwingConstants.LEFT);
		orderLabel.setForeground(new Color(249, 211, 66));
		orderLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		orderLabel.setBackground(new Color(46, 45, 41));
		orderLabel.setOpaque(true);
		orderLabel.setBounds(0, 227, 169, 39);
		functionPanel.add(orderLabel);
		orderLabel.addMouseListener(mousemenulistener);
		
		// decorate gui
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(46, 45, 41));
		titlePanel.setBounds(0, 1, 169, 85);
		titlePanel.setLayout(null);
		JLabel hplatcoffeLabel = new JLabel("hplat Coffee");
		hplatcoffeLabel.setBounds(0, 0, 169, 85);
		titlePanel.add(hplatcoffeLabel);
		ImageIcon hplatcoffeeIcon = new ImageIcon("C:\\Users\\latru\\Desktop\\icon\\icons8-coffe-cup-48.png");
		hplatcoffeLabel.setIcon(hplatcoffeeIcon);
		hplatcoffeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hplatcoffeLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 18));
		hplatcoffeLabel.setForeground(new Color(253,253,251));
						
//------------------------ thêm thành phần vào FRAME---------------------------				
		contentPane.add(functionPanel);
		contentPane.add(staffView);
	    contentPane.add(productView);
	    contentPane.add(billView);
	    contentPane.add(hplatcoffeLabel);
	    contentPane.add(titlePanel);
	    
	    billView.setVisible(false);
	    productView.setVisible(false);
	    staffView.setVisible(false);
	}
		
//----------------------------------Phần hàm cho Listener-----------------------------	
	// chức năng bấm bảng chức năng tổng
	public void pressHomeLabel() {
//		this.tabbedPane.setSelectedIndex(0);
		this.homeLabel.setBackground(new Color(252, 186, 3));
		this.productsLabel.setBackground(new Color(46,45,41));
		this.staffLabel.setBackground(new Color(46,45,41));
		this.orderLabel.setBackground(new Color(46,45,41));
		
		billView.setVisible(false);
		productView.setVisible(false);
	    staffView.setVisible(false);
	}
	
	public void pressProductsLabel() {
		this.homeLabel.setBackground(new Color(46,45,41));
		this.productsLabel.setBackground(new Color(252, 186, 3));
		this.staffLabel.setBackground(new Color(46,45,41));
		this.orderLabel.setBackground(new Color(46,45,41));
		billView.setVisible(false);
		productView.setVisible(true);
	    staffView.setVisible(false);
	  }

	  public void pressStaffLabel() {
		this.homeLabel.setBackground(new Color(46,45,41));
		this.productsLabel.setBackground(new Color(46,45,41));
		this.staffLabel.setBackground(new Color(252, 186, 3));
		this.orderLabel.setBackground(new Color(46,45,41));
		productView.setVisible(false);
		billView.setVisible(false);
		staffView.setVisible(true);
	    }
		
	public void pressOrderLabel() {
        this.homeLabel.setBackground(new Color(46,45,41));
		this.productsLabel.setBackground(new Color(46,45,41));
		this.staffLabel.setBackground(new Color(46,45,41));
		this.orderLabel.setBackground(new Color(252, 186, 3));
		billView.setVisible(true);
		productView.setVisible(false);
	    staffView.setVisible(false);
	    }
	}
		
	
