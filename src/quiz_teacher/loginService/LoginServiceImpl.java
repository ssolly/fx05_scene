package quiz_teacher.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import quiz_teacher.commonService.CommonService;
import quiz_teacher.commonService.CommonServiceImpl;

public class LoginServiceImpl implements LoginService {

	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void loginCheck() {
		System.out.println("로그인 체크");
		TextField tf = (TextField)root.lookup("#fxId");
		PasswordField pf = (PasswordField)root.lookup("#fxPwd");
		
		System.out.println(tf.getText());
		System.out.println(pf.getText());
	}

	@Override
	public void loginClose() {
		System.out.println("화면 닫기");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.WindowClose();
		
	}

	
	

}
