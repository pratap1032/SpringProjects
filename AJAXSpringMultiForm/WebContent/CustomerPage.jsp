<html>
<script src="prototype.js"></script>
<script type="text/javascript">
	        function doAjaxPost() {
	        // get the form values
	        var industryName = $('industry').value;
	        var currencyName = $('currency').value;
	        new Ajax.Request('industrycustomer/list.htm',
					{
				method:'POST',
				parameters: "industryName=" + industryName + "&currencyName=" + currencyName,
				onSuccess: function(transport){
					var response = transport.responseText || "no response text";
					alert("Success! \n\n" + response);
					$('message').innerHTML = response; 
				},
				onFailure: function(){ alert('Something went wrong...'); }
					});
	        }
	        </script>
</head>
<body>
<div align="center">
	<h1>AJAX and Spring</h1>
	<table>
		<tr>
			<td>Enter industryName :</td>
			<td><input type="text" id="industry"><br />
			</td>
		</tr>
		<tr>
			<td>currency :</td>
			<td><input type="text" id="currency"><br />
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="Add Users" onclick="doAjaxPost()"><br />
			</td>
		</tr>
		<tr>
			<td colspan="2"><div id="info" style="color: green;"></div>
			</td>
		</tr>
	</table>
	</div>
	<div id="message"></div>
</body>
</html>