
'use strict';

const loginForm = document.getElementById('loginForm');
const username = document.getElementById('userName');
const password = document.getElementById('password');

let authUri = 'http://localhost:8080/recipe/login/*';

loginForm.addEventListener('submit', (event)=>{
//we need to prevent default form behaviour
event.preventDefault();
sendRecipe();
});

async function sendRecipe() {
  console.log(username.value);
  console.log(password.value);

  let login = {};
  login.username = username.value;
  login.password = password.value;

  console.log("[login] obj: ", login);

  let response = await fetch(authUri, { headers: { "Content-Type": "application/json" }, method: 'GET' });
  // window.location("http://localhost:8080/recipe/login");
  console.log("[response]: ", response.body);
}
