public class CE extends Employee{
    private int eid;
    private int sal;
    private int tax;
   public CE(int id,String name,String loc,int sal){
    super(name,loc);
    this.eid=id;
    this.sal = sal;
   }
        //generate setters and getters
        public int getTax() {
            return tax;
        }
        public void setTax(int tax) {
            this.tax = tax;
        }
        public int cal_Sal(){
            int gross_Sal = this.sal - this.sal/100*this.getTax();
            return gross_Sal;
        }
    
}