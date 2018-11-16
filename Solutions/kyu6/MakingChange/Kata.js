const makeChange = (amount) => {
    var H =0,Q=0,D=0,N=0,P=0;
    H = Math.floor(amount/50);
    amount -= (50*H);
    Q = Math.floor(amount/25);
    amount -= (25*Q);
    D = Math.floor(amount/10);
    amount -= (10*D);
    N = Math.floor(amount/5);
    amount -= (5*N);
    P = amount;
    var change = {};
    if(H>0) change.H = H;
    if(Q>0) change.Q = Q;
    if(D>0) change.D = D;
    if(N>0) change.N = N;
    if(P>0) change.P = P;
    return change;
};