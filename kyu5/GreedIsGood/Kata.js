function score( dice ) {
    var ones = 0;var twos = 0;var threes = 0;var fours = 0;var fives = 0;var sixs = 0;
    for(var i = 0; i < dice.length; i++){
        switch(dice[i]){
            case 1: ones++; break;
            case 2: twos++; break;
            case 3: threes++; break;
            case 4: fours++; break;
            case 5: fives++; break;
            case 6: sixs++; break;
        }
    }
    var score = 0;
    while(twos>2){
        score+=200; twos-=3;
    }
    while(threes>2){
        score+=300; threes-=3;
    }
    while(fours>2){
        score+=400; fours-=3;
    }
    while(sixs>2){
        score+=600; sixs-=3;
    }
    while(ones>0){
        if(ones>=3){ score+=1000; ones-=3;}
        else {score+=100; ones--;}
    }
    while(fives>0){
        if(fives>=3){ score+=500; fives-=3;}
        else {score+=50; fives--;}
    }
    return score;
}