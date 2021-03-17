package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "FlywheelOnlyShooterTest (Blocks to Java)", group = "")
public class FlywheelOnlyShooterTest extends LinearOpMode {

  private Servo FireServo;
  private DcMotor flywheel;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    FireServo = hardwareMap.get(Servo.class, "Fire Servo");
    flywheel = hardwareMap.get(DcMotor.class, "flywheel");

    // Put initialization blocks here.
    FireServo.setPosition(0);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        flywheel.setPower(1);
        telemetry.addData("Servo Angle", FireServo.getPosition());
        if (gamepad1.a) {
          FireServo.setPosition(0.1);
        } else {
          FireServo.setPosition(-0.2);
        }
        // Put loop blocks here.
        telemetry.update();
      }
    }
  }
}
