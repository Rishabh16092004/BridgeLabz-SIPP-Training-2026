USE COVID_DB;

ALTER TABLE covid_cases
ADD CONSTRAINT uq_country_date
UNIQUE (Country, Report_Date);
