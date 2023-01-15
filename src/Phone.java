public interface Phone {

    void powerOn();
    void callNumber(String phoneNo); //String
    void receiveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}
