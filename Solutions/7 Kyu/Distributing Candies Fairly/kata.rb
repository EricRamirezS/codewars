def distribute(m, n)
  if n<=0 then return Array.new end
  if m<=0 then return Array.new(n,0) end
  candies = Array.new(n,0)
  while m>0
    for i in 0...n
      if m>0
        candies[i]+=1
        m-=1
      else break end
    end
  end
  candies
end