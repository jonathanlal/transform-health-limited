<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="includes/header.jsp"></jsp:include>

  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />

<link href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.css" rel="stylesheet">
<style>


.card-footer{
background-color:transparent;
border: none;
}


.testimonials {
  position: relative;
}


.carousel-controls .control {
  position: absolute;
  transform: translateY(40%);
}

.prev {
  left: 5px;
color:#00595E !important;
position:absolute;
z-index: 3;
}

.next {
  right: 5px;
color:#00595E !important;
  z-index: 3;
}

.slick-slide {
    outline: none
}


.card-hover {
  transition: transform .5s !important;
}
.card-hover::after {
  position: absolute !important;
  top: 0 !important;
  left: 0 !important;
  width: 100% !important;
  height: 100% !important;
  transition: opacity 2s cubic-bezier(0.165, 0.84, 0.44, 1) !important;
  box-shadow: 0 8px 17px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.15) !important;
  content: '' !important;
  opacity: 0 !important;
  z-index: -1 !important;
}
.card-hover:hover, .card-hover:focus {
  transform: scale3d(1.006, 1.006, 1) !important;
}
.card-hover:hover::after, .card-hover:focus::after {
  opacity: 1 !important;
}

</style>





<div class="container main-container px-3">
<div class="jumbotron jumbo-mod">





<!-- <div class="banner-slideshow"  data-aos="fade-left"> -->
<!--   <div><img class="d-block w-100 rounded-top" src="img/carousel/carousel-5.jpg" alt="First slide"></div> -->
<!--   <div><img class="d-block w-100 rounded-top" src="img/carousel/carousel-3.jpg" alt="First slide"></div> -->
<!--       <div><img class="d-block w-100 rounded-top" src="img/carousel/carousel-1.jpg" alt="First slide"></div> -->
<!-- </div> -->



<div class="m-3 pt-1">
<div class="card bg-faded mt-3" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block px-3 pb-3 pt-3">
     <img alt="Transform Health Limited logo" src="../../img/logo-v1.png" style="width: 150px;margin: 0 auto !important;display:block;">
     
     <h2 data-aos="zoom-in-up" class="title mt-2">Meet Transform Health Limited</h2>
     
     <div class="card bg-faded bg-light">
<div class="card-block">

       <h5 class="deep-blue text-center p-3">Transform Health Limited designs, manufactures, and distributes, products to aid the rehabilitation
of many illnesses and injuries. We cater for physical rehabilitation specialising in mobility
assistance, general health, fitness and weight loss. Our Products are designed to cater for a broad
range of people from debilitated, unfit, to ambitious athlete. In association with Maria Kealy
Fitness we have sourced and developed our products around the needs of our clients.</h5>

    </div>
    </div>
    
    
     </div>
</div>



<div class="card-deck">
  <div class="card d-block card-hover mt-3 mb-0" data-aos="fade-right" data-aos-duration="1100" data-href="https://www.facebook.com/TransformHealthLtd/" onclick="goToPage(this);" style="cursor: pointer;">
    <img src="../img/bootcamp-4.jpg" class="img-fluid d-block mx-auto rounded-top">
    <div class="card-body">
      <h4 class="card-title-custom">Residential Luxury Bootcamp In Marbella Spain</h4>
     <p class="card-text text-center">Get summer ready with Transform Health Marbella Bootcamp 2019! 6 night residential boot camp in the heart of
Marbella. Limited spaces available! <strong>Read more
here!</strong>
</p>
    </div>
  </div>
  <div class="card d-block card-hover mb-0 mt-3" data-aos="fade-left" data-aos-duration="1100" data-href="../../products/" onclick="goToPage(this);" style="cursor: pointer;">
    <img src="../img/products-4.jpg" class="img-fluid d-block mx-auto rounded-top">
    <div class="card-body">
   <h4 class="card-title-custom">What does Transform Health Limited offer?</h4>
      <p class="card-text text-center">A safe and secure exercise environment that actively promotes rehabilitation, <strong>stability</strong>, <strong>posture</strong>, <strong>core</strong> and <strong>gait control</strong>, <strong>balance</strong>, <strong>aerobic activity</strong> and  <strong>muscle strength</strong>. <strong>Click to see more!</strong></p>
    </div>
  </div>
</div>


</div>












<section class="testimonials">

        <div class="carousel-controls text-center mx-3 mb-1 mt-0">
     
 


