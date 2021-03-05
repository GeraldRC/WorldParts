SELECT i.product_id , p.product_name, i.quantity from inventories i 
inner join products p on p.product_id = i.product_id
WHERE p.product_name LIKE '%Intel%';