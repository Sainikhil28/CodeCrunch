# 📦 CodeCrunch: Building a Huffman-Based Compression-Decompression Utility with GUI Support

**CodeCrunch** is a Java-based desktop application that allows users to compress and decompress files using the Huffman Coding algorithm. Designed with a user-friendly GUI built using `Swing`, this tool provides an intuitive interface for file selection, compression, and decompression operations — making data handling more efficient and secure.

---
![Code Crunch](https://github.com/user-attachments/assets/7958791c-3f95-4241-8068-b607d48e3de2)


## 🚀 Features

- 📁 Compress any text-based file using Huffman Coding.
- 🔓 Decompress previously compressed `.huff` files to restore original data.
- 🖥️ GUI interface with file chooser for easy navigation.
- 🧠 Demonstrates core **Data Structures & Algorithms (DSA)** concepts.
- 🛠️ Built completely in Java with no external dependencies.

---

## 🧠 DSA Concepts Used

- **Greedy Algorithms**: Huffman Coding is a classic example of a greedy algorithm, optimizing file size reduction.
- **Priority Queue / Min-Heap**: Used to build the Huffman Tree by selecting the two nodes with the smallest frequency.
- **Binary Trees**: Huffman Tree is a binary tree structure where characters are represented by paths from the root.
- **HashMaps**: Used to store frequency counts and character-to-code mappings.
- **Recursion**: Tree traversal for encoding and decoding.

---

## 🛠️ How It Works

1. **Compression Process**:
   - Reads the input file and calculates the frequency of each character.
   - Builds a Huffman Tree using a priority queue.
   - Generates Huffman codes for each character based on tree paths.
   - Encodes the data and writes it along with tree metadata into a `.huff` file.

2. **Decompression Process**:
   - Reads the `.huff` file, reconstructs the Huffman Tree from metadata.
   - Decodes the binary stream using the Huffman Tree to recover original data.

---

## 🖼️ GUI Snapshot

> The application provides a minimalistic GUI with input/output file selectors and buttons for compression and decompression — making the process beginner-friendly and efficient.
> <img width="959" alt="image" src="https://github.com/user-attachments/assets/0907086e-fdb2-484c-b210-fec3b5391624" />


---

## 📂 File Structure

Huffman_Compresso/
- 1.HuffmanNode.java # Node structure for Huffman Tree
- 2.HuffmanTree.java # Tree builder and traversal logic
- 3.HuffmanCompressor.java # Compression logic
- 4.HuffmanDecompressor.java # Decompression logic
- 5.MainUI.java # GUI logic using Java Swing
- input.txt / output.huff # Sample input and generated output files


---

## 🔐 License

This project is licensed under the **MIT License**.

MIT License

Copyright (c) 2025

Permission is hereby granted, free of charge, to any person obtaining a copy of this software
and associated documentation files (the "Software"), to deal in the Software without restriction,
including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions...


## 📫 Contact

- GitHub: [Sainikhil28](https://github.com/Sainikhil28)

- ## 🧪 Future Enhancements

- Add encryption layer after compression for extra security.
- Support image or binary file compression.
- Add visualization of the Huffman Tree in the UI.

---

> **CodeCrunch** — Crunch your files, not your time!
