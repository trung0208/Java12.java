CREATE DATABASE quanliphim;

use quanliphim;

CREATE TABLE movie(
id INT PRIMARY KEY,
title VARCHAR(100),
description VARCHAR(100),
lenght TIME(6),
rating ENUM("G", "PG","PG-13","R","NC-17","NR"),
poster VARCHAR(100),
studio VARCHAR(50),
status ENUM("public","hidden"),
release_date DATE,
id_director INT
);

CREATE TABLE movie_actor(
id_movie INT PRIMARY KEY,
id_actor INT
);
 
 CREATE TABLE actor(
 id INT PRIMARY KEY,
 full_name VARCHAR(200)
 );
 
CREATE TABLE movie_category(
id_movie INT PRIMARY KEY,
id_category INT
);

CREATE TABLE category(
id INT PRIMARY KEY,
name VARCHAR(100)
)
);

CREATE TABLE trailler(
id INT PRIMARY KEY,
id_movie INT,
link VARCHAR(1000)
);

CREATE TABLE movie_format(
id_movie INT PRIMARY KEY,
id_format INT
);

CREATE TABLE format(
id INT PRIMARY KEY,
name ENUM("2D","3D","4DX","IMAX","SCREENX")
);

CREATE TABLE movie_language(
id_movie INT PRIMARY KEY,
id_language INT
);

CREATE TABLE language(
id INT PRIMARY KEY,
name VARCHAR(200)
);

CREATE TABLE director(
id INT PRIMARY KEY,
full_name VARCHAR(200)
);














