<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="includes/header.jsp"></jsp:include>


<link href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.css" rel="stylesheet">

<style>
.card-footer{
background-color:transparent;
border: none;
}
.card-header{
padding:0;
}
button.btn-link{
color: #006369 !important;
font-weight: 600;
word-break: break-word;white-space: normal;
text-align: left;
}

.card-body{
    padding-bottom: 0;
}

.carousel-controls .control {
  position: absolute;
      top: 150px;
}

.prev {
  left: 20px;
color:#00595E !important;
z-index: 3;
opacity:0.5
}

.next {
  right: 20px;
color:#00595E !important;
  z-index: 3;
  opacity:0.5
}

/* Set width to make card deck cards 100% width */
@media (max-width: 950px) { 
	
	.card-deck {
	    display: block;
/* 	    width: 100%; */
/* 	    margin-bottom: .75rem;  */
/* 	    table-layout: fixed; */
/* 	    border-spacing: 1.25rem 0; */
	}
	.card-deck .card {
	    display: block;
    margin-bottom: .75rem; 
/* 	    vertical-align: top; */
	}
  
  .card-deck .card:not(:first-child) {
/*     margin-left: 0px; */
}
  
}
.slick-slide {
    outline: none
}


</style>




  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />

<div class="container main-container px-3">
<div class="jumbotron jumbo-mod">

 <img  data-aos="fade-left" class="d-block w-100 rounded-top" src="../img/products-v1.jpg" alt="products image">
<div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block px-3 pb-3">
     
     <h2 data-aos="zoom-in-up" class="title">Our products</h2>
     
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



<!-- <div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800"> -->
<!--      <div class="card-block px-3 pb-3"> -->
<div class="m-3">
<jsp:include page="WEB-INF/templates/products.jsp"></jsp:include>
<!--    </div> -->
<!--     </div> -->






<div class="card-deck">
  <div class="card" data-aos="fade-right" data-aos-duration="1100">
<!--     <img src="../img/you.jpg" class="img-fluid d-block mx-auto rounded-top"> -->
    <div class="card-body">
      <h4 class="card-title-custom">Can i try a TransformationPOD?</h4>
     <p class="card-text mb-3">We operate a fully functional gymnasium specifically designed around the needs of our clients, in Unit 3, Tara Court, Kilmessan, County Meath, Ireland. Here we train clients on how to use each machine and provide a convenient pay as you go system for single or multiple uses of the machines, which can be <a href="../contact/">booked by appointment</a>.
</p>
    </div>
  </div>
  <div class="card mb-0" data-aos="fade-left" data-aos-duration="1100">
<!--     <img src="../img/offer.jpg" class="img-fluid d-block mx-auto rounded-top"> -->
    <div class="card-body">
   <h4 class="card-title-custom">Can i buy a TransformationPOD?</h4>
      <p class="card-text mb-3">We are very excited to launch our Sales Department who can assist you with all of your queries. We are currently launching the sale of two different machines which have been in development for some time. We can advise you on the best machine for our requirements whether it is for home and personal use, a gymnasium, a rehabilitation clinic or a nursing home.</p>
    </div>
  </div>
</div>


</div>
































<div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block px-3 pb-3">













<!--   <h4 class="card-title-custom">What are the advantages of using our machines?</h4> -->
    <h4 data-aos="zoom-in-up" class="title">What are the advantages of using our vacuum machines?</h4>
<!-- <h5 class="text-center font-weight-bold orange">What are the advantages of using our machines?</h5> -->
<p>
We have had the pleasure of assisting many people with many different and complicated issues. We have therefore developed three different vacuum machines. Although they use similar technology, we can recommend the particular machine for you.
Some of the Advantages of our machines can be summarised as follows (click for more information):-


<div id="accordion">
  <div class="card">
    <div class="card-header">
      <h5 class="mb-0">
        <button class="btn btn-link" data-toggle="collapse" data-target="#d1" aria-expanded="true" aria-controls="collapseOne">
          Weightloss
        </button>
      </h5>
    </div>

    <div id="d1" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
      <div class="card-body pb-3">
       From our research we are satisfied that the exercise time required to achieve the same results as traditional methods of cardio is reduced by two thirds. So for time poor people this is fantastic.
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" >
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d2" aria-expanded="false" aria-controls="collapseTwo">
          Improved posture and gait
        </button>
      </h5>
    </div>
    <div id="d2" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
      <div class="card-body pb-3">
        Due to the specially engineered and patented design of our capsules, whilst using the machines your posture and gait are automatically corrected. We have introduced transparent side panels to one of our machines to allow a health care professional or trainer to perfectly assess how a person is walking or running so as to improve their performance, whether is it learning how to walk properly or improving technique for professional athletes. 
      </div>
    </div>
  </div>
    <div class="card">
    <div class="card-header">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d3" aria-expanded="false" aria-controls="collapseThree">
         Deep under pressure vacuum massage
        </button>
      </h5>
    </div>
    <div id="d3" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
        Whilst using the machines we have introduced Vacuum technology. The assists in reducing the exercise time required and assists with posture and gait. It creates a sensation of running in water.
      </div>
    </div>
  </div>
    <div class="card">
    <div class="card-header">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d4" aria-expanded="false" aria-controls="collapseThree">
        Cellulite reduction
        </button>
      </h5>
    </div>
    <div id="d4" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
        The combines effect of running on the treadmill and using the vacuum massage, will assist in the reduction of cellulite.  We also recommend that you drink water ever day whilst undergoing your treatment.
      </div>
    </div>
  </div>
    <div class="card">
    <div class="card-header">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d5" aria-expanded="false" aria-controls="collapseThree">
        Collagen Rejuvenation using LED Red light therapy
        </button>
      </h5>
    </div>
    <div id="d5" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
        We have used the best LED lights in our machines. Red light is able to penetrate the skin to a depth of 8-10mm, encouraging the cells to naturally stimulate the production of Collagen and Elastin. To see results we have included 2 important wavelengths: red and blue.
        The red rays are scientifically to stimulate collagen and elastin production by increasing local blood circulation. The results:
        <ul>
        <li>Plumped, glowing skin immediately after treatment</li>
          <li>Less wrinkles, fine lines and sagging skin after about 2 weeks</li>
            <li>Faster healing of acne</li>
        </ul>
        
        The blue rays are proven to kill acne-causing bacteria (up to 80% of them to be exact), which results with:
        
              <ul>
        <li>Speedy elimination of acne breakouts</li>
          <li>Prevention of new acne breakouts</li>
        </ul>
