def max_match(sentence):
    word = sentence
    if word is "":
        return []
    if len(word) > 1:
        while not (word in VALID_WORDS):
            word = word[:-1]
            if len(word) == 1:
                break;
    return [word] + max_match(sentence.replace(word, "", 1))
