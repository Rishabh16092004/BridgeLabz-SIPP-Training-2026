USE COVID_DB;

-- Composite Index on Country and Report_Date
CREATE INDEX idx_country_date
ON covid_cases (Country, Report_Date);

-- Single Column Index on Report_Date
CREATE INDEX idx_report_date
ON covid_cases (Report_Date);

SHOW INDEX FROM covid_cases;
