create table propriedaderural(
id int not null primary key auto_increment,
nome_propriedade varchar(250) not null,
endereco varchar(50) not null,
idcategoria int not null,
foreign key (idcategoria) references categoria(idcategoria)
);