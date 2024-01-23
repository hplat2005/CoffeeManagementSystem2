package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.ProductView;


public class ProductController implements MouseListener {
	ProductView productView;
	public ProductController(ProductView productView) {
		this.productView = productView;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Object src = e.getSource();
		if(src == productView.table) {
			productView.pressTable();
		}
		
		
	}
 
	@Override
	public void mousePressed(MouseEvent e) {
		Object src = e.getSource();
		if(src == productView.addLabel) {
			productView.pressAddLabel();
		}else if(src == productView.deleteLabel) {
			productView.pressDeleteLabel();
		}else if(src == productView.updateLabel) {
			productView.pressUpdateLabel();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
