package org.usfirst.frc.team1785.robot.commands;

import org.usfirst.frc.team1785.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainCommand extends Command {

    public DriveTrainCommand() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.DriveTrainSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.DriveTrainSub.arcadeDrive(Robot.m_oi.xbox.getY(GenericHID.Hand.kLeft), Robot.m_oi.xbox.getX(GenericHID.Hand.kRight), 
    			Robot.m_oi.xbox.getXButton());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
