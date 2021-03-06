/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cde;


public class DtActionArg {
	public int argClass;
	/** @field accessor=u.file.name,cast=(char *) */
	public long /*int*/ name;
	public static final int sizeof = CDE.DtActionArg_sizeof();
}
