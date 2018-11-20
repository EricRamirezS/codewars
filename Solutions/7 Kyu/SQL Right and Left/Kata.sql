SELECT
  LEFT(project, commits) project,
  RIGHT(address, contributors) address
FROM repositories