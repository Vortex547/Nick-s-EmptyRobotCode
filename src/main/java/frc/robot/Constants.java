package frc.robot;

public final class Constants {
    
    public static class CANIds {
        //Set the IDs of the Motors

        public static final int LeftWheelMotor = 1;
        public static final int RightWheelMotor = 2;

    }
    public static class DIO {
        //Digital Imput/Output
        
        //Switch plugged into port 1 on the robot
        public static int WheelLimitSwitch = 1;
    }

    public static class Wheels{

        public static final double WheelBackwardsSpeed = 0;
        public static int LeftWheelMotor = CANIds.LeftWheelMotor;
        public static int RightWheelMotor = CANIds.RightWheelMotor;
        
        //1 = 100%, 0.5 = 50%
        public static double WheelForwardSpeed = 0.5;
        public static double WheelBackwardSpeed = -0.5;
    }
}