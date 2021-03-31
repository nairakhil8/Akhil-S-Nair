let names=['Tom','Ivan','Jerry'];
names=names.map((name) =>({
name,
length:name.length
}));

console.log(names);