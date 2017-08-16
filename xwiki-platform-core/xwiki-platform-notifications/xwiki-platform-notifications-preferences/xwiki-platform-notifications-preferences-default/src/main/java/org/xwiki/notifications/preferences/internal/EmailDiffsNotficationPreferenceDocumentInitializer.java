/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.notifications.preferences.internal;

import java.util.Arrays;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.model.reference.LocalDocumentReference;

import com.xpn.xwiki.doc.AbstractMandatoryClassInitializer;
import com.xpn.xwiki.objects.classes.BaseClass;

/**
 * Define the EmailDiffsNotficationPreferenceClass XClass.
 *
 * @version $Id$
 * @since 9.7RC1
 */
@Component
@Named("XWiki.Notifications.Code.EmailDiffsNotficationPreferenceClass")
@Singleton
public class EmailDiffsNotficationPreferenceDocumentInitializer extends AbstractMandatoryClassInitializer
{
    /**
     * The path to the class parent document.
     */
    private static final List<String> PARENT_PATH = Arrays.asList("XWiki", "Notifications", "Code");

    /**
     * Default constructor.
     */
    public EmailDiffsNotficationPreferenceDocumentInitializer()
    {
        super(new LocalDocumentReference(PARENT_PATH, "EmailDiffsNotficationPreferenceClass"));
    }

    @Override
    protected void createClass(BaseClass xclass)
    {
        xclass.addBooleanField("isEnabled", "Enable Email diffs ?", "select", false);
    }
}