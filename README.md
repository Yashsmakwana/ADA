# 📚 Algorithm-Playground-Java
> A growing collection of bite-sized Java programs that implement, benchmark and micro-optimise classic algorithms — starting with the **Sieve of Eratosthenes**.

![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)
![Top language](https://img.shields.io/github/languages/top/Yashsmakwana/ADA)
![Lines of code](https://img.shields.io/tokei/lines/github/Yashsmakwana/ADA)
![Last commit](https://img.shields.io/github/last-commit/Yashsmakwana/ADA)
![Open issues](https://img.shields.io/github/issues/Yashsmakwana/ADA)
![PRs open](https://img.shields.io/github/issues-pr/Yashsmakwana/ADA)
![Contributors](https://img.shields.io/github/contributors/Yashsmakwana/ADA)
![Repo size](https://img.shields.io/github/repo-size/Yashsmakwana/ADA)
![Stars](https://img.shields.io/github/stars/Yashsmakwana/ADA?style=social)
![License](https://img.shields.io/github/license/Yashsmakwana/ADA)

---

## 🚀 Quick start

### 1. Clone the repo

```bash
git clone https://github.com/Yashsmakwana/ADA.git
cd ADA
```
### 2. Compile

```bash

javac -d out SieveOfEratosthenes.java
```
### 3. Run (interactive)

```bash

java -cp out SieveOfEratosthenes         # then enter n at the prompt
```
#### (If you place sources under src/, adjust the compile/run commands accordingly, e.g. javac -d out src/*.java)
---
## 🗺️ Roadmap / TODO

<details>
<summary><strong>1️⃣  Optimise existing Sieve (Prime track)</strong></summary>

- [ ] ✅ Baseline version (done)  
- [ ] ♻️ **BitSet / boolean[]** → 8-32 × less RAM  
- [ ] 🚀 **Odd-only storage** (skip even indices)  
- [ ] 🔄 **Wheel factorisation 6k ± 1** (skip multiples of 2 & 3)  
- [ ] 🌱 **Segmented sieve** (O(√n) RAM) – handle n > 1e9  
- [ ] ⚙️ **Parallel segmentation** (ForkJoin / Streams)  
- [ ] 🏎️ **JIT-friendly inner loop** (no bound checks, hoist constants)  
- [ ] 🏆 Compare vs. [primesieve](https://github.com/kimwalisch/primesieve) and document gap
</details>

<details>
<summary><strong>2️⃣  Implement new algorithms (Learning track)</strong></summary>

### Number theory
- [ ] GCD (Euclid, binary GCD)  
- [ ] Modular exponentiation (fast exp)  
- [ ] Miller-Rabin primality test  
- [ ] Euler’s Totient function φ(n) (sieve style)

### Sorting / Searching
- [ ] Quicksort (in-place)  
- [ ] Merge sort (top-down & bottom-up)  
- [ ] Heapsort + priority queue demo  
- [ ] Binary search (iter. & recur.)

### Data Structures
- [ ] Dynamic array vs. Linked list benchmark  
- [ ] Union-Find / Disjoint Set (path compression)  
- [ ] HashMap open-addressing playground

### Graphs
- [ ] BFS & DFS templates  
- [ ] Dijkstra (min-heap)  
- [ ] Topological sort (Kahn)  
- [ ] Minimum spanning tree (Kruskal / Prim)

### Dynamic Programming
- [ ] Fibonacci (memo vs. bottom-up)  
- [ ] Longest Increasing Subsequence (O(n log n))  
- [ ] Knapsack 0/1
  
</details>

<details>
<summary><strong>3️⃣  Tooling / Benchmark track</strong></summary>

- [ ] 📏 Integrate **JMH** micro-benchmarks for each algorithm  
- [ ] 🧪 **JUnit 5** test suite (edge cases & property tests)  
- [ ] 🛠️ **GitHub Actions** CI: compile, test, benchmark smoke run  
- [ ] 📈 Code coverage badge (Codecov)  
- [ ] 🖋️ Apply `google-java-format` via pre-commit hook  
</details>

<details>
<summary><strong>4️⃣  Stretch / Fun ideas</strong></summary>

- [ ] ⏲️ Visualise sieve progress in ASCII / Swing  
- [ ] 🌐 Expose algorithms as REST endpoints (Spring Boot)  
- [ ] 📦 Publish a tiny **Maven Central** library (`algo-playground-core`)  
- [ ] 📚 Write a blog post for each optimisation with graphs  
</details>

---

#### Feel free to pick any item, open an issue, or send a PR!
### 🤝 Contributing
#### Fork 📌, then create a feature branch 🪄.
#### Follow the project’s code style ( google-java-format recommended ).
Add or update docstrings / README snippets where relevant.

### All skill levels welcome — this repo exists for learning & fun. 🎈
### ⚖️ License
This project is licensed under the MIT License — see LICENSE for details.
### 🙏 Acknowledgements
#### “Sieve of Eratosthenes” — a 2nd-century BC idea that still rocks.
#### OpenJDK & the HotSpot JIT compiler.
#### Everyone who submits improvements, benchmarks, or typo fixes — thank you! 🎉
