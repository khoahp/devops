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

package com.fds.devops.simpleform.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.devops.simpleform.exception.NoSuchSimpleFromException;
import com.fds.devops.simpleform.model.SimpleFrom;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the simple from service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.fds.devops.simpleform.service.persistence.impl.SimpleFromPersistenceImpl
 * @see SimpleFromUtil
 * @generated
 */
@ProviderType
public interface SimpleFromPersistence extends BasePersistence<SimpleFrom> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SimpleFromUtil} to access the simple from persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the simple froms where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the simple froms where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @return the range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the simple froms where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns an ordered range of all the simple froms where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Returns the first simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns the last simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Returns the last simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns the simple froms before and after the current simple from in the ordered set where uuid = &#63;.
	*
	* @param formId the primary key of the current simple from
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public SimpleFrom[] findByUuid_PrevAndNext(long formId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Removes all the simple froms where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of simple froms where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching simple froms
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the simple from where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSimpleFromException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchSimpleFromException;

	/**
	* Returns the simple from where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the simple from where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the simple from where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the simple from that was removed
	*/
	public SimpleFrom removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchSimpleFromException;

	/**
	* Returns the number of simple froms where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching simple froms
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the simple froms where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the simple froms where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @return the range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the simple froms where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns an ordered range of all the simple froms where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Returns the first simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns the last simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Returns the last simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns the simple froms before and after the current simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param formId the primary key of the current simple from
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public SimpleFrom[] findByUuid_C_PrevAndNext(long formId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Removes all the simple froms where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of simple froms where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching simple froms
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the simple froms where gender = &#63;.
	*
	* @param gender the gender
	* @return the matching simple froms
	*/
	public java.util.List<SimpleFrom> findByGD(int gender);

	/**
	* Returns a range of all the simple froms where gender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gender the gender
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @return the range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByGD(int gender, int start, int end);

	/**
	* Returns an ordered range of all the simple froms where gender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gender the gender
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByGD(int gender, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns an ordered range of all the simple froms where gender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gender the gender
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simple froms
	*/
	public java.util.List<SimpleFrom> findByGD(int gender, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByGD_First(int gender,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Returns the first simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByGD_First(int gender,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns the last simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public SimpleFrom findByGD_Last(int gender,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Returns the last simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public SimpleFrom fetchByGD_Last(int gender,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns the simple froms before and after the current simple from in the ordered set where gender = &#63;.
	*
	* @param formId the primary key of the current simple from
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public SimpleFrom[] findByGD_PrevAndNext(long formId, int gender,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator)
		throws NoSuchSimpleFromException;

	/**
	* Removes all the simple froms where gender = &#63; from the database.
	*
	* @param gender the gender
	*/
	public void removeByGD(int gender);

	/**
	* Returns the number of simple froms where gender = &#63;.
	*
	* @param gender the gender
	* @return the number of matching simple froms
	*/
	public int countByGD(int gender);

	/**
	* Caches the simple from in the entity cache if it is enabled.
	*
	* @param simpleFrom the simple from
	*/
	public void cacheResult(SimpleFrom simpleFrom);

	/**
	* Caches the simple froms in the entity cache if it is enabled.
	*
	* @param simpleFroms the simple froms
	*/
	public void cacheResult(java.util.List<SimpleFrom> simpleFroms);

	/**
	* Creates a new simple from with the primary key. Does not add the simple from to the database.
	*
	* @param formId the primary key for the new simple from
	* @return the new simple from
	*/
	public SimpleFrom create(long formId);

	/**
	* Removes the simple from with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formId the primary key of the simple from
	* @return the simple from that was removed
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public SimpleFrom remove(long formId) throws NoSuchSimpleFromException;

	public SimpleFrom updateImpl(SimpleFrom simpleFrom);

	/**
	* Returns the simple from with the primary key or throws a {@link NoSuchSimpleFromException} if it could not be found.
	*
	* @param formId the primary key of the simple from
	* @return the simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public SimpleFrom findByPrimaryKey(long formId)
		throws NoSuchSimpleFromException;

	/**
	* Returns the simple from with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param formId the primary key of the simple from
	* @return the simple from, or <code>null</code> if a simple from with the primary key could not be found
	*/
	public SimpleFrom fetchByPrimaryKey(long formId);

	@Override
	public java.util.Map<java.io.Serializable, SimpleFrom> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the simple froms.
	*
	* @return the simple froms
	*/
	public java.util.List<SimpleFrom> findAll();

	/**
	* Returns a range of all the simple froms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @return the range of simple froms
	*/
	public java.util.List<SimpleFrom> findAll(int start, int end);

	/**
	* Returns an ordered range of all the simple froms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of simple froms
	*/
	public java.util.List<SimpleFrom> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator);

	/**
	* Returns an ordered range of all the simple froms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of simple froms
	*/
	public java.util.List<SimpleFrom> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the simple froms from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of simple froms.
	*
	* @return the number of simple froms
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}