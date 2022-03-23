package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.*;

public class Settler {
    Sun sun = new Sun();
    Asteroids asteroids = new Asteroids();
    ArrayList<String> resources = new ArrayList<String>();
    TP_GATE tp_gate = new TP_GATE();
    Resource resource = new Resource();

    public void Build_space_station(){

    }

    public void Build_robot(){

    }

    public void Drill(){

    }

    public void Mine(Asteroids asteroids) throws IOException {
        Settler settler = new Settler();
        UnitTest.methodTest("Settler.Mine()");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        settler.CarryResource();
        asteroids.removeresoure();
        UnitTest.TestEnd("Settler.Mine()");
    }

    private ArrayList<String> CarryResource() {
        UnitTest.methodTest("Settler.CarryResource()");
        UnitTest.TestEnd("Settler.CarryResource()");
        return resources;
    }

}
