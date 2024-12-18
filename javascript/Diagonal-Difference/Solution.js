'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

function diagonalDifference(arr) {
    let diagonalDifference = 0;
    let leftDiagonalSum = 0;
    let rightDiagonalSum = 0;
    let rightDiagonalCounter = arr.length - 1;
    
    for (let i = 0; i < arr.length; i++) {
        leftDiagonalSum += arr[i][i];
        rightDiagonalSum += arr[i][rightDiagonalCounter];
        rightDiagonalCounter--;
    }
    
    diagonalDifference = leftDiagonalSum - rightDiagonalSum;
    return Math.abs(diagonalDifference);
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    let arr = Array(n);

    for (let i = 0; i < n; i++) {
        arr[i] = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));
    }

    const result = diagonalDifference(arr);

    ws.write(result + '\n');

    ws.end();
}
