# soat-fastfood

Com estas instruções você poderá obter uma cópia do projeto na sua máquina local para fins de desenvolvimento e teste.

1- Faça o clone do projeto através do link -> https://github.com/fa-sousa/soat10-fastfood

2- Na sua IDE de preferência, você deverá importar e abrir o projeto.

3- Com o Docker Desktop(para Windows) ou Whaler(para Ubuntu) já instalado e configurado, você deverá visualizar o container Soat-fastfood

4- No terminal da sua máquina ou IDE, digite o comando: docker compose build

5- Após conclusão do build, digite o comando: docker compose up. Neste momento a aplicação deverá aparecer com status "Running"

6- Faça uma requisição do tipo GET com a url como por exemplo: http://localhost:8080/api/client

7- Abra uma página web com o link http://localhost:8080/swagger-ui/index.html para visualização do Swagger.