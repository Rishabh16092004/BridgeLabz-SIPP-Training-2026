USE COVID_DB;

CREATE TABLE IF NOT EXISTS continents (
    Country VARCHAR(50) PRIMARY KEY,
    Continent VARCHAR(50)
);

INSERT IGNORE INTO continents VALUES
('India','Asia'),
('USA','North America'),
('UK','Europe');

SELECT ct.Continent,
       SUM(cc.Deaths) AS Total_Deaths
FROM covid_cases cc
INNER JOIN continents ct
ON cc.Country = ct.Country
GROUP BY ct.Continent;
