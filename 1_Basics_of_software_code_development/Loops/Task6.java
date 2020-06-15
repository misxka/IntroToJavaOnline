public class Task6 {
    public static void main(String[] args){
        for(char i = 0x0000; i <= 0xffff; i++) {
            System.out.printf("%c - U-%04x\n", i, (int) i);
        }
    }
}
