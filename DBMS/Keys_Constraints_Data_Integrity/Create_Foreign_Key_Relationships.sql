USE COVID_DB;

CREATE TABLE countries (
    Country VARCHAR(50) PRIMARY KEY,
    Population BIGINT
);

INSERT INTO countries VALUES
('India',1393409038),
('USA',331893745),
('UK',67886011);

ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (Country)
REFERENCES countries(Country);
