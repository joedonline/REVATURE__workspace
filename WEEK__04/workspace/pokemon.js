'use strict';

// SPRITES
const spriteDisplay = document.getElementById('spriteDisplay');

const spritesHandler = pokeUrl => {
  const column = document.createElement('div');
  column.classList.add('col-md-2');

  const sprite = document.createElement('img');
  sprite.setAttribute('src', pokeUrl);
  console.log(sprite);
  column.appendChild(sprite);
  spriteDisplay.appendChild(column);
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
  urls.map( url => setPokemon(url) );
};

const setPokemon = pokemonUrl => {
  (async () => {
    const res = await fetch(pokemonUrl);
    const resJson = await res.json();
    // console.log(resJson.sprites.front_default);
    spritesHandler(resJson.sprites.front_default);
  })()
};

pokeUrls.then( urls => pokemonUrlHandler(urls) );
