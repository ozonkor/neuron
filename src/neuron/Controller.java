package neuron;

import neuron.model.LearningMode;
import neuron.model.Neuron;

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

    Controller(NeuronView view){
        neuronView = view;
        mode = Mode.LearningMode;
    }



}
