create
database if not exists db_estoque;

use
db_estoque;

create table categoria
(
    id        int         not null auto_increment,
    descricao varchar(50) not null,
    constraint pk_categoria
        primary key (id)
)engine = InnoDB;

create table produto
(
    id           int            not null auto_increment,
    nome         varchar(150)   not null,
    valor        decimal(10, 2) not null,
    quantidade   int            not null,
    descricao    varchar(150),
    id_categoria int            not null,
    constraint pk_produto
        primary key (id),
    foreign key (id_categoria) references categoria (id)
)engine = InnoDB;

INSERT INTO `db_estoque`.`categoria` (`descricao`)
VALUES ('ELETRONICOS');
INSERT INTO `db_estoque`.`categoria` (`descricao`)
VALUES ('VESTUARIO');
INSERT INTO `db_estoque`.`categoria` (`descricao`)
VALUES ('ELETRODOMESTICOS');


INSERT INTO `db_estoque`.`produto` (`nome`, `valor`, `quantidade`, `descricao`, `id_categoria`) VALUES ('CAMISETA', '199', '22', 'POLO', '2');
INSERT INTO `db_estoque`.`produto` (`nome`, `valor`, `quantidade`, `descricao`, `id_categoria`) VALUES ('THINKPAD', '4599', '10', 'NOTEBOOK', '1');
INSERT INTO `db_estoque`.`produto` (`nome`, `valor`, `quantidade`, `descricao`, `id_categoria`) VALUES ('PRINGLES SORTIDO', '12.99', '200', 'BATATINHAS', '4');
