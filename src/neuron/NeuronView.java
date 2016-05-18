package neuron; /**
 * Created by Dominik on 2016-05-06.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeuronView extends JFrame {

    public JPanel panelNeuron;
    public JLabel labelMode;
    public JTextField textField1;
    public JTextField textField2;
    public JTextField textField3;
    public JTextField textField4;
    public JTextField textField5;
    public JTextField textField6;
    public JTextField textField7;
    private JButton workingModeButton;
    private JButton learningModeButton;
    private JButton readPatternSoloButton;
    private JButton readPatternsGroupButton;
    private JButton weightsButton;
    private JButton responseButton;
    private JButton letterButton;
    private JButton learningFactorButton;
    private JButton functionButton;
    private JButton scopeOIRWButton;
    private JButton chartButton;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;

    public NeuronView(){

        workingModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("workingModeButton (super) ");
            }
        });
        learningModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("learningModeButton (super) ");
            }
        });
        readPatternSoloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("readPatternSoloButton (super) ");
            }
        });
        readPatternsGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("readPatternsGroupButton (super) ");
            }
        });
        weightsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("weightsButton (super) ");
            }
        });
        responseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("responseButton (super) ");
            }
        });
        letterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("letterButton (super) ");
            }
        });
        learningFactorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("learningFactorButton (super) ");
            }
        });

        functionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("functionButton (super) ");
            }
        });
        scopeOIRWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("scopeOIRWButton (super) ");
            }
        });
        chartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("chartButton (super) ");
            }
        });

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        workingModeButton.addActionListener(listener);
        learningModeButton.addActionListener(listener);
        readPatternSoloButton.addActionListener(listener);
        readPatternsGroupButton.addActionListener(listener);
        weightsButton.addActionListener(listener);
        responseButton.addActionListener(listener);
        letterButton.addActionListener(listener);
        learningFactorButton.addActionListener(listener);
        functionButton.addActionListener(listener);
        scopeOIRWButton.addActionListener(listener);
        chartButton.addActionListener(listener);
    }

    public void setlearningModeButtonClick(ActionListener actionListener) {
        learningModeButton.addActionListener(actionListener);
    }

    public void setworkingModeButtonClick(ActionListener actionListener) {
        workingModeButton.addActionListener(actionListener);
    }

    public void setResponseButtonClick(ActionListener actionListener) {
        responseButton.addActionListener(actionListener);
    }

    public void setLearningFactorButtonClick(ActionListener actionListener) {
        learningFactorButton.addActionListener(actionListener);
    }

    public void setFunctionButtonClick(ActionListener actionListener) {
        functionButton.addActionListener(actionListener);
    }

    public void setScopeOIRWButtonClick(ActionListener actionListener) {
        scopeOIRWButton.addActionListener(actionListener);
    }

    public void setChartButtonClick(ActionListener actionListener) {
        chartButton.addActionListener(actionListener);
    }

    public void setLetterButtonClick(ActionListener actionListener) {
        letterButton.addActionListener(actionListener);
    }

    public void setReadPatternSoloButtonClick(ActionListener actionListener) {
        readPatternSoloButton.addActionListener(actionListener);
    }

    public void setReadPatternsGroupButtonClick(ActionListener actionListener) {
        readPatternsGroupButton.addActionListener(actionListener);
    }

    public void setWeightsButtonClick(ActionListener actionListener) {
        weightsButton.addActionListener(actionListener);
    }

    public void updateLabel(JLabel l, String s){
        l.setText(s);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
