--rollup

SELECT teams.regional_office,
       pipeline.sales_agent,
       SUM(pipeline.close_value)
  FROM sales_pipeline AS pipeline, sales_teams AS teams
 WHERE sales_pipeline.sales_agent = sales_teams.sales_agent
       AND sales_pipeline.deal_stage = "Won"
 GROUP BY ROLLUP(teams.regional_office, pipeline.sales_agent)
 ORDER BY teams.regional_office, pipeline.sales_agent

 --cube

 SELECT product,
       sales_agent,
       SUM(close_value)
  FROM sales_pipeline
 WHERE sales_pipeline.deal_stage = "Won"
 GROUP BY CUBE(product, sales_agent)
 ORDER BY product, sales_agent

 --pivot

 WITH table1 AS (
    SELECT pipeline.product AS product,
           teams.regional_office AS office,
           pipeline.close_value AS value
      FROM sales_pipeline AS pipeline, sales_teams AS teams
     WHERE sales_pipeline.sales_agent = sales_teams.sales_agent
           AND sales_pipeline.deal_stage = "Won"
)
SELECT *
  FROM table1
 PIVOT (SUM(value) FOR office IN ("East", "Central", "West"))
 ORDER BY product