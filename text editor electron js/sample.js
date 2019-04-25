window.addEventListener("load",function()
{
var editor=data.document;
editor.designMode="on";

	bold.addEventListener("click",function()
	{
	
	editor.execCommand("Bold",true,null);
	var ele = document.getElementById('bold').style.backgroundColor;
	if(ele == 'gray')
	{
	document.getElementById('bold').style.backgroundColor="brown"
	}else{
	document.getElementById('bold').style.backgroundColor="gray"
	}
	},false);
	
	italy.addEventListener("click",function()
	{
	editor.execCommand("Italic");
	var ele = document.getElementById('italy').style.backgroundColor;
	if(ele == 'gray')
	{
	document.getElementById('italy').style.backgroundColor="brown"
	}else{
	document.getElementById('italy').style.backgroundColor="gray"
	}
	},false);
	sup.addEventListener("click",function()
	{
	editor.execCommand("Superscript",false,null);
	var ele = document.getElementById('sup').style.backgroundColor;
	if(ele == 'gray')
	{
	document.getElementById('sup').style.backgroundColor="brown"
	}else{
	document.getElementById('sup').style.backgroundColor="gray"
	}
	},false);
	sub.addEventListener("click",function()
	{
	editor.execCommand("Subscript",false,null);
	var ele = document.getElementById('sub').style.backgroundColor;
	if(ele == 'gray')
	{
	document.getElementById('sub').style.backgroundColor="brown"
	}else{
	document.getElementById('sub').style.backgroundColor="gray"
	}
	
	},false);
	underline.addEventListener("click",function()
	{
	editor.execCommand("underline",false,null);
	var ele = document.getElementById('underline').style.backgroundColor;
	if(ele == 'gray')
	{
	document.getElementById('underline').style.backgroundColor="brown"
	}else{
	document.getElementById('underline').style.backgroundColor="gray"
	}
	
	},false);
	strike.addEventListener("click",function()
	{
	editor.execCommand("strikeThrough",false,null);
	var ele = document.getElementById('strike').style.backgroundColor;
	if(ele == 'gray')
	{
	document.getElementById('strike').style.backgroundColor="brown"
	}else{
	document.getElementById('strike').style.backgroundColor="gray"
	}
	},false);
	fontchanger.addEventListener("change",function(event)
	{
	editor.execCommand("FontName",false,event.target.value);
	},false);
	fontsize.addEventListener("change",function(event)
	{
	editor.execCommand("Fontsize",false,event.target.value);
	},false);
	/**upper.addEventListener("change",function(event)
	{
	editor.execCommand("uppercase",false,event.target.value);
	},false);**/
	jfr.addEventListener("click",function()
	{
	editor.execCommand("justifyRight",false,null);
	},false);
	jfl.addEventListener("click",function()
	{
	editor.execCommand("justifyLeft",false,null);
	},false);
	jfc.addEventListener("click",function()
	{
	editor.execCommand("justifyCenter",false,null);
	},false);
	jf.addEventListener("click",function()
	{
	editor.execCommand("justifyFull",false,null);
	},false);
	/**upper.addEventListener("click",function()
	{
	editor.execCommand("underline",false,null);
	},false);**/
	myFile.onchange = function(e) { 
	console.log("hii");
	  var myFile = document.getElementById("myFile").files[0];
	  var fileReader = new FileReader();
	  fileReader.onload = function(fileLoadedEvent){
		  var textFromFileLoaded = fileLoadedEvent.target.result;
		 document.getElementById("data").contentWindow.document.write(textFromFileLoaded);
		 console.log(document.getElementById("data").contentWindow.document);
	  };

	 fileReader.readAsText(myFile, "UTF-8");
	}
	
	},false);
	/*var notWorking = function(html) {
    var el = document.createElement('div');
    el.innerHTML = html;
    return el.childNodes[0];
}

	function hat()
	{
	var myIFrame = document.getElementById("data").contentWindow.document.body.innerHTML;
	      //var data  = "text/json;charset=utf-8," + encodeURIComponent(JSON.stringify(obj));
	var name;
	console.log(myIFrame);
	var ele=document.getElementById("download");
	name=prompt("enter the filename");
    uriContent = "data:application/octet-stream," + encodeURIComponent(myIFrame);
	ele.innerHTML = "<a href=" + uriContent + " download=\"" +name+".txt\">Here is the download link</a>";
	}
	function download()
	{
	document.getElementById("download").innerHTML="";
	}*/
	function Export2Doc(element){
    var preHtml = "<html xmlns:o='urn:schemas-microsoft-com:office:office' xmlns:w='urn:schemas-microsoft-com:office:word' xmlns='http://www.w3.org/TR/REC-html40'><head><meta charset='utf-8'><title>Export HTML To Doc</title></head><body>";
    var postHtml = "</body></html>";
    var html = preHtml+document.getElementById("data").contentWindow.document.body.innerHTML+postHtml;

    var blob = new Blob(['\ufeff', html], {
        type: 'application/msword'
    });
    
    // Specify link url
    var url = 'data:application/vnd.ms-word;charset=utf-8,' + encodeURIComponent(html);
    console.log(url);
    // Specify file name
    filename = "sample";
	filename=filename+".doc";
    
    // Create download link element
    var downloadLink = document.createElement("a");

    document.body.appendChild(downloadLink);
    
        // Create a link to the file
        downloadLink.href = url;
        
        // Setting the file name
        downloadLink.download = filename;
        
        //triggering the function
        downloadLink.click();
    
    document.body.removeChild(downloadLink);
}