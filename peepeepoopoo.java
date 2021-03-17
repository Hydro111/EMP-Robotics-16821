package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "peepeepoopoo (Blocks to Java)", group = "")
public class peepeepoopoo extends LinearOpMode {

  private DcMotor motor0AsDcMotor;
  private DcMotor motor1AsDcMotor;
  private DcMotor motor2AsDcMotor;
  private DcMotor motor3AsDcMotor;
  private DcMotor flywheel;
  private DcMotor rampAsDcMotor;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    motor0AsDcMotor = hardwareMap.get(DcMotor.class, "motor0AsDcMotor");
    motor1AsDcMotor = hardwareMap.get(DcMotor.class, "motor1AsDcMotor");
    motor2AsDcMotor = hardwareMap.get(DcMotor.class, "motor2AsDcMotor");
    motor3AsDcMotor = hardwareMap.get(DcMotor.class, "motor3AsDcMotor");
    flywheel = hardwareMap.get(DcMotor.class, "flywheel");
    rampAsDcMotor = hardwareMap.get(DcMotor.class, "rampAsDcMotor");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        motor0AsDcMotor.setPower((gamepad1.right_stick_y * -1 + ((gamepad1.left_stick_x + gamepad1.right_stick_x) / 2) * 1) / 2);
        motor1AsDcMotor.setPower((gamepad1.right_stick_y * 1 + ((gamepad1.left_stick_x + gamepad1.right_stick_x) / 2) * 1) / 2);
        motor2AsDcMotor.setPower((gamepad1.left_stick_y * 1 + ((gamepad1.left_stick_x + gamepad1.right_stick_x) / 2) * 1) / 2);
        motor3AsDcMotor.setPower((gamepad1.left_stick_y * 1 + ((gamepad1.left_stick_x + gamepad1.right_stick_x) / 2) * -1) / 2);
        if (gamepad1.x) {
          flywheel.setPower(1);
          rampAsDcMotor.setPower(1);
        }
        if (gamepad1.y) {
          flywheel.setPower(0);
          rampAsDcMotor.setPower(0);
        }
        if (gamepad1.left_trigger > 0) {
          flywheel.setPower(1);
          rampAsDcMotor.setPower(1);
        }
        telemetry.update();
      }
    }
  }
}
