CREATE DATABASE empresa;

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    cidade VARCHAR(255) NOT NULL
);

INSERT INTO clientes (nome, cpf, cidade) VALUES
('João Silva', '12345678901', 'São Paulo'),
('Ana Oliveira', '65432198701', 'Salvador'),
('Carlos Santos', '12378945601', 'Curitiba'),
('Isabela Rodrigues', '45698712301', 'Fortaleza'),
('Ricardo Alves', '98712345601', 'Porto Alegre'),
('Juliana Lima', '32165498701', 'Recife'),
('Fernando Costa', '65498732101', 'Brasília'),
('Camila Silva', '78932165401', 'Manaus'),
('Maria Santos', '98765432101', 'Rio de Janeiro'),
('Pedro Almeida', '45678912301', 'Belo Horizonte');
