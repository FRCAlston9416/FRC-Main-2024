package frc.robot.subsystems.drivetrain.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Launcher;

public class Shoot extends Command {
    Launcher launcher;
    double power = 1;
    Timer timer = new Timer();

    public Shoot(Launcher launcher){
    this.launcher = launcher;
    
    }

    @Override
    public void initialize(){
     timer.reset();
     timer.start();
    }

    @Override
    public void execute(){
    this.launcher.setlaunchMotor(0, 1);
    this.launcher.setsecondaryMotor(0, 1);

    }

    @Override
    public boolean isFinished(){
       return timer.get() > 3;
    }

    @Override
    public void end(boolean interrupted){
        this.launcher.setsecondaryMotor(0, 0);
        this.launcher.setsecondaryMotor(0, 0);
        timer.stop();

    }
}
