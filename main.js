
$('.menuHide').hide();
$('.mobile-menu-icons').show();
$('.mobile-menu-items').hide();

$('.menuShow').click(function(){
 $('.mobile-menu-items').slideDown(); 
    $('.menuHide').show();
    $('.menuShow').hide();
});

$('.menuHide').click(function(){
 $('.mobile-menu-items').slideUp(); 
    $('.menuHide').hide();
    $('.menuShow').show();
});

$('.uparrow').hide();
$('.service-dropdown').hide();

$('.downarrow').click(function(){
 $('.service-dropdown').slideDown(); 
    $('.downarrow').hide();
    $('.uparrow').show();
});

$('.uparrow').click(function(){
 $('.service-dropdown').slideUp(); 
    $('.downarrow').show();
    $('.uparrow').hide();
});