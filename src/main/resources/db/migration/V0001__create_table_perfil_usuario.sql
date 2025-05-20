CREATE TABLE perfil_usuario(
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    profissao VARCHAR (155) DEFAULT 'desempregado',
    idade INTEGER NOT NULL,
    formacao_academica VARCHAR(150),
    codigo VARCHAR(255) NOT NULL,
    caminho_imagem VARCHAR(255),
    descricao VARCHAR(500)
);