USE COVID_DB;

ALTER TABLE covid_cases
ADD CONSTRAINT pk_covid_cases
PRIMARY KEY (Country, Report_Date);
