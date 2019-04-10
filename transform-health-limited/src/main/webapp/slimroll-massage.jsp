<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="includes/header.jsp"></jsp:include>



<style>
 @media (max-width: 768px) { 
	 .desktop{
	 display: none; 
	 } 
	 .mobile{
	 display:block !important;
	 }
 } 
.h1,h1{
    font-size: 2.3rem !important;
}

hr.black{
    border: 0;
    height: 2px;
    background: black;
}
hr.red{
    border: 0;
    height: 2px;
    background: #EA5237;
}

hr.yellow{
    border: 0;
    height: 2px;
    background: #F59916;
}

/* li{ */
/* margin-top:5px; */
/* } */
.carousel-control-prev-icon {background-image: url("data:image/svg+xml;charset=utf8,%3Csvg xmlns='http://www.w3.org/2000/svg' fill='%23000' viewBox='0 0 8 8'%3E%3Cpath d='M5.25 0l-4 4 4 4 1.5-1.5-2.5-2.5 2.5-2.5-1.5-1.5z'/%3E%3C/svg%3E"); }
.carousel-control-next-icon {background-image: url("data:image/svg+xml;charset=utf8,%3Csvg xmlns='http://www.w3.org/2000/svg' fill='%23000' viewBox='0 0 8 8'%3E%3Cpath d='M2.75 0l-1.5 1.5 2.5 2.5-2.5 2.5 1.5 1.5 4-4-4-4z'/%3E%3C/svg%3E");}

</style>


<div class="container main-container" style="position: relative;">
   <a href="../../brochure/Transform_Slim_Roll.pdf" class="btn btn-success btn-sm" style="float:left;top:4px;position:absolute;left:19px;" download="slim roll massage">Download Brochure <i class="fas fa-file-pdf red"></i></a>
<div style="height:40px;width:100%;background-color:#EA5237;border-top-left-radius:5px;border-top-right-radius:5px;"></div>
<!-- <div style="height:15px;width:100%;background-color:#F59916"></div> -->
<div class="jumbotron bg-white" style="    padding-top: 10px;padding-bottom:0;">

<!-- <div class="container container-content deep-blue"> -->

<div class="row mt-3">

<div class="col-md-5">

<div id="carouselExampleControls" class="carousel slide mb-4" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100 border" src="../../img/slimroll-white-bg.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100 border" src="../../img/slimroll-white-bg-side.jpg" alt="Second slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<!-- <img src="../img/slimroll-white-bg.jpg" style="width:100%;" class="border mb-3"> -->



<div class="p-1 desktop" style="background-color:#FEE7CB">
<h3 class="pt-2 mb-1 pl-3 font-weight-bold red">SlimRoll Massage</h3>
<h5 class="my-1 pl-3 font-weight-bold red">Allows you to:</h5>
<ul class="font-weight-bold">
<li>Reduce body fat and shapes the body</li>
<li>Firm the skin and reduce cellulite</li>
<li>Reduce the volume of body parts</li>
<li>Remove the toxins from the body and improve blood circulation</li>
<li>Strengthen the immune system and improve metabolism</li>
<li>Relives muscle soreness and aids recovery</li>
</ul>
</div>
</div>

<div class="col-md-7">

<h1  class="font-weight-bold red">SlimRoll Massage</h1>
 
<h3 class="font-weight-bold mb-4 black">Professional device for massage and shaping of all parts of the body</h3>

<hr class="black">
<h5 class="font-weight-bold black">Infrared heated distinctively shaped roller with adjustable heat supply provides massage with elements of acupressure and stimulates lymphatic drainage</h5>
<hr class="black">

<p style="font-size:17px !important">The Mechanical pressure of rotating distinctively shaped wooden rolls improves
blood and lymph circulation, which helps to speed up metabolism, reduce fat
tissue and eliminate waste products. When used regularly TH Roller reduces the
volume of body parts, shapes the body, firms the skin and breaks up muscle
tightness. It is also an effective method of fat burning and cellulite reduction.</p>


