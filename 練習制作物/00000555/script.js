
window.onscroll = function(){
    
    var scrollpoint = window.pageYOffset;
    
    var tes1 = document.getElementById("tes1");
    var tes2 = document.getElementById("tes2");
    var tes3 = document.getElementById("tes3");
    var tes4 = document.getElementById("tes4");
    var tes5 = document.getElementById("tes5");
    var tes6 = document.getElementById("tes6");
    
    
    
    if
    (scrollpoint < 400)
    {
        tes1.style.height = "100vh";
    }
    if
    (scrollpoint > 400)
    {
        tes1.style.height = "0vh";
        tes2.style.height = "100vh";
    }
    if
    (scrollpoint > 1600)
    {

    }
}
