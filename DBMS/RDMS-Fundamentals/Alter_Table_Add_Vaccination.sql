USE COVID_DB;

ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);

UPDATE covid_cases
SET vaccination_rate = 72.50
WHERE Country = 'India';

UPDATE covid_cases
SET vaccination_rate = 68.40
WHERE Country = 'USA';

UPDATE covid_cases
SET vaccination_rate = 80.10
WHERE Country = 'UK';

SELECT * FROM covid_cases;
