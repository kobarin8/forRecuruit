$('head').append(
  '<style type="text/css">.is-hide{display:none;}</style>'
);

$(window).on("load",function() {
  $('body').fadeIn(800).removeClass("is-hide");
});

$(window).on("pageshow",function() {
  if (event.persisted) {
    window.location.reload();
  }
});

$(function(){
  $('a.fadelink').on("click",function() {
    var url = $(this).attr('href');
    if (url != '') {
      $('body').fadeOut(800);
      setTimeout(function(){
        location.href = url;
      }, 800);
    }
    return false;
  });
});