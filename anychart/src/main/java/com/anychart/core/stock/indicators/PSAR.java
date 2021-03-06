package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Parabolic SAR (PSAR) indicator class.
 */
public class PSAR extends JsObject {

    protected PSAR() {

    }

    public static PSAR instantiate() {
        return new PSAR("new anychart.core.stock.indicators.pSAR()");
    }

    

    public PSAR(String jsChart) {
        jsBase = "pSAR" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the acceleration factor increment value.
     */
    public void accelerationFactorIncrement() {
        APIlib.getInstance().addJSLine(jsBase + ".accelerationFactorIncrement();");
    }
    /**
     * Setter for the acceleration factor increment value.
     */
    public com.anychart.core.stock.indicators.PSAR accelerationFactorIncrement(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".accelerationFactorIncrement(%s);", value));

        return this;
    }
    /**
     * Getter for the acceleration factor maximum.
     */
    public void accelerationFactorMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".accelerationFactorMaximum();");
    }
    /**
     * Setter for the acceleration factor maximum.
     */
    public com.anychart.core.stock.indicators.PSAR accelerationFactorMaximum(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".accelerationFactorMaximum(%s);", value));

        return this;
    }
    /**
     * Getter for the acceleration factor start.
     */
    public void accelerationFactorStart() {
        APIlib.getInstance().addJSLine(jsBase + ".accelerationFactorStart();");
    }
    /**
     * Setter for the acceleration factor start.
     */
    public com.anychart.core.stock.indicators.PSAR accelerationFactorStart(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".accelerationFactorStart(%s);", value));

        return this;
    }
    /**
     * Getter for the indicator series.
     */
    public com.anychart.core.stock.series.Base series() {
        return new com.anychart.core.stock.series.Base(jsBase + ".series()");
    }
    /**
     * Setter for the indicator series.
     */
    public com.anychart.core.stock.indicators.PSAR series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series.
     */
    public com.anychart.core.stock.indicators.PSAR series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}