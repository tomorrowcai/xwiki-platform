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
package org.xwiki.notifications.filters.watch;

import org.xwiki.notifications.filters.NotificationFilterPreference;
import org.xwiki.stability.Unstable;

/**
 * Reference to a user to watch.
 *
 * @version $Id$
 * @since 9.8RC1
 */
@Unstable
public class WatchedUserReference implements WatchedEntityReference
{
    private String userId;

    /**
     * Construct a WatchedUserReference.
     * @param userId id of the user to watch.
     */
    public WatchedUserReference(String userId)
    {
        this.userId = userId;
    }

    @Override
    public boolean matchExactly(NotificationFilterPreference notificationFilterPreference)
    {
        // TODO: implement this along with the UserFilter
        return false;
    }

    @Override
    public boolean match(NotificationFilterPreference notificationFilterPreference)
    {
        // TODO: implement this along with the UserFilter
        return false;
    }

    @Override
    public NotificationFilterPreference createFilterPreference()
    {
        // TODO: implement this along with the UserFilter
        return null;
    }
}