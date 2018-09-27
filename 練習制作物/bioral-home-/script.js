document.getElementById("headerbutton").onclick = function(){
    target1 = document.getElementById("headerreturnbutton_delete");
    target1.id = "headerreturnbutton";
    
    target2 = document.getElementById("header");
    target2.id = "header_delete";
}

document.getElementById("headerreturnbutton").onclick = function(){
    target1 = document.getElementById("headerreturnbutton");
    target1.id = "headerreturnbutton_delete";
    
    target2 = document.getElementById("header_delete");
    target2.id = "header";
}








document.getElementById("category_middle_1").onmouseover = function(){
    var pic = document.getElementById("mibaepic1");
    var text = document.getElementById("mibaeText1");
    var desc = document.getElementById("categry_description1");
    
    pic.style.filter = "brightness(60%)";
    text.style.opacity = "1";
    text.style.top = "50%";
    desc.style.borderRadius ="20px";
}

document.getElementById("category_middle_1").onmouseout = function(){
    var pic = document.getElementById("mibaepic1");
    var text = document.getElementById("mibaeText1");
    var desc = document.getElementById("categry_description1");
    
    pic.style.filter = "brightness(100%)";
    text.style.opacity = "0";
    text.style.top = "75%";
    desc.style.borderRadius ="0px";
}

document.getElementById("category_middle_2").onmouseover = function(){
    var pic = document.getElementById("mibaepic2");
    var text = document.getElementById("mibaeText2");
    var desc = document.getElementById("categry_description2");
    
    pic.style.filter = "brightness(60%)";
    text.style.opacity = "1";
    text.style.top = "50%";
    desc.style.borderRadius ="20px";
}

document.getElementById("category_middle_2").onmouseout = function(){
    var pic = document.getElementById("mibaepic2");
    var text = document.getElementById("mibaeText2");
    var desc = document.getElementById("categry_description2");
    
    pic.style.filter = "brightness(100%)";
    text.style.opacity = "0";
    text.style.top = "75%";
    desc.style.borderRadius ="0px";
}

document.getElementById("category_middle_3").onmouseover = function(){
    var pic = document.getElementById("mibaepic3");
    var text = document.getElementById("mibaeText3");
    var desc = document.getElementById("categry_description3");
    
    pic.style.filter = "brightness(60%)";
    text.style.opacity = "1";
    text.style.top = "50%";
    desc.style.borderRadius ="20px";
}

document.getElementById("category_middle_3").onmouseout = function(){
    var pic = document.getElementById("mibaepic3");
    var text = document.getElementById("mibaeText3");
    var desc = document.getElementById("categry_description3");
    
    pic.style.filter = "brightness(100%)";
    text.style.opacity = "0";
    text.style.top = "75%";
    desc.style.borderRadius ="0px";
}


document.getElementById("txt_space").onmouseover = function(){
    var pic = document.getElementById("txt_space");
    
    pic.style.filter = "brightness(60%)";

}

document.getElementById("txt_space").onmouseout = function(){
    var pic = document.getElementById("txt_space");

    pic.style.filter = "brightness(100%)";

}



