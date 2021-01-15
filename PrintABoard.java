
/**
 * Write a description of class PrintABoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class PrintABoard
{
    static void clearScreen()
    {
        System.out.println('\u000C');
    }
    static String[][] buildBoard()
    {
        String[][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        for (int i = 0; i < 5; i++) //rows
        {
            for (int j = 0; j < 5; j++) //columns
            {
                board[i][j] = "0";
            }
        }
        
        return board;
    }
    static void printBoard(String[][] board)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print("      " + board[i][j] + "     ");
            }
            System.out.println();
        }
    }
    static String[][] customize(String[][] board)
    {
        int number = 5;
        int iCount = 1;
        int jCount = 1;
        Scanner key = new Scanner(System.in);
        
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number; j++)
            {
                iCount = i + 1;
                jCount = j + 1;
                
                System.out.print("Give the value for the string in position" + iCount + ", " + jCount + ": ");
                board[i][j] = key.next();
            }
        }
        return board;
    }
    static String[][] changeBoardElement(String[][] board, int x, int y)
    {
        Scanner key = new Scanner(System.in);
        //prompts user to input strings for the array.
        
        System.out.print("Give the value for the string in position " + x + ", " + y + ": ");
        board[y-1][x-1] = key.next();
        
        return board;
    }
    
    public static void main(String[] args)
    {
        boolean playAgain = true;
        boolean fillAnElement = true;
        int x, y;
        
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        int elementNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();
            
            System.out.println("There is a board to create.");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
            myBoard = customize(myBoard);
            
            printBoard(myBoard);
            
            System.out.print("You will change one element. Give the x-coordinate: ");
            x = myScanner.nextInt();
            System.out.print("Now, give us the y-coordinate: ");
            y = myScanner.nextInt();
            
            changeBoardElement(myBoard, x, y);
            
            printBoard(myBoard);
            
            System.out.print("Would you like to start this process again? (Type true or false)");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);
    }
}
