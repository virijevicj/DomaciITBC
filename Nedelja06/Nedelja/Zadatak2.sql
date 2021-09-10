SELECT CONCAT(dependents.first_name, ' ' , dependents.last_name)
FROM dependents 
WHERE relationship LIKE 'Child'
	  AND employee_id IN(
          SELECT employee_id
          FROM(
              SELECT employees.department_id, department_name, salary, ROW_NUMBER() OVER(PARTITION BY employees.department_id ORDER BY salary DESC) as sort, employees.employee_id
              FROM employees 
              INNER JOIN departments ON employees.department_id = departments.department_id)a
          WHERE sort = 1)

--employee_id 121 nema child u tabeli dependents, zato gornji upit vraca 10 njih(resenje je kod iznad) a ima 11 odeljenja; dokaz ispod
SELECT employee_id from dependents
intersect
SELECT employee_id
          FROM(
              SELECT employees.department_id, department_name, salary, ROW_NUMBER() OVER(PARTITION BY employees.department_id ORDER BY salary DESC) as sort, employees.employee_id
              FROM employees 
              INNER JOIN departments ON employees.department_id = departments.department_id)a
          WHERE sort = 1
--ili
SELECT * FROM dependents WHERE employee_id = 121
--vraca praznu tabelu
