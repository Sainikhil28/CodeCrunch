import java.io.*;
import java.util.*;

public class HuffmanDecompressor {

    public static void decompress(String inputFilePath, String outputFilePath)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(inputFilePath))) {
            Map<Character, Integer> freqMap = (Map<Character, Integer>) in.readObject();
            String encoded = (String) in.readObject();

            HuffmanTree tree = new HuffmanTree(freqMap);
            String decoded = tree.decode(encoded);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write(decoded);
            }

            System.out.println("Decompression complete. Decompressed file saved as: " + outputFilePath);
        }
    }
}
