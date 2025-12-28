# Java Programming Masterclass (2024) – Exercises

This repository contains my personal solutions and practice exercises completed while taking the **Java Programming Masterclass (updated for 2024)** course.  
The goal is to track progress, revisit concepts quickly, and keep a clean history of code changes.

## Repository structure
The project is typically organized by sections/chapters, for example:
- `section-01-basics/`
- `section-02-control-flow/`
- `challenges/`
- `notes/` (optional)

> Note: The exact structure may evolve as the course progresses.

## Requirements
- JDK installed (recommended: Java 17, as used in the course).
- IntelliJ IDEA (or any Java IDE).
- Git (to commit and push changes).

## How to run locally
1. Open the project in IntelliJ (`File -> Open`).
2. Set the Project SDK to your installed JDK.
3. Run the class required by the exercise (where a `main` method exists) or run tests if the project includes them.

## How to push updates to GitHub
If the repo is already linked to GitHub, the usual workflow is:
```bash
git add .
git commit -m "Solve: <exercise-name>"
git push
```
These are the standard steps for adding local code and pushing it to a remote repository.

## Recommended .gitignore (IntelliJ/Java)
In general, generated IDE/build files should not be committed. Common examples to ignore:
- `.idea/`
- `*.iml`
- `out/` or `target/` (depending on your setup)

It's commonly recommended to exclude IntelliJ project metadata (especially `.idea`) from version control.

## Disclaimer
These solutions are for learning purposes and may not always represent the best possible implementation at every stage—progress and understanding come first.