'use strict';

const populateColumns = textContent => {
  const putFetchResultsHere = document.getElementById('putFetchResultsHere');

  const article = document.createElement('article');
  article.classList.add('col-md-6');
  console.log('ARTICLE', article);

  const h2 = document.createElement('h2');
  h2.textContent = textContent;
  console.log('ARTICLE TITLE', h2);

  article.appendChild(h2);

  putFetchResultsHere.appendChild(article);
  return putFetchResultsHere;
};
