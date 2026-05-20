README - Contador de Passos
Sobre o Projeto

O aplicativo Contador de Passos foi desenvolvido no Android Studio utilizando a linguagem Java.

O objetivo do aplicativo é calcular a distância percorrida pelo usuário com base na quantidade de passos informada e no tamanho do passo selecionado.

Funcionalidades
Inserir quantidade de passos
Escolher o tamanho do passo:
Curto
Médio
Longo
Selecionar se estava correndo
Calcular a distância percorrida
Exibir o resultado na tela
Componentes Utilizados
ConstraintLayout
ImageView
TextView
EditText
RadioGroup
RadioButton
CheckBox
Button
Lógica do Sistema

O sistema realiza o cálculo da distância utilizando:

Passo Curto = 0.5 metros
Passo Médio = 0.7 metros
Passo Longo = 1 metro

Caso a opção “Correndo” seja marcada, é acrescentado 10% na distância final.

Tecnologias Utilizadas
Java
Android Studio
XML
Estrutura do Projeto
Java

Responsável pela lógica e cálculos do aplicativo.

Arquivo:

MainActivity.java
XML

Responsável pela interface gráfica.

Arquivo:

activity_main.xml
Objetivo da Atividade

A atividade teve como objetivo praticar:

Desenvolvimento Mobile
Interface gráfica Android
Manipulação de componentes
Estruturas condicionais
Eventos de clique
Cálculos em Java
Autor

Guilherme Silveira Ribeiro

Resultado Esperado

O usuário informa os passos, escolhe o tipo do passo e o aplicativo retorna a distância percorrida em metros.
