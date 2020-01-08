'use strict';

const fetchRequest1 = evt => {
  let url = "https://swapi.co/api/people/2/";

  fetch(url).then( res => res.json() )
    .then( res => console.log('[FETCH REQUEST 2]', res))
    .catch( err => console.log('[FETCH REQUEST 2] unsuccessful', err));
};

const getButton2 = document.getElementById('getButton2');

getButton2.addEventListener('click', fetchRequest1);
