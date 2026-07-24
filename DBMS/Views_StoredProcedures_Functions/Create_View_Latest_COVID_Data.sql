USE COVID_DB;

CREATE OR REPLACE VIEW Latest_Covid_Data AS
SELECT c.Country,
       c.Report_Date,
       c.Confirmed_Cases,
       c.Deaths,
       c.Recoveries
FROM covid_cases c
JOIN (
    SELECT Country, MAX(Report_Date) AS Latest_Date
    FROM covid_cases
    GROUP BY Country
) x
ON c.Country = x.Country
AND c.Report_Date = x.Latest_Date;

SELECT * FROM Latest_Covid_Data;
