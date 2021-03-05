select products.product_id, products.product_name, products.list_price 
FROM products 
INNER JOIN product_categories 
on products.category_id=product_categories.category_id
WHERE products.category_id=5;