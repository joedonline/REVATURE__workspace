'use strict'

const getButton = document.querySelector('#getButton1');

let url = "https://swapi.co/api/people/1";
let apiKey = "";
let xhr;

const updateSuccess = rtext => {
  console.log(JSON.parse(rtext));
};

const updateError = () => console.log('GET request failed');

const responseMethod = () => {
  // if (xhr.readyState === 4) {
  if (xhr.readyState === xhr.DONE) {
    if (xhr.status === 200) {
      updateSuccess(xhr.responseText);
    } else {
      updateError();
    }
  }
  console.log('[REQUEST 1] successful', xhr.responseText);
};

const makeRequest = () => {
  xhr = new XMLHttpRequest();
  xhr.onreadystatechange = responseMethod;
  xhr.open('GET', url + apiKey);
  xhr.send();
};

const getRequestAction = evt => {
  makeRequest();
};

getButton.addEventListener('click', getRequestAction);
