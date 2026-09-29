CREATE TABLE perfil_usuario(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(300) NOT NULL,
    profissao VARCHAR (155) DEFAULT 'desempregado',
    idade INTEGER NOT NULL,
    formacao_academica VARCHAR(150),
    codigo VARCHAR(255) NOT NULL,
    caminho_imagem VARCHAR(500),
    bio VARCHAR(500)
);