package homework;

public class FigurePainter {

    public static void main(String[] args) {

        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *      *
         *      * *
         *      * * *
         *      * * * *
         *
         * */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *             *
         *           * *
         *         * * *
         *       * * * *
         *
         * */

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *       * * * *
         *       * * *
         *       * *
         *       *
         *
         * */
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *       * * * *
         *         * * *
         *           * *
         *             *
         *
         * */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /**
         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
         *
         *
         *        *
         *       * *
         *      * * *
         *     * * * *
         *      * * *
         *       * *
         *        *
         * */

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }





}
