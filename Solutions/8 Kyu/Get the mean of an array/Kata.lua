local kata = {}

---@param marks number[]
function kata.average(marks)
    local sum = 0
    for i = 1, #marks do
        sum = sum + marks[i]
    end
    local mean = sum / #marks

    return math.floor(mean + 0.5)
end

return kata