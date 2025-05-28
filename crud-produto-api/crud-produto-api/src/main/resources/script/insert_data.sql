
INSERT INTO categoria (descricao) VALUES
                                      ('Eletrônicos'),
                                      ('Roupas'),
                                      ('Alimentos'),
                                      ('Móveis'),
                                      ('Brinquedos');


INSERT INTO fornecedor ( nome, email, telefone) VALUES
                                                        ( 'Tech Distribuidora', 'Tech@gamil.com', '(48)91234-5678'),
                                                        ('Moda Fácil', 'modafac@gamil.com', '(48)91234-5678'),
                                                        ('Alimentos Brasil', 'aliBr@gamil.com', '(48)91234-5678'),
                                                        ('Casa Móveis', 'casamovies@gamil.com', '(48)91234-5678'),
                                                        ('Mundo Infantil', 'mundoInfantil@gamil.com', '(48)91234-5678');


INSERT INTO produto (nome, valor, quantidade, descricao, id_categoria, id_fornecedor) VALUES
                                                                                          ('Notebook Dell', 3500.00, 10, 'Notebook 15 polegadas, i7', 1, 1),
                                                                                          ('Camisa Polo', 80.00, 50, 'Camisa polo masculina tamanho M', 2, 2),
                                                                                          ('Arroz Tipo 1', 25.00, 100, 'Pacote de 5kg', 3, 3),
                                                                                          ('Sofá 3 lugares', 1500.00, 5, 'Sofá retrátil e reclinável', 4, 4),
                                                                                          ('Boneca Baby', 90.00, 30, 'Boneca interativa com fala', 5, 5),
                                                                                          ('Smartphone Android', 2200.00, 15, 'Smartphone 128GB, 6GB RAM', 1, 1),
                                                                                          ('Calça Jeans', 120.00, 40, 'Calça jeans feminina', 2, 2),
                                                                                          ('Feijão Carioca', 12.00, 80, 'Pacote de 1kg', 3, 3),
                                                                                          ('Mesa de Jantar', 1800.00, 3, 'Mesa para 6 pessoas', 4, 4),
                                                                                          ('Carrinho de Controle Remoto', 150.00, 20, 'Carrinho elétrico para crianças', 5, 5);
