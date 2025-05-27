import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MainUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Huffman Compression Tool");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputFile = new JTextField(25);
        JTextField outputFile = new JTextField(25);

        JButton browseInput = new JButton("Browse...");
        JButton browseOutput = new JButton("Browse...");

        JButton compressBtn = new JButton("Compress");
        JButton decompressBtn = new JButton("Decompress");

        // File Chooser Buttons
        browseInput.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                inputFile.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        });

        browseOutput.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
                outputFile.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        });

        compressBtn.addActionListener(e -> {
            try {
                HuffmanCompressor.compress(inputFile.getText(), outputFile.getText());
                JOptionPane.showMessageDialog(frame, "Compression Complete");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });

        decompressBtn.addActionListener(e -> {
            try {
                HuffmanDecompressor.decompress(inputFile.getText(), outputFile.getText());
                JOptionPane.showMessageDialog(frame, "Decompression Complete");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("Input File:"));
        panel.add(inputFile);
        panel.add(new JLabel(""));
        panel.add(browseInput);

        panel.add(new JLabel("Output File:"));
        panel.add(outputFile);
        panel.add(new JLabel(""));
        panel.add(browseOutput);

        panel.add(compressBtn);
        panel.add(decompressBtn);

        frame.add(panel);
        frame.setVisible(true);
    }
}
