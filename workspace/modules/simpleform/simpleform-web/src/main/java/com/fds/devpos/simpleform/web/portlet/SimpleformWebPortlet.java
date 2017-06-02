package com.fds.devpos.simpleform.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author khoavu
 */
@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.display-category=category.devops",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=Simple Form Portlet",
			"javax.portlet.init-param.template-path=/html/",
			"javax.portlet.init-param.view-template=/html/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"javax.portlet.expiration-cache=0",
			"javax.portlet.supports.mime-type=text/html",
			"javax.portlet.info.title=Simple Form Portlet",
			"javax.portlet.info.short-title=Form Portlet",
			"javax.portlet.info.keywords=Form"
	},
	service = Portlet.class
)
public class SimpleformWebPortlet extends MVCPortlet {
}