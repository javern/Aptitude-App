 var url = '../' + getPDFURL();

 function getPDFURL(){
     var query = window.location.search.substring(1);
     var vars = query.split("=");
     var pdfPage = vars[1];
     return pdfPage;
 }