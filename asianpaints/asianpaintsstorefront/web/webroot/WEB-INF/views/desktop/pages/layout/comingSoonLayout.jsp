<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- <c:url var="saveCustomerData" value="/saveNotifyCustomer" /> --%>

<template:page pageTitle="${pageTitle}">

	<div id="globalMessages">
		<common:globalMessages />
	</div>


	<div id=productNotifyDiv>
		<div>
			<input type="text" id="messageNotifyId" readonly="readonly" style="display: none; border: none; font-weight: bold; width: 350px"/>
		</div>
		<ol class="products-list" data-isOrderForm="false">

			<c:forEach items="${comingSoonProductData}" var="product">

			
				<div class="head">${product.name}</div>
			<!--For getting product images on coming soon page  -->
			<td style="padding-right: 20px;"><img src="${product.thumbnail.url}" alt="${product.thumbnail.altText}" title="${product.thumbnail.altText}"/></td>
				
				${product.summary}
				
				<input type="submit" id="notifyMe_${product.code}" value="Notify Me" onclick="openForm(${product.code})" />
				
				<div id="notifyId_${product.code}" style="display: none">
					<form  id="myForm" name="saveCustomerDataForm_${product.code}">
					<p>Please provide all the details</p>
						<table>
							<tr>
								<td>First name:<br></td>
								<td><input type="text" name="firstName" id="firstName" required="required"><br></td>
							</tr>
							<tr>
								<td>Last name:<br></td>
								<td><input type="text" name="lastName" id="lastName" required="required"><br></td>
							</tr>
							<tr>
								<td>Email Id :<br></td>
								<td><input type="text" name="emailId" id="emailId" required="required"><br></td>
							</tr>
							<tr>
								<td>Product Code:<br></td>
								<td><input type="text" name="productCode" id="productCode" value="${product.code}" readonly="readonly"><br></td>
							</tr>
							<tr>
								<td>Product Name :<br></td>
								<td><input type="text" name="productName" id="productName" value="${product.name}" readonly="readonly"><br></td>
							</tr>
							<tr>
							<tr>
								<td></td>
								<td><input type="button" value="Save" onclick="formsubmit(${product.code})" style="color: white; background-color: green"> 
									<input type="reset" value="Cancel" onclick="cancelForm(${product.code})" style="color: white; background-color: green"></td>
							</tr>
						</table>
					</form>
				</div>
			</c:forEach>
		</ol>
		
	</div>
	
	 
	<script type="text/javascript" >
	function formsubmit(code) {
				 var str = $("#myForm").serialize();
				 try{
				 $.ajax({
						type : "POST",
						data : str,
						url : "<c:url value='/saveNotifyMeProducts'/>",
						success : function(result) {
							 
							$("#messageNotifyId").val(result);
							$("#messageNotifyId").css({
								'display' : "block"
							}); 	 
							if(result.search("saved") != -1){
								$("#messageNotifyId").css({
									'color' : "green"
									
								}); 
							}
							else{
								$("#messageNotifyId").css({
									'color' : "red"
								});
								}
																			
						},
						error : function() {
							 
						},
						done : function() {
							 
						}
					});
				 }
				 catch(e){
					 alert(e);
				 }
		}
	</script>
		<script type="text/javascript">
		function openForm(code) {
		 
			$("#notifyId_"+code).css({
				'display' : "block"
			});
			$("#notifyMe_"+code).css({
				'display' : "none"
			});
		}
		
		function cancelForm(code) {
			$("#notifyId_"+code).css({
				'display' : "none"
			});
			$("#notifyMe_"+code).css({
				'display' : "block"
			});
		}
	</script>
	
</template:page>






 