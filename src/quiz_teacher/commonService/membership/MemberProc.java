package quiz_teacher.commonService.membership;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberProc {

	public void memberShip() {
		System.out.println("회원으로 이동");
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../Membership.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			MemberController ctl = loader.getController();
			ctl.setRoot(root);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("membership");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
