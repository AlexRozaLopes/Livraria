-- CREATE DATABASE Livraria;
--
-- CREATE SCHEMA livraria;

CREATE TABLE livro(
    ID INTEGER NOT NULL PRIMARY KEY,
    TITULO VARCHAR,
    AUTOR VARCHAR
);
CREATE TABLE usuario(
    ID INTEGER NOT NULL PRIMARY KEY,
    NOME VARCHAR(80),
    EMAIL VARCHAR(80)

);
CREATE TABLE comentario(
    ID INTEGER NOT NULL PRIMARY KEY,
    AVALIACAO SMALLINT,
    DESCRICAO VARCHAR(255),
    CRIACAO TIMESTAMP,
    ID_USUARIO INTEGER,
    ID_LIVRO INTEGER,

    CONSTRAINT FK_COMENTARIO_USUARIO
        FOREIGN KEY(ID_USUARIO)
        REFERENCES usuario(ID),
    CONSTRAINT FK_COMENTARIO_LIVRO
        FOREIGN KEY(ID_LIVRO)
        REFERENCES livro(ID)
);
-- criação de sequence
select * from livro;
select * from comentario;
create sequence livro_seq;
create sequence comentario_seq;
create sequence usuario_seq;

select currval('livro_seq');
select currval('comentario_seq');
select currval('usuario_seq');
-- alterar o valor inicial da sequencia
select setval('livro_seq', 3, true);
select setval('comentario_seq', 1, true);

insert into livro (id, titulo, autor) values (nextval('comentario_seq'), 'Teste titulo', 'Teste autor');
insert into comentario (id, avaliacao, descricao, id_livro) values (nextval('comentario_seq'), 4, 'Bom livro', 1);