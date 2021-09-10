SELECT co.country_name, SUM(salary)
FROM employees e
INNER JOIN departments d ON e.department_id = d.department_id
INNER JOIN locations l ON d.location_id = l.location_id
INNER JOIN countries co ON l.country_id = co.country_id
GROUP BY co.country_id
ORDER BY SUM(salary) DESC
