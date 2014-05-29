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

package org.openfaces.component.timetable;

import org.openfaces.org.json.JSONException;
import org.openfaces.org.json.JSONObject;

/**
 * @author Roman Porotnikov
 */
public class UIEventLineFeed extends AbstractUIEventContent {

    public static final String COMPONENT_TYPE = "org.openfaces.EventLineFeed";
    public static final String COMPONENT_FAMILY = "org.openfaces.EventLineFeed";

    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    @Override
    protected String getType() {
        return "lineFeed";
    }

    @Override
    protected JSONObject getData() throws JSONException {
        return null;
    }
    
}
