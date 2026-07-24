USE COVID_DB;

-- Add infection_rate column if it does not exist
ALTER TABLE covid_cases
ADD COLUMN infection_rate DECIMAL(8,4);

-- Create covering index
CREATE INDEX idx_infection_rate
ON covid_cases (infection_rate, Country, Population);

-- Top 10 countries by infection rate
SELECT Country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;
