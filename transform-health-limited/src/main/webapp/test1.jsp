<jsp:include flush="true" page="includes/header.jsp"></jsp:include>

<h1>Test1</h1>


<div style="display:inline;"><a href="https://www.transformationpod.com/wd-admin/verifyuser"
style="background-color:#5cb85cNaN;border-radius:4px;color:#ffffff;display:inline-block;font-family:sans-serif;font-size:13px;font-weight:bold;line-height:40px;text-align:center;text-decoration:none;width:200px;-webkit-text-size-adjust:none;">Approve</a>
</div>


<div>
      <a href="https://www.transformationpod.com/wd-admin/verifyuser"
style="background-color:#5cb85cNaN;border-radius:4px;color:#ffffff;display:inline-block;font-family:sans-serif;font-size:13px;font-weight:bold;line-height:40px;text-align:center;text-decoration:none;width:200px;-webkit-text-size-adjust:none;">Approve</a>
</div>


<script>
//script at the bottom of the body to change select dropdown based on currently selected mainheading value.
//old method tried to use scriptlets mixed with javascript, but it's easier to do this with javascript.
const urlParams = new URLSearchParams(window.location.search);
const myParam = urlParams.get('x'); 
//if mainHeading parameter is null or equal to GÉANT Operations show GÉANT Operations dropdown
if(myParam === 'operations' || myParam === null) {
//     document.getElementById('mainHeading').value = 'GÉANT Operations';
alert("operations");
}else{
//     document.getElementById('mainHeading').value = 'GÉANT Future Plans';
	alert("future");
}
</script>


<jsp:include flush="true" page="includes/footer.jsp"></jsp:include>