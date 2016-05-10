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

    public NeuronView(){

    }

    public void setButtonLearningModeClick(ActionListener actionListener) {
        buttonLearningMode.addActionListener(actionListener);
    }

    public void setButtonWorkingModeClick(ActionListener actionListener) {
        buttonWorkingMode.addActionListener(actionListener);
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
