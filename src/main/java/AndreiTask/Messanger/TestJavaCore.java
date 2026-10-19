package AndreiTask.Messanger;

public class TestJavaCore {

    public String reverse(String input){
        if (input == null){
            throw new IllegalArgumentException("Не может быть null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Метод, который бросает исключение, если строка слишком короткая
    public String validateLength(String input, int minLength) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.length() < minLength) {
            throw new IllegalArgumentException("Input must be at least " + minLength + " characters long");
        }
        return input;
    }
        // Метод на нахождение суммы
        public int sum(int a, int b) {
            return a + b;
        }

        // Метод formatName(String first, String last) возвращает строку в формате "Last, First". Если имя или фамилия — null, кидает исключение.
    public String formatName(String first, String last) {
        if (first == null || last == null) {
            throw new IllegalArgumentException("First or last name cannot be null");
        }
        return last.trim() + ", " + first.trim();
    }
}


