package com.anychart.charts;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.core.SeparateChart;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Cartesian chart class.<br/>
To get the chart use any of these methods:
 <ul>
     <li>{@link anychart#cartesian}</li>
     <li>{@link anychart#area}</li>
     <li>{@link anychart#bar}</li>
     <li>{@link anychart#column}</li>
     <li>{@link anychart#financial}</li>
     <li>{@link anychart#line}</li>
 </ul>
Chart can contain any number of series.
Each series is interactive, you can customize click and hover behavior and other parameters.
 */
public class Cartesian extends SeparateChart {

    protected Cartesian() {

    }

    public static Cartesian instantiate() {
        return new Cartesian("new anychart.charts.cartesian()");
    }

    

    public Cartesian(String jsChart) {
        jsBase = "cartesian" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds series to the chart.
     */
    public void addSeries(com.anychart.data.View var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.getJsBase() : null));
    }
    /**
     * Adds series to the chart.
     */
    public void addSeries(com.anychart.data.Set var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.getJsBase() : null));
    }
    /**
     * Adds series to the chart.
     */
    public void addSeries(String[] var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", arrayToStringWrapQuotes(var_args)));
    }
    /**
     * Getter for the current animation settings.
     */
    public com.anychart.core.utils.Animation animation() {
        return new com.anychart.core.utils.Animation(jsBase + ".animation()");
    }
    /**
     * Setter for the animation settings by one value.
     */
    public com.anychart.charts.Cartesian animation(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".animation(%s);", value));

        return this;
    }
    /**
     * Setter for the animation settings by one value.
     */
    public com.anychart.charts.Cartesian animation(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".animation(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the animation settings using of several parameters.
     */
    public com.anychart.charts.Cartesian animation(Boolean enabled, Number duration) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".animation(%s, %s);", enabled, duration));

        return this;
    }
    /**
     * Getter for the annotations.
     */
    public com.anychart.core.annotations.PlotController annotations() {
        return new com.anychart.core.annotations.PlotController(jsBase + ".annotations()");
    }
    /**
     * Setter for the annotations.
     */
    public com.anychart.charts.Cartesian annotations(String[] annotationsList) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".annotations(%s);", arrayToStringWrapQuotes(annotationsList)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Area area(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Area(String.format(Locale.US, jsBase + ".area(%s)", arrayToString(data)));
    }
    /**
     * Getter for the autoRedraw flag. <br/>
Flag whether to automatically call chart.draw() on any changes or not.
     */
    public void autoRedraw() {
        APIlib.getInstance().addJSLine(jsBase + ".autoRedraw();");
    }
    /**
     * Setter for the autoRedraw flag.<br/>
Flag whether to automatically call chart.draw() on any changes or not.
     */
    public com.anychart.charts.Cartesian autoRedraw(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".autoRedraw(%s);", value));

        return this;
    }
    /**
     * Getter for the current chart background.
     */
    public com.anychart.core.ui.Background background() {
        return new com.anychart.core.ui.Background(jsBase + ".background()");
    }
    /**
     * Setter for the chart background settings.
     */
    public com.anychart.charts.Cartesian background(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart background settings.
     */
    public com.anychart.charts.Cartesian background(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Bar bar(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Bar(String.format(Locale.US, jsBase + ".bar(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current space between bar groups on the ordinal scale by ratio of bars width.
     */
    public void barGroupsPadding() {
        APIlib.getInstance().addJSLine(jsBase + ".barGroupsPadding();");
    }
    /**
     * Setter for the space between bar groups on the ordinal scale by ratio of bars width.<br/>
See illustration at {@link anychart.charts.Cartesian#barsPadding}.
     */
    public com.anychart.charts.Cartesian barGroupsPadding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".barGroupsPadding(%s);", value));

        return this;
    }
    /**
     * Getter for the space between bars on the ordinal scale by ratio of bars width.
     */
    public void barsPadding() {
        APIlib.getInstance().addJSLine(jsBase + ".barsPadding();");
    }
    /**
     * Setter for the space between bars on the ordinal scale by ratio of bars width.</br>
<img src='/si/8.2.1/anychart.charts.Cartesian.barsPadding.png' width='396' height='294'/>
     */
    public com.anychart.charts.Cartesian barsPadding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".barsPadding(%s);", value));

        return this;
    }
    /**
     * Getter for the current chart's bottom bound setting.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for the chart's bottom bound setting.
     */
    public com.anychart.charts.Cartesian bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's bottom bound setting.
     */
    public com.anychart.charts.Cartesian bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart bounds settings.
     */
    public com.anychart.core.utils.Bounds bounds() {
        return new com.anychart.core.utils.Bounds(jsBase + ".bounds()");
    }
    /**
     * Setter for the chart bounds using one parameter.
     */
    public com.anychart.charts.Cartesian bounds(com.anychart.utils.RectObj value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart bounds using one parameter.
     */
    public com.anychart.charts.Cartesian bounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart bounds using one parameter.
     */
    public com.anychart.charts.Cartesian bounds(com.anychart.core.utils.Bounds value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for the chart bounds settings.
     */
    public com.anychart.charts.Cartesian bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Box box(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Box(String.format(Locale.US, jsBase + ".box(%s)", arrayToString(data)));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Bubble bubble(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Bubble(String.format(Locale.US, jsBase + ".bubble(%s)", arrayToString(data)));
    }
    /**
     * Stops current marquee action if any.
     */
    public com.anychart.charts.Cartesian cancelMarquee() {
        APIlib.getInstance().addJSLine(jsBase + ".cancelMarquee();");

        return this;
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Candlestick series.
     */
    public com.anychart.core.cartesian.series.Candlestick candlestick(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Candlestick(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Column column(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Column(String.format(Locale.US, jsBase + ".column(%s)", arrayToString(data)));
    }
    /**
     * Getter for the chart container.
     */
    public com.anychart.graphics.vector.Layer container() {
        return new com.anychart.graphics.vector.Layer(jsBase + ".container()");
    }
    /**
     * Setter for the chart container.
     */
    public com.anychart.charts.Cartesian container(com.anychart.graphics.vector.Layer value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart container.
     */
    public com.anychart.charts.Cartesian container(com.anychart.graphics.vector.Stage value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart container.
     */
    public com.anychart.charts.Cartesian container(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the context menu.
     */
    public com.anychart.ui.ContextMenu contextMenu() {
        return new com.anychart.ui.ContextMenu(jsBase + ".contextMenu()");
    }
    /**
     * Setter for the context menu.
     */
    public com.anychart.charts.Cartesian contextMenu(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".contextMenu(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the context menu.
     */
    public com.anychart.charts.Cartesian contextMenu(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".contextMenu(%s);", value));

        return this;
    }
    /**
     * Getter for the current credits.
     */
    public com.anychart.core.ui.ChartCredits credits() {
        return new com.anychart.core.ui.ChartCredits(jsBase + ".credits()");
    }
    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public com.anychart.charts.Cartesian credits(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".credits(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public com.anychart.charts.Cartesian credits(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".credits(%s);", value));

        return this;
    }
    /**
     * Getter for the current crosshair settings.
     */
    public com.anychart.core.ui.Crosshair crosshair() {
        return new com.anychart.core.ui.Crosshair(jsBase + ".crosshair()");
    }
    /**
     * Setter for the crosshair settings.
     */
    public com.anychart.charts.Cartesian crosshair(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crosshair(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the crosshair settings.
     */
    public com.anychart.charts.Cartesian crosshair(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crosshair(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current default series type.
     */
    public void defaultSeriesType() {
        APIlib.getInstance().addJSLine(jsBase + ".defaultSeriesType();");
    }
    /**
     * Setter for the default series type.
     */
    public com.anychart.charts.Cartesian defaultSeriesType(com.anychart.enums.CartesianSeriesType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the default series type.
     */
    public com.anychart.charts.Cartesian defaultSeriesType(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Disposes charts.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Starts the rendering of the chart into the container.
     */
    public com.anychart.charts.Cartesian draw(Boolean async) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".draw(%s);", async));

        return this;
    }
    /**
     * Getter for the element state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the element enabled state.
     */
    public com.anychart.charts.Cartesian enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the export charts.
     */
    public com.anychart.core.utils.Exports exports() {
        return new com.anychart.core.utils.Exports(jsBase + ".exports()");
    }
    /**
     * Setter for the export charts.
     */
    public com.anychart.charts.Cartesian exports(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".exports(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Returns pixel bounds of the chart.<br/>
Returns pixel bounds of the chart due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * Getter for the current data bounds of the chart.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} is called.
     */
    public com.anychart.math.Rect getPlotBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPlotBounds()");
    }
    /**
     * Getter for the selected points.
     */
    public void getSelectedPoints() {
        APIlib.getInstance().addJSLine(jsBase + ".getSelectedPoints();");
    }
    /**
     * Getter for the series by its id.
     */
    public com.anychart.core.cartesian.series.Base getSeries(Number id) {
        return new com.anychart.core.cartesian.series.Base(String.format(Locale.US, jsBase + ".getSeries(%s)", id));
    }
    /**
     * Getter for the series by its id.
     */
    public com.anychart.core.cartesian.series.Base getSeries(String id) {
        return new com.anychart.core.cartesian.series.Base(String.format(Locale.US, jsBase + ".getSeries(%s)", wrapQuotes(id)));
    }
    /**
     * Getter for the series by its index.
     */
    public com.anychart.core.cartesian.series.Base getSeriesAt(Number index) {
        return new com.anychart.core.cartesian.series.Base(String.format(Locale.US, jsBase + ".getSeriesAt(%s)", index));
    }
    /**
     * Returns the number of series in a chart.
     */
    public void getSeriesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getSeriesCount();");
    }
    /**
     * Getter for a statistical value by the key.
     */
    public void getStat(com.anychart.enums.Statistics key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", (key != null) ? key.getJsBase() : null));
    }
    /**
     * Getter for a statistical value by the key.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }
    /**
     * Returns chart type.
     */
    public void getType() {
        APIlib.getInstance().addJSLine(jsBase + ".getType();");
    }
    /**
     * Returns the number of X-axes.
     */
    public void getXAxesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getXAxesCount();");
    }
    /**
     * Returns chart X scales.
     */
    public void getXScales() {
        APIlib.getInstance().addJSLine(jsBase + ".getXScales();");
    }
    /**
     * Returns the number of Y-axes.
     */
    public void getYAxesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getYAxesCount();");
    }
    /**
     * Returns chart Y scales.
     */
    public void getYScales() {
        APIlib.getInstance().addJSLine(jsBase + ".getYScales();");
    }
    /**
     * Converts the global coordinates to local coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void globalToLocal(Number xCoord, Number yCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".globalToLocal(%s, %s);", xCoord, yCoord));
    }
    /**
     * Getter for the current hatch fill palette settings.
     */
    public com.anychart.palettes.HatchFills hatchFillPalette() {
        return new com.anychart.palettes.HatchFills(jsBase + ".hatchFillPalette()");
    }
    /**
     * Setter for hatch fill palette settings.
     */
    public com.anychart.charts.Cartesian hatchFillPalette(com.anychart.graphics.vector.hatchfill.HatchFillType[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", arrayToString(value)));

        return this;
    }
    /**
     * Setter for hatch fill palette settings.
     */
    public com.anychart.charts.Cartesian hatchFillPalette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for hatch fill palette settings.
     */
    public com.anychart.charts.Cartesian hatchFillPalette(com.anychart.palettes.HatchFills value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the current chart's height setting.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the chart's height setting.
     */
    public com.anychart.charts.Cartesian height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's height setting.
     */
    public com.anychart.charts.Cartesian height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Hilo hilo(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Hilo(String.format(Locale.US, jsBase + ".hilo(%s)", arrayToString(data)));
    }
    /**
     * Getter for hovered state settings.
     */
    public com.anychart.core.StateSettings hovered() {
        return new com.anychart.core.StateSettings(jsBase + ".hovered()");
    }
    /**
     * Setter for hovered state settings.
     */
    public com.anychart.charts.Cartesian hovered(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Gets marquee process running value.
     */
    public void inMarquee() {
        APIlib.getInstance().addJSLine(jsBase + ".inMarquee();");
    }
    /**
     * Getter for the current interactivity settings.
     */
    public com.anychart.core.utils.Interactivity interactivity() {
        return new com.anychart.core.utils.Interactivity(jsBase + ".interactivity()");
    }
    /**
     * Setter for the interactivity settings.
     */
    public com.anychart.charts.Cartesian interactivity(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interactivity(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the interactivity settings.
     */
    public com.anychart.charts.Cartesian interactivity(com.anychart.enums.HoverMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interactivity(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the layout direction.
     */
    public void isVertical() {
        APIlib.getInstance().addJSLine(jsBase + ".isVertical();");
    }
    /**
     * Setter for the layout direction.
     */
    public com.anychart.charts.Cartesian isVertical(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".isVertical(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.JumpLine jumpLine(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.JumpLine(String.format(Locale.US, jsBase + ".jumpLine(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current chart label.
     */
    public com.anychart.core.ui.Label label(String index) {
        return new com.anychart.core.ui.Label(String.format(Locale.US, jsBase + ".label(%s)", wrapQuotes(index)));
    }
    /**
     * Getter for the current chart label.
     */
    public com.anychart.core.ui.Label label(Number index) {
        return new com.anychart.core.ui.Label(String.format(Locale.US, jsBase + ".label(%s)", index));
    }
    /**
     * Setter for the chart label.
     */
    public com.anychart.charts.Cartesian label(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s);", value));

        return this;
    }
    /**
     * Setter for chart label using index.
     */
    public com.anychart.charts.Cartesian label(String index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), value));

        return this;
    }
    /**
     * Setter for chart label using index.
     */
    public com.anychart.charts.Cartesian label(String index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for chart label using index.
     */
    public com.anychart.charts.Cartesian label(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for chart label using index.
     */
    public com.anychart.charts.Cartesian label(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for series data labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for series data labels.
     */
    public com.anychart.charts.Cartesian labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for series data labels.
     */
    public com.anychart.charts.Cartesian labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
    }
    /**
     * Getter for the current chart's left bound setting.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for the chart's left bound setting.
     */
    public com.anychart.charts.Cartesian left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's left bound setting.
     */
    public com.anychart.charts.Cartesian left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart legend.
     */
    public com.anychart.core.ui.Legend legend() {
        return new com.anychart.core.ui.Legend(jsBase + ".legend()");
    }
    /**
     * Setter for the chart legend setting.
     */
    public com.anychart.charts.Cartesian legend(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legend(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart legend setting.
     */
    public com.anychart.charts.Cartesian legend(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legend(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Line line(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current line marker.
     */
    public com.anychart.core.axismarkers.Line lineMarker(Number index) {
        return new com.anychart.core.axismarkers.Line(String.format(Locale.US, jsBase + ".lineMarker(%s)", index));
    }
    /**
     * Setter for the line marker settings.
     */
    public com.anychart.charts.Cartesian lineMarker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the line marker settings.
     */
    public com.anychart.charts.Cartesian lineMarker(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s);", value));

        return this;
    }
    /**
     * Setter for the line marker settings by index.
     */
    public com.anychart.charts.Cartesian lineMarker(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the line marker settings by index.
     */
    public com.anychart.charts.Cartesian lineMarker(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, value));

        return this;
    }
    /**
     * Converts the local coordinates to global coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void localToGlobal(Number xCoord, Number yCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".localToGlobal(%s, %s);", xCoord, yCoord));
    }
    /**
     * Getter for the chart margin.<br/>
<img src='/si/8.2.1/anychart.core.Chart.prototype.margin.png' width='352' height='351'/>
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public com.anychart.charts.Cartesian margin(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public com.anychart.charts.Cartesian margin(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public com.anychart.charts.Cartesian margin(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian margin(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Marker marker(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Marker(String.format(Locale.US, jsBase + ".marker(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current chart markers palette settings.
     */
    public com.anychart.palettes.Markers markerPalette() {
        return new com.anychart.palettes.Markers(jsBase + ".markerPalette()");
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.charts.Cartesian markerPalette(com.anychart.palettes.Markers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.charts.Cartesian markerPalette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.charts.Cartesian markerPalette(com.anychart.enums.MarkerType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.charts.Cartesian markerPalette(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current maximum size for all bubbles on the charts.
     */
    public void maxBubbleSize() {
        APIlib.getInstance().addJSLine(jsBase + ".maxBubbleSize();");
    }
    /**
     * Setter for the maximum size for all bubbles on the charts.<br/>
     */
    public com.anychart.charts.Cartesian maxBubbleSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxBubbleSize(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum size for all bubbles on the charts.<br/>
     */
    public com.anychart.charts.Cartesian maxBubbleSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxBubbleSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart's maximum height.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the chart's maximum height.
     */
    public com.anychart.charts.Cartesian maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's maximum height.
     */
    public com.anychart.charts.Cartesian maxHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for maximum labels.
     */
    public com.anychart.core.ui.LabelsFactory maxLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".maxLabels()");
    }
    /**
     * Setter for maximum labels.
     */
    public com.anychart.charts.Cartesian maxLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for maximum labels.
     */
    public com.anychart.charts.Cartesian maxLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for the maximum point width.
     */
    public void maxPointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxPointWidth();");
    }
    /**
     * Setter for the maximum point width.
     */
    public com.anychart.charts.Cartesian maxPointWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum point width.
     */
    public com.anychart.charts.Cartesian maxPointWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart's maximum width.
     */
    public void maxWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxWidth();");
    }
    /**
     * Setter for the chart's maximum width.
     */
    public com.anychart.charts.Cartesian maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's maximum width.
     */
    public com.anychart.charts.Cartesian maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current minimum size for all bubbles on the charts.
     */
    public void minBubbleSize() {
        APIlib.getInstance().addJSLine(jsBase + ".minBubbleSize();");
    }
    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public com.anychart.charts.Cartesian minBubbleSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minBubbleSize(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public com.anychart.charts.Cartesian minBubbleSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minBubbleSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart's minimum height.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the chart's minimum height.
     */
    public com.anychart.charts.Cartesian minHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's minimum height.
     */
    public com.anychart.charts.Cartesian minHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for minimum labels.
     */
    public com.anychart.core.ui.LabelsFactory minLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minLabels()");
    }
    /**
     * Setter for minimum labels.
     */
    public com.anychart.charts.Cartesian minLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for minimum labels.
     */
    public com.anychart.charts.Cartesian minLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for the minimum point length.
     */
    public void minPointLength() {
        APIlib.getInstance().addJSLine(jsBase + ".minPointLength();");
    }
    /**
     * Setter for the minimum point length.
     */
    public com.anychart.charts.Cartesian minPointLength(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPointLength(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum point length.
     */
    public com.anychart.charts.Cartesian minPointLength(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPointLength(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart's minimum width.
     */
    public void minWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".minWidth();");
    }
    /**
     * Setter for the chart's minimum width.
     */
    public com.anychart.charts.Cartesian minWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's minimum width.
     */
    public com.anychart.charts.Cartesian minWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for noData settings.
     */
    public com.anychart.core.NoDataSettings noData() {
        return new com.anychart.core.NoDataSettings(jsBase + ".noData()");
    }
    /**
     * Setter for noData settings.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
     */
    public com.anychart.charts.Cartesian noData(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".noData(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for normal state settings.
     */
    public com.anychart.core.StateSettings normal() {
        return new com.anychart.core.StateSettings(jsBase + ".normal()");
    }
    /**
     * Setter for normal state settings.
     */
    public com.anychart.charts.Cartesian normal(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.OHLC ohlc(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.OHLC(String.format(Locale.US, jsBase + ".ohlc(%s)", arrayToString(data)));
    }
    /**
     * Getter for the chart padding.<br/>
<img src='/si/8.2.1/anychart.core.Chart.prototype.padding.png' width='352' height='351'/>
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public com.anychart.charts.Cartesian padding(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public com.anychart.charts.Cartesian padding(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public com.anychart.charts.Cartesian padding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian padding(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for the current series colors palette.
     */
    public com.anychart.palettes.RangeColors palette() {
        return new com.anychart.palettes.RangeColors(jsBase + ".palette()");
    }
    /**
     * Setter for the current series colors palette.
     */
    public com.anychart.charts.Cartesian palette(com.anychart.palettes.RangeColors value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the current series colors palette.
     */
    public com.anychart.charts.Cartesian palette(com.anychart.palettes.DistinctColors value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the current series colors palette.
     */
    public com.anychart.charts.Cartesian palette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the current series colors palette.
     */
    public com.anychart.charts.Cartesian palette(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the point width settings.
     */
    public void pointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".pointWidth();");
    }
    /**
     * Setter for the point width settings.
     */
    public com.anychart.charts.Cartesian pointWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pointWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the point width settings.
     */
    public com.anychart.charts.Cartesian pointWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pointWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Prints chart.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSize, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSize != null) ? paperSize.getJsBase() : null, landscape));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Area series.
     */
    public com.anychart.core.cartesian.series.RangeArea rangeArea(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeArea(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Bar series.
     */
    public com.anychart.core.cartesian.series.RangeBar rangeBar(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeBar(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.RangeColumn rangeColumn(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.RangeColumn(String.format(Locale.US, jsBase + ".rangeColumn(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current range marker.
     */
    public com.anychart.core.axismarkers.Range rangeMarker(Number index) {
        return new com.anychart.core.axismarkers.Range(String.format(Locale.US, jsBase + ".rangeMarker(%s)", index));
    }
    /**
     * Setter for the range marker.
     */
    public com.anychart.charts.Cartesian rangeMarker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the range marker.
     */
    public com.anychart.charts.Cartesian rangeMarker(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s);", value));

        return this;
    }
    /**
     * Setter for the range marker by index.
     */
    public com.anychart.charts.Cartesian rangeMarker(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the range marker by index.
     */
    public com.anychart.charts.Cartesian rangeMarker(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, value));

        return this;
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Spline Area series.
     */
    public com.anychart.core.cartesian.series.RangeSplineArea rangeSplineArea(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeSplineArea(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Range Step Area series.
     */
    public com.anychart.core.cartesian.series.RangeStepArea rangeStepArea(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.RangeStepArea(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes all series from chart.
     */
    public com.anychart.charts.Cartesian removeAllSeries() {
        APIlib.getInstance().addJSLine(jsBase + ".removeAllSeries();");

        return this;
    }
    /**
     * Removes one of series from chart by its id.
     */
    public com.anychart.charts.Cartesian removeSeries(Number id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeries(%s);", id));

        return this;
    }
    /**
     * Removes one of series from chart by its id.
     */
    public com.anychart.charts.Cartesian removeSeries(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeries(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Removes one of series from chart by its index.
     */
    public com.anychart.charts.Cartesian removeSeriesAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeriesAt(%s);", index));

        return this;
    }
    /**
     * Getter for the current chart's right bound setting.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for the chart's right bound setting.
     */
    public com.anychart.charts.Cartesian right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's right bound setting.
     */
    public com.anychart.charts.Cartesian right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(Number width, Number height, Number quality, Boolean forceTransparentWhite) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %s, %s, %s);", width, height, quality, forceTransparentWhite));
    }
    /**
     * Saves chart config as JSON document.
     */
    public void saveAsJson(String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsJson(%s);", wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(String paperSize, Boolean landscape, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %s, %s, %s);", wrapQuotes(paperSize), landscape, x, y));
    }
    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(Number width, Number height, Number quality) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPng(%s, %s, %s);", width, height, quality));
    }
    /**
     * Saves the current chart as SVG image using paper size and landscape.
     */
    public void saveAsSvg(String paperSize, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s);", wrapQuotes(paperSize), landscape));
    }
    /**
     * Saves the stage as SVG image using width and height.
     */
    public void saveAsSvg(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s);", width, height));
    }
    /**
     * Saves chart data as an Excel document.
     */
    public void saveAsXlsx(com.anychart.enums.ChartDataExportMode chartDataExportMode, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", (chartDataExportMode != null) ? chartDataExportMode.getJsBase() : null, wrapQuotes(filename)));
    }
    /**
     * Saves chart data as an Excel document.
     */
    public void saveAsXlsx(String chartDataExportMode, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", wrapQuotes(chartDataExportMode), wrapQuotes(filename)));
    }
    /**
     * Saves chart config as XML document.
     */
    public void saveAsXml(String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsXml(%s);", wrapQuotes(filename)));
    }
    /**
     * Getter for the select marquee fill.
     */
    public void selectMarqueeFill() {
        APIlib.getInstance().addJSLine(jsBase + ".selectMarqueeFill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the select marquee stroke.
     */
    public void selectMarqueeStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".selectMarqueeStroke();");
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian selectMarqueeStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for selected state settings.
     */
    public com.anychart.core.StateSettings selected() {
        return new com.anychart.core.StateSettings(jsBase + ".selected()");
    }
    /**
     * Setter for selected state settings.
     */
    public com.anychart.charts.Cartesian selected(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline series.
     */
    public com.anychart.core.cartesian.series.Spline spline(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Spline(String.format(Locale.US, jsBase + ".spline(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Spline Area series.
     */
    public com.anychart.core.cartesian.series.SplineArea splineArea(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.SplineArea(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Starts select marquee drawing.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public com.anychart.charts.Cartesian startSelectMarquee(Boolean repeat) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startSelectMarquee(%s);", repeat));

        return this;
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Area series.
     */
    public com.anychart.core.cartesian.series.StepArea stepArea(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepArea(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Step Line series.
     */
    public com.anychart.core.cartesian.series.StepLine stepLine(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.StepLine(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds Stick series.
     */
    public com.anychart.core.cartesian.series.Stick stick(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Stick(String.format(Locale.US, jsBase + ".stick(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Getter for the current text marker.
     */
    public com.anychart.core.axismarkers.Text textMarker(Number index) {
        return new com.anychart.core.axismarkers.Text(String.format(Locale.US, jsBase + ".textMarker(%s)", index));
    }
    /**
     * Setter for the text marker.
     */
    public com.anychart.charts.Cartesian textMarker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text marker.
     */
    public com.anychart.charts.Cartesian textMarker(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s);", value));

        return this;
    }
    /**
     * Setter for the text marker by index.
     */
    public com.anychart.charts.Cartesian textMarker(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text marker by index.
     */
    public com.anychart.charts.Cartesian textMarker(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the current chart title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the chart title.
     */
    public com.anychart.charts.Cartesian title(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", value));

        return this;
    }
    /**
     * Setter for the chart title.
     */
    public com.anychart.charts.Cartesian title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Returns chart configuration as JSON object or string.
     */
    public void toJson(Boolean stringify) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toJson(%s);", stringify));
    }
    /**
     * Returns SVG string using paper size and landscape.
     */
    public void toSvg(String paperSize, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", wrapQuotes(paperSize), landscape));
    }
    /**
     * Returns SVG string using width and height.
     */
    public void toSvg(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", width, height));
    }
    /**
     * Returns chart configuration as XML string or XMLNode.
     */
    public void toXml(Boolean asXmlNode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toXml(%s);", asXmlNode));
    }
    /**
     * Getter for the current chart tooltip.
     */
    public com.anychart.core.ui.Tooltip tooltip() {
        return new com.anychart.core.ui.Tooltip(jsBase + ".tooltip()");
    }
    /**
     * Setter for the chart tooltip.
     */
    public com.anychart.charts.Cartesian tooltip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart tooltip.
     */
    public com.anychart.charts.Cartesian tooltip(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", value));

        return this;
    }
    /**
     * Getter for the current chart's top bound setting.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for the chart's top bound setting.
     */
    public com.anychart.charts.Cartesian top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's top bound setting.
     */
    public com.anychart.charts.Cartesian top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

        return this;
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for the current chart's width setting.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the chart's width setting.
     */
    public com.anychart.charts.Cartesian width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for the chart's width setting.
     */
    public com.anychart.charts.Cartesian width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart X-axis.
     */
    public com.anychart.core.axes.Linear xAxis(Number index) {
        return new com.anychart.core.axes.Linear(String.format(Locale.US, jsBase + ".xAxis(%s)", index));
    }
    /**
     * Setter for the chart X-axis.
     */
    public com.anychart.charts.Cartesian xAxis(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart X-axis.
     */
    public com.anychart.charts.Cartesian xAxis(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", value));

        return this;
    }
    /**
     * Setter for the chart X-axis by index.
     */
    public com.anychart.charts.Cartesian xAxis(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart X-axis by index.
     */
    public com.anychart.charts.Cartesian xAxis(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart grid by X-scale.
     */
    public com.anychart.core.grids.Linear xGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".xGrid(%s)", index));
    }
    /**
     * Setter for the chart grid by X-scale.
     */
    public com.anychart.charts.Cartesian xGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart grid by X-scale.
     */
    public com.anychart.charts.Cartesian xGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s);", value));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian xGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian xGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart minor grid by X-scale.
     */
    public com.anychart.core.grids.Linear xMinorGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".xMinorGrid(%s)", index));
    }
    /**
     * Setter for the chart minor grid by X-scale.
     */
    public com.anychart.charts.Cartesian xMinorGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by X-scale.
     */
    public com.anychart.charts.Cartesian xMinorGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", value));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian xMinorGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian xMinorGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the current chart X-scale.
     */
    public com.anychart.scales.Base xScale() {
        return new com.anychart.scales.Base(jsBase + ".xScale()");
    }
    /**
     * Setter for the chart X-scale.
     */
    public com.anychart.charts.Cartesian xScale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart X-scale.
     */
    public com.anychart.charts.Cartesian xScale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart X-scale.
     */
    public com.anychart.charts.Cartesian xScale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the current scroller.
     */
    public com.anychart.core.ui.ChartScroller xScroller() {
        return new com.anychart.core.ui.ChartScroller(jsBase + ".xScroller()");
    }
    /**
     * Setter for the scroller.
     */
    public com.anychart.charts.Cartesian xScroller(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScroller(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the scroller.
     */
    public com.anychart.charts.Cartesian xScroller(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScroller(%s);", value));

        return this;
    }
    /**
     * Getter for the current zoom settings.
     */
    public com.anychart.core.utils.OrdinalZoom xZoom() {
        return new com.anychart.core.utils.OrdinalZoom(jsBase + ".xZoom()");
    }
    /**
     * Setter for the zoom settings.
     */
    public com.anychart.charts.Cartesian xZoom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xZoom(%s);", value));

        return this;
    }
    /**
     * Setter for the zoom settings.
     */
    public com.anychart.charts.Cartesian xZoom(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xZoom(%s);", value));

        return this;
    }
    /**
     * Setter for the zoom settings.
     */
    public com.anychart.charts.Cartesian xZoom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xZoom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the current chart Y-axis.
     */
    public com.anychart.core.axes.Linear yAxis(Number index) {
        return new com.anychart.core.axes.Linear(String.format(Locale.US, jsBase + ".yAxis(%s)", index));
    }
    /**
     * Setter for the chart Y-axis.
     */
    public com.anychart.charts.Cartesian yAxis(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart Y-axis.
     */
    public com.anychart.charts.Cartesian yAxis(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s);", value));

        return this;
    }
    /**
     * Setter for the chart Y-axis by index.
     */
    public com.anychart.charts.Cartesian yAxis(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart Y-axis by index.
     */
    public com.anychart.charts.Cartesian yAxis(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart grid by Y-scale.
     */
    public com.anychart.core.grids.Linear yGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".yGrid(%s)", index));
    }
    /**
     * Setter for the chart grid by Y-scale.
     */
    public com.anychart.charts.Cartesian yGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart grid by Y-scale.
     */
    public com.anychart.charts.Cartesian yGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s);", value));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian yGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian yGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public com.anychart.core.grids.Linear yMinorGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".yMinorGrid(%s)", index));
    }
    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public com.anychart.charts.Cartesian yMinorGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public com.anychart.charts.Cartesian yMinorGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", value));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian yMinorGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian yMinorGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the current chart Y-scale.
     */
    public com.anychart.scales.Linear yScale() {
        return new com.anychart.scales.Linear(jsBase + ".yScale()");
    }
    /**
     * Setter for the chart Y-scale.
     */
    public com.anychart.charts.Cartesian yScale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart Y-scale.
     */
    public com.anychart.charts.Cartesian yScale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart Y-scale.
     */
    public com.anychart.charts.Cartesian yScale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the current Z-index of the chart.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the chart.
     */
    public com.anychart.charts.Cartesian zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Getter for the accessibility setting.
     */
    public com.anychart.core.utils.ChartA11y a11y() {
        return new com.anychart.core.utils.ChartA11y(jsBase + ".a11y()");
    }
    /**
     * Setter for the accessibility setting.
     */
    public com.anychart.charts.Cartesian a11y(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".a11y(%s);", value));

        return this;
    }
    /**
     * Setter for the accessibility setting.
     */
    public com.anychart.charts.Cartesian a11y(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".a11y(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Returns JPG as base64 string.
     */
    public void getJpgBase64String(String onSuccessOrOptions, String onError, Number width, Number height, Number quality, Boolean forceTransparentWhite) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), width, height, quality, forceTransparentWhite));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, landscapeOrWidth, x, y));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, landscapeOrWidth, x, y));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y));
    }
    /**
     * Returns PNG as base64 string.
     */
    public void getPngBase64String(String onSuccessOrOptions, String onError, Number width, Number height, Number quality) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), width, height, quality));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, Boolean landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), landscapeOrHeight));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, String landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), wrapQuotes(landscapeOrHeight)));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, Boolean landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, landscapeOrHeight));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, String landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, wrapQuotes(landscapeOrHeight)));
    }
    /**
     * Shares a chart as a JPG file and returns a link to the shared image.
     */
    public void shareAsJpg(String onSuccessOrOptions, String onError, Boolean asBase64, Number width, Number height, Number quality, Boolean forceTransparentWhite, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, width, height, quality, forceTransparentWhite, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PNG file and returns a link to the shared image.
     */
    public void shareAsPng(String onSuccessOrOptions, String onError, Boolean asBase64, Number width, Number height, Number quality, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPng(%s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, width, height, quality, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, Boolean landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), landscapeOrHeight, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, String landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), wrapQuotes(landscapeOrHeight), wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, Boolean landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, landscapeOrHeight, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, String landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, wrapQuotes(landscapeOrHeight), wrapQuotes(filename)));
    }
    /**
     * Opens Facebook sharing dialog.
     */
    public void shareWithFacebook(String captionOrOptions, String link, String name, String description) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description)));
    }
    /**
     * Opens LinkedIn sharing dialog.
     */
    public void shareWithLinkedIn(String captionOrOptions, String description) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(description)));
    }
    /**
     * Opens Pinterest sharing dialog.
     */
    public void shareWithPinterest(String linkOrOptions, String description) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description)));
    }
    /**
     * Opens Twitter sharing dialog.
     */
    public void shareWithTwitter() {
        APIlib.getInstance().addJSLine(jsBase + ".shareWithTwitter();");
    }
    /**
     * Creates and returns the chart represented as an invisible HTML table.
     */
    public void toA11yTable(String title, Boolean asString) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toA11yTable(%s, %s);", wrapQuotes(title), asString));
    }
    /**
     * Creates and returns a chart as HTML table.
     */
    public void toHtmlTable(String title, Boolean asString) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %s);", wrapQuotes(title), asString));
    }
    /**
     * 
     */
    public com.anychart.data.View data(com.anychart.data.View data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, String fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), wrapQuotes(fillMethod)));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Area area(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Area(String.format(Locale.US, jsBase + ".area(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Bar bar(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Bar(String.format(Locale.US, jsBase + ".bar(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Box box(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Box(String.format(Locale.US, jsBase + ".box(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Bubble bubble(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Bubble(String.format(Locale.US, jsBase + ".bubble(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Column column(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Column(String.format(Locale.US, jsBase + ".column(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Line line(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.RangeColumn rangeColumn(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.RangeColumn(String.format(Locale.US, jsBase + ".rangeColumn(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.JumpLine jumpLine(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.JumpLine(String.format(Locale.US, jsBase + ".jumpLine(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Marker marker(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Marker(String.format(Locale.US, jsBase + ".marker(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Hilo hilo(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Hilo(String.format(Locale.US, jsBase + ".hilo(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.OHLC ohlc(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.OHLC(String.format(Locale.US, jsBase + ".ohlc(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public Object xScale(Class scaleClass) {
        Object instance = null;
        try {
            instance = scaleClass.getDeclaredConstructor(String.class).newInstance(jsBase + ".xScale()");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }
    /**
     * 
     */
    public Object yScale(Class scaleClass) {
        Object instance = null;
        try {
            instance = scaleClass.getDeclaredConstructor(String.class).newInstance(jsBase + ".yScale()");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }

}