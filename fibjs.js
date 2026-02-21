/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let s=0;
    yield s;
    let b=1;
    yield b;
    while(true){
        let temp=b;
        b+=s;
        yield b;
        s=temp;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
