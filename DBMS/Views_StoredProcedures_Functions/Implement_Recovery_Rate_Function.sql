USE COVID_DB;

DELIMITER $$

CREATE FUNCTION CalculateRecoveryRate(
    p_country VARCHAR(50)
)
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE rate DECIMAL(5,2);

    SELECT (Recoveries * 100.0 / Confirmed_Cases)
    INTO rate
    FROM covid_cases
    WHERE Country = p_country
    ORDER BY Report_Date DESC
    LIMIT 1;

    RETURN rate;
END $$

DELIMITER ;

SELECT CalculateRecoveryRate('India');
