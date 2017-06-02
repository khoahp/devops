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

package com.fds.devops.simpleform.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SimpleFrom. This utility wraps
 * {@link com.fds.devops.simpleform.service.impl.SimpleFromLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SimpleFromLocalService
 * @see com.fds.devops.simpleform.service.base.SimpleFromLocalServiceBaseImpl
 * @see com.fds.devops.simpleform.service.impl.SimpleFromLocalServiceImpl
 * @generated
 */
@ProviderType
public class SimpleFromLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.devops.simpleform.service.impl.SimpleFromLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the simple from to the database. Also notifies the appropriate model listeners.
	*
	* @param simpleFrom the simple from
	* @return the simple from that was added
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom addSimpleFrom(
		com.fds.devops.simpleform.model.SimpleFrom simpleFrom) {
		return getService().addSimpleFrom(simpleFrom);
	}

	/**
	* Creates a new simple from with the primary key. Does not add the simple from to the database.
	*
	* @param formId the primary key for the new simple from
	* @return the new simple from
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom createSimpleFrom(
		long formId) {
		return getService().createSimpleFrom(formId);
	}

	/**
	* Deletes the simple from from the database. Also notifies the appropriate model listeners.
	*
	* @param simpleFrom the simple from
	* @return the simple from that was removed
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom deleteSimpleFrom(
		com.fds.devops.simpleform.model.SimpleFrom simpleFrom) {
		return getService().deleteSimpleFrom(simpleFrom);
	}

	/**
	* Deletes the simple from with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formId the primary key of the simple from
	* @return the simple from that was removed
	* @throws PortalException if a simple from with the primary key could not be found
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom deleteSimpleFrom(
		long formId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSimpleFrom(formId);
	}

	public static com.fds.devops.simpleform.model.SimpleFrom fetchSimpleFrom(
		long formId) {
		return getService().fetchSimpleFrom(formId);
	}

	/**
	* Returns the simple from matching the UUID and group.
	*
	* @param uuid the simple from's UUID
	* @param groupId the primary key of the group
	* @return the matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom fetchSimpleFromByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchSimpleFromByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the simple from with the primary key.
	*
	* @param formId the primary key of the simple from
	* @return the simple from
	* @throws PortalException if a simple from with the primary key could not be found
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom getSimpleFrom(
		long formId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSimpleFrom(formId);
	}

	/**
	* Returns the simple from matching the UUID and group.
	*
	* @param uuid the simple from's UUID
	* @param groupId the primary key of the group
	* @return the matching simple from
	* @throws PortalException if a matching simple from could not be found
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom getSimpleFromByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSimpleFromByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the simple from in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param simpleFrom the simple from
	* @return the simple from that was updated
	*/
	public static com.fds.devops.simpleform.model.SimpleFrom updateSimpleFrom(
		com.fds.devops.simpleform.model.SimpleFrom simpleFrom) {
		return getService().updateSimpleFrom(simpleFrom);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of simple froms.
	*
	* @return the number of simple froms
	*/
	public static int getSimpleFromsCount() {
		return getService().getSimpleFromsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.devops.simpleform.model.impl.SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.devops.simpleform.model.impl.SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the simple froms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.devops.simpleform.model.impl.SimpleFromModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @return the range of simple froms
	*/
	public static java.util.List<com.fds.devops.simpleform.model.SimpleFrom> getSimpleFroms(
		int start, int end) {
		return getService().getSimpleFroms(start, end);
	}

	/**
	* Returns all the simple froms matching the UUID and company.
	*
	* @param uuid the UUID of the simple froms
	* @param companyId the primary key of the company
	* @return the matching simple froms, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.devops.simpleform.model.SimpleFrom> getSimpleFromsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getSimpleFromsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of simple froms matching the UUID and company.
	*
	* @param uuid the UUID of the simple froms
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of simple froms
	* @param end the upper bound of the range of simple froms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching simple froms, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.devops.simpleform.model.SimpleFrom> getSimpleFromsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.devops.simpleform.model.SimpleFrom> orderByComparator) {
		return getService()
				   .getSimpleFromsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static SimpleFromLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SimpleFromLocalService, SimpleFromLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SimpleFromLocalService.class);
}