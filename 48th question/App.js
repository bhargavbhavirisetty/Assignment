var express =require('express');
var routes= require('./routers');
var app=express();
const bodyParser=require("body-parser");
const userRouter=require('./routers');
app.use(bodyParser.json({limit:"50mb"}))
.use('/employees',userRouter);
module.exports=app;
app.listen(3000);