<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="includes/header.jsp"></jsp:include>


<style>

.date-body{
  background-color: #00595E;padding-bottom: 5px;
}
.date-body .date-title{
  color: white;
}

.date-body .date-content{
  background-color: white;margin-left: 5px;margin-right: 5px;
}
.date-body .date-content p.dia{
  margin: 0; font-size: 45px; font-weight: bold;
}
.nomargin{
  margin: 0;
}



.card img{max-width:100%;}
.card-img-top-circle{
position:relative;
  width:200px;
  height:200px;
  border-radius:50%;
  overflow:hidden;
  margin: 0 auto;
  margin-top:15px;

}

</style>



  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
  
  
<!--   override from imported mess -->
  <style>
      
      ul{
          margin: unset !important;
      }
  
  
  </style>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  



    <link rel="preload" as="script" href="//g.fastcdn.co/js/utils.96115e0e398cba385e4c.js"></link>
    <link rel="preload" as="script" href="//g.fastcdn.co/js/Cradle.0de242fe650ee7637b63.js"></link>
    <link rel="preload" as="script" href="//g.fastcdn.co/js/LazyImage.11f65ec56b7eb117e504.js"></link>
    <link rel="preconnect dns-prefetch" href="https://fonts.gstatic.com" crossorigin></link>





    <link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic"/>
