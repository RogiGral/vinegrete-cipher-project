package app.gralak;

import java.awt.*;
import javax.swing.*;

public class CustomGridLayout extends JPanel{

    public CustomGridLayout() {
        GridLayout layout = new GridLayout(3,1);
        layout.setVgap(5);
        this.setLayout(layout);
    }
}
