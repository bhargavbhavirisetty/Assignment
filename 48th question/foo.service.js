var employees=require("../employees.json");
module.exports.getEmployee=async(req,res,next)=>{
    console.log("testing..");
    res.send(employees);}
module.exports.putEmployee=async(req,res,next)=>{
    var body=req.body;
    console.log(req.body);
    var name=body.name;
    var id=body.id;
    var language=body.language;
    var book={name:name,id:id,language:language};
    employees.push(book);res.send(employees);
}

module.exports.getEmployeeById=async(req,res,next)=>{
    var id=req.params.id;
    var b=employees.find(x=>x.id==id);
    res.send(b);
}
