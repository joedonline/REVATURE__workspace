'use strict';

const fetchRequest2 = async () => {
  // const url = "https://swapi.co/api/people/2";
  const url = "https://pokeapi.co/api/v2/pokemon/ditto/";
  const response = await fetch(url);
  const json = await response.json();
  const abilities = json.abilities.map( ability => ability );
  const abilityNames = abilities.map( obj => obj.ability.name );
  console.log('[REQUEST 3] abilityNames', abilityNames);

  abilityNames.map( name => populateColumns("ABILITY: ".concat(name)) );

};

const getButton3 = document.getElementById('getButton3');
getButton3.addEventListener('click', fetchRequest2);
