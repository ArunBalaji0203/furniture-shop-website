let slideIndex = 1;
showSlides(slideIndex);
function plusSlides(n) {
  showSlides(slideIndex += n);
}
showSlides();
function showSlides(n) {
  let i;
  
  let slides = document.getElementsByClassName("carousel-item");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slides[slideIndex-1].style.display = "block";
  setTimeout(showSlides, 2000);
}

function buttonremove(){
  const chck=document.getElementById('play-bt');
  if(chck.style.visibility=="hidden"){
   chck.style.visibility="visible";
  }else{
    chck.style.visibility="hidden";
  }
}