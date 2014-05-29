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
package org.openfaces.component.panel;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Andrew Palval
 */
public class SubPanel extends AbstractPanelWithCaption implements Serializable {
    public static final String COMPONENT_TYPE = "org.openfaces.SubPanel";
    public static final String COMPONENT_FAMILY = "org.openfaces.SubPanel";


    public SubPanel() {
    }

    public SubPanel(UIComponent caption) {
        setCaptionFacet(caption);
    }

    public SubPanel(UIComponent caption, UIComponent... children) {
        if (caption != null)
            setCaptionFacet(caption);
        getChildren().addAll(Arrays.asList(children));
    }

    public String getFamily() {
        return COMPONENT_FAMILY;
    }

}