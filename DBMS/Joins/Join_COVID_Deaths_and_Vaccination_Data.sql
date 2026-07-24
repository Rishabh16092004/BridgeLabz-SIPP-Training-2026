USE COVID_DB;

SELECT d.Country,
       d.Report_Date,
       d.Deaths,
       v.Total_Vaccinated,
       v.Fully_Vaccinated,
       v.Booster_Doses
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.Country = v.Country
AND d.Report_Date = v.Report_Date;
