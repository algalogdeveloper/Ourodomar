create table associacao(
id int not null primary key auto_increment,
nome_assac varchar(250) not null,
numero_ano varchar(20) not null,
cnpj varchar(250) not null unique,
endereco varchar(150) not null,
cidade varchar(100) not null,
estado varchar(50) not null
);