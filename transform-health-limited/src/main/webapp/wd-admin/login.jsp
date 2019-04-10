<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="/includes/header.jsp"></jsp:include>


<style>

body {
	background-color: #f7f9fb;
}

.my-login-page .brand {
	width: 150px;
	margin: 0 auto; 
}

.my-login-page .brand img {
	width: 100%;
}

.my-login-page .card-wrapper {
 	max-width: 500px; 
 	    margin: 0 auto;
}

.my-login-page .card {
	border-color: transparent;
	box-shadow: 0 0 40px rgba(0,0,0,.05);
}

.my-login-page .card.fat {
	padding: 10px;
}

.my-login-page .card .card-title {
	margin-bottom: 30px;
}

.my-login-page .form-control {
	border-width: 2.3px;
}

.my-login-page .form-group label {
	width: 100%;
	text-align: left;
}

.my-login-page .btn.btn-block {
	padding: 12px 10px;
}

.my-login-page .margin-top20 {
	margin-top: 20px;
}

.my-login-page .no-margin {
	margin: 0;
}

.my-login-page .footer {
	margin: 40px 0;
	color: #888;
	text-align: center;
}

@media screen and (max-width: 425px) {
	.my-login-page .card-wrapper {
		width: 90%;
		margin: 0 auto;
		    text-align: center;
	}
}

@media screen and (max-width: 320px) {
	.my-login-page .card.fat {
		padding: 0;
	}

	.my-login-page .card.fat .card-body {
		padding: 15px;
	}
}
.card{
    width: 100%;
}

	.social-btn .btn {
		border: none;
        margin: 10px 3px 0;
        opacity: 1;
	}
    .social-btn .btn:hover {
        opacity: 0.9;
    }
	.social-btn .btn-primary {
        background: #507cc0;
    }
	.social-btn .btn-info {
		background: #64ccf1;
	}
	.social-btn .btn-danger {
		background: #df4930;
	}
    .or-seperator {
        margin-top: 20px;
        text-align: center;
        border-top: 1px solid #ccc;
    }
    .or-seperator i {
        padding: 0 10px;
        background: #f7f7f7;
        position: relative;
        top: -11px;
        z-index: 1;
    }   
    
    .card-body{
    
    background-color: white !important;
    }
    .input-group-text {
        background-color: white !important;
    }
</style>




<!-- <div class="container main-container px-3"> -->



<div class="my-login-page">
<br><br><br>
			<div class="justify-content-md-center h-100">
				<div class="card-wrapper text-center">
		
					<div class="card fat border shadow">
								<div class="brand mt-2">
						<img src="../../img/login-image-v1.png">
					</div>
					<c:if test="${not empty error}">
					<div class="alert alert-danger mt-3 mb-0" role="alert">${error}</div>
					</c:if>
						<div class="card-body">
						<div style="background-color:#00595E;width:100%;">
						<h6 class="card-title py-2 mb-3" style="color:white;font-weight: 400 !important;font-family:'Montserrat', sans-serif !important;">
				ADMIN LOGIN
						</h6>
						</div>

							<form method="POST" action="../../../Login">
								
								
												  <div class="input-group input-group-lg mb-3">
								  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1"><i style="color:#013B5C" class="fas fa-user"></i></span>
				  </div>
				  <input name="email" type="text" class="form-control" placeholder="Email Address" aria-label="email" aria-describedby="basic-addon1" required>
				</div>
				     
		
				  <div class="input-group input-group-lg mb-3">
				  
				  <div class="input-group-prepend">
				  
				    <span class="input-group-text" id="basic-addon1"><i  style="color:#013B5C" class="fas fa-key"></i></span>
				  </div>
				  
				  <input name="password" type="password" class="form-control" placeholder="Password" aria-label="password" aria-describedby="basic-addon1" required>
				</div>
								
											<div class="form-group">
								</div>
								

								<div class="form-group no-margin mt-4">
									<button type="submit" class="btn btn-primary btn-md" style="width:150px;font-weight: 500">
										<i class="fas fa-sign-in-alt pr-1"></i>  LOGIN
									</button>
								</div>
						
							</form>
						</div>
							
					</div>
			<div class="margin-top20 text-center">
									Don't have an account? <a href="../../wd-admin/register/">Create One</a><br>
											     		<a href="../../wd-admin/forgot-password/">
											Forgot Password?
										</a>
								</div>



				</div>
			</div>

<br><br><br><br><br><br><br>
</div>


<!-- </div> -->












<jsp:include flush="true" page="/includes/footer.jsp"></jsp:include>























