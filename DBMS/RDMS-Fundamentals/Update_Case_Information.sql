USE COVID_DB;

UPDATE covid_cases
SET Confirmed_Cases = 42500000
WHERE Country = 'India'
AND Report_Date = '2022-02-01';

SELECT * FROM covid_cases
WHERE Country = 'India';
