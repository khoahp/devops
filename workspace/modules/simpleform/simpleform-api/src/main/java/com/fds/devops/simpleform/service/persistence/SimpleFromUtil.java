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

import com.fds.devops.simpleform.model.SimpleFrom;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the simple from service. This utility wraps {@link com.fds.devops.simpleform.service.persistence.impl.SimpleFromPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SimpleFromPersistence
 * @see com.fds.devops.simpleform.service.persistence.impl.SimpleFromPersistenceImpl
 * @generated
 */
@ProviderType
public class SimpleFromUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SimpleFrom simpleFrom) {
		getPersistence().clearCache(simpleFrom);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SimpleFrom> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SimpleFrom> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SimpleFrom> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SimpleFrom update(SimpleFrom simpleFrom) {
		return getPersistence().update(simpleFrom);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SimpleFrom update(SimpleFrom simpleFrom,
		ServiceContext serviceContext) {
		return getPersistence().update(simpleFrom, serviceContext);
	}

	/**
	* Returns all the simple froms where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching simple froms
	*/
	public static List<SimpleFrom> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<SimpleFrom> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<SimpleFrom> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<SimpleFrom> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByUuid_First(java.lang.String uuid,
		OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByUuid_Last(java.lang.String uuid,
		OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last simple from in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the simple froms before and after the current simple from in the ordered set where uuid = &#63;.
	*
	* @param formId the primary key of the current simple from
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public static SimpleFrom[] findByUuid_PrevAndNext(long formId,
		java.lang.String uuid, OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence()
				   .findByUuid_PrevAndNext(formId, uuid, orderByComparator);
	}

	/**
	* Removes all the simple froms where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of simple froms where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching simple froms
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the simple from where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSimpleFromException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByUUID_G(java.lang.String uuid, long groupId)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the simple from where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the simple from where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the simple from where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the simple from that was removed
	*/
	public static SimpleFrom removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of simple froms where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching simple froms
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the simple froms where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching simple froms
	*/
	public static List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<SimpleFrom> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last simple from in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static SimpleFrom[] findByUuid_C_PrevAndNext(long formId,
		java.lang.String uuid, long companyId,
		OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(formId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the simple froms where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of simple froms where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching simple froms
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the simple froms where gender = &#63;.
	*
	* @param gender the gender
	* @return the matching simple froms
	*/
	public static List<SimpleFrom> findByGD(int gender) {
		return getPersistence().findByGD(gender);
	}

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
	public static List<SimpleFrom> findByGD(int gender, int start, int end) {
		return getPersistence().findByGD(gender, start, end);
	}

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
	public static List<SimpleFrom> findByGD(int gender, int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().findByGD(gender, start, end, orderByComparator);
	}

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
	public static List<SimpleFrom> findByGD(int gender, int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGD(gender, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByGD_First(int gender,
		OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().findByGD_First(gender, orderByComparator);
	}

	/**
	* Returns the first simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByGD_First(int gender,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().fetchByGD_First(gender, orderByComparator);
	}

	/**
	* Returns the last simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from
	* @throws NoSuchSimpleFromException if a matching simple from could not be found
	*/
	public static SimpleFrom findByGD_Last(int gender,
		OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().findByGD_Last(gender, orderByComparator);
	}

	/**
	* Returns the last simple from in the ordered set where gender = &#63;.
	*
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static SimpleFrom fetchByGD_Last(int gender,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().fetchByGD_Last(gender, orderByComparator);
	}

	/**
	* Returns the simple froms before and after the current simple from in the ordered set where gender = &#63;.
	*
	* @param formId the primary key of the current simple from
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public static SimpleFrom[] findByGD_PrevAndNext(long formId, int gender,
		OrderByComparator<SimpleFrom> orderByComparator)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence()
				   .findByGD_PrevAndNext(formId, gender, orderByComparator);
	}

	/**
	* Removes all the simple froms where gender = &#63; from the database.
	*
	* @param gender the gender
	*/
	public static void removeByGD(int gender) {
		getPersistence().removeByGD(gender);
	}

	/**
	* Returns the number of simple froms where gender = &#63;.
	*
	* @param gender the gender
	* @return the number of matching simple froms
	*/
	public static int countByGD(int gender) {
		return getPersistence().countByGD(gender);
	}

	/**
	* Caches the simple from in the entity cache if it is enabled.
	*
	* @param simpleFrom the simple from
	*/
	public static void cacheResult(SimpleFrom simpleFrom) {
		getPersistence().cacheResult(simpleFrom);
	}

	/**
	* Caches the simple froms in the entity cache if it is enabled.
	*
	* @param simpleFroms the simple froms
	*/
	public static void cacheResult(List<SimpleFrom> simpleFroms) {
		getPersistence().cacheResult(simpleFroms);
	}

	/**
	* Creates a new simple from with the primary key. Does not add the simple from to the database.
	*
	* @param formId the primary key for the new simple from
	* @return the new simple from
	*/
	public static SimpleFrom create(long formId) {
		return getPersistence().create(formId);
	}

	/**
	* Removes the simple from with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formId the primary key of the simple from
	* @return the simple from that was removed
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public static SimpleFrom remove(long formId)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().remove(formId);
	}

	public static SimpleFrom updateImpl(SimpleFrom simpleFrom) {
		return getPersistence().updateImpl(simpleFrom);
	}

	/**
	* Returns the simple from with the primary key or throws a {@link NoSuchSimpleFromException} if it could not be found.
	*
	* @param formId the primary key of the simple from
	* @return the simple from
	* @throws NoSuchSimpleFromException if a simple from with the primary key could not be found
	*/
	public static SimpleFrom findByPrimaryKey(long formId)
		throws com.fds.devops.simpleform.exception.NoSuchSimpleFromException {
		return getPersistence().findByPrimaryKey(formId);
	}

	/**
	* Returns the simple from with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param formId the primary key of the simple from
	* @return the simple from, or <code>null</code> if a simple from with the primary key could not be found
	*/
	public static SimpleFrom fetchByPrimaryKey(long formId) {
		return getPersistence().fetchByPrimaryKey(formId);
	}

	public static java.util.Map<java.io.Serializable, SimpleFrom> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the simple froms.
	*
	* @return the simple froms
	*/
	public static List<SimpleFrom> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<SimpleFrom> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<SimpleFrom> findAll(int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<SimpleFrom> findAll(int start, int end,
		OrderByComparator<SimpleFrom> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the simple froms from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of simple froms.
	*
	* @return the number of simple froms
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static SimpleFromPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SimpleFromPersistence, SimpleFromPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SimpleFromPersistence.class);
}