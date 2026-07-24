USE COVID_DB;

SELECT Country,
       Confirmed_Cases,
       Population,
       (Confirmed_Cases * 100.0 / Population) AS Infection_Rate
FROM covid_cases
ORDER BY Infection_Rate DESC;
