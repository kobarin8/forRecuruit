//window.onclick = function(){
//    var scrollpoint = window.pageYOffset;
//    alert("現在のスクロール取得値は"+scrollpoint);
//}

window.onscroll = function(){
    
    var scrollpoint = window.pageYOffset;
    var scroll_counter = document.getElementById("scroll_counter");
    
    var bg = document.getElementById("bg");
    var pics = document.getElementById("pics");
    var pics1 = document.getElementById("pics1");
    var pics2 = document.getElementById("pics2");
    var pics3 = document.getElementById("pics3");
    
    var kirisute =Math.floor(scrollpoint);
    var kakikae = kirisute+"px";
    
    scroll_counter.innerHTML = kakikae;

    if
    (scrollpoint < 400)
    {
        bg.style.backgroundColor = "red";
    }
    if
    (scrollpoint > 400)
    {
        bg.style.backgroundColor = "blue";
    }
    if
    (scrollpoint > 800)
    {
        bg.style.backgroundColor = "black";
    }
    if
    (scrollpoint > 1200)
    {
        bg.style.backgroundColor = "green";
    }
    if
    (scrollpoint > 1600)
    {
        bg.style.backgroundColor = "yellow";

    }
}

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


document.getElementById("scrollallow").onclick = function(){
    
    var scrollpoint = window.pageYOffset;
    var scroll_counter = document.getElementById("scroll_counter");
    
    var kirisute =Math.floor(scrollpoint);
    var kakikae = kirisute+"px";
    
    alert(kirisute);
    scrollpoint.scrollIntoView
    
}
    


