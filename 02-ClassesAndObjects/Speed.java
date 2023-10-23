public class Speed{
    int speed;
    int UpperLimit = 140;
    int LowerLimit = 40;

    void VehicleSpeed(){
        System.out.println("Vehicle speed: "+speed);
    }

    void CheckSpeed(){
        if(speed>UpperLimit){
            System.out.println("Speed is valid: False");
        }else if(speed<LowerLimit){
            System.out.println("Speed is valid: False");
        }else{
            System.out.println("Speed is valid: True");
        }
    }

}