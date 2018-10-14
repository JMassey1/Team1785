package org.usfirst.frc.team1785.robot.subsystems;

import org.usfirst.frc.team1785.robot.RobotMap;
import org.usfirst.frc.team1785.robot.commands.DriveTrainCommand;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrainSubsytem extends Subsystem {
	SpeedController frMotor, flMotor;
	DifferentialDrive drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public DriveTrainSubsytem() {
		frMotor = new PWMTalonSRX(RobotMap.frTalon);
		flMotor = new PWMTalonSRX(RobotMap.flTalon);
		SpeedControllerGroup right = new SpeedControllerGroup(frMotor);
		SpeedControllerGroup left = new SpeedControllerGroup(flMotor);
		drive = new DifferentialDrive(right,left);
		
	}
	
	public void arcadeDrive(double x, double y, boolean sInput) {
		drive.arcadeDrive(x, y, sInput);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveTrainCommand());
    }
}

