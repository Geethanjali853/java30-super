package pillers;

public class CA extends  Account{
    private  int min_Bal=10000;
    //generate setters and getters

    public int getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(int min_Bal) {
        this.min_Bal = min_Bal;
    }
    public void  cal_Bal(){
        //business logic
    }
}
