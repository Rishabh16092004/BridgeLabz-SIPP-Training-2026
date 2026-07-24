USE COVID_DB;

START TRANSACTION;

INSERT INTO covid_vaccines
(Country, Report_Date, Total_Vaccinated, Fully_Vaccinated, Booster_Doses)
VALUES
('India','2022-03-01',950000000,850000000,300000000);

INSERT INTO covid_vaccines
(Country, Report_Date, Total_Vaccinated, Fully_Vaccinated, Booster_Doses)
VALUES
('USA','2022-03-01',250000000,220000000,110000000);

-- If any statement fails:
-- ROLLBACK;

COMMIT;
