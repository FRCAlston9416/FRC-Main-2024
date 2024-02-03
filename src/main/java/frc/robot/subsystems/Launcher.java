package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Launcher extends SubsystemBase{
    private final CANSparkMax launchMotor = new CANSparkMax(Constants.Launcher.kLaunchMotor_port, MotorType.kBrushless);
    private final CANSparkMax secondaryMotor = new CANSparkMax(Constants.Launcher.kSecondaryMotor_port, MotorType.kBrushless);
    

    public Launcher() {
        
    }
    public void setlaunchMotor(double power){launchMotor.set(power);
    }
{
    
}
    public void setsecondaryMotor(double power){secondaryMotor.set(power);
    }
}