<div class="card bg-faded pb-4 px-4">
<div class="card-block">

  <h3 class="title">TESTIMONIALS</h3>
  
           <div class="control d-flex align-items-center justify-content-center prev mt-3"><i class="fa fa-chevron-left"></i></div>
          <div class="control d-flex align-items-center justify-content-center next mt-3"><i class="fa fa-chevron-right"></i></div>

          <div class="testimonial-carousel" data-aos="zoom-out-down">
          
           
   
     

          
          
<div><div class="card bg-faded bg-light">
<div class="card-block p-3"><p class="m-0 p-0">
"For some of our students this is their first time to run or jog with freedom and safety, without the fear of tripping on uneven paths, or bumping into bins or parked cars or over an uneven surface.
For some others mobility issues prevent them from running at all and the pod supports them, allowing them to move freely and exercise meaningfully for the first time in their lives. One of our long term donor's believed that we would benefit greatly from having one of these pods on site and Maria and her team have designed a prototype especially for our students which will suit all ages. Thanks to our wonderful donor, we now have our own pod in ChildVision for daily use by all our students."
</p>
<p class="pt-2 pb-0 m-0 text-center d-inline-block"><a href="http://childvision.ie" target="_blank"><img src="../../img/Child-Vision-Logo.png" style="width:150px;"></a></p>

</div>
</div></div>

<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"I went on a hiking holiday and had a traumatic accident, which caused me to suffer life threatening injuries. I suffered a brain injury and was left completely blind with limitations to my walking and any exercise. In the first 8 weeks of me using the Transform Health Vacuum machines, I lost 7% Body Fat and I can now run 5 kilometers on the road. On a recent visit to my consultant it was recommended that I required less physiotherapy.  My mental health wellbeing has changed so much that I am taking the next step on my journey to independent living."
</p>
 <footer class="blockquote-footer pb-3">Eoin, aged  28, IT and Finance.</footer>
</div>
</div></div>



<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"I had a heart attack and have recovered within a three month period by using the Transform Health Vacuum machines. My physiotherapist and doctor have deemed me fit to go back to work on a part time basis."
</p>
 <footer class="blockquote-footer pb-3">Joyce, ICU nurse.</footer>
</div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"I was keen footballer and unfortunately had to undergo major knee surgery. I cut my recovery time in half by using Transform Health Vacuum Machines."
</p>
 <footer class="blockquote-footer pb-3">Raymond, Retired Footballer and Farmer.</footer>
</div>
</div></div>

<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"I have always struggled to make my weight as a Professional Jockey. At one stage I decided to finish this career choice until I discovered Transform Health Vacuum Machines. I have returned to this profession and I have won a number of races. I am currently training on the machines and I continuously make my weight for my races."
</p>
 <footer class="blockquote-footer pb-3">Keith, aged 25, Jockey.</footer>
</div>
</div></div>





<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"I am a keen runner but underwent back surgery which caused me a lot of problems running on the road. After using the Vacuum Health Treadmill machines for 2 months I knocked 5 minutes off my personal best."
</p>
 <footer class="blockquote-footer pb-3">Michael, aged 35, process manager.</footer>
</div>
</div></div>




<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"I have arthritis and use the Vacuum Machine to improve my circulation, increase my mobility and ease my pain, which has massively improved my fitness."
</p>
 <footer class="blockquote-footer pb-3">Ita.</footer>
</div>
</div></div>



<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 pt-3 px-3 pb-2">
"It's the first day of my holiday and I feel fantastic. It's the first time in a very long time, if ever, when I haven't dreaded going away. I'm fitter and healthier than I think I've ever been loosing 11.5% body fat."
</p>
 <footer class="blockquote-footer pb-3">J.</footer>
</div>
</div></div>


				  
<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Sarah who is a double stroke sufferer with Parkinson's and had not walked unassisted in over 11 years. After 6 months using our product, Sarah now walks unassisted for a full 30 minutes and has not had to increase her medication since starting with us. Her consultant is very happy with her progress as it has improved her overall muscle mass/tone/memory and well-being."
</p></div>
</div></div>
				  
				  
<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Peter is a heart attack sufferer.  After working with us, Peter has dramatically reduced his medication and now trains in our facility with his marathon running wife"
</p></div>
</div></div>
				  
