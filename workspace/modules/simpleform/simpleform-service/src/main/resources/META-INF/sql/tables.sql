create table do_simpleform (
	uuid_ VARCHAR(75) null,
	formId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fullName VARCHAR(75) null,
	birthday DATE null,
	gender INTEGER,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	shortDesciption VARCHAR(75) null
);