package com.example;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock Feline feline;

    private final String sex;
    private final boolean expected;

    public TestLion(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getLionSex () {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void TestLionSimbaHasMane() throws Exception{
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
}