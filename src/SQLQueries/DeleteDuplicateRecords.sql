DELETE FROM (SELECT * , row_number() OVER (partition BY EmpId ORDER BY EmpId) as rn FROM Employee) WHERE rn>1;
