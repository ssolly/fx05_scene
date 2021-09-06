package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable {

	private Parent root;

	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void viewProc() {
		System.out.println("확인버튼 클릭");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
