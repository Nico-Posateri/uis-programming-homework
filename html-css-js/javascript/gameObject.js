/*
Modify the game object in index.js:
  - Add two properties: lives - initially 3, and coins - initially 0.
  - Add a getter called points that returns coins * 10.
  - Add a playerDies() method that subtracts 1 from lives if lives is greater than 0.
  - Add a newGame() method that sets lives to 3 and coins to 0.

Expected output:
  Testing game object...
  lives = 3
  coins = 0
  points = 0
  points = 20
  lives = 2
  lives = 0
  lives = 3
  coins = 0
*/

let game = {
    lives: 3,
    coins: 0,
    points: 0,
    get points() {
      return this.coins * 10;
    },
    playerDies() {
      if (this.lives > 0) {
         this.lives--;
      }
    },
    newGame() {
      this.lives = 3;
      this.coins = 0;
    }
};

console.log("Testing game object...");

console.log("lives = " + game.lives);    // should be 3
console.log("coins = " + game.coins);    // should be 0
console.log("points = " + game.points);  // should be 0
game.coins = 2;
console.log("points = " + game.points);  // should be 20
game.playerDies();
console.log("lives = " + game.lives);    // should be 2
game.playerDies();
game.playerDies();
game.playerDies();
console.log("lives = " + game.lives);    // should be 0
game.newGame();
console.log("lives = " + game.lives);    // should be 3
console.log("coins = " + game.coins);    // should be 0

export default game;