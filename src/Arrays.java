public class Arrays {
    String [] days={"monday", "tuesday", "wednesday","thursday","friday","saturday","sunday"};

    int indexday;
    public void setDays(String day){
        this.indexday=3;
        for (int i=0;i<days.length;i++){
            if(days.equals(days[i])){
                this.indexday=i;
                break;
            }
        }
    }
    public void setDays(int day){
        this.indexday=day;
    }
    public String nextDay(){
        return calculateDay(1);
    }
    public String previousDay(){
        return calculateDay(-1);
    }
    public String calculateDay(int numbers){
        if (numbers<=0){
            return days[(this.indexday-Math.abs(numbers))%7];
        }
        return days [(this.indexday+numbers)%7];
    }
}
