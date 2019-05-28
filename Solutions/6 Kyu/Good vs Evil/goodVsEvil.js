const GOOD_WINS = 'Battle Result: Good triumphs over Evil';
const EVIL_WINS = 'Battle Result: Evil eradicates all trace of Good';
const TIE = 'Battle Result: No victor on this battle field';

function goodVsEvil(good, evil) {
    let goodWorth = 0;
    let evilWorth = 0;

    good = good.split(" ");
    evil = evil.split(" ");

    goodWorth += (1 * parseInt(good[0]));
    goodWorth += (2 * parseInt(good[1]));
    goodWorth += (3 * parseInt(good[2]));
    goodWorth += (3 * parseInt(good[3]));
    goodWorth += (4 * parseInt(good[4]));
    goodWorth += (10 * parseInt(good[5]));

    evilWorth += (1 * parseInt(evil[0]));
    evilWorth += (2 * parseInt(evil[1]));
    evilWorth += (2 * parseInt(evil[2]));
    evilWorth += (2 * parseInt(evil[3]));
    evilWorth += (3 * parseInt(evil[4]));
    evilWorth += (5 * parseInt(evil[5]));
    evilWorth += (10 * parseInt(evil[6]));

    return goodWorth > evilWorth ? GOOD_WINS : (goodWorth < evilWorth ? EVIL_WINS : TIE);
}