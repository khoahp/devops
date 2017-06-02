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

package com.fds.devops.simpleform.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.devops.simpleform.model.SimpleFrom;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SimpleFrom in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SimpleFrom
 * @generated
 */
@ProviderType
public class SimpleFromCacheModel implements CacheModel<SimpleFrom>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SimpleFromCacheModel)) {
			return false;
		}

		SimpleFromCacheModel simpleFromCacheModel = (SimpleFromCacheModel)obj;

		if (formId == simpleFromCacheModel.formId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, formId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", formId=");
		sb.append(formId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", shortDesciption=");
		sb.append(shortDesciption);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SimpleFrom toEntityModel() {
		SimpleFromImpl simpleFromImpl = new SimpleFromImpl();

		if (uuid == null) {
			simpleFromImpl.setUuid(StringPool.BLANK);
		}
		else {
			simpleFromImpl.setUuid(uuid);
		}

		simpleFromImpl.setFormId(formId);
		simpleFromImpl.setGroupId(groupId);
		simpleFromImpl.setCompanyId(companyId);
		simpleFromImpl.setUserId(userId);

		if (userName == null) {
			simpleFromImpl.setUserName(StringPool.BLANK);
		}
		else {
			simpleFromImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			simpleFromImpl.setCreateDate(null);
		}
		else {
			simpleFromImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			simpleFromImpl.setModifiedDate(null);
		}
		else {
			simpleFromImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (fullName == null) {
			simpleFromImpl.setFullName(StringPool.BLANK);
		}
		else {
			simpleFromImpl.setFullName(fullName);
		}

		if (birthday == Long.MIN_VALUE) {
			simpleFromImpl.setBirthday(null);
		}
		else {
			simpleFromImpl.setBirthday(new Date(birthday));
		}

		simpleFromImpl.setGender(gender);

		if (email == null) {
			simpleFromImpl.setEmail(StringPool.BLANK);
		}
		else {
			simpleFromImpl.setEmail(email);
		}

		if (address == null) {
			simpleFromImpl.setAddress(StringPool.BLANK);
		}
		else {
			simpleFromImpl.setAddress(address);
		}

		if (shortDesciption == null) {
			simpleFromImpl.setShortDesciption(StringPool.BLANK);
		}
		else {
			simpleFromImpl.setShortDesciption(shortDesciption);
		}

		simpleFromImpl.resetOriginalValues();

		return simpleFromImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		formId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fullName = objectInput.readUTF();
		birthday = objectInput.readLong();

		gender = objectInput.readInt();
		email = objectInput.readUTF();
		address = objectInput.readUTF();
		shortDesciption = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(formId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeLong(birthday);

		objectOutput.writeInt(gender);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (shortDesciption == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shortDesciption);
		}
	}

	public String uuid;
	public long formId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String fullName;
	public long birthday;
	public int gender;
	public String email;
	public String address;
	public String shortDesciption;
}