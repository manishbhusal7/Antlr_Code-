// grammar Hello;

// greet: 'Hello' ID;

// ID: [a-zA-Z]+;

grammar Hello;

startRule: greet EOF;

greet: 'Hello' ID;

ID: [a-zA-Z]+;
