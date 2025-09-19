package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp
public class ServoIntakeTest extends OpMode{
    CRServo leftIntake;
    CRServo rightIntake;

    @Override
    public void init() {
        leftIntake = hardwareMap.get(CRServo.class, "left_servo");
        rightIntake - hardwareMap.get(CRServo.class, "right_servo");

    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            leftIntake setPower(1.0);
            rightIntake setPower(1.0);
        }
        else if (gamepad1.b) {
            leftIntake setPower(-1.0);
            rightIntake setPower(-1.0);
        }
        else {
            leftIntake setPower(0.0);
            rightIntake setPower(0.0)
        }

    }
}
