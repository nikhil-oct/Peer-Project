<!DOCTYPE html>
<html>
<head>
<title>Natural Calamities</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>


<body>
	<center>
		<br>

		<h2>Info Natural Calamities</h2>
	</center>
	<div class="container">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4">

				<form action="check.do" method="post">

					<label>Place : </label> <input type="text" name="place"
						class="form-control" placeholder="Enter Your place" required="required"> <label>Date
						:</label> <input type="date" name="date" class="form-control"
						placeholder="Enter Your Date" required="required"> <label>Captured By:
					</label> <input type="text" name="capturedBy" class="form-control"
						placeholder="Enter Captured By" required="required"> <label>Area : </label> <input
						type="text" name="area" class="form-control"
						placeholder="Enter Your Area" required="required"> <label>Avg Loss: </label> <input
						type="text" name="avgLoss" class="form-control"
						placeholder="Enter Avg Loss" required="required"> <label>Number Of
						Deaths: </label> <input type="text" name="noOfDeaths" class="form-control"
						placeholder="Enter Number Of Deaths" required="required"> <label>Number
						Of Injured: </label> <input type="text" name="noOfInjured"
						class="form-control" placeholder="Enter Number Of Injured" required="required">
					<label>Calamity Type : </label><select name="calamityType"
						class="form-control" placeholder="Enter Captured By"
						required="required">
						<option value="">----selected----</option>
						<option value="Flood">Flood</option>
						<option value="Rain">Rain</option>
						<option value="Cyclone">Cyclone</option>

						<br>
						<center>
							<input type="submit" value="Register" class="btn btn-success">
						</center>
				</form>

			</div>
			<div class="col-4"></div>
		</div>
	</div>
</body>
</html>


