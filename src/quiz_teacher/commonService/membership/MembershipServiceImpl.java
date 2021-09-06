package quiz_teacher.commonService.membership;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import quiz_teacher.Member;
import quiz_teacher.commonService.CommonService;
import quiz_teacher.commonService.CommonServiceImpl;

public class MembershipServiceImpl implements MembershipService {

	Parent root;
	
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if (cmbAge!=null) {
			cmbAge.getItems().addAll("10대 미만","10대","20대","30대","40대 이상");
		}
	}
	
	public void check() {
		TextField tx = (TextField)root.lookup("#fxName");
		PasswordField pf = (PasswordField)root.lookup("#fxPw");
		if(tx.getText().isEmpty()) {
			alertMethod("이름은 필수 항목입니다");
			tx.requestFocus();
		} else if (pf.getText().isEmpty()) {
			alertMethod("비밀번호는 필수 항목입니다");
			pf.requestFocus();
		}
	}
	
	public void alertMethod(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
	
	public String getComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		String age = null;
		if(cmbAge.getValue()==null) {
			System.out.println("콤보박스를 선택해주세요");
		} else {
			age = cmbAge.getValue().toString();
		}
		return age;
	}
	
	public boolean getGender() {
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		if (rdoMan.isSelected()) {
			return true;
		} else {
			return false;
		}
	}
	

	@Override
	public void setRoot(Parent root) {
		this.root=root;
		addComboBox();
	}

	@Override
	public void membershipProc() {
		Member dto = new Member();
		check();
		
		dto.setName(((TextField)root.lookup("#fxName")).getText());
		dto.setAge(getComboBox());
		dto.setGender(getGender());
	}

	@Override
	public void memberCancle() {
		System.out.println("취소 클릭");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.WindowClose();
	}




}
