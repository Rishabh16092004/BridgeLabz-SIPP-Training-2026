USE COVID_DB;

SELECT Report_Date,
       AVG(Deaths) AS Average_Daily_Deaths
FROM covid_deaths
GROUP BY Report_Date
ORDER BY Report_Date;
