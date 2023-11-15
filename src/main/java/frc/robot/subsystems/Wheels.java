package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Wheels extends SubsystemBase {
    //extends allows us to import a piece of code from a seperate database of code for general usage, SubsystemBase is a piece of code that helps us run this program
    
    public enum LeftWheelMotorState
    {
        ON,
        OFF,
        REVERSED
    }

    public enum RightWheelMotorState
    {
        ON,
        OFF,
        REVERSED
    }
    //enums are a special data type (acting like a list) that involves pre-defined named values, seperated by commas.

    public CANSparkMax LeftWheelMotor = new CANSparkMax(Constants.Wheels.LeftWheelMotor, MotorType.kBrushless);
    public CANSparkMax RightWheelMotor = new CANSparkMax(Constants.Wheels.RightWheelMotor, MotorType.kBrushless);

    public DigitalInput WheelLimitSwitch = new DigitalInput(Constants.DIO.WheelLimitSwitch);

    public LeftWheelMotorState leftWheelMotor = LeftWheelMotorState.OFF;
    public RightWheelMotorState rightWheelMotor = RightWheelMotorState.OFF;

    public Wheels()
    //Constructors are: 
    {
        this.LeftWheelMotor.setIdleMode(IdleMode.kBrake);
        this.RightWheelMotor.setIdleMode(IdleMode.kBrake);

        this.LeftWheelMotor.setSmartCurrentLimit(40);
        this.RightWheelMotor.setSmartCurrentLimit(40);
    }

    //A method is:
    public void setLeftWheelMotorState(LeftWheelMotorState state)
    {
        this.leftWheelMotor = state;

        switch(state)
        {
            case ON:

                this.LeftWheelMotor.set(Constants.Wheels.WheelForwardSpeed);
                break;
            case OFF:
                this.LeftWheelMotor.set(0.0);
                break;
            case REVERSED:
                this.LeftWheelMotor.set(Constants.Wheels.WheelBackwardSpeed);
                break;
            default:
                this.setLeftWheelMotorState(LeftWheelMotorState.OFF);
        }
    }

    public void setRightWheelMotorState(RightWheelMotorState state)
    {
        this.rightWheelMotor = state;

        switch(state)
        {
            case ON:

                this.RightWheelMotor.set(Constants.Wheels.WheelForwardSpeed);
                break;
            case OFF:
                this.RightWheelMotor.set(0.0);
                break;
            case REVERSED:
                this.RightWheelMotor.set(Constants.Wheels.WheelBackwardSpeed);
                break;
            default:
                this.setRightWheelMotorState(RightWheelMotorState.OFF);
        }
    }

    public double getLeftWheelMotorPosition()
    {
        return this.LeftWheelMotor.getEncoder().getPosition();
    }

    public double getRightWheelMotorPosition()
    {
        return this.RightWheelMotor.getEncoder().getPosition();
    }

    public boolean getWheelSwitch()
    {
        return this.WheelLimitSwitch.get();
    }
}
