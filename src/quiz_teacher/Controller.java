package quiz_teacher;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz_teacher.commonService.membership.MemberProc;
import quiz_teacher.loginService.LoginService;
import quiz_teacher.loginService.LoginServiceImpl;

public class Controller implements Initializable {

	Parent root;
	MemberProc mp;
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
		ls.setRoot(root);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp = new MemberProc();
		ls = new LoginServiceImpl();
	}
	
	public void LoginProc() {
		ls.loginCheck();
	}
	
	public void CancelProc() {
		ls.loginClose();
	}
	
	public void OpenMembershipForm() {
		mp.memberShip();
	}

	
}
