package neuron;

import javax.swing.*;

/**
 * Created by Dominik on 2016-05-06.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("NEURON");
        JFrame jFrame = new JFrame("Watch");

        NeuronView watchView = new NeuronView();
        jFrame.setContentPane(watchView.panelNeuron);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        System.out.println("NEURON2");
        Controller controller = new Controller(watchView);

    }
}
