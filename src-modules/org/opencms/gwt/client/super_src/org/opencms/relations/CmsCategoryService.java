/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/client/super_src/org/opencms/relations/Attic/CmsCategoryService.java,v $
 * Date   : $Date: 2010/05/03 10:48:01 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) 2002 - 2009 Alkacon Software GmbH (http://www.alkacon.com)
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
 * For further information about Alkacon Software GmbH, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.relations;


/**
 * Provides several simplified methods for manipulating category relations.<p>
 * 
 * @author Michael Moossen 
 * 
 * @version $Revision: 1.1 $ 
 * 
 * @since 6.9.2
 * 
 * @see CmsCategory
 */
public class CmsCategoryService {

    /** The centralized path for categories. */
    public static final String CENTRALIZED_REPOSITORY = "/system/categories/";

    /** The folder for the local category repositories. */
    private static final String REPOSITORY_BASE_FOLDER = "/_categories/";
}