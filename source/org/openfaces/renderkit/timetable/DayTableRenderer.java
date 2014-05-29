/*
 * OpenFaces - JSF Component Library 3.0
 * Copyright (C) 2007-2012, TeamDev Ltd.
 * licensing@openfaces.org
 * Unless agreed in writing the contents of this file are subject to
 * the GNU Lesser General Public License Version 2.1 (the "LGPL" License).
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * Please visit http://openfaces.org/licensing/ for more details.
 */
package org.openfaces.renderkit.timetable;

/**
 * @author Roman Porotnikov
 */
public class DayTableRenderer extends TimeScaleTableRenderer {

    protected String getTagName() {
        return "<o:dayTable>";
    }

    protected String getComponentName() {
        return "DayTable";
    }

    protected String getJsLibraryName() {
        return "timetable/dayTable.js";
    }

    protected String getJsInitFunctionName() {
        return "O$.DayTable._init";
    }

    protected int getDayCount() {
        return 1;
    }

}