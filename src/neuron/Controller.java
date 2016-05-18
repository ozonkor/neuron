package neuron;

import neuron.model.LearningMode;
import neuron.model.Neuron;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dominik on 2016-05-06.
 */

public class Controller {
    private static enum Mode {
        LearningMode, WorkingMode;
    }

    private Mode mode;
    private NeuronView neuronView;

    public Controller(NeuronView view){
        neuronView = view;
        mode = Mode.LearningMode;
        view.labelMode.setText(mode.toString());

        ActionListener learningModeButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("learningModeButton clicked");
                mode = Mode.LearningMode;
                changeMode(mode);
            }
        };

        ActionListener workingModeButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("workingModeButton clicked");
                mode = Mode.WorkingMode;
                changeMode(mode);
            }
        };

        ActionListener readPatternSoloButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("readPatternSoloButton clicked");
            }
        };

        ActionListener ReadPatternsGroupButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ReadPatternsGroupButton clicked");
            }
        };

        ActionListener weightsButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("weightsButtonButton clicked");
                neuronView.label1.setText(neuronView.textField1.getText());
            }
        };

        ActionListener responseButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("responseButtonButton clicked");
                neuronView.label2.setText(neuronView.textField2.getText());
            }
        };

        ActionListener letterButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("letterButtonButton clicked");
                neuronView.label3.setText(neuronView.textField3.getText());
            }
        };

        ActionListener learningFactorButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("learningFactorButtonButton clicked");
                neuronView.label4.setText(neuronView.textField4.getText());
            }
        };

        ActionListener functionButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("functionButtonButton clicked");
                neuronView.label5.setText(neuronView.textField5.getText());
            }
        };

        ActionListener scopeOIRWButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("scopeOIRWButtonButton clicked");
                neuronView.label6.setText(neuronView.textField6.getText());
            }
        };

        ActionListener chartButtonButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("chartButtonButton clicked");
                neuronView.label7.setText(neuronView.textField7.getText());
            }
        };

        neuronView.setlearningModeButtonClick(learningModeButton);
        neuronView.setworkingModeButtonClick(workingModeButton);
        neuronView.setReadPatternSoloButtonClick(readPatternSoloButton);
        neuronView.setReadPatternsGroupButtonClick(ReadPatternsGroupButton);
        neuronView.setWeightsButtonClick(weightsButtonButton);
        neuronView.setResponseButtonClick(responseButtonButton);
        neuronView.setLetterButtonClick(letterButtonButton);
        neuronView.setLearningFactorButtonClick(learningFactorButtonButton);
        neuronView.setFunctionButtonClick(functionButtonButton);
        neuronView.setScopeOIRWButtonClick(scopeOIRWButtonButton);
        neuronView.setChartButtonClick(chartButtonButton);

    }

    private void changeMode(Mode mode){
        neuronView.labelMode.setText(mode.toString());
    }





}
