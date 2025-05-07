create database if not exists db_estoque;

use db_estoque;

create table categoria(
	id int not null auto_increment,
    descricao varchar(50) not null,
    constraint pk_categoria
		primary key(id)
)engine = InnoDB;

create table produto (
                         id int not null auto_increment,
                         nome varchar(150) not null,
                         valor decimal(10,2) not null,
                         quantidade int not null,
                         descricao varchar(150),
                         constraint pk_produto
                             primary key (id)
)engine = InnoDB;