/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.devops.simpleform.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link SimpleFrom}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SimpleFrom
 * @generated
 */
@ProviderType
public class SimpleFromWrapper implements SimpleFrom, ModelWrapper<SimpleFrom> {
	public SimpleFromWrapper(SimpleFrom simpleFrom) {
		_simpleFrom = simpleFrom;
	}

	@Override
	public Class<?> getModelClass() {
		return SimpleFrom.class;
	}

	@Override
	public String getModelClassName() {
		return SimpleFrom.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("formId", getFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fullName", getFullName());
		attributes.put("birthday", getBirthday());
		attributes.put("gender", getGender());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("shortDesciption", getShortDesciption());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long formId = (Long)attributes.get("formId");

		if (formId != null) {
			setFormId(formId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String shortDesciption = (String)attributes.get("shortDesciption");

		if (shortDesciption != null) {
			setShortDesciption(shortDesciption);
		}
	}

	@Override
	public SimpleFrom toEscapedModel() {
		return new SimpleFromWrapper(_simpleFrom.toEscapedModel());
	}

	@Override
	public SimpleFrom toUnescapedModel() {
		return new SimpleFromWrapper(_simpleFrom.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _simpleFrom.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _simpleFrom.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _simpleFrom.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _simpleFrom.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SimpleFrom> toCacheModel() {
		return _simpleFrom.toCacheModel();
	}

	@Override
	public int compareTo(SimpleFrom simpleFrom) {
		return _simpleFrom.compareTo(simpleFrom);
	}

	/**
	* Returns the gender of this simple from.
	*
	* @return the gender of this simple from
	*/
	@Override
	public int getGender() {
		return _simpleFrom.getGender();
	}

	@Override
	public int hashCode() {
		return _simpleFrom.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _simpleFrom.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SimpleFromWrapper((SimpleFrom)_simpleFrom.clone());
	}

	/**
	* Returns the address of this simple from.
	*
	* @return the address of this simple from
	*/
	@Override
	public java.lang.String getAddress() {
		return _simpleFrom.getAddress();
	}

	/**
	* Returns the email of this simple from.
	*
	* @return the email of this simple from
	*/
	@Override
	public java.lang.String getEmail() {
		return _simpleFrom.getEmail();
	}

	/**
	* Returns the full name of this simple from.
	*
	* @return the full name of this simple from
	*/
	@Override
	public java.lang.String getFullName() {
		return _simpleFrom.getFullName();
	}

	/**
	* Returns the short desciption of this simple from.
	*
	* @return the short desciption of this simple from
	*/
	@Override
	public java.lang.String getShortDesciption() {
		return _simpleFrom.getShortDesciption();
	}

	/**
	* Returns the user name of this simple from.
	*
	* @return the user name of this simple from
	*/
	@Override
	public java.lang.String getUserName() {
		return _simpleFrom.getUserName();
	}

	/**
	* Returns the user uuid of this simple from.
	*
	* @return the user uuid of this simple from
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _simpleFrom.getUserUuid();
	}

	/**
	* Returns the uuid of this simple from.
	*
	* @return the uuid of this simple from
	*/
	@Override
	public java.lang.String getUuid() {
		return _simpleFrom.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _simpleFrom.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _simpleFrom.toXmlString();
	}

	/**
	* Returns the birthday of this simple from.
	*
	* @return the birthday of this simple from
	*/
	@Override
	public Date getBirthday() {
		return _simpleFrom.getBirthday();
	}

	/**
	* Returns the create date of this simple from.
	*
	* @return the create date of this simple from
	*/
	@Override
	public Date getCreateDate() {
		return _simpleFrom.getCreateDate();
	}

	/**
	* Returns the modified date of this simple from.
	*
	* @return the modified date of this simple from
	*/
	@Override
	public Date getModifiedDate() {
		return _simpleFrom.getModifiedDate();
	}

	/**
	* Returns the company ID of this simple from.
	*
	* @return the company ID of this simple from
	*/
	@Override
	public long getCompanyId() {
		return _simpleFrom.getCompanyId();
	}

	/**
	* Returns the form ID of this simple from.
	*
	* @return the form ID of this simple from
	*/
	@Override
	public long getFormId() {
		return _simpleFrom.getFormId();
	}

	/**
	* Returns the group ID of this simple from.
	*
	* @return the group ID of this simple from
	*/
	@Override
	public long getGroupId() {
		return _simpleFrom.getGroupId();
	}

	/**
	* Returns the primary key of this simple from.
	*
	* @return the primary key of this simple from
	*/
	@Override
	public long getPrimaryKey() {
		return _simpleFrom.getPrimaryKey();
	}

	/**
	* Returns the user ID of this simple from.
	*
	* @return the user ID of this simple from
	*/
	@Override
	public long getUserId() {
		return _simpleFrom.getUserId();
	}

	@Override
	public void persist() {
		_simpleFrom.persist();
	}

	/**
	* Sets the address of this simple from.
	*
	* @param address the address of this simple from
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_simpleFrom.setAddress(address);
	}

	/**
	* Sets the birthday of this simple from.
	*
	* @param birthday the birthday of this simple from
	*/
	@Override
	public void setBirthday(Date birthday) {
		_simpleFrom.setBirthday(birthday);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_simpleFrom.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this simple from.
	*
	* @param companyId the company ID of this simple from
	*/
	@Override
	public void setCompanyId(long companyId) {
		_simpleFrom.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this simple from.
	*
	* @param createDate the create date of this simple from
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_simpleFrom.setCreateDate(createDate);
	}

	/**
	* Sets the email of this simple from.
	*
	* @param email the email of this simple from
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_simpleFrom.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_simpleFrom.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_simpleFrom.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_simpleFrom.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the form ID of this simple from.
	*
	* @param formId the form ID of this simple from
	*/
	@Override
	public void setFormId(long formId) {
		_simpleFrom.setFormId(formId);
	}

	/**
	* Sets the full name of this simple from.
	*
	* @param fullName the full name of this simple from
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_simpleFrom.setFullName(fullName);
	}

	/**
	* Sets the gender of this simple from.
	*
	* @param gender the gender of this simple from
	*/
	@Override
	public void setGender(int gender) {
		_simpleFrom.setGender(gender);
	}

	/**
	* Sets the group ID of this simple from.
	*
	* @param groupId the group ID of this simple from
	*/
	@Override
	public void setGroupId(long groupId) {
		_simpleFrom.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this simple from.
	*
	* @param modifiedDate the modified date of this simple from
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_simpleFrom.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_simpleFrom.setNew(n);
	}

	/**
	* Sets the primary key of this simple from.
	*
	* @param primaryKey the primary key of this simple from
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_simpleFrom.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_simpleFrom.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the short desciption of this simple from.
	*
	* @param shortDesciption the short desciption of this simple from
	*/
	@Override
	public void setShortDesciption(java.lang.String shortDesciption) {
		_simpleFrom.setShortDesciption(shortDesciption);
	}

	/**
	* Sets the user ID of this simple from.
	*
	* @param userId the user ID of this simple from
	*/
	@Override
	public void setUserId(long userId) {
		_simpleFrom.setUserId(userId);
	}

	/**
	* Sets the user name of this simple from.
	*
	* @param userName the user name of this simple from
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_simpleFrom.setUserName(userName);
	}

	/**
	* Sets the user uuid of this simple from.
	*
	* @param userUuid the user uuid of this simple from
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_simpleFrom.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this simple from.
	*
	* @param uuid the uuid of this simple from
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_simpleFrom.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SimpleFromWrapper)) {
			return false;
		}

		SimpleFromWrapper simpleFromWrapper = (SimpleFromWrapper)obj;

		if (Objects.equals(_simpleFrom, simpleFromWrapper._simpleFrom)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _simpleFrom.getStagedModelType();
	}

	@Override
	public SimpleFrom getWrappedModel() {
		return _simpleFrom;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _simpleFrom.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _simpleFrom.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_simpleFrom.resetOriginalValues();
	}

	private final SimpleFrom _simpleFrom;
}