package com.team3997.frc2016;

import com.team3997.frc2016.components.UpdateParameters;

/**
 * 
 * All constants (pin numbers, final booleans etc) go in this class.
 *
 */

public class Params extends UpdateParameters {

	/*
	 * 
	 * Other Params
	 */
	public static final String CONSTANTS_FILE = "/home/admin/params.txt";
	public static final String CAMERA_USB = "cam1";
	public static final String CAMERA_AXIS = "cam0";
	public static final String CAMERA_AXIS_IP = "10.39.97.89";
	public static final boolean DASHBOARD_CAMERA_SETTINGS = true;

	/*
	 * 
	 * Driver Joystick
	 */
	public static final int DRIVER_JOYSTICK_USB = 0;
	public static final int INTAKE_BUTTON = 1;
	public static final int OUTTAKE_BUTTON = 3;
	public static final int EXPOSURE_BUTTON = 5;

	/*
	 * 
	 * Operator Joystick
	 */
	public static final int OP_JOYSTICK_USB = 1;
	public static final int OP_CAMERA_TOGGLE_BUTTON = 9;
	/*
	 * 
	 * Drive Parameters
	 */
	public static final int DRIVE_PINS[] = { 8, 9, 7, 6 }; // front left pin,
															// right pin
	public static final boolean DASHBOARD_TELE_DRIVE = true;
	public static Constant DRIVE_MOTOR_SPEED = new Constant("MOTOR_SPEED", 0.5);
	public static final boolean SQUARE_INPUTS = true;
	/*
	 * 
	 * Intake Parameters
	 */
	public static final int INTAKE_PINS[] = { 0, 1 }; // left, right
	public static final double INTAKE_MOTOR_SPEED = 0.85;

	/*
	 * 
	 * Shooter Parameters
	 */
	public static final int FLYWHEEL_PIN = 2;
	public static final double FLYWHEEL_MOTOR_SPEED = 0.85;
	/*
	 * 
	 * Climber Parameters
	 */

}