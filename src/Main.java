public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("123456789");
        Landline l2 = new Landline("789456123");

        l1.callNumber("789456123");
        l2.receiveCall("789456123");

        System.out.println(l2.answerCall());
    }
    /*
    * sir if another call is already continuing then no other call can be made to the same number or it should return busy
     * */
}