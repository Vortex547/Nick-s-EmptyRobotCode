package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Wheels;

public class Forward extends CommandBase {
    
    public Forward()
    {
        this.addRequirements(Robot.wheels);
    }

    public void execute()
    {
        if(Robot.wheels.getWheelSwitch() == false)
        {
            Robot.wheels.setLeftWheelMotorState(Wheels.LeftWheelMotorState.ON);
            Robot.wheels.setRightWheelMotorState(Wheels.RightWheelMotorState.ON);
        }
    }
}
