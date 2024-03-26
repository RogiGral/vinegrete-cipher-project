package app.gralak;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppFrame extends JFrame {

    private TitleBar titleBar;
    private ButtonPanel btnPanel;
    private JTextArea  codeField, keyField, outputField;
    private CustomGridLayout customGridLayout;
    private JButton encrypt,decrypt,loadFile;

    AppFrame()
    {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleBar = new TitleBar();
        customGridLayout = new CustomGridLayout();

        codeField = new JTextArea ("Enter code here");
        codeField.setLineWrap(true);

        keyField = new JTextArea ("Enter key here");
        keyField.setLineWrap(true);

        outputField = new JTextArea ("Output will appear here");
        outputField.setLineWrap(true);
        outputField.setEditable(false);

        btnPanel = new ButtonPanel();

        customGridLayout.add(codeField);
        customGridLayout.add(keyField);
        customGridLayout.add(outputField);

        this.add(titleBar, BorderLayout.NORTH);
        this.add(customGridLayout,BorderLayout.CENTER);
        this.add(btnPanel,BorderLayout.SOUTH);

        this.setLocationByPlatform(true);
        this.setVisible(true);

        encrypt = btnPanel.getEncrypt();
        decrypt = btnPanel.getDecrypt();
        loadFile = btnPanel.getLoadFile();

        loadFile.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(AppFrame.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    Scanner scanner = new Scanner(selectedFile);
                    StringBuilder content = new StringBuilder();
                    while (scanner.hasNextLine()) {
                        content.append(scanner.nextLine()).append("\n");
                    }
                    codeField.setText(content.toString());
                    scanner.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        encrypt.addActionListener(e -> {
            String code = VigenereLogic.encrypt(codeField.getText(), keyField.getText());
            outputField.setText(code);
        });

        decrypt.addActionListener(e -> {
            String code = VigenereLogic.decrypt(codeField.getText(), keyField.getText());
            outputField.setText(code);
        });
    }
}
