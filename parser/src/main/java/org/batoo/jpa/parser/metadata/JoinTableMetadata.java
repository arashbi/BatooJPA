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
package org.batoo.jpa.parser.metadata;

import java.util.List;

/**
 * The definition for join tables.
 * 
 * @author hceylan
 * @since $version
 */
public interface JoinTableMetadata extends TableMetadata {

	/**
	 * Returns the list of inverse join columns of the table.
	 * 
	 * @return the list of inverse join columns of the table.
	 * 
	 * @since $version
	 * @author hceylan
	 */
	List<JoinColumnMetadata> getInverseJoinColumns();

	/**
	 * Returns the list of join columns of the table..
	 * 
	 * @return the list of join columns of the table.
	 * 
	 * @since $version
	 * @author hceylan
	 */
	List<JoinColumnMetadata> getJoinColumns();
}
