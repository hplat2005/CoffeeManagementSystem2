package controller;


import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.BillView;


public class BillController implements MouseListener{
BillView billView;
public BillController(BillView billView) {
	this.billView = billView;
}
	
	@Override 
	public void mouseClicked(MouseEvent e) {
		Object src = e.getSource();
		if(src == billView.cashText) {
			billView.clickCashText();
		}else if(src == billView.quantityText) {
			billView.clickQuantityText();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Object src = e.getSource();
		if(src == billView.searchLabel) {
			billView.pressSearch();			
		}else if(src == billView.calculateLabel) {
			billView.pressCalculate();
		}else if(src == billView.printLabel) {
			billView.pressPrint();
		}else if(src == billView.addLabel) {
			billView.pressAdd();
		}else if(src == billView.dedutionLabel) {
			billView.pressDedutionLabel();
		}else if(src == billView.resetLabel) {
			billView.pressReset();
		}else if(src == billView.showLabel) {
			billView.pressShow();
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
	
