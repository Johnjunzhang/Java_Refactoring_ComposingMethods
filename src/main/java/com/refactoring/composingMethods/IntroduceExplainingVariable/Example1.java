package com.refactoring.composingMethods.IntroduceExplainingVariable;

public class Example1 {
    public boolean isResizableIEInMac(String platform, String browser, int resize)
    {
        return platform.indexOf("MAC") > -1 && browser.indexOf("IE") > -1 && resize > 0;
    }
}
