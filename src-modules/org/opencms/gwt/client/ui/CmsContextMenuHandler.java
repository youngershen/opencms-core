/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/client/ui/Attic/CmsContextMenuHandler.java,v $
 * Date   : $Date: 2010/07/15 17:13:12 $
 * Version: $Revision: 1.2 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.gwt.client.ui;

import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.ui.PopupPanel;

/**
 * Implements the close handler for the menu.<p>
 * 
 * @author Ruediger Kurz
 * 
 * @version $Revision: 1.2 $
 * 
 * @since version 8.0.0
 */
public class CmsContextMenuHandler implements CloseHandler<PopupPanel> {

    /** The menu. */
    private CmsContextMenu m_menu;

    /**
     * Constructor.<p>
     * 
     * @param menu the menu
     */
    public CmsContextMenuHandler(CmsContextMenu menu) {

        m_menu = menu;
    }

    /**
     * @see com.google.gwt.event.logical.shared.CloseHandler#onClose(com.google.gwt.event.logical.shared.CloseEvent)
     */
    public void onClose(CloseEvent<PopupPanel> event) {

        m_menu.onClose();
    }
}