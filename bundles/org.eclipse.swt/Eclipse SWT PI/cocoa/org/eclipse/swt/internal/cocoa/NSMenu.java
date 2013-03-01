/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cocoa;

public class NSMenu extends NSObject {

public NSMenu() {
	super();
}

public NSMenu(long /*int*/ id) {
	super(id);
}

public NSMenu(id id) {
	super(id);
}

public void addItem(NSMenuItem newItem) {
	OS.objc_msgSend(this.id, OS.sel_addItem_, newItem != null ? newItem.id : 0);
}

public NSMenuItem addItemWithTitle(NSString aString, long /*int*/ aSelector, NSString charCode) {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_addItemWithTitle_action_keyEquivalent_, aString != null ? aString.id : 0, aSelector, charCode != null ? charCode.id : 0);
	return result != 0 ? new NSMenuItem(result) : null;
}

public void cancelTracking() {
	OS.objc_msgSend(this.id, OS.sel_cancelTracking);
}

public long /*int*/ indexOfItemWithTarget(id target, long /*int*/ actionSelector) {
	return OS.objc_msgSend(this.id, OS.sel_indexOfItemWithTarget_andAction_, target != null ? target.id : 0, actionSelector);
}

public NSMenu initWithTitle(NSString aTitle) {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_initWithTitle_, aTitle != null ? aTitle.id : 0);
	return result == this.id ? this : (result != 0 ? new NSMenu(result) : null);
}

public void insertItem(NSMenuItem newItem, long /*int*/ index) {
	OS.objc_msgSend(this.id, OS.sel_insertItem_atIndex_, newItem != null ? newItem.id : 0, index);
}

public NSArray itemArray() {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_itemArray);
	return result != 0 ? new NSArray(result) : null;
}

public NSMenuItem itemAtIndex(long /*int*/ index) {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_itemAtIndex_, index);
	return result != 0 ? new NSMenuItem(result) : null;
}

public NSMenuItem itemWithTag(long /*int*/ tag) {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_itemWithTag_, tag);
	return result != 0 ? new NSMenuItem(result) : null;
}

public long /*int*/ numberOfItems() {
	return OS.objc_msgSend(this.id, OS.sel_numberOfItems);
}

public boolean performKeyEquivalent(NSEvent theEvent) {
	return OS.objc_msgSend_bool(this.id, OS.sel_performKeyEquivalent_, theEvent != null ? theEvent.id : 0);
}

public static void popUpContextMenu(NSMenu menu, NSEvent event, NSView view) {
	OS.objc_msgSend(OS.class_NSMenu, OS.sel_popUpContextMenu_withEvent_forView_, menu != null ? menu.id : 0, event != null ? event.id : 0, view != null ? view.id : 0);
}

public void removeItem(NSMenuItem item) {
	OS.objc_msgSend(this.id, OS.sel_removeItem_, item != null ? item.id : 0);
}

public void removeItemAtIndex(long /*int*/ index) {
	OS.objc_msgSend(this.id, OS.sel_removeItemAtIndex_, index);
}

public void setAutoenablesItems(boolean flag) {
	OS.objc_msgSend(this.id, OS.sel_setAutoenablesItems_, flag);
}

public void setDelegate(id anObject) {
	OS.objc_msgSend(this.id, OS.sel_setDelegate_, anObject != null ? anObject.id : 0);
}

public void setSubmenu(NSMenu aMenu, NSMenuItem anItem) {
	OS.objc_msgSend(this.id, OS.sel_setSubmenu_forItem_, aMenu != null ? aMenu.id : 0, anItem != null ? anItem.id : 0);
}

public void setTitle(NSString aString) {
	OS.objc_msgSend(this.id, OS.sel_setTitle_, aString != null ? aString.id : 0);
}

public NSString title() {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_title);
	return result != 0 ? new NSString(result) : null;
}

}
