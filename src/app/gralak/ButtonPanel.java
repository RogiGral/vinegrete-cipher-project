package app.gralak;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{

    private JButton encrypt,loadFile,decrypt;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));

        encrypt = new JButton("Encrypt");
        encrypt.setBorder(emptyBorder);
        encrypt.setFont(new Font("Sans-serif",Font.PLAIN,20));

        decrypt = new JButton("Decrypt");
        decrypt.setBorder(emptyBorder);
        decrypt.setFont(new Font("Sans-serif",Font.PLAIN,20));

        loadFile = new JButton("Load File");
        loadFile.setBorder(emptyBorder);
        loadFile.setFont(new Font("Sans-serif",Font.PLAIN,20));

        this.add(encrypt);
        this.add(Box.createHorizontalStrut(20));
        this.add(decrypt);
        this.add(Box.createHorizontalStrut(20));
        this.add(loadFile);
    }

    public JButton getEncrypt(){
        return encrypt;
    }

    public JButton getDecrypt(){
        return decrypt;
    }
    public JButton getLoadFile(){
        return loadFile;
    }
}
