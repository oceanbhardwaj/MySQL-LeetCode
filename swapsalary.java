update Salary set sex=IF(sex='m','f','m');
update Salary set 
sex=CASE sex 
when 'f' then 'm' else 'f' 
END;