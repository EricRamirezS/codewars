SELECT
  name,
  country
FROM travelers
WHERE country <> ALL(ARRAY['Mexico','Canada','USA']);