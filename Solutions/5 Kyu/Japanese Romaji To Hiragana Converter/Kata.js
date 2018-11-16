function romajiToHiragana(romaji) {
    var syllabe = '';
    var hiraganaText = '';
    for (var i = 0; i < romaji.length; i++) {
        if (syllabe.length === 0) {
            if (isVowel(romaji.charAt(i), false)) {
                hiraganaText = hiraganaText + hiragana.get(romaji.charAt(i));
            } else {
                syllabe = syllabe + romaji.charAt(i);
            }
        } else {
            if (isVowel(romaji.charAt(i), true)) {
                if (romaji.charAt(i) === "y") {
                    hiraganaText = hiraganaText + hiragana.get(syllabe + 'i') +
                        getSmallVersion("y" + romaji.charAt(++i));
                    syllabe = "";
                } else {
                    hiraganaText = hiraganaText + hiragana.get(syllabe + romaji
                        .charAt(i));
                    syllabe = "";
                }
            } else if (syllabe.length === 1) {
                if (syllabe === "n") {
                    hiraganaText = hiraganaText + hiragana.get("n");
                    syllabe = romaji.charAt(i);
                } else if (romaji.charAt(i) === "h") {
                    syllabe = syllabe + romaji.charAt(i);
                } else if (syllabe === romaji.charAt(i)) {
                    hiraganaText = hiraganaText + getSmallVersion('tsu');
                } else {
                    syllabe = syllabe + romaji.charAt(i);
                }
            }
        }
    }
    if (syllabe === "n") hiraganaText = hiraganaText + hiragana.get("n");
    return hiraganaText;
}

function isVowel(x, acceptY) {
    if (acceptY) return ("aeiouyAEIOUY".indexOf(x) !== -1);
    return ("aeiouAEIOU".indexOf(x) !== -1);
}

function getSmallVersion(x) {
    return hiragana.get(x + "Small");
}