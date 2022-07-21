create database customer;
use customer;
create table customers (
id INT (10),
name VARCHAR(100),
street VARCHAR(100),
city VARCHAR(20),
state CHAR(2),
credit_limit INT(50)
);

SELECT * FROM customer.customers;

INSERT INTO customers VALUES("1", "Pedro Augusto da Rocha", "Rua Pedro Carlos Hoffman", "Porto Alegre", "RS", "700,00");
INSERT INTO customers VALUES("2", "Antonio Carlos Mamel", "Av. Pinheiros", "Belo Horizonte", "MG", "3500,50");
INSERT INTO customers VALUES("3", "Luiza Augusta Mhor", "Rua Salto Grande", "Niteroi", "RJ", "4000,00");
INSERT INTO customers VALUES("4", "Jane Ester", "Av 7 de Setembro", "Erechim", "RS", "800,00");
INSERT INTO customers VALUES("5", "Marcos Antônio dos Santos", "Av Farrapos", "Porto Alegre", "RS", "4250,25");

SELECT * FROM customer.customers;

SELECT name FROM customers WHERE state = 'RS';
