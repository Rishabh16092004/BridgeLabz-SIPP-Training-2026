USE COVID_DB;

EXPLAIN
SELECT c.Country,
       cc.Confirmed_Cases,
       cc.Deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.Country = c.Country
WHERE cc.Report_Date = '2022-02-01';
