SELECT w.warehouse_name, SUM(p.list_price * i.quantity) AS inventario_valorizado
from warehouses w 
inner join inventories i on i.warehouse_id = w.warehouse_id
inner JOIN products p on p.product_id = i.product_id GROUP BY w.warehouse_name
ORDER BY w.warehouse_name ASC;