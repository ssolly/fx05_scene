package quiz.loginService;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService {

	@Override
	public void LoginProc(Parent root) {
		
		TextField id = (TextField)root.lookup("#fxId");
		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		
		System.out.println("id : " + id.getText());
		System.out.println("pwd : " + pwd.getText());
		System.out.println("로그인 완료");
	}

	@Override
	public void CancelProc(Parent root) {
		
		TextField id = (TextField)root.lookup("#fxId");
		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		
		id.clear();
		pwd.clear();
		System.out.println("취소");
	}

	@Override
	public void OpenMembershipForm() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("회원가입창");
		alert.show();
		
		System.out.println("회원가입 버튼");
		
	}

}
