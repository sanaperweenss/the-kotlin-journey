# 🎯 Kotlin Learning Journey
**From Beginner to Mastery**  
Built by **You** — Goal: Master Kotlin fundamentals and build awesome projects.

---

## 🧠 Mission
To build a strong foundation in Kotlin programming, understand core concepts, and create real-world applications while documenting the entire journey.

---

## 📚 Learning Topics
| Topic | Focus | Status |
|-------|-------|--------|
| **Variables & Data Types** | Basics | ✔️ |
| **Functions & Lambdas** | Core Concepts | ⬜️ |
| **Object-Oriented Programming** | Classes & Inheritance | ⬜️ |
| **Collections** | Lists, Maps, Sets | ⬜️ |
| **Coroutines** | Async Programming | ⬜️ |
| **Project: Build Something Cool** | Real-world App | ⬜️ |

---

## 📅 Progress Tracker
| Day | Topic | Status |
|-----|-------|--------|
| 1 | Hello Kotlin - Setup & First Program | ⏳ Next Up |
| 2 | Variables, Val vs Var | ⬜️ |
| 3 | Data Types & Type Inference | ⬜️ |
| 4 | Functions & Return Types | ⬜️ |
| 5 | Null Safety & Elvis Operator | ⬜️ |
| 6 | Collections (Lists, Maps) | ⬜️ |
| 7 | Classes & Objects | ⬜️ |
| 8 | Inheritance & Polymorphism | ⬜️ |
| 9 | Lambdas & Higher-Order Functions | ⬜️ |
| 10 | First Mini Project | ⬜️ |

---

## 🧩 Code Showcase

### Simple Function
```kotlin
fun greet(name: String): String {
    return "Hello, $name! Welcome to Kotlin 🚀"
}

fun main() {
    println(greet("Bro"))
}
```

### Working with Collections
```kotlin
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers
        .filter { it % 2 == 0 }
        .map { it * 2 }
    println(evenNumbers)  // [4, 8]
}
```

---

## 💡 Key Learnings
- **Kotlin = Safe** — Null safety by default
- **Kotlin = Concise** — Less boilerplate than Java
- **Kotlin = Powerful** — Full OOP + functional programming

---

## 🛠️ Tech Stack
- **Language:** Kotlin
- **Build Tool:** Gradle
- **IDE:** IntelliJ IDEA / VS Code
- **JDK Version:** 11+

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Git
- IntelliJ IDEA or any code editor

### Setup
```bash
# Clone the repo
git clone https://github.com/yourusername/kotlin-journey.git

# Navigate to project
cd kotlin-journey

# Build
./gradlew build

# Run
./gradlew run
```

---

## 📁 Project Structure
```
kotlin-journey/
├── src/
│   ├── main/
│   │   └── kotlin/
│   │       ├── Day1_Basics.kt
│   │       ├── Day2_Functions.kt
│   │       └── Day3_Collections.kt
│   └── test/
│       └── kotlin/
└── README.md
```

---

## 🎓 Resources That Help
- [Kotlin Official Docs](https://kotlinlang.org/docs/)
- [Kotlin Playground](https://play.kotlinlang.org/)
- YouTube tutorials & coding channels

---

## 🤝 Connect
Building in public. Follow the grind!

---

**"Consistency beats perfection. Code every day."** 💪
