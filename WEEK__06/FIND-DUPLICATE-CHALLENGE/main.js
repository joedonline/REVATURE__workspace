const arr = [5, 5, 6, 1, 7, 11, 4, 11, 1000, 3];


// MERGE SORT SOLUTION
function mergeSort(unsorted) {
  if (unsorted.length <= 1) return unsorted;

  const middle = Math.floor(unsorted.length / 2);
  const left = unsorted.slice(0, middle);
  const right = unsorted.slice(middle);

  return merge( mergeSort(left), mergeSort(right) );
}

function merge( leftArr, rightArr ) {
  let result = [], lIndex = 0, rIndex = 0;

  while (lIndex < leftArr.length && rIndex < rightArr.length) {
    if (leftArr[lIndex] < rightArr[rIndex]) {
      result.push(leftArr[lIndex]);
      lIndex++;
    } else{
      result.push(rightArr[rIndex]);
      rIndex++;
    }
  }

  return result.concat(leftArr.slice(lIndex)).concat(rightArr.slice(rIndex));
}


function returnFirstDuplicate(collection) {
  const sorted = mergeSort(collection);

  let foundDuplicate = false;
  let j = 1;
  for (let i = 0; i < sorted.length; i++) {

    if (!foundDuplicate) {

      if (sorted[i] === sorted[j]) {
        return sorted[i];
      } else {
        j++;
      }

    }

  }

}

console.log(returnFirstDuplicate(arr));





// // BRUTE FORCE SOLUTION, using array
// const collection = [];
// function has(it) {
//   for (let element of collection) {
//     if (it === element) {
//       return true;
//     }
//   }
//   return false;
// }
//
// for (let i = 0; i < arr.length; i++) {
//   if (has(arr[i])) {
//     console.log(arr[i]);
//   } else {
//     collection.push(arr[i]);
//   }
// }


// "ONE PASS" SOLUTION, using array
// const collection = [];
// arr.forEach( item => {
//
//   if (collection.includes(item)) {
//     console.log(item);
//   } else {
//     collection.push(item);
//   }
//
// });


// "ONE PASS" SOLUTION, using Set
// const collection = new Set();
//
// arr.forEach( item => {
//
//   if (collection.has(item)) {
//     console.log(item);
//   } else {
//     collection.add(item);
//   }
//
// });
