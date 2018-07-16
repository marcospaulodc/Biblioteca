Marcos Paulo de Castro

1- Execute o trabalho da seguinte forma:
   1.1 - Execute a classe BibliotecaServer para levantar o processo do Servidor de Aplicação da biblioteca.
   1.2 - Execute a classe BibliotecaCliente para iniciar o processo do cliente, com isso será iniciado um menu com as opções disponíveis através do componente JOptionPane. Escolhi o JOptionPane para deixar o programa mais elegante e atrativo para os usuários.
	
2- As classes e métodos mais complexos estão devidamente comentados, a fim de obter um melhor entendimento do funcionamento do programa.


Descrição sucinta do programa

Após inicialização do servidor de aplicação e do cliente, o usuário tem as opções disponíveis para inserção, consulta, remoção, listagem e alteração de livros. O usuário informa os parâmetros, porém os métodos invocados na classe Cliente são processados diretamente no servidor através da comunicação por RMI. Com isso é aberto um leque para criação de programas parrudos, onde os mesmos requerem alto processamento computacional. A fim de obter um programa com tolerância à falhas, foram tratados os possíveis erros, garantindo assim o funcionamento conforme do programa.

