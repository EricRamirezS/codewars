local kata = {}

function kata.nbYear(p0, percent, aug, p)
    local year = 0;
    while p0 < p do
        year = year + 1
        p0 = p0 + math.floor(p0 * (percent / 100)) + aug
    end
    return year
end

return kata