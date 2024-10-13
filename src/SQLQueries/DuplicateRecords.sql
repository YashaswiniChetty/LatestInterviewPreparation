
SELECT EmpId from Employee GROUP BY EmpId HAVING COUNT (EmpId)>1;
