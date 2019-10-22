package Board;

import javax.swing.*;

public class BoardCreation extends JFrame {
    public BoardCreation(){
        add(new Board());
        setTitle("Chess");
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}