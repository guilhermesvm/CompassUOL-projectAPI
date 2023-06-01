<div align="center">
    <img src="Img/dia7.png" alt="BannerDia7" width="700px" height="263px">
    <h1> Dia 7 </h1>
    <p>Curso em Vídeo (Java) - Ep.1 ao 5</p>
</div>

# ☕ História do Java (Ep. 1)
A linguagem Oak foi criada pelo Green Team da Sun Microsystems, que mais tarde foi nomeada Java. O objetivo inicial do projeto era de antecipar as tendências tecnológicas futuras e a proporcionar interação da linguagem com coisas externas. Exemplos de utilização do Java: Kindle, apps de smartphone, telas de menu de blu-ray CD, smartwatches, etc..

# 🔧 Funcionamento do Java (Ep. 2)
Um código gerado por um compiltador java (JavaC) chama-se ByteCode e o computador não lê, sendo necessário passar pelo JVM (Java Virtual Machine) antes de chegar ao sistema.

WORA (Write Once, Run Everyhere) - refere-se á habilidade da lingaugem de ser escrita e compilada uma vez só, podendo funcionar em qualquer dispositivo que possua uma JVM.

## JRE e JDK
**JRE (Java Runtime Enviroment)**: Serve para quem quer executar o java.
- JVM:
  - **Loader**: carrega o ByteCode na memória da JVM.
  - **Verificador**: verifica se essse código pode ser executado.
  - **Interpretador**: transforma o código em ByteCode em código nativo para o sistema compreender.
  - **Gerenciador de Memória**: Trata como códigos e variáveis vão ser gerenciadas na memória da JVM.
  - **Compilador JIT (Just In Time)**: surge para aumentar a performance.

- Bibliotecas: APIs que podem ser usadas para tornar o programa mais atrativo e mais funcional.

**JDK (Java Development Kit):** Serve para quem quer desenvolver com java.
- JRE
- JavaLang (linguagem)
- JavaTools
  - JavaC
  - Debugger
  - APIs de desenvolvimento
- IDE

> APIs são mecanismos que permitem que dois componentes de software se comuniquem usando um conjunto de definições e protocolos. Por exemplo, o sistema de software do instituto meteorológico contém dados meteorológicos diários. A aplicação para a previsão do tempo em seu telefone “fala” com esse sistema por meio de APIs e mostra atualizações meteorológicas diárias no telefone.


# 🤖 Instalação do JDK/Netbeans/SceneBuilder (Ep. 3)
Nesta vídeo aula foi ensinado a como baixar o JDK, IDE NetBeans e o Java Scene Builder.

| Tipos  de JDK         |                                                                                                         | 
|-----------------------|---------------------------------------------------------------------------------------------------------|
|SE (Standard Edition)  | Usado para desenvolver aplicações (janelas, ambientes, controle de sistemas de interface gráfica)       |
|EE (Enterprise Edition)| Usado para desenvolver aplicações + acesso remoto e acesso à banco dedados (mais utilizado por empresas)|
|ME (Micro Edition)     | Usado para desenvolver aplicações menoras (aplicações p smartphones, smartwatches, etc...)              |

# 👨‍💻 Primeiro Programa em Java (Ep. 4)
Nesse episódio foi abordado os comandos e parâmetros iniciais do Java:
- **package**: Namespace usado para organizar um conjunto de interfaces e classes relacionadas
- **class**: Declara uma classe em java.
- **public**: Significa que é visível para todos.
- **static**: É  um método estático, ou seja, não é necessário criar um objeto para invocá-lo.
- **void**: É um tipo de retorno de método. Significa que não retorna nenhum valor.
- **main**: Representa o ponto de início do programa.
- **String args[]**: É usado para argumento de linha de comando
- **out.println()**: É usada imprimir declarações. System é uma class, out é o objeto da classe PrintStream, print() é o método da classe PrintStream.

**psvm + TAB** - automação do comando: ```public static void main(String[] args) {}```<br>
**sout + TAB** - automação do comando: ``` System.out.println("Hello World");```

- [x] MinhaClasse (CamelCase) - 1ª letra em maíusculo indica classse.<br>
- [x] minhaClasse - 2ª indica atributo, variável ou método.<br>
- [x] minhaclasse - todas minúsculas indica um pacote. <br>
- [x] MINHACLASSE - todas maíusculas indica uma constante. <br>


# 📚 Introdução ao JavaFX e Swing (Ep. 5)
Biblioteca de Pacotes já presentes no Java:
 - Java.**applet**: criação de aplicativos
 - Java.**util**: utilitários (ex: monitoramento de entrada)
 - Java.**math**: operações matemáticas
 - Java.**net**: redes
 - Java**x.sound**:  sons
 - Java**x.media**
 - Java**x.swing**
 - Java**Fx.fxml**

## Biblioteca "Swing"
Permite a criação de interface gráficas para ambientes com janelas.
> Create Project -> Java with Ant -> Java Application <br>
> Create File-> Swing GUI Forms -> JFrame Form

- **extends**: herda características do JFrame.<br>
- **private**: encapsulamento. <br>
- **ActionPerformed**: método/ação realizada ao clicar.<br>
- **setText**: método do objeto que modifica o texto.<br>

```
public class TelaSwing extends java.swing.JFrame{    
  private javax.swing.JButton btnBotao;     
  private javax.swing.JLabel lblMensagem;

  private void btnBotaoActionPerformed(java.awt.event.ActionEvent evt){   
        lblMensagem.setText("Olá Mundo");
  }
}
```

## Biblioteca "JavaFX"
Nesta parte foi ensinado à criar uma interface usando JavaFX no Java Scene Builder.
> Create Project -> Java with Ant -> JavaFX -> JavaFX Application

**implements**: remete à interfaces.<br>
```
import javafx.fxml.FXML
public class FXMLDocumentController
            implements Initializable {
  @FXML
  private Button btnBotao;
  private Label lblMensagem;

  @FXML
  private void clicouBotao(ActionEvent event){
        lblMensagem.setText("Olá Mundo");
            }
        }
```
## Como transformar um arquivo em ByteCode?
> Shift + F11
