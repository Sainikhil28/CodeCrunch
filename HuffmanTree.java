import java.io.Serializable;
import java.util.*;

public class HuffmanTree implements Serializable {
    private HuffmanNode root;
    private Map<Character, String> codes = new HashMap<>();

    public HuffmanTree(Map<Character, Integer> freqMap) {
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.freq));
        for (var entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            pq.add(new HuffmanNode(left.freq + right.freq, left, right));
        }

        root = pq.poll();
        buildCodes(root, "");
    }

    private void buildCodes(HuffmanNode node, String code) {
        if (node == null)
            return;
        if (node.isLeaf()) {
            codes.put(node.ch, code);
        }
        buildCodes(node.left, code + "0");
        buildCodes(node.right, code + "1");
    }

    public Map<Character, String> getCodes() {
        return codes;
    }

    public String encode(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append(codes.get(ch));
        }
        return sb.toString();
    }

    public String decode(String binary) {
        StringBuilder result = new StringBuilder();
        HuffmanNode current = root;
        for (char bit : binary.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;
            if (current.isLeaf()) {
                result.append(current.ch);
                current = root;
            }
        }
        return result.toString();
    }
}
