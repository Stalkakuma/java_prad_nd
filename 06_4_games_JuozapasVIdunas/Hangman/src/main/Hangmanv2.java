package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangmanv2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"inheritor", "blade", "television"};
        ArrayList<Character> lettersInPlay = new ArrayList<>();
        String wordInPlay = getRandomWord(words);
        String solution = tempSolution(wordInPlay);
        int missCount = 0;
        String userInput;

        while (true) {
            if (isSolved(solution)) {
                String finalUserInput;
                System.out.println("The word is " + solution + ". You missed " + (missCount == 1 ? missCount + " time"
                        : missCount == 0 ? "no times at all!" : missCount + " times"));
                System.out.println("Do you want to play again? Enter y or n");
                finalUserInput = scanner.nextLine();
                if (finalUserInput.isEmpty()) {
                    continue;
                }
                if (finalUserInput.equals("y")) {
                    missCount = 0;
                    wordInPlay = getRandomWord(words);
                    solution = tempSolution(wordInPlay);
                    lettersInPlay.clear();
                    continue;
                }
                if (finalUserInput.equals("n")) {
                    break;
                }
            }
            System.out.println("(Guess) Enter a letter in word " + solution);
            userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                System.out.println("Cannot be empty!");
                userInput = lettersInPlay.getLast().toString();
            }
            if (checkIfLetterPresent(userInput, lettersInPlay) && !userInput.isEmpty()) {
                lettersInPlay.add(userInput.charAt(0));

            } else {
                System.out.println(userInput + " is already in the word!");
            }
            if (letterHit(wordInPlay, lettersInPlay)) {
                solution = solveWord(wordInPlay, lettersInPlay);
            } else if (!checkIfLetterPresent(userInput, lettersInPlay)) {
                missCount++;
                System.out.println(lettersInPlay.getLast() + " is not in the word!");
            }
        }
    }

    public static boolean isSolved(String solution) {
        char[] tempWord = solution.toCharArray();
        for (Character letter : tempWord) {
            if (letter == '*') {
                return false;
            }
        }
        return true;
    }

    public static String solveWord(String word, ArrayList<Character> letters) {
        char[] tempWord = word.toCharArray();
        boolean isGuessed;
        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < tempWord.length; i++) {
            isGuessed = false;
            for (int k = 0; k < letters.size(); k++) {
                if (tempWord[i] == letters.get(k)) {
                    tempWord[i] = letters.get(k);
                    isGuessed = true;
                    break;
                }
            }
            if (!isGuessed) {
                tempWord[i] = '*';
            }
        }
        for (char c : tempWord) {
            solution.append(c);
        }
        return solution.toString();
    }

    public static boolean letterHit(String word, ArrayList<Character> letters) {
        char[] tempWord = word.toCharArray();
        for (Character letter : tempWord) {
            if (letter == letters.getLast()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfLetterPresent(String userInput, ArrayList<Character> letters) {
        for (Character letter : letters) {
            if (letter.equals(userInput.charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public static String tempSolution(String word) {
        char[] tempWord = word.toCharArray();
        return "*".repeat(tempWord.length);
    }

    public static String getRandomWord(String[] words) {
        int wordSelection = (int) (Math.random() * (words.length));
        return words[wordSelection];
    }

}


