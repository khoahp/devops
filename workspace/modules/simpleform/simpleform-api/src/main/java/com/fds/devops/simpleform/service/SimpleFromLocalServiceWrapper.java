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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SimpleFromLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SimpleFromLocalService
 * @generated
 */
@ProviderType
public class SimpleFromLocalServiceWrapper implements SimpleFromLocalService,
	ServiceWrapper<SimpleFromLocalService> {
	public SimpleFromLocalServiceWrapper(
		SimpleFromLocalService simpleFromLocalService) {
		_simpleFromLocalService = simpleFromLocalService;
	}

	/**
	* Adds the simple from to the database. Also notifies the appropriate model listeners.
	*
	* @param simpleFrom the simple from
	* @return the simple from that was added
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom addSimpleFrom(
		com.fds.devops.simpleform.model.SimpleFrom simpleFrom) {
		return _simpleFromLocalService.addSimpleFrom(simpleFrom);
	}

	/**
	* Creates a new simple from with the primary key. Does not add the simple from to the database.
	*
	* @param formId the primary key for the new simple from
	* @return the new simple from
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom createSimpleFrom(
		long formId) {
		return _simpleFromLocalService.createSimpleFrom(formId);
	}

	/**
	* Deletes the simple from from the database. Also notifies the appropriate model listeners.
	*
	* @param simpleFrom the simple from
	* @return the simple from that was removed
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom deleteSimpleFrom(
		com.fds.devops.simpleform.model.SimpleFrom simpleFrom) {
		return _simpleFromLocalService.deleteSimpleFrom(simpleFrom);
	}

	/**
	* Deletes the simple from with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formId the primary key of the simple from
	* @return the simple from that was removed
	* @throws PortalException if a simple from with the primary key could not be found
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom deleteSimpleFrom(
		long formId) throws com.liferay.portal.kernel.exception.PortalException {
		return _simpleFromLocalService.deleteSimpleFrom(formId);
	}

	@Override
	public com.fds.devops.simpleform.model.SimpleFrom fetchSimpleFrom(
		long formId) {
		return _simpleFromLocalService.fetchSimpleFrom(formId);
	}

	/**
	* Returns the simple from matching the UUID and group.
	*
	* @param uuid the simple from's UUID
	* @param groupId the primary key of the group
	* @return the matching simple from, or <code>null</code> if a matching simple from could not be found
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom fetchSimpleFromByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _simpleFromLocalService.fetchSimpleFromByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the simple from with the primary key.
	*
	* @param formId the primary key of the simple from
	* @return the simple from
	* @throws PortalException if a simple from with the primary key could not be found
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom getSimpleFrom(long formId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simpleFromLocalService.getSimpleFrom(formId);
	}

	/**
	* Returns the simple from matching the UUID and group.
	*
	* @param uuid the simple from's UUID
	* @param groupId the primary key of the group
	* @return the matching simple from
	* @throws PortalException if a matching simple from could not be found
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom getSimpleFromByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simpleFromLocalService.getSimpleFromByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the simple from in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param simpleFrom the simple from
	* @return the simple from that was updated
	*/
	@Override
	public com.fds.devops.simpleform.model.SimpleFrom updateSimpleFrom(
		com.fds.devops.simpleform.model.SimpleFrom simpleFrom) {
		return _simpleFromLocalService.updateSimpleFrom(simpleFrom);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _simpleFromLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _simpleFromLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _simpleFromLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _simpleFromLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simpleFromLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simpleFromLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of simple froms.
	*
	* @return the number of simple froms
	*/
	@Override
	public int getSimpleFromsCount() {
		return _simpleFromLocalService.getSimpleFromsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _simpleFromLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _simpleFromLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _simpleFromLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _simpleFromLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.fds.devops.simpleform.model.SimpleFrom> getSimpleFroms(
		int start, int end) {
		return _simpleFromLocalService.getSimpleFroms(start, end);
	}

	/**
	* Returns all the simple froms matching the UUID and company.
	*
	* @param uuid the UUID of the simple froms
	* @param companyId the primary key of the company
	* @return the matching simple froms, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.fds.devops.simpleform.model.SimpleFrom> getSimpleFromsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _simpleFromLocalService.getSimpleFromsByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<com.fds.devops.simpleform.model.SimpleFrom> getSimpleFromsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.devops.simpleform.model.SimpleFrom> orderByComparator) {
		return _simpleFromLocalService.getSimpleFromsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _simpleFromLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _simpleFromLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SimpleFromLocalService getWrappedService() {
		return _simpleFromLocalService;
	}

	@Override
	public void setWrappedService(SimpleFromLocalService simpleFromLocalService) {
		_simpleFromLocalService = simpleFromLocalService;
	}

	private SimpleFromLocalService _simpleFromLocalService;
}