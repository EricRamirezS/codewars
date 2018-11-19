def possible_positions(str)
  unless str.nil?
    chess_letter = %w{a b c d e f g h}
    letter = str.split("")[0]
    number = str.split("")[1].to_i
    arr = []
    index = chess_letter.index(letter)
    if index - 2 > -1
      if number - 1 > 0
        arr << chess_letter[index - 2] + (number - 1).to_s
      end
      if number + 1 < 9
        arr << chess_letter[index - 2] + (number + 1).to_s
      end
    end
    if index - 1 > -1
      if number - 2 > 0
        arr << chess_letter[index - 1] + (number - 2).to_s
      end
      if number + 2 < 9
        arr << chess_letter[index - 1] + (number + 2).to_s
      end
    end
    if index + 1 < 8
      if number - 2 > 0
        arr << chess_letter[index + 1] + (number - 2).to_s
      end
      if number + 2 < 9
        arr << chess_letter[index + 1] + (number + 2).to_s
      end
    end
    if index + 2 < 8
      if number - 1 > 0
        arr << chess_letter[index + 2] + (number - 1).to_s
      end
      if number + 1 < 9
        arr << chess_letter[index + 2] + (number + 1).to_s
      end
    end
    arr
  end
end