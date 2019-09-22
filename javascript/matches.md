# Matches

In this project, you will test your understanding of the following:
- Reading from a file
- Loops
- Arrays
- Conditions
- JSON

## Prerequisites

[Echo](echo.md)

## Instructions

1. Write a JavaScript program that does the following:

   - You will run your program by typing `node index.js` on command line in your project folder.
   - The program should ask `Enter a file name: ` and wait for user's input.
   - User will enter the name of a file containing a list of matches in JSON format. See below for format of the file.
   - The program should ask `Enter your team: ` and wait for user's input.
   - User will enter the team number.
   - The program should print all the matches that the team plays in.

1. The contents of the file will be structured as JSON. Read up or watch a video on JSON. The following is an example of what you can have in the file.

   ```json
    [
    {
        "alliances": {
        "blue": {
            "team_keys": [
            "frc5511", 
            "frc587", 
            "frc6729"
            ]
        }, 
        "red": {
            "team_keys": [
            "frc1533", 
            "frc5190", 
            "frc4290"
            ]
        }
        }, 
        "comp_level": "f", 
        "event_key": "2019nccmp", 
        "key": "2019nccmp_f1m1", 
        "match_number": 1, 
    }, 
    {
        "alliances": {
        "blue": {
            "team_keys": [
            "frc5511", 
            "frc587", 
            "frc6729"
            ]
        }, 
        "red": {
            "team_keys": [
            "frc1533", 
            "frc5190", 
            "frc4290"
            ]
        }
        }, 
        "comp_level": "f", 
        "event_key": "2019nccmp", 
        "key": "2019nccmp_f1m2", 
        "match_number": 2, 
    }
    ] 
   ```

1. For a complete example of a test file, download [this file](matches_sample.json).

1. Here is a sample interaction with the program:

   ```cmd
   D:\5190\matches> node index.js
   Enter a file name: D:\5190\matches\matches.json
   Enter your team: 5190
   Team 5190 is in the following matches:
   Match 1 (f): 5511 587 6729 | 1533 5190 4290
   Match 2 (f): 5511 587 6729 | 1533 5190 4290
   D:\5190\matches>

   ```

1. Come and show off your work!