For wrinkle reduction, toned skin, brightened skin and acne prevention you'll have to be consistent with your treatment and you'll see noticeable results in 4-6 weeks, with three sessions per week.
        
      </div>
    </div>
  </div>
      <div class="card">
    <div class="card-header" id="headingThree">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d6" aria-expanded="false" aria-controls="collapseThree">
         Infra-red light therapy
        </button>
      </h5>
    </div>
    <div id="d6" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
       Infrared light is one of several innovative therapies integrated into the machine to help our clients who are dealing with chronic or acute pain. This unique treatment harnesses the healing power of specific wavelengths of light. When infrared energy is delivered to injury sites and other painful areas, it dramatically increases circulation, reduces inflammation, and promotes healing. The result is rapid relief of discomfort.
Treatment with infrared light therapy is simple and painless. Energy from the lights penetrates beneath the skin and is absorbed by deep tissues. After just 30 minutes of treatment, blood flow is enhanced by 400 percent. The most dramatic benefits of infrared light therapy are achieved with multiple treatment sessions.

      </div>
    </div>
  </div>
      <div class="card">
    <div class="card-header" id="headingThree">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d7" aria-expanded="false" aria-controls="collapseThree">
         Aroma therapy
        </button>
      </h5>
    </div>
    <div id="d7" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
        Aromatherapy essential oils are made using dozens of different medicinal plants, flowers, herbs, roots and trees grown all over the world - which have proven, powerful effects on improving physical, emotional and spiritual well-being.  Some of the most common reasons that people use it, according to research done by the PDQ Integrative, Alternative, and Complementary Therapies Board, include managing pain, improving sleep quality, reducing stress, overcoming symptoms of depression, soothing sore joints and even battling the effects of cancer. (1) (https://www.ncbi.nlm.nih.gov/pubmedhealth/PMH0032645/)
        
      </div>
    </div>
  </div>
      <div class="card">
    <div class="card-header" id="headingThree">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d8" aria-expanded="false" aria-controls="collapseThree">
         Ozone therapy
        </button>
      </h5>
    </div>
    <div id="d8" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
        Some researchers believe that ozone has therapeutic effects and the therapy has been studied and used for over 150 years. A layer of ozone is found in the earth's stratosphere. Its primary purpose is to protect the earth from the sun's ultraviolet radiation, most of which it absorbs. In medicine, ozone therapy is used to disinfect and treat conditions by disinfecting the area around them, improving the body's intake and use of oxygen, and activating the immune system. Using a gas as a medical treatment is unusual, so there are special techniques that are employed. Ozone can also be toxic when inhaled.
Today it is used for treating the following: infected wounds, circulatory disorders, geriatric disorders, Muscular degeneration, viral diseases, rheumatism and arthritis, cancer, SARS and AIDS.
Although ozone is a gas, developments in technology mean it can be used in several forms and different ways, including:
ozonated olive oil applied directly to the body
insufflation, a risky therapy where ozone is blown into the rectum
ozonated water, which is drunk
injections, which are often used in dentistry
autohemotherapy, where blood is withdrawn, mixed with ozone, and put back into the bloodstream
gas bath or sauna.
        
      </div>
    </div>
  </div>
        <div class="card">
    <div class="card-header" id="headingThree">
      <h5 class="mb-0">
        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#d9" aria-expanded="false" aria-controls="collapseThree">
         Colour Therapy
        </button>
      </h5>
    </div>
    <div id="d9" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
      <div class="card-body pb-3">
       Colour therapy is a complementary therapy for which there is evidence dating back thousands of years to the ancient cultures of Egypt, China and India.
Colour is simply light of varying wavelengths, thus each colour has its own particular wavelength and energy.  The energy relating to each of the seven spectrum colours of red, orange, yellow, green, blue, indigo and violet, resonates with the energy of each of the seven main chakras/energy centres of the body. Balance of the energy in each of the body's chakras is very important for health and wellbeing. Colour therapy can help to re-balance and/or stimulate these energies by applying the appropriate colour to the body and therefore re-balance our chakras.
       
      </div>
    </div>
  </div>
</div>




   </div>
    </div>









<jsp:include flush="true" page="WEB-INF/templates/speak.jsp"></jsp:include>
















</div>





  <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
  <script>
    AOS.init();
  </script>


<script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.js"></script>
<script>

$(document).ready(function() {
	  $(".product-images").slick({
	    infinite: true,
	    slidesToShow: 1,
	    slidesToScroll: 1,
	    autoplay: false,
	    arrows: true,
// 	    adaptiveHeight: true,
	    prevArrow: $(".prev"),
	    nextArrow: $(".next")
	  });
	});
</script>



<jsp:include flush="true" page="includes/footer.jsp"></jsp:include>