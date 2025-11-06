import java.util.Scanner;// Scanner 호출
class FinalCalculator extends AdvancedCalculator {
//Advanced에서 상속받기
    public int log(int a, int b) {
        int count = 0;//지역변수 선언
        // 진수가 0보다 작고 밑이 1보다 작으면 -1출력
        if (a <= 0 || b <= 1){
            System.out.println("a는 0보다 크고, b는 1보다 커야합니다");
            return -1;
        }
        // b가 a보다 작거나 같을때 까지 b를 a와 같을 때까지 a로 계속 나누기 반복 count 지역변수로 나누기한 횟수를 더하며 저장
        while (a >= b){
            a = a / b;
            count++;
        }
        return count;//count값 반환
    }
    //insert 메소드 입력과 출력 담당
    public void insert(){
        Scanner sc = new Scanner(System.in);

        System.out.println("진수 입력");
        int a = sc.nextInt();

        System.out.println("밑 입력");
        int b = sc.nextInt();

        int result = log(a, b);
        //log의 지수는 밑을 진수로 나눈 횟수
        System.out.println("log"+b+"("+a+")의 지수 = " +result);
    }
}
