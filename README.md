# 📚 Algorithm-Playground-Java
> A growing collection of bite-sized Java programs that implement, benchmark and micro-optimise classic algorithms — starting with the Sieve of Eratosthenes.

![Language](https://img.shields.io/badge/Java-17%2B-blue?logo=java)
![PRs](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)
![License](https://img.shields.io/badge/license-MIT-lightgrey.svg)

---

## 🚀 Quick start


Clone the repo
```bash
git clone https://github.com/Yashsmakwana/ADA.git
cd ADA
```
Compile
```bash
javac -d out SieveOfEratosthenes.java
```
Run (interactive)
```bash
java -cp out SieveOfEratosthenes                # then enter n at the prompt
```

🗺️ Roadmap / TODO

    Switch to BitSet to cut memory by ~32×
    Segmented sieve for n > 1e9
    Euler (linear) sieve variant
    Unit tests with JUnit 5
    JMH micro-benchmarks
    Add more algorithms (GCD variants, BFS/DFS, Dijkstra, …)

Feel free to pick one, open an issue or send a PR!
🤝 Contributing

    Fork 📌, create a branch 🪄.
    Follow the project’s code style (google-java-format recommended).
    PRs must pass javac with -Xlint:all ‑Werror.
    Add a brief docstring or README snippet ↗️.

All skill levels welcome — this repo exists for learning & fun.
⚖️ License

This project is licensed under the MIT License — see LICENSE for details.
🙏 Acknowledgements

    “Sieve of Eratosthenes” — literally a 2nd-century BC idea that still rocks.
    OpenJDK & the HotSpot JIT.
    Everyone who submits improvements, benchmarks or typo fixes — thank you! 🎉
