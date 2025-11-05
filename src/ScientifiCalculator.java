class ScientifiCalculator extends AdvancedCalculator {

    public int power() {
        if (num2 < 0) {
            System.out.println("음수 거듭제곱은 불가합니다.");
            result = Integer.MAX_VALUE;
            return 0;
        }

        if (num2 == 0) {
            result = 1;
            System.out.println(num1 + "^" + num2 + "=" + result);
            return 0;
        }

        if (num1 == 0) {
            result = 0;
            System.out.println(num1 + "^" + num2 + "=" + result);
        }

        int scResult = 1;

        for (int i = 0; i < num2; i++) {
            scResult *= num1;
        }
        result = scResult;
        return result;
    }

}
