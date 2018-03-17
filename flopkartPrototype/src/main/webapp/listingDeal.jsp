<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add deal to listing</title>
</head>
<body>
<div id="listing-content"></div>
<div id="deal-content"></div>
</body>
<!-- JavaScripts placed at the end of the document so the pages load faster --> 
<script src="./bootstrapFiles/js/jquery-1.11.1.min.js"></script> 
<script src="./bootstrapFiles/js/bootstrap.js"></script>
<script src="./bootstrapFiles/js/bootstrap.min.js"></script> 
<script src="./bootstrapFiles/js/bootstrap-hover-dropdown.min.js"></script> 
<script src="./bootstrapFiles/js/owl.carousel.min.js"></script> 
<script src="./bootstrapFiles/js/echo.min.js"></script> 
<script src="./bootstrapFiles/js/jquery.easing-1.3.min.js"></script> 
<script src="./bootstrapFiles/js/bootstrap-slider.min.js"></script> 
<script src="./bootstrapFiles/js/jquery.rateit.min.js"></script> 
<script src="./bootstrapFiles/js/bootstrap-select.min.js"></script> 
<script src="./bootstrapFiles/js/wow.min.js"></script> 
<script src="./bootstrapFiles/js/scripts.js"></script>
<script src="./customJavascripts/cookies.js"></script>
<script>
$(document).ready(function(){
	fetch();
});
function fetch() 
{
    var ctxPath = "<%=request.getContextPath()%>";
    var sellerId = 3;
	$.ajax(
	{
		type : 'GET',
		contentType : 'application/json',
		url : ctxPath + "/webapi/listings/seller/"+sellerId,
		dataType : "json", // data type of response
		success : function(result){
			var data="<select id='listingId' style=\" background-color:white; font-size:20px;\">"+"<option value=' "+0+" '>Select a listing</option>";
            for(var i in result){
               data+="<option value='"+result[i].id+"'>"+result[i].listingName+"</option>";
            }
            data += "</select>";
            $('#listing-content').html(data);
    	},
    	error:function() {
        	//alert("error occurred");
    	}
	});
	
	$.ajax(
			{
				type : 'GET',
				contentType : 'application/json',
				url : ctxPath + "/webapi/deals",
				dataType : "json", // data type of response
				success : function(result){
					var data="<select id='dealId' style=\" background-color:white; font-size:20px;\">"+"<option value=' "+0+" '>Select a deal</option>";
		            for(var i in result){
		               data+="<option value='"+result[i].id+"'>"+result[i].dealname+"</option>";
		            }
		            data += "</select>";
		            $('#deal-content').html(data);
		    	},
		    	error:function() {
		        	//alert("error occurred");
		    	}
			});
}
</script>
</html>