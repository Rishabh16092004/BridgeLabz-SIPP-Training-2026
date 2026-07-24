USE COVID_DB;

CREATE TABLE IF NOT EXISTS covid_cases_audit (
    Audit_ID INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(50),
    Report_Date DATE,
    Old_Confirmed_Cases INT,
    New_Confirmed_Cases INT,
    Changed_On TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$

CREATE TRIGGER trg_before_update_covid_cases
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO covid_cases_audit(
        Country,
        Report_Date,
        Old_Confirmed_Cases,
        New_Confirmed_Cases
    )
    VALUES(
        OLD.Country,
        OLD.Report_Date,
        OLD.Confirmed_Cases,
        NEW.Confirmed_Cases
    );
END $$

DELIMITER ;
