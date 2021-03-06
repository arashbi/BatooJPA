/*
 * Copyright (c) 2012 - Batoo Software ve Consultancy Ltd.
 * 
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.batoo.jpa.core.impl.instance;

import java.io.Serializable;

/**
 * Interface implemented by enhanced managed instances.
 * 
 * @author hceylan
 * @since $version
 */
public interface EnhancedInstance extends Serializable {

	/**
	 * Returns the managed instance of the instance.
	 * 
	 * @return the managed instance of the instance
	 * 
	 * @since $version
	 * @author hceylan
	 */
	ManagedInstance<?> __enhanced__$$__getManagedInstance();

	/**
	 * Returns if the instance has been initialized.
	 * 
	 * @return true if the instance has been initialized
	 * 
	 * @since $version
	 * @author hceylan
	 */
	boolean __enhanced__$$__isInitialized();

	/**
	 * Marks the instance as initialized.
	 * 
	 * @since $version
	 * @author hceylan
	 */
	void __enhanced__$$__setInitialized();

	/**
	 * Sets the managed instance of the instance.
	 * 
	 * @param instance
	 *            the instance to set
	 * 
	 * @since $version
	 * @author hceylan
	 */
	void __enhanced__$$__setManagedInstance(ManagedInstance<?> instance);
}
