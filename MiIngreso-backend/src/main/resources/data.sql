DROP TABLE  IF  EXISTS checkout_product;
DROP TABLE  IF  EXISTS checkout;
DROP TABLE  IF  EXISTS product;
DROP TABLE  IF  EXISTS customer;



CREATE TABLE IF NOT EXISTS product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  price DOUBLE DEFAULT NULL,
  image VARCHAR(250) NOT NULL
);


INSERT INTO product ( name, description, price, image) VALUES
  ( 'Camiseta blanca', 'En algodon', 20000, 'https://images-na.ssl-images-amazon.com/images/I/81Hpdt6zCiL._AC_UX679_.jpg'),
  ('Reloj watching', 'En plata', 30000, 'https://images-na.ssl-images-amazon.com/images/I/51jkvc%2BwWDL._UX522_.jpg'),
  ('Vaso', 'En vidrio', 30100, 'https://www.ecured.cu/images/9/9c/Vaso.jpg');



CREATE TABLE IF NOT EXISTS  customer (
  document INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL
);

INSERT INTO customer (document, name, lastName) VALUES
  (1, 'Anonymous', 'Anonymous');


CREATE TABLE IF NOT EXISTS  checkout (
  id INT AUTO_INCREMENT PRIMARY KEY,
  checkoutDate timestamp NOT NULL,
  document_customer INT NOT NULL,
  totalPrice double NOT NULL
);

CREATE TABLE IF NOT EXISTS  checkout_product (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_checkout INT NOT NULL,
  id_product INT NOT NULL,
  currentPrice double NOT NULL,
  foreign key (id_checkout) references checkout(id),
  foreign key (id_product) references product(id)
);


