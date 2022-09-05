public class StringCalculator {

        private boolean customised;
        private String separator;

        public StringCalculator() {
                this.customised = false;
                this.separator = ",";
        }

        int add(String inputString) {
                if (inputString.equals("")) {
                        return 0;
                }
                if (inputString.length() == 1) {
                        return Integer.parseInt(inputString);
                }

                customised(inputString);
                getSeparatorString(inputString);

                String numbersString = getNumbersString(inputString);
                String[] numbersStringArray = getNumbersStringArray(numbersString, separator);

                int sum = 0;
                for (String number : numbersStringArray) {
                        sum += Integer.parseInt(number);
                }
                return sum;
        }

        void customised(String inputString) {
                String firstChar = Character.toString(inputString.charAt(0));
                if (firstChar.equals("/")) {
                        this.customised = true;
                }
        }

        void getSeparatorString(String inputString) {
                if (customised) {separator = inputString.substring(2,3);}
        }

        String getNumbersString(String inputString) {
                if (customised) {
                        return inputString.substring(4);
                }
                return inputString;
        }

        String [] getNumbersStringArray(String numbersString, String separatorString) {
                return  numbersString.split("\n|" + separatorString);
        }
}
