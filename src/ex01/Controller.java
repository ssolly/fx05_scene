package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

public class Controller implements Initializable {

	private Parent root;

	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void viewProc() {
		System.out.println("확인버튼 클릭");
		boolean gender = getGender();
		int hobby = getHobby();
		String age = getComboBox();
		System.out.println(gender);
		System.out.println(hobby);
		System.out.println(age);
		
	}

	public boolean getGender() {	//true:남성, false:여성
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		if (rdoMan.isSelected() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getHobby() {
		int hobby=0;
		CheckBox music = (CheckBox)root.lookup("#chkMusic");
		CheckBox sport = (CheckBox)root.lookup("#chkSport");
		CheckBox movie = (CheckBox)root.lookup("#chkMovie");
		
		if (music.isSelected()) {
			hobby += 1;
		} 
		if (sport.isSelected()) {
			hobby += 2;
		}
		if (movie.isSelected()) {
			hobby += 4;
		}
		/*
		 hobby에 1이 들어와 있으면 음악 선택
		 hobby에 3이 들어와있으면 음악과 스포츠
		 hobby에 6이 들어와 있으면 스포츠,영화 선택
		 */
		return hobby;
	}
	
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if (cmbAge != null) {
			cmbAge.getItems().addAll("10대","20대","30대","40대 이상");
		}
	}
	
	public String getComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		/*
		//nullpointExcepion 발생 시 어디서 null이 떳는지 확인해보는 작업
		System.out.println("cmbAge : " + cmbAge);
		System.out.println("cmbAge.value : " + cmbAge.getValue());
		*/
		
		String age = null;	//사용자가 선택한 값을 얻어올 수 있음
		if (cmbAge.getValue()==null) {
			System.out.println("콤보박스를 선택해주세요");
		} else {
			age = cmbAge.getValue().toString();
		}
		return age;
	}
}
