

function dibujarGrilla(){ 

	var letras = ["A","B","C","D","E","F","G","H","I","J"];
	var filaLetras = "<div>";
	filaLetras += "<div class='row subgrilla'></div>";

	for(var i=0;i< 10 ;i++){
		filaLetras = filaLetras + "<div class='subgrilla'>" + letras[i] + "</div>";
	}

	var filaNumeros ="<div>";

	for(var i=1;i< 11 ;i++){
		filaNumeros = filaNumeros + "<div class='subgrilla'>" + i+ "</div>";
	}

	for(var i=0;i<10;i++){
		for(var j=0;j<10;j++){


		}
	}

	var filas =filaNumeros+filaLetras;

	document.getElementById("grilla").innerHTML = filas;
}
