public class StringCalculator {

        int add(String numbers) {
                if (numbers.equals("")) {
                        return 0;
                }

                String[] numbersArray = numbers.split(",");

                if (numbersArray.length == 1) {
                        return Integer.parseInt(numbers);
                }
                if (numbersArray.length == 2) {
                        return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);
                }
                if (numbersArray.length == 3) {
                        return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]) + Integer.parseInt(numbersArray[2]);
                } else {
                        return -1;
                }
        }

}