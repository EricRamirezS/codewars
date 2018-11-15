function commas(num){
    return Number(num.toFixed(3)).toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}