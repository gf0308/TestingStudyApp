package com.study.testingstudyapp.chapter01;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ScoreCollectionTest {
    private static int getScore() {
        return 5;
    }

    /*@Test
    public void test() {
        fail("Not yet implemented");
    }*/

    @Test
    public void answerArithmeticMeanOfTwoNumbers() {
        // 준비
        ScoreCollection collection = new ScoreCollection();
        collection.add( () -> 5 );
        collection.add( () -> 7 );

        // 실행
        int actualResult = collection.arithmeticMean();

        // 단언
        assertThat(actualResult, equalTo(6));
//        assertEquals(actualResult,6);
    }

}