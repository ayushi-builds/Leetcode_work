# Repository Guidelines

This repository is a personal, Java-first interview-preparation log. Keep additions focused, readable, and useful for future review. Do not add placeholder or sample problem entries.

## Add a new problem

1. Choose the most relevant existing topic folder. If a problem fits multiple patterns, pick its primary pattern and mention other patterns in the solution notes.
2. Add the Java source file directly in that folder; do not create per-problem subfolders.
3. Use [`templates/SolutionTemplate.java`](templates/SolutionTemplate.java) as the documentation guide. Replace its placeholders with the problem's details and your own implementation.
4. Add a row to [`PROGRESS.md`](PROGRESS.md) with the problem number, exact problem name, topic, difficulty, current status, and a relative link to the Java file.

## Name Java solution files

Use the problem name in PascalCase, omit punctuation, and end the filename with `.java`. For example, `Two-Sum` would be `TwoSum.java`. Keep the primary class name consistent with the filename when the class is public. For LeetCode submissions that require a class named `Solution`, use the required class name and keep the descriptive problem name in the filename and documentation.

## Document approaches

For every problem, record:

- The problem name, LeetCode number, URL, difficulty, and topic or pattern.
- The core idea and enough reasoning to explain why it works.
- Time and auxiliary space complexity, with a brief explanation when it is not obvious.
- A clean Java implementation using clear names and standard conventions.

Write notes in your own words. Prefer concise, specific explanations over copied problem statements or unexplained code.

## Update the progress tracker

Keep one row per problem in [`PROGRESS.md`](PROGRESS.md). Use exactly one of these statuses:

- `Not Started`
- `Attempted`
- `Solved`
- `Needs Revision`

Link the Solution cell to the corresponding Java file using a repository-relative Markdown link. Update the status as your understanding changes. In the README topic-wise tracker, update each topic's solved and total counts to match the corresponding progress rows; count only `Solved` toward the solved total.

## Record mistakes and learnings

Capture useful takeaways in the problem's approach notes: incorrect assumptions, edge cases missed, why an attempt failed, and what pattern or invariant clarified the solution. Keep the notes constructive and actionable so they help during revision. Change the status to `Needs Revision` when the solution or reasoning needs another review.

## Keep the repository scalable

Place solutions in the existing topic folders and avoid unnecessary nesting. If a future study plan introduces a genuinely new topic, add a clearly named topic folder and update the README structure and topic-wise progress table. Keep each problem's study-plan context in its documentation or progress row so plans can share topic folders without duplicating solutions.
