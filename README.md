Desafio votação BBB back-end 

A ideia geral é separar o processo em dois:

1 - Receber o voto: é a parte delicada que tem que aceitar as milhares de requisições/segundo.

2 - Computar o voto: é a parte que realmente "salva o seu voto no banco de dados".

![image](https://github.com/user-attachments/assets/4c95f20d-4407-4270-858c-ad0f71b7039b)

Desafio:

1 – Crie uma API que receba um voto e publique numa fila e rapidamente retorne algo como "solicitação aceita" (vc não sabe se deu tudo certo, né?).

2 – Crie um processo em plano de fundo que leia dessa fila e salve o voto no banco de dados (ou só memória pra praticar).


