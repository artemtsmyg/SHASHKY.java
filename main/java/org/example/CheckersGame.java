package org.example;

import java.util.Scanner;

/**
 * Простая программа для игры в шашки.
 */
public class CheckersGame {

    private static char[][] board = new char[8][8]; // Доска для игры
    private static char currentPlayer = 'W'; // Текущий игрок (W - белые, B - черные)

    /**
     * Инициализация начальной доски.
     */
    public static void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (i < 3) {
                        board[i][j] = 'B'; // Начальное положение черных шашек
                    } else if (i > 4) {
                        board[i][j] = 'W'; // Начальное положение белых шашек
                    } else {
                        board[i][j] = ' '; // Пустые клетки
                    }
                } else {
                    board[i][j] = ' '; // Пустые клетки
                }
            }
        }
    }

    /**
     * Отображение текущего состояния доски.
     */
    public static void displayBoard() {
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(8 - i);
        }
        System.out.println("  a b c d e f g h");
    }

    public static void main(String[] args) {
        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();
            System.out.println("Ход игрока " + currentPlayer + ". Введите координаты шашки (например, e3): ");
            String input = scanner.nextLine();

            // Здесь можно добавить код для обработки хода игроков и логики игры
            // Например, проверку на валидность хода и перемещение шашек.

            // Ваш код здесь...

            // После обработки хода, переключаем игроков
            currentPlayer = (currentPlayer == 'W') ? 'B' : 'W';
        }
    }
}