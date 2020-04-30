DROP TABLE IF EXISTS experts;

CREATE TABLE experts (
  id INT PRIMARY KEY,
  domain_name VARCHAR(250) NOT NULL,
  employee_name VARCHAR(250) NOT NULL
);

INSERT INTO experts (id, domain_name, employee_name) VALUES
('1', 'Java', 'Micheal'),
('2', 'Java', 'Joe'),
('3', 'Java', 'Attilio'),
('4', 'Java', 'Joseph'),
('5', 'Java', 'Ichae'),
('6', 'Java', 'Francisco'),
('7','Spring-boot', 'Frank'),
('8','Spring-boot', 'Ricky'),
('9', 'Spring-boot', 'Micheal'),
('10', 'Spring-boot', 'Joe'),
('11', 'Spring-boot', 'Attilio'),
('12', 'Spring-boot', 'Joseph'),
('13', 'Spring-boot', 'Ichae'),
('14', 'Spring-boot', 'Francisco'),
('15','Angular', 'Frank'),
('16','Angular', 'Ricky'),
('17', 'Angular', 'Micheal'),
('18', 'Angular', 'Joe'),
('19', 'Angular', 'Attilio'),
('20', 'Angular', 'Joseph'),
('21', 'Angular', 'Ichae'),
('22', 'Angular', 'Francisco')
