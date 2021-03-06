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
package org.batoo.jpa.core.test.inheritence.single;

import javax.persistence.Entity;

/**
 * 
 * @author hceylan
 * @since $version
 */
@Entity
public class FooExt11 extends FooExt1 {

	private String valueExt11;

	/**
	 * Returns the valueExt11.
	 * 
	 * @return the valueExt11
	 * @since $version
	 */
	public String getValueExt11() {
		return this.valueExt11;
	}

	/**
	 * Sets the valueExt11.
	 * 
	 * @param valueExt11
	 *            the valueExt11 to set
	 * @since $version
	 */
	public void setValueExt11(String valueExt11) {
		this.valueExt11 = valueExt11;
	}
}
