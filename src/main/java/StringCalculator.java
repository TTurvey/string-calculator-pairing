public class StringCalculator {

        int add(String numbers) {
                if (numbers.equals("")) { return 0; }
                if (numbers.length() == 1) { return Integer.parseInt(numbers); }

                char separator = 'x';
                if (numbers.substring(0,2).equals("//") ) {
                        separator = numbers.charAt(2);
                }


                String[] numbersArray = numbers.split(",\n|" + separator);

                if (numbersArray.length > 1) {
                        int sum = 0;
                        for (int i = 0; i < numbersArray.length; i++) {
                                sum += Integer.parseInt(numbersArray[i]);
                        }
                        return sum;
                } else {
                        return 0;
                }
        }
}

//for (String str : myStringArray) {
//        sum += Integer.parseInt(number);
//}