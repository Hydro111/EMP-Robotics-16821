package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import Math;

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
    
    motor1A = motor0AsDcMotor;
    motor2A = motor1AsDcMotor;
    motor1B = motor2AsDcMotor;
    motor2B = motor3AsDcMotor;
    // 1A 2A
    // 1B 2B
  }
}


public class Drive {
  
  public float distCenter = 14;
  
  static void stop() {
    motor1A.setPower(0.0);
    motor2A.setPower(0.0);
    motor1B.setPower(0.0);
    motor2B.setPower(0.0);
    //Set wheels to forward position
  }
  
  static void moveTurn(speed, turn, strafe){
    public float s2 = (2*Math.PI*distCenter*turn/360 + 2*speed) / 2;
    public float s1 = 2*speed - s2;
    motor1A.setPower(s2);
    motor2A.setPower(s1);
    motor1B.setPower(s2);
    motor2B.setPower(s1);
    
    //TODO: add strafe capability?
  }
  
  static void turn(power){
    //put wheels in rotation posittion
    motor1A.setPower(power);
    motor2A.setPower(power);
    motor1B.setPower(power);
    motor2B.setPower(power);
  }
  
  static void move(power, strafe){
    //set wheels to angle %strafe%
    motor1A.setPower(power);
    motor2A.setPower(power);
    motor1B.setPower(power);
    motor2B.setPower(power);
  }
}
