package org.beLIEveAlIen;

public class Field {
    public static Character[][] field = {
                               {'.', '.', '.'},
                               {'.', '.', '.'},
                               {'.', '.', '.'}
                              };

    public void renderingField(){
        for (Character[] symbols : field) {
            System.out.println();
            for (Character symbol : symbols) {
                System.out.print(symbol + "  ");
            }
        }
    }

    public char checkField(){
        char statement = '.';

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[j].length; j++) {
                if ((field[i][0] == 'x' && field[i][1] == 'x' && field[i][2] == 'x') || (field[0][j] == 'x' && field[1][j] == 'x' && field[2][j] == 'x') ||
                        (field[0][0] == 'x' && field[1][1] == 'x' && field[2][2] == 'x') || (field[2][0] == 'x' && field[1][1] == 'x' && field[0][2] == 'x')){
                    statement = 'x';
                    break;
                }
                else if ((field[i][0] == '0' && field[i][1] == '0' && field[i][2] == '0') || (field[0][j] == '0' && field[1][j] == '0' && field[2][j] == '0') ||
                        (field[0][0] == '0' && field[1][1] == '0' && field[2][2] == '0') || (field[2][0] == '0' && field[1][1] == '0' && field[0][2] == '0')){
                    statement = '0';
                    break;
                }
            }
        }
        return statement;
    }
}
