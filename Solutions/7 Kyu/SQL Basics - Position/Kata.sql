SELECT
  id,
  name,
  position( ',' in characteristics) comma
FROM monsters
ORDER BY comma;