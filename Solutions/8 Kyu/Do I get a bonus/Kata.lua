local solution = {}

function solution.bonus_time(salary, bonus)
    if bonus then
        return "$" .. (salary * 10)
    else
        return "$" .. salary
    end
end

return solution