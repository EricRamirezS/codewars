def clean_string(string)
  r = ""
  x = string.length - 1
  for i in 0..x do
    if string[i].eql?('#')
      r = r[0..-2]
    else
      r = r + string[i]
    end
  end
  r
end