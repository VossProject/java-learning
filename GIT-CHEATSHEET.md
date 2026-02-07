# Git Cheat Sheet

## First-Time Setup (already done)
```bash
git config --global user.name "Your Name"
git config --global user.email "your@email.com"
git config --global init.defaultBranch main
```

## Starting a New Exercise

```bash
# 1. Make sure you're on main and up to date
git checkout main
git pull

# 2. Create a new branch for your work
git checkout -b feature/topic-name
```

## While Working (repeat as needed)

```bash
# See what's changed
git status                         # which files changed
git diff                           # what changed inside them

# Save your progress
git add MyFile.java                # stage specific file
git commit -m "feat: describe what you did"

# Push to GitHub
git push -u origin feature/topic-name   # first time only
git push                                 # after that
```

## When Done — Direct Merge (solo work)

```bash
git checkout main                  # switch to main
git merge feature/topic-name       # merge your work in
git push                           # push to GitHub
git branch -d feature/topic-name   # clean up branch
```

## When Done — Pull Request (professional way)

```bash
git push -u origin feature/topic-name               # push branch
gh pr create --title "feat: what I did" --body "description"   # open PR
gh pr merge --merge --delete-branch                  # merge + clean remote
git checkout main                                    # switch to main
git pull                                             # get merged changes
git branch -d feature/topic-name                     # clean local branch
```

## If Push Is Rejected

```bash
git pull --rebase origin main      # pull remote changes, replay yours on top
git push                           # try again
```

## Commit Message Format

```
type: short description (imperative mood, no period)
```

| Type       | When                          | Example                                    |
|------------|-------------------------------|--------------------------------------------|
| `feat`     | New code/functionality        | `feat: add bubble sort implementation`     |
| `fix`      | Bug fix                       | `fix: correct off-by-one error in search`  |
| `refactor` | Restructure, same behavior    | `refactor: extract helper method`          |
| `test`     | Adding/updating tests         | `test: add unit tests for Calculator`      |
| `docs`     | Documentation only            | `docs: update README progress table`       |
| `chore`    | Setup, config, maintenance    | `chore: update .gitignore`                 |

## Branch Naming

```
type/short-description    (all lowercase, hyphens between words)
```

| Type           | Example                              |
|----------------|--------------------------------------|
| `feature/`     | `feature/variables-exercises`        |
| `fix/`         | `fix/array-index-error`              |
| `refactor/`    | `refactor/extract-helper-methods`    |
| `experiment/`  | `experiment/streams-api`             |

## Useful Commands

```bash
git status              # what's going on?
git log --oneline       # see commit history (compact)
git branch              # list branches (* = current)
git diff                # unstaged changes
git diff --staged       # staged changes (about to commit)
gh pr list              # see open pull requests
gh pr view              # view current PR details
```
