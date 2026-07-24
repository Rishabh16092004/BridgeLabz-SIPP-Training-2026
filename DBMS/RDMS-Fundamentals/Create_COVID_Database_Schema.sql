CREATE DATABASE COVID_DB;

USE COVID_DB;

CREATE TABLE covid_cases (
    Country VARCHAR(50),
    Report_Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Population BIGINT
);

CREATE TABLE covid_deaths (
    Country VARCHAR(50),
    Report_Date DATE,
    Deaths INT,
    Death_Rate DECIMAL(5,2)
);

CREATE TABLE covid_vaccines (
    Country VARCHAR(50),
    Report_Date DATE,
    Total_Vaccinated BIGINT,
    Fully_Vaccinated BIGINT,
    Booster_Doses BIGINT
);

SHOW TABLES;
DESC covid_cases;
DESC covid_deaths;
DESC covid_vaccines;
