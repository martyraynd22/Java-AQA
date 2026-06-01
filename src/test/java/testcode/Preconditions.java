package testcode;

import TestCode.HomeWork;
import org.junit.jupiter.api.BeforeEach;

public class Preconditions {
    public HomeWork homeWork;

    @BeforeEach
    void setup(){
        homeWork = new HomeWork();
    }
}
