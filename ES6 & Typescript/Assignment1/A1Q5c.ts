let printcapitalNames=(...m) =>
{
    for(let i in m)
    {console.log(m[i].toUpperCase());}
};

let display=["disha","hi","ok","done"];
printcapitalNames(...display);