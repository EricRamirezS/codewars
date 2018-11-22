SELECT
  people.id,
  name,
  count(sale) sale_count,
  rank() OVER
    (ORDER BY count(sale) DESC) sale_rank
FROM SALES
INNER JOIN PEOPLE ON sales.people_ID = people.id
GROUP BY people.id, name
ORDER BY count(sale) DESC;