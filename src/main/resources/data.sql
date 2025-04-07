create table produto (
    id varchar(255) not null primary key,
    nome varchar not null,
    descricao varchar(300),
    preco numeric(18, 2)
)