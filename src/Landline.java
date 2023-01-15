public class Landline implements Phone{

    //attributes
    private String phoneNumber;
    private boolean isPowerOn;
    private boolean isRinging;

    public Landline(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        isRinging = false;
        isPowerOn = true;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn == true){
            System.out.println("dialing a no"+phoneNo);
        }
        else{
            System.out.println("off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && phoneNumber.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("hey "+phoneNumber+" you are receiving a call");
        }
        else {
            System.out.println("power off");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging == true){
            System.out.println("call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }
}
