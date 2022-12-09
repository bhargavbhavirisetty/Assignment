const{ Router }=require("express");
const router=new Router();
const fooService=require("../service/foo.service");

router.get("/list",fooService.getEmployee);
router.post("/addemployee",fooService.putEmployee);
router.get("/id/:id",fooService.getEmployeeById);


module.exports=router;