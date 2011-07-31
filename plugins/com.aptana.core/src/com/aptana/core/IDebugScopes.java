/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.core;

/**
 * A interface to capture the various scopes available during debugging. These need to match the items in the .options
 * file at the root of the plugin
 * 
 * @author Ingo Muschenetz
 */
public interface IDebugScopes
{
	/**
	 * Items related to the logging process
	 */
	String LOGGER = CorePlugin.PLUGIN_ID + "/debug/logger"; //$NON-NLS-1$

	/**
	 * Items related to the indexing process
	 */
	String BUILDER = CorePlugin.PLUGIN_ID + "/debug/builder"; //$NON-NLS-1$

	/**
	 * Items related to running things on hte command line
	 */
	String SHELL = CorePlugin.PLUGIN_ID + "/debug/shell"; //$NON-NLS-1$

}