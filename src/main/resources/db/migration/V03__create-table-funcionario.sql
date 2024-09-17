create table funcionario (
idfuncionario int not null primary key auto_increment,
nome_funcionario varchar(250) not null,
login varchar(100) not null unique,
senha varchar(8) not null,
roule varchar(50) not null
);