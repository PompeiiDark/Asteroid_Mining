package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
  Settler settler = new Settler();

  public void enggame(){
  }

  public void initial() throws IOException {
    String enter;
    UnitTest.methodTest("Game.Initial()");
    System.out.println("please choose play mode");
    System.out.println("1:SinglePlayer");
    System.out.println("2.MultiplePlayer");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    enter = br.readLine();
    int num = Integer.parseInt(enter);
    if(num==1){
      SinglePlayer();
    }

    if(num==2){
      MultiplePlayer();
    }
    else
      System.out.println("Invalid choose");
  }

  private void MultiplePlayer() {
    UnitTest.methodTest("Game.MultiplePlayer()");
    Sun sun = new Sun();
  }

  private void SinglePlayer() {
    UnitTest.methodTest("Game.SinglePlayer");
    Sun sun = new Sun();
  }

  public void InitialPosition(){
    Sun sun = new Sun();
  }
}
