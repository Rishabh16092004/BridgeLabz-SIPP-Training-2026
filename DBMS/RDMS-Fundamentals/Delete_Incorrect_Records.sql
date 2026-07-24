USE COVID_DB;

DELETE FROM covid_cases
WHERE Country = 'IN';

DELETE FROM covid_cases
WHERE Country = 'India'
AND Report_Date = '2022-01-01'
LIMIT 1;

SELECT * FROM covid_cases;
