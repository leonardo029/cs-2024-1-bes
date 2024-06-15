2. Solicita-se o estudo deste material e fazer o seguinte exercício:

   2.1. Definir uma expressão regular para validar um login que possua as seguintes restrições:

        2.1.1 Possuir tamanho T, onde 5 <= T <= 30;

        2.1.2 Possuir letras, números e caracteres especiais.
    
    Resposta: "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%&*()-+.,;?{[}]^><:])[a-zA-Z0-9!@#$%&*()-+.,;?{[}]^><:]{5,30}"

   2.2 Definir uma expressão regular para validar uma senha que possua as seguintes restrições:

        2.2.1 Possuir tamanho T, onde 8 <= T <= 12;

        2.2.2 Possuir letras, números e caracteres especiais.

        2.2.3 Possuir pelo menos uma letra maiúscula, um número e uma caracter especial.
    
    Resposta: "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&*()-+.,;?{[}]^><:])[a-zA-Z0-9!@#$%&*()-+.,;?{[}]^><:]{8,12}"