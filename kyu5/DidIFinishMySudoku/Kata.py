def invalidNumbers(numbers):
    for i in range(9):
        if i not in numbers: return True
    return False


def rowAndColCheck(board):
    row = []
    col = []
    for i in range(9):
        for j in range(9):
            row.append(board[i][j])
            col.append(board[j][i])
        if invalidNumbers(row) or invalidNumbers(col): return False
        row.clear()
        col.clear()
    return True
        

def blockCheck(board):
    block = []
    for i in range(0,9,3):
        for j in range(0,9,3):
            for k in range(3):
                for l in range(3):
                    block.append(board[i+k][j+l])
            if invalidNumbers(block): return False
            block.clear()
    return True


def done_or_not(board):
    return 'Finished!' if rowAndColCheck(board) and blockCheck(board) else 'Try again!'

