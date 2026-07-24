USE COVID_DB;

SELECT c.Country,
       cc.Report_Date,
       cc.Confirmed_Cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.Country = c.Country
WHERE cc.Report_Date = '2022-02-01'
ORDER BY cc.Confirmed_Cases DESC
LIMIT 1;
