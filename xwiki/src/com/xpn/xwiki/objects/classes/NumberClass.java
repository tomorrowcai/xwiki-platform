/**
 * ===================================================================
 *
 * Copyright (c) 2003 Ludovic Dubost, All rights reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details, published at
 * http://www.gnu.org/copyleft/lesser.html or in lesser.txt in the
 * root folder of this distribution.
 *
 * Created by
 * User: Ludovic Dubost
 * Date: 9 d�c. 2003
 * Time: 13:58:38

 */
package com.xpn.xwiki.objects.classes;

import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.NumberProperty;
import com.xpn.xwiki.objects.BaseProperty;
import com.xpn.xwiki.objects.StringProperty;

public class NumberClass  extends PropertyClass {

    /*
    public static final int TYPE_INTEGER = 0;
    public static final int TYPE_LONG = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_DOUBLE = 3;
    */

    public NumberClass(BaseClass wclass) {
        setxWikiClass(wclass);
        setName("number");
        setPrettyName("Number");
        setType("numberclass");
        setSize(30);
        setNumberType("long");
    }

    public NumberClass() {
        setName("number");
        setPrettyName("Number");
        setType("numberclass");
        setSize(30);
        setNumberType("long");
    }

    public int getSize() {
        return getIntValue("size");
    }

    public void setSize(int size) {
        setIntValue("size", size);
    }

    public String getNumberType() {
        return getStringValue("number_type");
    }

    public void setNumberType(String ntype) {
        setStringValue("number_type", ntype);
    }


    public BaseProperty fromString(String value) {
        NumberProperty property = new NumberProperty();
        String ntype = getNumberType();
        Number nvalue;
        if (ntype.equals("integer")) {
            nvalue = new Integer(value);
        } else if (ntype.equals("float")) {
            nvalue = new Float(value);
        } else if (ntype.equals("double")) {
            nvalue = new Double(value);
        } else {
            nvalue = new Long(value);
        }
        property.setValue(nvalue);
        property.setPropertyClass(this);
        return property;
    }

    public void displayHidden(StringBuffer buffer, String name, BaseObject object, XWikiContext context) {
        super.displayHidden(buffer, name, object, context);    //To change body of overriden methods use Options | File Templates.
    }

    public void displaySearch(StringBuffer buffer, String name, BaseObject object, XWikiContext context) {
        super.displaySearch(buffer, name, object, context);    //To change body of overriden methods use Options | File Templates.
    }

    public void displayView(StringBuffer buffer, String name, BaseObject object, XWikiContext context) {
        super.displayView(buffer, name, object, context);    //To change body of overriden methods use Options | File Templates.
    }

    public void displayEdit(StringBuffer buffer, String name, BaseObject object, XWikiContext context) {
        super.displayEdit(buffer, name, object, context);    //To change body of overriden methods use Options | File Templates.
    }

}
