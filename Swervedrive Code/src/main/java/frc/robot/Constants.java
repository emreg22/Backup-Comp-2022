/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public final class Constants {

    // === MOTOR PORTS === //

    // SwerveDrive MOTOR Ports
  
    public static final int MOTOR_PORT_1 = 5;
    //Done
    public static final int MOTOR_PORT_2 = 8;
    //DOne
    public static final int MOTOR_PORT_3 = 3;
    //Done
    public static final int MOTOR_PORT_4 = 7; // done
    //Done
    public static final int ROTATOR_PORT_1 = 4;
    //Done
    public static final int ROTATOR_PORT_2 = 2;
    //Done
    public static final int ROTATOR_PORT_3 = 1;
    //Done
    public static final int ROTATOR_PORT_4 = 6;
    //Done

    //Controller Constants
    public static final int CONTROLLER_0 = 0;
    public static final int TRANSLATIONAL_HORIZONTAL_AXIS = 0;
    public static final int TRANSLATIONAL_VERTICAL_AXIS = 1;
    public static final int ROTATIONAL_HORIZONTAL_AXIS = 2;

    // SwerveDrive Constants
    public static final double CONTROLLER_SENSITIVITY = 0.1;
    public static final double ANGLE_RANGE = 2;
    public static final double P_CONSTANT = 1.0/360.0;
    public static final double GEAR_RATIO = 12.8;
    public static final double UNITS_PER_ROTATION = 2048;
    public static final double L = 1;
    public static final double W = 1;


    public static final int kSlotIdx = 0;

	/**
	 * Talon FX supports multiple (cascaded) PID loops. For
	 * now we just want the primary one.
	 */
	public static final int kPIDLoopIdx = 0;

	/**
	 * set to zero to skip waiting for confirmation, set to nonzero to wait and
	 * report to DS if action fails.
	 */
    public static final int kTimeoutMs = 30;

	/**
	 * Gains used in Motion Magic, to be adjusted accordingly
     * Gains(kp, ki, kd, kf, izone, peak output);
     */
    public static final Gains kGains = new Gains(1.0, 0.0, 0.0, 0.0, 0, 1.0);
}