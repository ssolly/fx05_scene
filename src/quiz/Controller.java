package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz.loginService.LoginService;
import quiz.loginService.LoginServiceImpl;

public class Controller implements Initializable {

	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}
	
	public void LoginProc() {
		
		LoginService ls = new LoginServiceImpl();
		ls.LoginProc(root);
	}
	
	public void CancelProc() {
		
		LoginService ls = new LoginServiceImpl();
		ls.CancelProc(root);
		
	}
	
	public void OpenMembershipForm() {
		
		LoginService ls = new LoginServiceImpl();
		ls.OpenMembershipForm();
		
	}

	
}
