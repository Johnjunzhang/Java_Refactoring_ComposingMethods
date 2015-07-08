package com.composingMethods;

import com.refactoring.composingMethods.ReplaceMethodWithMethodObject.ReplaceMethodWithMethodObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceMethodWithMethodObjectFact {
    @Test
    public void should_get_right_gamma_given()
    {
        ReplaceMethodWithMethodObject replaceMethodWithMethodObject = new ReplaceMethodWithMethodObject();
        int gamma = replaceMethodWithMethodObject.gamma(10, 5, 100);
        assertEquals(7600, gamma);
    }
}
