package processor;

public class Menu {

    public static void printOptions() {
        final MenuOption[] values = MenuOption.values();

        for (MenuOption value : values) {
            System.out.println(value);
        }
    }

    public static void printTransposeOptions() {
        final MenuTransposeOption[] values = MenuTransposeOption.values();

        for (MenuTransposeOption value : values) {
            System.out.println(value);
        }
    }

    enum MenuOption {
        ADD("1. Add matrices"),
        MULTIPLY_BY_CONSTANT("2. Multiply matrix by a constant"),
        MULTIPLY_MATRIX_BY_MATRIX("3. Multiply matrices"),
        TRANSPOSE_MATRIX("4. Transpose matrix"),
        DETERMINANT_OF_MATRIX("5. Calculate a determinant"),
        INVERSE_MATRIX("6. Inverse matrix"),
        EXIT("0. Exit");

        private final String text;

        MenuOption(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    enum MenuTransposeOption {
        MAIN_DIAGONAL("1. Main diagonal"),
        SIDE_DIAGONAL("2. Side diagonal"),
        VERTICAL_LINE("3. Vertical line"),
        HORIZONTAL_LINE("4. Horizontal line");

        private final String text;

        MenuTransposeOption(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
}
