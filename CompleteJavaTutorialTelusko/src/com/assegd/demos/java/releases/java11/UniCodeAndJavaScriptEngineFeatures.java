package com.assegd.demos.java.releases.java11;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class UniCodeAndJavaScriptEngineFeatures {
    public static void main(String[] args) throws ScriptException {
        System.out.print("Printing Cryptocurency symbol from java:- " + " \u20BF");

        System.out.println("\nNashortn Javascript Engine yet to be removed in the coming releases but still in use in java 11");
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('help, i am dying!');");
    }
}
