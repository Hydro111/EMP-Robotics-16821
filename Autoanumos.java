package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Autoanumos (Blocks to Java)", group = "")
public class Autoanumos extends LinearOpMode {

  private DcMotor motor2AsDcMotor;
  private DcMotor motor1AsDcMotor;
  private DcMotor motor0AsDcMotor;
  private DcMotor motor3AsDcMotor;
  private DcMotor flywheel;
  private double[] color;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    motor2AsDcMotor = hardwareMap.get(DcMotor.class, "motor2AsDcMotor");
    motor1AsDcMotor = hardwareMap.get(DcMotor.class, "motor1AsDcMotor");
    motor0AsDcMotor = hardwareMap.get(DcMotor.class, "motor0AsDcMotor");
    motor3AsDcMotor = hardwareMap.get(DcMotor.class, "motor3AsDcMotor");
    flywheel = hardwareMap.get(DcMotor.class, "flywheel");
    color = hardwareMap.ColorSensor.argb;
    //It's importaint ^this line^ dosen't use a .get method so it passes by reference

    // Put initialization blocks here.
    waitForStart();
    motor2AsDcMotor.setPower(0.25);
    motor1AsDcMotor.setPower(0.25);
    motor0AsDcMotor.setPower(0.25);
    motor3AsDcMotor.setPower(0.25);
    // wait until on line
    while (color[1] < 190){;}
    //Drive.stop()
    motor2AsDcMotor.setPower(0.0);
    motor1AsDcMotor.setPower(0.0);
    motor0AsDcMotor.setPower(0.0);
    motor3AsDcMotor.setPower(0.0);
    sleep(100);
    motor2AsDcMotor.setPower(-0.1);
    motor1AsDcMotor.setPower(-0.1);
    motor0AsDcMotor.setPower(-0.1);
    motor3AsDcMotor.setPower(-0.1);
    sleep(200);
    //Drive.stop()
    motor2AsDcMotor.setPower(0.0);
    motor1AsDcMotor.setPower(0.0);
    motor0AsDcMotor.setPower(0.0);
    motor3AsDcMotor.setPower(0.0);
    sleep(500);
    flywheel.setPower(0.9);
    sleep(1500);
    flywheel.setPower(0.0);
    if (opModeIsActive()) {
      // Put run blocks here.
    }
  }
}
