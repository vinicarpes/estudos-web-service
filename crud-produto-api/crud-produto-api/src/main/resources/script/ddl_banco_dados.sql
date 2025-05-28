create database if not exists db_estoque;

use db_estoque;

create table categoria(
	id int not null auto_increment,
    descricao varchar(50) not null,
    constraint pk_categoria
		primary key(id)
)engine = InnoDB;

create table fornecedor (
                            id int not null auto_increment,
                            nome varchar(255),
                            email varchar(255),
                            telefone varchar(12),
                            primary key (id)
)engine =innodb;

create table produto (
    id int not null auto_increment,
    nome varchar(150) not null,
    valor decimal(10,2) not null,
    quantidade int not null,
    descricao varchar(150),
    id_categoria int not null,
    id_fornecedor int not null,
    constraint pk_produto primary key (id),
    constraint fk_forncedeor foreign key (id_fornecedor) references fornecedor(id),
    constraint fk_categoria foreign key (id_categoria) references categoria(id)
)engine = InnoDB;

