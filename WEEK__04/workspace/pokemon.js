'use strict';

// SPRITES
const spriteDisplay = document.getElementById('spriteDisplay');

const carouselPokemonInterval = document.createElement('div');
carouselPokemonInterval.setAttribute('id', 'carouselPokemonInterval');
carouselPokemonInterval.setAttribute('class', 'carousel slide');
carouselPokemonInterval.setAttribute('data-ride', 'carousel');

const carouselPokemonInner = document.createElement('div');
carouselPokemonInner.setAttribute('id', 'carouselPokemonInner');
carouselPokemonInner.setAttribute('id', 'carousel-inner');

spriteDisplay.appendChild(carouselPokemonInterval);

const spritesHandler = (frontUrl, backUrl, size) => {
  const carouselItem = document.createElement('div');
  carouselItem.setAttribute('class', 'carousel-item active');
  carouselItem.setAttribute('data-interval', '10000');

  const frontImage = document.createElement('img');
  frontImage.setAttribute('src', frontUrl);
  frontImage.setAttribute('class', 'd-block w-100');
  frontImage.setAttribute('alt', 'Pokemon front.');

  const backImage = document.createElement('img');
  backImage.setAttribute('src', backUrl);
  backImage.setAttribute('class', 'd-block w-100');
  backImage.setAttribute('alt', 'Pokemon back.');

  carouselItem.appendChild(frontImage);
  carouselItem.appendChild(backImage);

  return {
    carouselItem: carouselItem,
  };
};

// POKEMON FETCH
const getPokemonCollection = async () => {
  const url = "https://pokeapi.co/api/v2/pokemon";
  const response = await fetch(url);
  const json = await response.json();

  return await json.results;
};

const pokeUrls = getPokemonCollection().then(
  obj => obj.map( pokemon => pokemon.url )
).then( urls => {
  return urls.map( url => url )
});

const pokemonUrlHandler = urls => {
  const size = urls.length;

  urls.map( url => {
    setPokemon(url, size)
  } );
};

const setPokemon = (pokemonUrl, size) => {
  (async () => {
    const res = await fetch(pokemonUrl);
    const resJson = await res.json();
    const carouselItems = spritesHandler(resJson.sprites.front_shiny, resJson.sprites.back_shiny, size);

    carouselPokemonInner.appendChild(carouselItems.carouselItem);
    carouselPokemonInterval.appendChild(carouselPokemonInner);
  })()
};

pokeUrls.then( urls => pokemonUrlHandler(urls) );


// CONTROL BUTTONS
const prev = document.createElement('a');
prev.setAttribute('class', 'carousel-control-prev');
prev.setAttribute('href', '#carouselExampleInterval');
prev.setAttribute('role', 'button');
prev.setAttribute('data-slide', 'prev');

const controlPrev = document.createElement('span');
controlPrev.setAttribute('class', 'carousel-control-prev-icon');
controlPrev.setAttribute('aria-hidden', 'true');

const controlPrevSrOnly = document.createElement('span');
controlPrevSrOnly.setAttribute('class', 'sr-only');
controlPrevSrOnly.textContent = "Previous";

controlPrev.appendChild(controlPrevSrOnly);

const next = document.createElement('a');
next.setAttribute('class', 'carousel-control-next');
next.setAttribute('href', '#carouselExampleInterval');
next.setAttribute('role', 'button');
next.setAttribute('data-slide', 'next');

const controlNext = document.createElement('span');
controlNext.setAttribute('class', 'carousel-control-prev-icon');
controlNext.setAttribute('aria-hidden', 'true');

const controlNextSrOnly = document.createElement('span');
controlNextSrOnly.setAttribute('class', 'sr-only');
controlNextSrOnly.textContent = "Next";

controlNext.appendChild(controlNextSrOnly);

prev.appendChild(controlPrev);
next.appendChild(controlNext);

carouselPokemonInterval.appendChild(prev);
carouselPokemonInterval.appendChild(next);

/*
<a class="carousel-control-prev" href="#carouselExampleInterval" role="button" data-slide="prev">
  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
  <span class="sr-only">Previous</span>
</a>
<a class="carousel-control-next" href="#carouselExampleInterval" role="button" data-slide="next">
  <span class="carousel-control-next-icon" aria-hidden="true"></span>
  <span class="sr-only">Next</span>
</a>
*/

spriteDisplay.appendChild(carouselPokemonInterval);
