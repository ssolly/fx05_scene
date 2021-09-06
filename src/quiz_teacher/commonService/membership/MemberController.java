package quiz_teacher.commonService.membership;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import quiz_teacher.Member;
import quiz_teacher.commonService.CommonService;
import quiz_teacher.commonService.CommonServiceImpl;

public class MemberController implements Initializable {

	Parent root;
	MembershipService ms;

	
	public void setRoot(Parent root) {
		this.root = root;
		ms.setRoot(root);
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MembershipServiceImpl();
		
	}
	
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if (cmbAge != null) {
			cmbAge.getItems().addAll("10대","20대","30대","40대 이상");
		}
	}
	
	public void membershipProc() {
		System.out.println("회원가입 클릭");
		ms.membershipProc();
	}
	
	public void membershipCancle() {
		System.out.println("취소");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.WindowClose();
	}
}
