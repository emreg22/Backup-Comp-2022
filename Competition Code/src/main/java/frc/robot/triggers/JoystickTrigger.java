/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * Add your docs here.
 */
public class JoystickTrigger extends Trigger {
    private Joystick joystick;
    private int axisPort;

    public JoystickTrigger(Joystick joy, int axis) {
        joystick = joy;
        axisPort = axis;
    }

    @Override
    public boolean get(){
        return  joystick.getRawAxis(axisPort) > .5;
    }
}
