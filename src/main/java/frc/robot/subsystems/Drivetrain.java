// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.math.MathUtil;


public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
private final CANSparkMax rightmotor1 = new CANSparkMax(Constants.Drivetrain.RightMotors.kRightMotor1_Port, MotorType.kBrushless);
private final CANSparkMax rightmotor2 = new CANSparkMax(Constants.Drivetrain.RightMotors.kRightMotor2_Port, MotorType.kBrushless);
private final CANSparkMax leftmotor1 = new CANSparkMax(Constants.Drivetrain.LeftMotors.kLeftMotor1_Port, MotorType.kBrushless);
private final CANSparkMax leftmotor2 = new CANSparkMax(Constants.Drivetrain.LeftMotors.kLeftMotor2_Port, MotorType.kBrushless);


 public Drivetrain() {
  leftmotor2.follow(leftmotor1); 
  rightmotor2.follow(rightmotor1);
 }
 public void setLeft(double power){
leftmotor1.set(power);
 }
  public void setRight(double power){
rightmotor1.set(power);

 }


  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  
  public void tankDrive(double leftSpeed, double rightSpeed, boolean squareInputs) {
    leftSpeed = MathUtil.applyDeadband(leftSpeed, 0.02);
    rightSpeed = MathUtil.applyDeadband(rightSpeed, 0.02);
    leftSpeed = MathUtil.clamp(leftSpeed, -1.0, 1.0);
    rightSpeed = MathUtil.clamp(rightSpeed, -1.0, 1.0);

    if (squareInputs) {
      leftSpeed = Math.copySign(leftSpeed * leftSpeed, leftSpeed);
      rightSpeed = Math.copySign(rightSpeed * rightSpeed, rightSpeed);
    }
    setLeft(leftSpeed);
    setRight(rightSpeed); 
  }
}
