let num = 0;
setTimeout(carousel, 2000);
function carousel() {
  let i;
  let citem = document.getElementsByClassName("citem");
  for (i = 0; i < citem.length; i++) {
    citem[i].style.display = "none";  
  }
  num++;
  if (num > citem.length) {num = 1}    
  citem[num-1].style.display = "block";  
  setTimeout(carousel,2000);
}

// let form = document.getElementById('form');
// form.addEventListener('submit',event=>{
//   event.preventDefault();

//   let formdata=new FormData(form);
//   let data=Object.fromEntries(formdata);
//   let jsondata=JSON.stringify(data);

//   fetch('',{
//     method:'POST',
//     headers:{
//       "content-type":"application/json; charset:UTF-8"
//     },
//     body:jsondata
//   })
//   .then(res=>res.json())
//   .then(result=>console.log(result.data))
//   .catch(err=>console.log(err))
// });
