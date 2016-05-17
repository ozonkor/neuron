package neuron;

import neuron.model.LearningMode;
import neuron.model.Neuron;

import javax.sound.midi.SysexMessage;
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

        ActionListener buttonLearningMode = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        ActionListener buttonWorkingMode = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };
        ActionListener literaButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        ActionListener współczynnikaUczeniaButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        ActionListener współczynnikKształtuButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        ActionListener WagiPoczątkoweButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        ActionListener współczynnikBłęduButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        ActionListener readPatternSoloButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };
        ActionListener readPatternsGroupButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };
        ActionListener wagaButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        };

        neuronView.setButtonLearningModeClick(buttonLearningMode);
        neuronView.setButtonWorkingModeClick(buttonWorkingMode);
        neuronView.setLiteraButtonClick(literaButton);
        neuronView.setWspółczynnikaUczeniaButtonClick(współczynnikaUczeniaButton);
        neuronView.setWspółczynnikKształtuButtonClick(współczynnikKształtuButton);
        neuronView.setWagiPoczątkoweButtonClick(WagiPoczątkoweButton);
        neuronView.setWspółczynnikBłęduButtonClick(współczynnikBłęduButton);

    }



}
