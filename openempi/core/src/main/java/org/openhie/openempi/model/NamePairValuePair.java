/**
 *
 *  Copyright (C) 2010 SYSNET International, Inc. <support@sysnetint.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.openhie.openempi.model;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * NameValuePair encapsulates the combination of a column or attribute with its corresponding value
 * 
 * @author <a href="mailto:yimin.xie@sysnetint.com">Yimin Xie</a>
 */
public class NamePairValuePair extends BaseObject
{
	private static final long serialVersionUID = -4012644666481353904L;
	
	private String leftName;
	private String rightName;
	private Object value;
	
	public NamePairValuePair() {
	}

	public NamePairValuePair(String leftName, String rightName, Object value) {
		this.leftName = leftName;
		this.rightName = rightName;
		this.value = value;
	}

	public String getLeftName() {
		return leftName;
	}

	public void setLeftName(String leftName) {
		this.leftName = leftName;
	}

	public String getRightName() {
		return rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof NamePairValuePair))
			return false;
		NamePairValuePair castOther = (NamePairValuePair) other;
		return new EqualsBuilder().
				append(leftName, castOther.leftName).
				append(rightName, castOther.rightName).
				append(value, castOther.value).
				isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().
				append(leftName).
				append(rightName).
				append(value).
				toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).
				append("leftName", leftName).
				append("rightName", rightName).
				append("value", value).
				toString();
	}
}
