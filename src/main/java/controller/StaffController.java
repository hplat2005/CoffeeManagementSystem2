package controller;

import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener;
import view.StaffView;
public class StaffController implements MouseListener{
StaffView staffView;
public StaffController(StaffView staffView) {
	this.staffView = staffView;
}
	@Override
	public void mouseClicked(MouseEvent e) {
		Object src = e.getSource();
		if(src == staffView.table ) {
			staffView.clickTable();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Object src = e.getSource();
		if(src == staffView.addLabel) {
			staffView.pressAddLabel();
		}else if(src == staffView.deleteLabel) {
			staffView.pressDeleteLabel();
		}else if(src == staffView.updateLabel) {
			staffView.pressUpdateLabel();
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
