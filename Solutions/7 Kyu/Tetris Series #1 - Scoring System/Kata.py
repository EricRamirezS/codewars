def get_score(arr) -> int:
    total_lines = 0
    score = [0, 40, 100, 300, 1200]
    total_score = 0
    for ele in arr:
        total_score += (total_lines//10+1)* score[ele]
        total_lines += ele
    return total_score