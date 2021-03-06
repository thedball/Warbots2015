// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.Warbots2015.subsystems;

import org.usfirst.frc620.Warbots2015.RobotMap;
import org.usfirst.frc620.Warbots2015.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController pWMJagRL = RobotMap.driveTrainPWMJagRL;
    SpeedController pWMJagRR = RobotMap.driveTrainPWMJagRR;
    SpeedController pWMJagFL = RobotMap.driveTrainPWMJagFL;
    SpeedController pWMJagFR = RobotMap.driveTrainPWMJagFR;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
    Gyro gyro = RobotMap.driveTrainGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void mecanumDrive(double x,double y,double z, double gyro){
    	robotDrive.mecanumDrive_Cartesian(x, y, z, gyro);
    }
}

