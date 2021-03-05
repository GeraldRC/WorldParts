select p.category_name, COUNT(*) from product_categories p
inner JOIN products pr
on
pr.category_id=p.category_id group by p.category_name
ORDER BY COUNT(*) DESC;