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

/**
 * @author Ekaterina Shliakhovetskaya
 */
package org.openfaces.component.chart.impl;

/**
 * @author Ekaterina Shliakhovetskaya
 */
public enum ModelType {
    Category("Category"),
    Date("Date"),
    Number("Number");

    private String name;

    ModelType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
