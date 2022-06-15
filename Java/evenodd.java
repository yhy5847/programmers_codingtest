class evenodd {
    public static void main(String[] arg) {
        solution(3);
    }

    public static String solution(int num) {
        String answer = "";
        if(num%2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        System.out.print(answer);
        return answer;
    }
}