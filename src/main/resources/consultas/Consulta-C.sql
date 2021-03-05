SELECT c.country_name, w.warehouse_name, l.address, l.city, l.state  from warehouses w
INNER JOIN locations l on l.location_id=w.location_id
INNER JOIN countries c on c.country_id = l.country_id
ORDER BY c.country_name ASC;