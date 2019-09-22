# Echo

In this project, you will test your understanding of the following:
- Using npm to initialize a Node.js project
- npm packages
- Loops
- Reading user input

## Prerequisites

[Hello world](hello_world.md)

## Instructions

1. Make sure that you have Node.js and VSCode installed on your laptop. If you completed the prerequisites, then you should have these tools.

1. Create a new folder on your laptop called `echo`. Run the command `npm init` in this folder. This command initializes a new Node.js project in the project. Answer the prompts from this command. For most of the questions, you can just press `Enter` to accept the default answer.

1. Open VSCode in this folder and then create a new file called `index.js`.

1. Implement the following logic in `index.js`. Look for hints at the bottom on how to do this.

   - You will run your program by typing `node index.js` on command line.
   - The program should ask `Enter a prompt: ` and wait for user's input.
   - User can enter any text for the prompt and press `<Enter>`.
   - The program should echo the user's input.
   - The program should again ask `Enter a prompt: ` and repeat the above steps until the user's prompt is `Exit`.

1. Here is a sample interaction with the program:

   ```cmd
   D:\5190\test> node index.js
   Enter a prompt: Hello, how are you?
   You entered: Hello, how are you?
   Enter a prompt: Welcome to team 5190
   You entered: Welcome to team 5190
   Enter a prompt: Exit
   You entered: Exit
   D:\5190\test>

   ```

1. Come and show off your work!

## Hints

1. When coding in JavaScript, you will be using packages written by others quite often. You will install these packages by running `npm install <packagename>` in your project folder. Watch a tutorial on JavaScript packages and npm.

1. You will need a package called `readline-sync` in order to take user input. Once you install this package, you can use the package by adding the following line at the top of your `index.js` file.

   `const readline = require('readline-sync');`

1. You can then take user input as follows:

   `var prompt = readline.question('Enter a prompt: ');`

