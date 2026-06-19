<div align="center">

# 🎯 Quizify

### A polished multi-category Android quiz app built with Kotlin & Material Design 3

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![API](https://img.shields.io/badge/Min%20SDK-24%20(Android%207.0)-orange?style=for-the-badge)](https://developer.android.com/about/versions/nougat)
[![Material3](https://img.shields.io/badge/UI-Material%20Design%203-757DE8?style=for-the-badge&logo=materialdesign&logoColor=white)](https://m3.material.io)

</div>

---

## 📱 Overview

**Quizify** is a feature-rich Android quiz application that challenges users across **8 knowledge categories** — from Mathematics and Science to Football, Movies, and World Capitals. The app delivers a smooth, gamified experience with animated progress tracking, a coin-based reward system, and a detailed answer-review mode after each session.

Built as a solo project to demonstrate clean Android architecture, responsive XML layouts, and idiomatic Kotlin development.

---

## ✨ Features

| Feature | Description |
|---|---|
| 🗂️ **8 Quiz Categories** | Math, English, Science, Football, Movies, Capitals, History, Games |
| 📊 **Animated Progress Bar** | Smooth `ValueAnimator`-driven progress updates per question |
| 🪙 **Coin Reward System** | Earn coins based on correct-answer percentage; persisted via `SharedPreferences` |
| 🔍 **Answer Review Mode** | Replay any completed quiz to see correct / wrong / skipped highlights |
| 💬 **Personalized Greeting** | Custom name input on first launch stored locally |
| 🌓 **Dark / Light Mode** | Full Material3 `DayNight` theme support |
| 🎨 **Image-based Questions** | Visual questions with inline images for select categories |
| 🏆 **Performance Rating** | Score-based labels: Amazing · Well done · Good · Not bad |

---

## 🔧 Tech Stack

| Layer | Technology |
|---|---|
| **Language** | Kotlin 2.0.21 |
| **UI Framework** | Android Views + XML Layouts |
| **View Binding** | `ActivityMainBinding`, `ActivityQuizBinding`, `ActivityResultBinding` |
| **UI Components** | RecyclerView, ConstraintLayout, DialogFragment |
| **Animations** | `ValueAnimator` for progress bar transitions |
| **Data Persistence** | `SharedPreferences` (username, coin balance) |
| **Architecture** | Repository pattern with in-memory data sources |
| **Build System** | Gradle Kotlin DSL (`build.gradle.kts`) + Version Catalog |
| **Design System** | Material Design 3 (`Theme.Material3.DayNight.NoActionBar`) |
| **Min SDK** | API 24 (Android 7.0 Nougat) |
| **Target SDK** | API 36 |

---

## 📚 Quiz Categories

| # | Category | Questions | Type |
|---|---|---|---|
| 1 | 🔢 Mathematics | 10 | Text — algebra, percentages, powers |
| 2 | 🔤 English | 10 | Text — vocabulary, grammar |
| 3 | 🔬 Science | 10 | Text + Images — biology, physics, space |
| 4 | ⚽ Football | 10 | Images — clubs, players, trophies |
| 5 | 🎬 Movies | 10 | Images — iconic films and characters |
| 6 | 🌍 World Capitals | 10 | Images — city landmarks |
| 7 | 📜 History | 10 | Images — historical figures and events |
| 8 | 🎮 Games | 10 | Images — popular video games |

> **175+ questions** handcrafted and embedded directly in the repository layer.

---

## 🏅 Scoring System

The app calculates a correctness percentage and awards coins accordingly:

```
Coins earned = correct_answers / total_questions × 100 / 2
```

| Score Range | Label |
|---|---|
| 80 – 100% | 🌟 Amazing |
| 66 – 79% | 👏 Well done |
| 56 – 65% | ✅ Good |
| 40 – 55% | 🤔 Not bad |
| 0 – 39% | ❌ Not good |

Coin totals accumulate across sessions and are displayed on the home screen.

---

## 🚀 Getting Started

### Prerequisites

- Android Studio **Hedgehog** or later
- JDK 11+
- Android device or emulator running API 24+

### Installation

```bash
# 1. Clone the repository
git clone https://github.com/khamidow/Quizify.git

# 2. Open in Android Studio
# File → Open → select the cloned folder

# 3. Let Gradle sync, then run on your device or emulator
```

No API keys, no external services, no internet permission required — the app runs fully offline.

---

## 🎨 UI Design Highlights

- **Custom drawable states** for answer variants: default → selected → correct (green) → wrong (red)
- **Baloo Bhaijaan 2** custom font for a friendly, readable feel
- **Edge-to-edge layout** with `WindowInsetsCompat` for modern Android look
- **Portrait-locked** quiz and result screens for consistent UX
- **Borderless transparent dialog** for first-launch onboarding
- **Material3 DayNight** theme with disabled forced dark mode

---

## 📂 What This Project Demonstrates

- ✅ Clean MVVM-adjacent architecture (Repository pattern)
- ✅ Kotlin data classes with `copy()` for immutable state updates
- ✅ RecyclerView with a custom adapter and lambda-based click callbacks
- ✅ `ValueAnimator` for smooth UI animations
- ✅ `DialogFragment` with a custom result callback interface
- ✅ Intent-based screen navigation with `Serializable` data passing
- ✅ `SharedPreferences` for lightweight local persistence
- ✅ Material3 theming with custom drawables and color states
- ✅ Gradle Kotlin DSL + Version Catalog (`libs.versions.toml`)
- ✅ Edge-to-edge UI with proper inset handling

---

## 👤 Author

**Khamidow**  
Android Developer · Tashkent, Uzbekistan  
[github.com/khamidow](https://github.com/khamidow)

---

<div align="center">

*Built with ❤️ and Kotlin*

</div>
