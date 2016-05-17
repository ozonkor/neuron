package neuron; /**
 * Created by Dominik on 2016-05-06.
 */

import javax.swing.*;
import java.awt.event.ActionListener;

public class NeuronView extends JFrame {

    private JButton buttonLearningMode;
    public JPanel panelNeuron;
    private JButton buttonWorkingMode;
    public JLabel labelMode;
    private JButton readPatternSoloButton;
    private JButton readPatternsGroupButton;
    private JTextField textField1;
    private JButton wagaButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton wymuszenieButton;
    private JButton literaButton;
    private JButton współczynnikaUczeniaButton;
    private JButton współczynnikKształtuButton;
    private JButton WagiPoczątkoweButton;
    private JButton współczynnikBłęduButton;
    private JTextField textField7;

    public NeuronView(){

    }

    public void setButtonLearningModeClick(ActionListener actionListener) {
        buttonLearningMode.addActionListener(actionListener);
    }

    public void setButtonWorkingModeClick(ActionListener actionListener) {
        buttonWorkingMode.addActionListener(actionListener);
    }

    public void setWymuszenieButtonClick(ActionListener actionListener) {
        wymuszenieButton.addActionListener(actionListener);
    }

    public void setWspółczynnikaUczeniaButtonClick(ActionListener actionListener) {
        współczynnikaUczeniaButton.addActionListener(actionListener);
    }

    public void setWspółczynnikKształtuButtonClick(ActionListener actionListener) {
        współczynnikKształtuButton.addActionListener(actionListener);
    }

    public void setWagiPoczątkoweButtonClick(ActionListener actionListener) {
        WagiPoczątkoweButton.addActionListener(actionListener);
    }

    public void setWspółczynnikBłęduButtonClick(ActionListener actionListener) {
        współczynnikBłęduButton.addActionListener(actionListener);
    }

    public void setLiteraButtonClick(ActionListener actionListener) {
        literaButton.addActionListener(actionListener);
    }





    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
