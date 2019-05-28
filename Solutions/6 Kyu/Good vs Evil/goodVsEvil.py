def goodVsEvil(good, evil):
    goodWorth = 0
    evilWorth = 0
    goodSplitted = good.split()
    evilSplitted = evil.split()

    goodWorth += (1 * int(goodSplitted[0]))
    goodWorth += (2 * int(goodSplitted[1]))
    goodWorth += (3 * int(goodSplitted[2]))
    goodWorth += (3 * int(goodSplitted[3]))
    goodWorth += (4 * int(goodSplitted[4]))
    goodWorth += (10 * int(goodSplitted[5]))

    evilWorth += (1 * int(evilSplitted[0]))
    evilWorth += (2 * int(evilSplitted[1]))
    evilWorth += (2 * int(evilSplitted[2]))
    evilWorth += (2 * int(evilSplitted[3]))
    evilWorth += (3 * int(evilSplitted[4]))
    evilWorth += (5 * int(evilSplitted[5]))
    evilWorth += (10 * int(evilSplitted[6]))
    return 'Battle Result: Good triumphs over Evil' if goodWorth > evilWorth \
        else ('Battle Result: Evil eradicates all trace of Good' if evilWorth > goodWorth \
                  else 'Battle Result: No victor on this battle field')
