CREATE TABLE perfil-pessoa(
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    profissao VARCHAR (255) DEFAULT 'desempregado',
    idade INTEGER NOT NULL,
    descricao TEXT
);