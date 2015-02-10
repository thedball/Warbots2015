// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.Warbots2015.commands;

import org.usfirst.frc620.Warbots2015.Robot;
import org.usfirst.frc620.Warbots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.*;
/**
 *
 */
public class  DriveWithJoysticks extends Command {
	Joystick stick;
	double x;
	double y;
	double z;
	double gyro;

	
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	stick = new Joystick(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	x=stick.getX();
    	y=stick.getY();
    	z=stick.getTwist();
    	gyro = 0;
    	
    	if(Math.abs(x)<0.2)
    		x=0;
    	if(Math.abs(y)<0.2)
    		y=0;
    	if(Math.abs(z)<0.2)
    		z=0;
    	
    	Robot.driveTrain.mecanumDrive(-x, y, z, gyro); 
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
