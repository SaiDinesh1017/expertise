DROP TABLE IF EXISTS experts;

CREATE TABLE experts (
  id INT AUTO_INCREMENT PRIMARY KEY,
  domain_name VARCHAR(250) NOT NULL,
  employee_name VARCHAR(250) NOT NULL
);

INSERT INTO experts (domain_name, employee_name) VALUES
('Java', 'Micheal'),
('Java', 'Joe'),
('Java', 'Attilio'),
('Java', 'Joseph'),
('Java', 'Ichae'),
('Java', 'Francisco'),
('Spring-boot', 'Frank'),
('Spring-boot', 'Ricky'),
('Spring-boot', 'Micheal'),
('Spring-boot', 'Joe'),
('Spring-boot', 'Attilio'),
('Spring-boot', 'Joseph'),
('Spring-boot', 'Ichae'),
('Spring-boot', 'Francisco'),
('Angular', 'Frank'),
('Angular', 'Ricky'),
('Angular', 'Micheal'),
('Angular', 'Joe'),
('Angular', 'Attilio'),
('Angular', 'Joseph'),
('Angular', 'Ichae'),
('Angular', 'Francisco')
