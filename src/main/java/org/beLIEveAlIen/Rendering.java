package org.beLIEveAlIen;

import java.util.Scanner;

import static org.beLIEveAlIen.Field.field;

public class Rendering {

    private boolean isCross = true;
    private final Field OBJ_FIELD = new Field();

    public void fillCell(){
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("X: ");
        x = in.nextInt();
        System.out.print("Y: ");
        y = in.nextInt();
        changeCell(y, x);
    }

    public void changeCell(int x, int y){
        if (isCross){
            field[x-1][y-1] = 'x';
            isCross = false;
        }
        else {
            field[x-1][y-1] = '0';
            isCross = true;
        }
    }

    public void startGame() throws InterruptedException {
        while (true){
            OBJ_FIELD.renderingField();
            fillCell();
            if (OBJ_FIELD.checkField() == 'x'){
                System.out.println("Победа крестиков!!!");
                break;
            }
            else if(OBJ_FIELD.checkField() == '0') {
                System.out.println("Победа ноликов!!!");
                break;
            }
            Thread.sleep(600);
            for(int i=0; i<10; i++) System.out.println("\n\n\n\n\n\n\n\n\n\n");
        }
    }
}