<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Karyna a grandmother suffering with Angina unable to exercise and enjoy a life with her grandkids, her work with us has relieved her pain and she is reporting more energy and NO palpitations, unless of course from the grandkids"
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Louise has been having operations since she was 6, suffers from fibromyalgia, a cancer recovery patient, and contracted a rare virus that is eating away her immune system reducing her lung function up to 70%.  After working with us, she is exercising daily with an improved lung function."
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Darren (or superman as we like to call him) is 27 years old, he suffered life threatening injuries during a hiking accident 2 years ago. He suffered a brain injury and has been left completely blind with limitations to walking and any exercise. In 8 weeks he lost 7% Body Fat and completed his first 5k (running and walking). On his last visit to his consultant it was recommended that he required less physio and due to his physical well-being, his mental well - being had also improved which has  encouraged him to return to work."
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Charles is also blind and was told by his medical supervisors that he cannot walk for longer than 15 minutes and would require 10 minutes resting in between, which would make trips outside his home problematic... After 12 sessions with us he repeatedly ran with vacuum and incline for 30 minutes... His parents, teachers and mentors have challenged the report due to his improvements."
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Martina 39, is another stroke victim. Her fear of falling prevented her from going for walks. She is now walking for a full 30 minutes fear free! Her reliance on physio treatments have been decreased and her consultant has been happy with her progress (improved gait, speed and ability to walk continuously and overall mental well - being)"
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Oliver is a keen runner but has been hindered by injury over the last few years. Since training with us he not only ran, but achieved, his personal best in a Marathon. His physical therapist has recommended he conduct 50- 70% of his training on the machine to improve his posture aliment which will prevent further onset of the injury"
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Roberto - a retired footballer had knee surgery and through rehabilitating the knee and training with us returned to play for his club. His physio was astounded by the recovery progress when using the machine - his muscle tone and ability to run with no pain or swelling"
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Victor - another retired footballer finds exercising uncomfortable due to arthritis in his back. He can run comfortably for 30 mins on our machine pain free, which he finds helps his physical and mental well-being."
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Hannah - underwent major neck and back surgery and used our machine as part of her recovery and fitness regime.  After 4 short weeks Hannah can now comfortably walk 10k on the roads."
</p></div>
</div></div>


<div><div class="card bg-faded bg-light">
<div class="card-block"><p class="m-0 p-3">
"Francis is 19 years old and has Down syndrome. The improvement in his coordination, gait, strength and fitness is reflected in his body analysis results dropping 10 inches and 3% body fat."
</p></div>
</div></div>


				  
				  
				  
          </div>
          </div></div>
          
          
          
          
          
          
          
          
          
          
          
        </div>
</section>



<jsp:include flush="true" page="WEB-INF/templates/speak.jsp"></jsp:include>




</div>
</div>

  <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
  <script>
    AOS.init();
  </script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.js"></script>
<script>

$(document).ready(function() {
	  $(".testimonial-carousel").slick({
	    infinite: true,
	    slidesToShow: 1,
	    slidesToScroll: 1,
	    autoplay: false,
	    arrows: true,
	    adaptiveHeight: true,
	    prevArrow: $(".prev"),
	    nextArrow: $(".next")
	  });
	});

$(document).ready(function(){
	  $('.banner-slideshow').slick({
		  slidesToShow: 1,
	      slidesToScroll: 1,
	      autoplay: true,
	      autoplaySpeed: 2000,
	      arrows: false,
	      lazyLoad: 'ondemand',
	      touchThreshold: 4,
	      focusOnSelect: false
	      
	  });
	});


	
	


</script>


<script>

// (function ($) {
//     var touchStartX = null;

//     $('.carousel').each(function () {
//         var $carousel = $(this);
//         $(this).on('touchstart', function (event) {
//             var e = event.originalEvent;
//             if (e.touches.length == 1) {
//                 var touch = e.touches[0];
//                 touchStartX = touch.pageX;
//             }
//         }).on('touchmove', function (event) {
//             var e = event.originalEvent;
//             if (touchStartX != null) {
//                 var touchCurrentX = e.changedTouches[0].pageX;
//                 if ((touchCurrentX - touchStartX) > 60) {
//                     touchStartX = null;
//                     $carousel.carousel('prev');
//                 } else if ((touchStartX - touchCurrentX) > 60) {
//                     touchStartX = null;
//                     $carousel.carousel('next');
//                 }
//             }
//         }).on('touchend', function () {
//             touchStartX = null;
//         });
//     });

// })(jQuery);

</script>





<script>


function goToPage(e){
	var url = e.getAttribute("data-href");
	window.location.href = url;
}



</script>






<jsp:include flush="true" page="includes/footer.jsp"></jsp:include>