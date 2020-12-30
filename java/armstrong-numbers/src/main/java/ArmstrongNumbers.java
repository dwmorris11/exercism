class ArmstrongNumbers {
        boolean isArmstrongNumber(int numberToCheck) {
            return numberToCheck == calculateArmstrongValue(numberToCheck);
        }
        private int calculateArmstrongValue(int number) {
            int result = 0;
            char[] numbers = String.valueOf(number).toCharArray();
            for(char digit : numbers) {
                result += (int) Math.pow(Character.getNumericValue(digit),numbers.length);
            }

            return result;
        }
}
