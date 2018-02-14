package kalkulatorBmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private TextField wagaText;
    @FXML
    private TextField wzrostText;
    @FXML
    private Label label2;

    @FXML
    public void licz(){
        double bmi = 0;
        int bmi2=0;
        double waga=0;
        double wzrost=0;
        label2.setText("");
        try {
            waga = Double.parseDouble(wagaText.getText());
            wzrost = Double.parseDouble(wzrostText.getText());

            if (waga > 0 && wzrost > 0) {
                bmi = (waga / (wzrost * wzrost))*100;
                bmi2 = (int) bmi;
                bmi =(double) bmi2;
                label.setText("Twoje BMI wynosi: " + bmi/100);
            } else {
                label.setText("Podałeś złe wartości!");
            }
        }catch(Exception e)
        {
            label2.setText("Użyj kropek zamiast przecinków!");
            label.setText("Podałeś złe wartości!");
        }
    }
}
