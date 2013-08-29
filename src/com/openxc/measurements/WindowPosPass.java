
package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

public class WindowPosPass extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE = new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "window_position_passenger";

    public WindowPosPass(Number value) {
        super(new Percentage(value), RANGE);
    }

    public WindowPosPass(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }

}