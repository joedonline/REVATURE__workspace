-- WEEK 2 - 04 THURSDAY
CREATE TABLE comics (
  -- we'll come back and this PK later:
  id SERIAL,
  title VARCHAR(300),
  -- we'll come back and change these to FK later:
  author_id INTEGER NULL,
  genre_id INTEGER NULL,
  page_count INTEGER NOT NULL,
  -- 3.2 million most expensive comic, so we support 99 million
  price NUMERIC(8,4), -- precision, scale
  rating INTEGER check (rating >= 1 and rating <= 10)
);


INSERT INTO comics(title, page_count, price, rating) VALUES
  ('Calvin and Hobbes', 200, 20.00, 9),
  ('Batman: Detective Man', 200, 20.00, 3),
  ('The Killing Joke', 80, 60.00, 10),
  ($$ Barbies Island Adventure $$, 3000, 60.00, 10);

SELECT * FROM comics
