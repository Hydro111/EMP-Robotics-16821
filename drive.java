package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Autoanumos (Blocks to Java)", group = "")
public class Autoanumos extends LinearOpMode {

  private ColorSensor sensor_colorAsColorSensor;
  private DcMotor motor2AsDcMotor;
  private DcMotor motor1AsDcMotor;
  private DcMotor motor0AsDcMotor;
  private DcMotor motor3AsDcMotor;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    sensor_colorAsColorSensor = hardwareMap.get(ColorSensor.class, "sensor_colorAsColorSensor");
    motor2AsDcMotor = hardwareMap.get(DcMotor.class, "motor2AsDcMotor");
    motor1AsDcMotor = hardwareMap.get(DcMotor.class, "motor1AsDcMotor");
    motor0AsDcMotor = hardwareMap.get(DcMotor.class, "motor0AsDcMotor");
    motor3AsDcMotor = hardwareMap.get(DcMotor.class, "motor3AsDcMotor");
  }
}


public class Drive {
  static void stop() {
    motor2AsDcMotor.setPower(0.0);
    motor1AsDcMotor.setPower(0.0);
    motor0AsDcMotor.setPower(0.0);
    motor3AsDcMotor.setPower(0.0);
  }
  
  static void forTime(speed, degps, time){
    pass
    //Unfinished
  }
}
