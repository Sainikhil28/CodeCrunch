import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HuffmanCompressor {

    public static void compress(String inputFilePath, String outputFilePath) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(inputFilePath)));

        // Frequency calculation
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Build Huffman Tree and encode
        HuffmanTree tree = new HuffmanTree(freqMap);
        String encoded = tree.encode(text);

        // Write frequency map and encoded data to file for decompression
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFilePath))) {
            out.writeObject(freqMap);
            out.writeObject(encoded);
        }

        System.out.println("Compression complete. Compressed file saved as: " + outputFilePath);
    }
}
