SELECT
  id,
  COALESCE(NULLIF(name,''), '[product name not found]') "name",
  price,
  COALESCE(NULLIF(card_name,''), '[card name not found]') card_name,
  card_number,
  transaction_date
FROM eusales
WHERE price > 50;