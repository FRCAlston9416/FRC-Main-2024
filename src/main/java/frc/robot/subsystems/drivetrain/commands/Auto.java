package frc.robot.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Launcher;
import frc.robot.subsystems.drivetrain.commands.AutonomousDriveForward;
import frc.robot.subsystems.drivetrain.commands.Autonomousturn;

public class Auto extends Command {
    public Auto(Drivetrain drivetrain, Launcher launcher){
       ParallelRaceGroup AutoLaunchNote= new ParallelRaceGroup();
       ShootNote AutoShoot= new ShootNote(launcher);


    }
}

