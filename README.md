# Practice Whiteboard Coding with Java and Kotlin

### Books to practice

- Learn: Data Structures and Algorithms in Java and Algorithms 4th Edition by Sedgewick and Wayne.

- Practice: Cracking the Coding Interview by Gayle Laakmann McDowell.

- With Kotlin: Learn syntax from LeetCode

### Big-O Notation
- Revise: Cracking the Coding Interview - Big O
- Big O in academics:
    - O (Big O): upper bound of the time complexity of the algorithm. O(n) but can be O(n^2) or O(n!)
    - Ω (Big omega): lower bound of the time complexity of the algorithm. Ω(n) but can be Ω(logn) or Ω(1)
    - θ (Big theta): average time complexity of the algorithm. θ(n) = O(n) + Ω(n)
- Best, Worst and Expected Case
- Note for reading source code: have enough deep analysis.
### Arrays and Strings
- Theories:
    - Hash Tables (Separate Chaining and Open Addressing)
    - ArrayList (dynamic array)
    - StringBuilder
- Exercises:
    - [x] Is Unique: Answer: use HashSet or bit vector if cannot use data structures
    - [x] Check Permutation: Check two hashmaps
    - [x] URLify: Inplace edit on string (trivial)
### Linked Lists 
- Theories:
    - Singly Linked List
    - Doubly Linked List
    - Circular Linked List
- Techinques:
    - **The "Runner" Technique**
    - **Recursion**
- Exercises:
    - [x] Remove Duplicates in unsorted linked list (doing)
    - [x] Return Kth to Last: Return the value of the node at the kth to last position in a singly linked list
    - [x] Delete Middle Node: Delete the middle node of a singly linked list, if there are even number of nodes, delete the node after the middle node (doing)
### Stacks and Queues
- Theories (use Generics from Java):
    - Stack: LIFO
    - Queue: FIFO
- Exercises:
    - [x] Queue via Stacks: Implement a queue using two stacks (**Leetcode**)
    - [x] Evaluate RPN (**Leetcode**)
    - [x] Longest Valid Parentheses (**Leetcode**)
### Trees (very large)
- Terms:
    - Complete, Full, Perfect, Balanced Binary Tree
- Data structures:
    - Binary Tree
    - Binary Search Tree
    - Heaps (Min-Heaps and Max-Heaps)
    - Tries
    - Optional but need to know:
        - AVL Tree
        - N-ary Trees
        - Red-Black Tree
- Algorithms:
    - CRUD operations
    - BST: 
        - Traversals:
            - [x] Preorder: N - L - R
            - [x] Inorder: L - N - R
            - [x] Postorder: L - R - N. **Note: Observe that Postorder traversal is an inverse Preorder traversal**
            - [x] Breadth-First Search
        - [x] Seralize and Deserialize a Binary Tree
        - [ ] Least Common Ancestor
        - [ ] Create Tree from 2 types of Traversals
    - Heaps:
        - [ ] Implement Heaps
        - [ ] Relative Ranks
        - [ ] Longest Happy String
        - [ ] Merge K Sorted Lists
    - Trie:
        - [ ] Implement Trie
        - [ ] Recommendation System
        - [ ] Replace words
        - [ ] Camelcase Matching
### Graphs (very large)
### Bit manipulation
### Recursion
### Dynamic Programming
### Sorting and Searching