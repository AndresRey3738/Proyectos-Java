
import java.util.Scanner;

public class Mapas {

    Scanner teclado = new Scanner(System.in);

    public void DosVariables() {
        int[][] M = new int[2][2];
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese el valor de la posicion " + i + "," + j + ": ");
                M[i][j] = teclado.nextInt();
            }
        }
        System.out.println("El mapa de Karnaugh es: ");
        System.out.println("A\\B");
        System.out.println("  |" + M[0][0] + " | " + M[0][1] + "|");
        System.out.println("  |" + M[1][0] + " | " + M[1][1] + "|\n");

        if (M[0][0] == 1) {
            if (M[0][1] == 1) {
                if (M[1][0] == 1) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= A'+A");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= A'+AB'");
                    }
                }
                if (M[1][0] == 0) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= A'+AB");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= A'");
                    }
                }
            }
            if (M[0][1] == 0) {
                if (M[1][0] == 1) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= A'B'+A");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= B'");
                    }
                }
                if (M[1][0] == 0) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= A'B'+AB");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= A'B'");
                    }
                }

            }
        }
        if (M[0][0] == 0) {
            if (M[0][1] == 1) {
                if (M[1][0] == 1) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= A+A'B");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= A'B+AB'");
                    }
                }
                if (M[1][0] == 0) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= B");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= A'B");
                    }
                }
            }
            if (M[0][1] == 0) {
                if (M[1][0] == 1) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= A");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= AB'");
                    }
                }
                if (M[1][0] == 0) {
                    if (M[1][1] == 1) {
                        System.out.println("La solucion es: S= AB");
                    }
                    if (M[1][1] == 0) {
                        System.out.println("La solucion es: S= VACIO");
                    }
                }

            }
        }
    }
    
    public void TresVariables(){
    
        int[][] M = new int[4][2];
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese el valor de la posicion " + i + "," + j + ": ");
                M[i][j] = teclado.nextInt();
            }
        }
        System.out.println("El mapa de Karnaugh es: ");
        System.out.println("AB\\C");
        System.out.println("   |" + M[0][0] + " | " + M[0][1] + "|");
        System.out.println("   |" + M[1][0] + " | " + M[1][1] + "|");
        System.out.println("   |" + M[2][0] + " | " + M[2][1] + "|");
        System.out.println("   |" + M[3][0] + " | " + M[3][1] + "|\n");       
    
        if (M[0][0]==1){
            if (M[0][1]==1){
                if (M[1][0]==1){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+AB'+ABC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C'+A'B'C+ABC");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+BC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C'+B'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C'+A'B'C");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+BC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+BC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC'");
                                    }
                                }
                            }
                        }
                    }
                }
                if (M[1][0]==0){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A+A'B'+A'BC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+BC+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+A'B'C'+ABC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC+ABC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C+B'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+A'B'C'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+BC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= B'C'+A'C");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+A'BC");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+AC+AB'C'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (M[0][1]==0){
                if (M[1][0]==1){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C'+BC");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C'+A'BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C'+A'BC");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+BC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+BC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+BC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= B'C'+A'B");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'B+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'B");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C'+ABC");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC'+ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+AC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+AB'C");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C'");
                                    }
                                }
                            }
                        }
                    }
                }
                if (M[1][0]==0){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+BC+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+BC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= B'C'+BC");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+BC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AB'C");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= B'C'+AB");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= AC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= AC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C'");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (M[0][0]==0){
            if (M[0][1]==1){
                if (M[1][0]==1){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A'B+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+B+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+BC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+B");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C+BC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+BC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C+A'B+ABC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+BC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+A'BC'+AB'C'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'B++ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+A'BC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+A'BC'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A'B+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'B+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C+A'B");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'B");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+BC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+BC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+BC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C+BC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+BC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+A'BC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C+A'BC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+AB'C'");
                                    }
                                }
                            }
                        }
                    }
                }
                if (M[1][0]==0){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+AC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+ABC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C+AB'C'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'C+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= AB'C'+A'C");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'+A'BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'C+AB'C");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C+AB");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC'+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C+ABC'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+AC+AB'C'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B'C");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (M[0][1]==0){
                if (M[1][0]==1){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= B+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= B+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= B");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'B");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC'+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC'+AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= BC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= BC'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= BC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= BC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= BC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= BC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC'+ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC'+ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC'+AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC'+ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC'+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC'");
                                    }
                                }
                            }
                        }
                    }
                }
                if (M[1][0]==0){
                    if(M[1][1]==1){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC+A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= BC+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC+AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC+AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC+AC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC+AC'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC+ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC+ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= BC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= BC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= BC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'BC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+A'BC+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= A'BC+AB'C");
                                    }
                                }
                            }
                        }
                    }
                    if(M[1][1]==0){
                        if (M[2][0]==1){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= AB+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= AB+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= AB");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= A'B'C'+ABC'+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= AC'+AB'C");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= ABC'+AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= ABC'");
                                    }
                                }
                            }
                        }
                        if(M[2][0]==0){
                            if(M[2][1]==1){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= ABC+AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= ABC+AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= AC");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= ABC");
                                    }
                                }
                            }
                            if(M[2][1]==0){
                                if(M[3][0]==1){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= AB'");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= AB'C'");
                                    }
                                }
                                if(M[3][0]==0){
                                    if(M[3][1]==1){
                                        System.out.println("La solucion es: S= AB'C");
                                    }
                                    if(M[3][1]==0){
                                        System.out.println("La solucion es: S= VACIO");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mapas m = new Mapas();
       
        
        int opc = 0;
        for (;;) {
            System.out.println("");
            System.out.println("*****ELIGA LA OPCION QUE DESEA CON EL NUMERO CORRESPONDIENTE******\n");
            System.out.println("2.......MAPA CON 2 VARIABLES..... ");
            System.out.println("3.......MAPA CON 3 VARIABLES..... ");
            System.out.println("\n\t*****SALIR***** 0");

            opc = teclado.nextInt();
            switch (opc) {

                case 2:
                    m.DosVariables();
                    break;
                case 3:
                    m.TresVariables();
                    break;
                
            }
            if(opc==0){
            break;
            }
        }
    }
}
