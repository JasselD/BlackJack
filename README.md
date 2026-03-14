## BlackJack

**Command-line BlackJack in Java — a simple way to play and practice the classic casino game, right in your terminal.**

This repo contains a small but fully playable single‑player BlackJack implementation. You play against a dealer that follows standard rules, make decisions from the keyboard, and see each hand unfold directly in the console.

---

### ✨ What the game includes

- **Core BlackJack rules** — play hands where you can hit, stand, double down, and (when applicable) split.
- **Realistic deck handling** — a standard 52‑card deck with shuffling and random dealing.
- **Score tracking** — automatic calculation of hand values, wins, losses, pushes, and busts.
- **Simple terminal UI** — clear text prompts and updates so you always know the state of the table.
- **Replayable sessions** — quickly finish a round and jump straight into the next one.

---

### 🛠️ Built with

| Layer | Tech |
| --- | --- |
| Language | Java |
| Runtime | JDK 8+ |
| Interface | Command-line / terminal |

---

### ▶️ Running the game

1. **Clone the repo**

```bash
git clone https://github.com/JasselD/BlackJack.git
cd BlackJack
```

2. **Compile**

```bash
javac *.java
```

3. **Play**

```bash
java Blackjack
```

Follow the on‑screen prompts to make your moves each round.

---

### 🧠 How it came together

1. **Defined the rules** — started by writing out the basic BlackJack flow (deal → player actions → dealer actions → result).
2. **Modeled the cards** — created representations for cards, a deck, and hands so values and states stay consistent.
3. **Built the game loop** — wired player input, dealer logic, and win/loss checks into a repeatable round structure.
4. **Polished the CLI** — refined the prompts and output so it’s easy to read what’s happening at every step.

---

### 💡 What this project taught me

- Structuring a small Java project around a clear game loop.
- Managing state for multiple entities (player vs. dealer) over successive rounds.
- Designing a console interface that is readable but still fast and responsive to use.

---

### 🚀 Possible next steps

- **Betting system** — chips, minimum bets, and tracking balance across rounds.
- **Multiple decks / shoe** — more realistic casino play and card distributions.
- **Simple AI tweaks** — experimenting with different dealer behaviors or basic strategy hints.
- **Testing & refactors** — unit tests for scoring, shuffling, and edge‑case hands.

---

*Thanks for checking out this BlackJack project!* 
