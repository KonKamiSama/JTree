package run;
import model.*;
import view.*;
import controller.*;
import javax.swing.*;


public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            View view = new View();
            new Controller(model, view);
            view.getFrame().setVisible(true);
        });
    }
}
