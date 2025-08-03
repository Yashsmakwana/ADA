# 📚 Algorithm-Playground-Java
> A growing collection of bite-sized Java programs that implement, benchmark and micro-optimise classic algorithms — starting with the **Sieve of Eratosthenes**.

![Language](https://img.shields.io/badge/Java-17%2B-blue?logo=java)
![PRs](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)
![License](https://img.shields.io/badge/license-MIT-lightgrey.svg)

---

## 🚀 Quick start

1. Clone the repo

```bash
git clone https://github.com/Yashsmakwana/ADA.git
cd ADA
```
2. Compile

```bash

javac -d out SieveOfEratosthenes.java
```
3. Run (interactive)

```bash

java -cp out SieveOfEratosthenes         # then enter n at the prompt
```
#### (If you place sources under src/, adjust the compile/run commands accordingly, e.g. javac -d out src/*.java)

### 🗺️ Roadmap / TODO
    
     ⃣Switch to BitSet to cut memory by ~32 ×
     ⃣Implement a segmented sieve for n > 1 000 000 000
     ⃣Add an Euler / linear sieve variant
     ⃣Write unit tests using JUnit 5
     ⃣Provide JMH micro-benchmarks
     ⃣Add more algorithms (GCD variants, BFS/DFS, Dijkstra, …)

### Feel free to pick any item, open an issue, or send a PR!
### 🤝 Contributing
    Fork 📌, then create a feature branch 🪄.
    Follow the project’s code style ( google-java-format recommended ).
    PRs must compile cleanly with
```bash

    javac -Xlint:all -Werror …
```
Add or update docstrings / README snippets where relevant.

### All skill levels welcome — this repo exists for learning & fun. 🎈
### ⚖️ License
This project is licensed under the MIT License — see LICENSE for details.
### 🙏 Acknowledgements
#### “Sieve of Eratosthenes” — a 2nd-century BC idea that still rocks.
#### OpenJDK & the HotSpot JIT compiler.
Everyone who submits improvements, benchmarks, or typo fixes — thank you! 🎉
