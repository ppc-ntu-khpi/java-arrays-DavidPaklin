public class Exercise {
  public static boolean Calculate(int number) {
    String strNumber = String.valueOf(number); // Перетворюємо задане число в рядок і розбиваємо його на символи
    char[] digits = strNumber.toCharArray(); // Робимо символьний масив
    int power = digits.length; // Визначаємо кількість цифр у числі 
    int sum = 0;
    for (char digit : digits) { // Обходимо всі цифри масиву
        int num = Character.getNumericValue(digit); // Перетворюємо символ у цифру
        sum += Math.pow(num, power); // Додаємо цифру, піднесену до степеня
    }
    if (sum == number) { // Порівнюємо знайдену суму з нашим числом та повертаємо результат
        return true;
    } 
    else {
        return false;
    }
  }
}