<link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700"/>


  <style type="text/css" media="screen">
    body{-moz-osx-font-smoothing:grayscale;-webkit-font-smoothing:antialiased;margin:0;width:100%;font-family:Lato;font-weight:400;background:repeat-x rgb(0,225,184) 53% 14%;background-image:url(//v.fastcdn.co/u/6cdd06f9/41785436-0-3.png),url(//v.fastcdn.co/u/6cdd06f9/41785436-0-3.png);}a{text-decoration:none;color:inherit;cursor:pointer;}a:not(.btn):hover{text-decoration:underline;}input,select,textarea,p,h1,h2,h3,h4,h5,h6{margin:0;font-size:inherit;font-weight:inherit;}main{overflow:hidden;}u > span{text-decoration:inherit;}ol,ul{padding-left:2.5rem;margin:.625rem 0;}p{word-wrap:break-word;}iframe{border:0;}*{box-sizing:border-box;}.item-absolute{position:absolute;}.item-block{display:block;height:100%;width:100%;}.item-cover{z-index:1000001;}.item-breakword{word-wrap:break-word;}.item-content-box{box-sizing:content-box;}.hidden{display:none;}.clearfix{clear:both;}@keyframes slide-down{from{opacity:0;transform:translateY(-50px);}}@keyframes fade-in{from{opacity:0;}}@supports (-webkit-overflow-scrolling:touch){.modal-on{position:fixed;-webkit-overflow-scrolling:touch;}#landing-page .section .section-block{background-attachment:scroll;opacity:1;}}.headline{font-family:Montserrat;font-weight:400;}.section-fit{max-width:400px;}.section-relative{position:relative;margin:0 auto;}.section-inner{height:100%;}#page-block-iwjlqw2ozp{height:34.0625rem;max-width:100%;}#page-block-iwjlqw2ozp .section-holder-border{border:0;}#page-block-iwjlqw2ozp .section-block{background:url(//v.fastcdn.co/u/6cdd06f9/41785436-0-3.png) repeat rgb(255,255,255) 50% 50% / cover;height:34.0625rem;}#page-block-iwjlqw2ozp .section-holder-overlay{opacity:0.8;background-color:#000000;display:block;}#element-521{top:11.125rem;left:1.6875rem;height:2.0625rem;width:22.5rem;z-index:45;color:#98A0A6;font-size:1.8125rem;line-height:2.0662499999999997rem;text-align:center;}#element-521 .x_dc658291{text-align:center;line-height:2.0625rem;font-size:1.8125rem;}#element-522{top:7.625rem;left:19.625rem;height:1.25rem;width:3.4375rem;z-index:47;color:#98A0A6;font-size:1.0625rem;line-height:1.2325rem;text-align:center;}#element-522 .x_ba44e98d{text-align:center;line-height:1.25rem;font-size:1.0625rem;}#element-528{top:2.5rem;left:1.25rem;height:6.394101876675603rem;width:22.5rem;z-index:73;}#element-530{top:18.9375rem;left:1.25rem;height:4.375rem;width:22.5rem;z-index:74;font-size:4.375rem;}@font-face{font-family:BebasNeue;font-style:normal;font-weight:400;src:url(https://v.fastcdn.co/a/font/bebasneue-webfont.eot);src:url(https://v.fastcdn.co/a/font/bebasneue-webfont.eot) format("embedded-opentype"),url(https://v.fastcdn.co/a/font/bebasneue-webfont.woff2) format("woff2"),url(https://v.fastcdn.co/a/font/bebasneue-webfont.woff) format("woff"),url(https://v.fastcdn.co/a/font/bebasneue-webfont.ttf) format("truetype");}.timer-column{width:20%;float:left;text-align:center;margin-left:5%;}.timer-column:first-child{width:25%;margin-left:0;}.timer-box{position:relative;font-size:.78em;margin-bottom:.12em;border-radius:5px;font-family:BebasNeue,sans-serif;height:100%;line-height:1.28em;}.timer-box:after,.timer-box:before{content:'';display:block;border-radius:50%;background-color:inherit;position:absolute;left:-.215em;width:.1em;height:.1em;}.timer-box:after{bottom:35%;}.timer-box:before{top:35%;}.timer-box:first-child:before,.timer-box:first-child:after{display:none;}.timer-number-zero{visibility:hidden;}.timer-text-none .timer-box{font-size:.78em;}.timer-text-bottom .timer-labels-top,.timer-text-top .timer-labels-bottom,.timer-text-none .timer-labels{display:none;}.timer-labels{text-transform:uppercase;margin-bottom:.18em;font-size:.13333em;position:relative;}.timer-label{padding-bottom:.1875rem;}#element-530 .timer-box{color:rgb(255,255,255);background-color:#37465a;}#element-530 .timer-labels{color:#37465A;}#element-532{top:14.75rem;left:1.6875rem;height:1.375rem;width:22.5rem;z-index:75;color:#37465A;font-size:1rem;line-height:1.4rem;text-align:center;}#element-532 .x_2c80ab57{text-align:center;line-height:1.375rem;font-size:1rem;}#element-532 .x_7672e1d5{color:#ff0000;}#element-533{top:26.3125rem;left:6.3125rem;height:3.375rem;width:12.3125rem;z-index:76;}.btn{cursor:pointer;text-align:center;transition:border .5s;width:100%;border:0;}.btn-shadow{box-shadow:0 1px 3px rgba(1,1,1,0.5);}#element-533 .btn.btn-effect3d:active{box-shadow:none;}#element-533 .btn:hover{background:#1565C0;}#element-533 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#page-block-j1og2tchsawp68oisq0duc8fr{height:73.6875rem;max-width:100%;}#page-block-j1og2tchsawp68oisq0duc8fr .section-holder-border{border:0;}#page-block-j1og2tchsawp68oisq0duc8fr .section-block{background:repeat rgb(7,219,180) 44% 55% / cover;background-image:url(//v.fastcdn.co/u/6cdd06f9/41567668-0-Marbella.jpeg),url(//v.fastcdn.co/t/6cdd06f9/4befc388/1555066696-41567668-ghost-Marbella.jpeg);height:73.6875rem;}#page-block-j1og2tchsawp68oisq0duc8fr .section-holder-overlay{opacity:0.68;background-color:#1EAE94;display:block;}#element-124{top:2.5rem;left:3.125rem;height:20.6875rem;width:18.6875rem;z-index:4;}.circle{border-radius:50%;}.shape{height:inherit;}.line-horizontal{height:.625rem;}.line-vertical{height:100%;margin-right:.625rem;}[class*='line-']{box-sizing:content-box;}#element-124 .shape{border:0;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-126{top:4.375rem;left:9.375rem;height:6.25rem;width:6.25rem;z-index:5;}#element-126 .shape{border:0.0625rem solid #00E1B8;background:url(//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg) repeat rgb(0,225,184) 28% 56% / cover;opacity:1;}#element-128{top:14.625rem;left:4.4375rem;height:6rem;width:16.0625rem;z-index:6;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-128 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-129{top:12.5rem;left:3.6875rem;height:2.125rem;width:17.625rem;z-index:7;color:#FFC67C;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-129 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-129 .x_7b2817bf{color:#000000;}#element-298{top:73.75rem;left:3.5625rem;height:2.6875rem;width:17.875rem;z-index:8;}#element-133{top:26.25rem;left:3.125rem;height:20.5625rem;width:18.6875rem;z-index:9;}#element-133 .shape{border:0;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-135{top:28.125rem;left:9.375rem;height:6.25rem;width:6.25rem;z-index:10;}#element-135 .shape{border:0.0625rem solid #00E1B8;background:url(//v.fastcdn.co/u/6cdd06f9/41567256-0-Beachfit.jpg) repeat rgb(238,238,238) 50% 50% / cover;opacity:1;}#element-137{top:38.9375rem;left:4.4375rem;height:6rem;width:16.0625rem;z-index:11;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-137 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-139{top:36.25rem;left:3.6875rem;height:2.125rem;width:17.625rem;z-index:12;color:#FFC67C;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-139 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-139 .x_0b4b869e{color:#191c29;}#element-142{top:50rem;left:3.125rem;height:20.1875rem;width:18.6875rem;z-index:13;}#element-142 .shape{border:0;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-144{top:51.875rem;left:9.375rem;height:6.25rem;width:6.25rem;z-index:14;}#element-144 .shape{border:0.0625rem solid #00E1B8;background:url(//v.fastcdn.co/u/6cdd06f9/41567236-0-Pool.jpeg) repeat rgb(0,225,184) 50% 50% / cover;opacity:1;}#element-146{top:62.5rem;left:4.4375rem;height:6rem;width:16.0625rem;z-index:15;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-146 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-148{top:60rem;left:3.6875rem;height:2.125rem;width:17.625rem;z-index:16;color:#FFC67C;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-148 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-148 .x_7b2817bf{color:#000000;}#page-block-00lvwei65hxb{height:57.5625rem;max-width:100%;}#page-block-00lvwei65hxb .section-holder-border{border:0;}#page-block-00lvwei65hxb .section-block{background:rgb(255,255,255);height:57.5625rem;}#page-block-00lvwei65hxb .section-holder-overlay{display:none;}#element-474{top:33.375rem;left:1.1875rem;height:12rem;width:22.5rem;z-index:35;color:#98A0A6;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-474 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-475{top:3.8125rem;left:1.1875rem;height:25.384615384615383rem;width:22.5rem;z-index:39;}#element-475 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41785224-0-2.JPG) -7.8125rem 0 / 38.0625rem 25.375rem;}#element-476{top:1.4375rem;left:1.25rem;height:1.5rem;width:22.5rem;z-index:43;color:#98A0A6;font-size:1.25rem;line-height:1.5rem;text-align:center;}#element-476 .x_bdb4a4e4{text-align:center;line-height:1.5rem;font-size:1.25rem;}#element-478{top:30.1875rem;left:1.1875rem;height:1.3125rem;width:22.5rem;z-index:49;}#element-478 .shape{border-bottom:1px solid #000000;}#element-479{top:22.1875rem;left:1.1875rem;height:7.125rem;width:22.5rem;z-index:53;}#element-479 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-480{top:24.0625rem;left:6.25rem;height:3.375rem;width:12.3125rem;z-index:57;}#element-480 .btn.btn-effect3d:active{box-shadow:none;}#element-480 .btn:hover{background:#1565C0;}#element-480 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-482{top:49rem;left:1.25rem;height:6.875rem;width:22.5rem;z-index:60;color:#37465A;font-size:1rem;line-height:1.4rem;text-align:center;}#element-482 .x_2c80ab57{text-align:center;line-height:1.375rem;font-size:1rem;}#element-483{top:46.75rem;left:1.1875rem;height:1.3125rem;width:22.5rem;z-index:62;}#element-483 .shape{border-bottom:1px solid #000000;}#page-block-6dfvkthy6io{height:68.6875rem;max-width:100%;}#page-block-6dfvkthy6io .section-holder-border{border:0;}#page-block-6dfvkthy6io .section-block{background:url(//v.fastcdn.co/u/6cdd06f9/41784864-0-machines1.png) repeat rgb(30,174,148) 50% 50% / cover;height:68.6875rem;}#page-block-6dfvkthy6io .section-holder-overlay{opacity:0.86;background-color:#1EAE94;display:block;}#element-451{top:36.5rem;left:1.1875rem;height:10.5rem;width:22.5rem;z-index:34;color:#98A0A6;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-451 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-451 .x_f2074b6c{color:#ffffff;}#element-452{top:7.375rem;left:1.25rem;height:25.39203084832905rem;width:22.5rem;z-index:38;}#element-452 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg) -1.3125rem 0 / 25.1875rem 25.375rem;}#element-459{top:2.5rem;left:1.25rem;height:3rem;width:22.5rem;z-index:42;color:#98A0A6;font-size:1.25rem;line-height:1.5rem;text-align:center;}#element-459 .x_bdb4a4e4{text-align:center;line-height:1.5rem;font-size:1.25rem;}#element-459 .x_f2074b6c{color:#ffffff;}#element-462{top:34.625rem;left:1.25rem;height:1.3125rem;width:22.5rem;z-index:48;}#element-462 .shape{border-bottom:1px solid #FFFFFF;}#element-463{top:25.625rem;left:1.25rem;height:7.125rem;width:22.5rem;z-index:52;}#element-463 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-464{top:27.5rem;left:6.3125rem;height:3.375rem;width:12.3125rem;z-index:56;}#element-464 .btn.btn-effect3d:active{box-shadow:none;}#element-464 .btn:hover{background:#1565C0;}#element-464 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-504{top:53rem;left:6.4375rem;height:1.5rem;width:12.0625rem;z-index:66;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-504 .x_ae8cf30e{line-height:1.5rem;font-size:1.0625rem;text-align:center;}#element-508{top:50.5625rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:67;}#element-514{top:59.0625rem;left:6.4375rem;height:1.5rem;width:12.0625rem;z-index:68;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-514 .x_ae8cf30e{line-height:1.5rem;font-size:1.0625rem;text-align:center;}#element-516{top:55.9375rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:69;}#element-517{top:47.5rem;left:1.25rem;height:1.3125rem;width:22.5rem;z-index:70;}#element-517 .shape{border-bottom:1px solid #FFFFFF;}#element-518{top:64.4375rem;left:6.4375rem;height:1.5rem;width:12.0625rem;z-index:71;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-518 .x_ae8cf30e{line-height:1.5rem;font-size:1.0625rem;text-align:center;}#element-519{top:61.75rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:72;}#page-block-xn9p17ly8dl{height:54.125rem;max-width:100%;}#page-block-xn9p17ly8dl .section-holder-border{border:0;}#page-block-xn9p17ly8dl .section-block{background:rgb(255,255,255);height:54.125rem;}#page-block-xn9p17ly8dl .section-holder-overlay{display:none;}#element-484{top:32.5rem;left:1.25rem;height:12rem;width:22.5rem;z-index:36;color:#98A0A6;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-484 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-485{top:3.4375rem;left:1.25rem;height:25.384615384615383rem;width:22.5rem;z-index:40;}#element-485 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41786172-0-bootcamp2.JPG) -7.8125rem 0 / 38.0625rem 25.375rem;}#element-486{top:1.1875rem;left:1.25rem;height:1.5rem;width:22.5rem;z-index:44;color:#98A0A6;font-size:1.25rem;line-height:1.5rem;text-align:center;}#element-486 .x_bdb4a4e4{text-align:center;line-height:1.5rem;font-size:1.25rem;}#element-487{top:30.25rem;left:1.25rem;height:1.3125rem;width:22.5rem;z-index:50;}#element-487 .shape{border-bottom:1px solid #000000;}#element-488{top:21.6875rem;left:1.25rem;height:7.125rem;width:22.5rem;z-index:54;}#element-488 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-489{top:23.5625rem;left:6.3125rem;height:3.375rem;width:12.3125rem;z-index:58;}#element-489 .btn.btn-effect3d:active{box-shadow:none;}#element-489 .btn:hover{background:#1565C0;}#element-489 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-490{top:46.875rem;left:1.1875rem;height:5.5rem;width:22.5rem;z-index:61;color:#37465A;font-size:1rem;line-height:1.4rem;text-align:center;}#element-490 .x_2c80ab57{text-align:center;line-height:1.375rem;font-size:1rem;}#element-491{top:44.9375rem;left:1.25rem;height:1.3125rem;width:22.5rem;z-index:63;}#element-491 .shape{border-bottom:1px solid #000000;}#page-block-tciga6y7gc{height:55.4375rem;max-width:100%;}#page-block-tciga6y7gc .section-holder-border{border:0;}#page-block-tciga6y7gc .section-block{background:rgb(255,255,255);height:55.4375rem;}#page-block-tciga6y7gc .section-holder-overlay{display:none;}#element-493{top:32.125rem;left:1.1875rem;height:18rem;width:22.5rem;z-index:37;color:#98A0A6;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-493 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-494{top:3.875rem;left:1.25rem;height:25.39203084832905rem;width:22.5rem;z-index:41;}#element-494 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41786408-0-marbella-bootcamp.jpg) -11.6875rem 0 / 50.0625rem 25.375rem;}#element-495{top:1.5rem;left:1.25rem;height:1.5rem;width:22.5rem;z-index:46;color:#98A0A6;font-size:1.25rem;line-height:1.5rem;text-align:center;}#element-495 .x_bdb4a4e4{text-align:center;line-height:1.5rem;font-size:1.25rem;}#element-496{top:30.25rem;left:1.1875rem;height:1.3125rem;width:22.5rem;z-index:51;}#element-496 .shape{border-bottom:1px solid #000000;}#element-497{top:22.125rem;left:1.25rem;height:7.125rem;width:22.5rem;z-index:55;}#element-497 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-498{top:24rem;left:6.3125rem;height:3.375rem;width:12.3125rem;z-index:59;}#element-498 .btn.btn-effect3d:active{box-shadow:none;}#element-498 .btn:hover{background:#1565C0;}#element-498 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-500{top:50.6875rem;left:1.25rem;height:1.3125rem;width:22.5rem;z-index:64;}#element-500 .shape{border-bottom:1px solid #000000;}#element-502{top:52.5625rem;left:1.25rem;height:1.5625rem;width:22.5rem;z-index:65;color:#37465A;font-size:1.125rem;line-height:1.575rem;text-align:center;}#element-502 .x_bcbce646{text-align:center;line-height:1.5625rem;font-size:1.125rem;}#element-502 .x_0b4b869e{color:#191c29;}#page-block-x4tg90afy5g3rk638cggsc3di{height:59.6875rem;max-width:100%;}#page-block-x4tg90afy5g3rk638cggsc3di .section-holder-border{border:0;}#page-block-x4tg90afy5g3rk638cggsc3di .section-block{background:url(//v.fastcdn.co/u/6cdd06f9/41567064-0-Ad7.png) repeat rgb(255,198,124) 50% 50% / cover;height:59.6875rem;}#page-block-x4tg90afy5g3rk638cggsc3di .section-holder-overlay{opacity:0.81927710843373;background-color:#FFC67C;display:block;}#element-345{top:2.5rem;left:3.125rem;height:19.25rem;width:18.6875rem;z-index:21;}#element-345 .shape{border:0.0625rem solid #FFFFFF;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-216{top:15.375rem;left:5.25rem;height:4.5rem;width:14.5rem;z-index:22;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-216 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-217{top:9rem;left:7.6875rem;height:4.5rem;width:9.5625rem;z-index:23;color:#FFC67C;font-size:1.625rem;line-height:2.275rem;text-align:center;}#element-217 .x_47b745f5{text-align:center;line-height:2.25rem;font-size:1.625rem;}#element-217 .x_472c60a0{color:#ffc67c;}#element-218{top:27.0625rem;left:1.25rem;height:2.5rem;width:22.5rem;z-index:24;color:#FFFFFF;font-size:1.0625rem;line-height:1.275rem;text-align:center;}#element-218 .x_351f8ea5{line-height:1.25rem;font-size:1.0625rem;text-align:center;}#element-219{top:34.875rem;left:1.25rem;height:2.5rem;width:22.5rem;z-index:25;color:#FFFFFF;font-size:1.0625rem;line-height:1.275rem;text-align:center;}#element-219 .x_351f8ea5{line-height:1.25rem;font-size:1.0625rem;text-align:center;}#element-220{top:42.6875rem;left:1.25rem;height:2.5rem;width:22.5rem;z-index:26;color:#FFFFFF;font-size:1.0625rem;line-height:1.275rem;text-align:center;}#element-220 .x_351f8ea5{line-height:1.25rem;font-size:1.0625rem;text-align:center;}#element-346{top:50.5rem;left:1.25rem;height:1.25rem;width:22.5rem;z-index:27;color:#FFFFFF;font-size:1.0625rem;line-height:1.275rem;text-align:center;}#element-346 .x_351f8ea5{line-height:1.25rem;font-size:1.0625rem;text-align:center;}#element-348{top:23.625rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:28;}#element-349{top:31.4375rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:29;}#element-350{top:39.25rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:30;}#element-351{top:47.0625rem;left:11.6875rem;height:1.5625rem;width:1.5625rem;z-index:31;}#element-356{top:4.375rem;left:10.75rem;height:2.75rem;width:3.4375rem;z-index:32;}#element-427{top:53.625rem;left:2.375rem;height:3.5625rem;width:20.25rem;z-index:33;}#element-427 .btn.btn-effect3d:active{box-shadow:none;}#element-427 .btn:hover{background:#FFC67C;}#element-427 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.25rem;line-height:3.5625rem;font-family:Lato;font-weight:700;border-radius:40px;}#page_block_footer{height:28.625rem;max-width:100%;}#page_block_footer .section-holder-border{border:0;}#page_block_footer .section-block{background:rgb(255,255,255);height:28.625rem;}#page_block_footer .section-holder-overlay{display:none;}#element-266{top:26.8125rem;left:7.5rem;height:1.125rem;width:9.9375rem;z-index:17;color:#F5517E;font-size:0.8125rem;line-height:1.1375rem;text-align:center;}#element-266 .x_dc6c6e10{text-align:center;line-height:1.125rem;font-size:0.8125rem;}#element-266 .x_7b2817bf{color:#000000;}#element-267{top:9.6875rem;left:1.875rem;height:15.625rem;width:21.1875rem;z-index:18;color:#2D2522;font-size:1.125rem;line-height:1.575rem;text-align:center;}#element-267 .x_bcbce646{text-align:center;line-height:1.5625rem;font-size:1.125rem;}#element-325{top:2.5rem;left:9.5625rem;height:5.875rem;width:5.875rem;z-index:19;}#element-325 .shape{border:0.125rem solid #FFFFFF;background:rgb(7,219,180);opacity:1;}#element-268{top:2.875rem;left:9.9375rem;height:5.0625rem;width:5.0625rem;z-index:20;}#element-268 .shape{border:0;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mM89h8AApEBx2iaqpQAAAAASUVORK5CYII=) repeat rgb(205,205,205) 50% 50% / cover;opacity:1;}#page-block-vm0e7ozlvs5x9a4i{height:3.125rem;max-width:100%;}#page-block-vm0e7ozlvs5x9a4i .section-holder-border{border:0;}#page-block-vm0e7ozlvs5x9a4i .section-block{background:rgb(0,0,0);height:3.125rem;}#page-block-vm0e7ozlvs5x9a4i .section-holder-overlay{display:none;}#element-87{top:2.5rem;left:1.25rem;height:2.375rem;width:22.5rem;z-index:3;color:#D7D7D7;font-size:1rem;line-height:1.2rem;text-align:center;}#element-87 .x_2b60e4ec{text-align:center;line-height:1.1875rem;font-size:1rem;}#element-87 .x_f5bcfbd2{color:#d7d7d7;}@media screen and (max-width:400px){:root{font-size:4vw;}}@media screen and (min-width:768px) and (max-width:1200px){:root{font-size:1.33vw;}}@media screen and (max-width:767px){.hidden-mobile{display:none;}}@media screen and (min-width:768px){.section-fit{max-width:60rem;}#page-block-iwjlqw2ozp{height:38.5rem;max-width:100%;}#page-block-iwjlqw2ozp .section-holder-border{border:0;}#page-block-iwjlqw2ozp .section-block{background:url(//v.fastcdn.co/u/6cdd06f9/41785436-0-3.png) repeat rgb(255,255,255) 50% 50% / cover;height:38.5rem;}#page-block-iwjlqw2ozp .section-holder-overlay{opacity:0.8;background-color:#000000;display:block;}#element-521{top:13.1875rem;left:19rem;height:2.625rem;width:22.875rem;z-index:45;color:#98A0A6;font-size:2.1875rem;line-height:2.625rem;text-align:center;}#element-521 .x_3a6971f3{text-align:center;line-height:2.625rem;font-size:2.1875rem;}#element-522{top:10.125rem;left:36.5625rem;height:1.5rem;width:3.75rem;z-index:47;color:#98A0A6;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-522 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-528{top:4.6875rem;left:17.625rem;height:6.625rem;width:23.3125rem;z-index:73;}#element-530{top:19.75rem;left:18.5rem;height:5.75rem;width:22.9375rem;z-index:74;font-size:5.75rem;}.timer-box{font-size:.6em;}.timer-date{height:auto;}#element-530 .timer-box{color:rgb(255,255,255);background-color:#37465a;}#element-530 .timer-labels{color:#37465A;}#element-532{top:16.9375rem;left:18.6875rem;height:1.625rem;width:23.125rem;z-index:75;color:#37465A;font-size:1rem;line-height:1.6rem;text-align:center;}#element-532 .x_dc68832a{text-align:center;line-height:1.625rem;font-size:1rem;}#element-532 .x_7672e1d5{color:#ff0000;}#element-533{top:28.625rem;left:23.8125rem;height:3.375rem;width:12.3125rem;z-index:76;}#element-533 .btn.btn-effect3d:active{box-shadow:none;}#element-533 .btn:hover{background:#1565C0;}#element-533 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#page-block-j1og2tchsawp68oisq0duc8fr{height:21.625rem;max-width:100%;}#page-block-j1og2tchsawp68oisq0duc8fr .section-holder-border{border:0;}#page-block-j1og2tchsawp68oisq0duc8fr .section-block{background:repeat rgb(7,219,180) 44% 55% / cover;background-image:url(//v.fastcdn.co/u/6cdd06f9/41567668-0-Marbella.jpeg),url(//v.fastcdn.co/t/6cdd06f9/4befc388/1555066696-41567668-ghost-Marbella.jpeg);height:21.625rem;}#page-block-j1og2tchsawp68oisq0duc8fr .section-holder-overlay{opacity:0.68;background-color:#1EAE94;display:block;}#element-124{top:-3.125rem;left:0;height:19.0625rem;width:18.6875rem;z-index:4;}#element-124 .shape{border:0;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-126{top:-1.9375rem;left:6.1875rem;height:6.25rem;width:6.25rem;z-index:5;}#element-126 .shape{border:0.0625rem solid #00E1B8;background:url(//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg) repeat rgb(0,225,184) 28% 56% / cover;opacity:1;}#element-128{top:8.125rem;left:1.25rem;height:6rem;width:16.0625rem;z-index:6;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-128 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-129{top:5.5625rem;left:0.5rem;height:2.125rem;width:17.625rem;z-index:7;color:#FFC67C;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-129 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-129 .x_7b2817bf{color:#000000;}#element-298{top:18.9375rem;left:21.0625rem;height:2.6875rem;width:17.875rem;z-index:8;}#element-133{top:-3.125rem;left:20.6875rem;height:19.0625rem;width:18.6875rem;z-index:9;}#element-133 .shape{border:0;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-135{top:-1.9375rem;left:26.875rem;height:6.25rem;width:6.25rem;z-index:10;}#element-135 .shape{border:0.0625rem solid #00E1B8;background:url(//v.fastcdn.co/u/6cdd06f9/41567256-0-Beachfit.jpg) repeat rgb(238,238,238) 50% 50% / cover;opacity:1;}#element-137{top:8.125rem;left:21.9375rem;height:6rem;width:16.0625rem;z-index:11;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-137 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-139{top:5.5625rem;left:21.1875rem;height:2.125rem;width:17.625rem;z-index:12;color:#FFC67C;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-139 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-139 .x_0b4b869e{color:#191c29;}#element-142{top:-3.125rem;left:41.25rem;height:19.0625rem;width:18.6875rem;z-index:13;}#element-142 .shape{border:0;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-144{top:-1.9375rem;left:47.4375rem;height:6.25rem;width:6.25rem;z-index:14;}#element-144 .shape{border:0.0625rem solid #00E1B8;background:url(//v.fastcdn.co/u/6cdd06f9/41567236-0-Pool.jpeg) repeat rgb(0,225,184) 50% 50% / cover;opacity:1;}#element-146{top:8.125rem;left:42.5rem;height:6rem;width:16.0625rem;z-index:15;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-146 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-148{top:5.5625rem;left:42.3125rem;height:2.125rem;width:17.625rem;z-index:16;color:#FFC67C;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-148 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-148 .x_7b2817bf{color:#000000;}#page-block-00lvwei65hxb{height:40.875rem;max-width:100%;}#page-block-00lvwei65hxb .section-holder-border{border:0;}#page-block-00lvwei65hxb .section-block{background:rgb(255,255,255);height:40.875rem;}#page-block-00lvwei65hxb .section-holder-overlay{display:none;}#element-474{top:9.75rem;left:28.8125rem;height:10.125rem;width:28.9375rem;z-index:35;color:#98A0A6;font-size:1.0625rem;line-height:1.7000000000000002rem;text-align:center;}#element-474 .x_7a88b5a4{text-align:center;line-height:1.6875rem;font-size:1.0625rem;}#element-475{top:4.875rem;left:1.75rem;height:27.5rem;width:24.375rem;z-index:39;}#element-475 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41785224-0-2.JPG) -8.4375rem 0 / 41.25rem 27.5rem;}#element-476{top:4.875rem;left:28.3125rem;height:2.125rem;width:29.9375rem;z-index:43;color:#98A0A6;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-476 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-478{top:7.5rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:49;}#element-478 .shape{border-bottom:1px solid #000000;}#element-479{top:24.0625rem;left:1.75rem;height:8.3125rem;width:24.375rem;z-index:53;}#element-479 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-480{top:26.5625rem;left:7.8125rem;height:3.375rem;width:12.3125rem;z-index:57;}#element-480 .btn.btn-effect3d:active{box-shadow:none;}#element-480 .btn:hover{background:#1565C0;}#element-480 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-482{top:23.0625rem;left:31.6875rem;height:8.125rem;width:23.125rem;z-index:60;color:#37465A;font-size:1rem;line-height:1.6rem;text-align:center;}#element-482 .x_dc68832a{text-align:center;line-height:1.625rem;font-size:1rem;}#element-483{top:20.4375rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:62;}#element-483 .shape{border-bottom:1px solid #000000;}#page-block-6dfvkthy6io{height:40.875rem;max-width:100%;}#page-block-6dfvkthy6io .section-holder-border{border:0;}#page-block-6dfvkthy6io .section-block{background:url(//v.fastcdn.co/u/6cdd06f9/41784864-0-machines1.png) repeat rgb(30,174,148) 50% 50% / cover;height:40.875rem;}#page-block-6dfvkthy6io .section-holder-overlay{opacity:0.86;background-color:#1EAE94;display:block;}#element-451{top:11rem;left:28.8125rem;height:10.125rem;width:28.9375rem;z-index:34;color:#98A0A6;font-size:1.0625rem;line-height:1.7000000000000002rem;text-align:center;}#element-451 .x_7a88b5a4{text-align:center;line-height:1.6875rem;font-size:1.0625rem;}#element-451 .x_f2074b6c{color:#ffffff;}#element-452{top:4.875rem;left:1.8125rem;height:27.4375rem;width:24.3125rem;z-index:38;}#element-452 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg) -1.4375rem 0 / 27.25rem 27.4375rem;}#element-459{top:4.0625rem;left:28.3125rem;height:4.25rem;width:29.9375rem;z-index:42;color:#98A0A6;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-459 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-459 .x_f2074b6c{color:#ffffff;}#element-462{top:9.125rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:48;}#element-462 .shape{border-bottom:1px solid #FFFFFF;}#element-463{top:24.0625rem;left:1.75rem;height:8.3125rem;width:24.375rem;z-index:52;}#element-463 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-464{top:26.5625rem;left:7.8125rem;height:3.375rem;width:12.3125rem;z-index:56;}#element-464 .btn.btn-effect3d:active{box-shadow:none;}#element-464 .btn:hover{background:#1565C0;}#element-464 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-504{top:24.0625rem;left:38.5625rem;height:1.5rem;width:12.0625rem;z-index:66;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-504 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-508{top:24.0625rem;left:35.9375rem;height:1.5625rem;width:1.5625rem;z-index:67;}#element-514{top:26.625rem;left:38.5625rem;height:1.5rem;width:12.0625rem;z-index:68;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-514 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-516{top:26.5625rem;left:35.9375rem;height:1.5625rem;width:1.5625rem;z-index:69;}#element-517{top:21.5625rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:70;}#element-517 .shape{border-bottom:1px solid #FFFFFF;}#element-518{top:29.25rem;left:38.5625rem;height:1.5rem;width:12.0625rem;z-index:71;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-518 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-519{top:29.1875rem;left:35.9375rem;height:1.5625rem;width:1.5625rem;z-index:72;}#page-block-xn9p17ly8dl{height:35.0625rem;max-width:100%;}#page-block-xn9p17ly8dl .section-holder-border{border:0;}#page-block-xn9p17ly8dl .section-block{background:rgb(255,255,255);height:35.0625rem;}#page-block-xn9p17ly8dl .section-holder-overlay{display:none;}#element-484{top:9.75rem;left:28.8125rem;height:10.125rem;width:28.9375rem;z-index:36;color:#98A0A6;font-size:1.0625rem;line-height:1.7000000000000002rem;text-align:center;}#element-484 .x_7a88b5a4{text-align:center;line-height:1.6875rem;font-size:1.0625rem;}#element-485{top:4.875rem;left:1.75rem;height:27.5rem;width:24.375rem;z-index:40;}#element-485 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41786172-0-bootcamp2.JPG) -8.4375rem 0 / 41.25rem 27.5rem;}#element-486{top:4.875rem;left:28.8125rem;height:2.125rem;width:28.9375rem;z-index:44;color:#98A0A6;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-486 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-487{top:7.5rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:50;}#element-487 .shape{border-bottom:1px solid #000000;}#element-488{top:24.0625rem;left:1.75rem;height:8.3125rem;width:24.375rem;z-index:54;}#element-488 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-489{top:26.5625rem;left:7.8125rem;height:3.375rem;width:12.3125rem;z-index:58;}#element-489 .btn.btn-effect3d:active{box-shadow:none;}#element-489 .btn:hover{background:#1565C0;}#element-489 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-490{top:24.9375rem;left:31.1875rem;height:6.5rem;width:23.125rem;z-index:61;color:#37465A;font-size:1rem;line-height:1.6rem;text-align:center;}#element-490 .x_dc68832a{text-align:center;line-height:1.625rem;font-size:1rem;}#element-491{top:21.5625rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:63;}#element-491 .shape{border-bottom:1px solid #000000;}#page-block-tciga6y7gc{height:36.4375rem;max-width:100%;}#page-block-tciga6y7gc .section-holder-border{border:0;}#page-block-tciga6y7gc .section-block{background:rgb(255,255,255);height:36.4375rem;}#page-block-tciga6y7gc .section-holder-overlay{display:none;}#element-493{top:10.5rem;left:28.8125rem;height:16.875rem;width:28.9375rem;z-index:37;color:#98A0A6;font-size:1.0625rem;line-height:1.7000000000000002rem;text-align:center;}#element-493 .x_7a88b5a4{text-align:center;line-height:1.6875rem;font-size:1.0625rem;}#element-494{top:5.3125rem;left:1.8125rem;height:27.4375rem;width:24.3125rem;z-index:41;}#element-494 .cropped{background:url(//v.fastcdn.co/u/6cdd06f9/41786408-0-marbella-bootcamp.jpg) -12.625rem 0 / 54.125rem 27.4375rem;}#element-495{top:5.3125rem;left:27.8125rem;height:2.125rem;width:29.9375rem;z-index:46;color:#98A0A6;font-size:1.5rem;line-height:2.0999999999999996rem;text-align:center;}#element-495 .x_fc9d998b{text-align:center;line-height:2.125rem;font-size:1.5rem;}#element-496{top:8.3125rem;left:28.8125rem;height:1.3125rem;width:28.9375rem;z-index:51;}#element-496 .shape{border-bottom:1px solid #000000;}#element-497{top:24.5rem;left:1.75rem;height:8.3125rem;width:24.375rem;z-index:55;}#element-497 .shape{border:0.0625rem solid #A3BAC6;background:rgb(25,28,41);opacity:0.61;}#element-498{top:27.1875rem;left:7.8125rem;height:3.375rem;width:12.3125rem;z-index:59;}#element-498 .btn.btn-effect3d:active{box-shadow:none;}#element-498 .btn:hover{background:#1565C0;}#element-498 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.1875rem;line-height:3.375rem;font-family:Lato;font-weight:400;border-radius:3px;}#element-500{top:28.1875rem;left:28.6875rem;height:1.3125rem;width:28.9375rem;z-index:64;}#element-500 .shape{border-bottom:1px solid #000000;}#element-502{top:31rem;left:31.625rem;height:1.8125rem;width:23.125rem;z-index:65;color:#37465A;font-size:1.125rem;line-height:1.8rem;text-align:left;}#element-502 .x_8c071feb{text-align:left;line-height:1.8125rem;font-size:1.125rem;}#element-502 .x_e6507cf2{text-align:center;line-height:1.8125rem;font-size:1.125rem;}#element-502 .x_0b4b869e{color:#191c29;}#page-block-x4tg90afy5g3rk638cggsc3di{height:29.75rem;max-width:100%;}#page-block-x4tg90afy5g3rk638cggsc3di .section-holder-border{border:0;}#page-block-x4tg90afy5g3rk638cggsc3di .section-block{background:url(//v.fastcdn.co/u/6cdd06f9/41567064-0-Ad7.png) repeat rgb(255,198,124) 50% 50% / cover fixed;height:29.75rem;}#page-block-x4tg90afy5g3rk638cggsc3di .section-holder-overlay{opacity:0.81927710843373;background-color:#FFC67C;display:block;}#element-345{top:2.8125rem;left:-0.0625rem;height:24.25rem;width:18.6875rem;z-index:21;}#element-345 .shape{border:0.0625rem solid #FFFFFF;border-radius:0 0 0 0;background:rgb(255,255,255);opacity:1;}#element-216{top:16.375rem;left:2.0625rem;height:4.5rem;width:14.5rem;z-index:22;color:#BEBEBE;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:center;}#element-216 .x_8642b94b{text-align:center;line-height:1.5rem;font-size:1.0625rem;}#element-217{top:11.1875rem;left:4.1875rem;height:4.5rem;width:9.5625rem;z-index:23;color:#FFC67C;font-size:1.625rem;line-height:2.275rem;text-align:center;}#element-217 .x_47b745f5{text-align:center;line-height:2.25rem;font-size:1.625rem;}#element-217 .x_472c60a0{color:#ffc67c;}#element-218{top:9.5625rem;left:27.625rem;height:1.5rem;width:27.125rem;z-index:24;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-218 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-219{top:12.625rem;left:27.625rem;height:1.5rem;width:27.125rem;z-index:25;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-219 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-220{top:15.6875rem;left:27.625rem;height:1.5rem;width:27.125rem;z-index:26;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-220 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-346{top:18.75rem;left:27.625rem;height:1.5rem;width:27.125rem;z-index:27;color:#FFFFFF;font-size:1.0625rem;line-height:1.4874999999999998rem;text-align:left;}#element-346 .x_1dc74687{line-height:1.5rem;font-size:1.0625rem;}#element-348{top:9.5rem;left:25rem;height:1.5625rem;width:1.5625rem;z-index:28;}#element-349{top:12.5625rem;left:25rem;height:1.5625rem;width:1.5625rem;z-index:29;}#element-350{top:15.625rem;left:25rem;height:1.5625rem;width:1.5625rem;z-index:30;}#element-351{top:18.6875rem;left:25rem;height:1.5625rem;width:1.5625rem;z-index:31;}#element-356{top:8rem;left:7.5625rem;height:2.75rem;width:3.4375rem;z-index:32;}#element-427{top:22rem;left:29rem;height:3.5625rem;width:20.25rem;z-index:33;}#element-427 .btn.btn-effect3d:active{box-shadow:none;}#element-427 .btn:hover{background:#FFC67C;}#element-427 .btn{background:#1EAE94;color:#FFFFFF;font-size:1.25rem;line-height:3.5625rem;font-family:Lato;font-weight:700;border-radius:40px;}#page_block_footer{height:27.9375rem;max-width:100%;}#page_block_footer .section-holder-border{border:0;}#page_block_footer .section-block{background:rgb(255,255,255);height:27.9375rem;}#page_block_footer .section-holder-overlay{display:none;}#element-266{top:25rem;left:27.125rem;height:1.125rem;width:8.125rem;z-index:17;color:#F5517E;font-size:0.8125rem;line-height:1.1375rem;text-align:center;}#element-266 .x_dc6c6e10{text-align:center;line-height:1.125rem;font-size:0.8125rem;}#element-266 .x_7b2817bf{color:#000000;}#element-267{top:8.6875rem;left:20.125rem;height:15.625rem;width:21.1875rem;z-index:18;color:#2D2522;font-size:1.125rem;line-height:1.575rem;text-align:center;}#element-267 .x_bcbce646{text-align:center;line-height:1.5625rem;font-size:1.125rem;}#element-325{top:2.0625rem;left:28.25rem;height:5.875rem;width:5.875rem;z-index:19;}#element-325 .shape{border:0.125rem solid #FFFFFF;background:rgb(7,219,180);opacity:1;}#element-268{top:2.4375rem;left:28.625rem;height:5.0625rem;width:5.0625rem;z-index:20;}#element-268 .shape{border:0;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mM89h8AApEBx2iaqpQAAAAASUVORK5CYII=) repeat rgb(205,205,205) 50% 50% / cover;opacity:1;}#page-block-vm0e7ozlvs5x9a4i{height:4.5625rem;max-width:100%;}#page-block-vm0e7ozlvs5x9a4i .section-holder-border{border:0;}#page-block-vm0e7ozlvs5x9a4i .section-block{background:rgb(0,0,0);height:4.5625rem;}#page-block-vm0e7ozlvs5x9a4i .section-holder-overlay{display:none;}#element-87{top:1.8125rem;left:-0.0625rem;height:2.75rem;width:60rem;z-index:3;color:#D7D7D7;font-size:1rem;line-height:1.4rem;text-align:center;}#element-87 .x_2c80ab57{text-align:center;line-height:1.375rem;font-size:1rem;}#element-87 .x_f5bcfbd2{color:#d7d7d7;}} 
  </style>

    <script>
  window.__variantsData = [ { name: 'A', chance: 100 } ];

window.__page_id = 15147980;
  window.__version = 26;
  window.__variant = "A";
  window.__variant_custom_name = "Variation A";
  window.__preview = false;
  window.__page_type = 2;
  window.__variant_hash = "71caab88b4030a325b3e782f22d982988fc237cf";
  window.__page_domain = "bootcamp.transformationpod.com";
  window.__predator_throttle = 10;
  window.__predator_blacklist = [];
  window.__page_generator = true;
  window._Translate = { 
    translations: {},
    set: function (text, translation) { this.translations[text] = translation; },
    get: function (text) { return this.translations[text] || text; }
  };
</script>
<script id="ip-config" type="application/json">
  {"mobileDisabled":false,"downloadFileEndpoint":"https://app.instapage.com/ajax/pageserver/files/serve-file","thankYouTimeout":5000,"reCaptchaEnabled":false}
</script>
<script id="ip-analytics" type="application/json">
  {"trackingData":{"anthillApiKey":"6c1c0a6e50dfd468b575c3ca0f8f5637e13bc47905bb25091c30ec0ab78bdd9a9fd19f70234e5e36a4735fc43686f9e6af7ead2f9b4050b8665716c002a7771970a505c05c0912a06c6df5ddda0b84c50287796d165949a314588e7acfb17b1979696a086ca22f43128f24633020b0d2d627bd10065cd7b745a8710bfba0c24f200c1f80192573054a9f499c357180cc","ownerId":3384248,"customerId":3735984,"pageId":15147980,"publishedVersion":26,"variationName":"A","variationId":1,"linkedVariationId":2,"variation":"A","generationTime":"4","trackedLinks":[{"href":"https://app.instapage.com/route/15147928/?url=bootcamp.transformationpod.com/payment","id":"81i26jhjzz4","type":"landing-page","track":true,"targetNewWindow":false}],"user_id":3384248},"conversionSettings":{"forms":true,"links":true,"external":false},"visitUrl":"https://anthill.instapage.com/projects/56c2f3d796773d0a7e96a536/events/visit","conversionUrl":"https://anthill.instapage.com/projects/56c2f3d796773d0a7e96a536/events/conversion"}
</script>




  <!-- F_INSTAPAGE[dynamic_text_replacement;page_generator] -->

  <!-- custom HEAD code-->
  
  
  <!-- end custom HEAD code-->
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

<div class="container main-container px-3">
<div class="jumbotron jumbo-mod">





  <img  data-aos="fade-left" class="d-block w-100 rounded-top" src="../img/marbella.jpeg" alt="About image">

<!-- <div class="container  deep-blue" style="max-width:800px;"> -->
<!-- <h1  class="font-weight-bold text-center" style="color:#006369 !important;">About Us</h1> -->

<div class="card bg-faded m-3" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block px-3 pb-3">
     
     <h2 data-aos="zoom-in-up" class="title">Marbella Summer Bootcamp </h2>
     
          <div class="card bg-faded bg-light">
<div class="card-block">
       <h5 class="deep-blue text-center p-3 mb-0">With guaranteed results, Transform Health Marbella
is a residential boot camp like no other! We bring
you the latest technology in weight loss to help you
achieve the summer body you've always dreamed
of. Using our patented technology vacuum and
infrared pods, specialised training and personal
chef, watch the pounds melt away in our luxury villa
in the stunning Costa Del Sol. With just 6 spots per
camp for maximum results this is one boot camp
that will change your life!!</h5>
    </div>
    
<!--     <div class="m-3 pb-3"> -->
<!--   <div class="card text-center" data-aos="zoom-in-down" data-aos-offset="-300"> -->
<!--     <div class="card-body mb-3"> -->
<!-- <h4 class="cta pt-2">Speak to a representative</h4> -->
<a class="btn btn-primary btn-lg mb-3" style="margin:0 auto;width:inherit;"  href="https://bootcamp.transformationpod.com/payment">Book Now!</a>
<!--     </div> -->
<!--   </div> -->

<!-- </div> -->
    
    </div>



     </div>
</div>

<div class="m-3">

<div class="card-deck">

<div class="card mb-3">
	<img src="//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg" class="card-img-top-circle">
	 <div class="card-body text-center">
	 <h5 class="card-title">Personal Chef!</h5>
	    <p class="card-text text-muted">Former Master-chef winner preparing your meals in house! Diet adjusted to suit all of your needs & requirements.</p>
	</div>
</div>

<div class="card mb-3">
	<img src="//v.fastcdn.co/u/6cdd06f9/41567256-0-Beachfit.jpg" class="card-img-top-circle">
	 <div class="card-body text-center">
	 <h5 class="card-title">Daily Activities!</h5>
	    <p class="card-text text-muted">Our fully trained  staff are there to provide an unforgettable boot-camp experience! In the Villa, on the beach & in the GYM!</p>
	</div>
</div>

<div class="card mb-3">
	<img src="//v.fastcdn.co/u/6cdd06f9/41567236-0-Pool.jpeg" class="card-img-top-circle">
	 <div class="card-body text-center">
	 <h5 class="card-title">Gym & Swimming!</h5>
	    <p class="card-text text-muted">The pool isn't just their for relaxation! You will be burning plenty of calories here! Lots of swimming in the sun!</p>
	</div>
</div>


</div>

<div class="mb-3">

 <section class="section section-relative " id="page-block-6dfvkthy6io" data-at="section">
   
  <div class="section-holder-border item-block item-absolute" data-at="section-border"></div>
  <div class="section-holder-overlay item-block item-absolute" data-at="section-overlay"></div>
  <div class="section-block">
    <div class="section-inner section-fit section-relative">
        <div class="widget item-absolute paragraph  " id="element-451" data-at="paragraph">
  <div class="contents">
    <p  class="x_7a88b5a4"><span  class="x_f2074b6c">&nbsp;Inviting a professional into the in house kitchen transforms the villa into an intimate restaurant.&nbsp;</span></p><p  class="x_7a88b5a4"><span  class="x_f2074b6c">The best thing is that the dining experience is entirely based on you and fellow Boot-camp members. Once the chef knows your diet preferences, the chef will share their menu ideas with you.&nbsp;</span></p>
  </div>
</div>

        <div class="widget item-absolute  " id="element-452">
  <div class="contents cropped item-block" data-at="image-cropp">
  </div>
</div>

        <div class="widget item-absolute headline  " id="element-459" data-at="headline">
  <div class="contents">
    <h1>
      <p  class="x_fc9d998b"><span  class="x_f2074b6c">Enjoy a unique experience with our Private Chef</span></p>
    </h1>
  </div>
</div>

        <div class="widget item-absolute " id="element-462">
  <div
    class="contents shape  line-horizontal line " 
    data-at="shape" 
    
  ></div>
</div>

        <div class="widget item-absolute " id="element-463">
  <div
    class="contents shape  box figure " 
    data-at="shape" 
    
  style="    background: rgb(25,28,41);
    opacity: 0.61;height: inherit;    display: block;"></div>
</div>

        <div class="widget item-absolute  " id="element-464">
  <a class="btn btn-primary item-block pt-0" data-at="button" href="https://bootcamp.transformationpod.com/payment">
      Book Now!
  </a>
</div>

        <div class="widget item-absolute paragraph  " id="element-504" data-at="paragraph">
  <div class="contents">
    <p  class="x_1dc74687 text-light">All Allergies catered for</p>
  </div>
</div>

        <div class="widget item-absolute  " id="element-508">
  <div class="contents cropped item-block" data-at="image-cropp">
      <img
        class="item-content-box item-block img-lazy" 
        data-at="image"
        alt=""
        src="//v.fastcdn.co/u/a1ab1db8/27314877-0-Asset-2.svg"
        
      >
  </div>
</div>

        <div class="widget item-absolute paragraph  " id="element-514" data-at="paragraph">
  <div class="contents">
    <p  class="x_1dc74687 text-light">Guaranteed Fat Loss Diet</p>
  </div>
</div>

        <div class="widget item-absolute  " id="element-516">
  <div class="contents cropped item-block" data-at="image-cropp">
      <img
        class="item-content-box item-block img-lazy" 
        data-at="image"
        alt=""
        src="//v.fastcdn.co/u/a1ab1db8/27314877-0-Asset-2.svg"
     
      >
  </div>
</div>

        <div class="widget item-absolute " id="element-517">
  <div
    class="contents shape  line-horizontal line " 
    data-at="shape" 
    
  ></div>
</div>

        <div class="widget item-absolute paragraph  " id="element-518" data-at="paragraph">
  <div class="contents">
    <p  class="x_1dc74687 text-light">Michelin Star Food</p>
  </div>
</div>

        <div class="widget item-absolute  " id="element-519">
  <div class="contents cropped item-block" data-at="image-cropp">
      <img
        class="item-content-box item-block img-lazy" 
        data-at="image"
        alt=""
        src="//v.fastcdn.co/u/a1ab1db8/27314877-0-Asset-2.svg"
      >
  </div>
</div>

    </div>
  </div>
</section>

</div>
<!-- <div class="mb-3" style="height: 70.6875rem;border-radius:5px;max-width: 100%;position: relative;display: block;height: 100%;width: 100%;border: 0;background: url(//v.fastcdn.co/u/6cdd06f9/41784864-0-machines1.png) repeat rgb(30,174,148) 50% 50% / cover;"> -->

<!-- <div style="opacity: 0.86;background-color: #1EAE94;display: block;height: 100%;width:100%;position:absolute;"></div> -->




<!-- <div class="row"> -->

<!-- <div class="col-md-6 mx-auto"> -->

<!-- <div class="avocado-container" style="max-width: 400px;margin:10px;display: block;text-align: right;"> -->
<!-- <img alt="" src="//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg" class="img-fluid rounded"> -->

<!-- <!-- <div style="background: url(//v.fastcdn.co/u/6cdd06f9/41567160-0-Healthy.jpg) -1.3125rem 0 / 23.1875rem 25.375rem;display: block;height: 100%;width: 100%;box-sizing: border-box;margin:20px;"></div> --> 

<!-- </div> -->



<!-- </div> -->

<!-- <div class="col-md-6 "> -->

<!-- <div class="mx-auto" style="background-color: white;border-radius:5px;display: block;"> -->

<!-- <h4>Enjoy a unique experience with our Private Chef</h4> -->
<!-- <hr> -->
<!-- <p>Inviting a professional into the in house kitchen transforms the villa into an intimate restaurant.  -->
<!-- The best thing is that the dining experience is entirely based on you and fellow Boot-camp members. Once the chef knows your diet preferences, the chef will share their menu ideas with you. </p> -->
<!-- <hr> -->

<!-- </div> -->


<!-- </div> -->


<!-- </div> -->



<!-- </div> -->















<!-- caution -->

<div class="">

   


</div>
















<div class="card-deck">
<!-- <div class="container"> -->

<!-- <div class="row"> -->

<!-- <div class="col"> -->

  <div class="card" data-aos="fade-right" data-aos-duration="1100">
  <img src="../../img/bootcamp-x.jpg" data-old-src="https://storage.googleapis.com/transform-health-limited.appspot.com/bootcamp.JPG" class="card-img-top" style="max-height: 350px!important;">
<!--   <img src="../img/bootcamp-n.jpg" class="img-fluid d-block mx-auto rounded-top"> -->
    <div class="card-body">
      <h4 class="card-title-custom">6 night residential Boot Camp</h4>
     <p class="card-text deep-blue text-center">Just minutes from the beach, our luxury villa with its
own private pool, is located in beautiful Marbella and
gives guests the opportunity to smash their fitness
goals on our private terrace. Our team of experts will
work with you to establish your target weight loss
and provide you with all the tools to reach them.
Your meals will be prepared on site by our trained
chef & your body analysis will be recorded each day
to ensure you’re on track!  
</p>
    </div>
  </div>
  

  <div class="card mb-0" data-aos="fade-left" data-aos-duration="1100">
  <img src="https://storage.googleapis.com/transform-health-limited.appspot.com/bootcamp2.JPG" class="card-img-top" style="max-height: 350px!important;">
  
    <div class="card-body">
      <h4 class="card-title text-center font-weight-bold orange">Patented Technology Exclusive to Marbella</h4>
     <p class="card-text deep-blue text-center">We use our Transform Health Products exclusively,
designed and manufactured by us to guarantee
weight loss. Our patented vacuum treadmills and
body roller machines, combined with targeted core
exercises yield dramatic results for all our clients.
With just 6 places available for optimum client care,
this boot camp is not to be missed!!


</p>
    </div>
  </div>


<!-- </div> -->


<!-- <div class="col"> -->




</div>
</div>



<div class="card bg-faded p-3 m-3 mt-0" data-aos="fade-up" data-aos-duration="800">
     <div class="card-block">

<h5 class="ml-3 title text-left">
Next Available Dates:
</h5>

<ul class="deep-blue">
<li>30th June - 6th July (week 1)</li>
<li>7th July - 13th July (week 2)</li>
</ul>


<!-- <p class="deep-blue pl-3 pr-3 pb-2 pt-0 m-0"> -->
<!-- <strong>Limited Availability</strong> -->
<!-- </p> -->
<h5 class="ml-3 title text-left">
Costs:
</h5>
<p class="deep-blue pl-3 pr-3 pb-2 pt-0 m-0">
Our €2000 per person sharing fee covers:
</p>
<ul class="deep-blue">
<li>Transfers to & from the airport on days of travel</li>
<li>6 night residential boot camp in a newly renovated rustic Spanish villa on its
own grounds with private pool and private gym just a short walk to the beach</li>
<li>Qualified trainer</li>
<li>All meals & water prepared for you</li>
<li>Use of our exclusive Transform Health machinery</li>
<li>Starter pack & meal plan</li>
<li>All bootcamp activities</li>
<li>Daily body analysis</li>
</ul>
<p class="deep-blue pl-3 pr-3 pt-0 m-0">
Flights are not included
</p>
<p class="deep-blue pl-3 pr-3 pb-2 pt-0 m-0">
50% non refundable deposit taken at the time of booking
</p>
     </div>
     
     
    
     
</div>






<!-- </div> -->


<!-- </div> -->




<!-- <div class="card bg-faded p-3 m-3 mt-0" data-aos="fade-up" data-aos-duration="800"> -->
<!--      <div class="card-block"> -->
<!-- <p class="deep-blue m-0 text-center"> -->
<!-- Click here to read more about <a href="../../inspiration/">our inspiration</a>. -->
<!-- </p> -->
<!--      </div> -->
<!-- </div> -->



<div class="m-3 pb-3">
  <div class="card card-body text-center" data-aos="zoom-in-down" data-aos-offset="-300">
  <h2 data-aos="zoom-in-up" class="title cta">Entry Form </h2>
  
  
  
            <div class="card bg-faded bg-light mb-3">
<div class="card-block ">
       <h5 class="deep-blue text-center p-3 m-0 ">Download the entry form below and email a copy to team@transformationpod.com</h5>
    </div>
    </div>
  
  
  
  
<!--   <h4 class="cta">Download below and email a copy to team@transformationpod.com</h4> -->
  
  
  
  
  <div class="card-deck">
  
  <div class="card">
         <p class="text-center mt-2 mb-0"><strong>Week 1</strong></p>
               <p class="text-center mb-1">(30th June - 6th July)</p>
  
  <div class="card-body" style="padding-top:5px !important;">
  	<div class="text-center date-body" style="width:150px;margin:0 auto !important;">
          <label for="" class="date-title pt-2">June</label>
          <div class="date-content">
            <p class="dia">30th</p>
            <hr class="nomargin"/>
            <p class="nomargin">until 6th July</p>
          </div>
        </div>
  
  </div>
  <div class="card-footer">
  
        <a class="btn btn-primary btn-md" href="../../bootcamp/Transform-Health-Limited-Bootcamp-Week1.pdf" download="Week 1 Bootcamp Entry Form"><i class="fas fa-file-download"></i> Download</a>
  
  </div>
  </div>
  
    <div class="card">
         <p class="text-center mt-2 mb-0"><strong>Week 2</strong></p>
   <p class="text-center mb-1">(7th July - 13th July)</p>
  <div class="card-body" style="padding-top:5px !important;">
        		<div class="text-center date-body" style="width:150px;margin:0 auto !important;">
          <label for="" class="date-title pt-2">July</label>
          <div class="date-content">
            <p class="dia">7th</p>
            <hr class="nomargin"/>
            <p class="nomargin">until 13th July</p>
          </div>
        </div>
  
  </div>
  <div class="card-footer">
       
        <a class="btn btn-primary btn-md" href="../../bootcamp/Transform-Health-Limited-Bootcamp-Week2.pdf" download="Week 2 Bootcamp Entry Form"><i class="fas fa-file-download"></i> Download</a>
  
  </div>
  </div>
  
  </div>
  
  
  
<!--     <div class="card-body mb-3"> -->
<!--     </div> -->
  </div>

</div>



<!-- </div> -->

</div>
</div>

























































































  <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
  <script>
    AOS.init();
  </script>








<jsp:include flush="true" page="includes/footer.jsp"></jsp:include>