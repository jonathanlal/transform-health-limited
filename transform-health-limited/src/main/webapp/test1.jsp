

<c:if test="${version eq 1 || empty version}">

<div class="container mt-3" style="max-width:27rem;">



    <div class="row">
        <div class="col-sm-12 d-table">
            <div class="card card-body d-table-cell align-middle text-center">
            
            <div class="mt-2 mb-4">
               <img src="../../img/stacked-mint.png" style="width: 150px;">
            </div>   
               <hr>
            <div class="mt-3">
               <a type="button" href="../../products/" class="btn btn-primary btn-lg btn-block">View products</a>
               <a type="button" href="../../bootcamp/" class="btn btn-primary btn-lg btn-block mt-2">Marbella Bootcamp</a>
           
            </div>      
               
            </div>
        </div>
    </div>
</div>

<script>
document.body.style.backgroundColor = "#D6FAF1";
// background-color: #D6FAF1 !important;

</script>

</c:if>

<c:if test="${version eq 2}">

<style>

.btn.btn-lg {
    padding: 1rem 1.4rem !important;
}
</style>

<div class="container mt-3" style="max-width:27rem;">
<div class="card card-body">
    <div class="row">
        <div class="col-sm-12 d-table text-center">

 <img src="../../img/stacked-mint.png" style="width: 200px;margin-bottom:15px;" class="mt-4">

 <hr>
     <div class="row">
 			<div class="col-6 text-center">
         <a type="button" href="../../products/" class="btn btn-primary btn-lg btn-block">View<br> products</a>
             </div>
             <div class="col-6 text-center">
         <a type="button" href="../../bootcamp/" class="btn btn-primary btn-lg btn-block">Marbella<br> Bootcamp</a>
     		 </div>
       </div>
           
        </div>
    </div>

</div>
</div>
</c:if>




<c:if test="${version eq 3}">


<div class="container mt-3" style="max-width:27rem;">
<div class="card card-body">
    <div class="row">
        <div class="col-sm-12 d-table text-center">

 <img src="../../img/stacked-mint.png" style="width: 200px;margin-bottom:15px;" class="mt-4">

 <hr>
 			<div class="card-deck">
 			
 			<div class="card"  style="background-color:#FaFaFa;">
 			<img class="card-img-top" src="../img/bootcamp-n2.jpg" >
 			   <div class="card-footer" style="background-color: inherit;">
 			   <span>View <br>Products</span>
<!--  <a type="button" href="../../products/" class="btn btn-secondary btn-md btn-block">View products</a> -->
 		</div>
 			</div>
 			





             
             		
 			<div class="card mb-0"  style="background-color:#FaFaFa;">
 			<img class="card-img-top" src="../img/bootcamp-n.jpg" >
 			           <div class="card-footer" style="background-color: inherit;">
 		<span>Marbella <br>Bootcamp</span>
<!--  		 <a type="button" href="../../bootcamp/" class="btn btn-secondary btn-md btn-block">Marbella Bootcamp</a> -->
 			</div>
 			</div>
             
             
             
             
             
               </div>
        </div>
    </div>

</div>
</div>
</c:if>


