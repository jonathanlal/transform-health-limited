<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="includes/header.jsp"></jsp:include>


  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
<style>

.circle-icon {
    background: #006369;
    width: 100px;
    height: 100px;
    border-radius: 50%;
    text-align: center;
    line-height: 100px;
    vertical-align: middle;
    padding: 30px;
}
.errorInput::-webkit-input-placeholder {
    color: red;
}


</style>






<div class="container main-container px-3">
<div class="jumbotron jumbo-mod" style="padding-bottom:5px !important;">

  <img  data-aos="fade-down" class="d-block w-100 rounded-top" src="../img/contact-v1.jpg" alt="Contact image">

<div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block px-3 pb-3">
     <h2 data-aos="zoom-in-up" class="title">Contact Us</h2>
          <div class="card bg-faded bg-light">
<div class="card-block">
       <h5 class="deep-blue text-center p-3">We would love you to come and join us at our research facility and fully functional Gymnasium located at Unit 3, Tara Court, Kilmessan, County Meath, Ireland.</h5><h5 class="deep-blue text-center pt-0 px-3 pb-3 font-italic"> Transform and Achieve with Transform Health Limited</h5>
    </div>
    </div>
     </div>
</div>




<div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block text-center mt-3">
<div class="row">
<div class="col-md">
<i class="far fa-envelope circle-icon" style="line-height: inherit;font-size: 30px;margin-bottom: 5px;color: white;"></i>
	<h5  class="font-weight-bold" style="color:#006369 !important;margin-bottom:0;">Email</h5>
	<p style="font-size: 16px;">team@transformationpod.com</p>

</div>
<div class="col-md">
<i class="fas fa-map-marker-alt circle-icon" style="line-height: inherit;font-size: 30px;margin-bottom: 5px;color: white;"></i>
<h5  class="font-weight-bold" style="color:#006369 !important;margin-bottom:0;">Address</h5>
	<p style="font-size: 16px;">Unit 3, Tara Court, Kilmessan, County Meath, Ireland</p>
</div>
<div class="col-md">
<i class="fas fa-phone circle-icon" style="line-height: inherit;font-size: 30px;margin-bottom: 5px;color: white;"></i>
<h5  class="font-weight-bold" style="color:#006369 !important;margin-bottom:0;">Telephone</h5>
	<p style="font-size: 16px;">+353 86 7799848</p>
</div>
</div>
     </div>
</div>


<div id="emailsent" class="mx-3 mt-3 mb-2 p-3" style="background-color:#8CCD8C;border-radius:3px;display:none;">
<h1 class="text-center deep-blue">Message Sent!</h1>
</div>
<div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800" id="emailcontainer">
     <div class="card-block px-3 pb-3">
<h4  class="title">Get in touch</h4>
<!-- <div class="container" style="max-width: 600px;"> -->
<div class="input-group input-group-lg mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text"><i class="far fa-user"></i></span>
  </div>
  <input type="text" class="form-control" aria-describedby="basic-addon3" placeholder="Name" required="required"  id="fname">
</div>


<div class="input-group input-group-lg mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text"><i class="far fa-envelope"></i></span>
  </div>
  <input type="text" class="form-control" aria-describedby="basic-addon3" placeholder="Email" required="required" id="femail">
</div>

<div class="input-group input-group-lg mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text"><i class="fas fa-phone"></i></span>
  </div>
  <input type="text" class="form-control" aria-describedby="basic-addon3" placeholder="Telephone" id="fphone">
</div>


<div class="input-group input-group-lg">
  <textarea class="form-control" aria-label="With textarea" placeholder="Message" rows="4" style="min-height: 50px;" id="fmessage" ></textarea>
</div>
<div class="text-right">
<button class="btn btn-success btn-lg mt-3 hvr-bounce-to-right" id="btnContactSubmit">Send</button>
</div>
</div>
</div>



</div>
</div>








  <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
  <script>
    AOS.init();
  </script>



<script>
document.getElementById("btnContactSubmit").onclick = function() {
	if(validateForm()){submitContact()}
};
function validateForm() {
	var check = false;
	var e=document.getElementById("femail").value,n=/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
	if(!e.match(n)){
		errorInput("femail");
	}else{check=true;}
	if(document.getElementById("fname").value == '' || document.getElementById("fname").value.length == 0){
		errorInput("fname");
		check=false;
	}else{check=true;}
	return check;
}
function resetErrorInput(){
	changePlaceHolderTextByElementID("fname");
    var name = document.getElementById("fname");
    name.classList.remove("errorInput");
    changePlaceHolderTextByElementID("femail");
    var email = document.getElementById("femail");
    email.classList.remove("errorInput");
}
function changePlaceHolderTextByElementID(elementID){
	document.getElementById(elementID).placeholder=getTextFromNode(elementID+'txt');
}
function getTextFromNode(elementID){
	var node = document.getElementById(elementID);
	return node.textContent || node.innerText;
}
function errorInput(elementID){
	 var element = document.getElementById(elementID);
	 element.placeholder=getValidationText(elementID);
	 element.className += " errorInput";
	 window.setTimeout(resetErrorInput, 3000);
}
function getValidationText(elementID){
	var text;
		if(elementID.indexOf('fname')>=0){text = "*Type in your name.";}
		if(elementID.indexOf('femail')>=0){text = "*Type in your email.";}
	return text;
}
function submitContact(){
	var fmessage = document.getElementById('fmessage').value;
	var fname = document.getElementById('fname').value;
	var femail = document.getElementById('femail').value;
	var phone = document.getElementById('fphone').value;
	var url = window.location.href;
  document.getElementById("emailsent").style.display = "block";
  document.getElementById("emailcontainer").style.display = "none";
	var e = "name="+fname+"&email="+femail+"&msg="+fmessage+"&phone="+phone+"&url="+url;
	var n=new XMLHttpRequest();
	n.open("POST","../../../ContactServlet",!0),
	n.setRequestHeader("Content-type","application/x-www-form-urlencoded"),
	n.onreadystatechange=function(){
		  if (n.readyState == 4) {
			  document.getElementById("emailsent").style.display = "block";
			  document.getElementById("emailcontainer").style.display = "none";
	        }
	},n.send(e)
}

</script>











<jsp:include flush="true" page="includes/footer.jsp"></jsp:include>