<p style="font-size:17px !important">The device is equipped with an LCD colour touch screen monitor which displays
the position of exercises. The massage starts at the lower legs (always in and
upward direction towards the heart), including outer and inner thighs, hips,
buttocks, belly area, back and arms. Infrared heated roller warms up the body and
muscles which improves the effectiveness of the treatment. This revolutionary
design and ergonomic construction guarantees the highest level of comfort and
safety during the session.</p>


<div class="p-1 mobile" style="background-color:#FEE7CB;display:none;">
<h3 class="pt-2 mb-1 pl-3 font-weight-bold red">SlimRoll Massage</h3>
<h5 class="my-1 pl-3 font-weight-bold red">Allows you to:</h5>
<ul class="font-weight-bold">
<li>Reduce body fat and shapes the body</li>
<li>Firm the skin and reduce cellulite</li>
<li>Reduce the volume of body parts</li>
<li>Remove the toxins from the body and improve blood circulation</li>
<li>Strengthen the immune system and improve metabolism</li>
<li>Relives muscle soreness and aids recovery</li>
</ul>
</div>

</div>


</div>


<nav class=" mt-3">
  <div class="nav nav-tabs nav-fill" id="nav-tab" role="tablist">
    <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Features</a>
    <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Includes</a>
  </div>
</nav>
<div class="tab-content" id="nav-tabContent">
  <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
  
  
  
  
  <hr class="red">
<h5 class="font-weight-bold red">TH Roller Features:</h5>

<hr class="red">
<div class="row">

<div class="col-md">

<ul class="font-weight-bold">
<li>Power requirements: 230 VAC</li>
<li>Infrared lamps under the drum with adjustable intensity</li>
<li>2-way adjustable drum rotation</li>
<li>1 seat</li>
<li>Colour touch screen LCD monitor displays position and
performance of exercise. Exercises for the selected body
parts (feet, calves, back and front of thighs, inner/outer
thighs, buttocks, hips, abdominal, back, arms, or hands)</li>
<li>Pre-set programs. Editor to create up to 100 individual
exercise programs</li>
</ul>

</div>


<div class="col-md">

<ul class="font-weight-bold">
<li>Dimensions (Length 120cm/Width 75cm/ Height 100cm)</li>
<li>Weight: approx. 190 lbs/ 85 kg</li>
<li>Maximum power consumption 800 W</li>
<li>Customizable exterior</li>
<li>Recommended length of a treatment 14 min per body
part or up to 60 min in total</li>
</ul>
</div>



</div>
  
  
  
  
  </div>
  <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
  
    <hr class="yellow">
<h5 class="font-weight-bold yellow" >TH Roller Includes:</h5>

<hr class="yellow">
  

<div class="row">
<div class="col-md">
<ul class="font-weight-bold">
<li>Assessment of Installation site</li>
<li>Delivery and Installation of
Machine</li>
<li>Full day training for unlimited
persons at installation site.</li>
<li>Full training on using, maintenance
and cleaning of machine</li>

</ul>

</div>
<div class="col-md">
<ul class="font-weight-bold">
<li>Cleaning products</li>
<li>1 service on machine at 6 months
and after installation.</li>

<li>Warranty for 12 months on
Machine parts.</li>


</ul>

</div>
</div>
  

  
  
  </div>
</div>



    <div class="text-center">
<br><br>
<h4 class="text-center font-weight-bold mb-3 red">Speak to a representative</h4>
<a class="btn btn-red btn-lg mb-3"  href="../../../contact/">Call us now <i class="fas fa-phone"></i></a>
<br><br>
</div>





<div>

</div>


<!-- </div> -->
</div>
</div>






















<script>$('#thl-logo').attr('src','../../img/thl-logo-v5-orange.png');

</script>




<jsp:include flush="true" page="includes/footer.jsp"></jsp:include>