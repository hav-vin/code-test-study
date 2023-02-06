public class No_4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];	// 1부터 10000이므로

        for(int i = 1; i < 10000; i++){
            int n = d(i);

            if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {	// false 인 인덱스만 출력
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number) {
        // 1234(sum=number) + 1 + 2 + 3 + 4 = 1244
        int sum = number; // 입력받은 수를 생성자로 하는 수 리턴

        while(number != 0){ // +각 자리수
            sum = sum + (number % 10); // 첫 째 자리수(1의 자리) 1234%10 = 4
            number = number/10;	// 10을 나누어 첫 째 자리를 없앤다 1234/10 = 123
        }
        return sum;
    }
}