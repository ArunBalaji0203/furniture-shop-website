const elementsArray=document.getElementsByClassName("s1");
let i;

for(i=0;i<elementsArray.length;i++){
elementsArray[i].addEventListener("click",myfuns1);
}
function myfuns1(){
  var s31=document.getElementById("s31");
  s31.style.zIndex=1;
   var s11=document.getElementById("s11");
   s11.style.zIndex=3;
}


const elementtsArray=document.getElementsByClassName("s3");
let j;

for(j=0;j<elementtsArray.length;j++){
elementtsArray[j].addEventListener("click",myfuns3);
}

function myfuns3(){
  document.getElementById("s11").style.zIndex=1;
  document.getElementById("s31").style.zIndex=3;
}


function openpopup(){
  var pop=document.getElementById("popup");
  if(pop.style.visibility=="hidden"){
    pop.style.visibility="visible";
  }else{
    pop.style.visibility="hidden";
  }
}
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
  }
  
  window.onclick = function(event) {
    if (!event.target.matches('.dropbtn')) {
      var dropdowns = document.getElementsByClassName("dropdown-content");
      var i;
      for (i = 0; i < dropdowns.length; i++) {
        var openDropdown = dropdowns[i];
        if (openDropdown.classList.contains('show')) {
          openDropdown.classList.remove('show');
        }
      }
    }
  }
let slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function showSlides(n) {
  let i;
  
  let slides = document.getElementsByClassName("slides");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slides[slideIndex-1].style.display = "block";  
}

function display(){

let name=document.getElementById("name").value;
  var email=document.getElementById("email").value;
  var number=document.getElementById("number").value;
  var fruitavailable=document.getElementById("fruitsavailable").value;
  var quantity=document.getElementById("quantity").value;
  console.log("Username : ",name);
  console.log("Email Id : ",email);
  console.log("Mobile number : ",number);
  console.log("Fruits available : ",fruitavailable);
  console.log("Quantity : ",quantity);
  alert("Your Response has been submitted ");
}