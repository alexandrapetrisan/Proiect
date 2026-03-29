package Tema1;

public class exercitiul8 {

        public static int sumaPare() {
            int suma = 0;

            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
                    suma += i;
                }
            }
            return suma;
        }
        public static void main(String[] args) {
            int rezultat = sumaPare();
            System.out.println(rezultat);
        }
    }

