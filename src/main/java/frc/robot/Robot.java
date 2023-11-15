package frc.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.Wheels;

public class Robot extends TimedRobot 
{
  
  

  //Container
  public static RobotContainer m_robotContainer;

  //Subsystems
  public static Wheels wheels;

  //Navx
  public static AHRS m_ahrs;


  public Robot() 
  {

    //wheels
    wheels = new Wheels();

    //Container
    m_robotContainer = new RobotContainer();

  }
  public void robotInit() {}

  public void robotPeriodic() {
  }

  /** This function is called once each time the robot enters Disabled mode. */
  public void disabledInit() {}

  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  public void autonomousInit() {}

  /** This function is called periodically during autonomous. */
  public void autonomousPeriodic() {}

  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  public void teleopPeriodic() {}

  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */  
  public void testPeriodic() {}
}