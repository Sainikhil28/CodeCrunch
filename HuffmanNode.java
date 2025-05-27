import java.io.Serializable;

public class HuffmanNode implements Serializable {
    char ch;
    int freq;
    HuffmanNode left, right;

    public HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public HuffmanNode(int freq, HuffmanNode left, HuffmanNode right) {
        this.ch = '\0'; // internal node
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }
}
