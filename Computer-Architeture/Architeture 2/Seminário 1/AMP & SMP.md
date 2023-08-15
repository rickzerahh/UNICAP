**Arquitetura AMP ( Asymmetric Multiprocessing ) e SMP ( Symmetric Multiprocessing )**
----------------------

**_CONCEITO TAXONOMIA DE FLYNN_**

```
Taxonomia de Flynn: A Taxonomia de Flynn é uma classificação que define quatro tipos diferentes de arquiteturas de processadores, 
com base no número de fluxos de instruções (I) e fluxos de dados (D) sendo processados simultaneamente. Esses tipos são: 
SISD (Single Instruction, Single Data), SIMD (Single Instruction, Multiple Data), MISD (Multiple Instruction, Single Data) e 
MIMD (Multiple Instruction, Multiple Data).
```

_Taxonomia de Flynn:_

```
AMP é uma arquitetura onde cada processador é projetado para executar tarefas específicas e independentes, geralmente com 
diferentes  níveis de desempenho e/ou características. Cada processador pode executar seu próprio conjunto de instruções e 
manipular seus próprios dados, sem compartilhar instruções ou dados com os outros processadores. Já o SMP uma arquitetura 
onde todos os processadores têm acesso aos mesmos conjuntos de instruções e dados, e todos os processadores executam as mesmas 
instruções, mas podem operar em dados diferentes. Os processadores em um sistema SMP são considerados iguais em termos de 
poder de processamento e capacidade, e podem executar qualquer tarefa em qualquer momento.
```

_Organização de processadores:_

```
Em um sistema AMP, cada processador pode ter sua própria memória, barramento de sistema e subsistema de E/S. Os processadores 
podem ter diferentes capacidades de desempenho, e a comunicação entre os processadores pode ser realizada através de interfaces 
específicas de comunicação, como barramentos de comunicação ou redes interconectadas. Já em um sistema SMP, todos os processadores 
compartilham a mesma memória, barramento de sistema e subsistema de E/S. Isso significa que todos os processadores têm acesso 
direto à mesma memória e podem executar instruções e operar em dados armazenados nessa memória. A comunicação entre os 
processadores em um sistema SMP é geralmente mais rápida e eficiente, pois não requer a transferência de dados através de 
interfaces de comunicação dedicadas.
```

_Aspectos de paralelismo:_

```
Em um sistema AMP, cada processador executa tarefas independentes e específicas, sem compartilhar instruções ou dados com os 
outros processadores. Isso permite uma alta flexibilidade na execução de tarefas, mas pode resultar em desequilíbrio de carga e 
ineficiências em sistemas onde as tarefas não são distribuídas uniformemente entre os processadores. Em um sistema SMP, todos os 
processadores executam as mesmas instruções, mas podem operar em dados diferentes. Isso permite uma maior sincronização e 
cooperação entre os processadores, o que pode resultar em uma melhor utilização dos recursos do sistema e em uma distribuição mais 
uniforme de tarefas. No entanto, o paralelismo em sistemas SMP pode ser limitado pela dependência de instruções e dados 
compartilhados, o que pode resultar em gargalos de desempenho e overhead de comunicação entre os processadores.
```

_Eficiência Energética:_

```
Em um sistema AMP, como cada processador pode ter suas próprias características de desempenho e capacidades, é possível otimizar 
a eficiência energética de cada processador de forma independente. Por exemplo, processadores de baixo consumo de energia podem 
ser usados para tarefas mais simples ou em modo de espera, enquanto processadores de alto desempenho podem ser usados para tarefas 
mais intensivas em computação. Em um sistema SMP, a eficiência energética pode ser mais desafiadora, uma vez que todos os 
processadores compartilham a mesma memória e barramento de sistema. Isso pode levar a um consumo de energia maior devido à 
necessidade de sincronização e comunicação entre os processadores. No entanto, técnicas de gerenciamento de energia, como a 
desativação de processadores ociosos e o controle dinâmico de frequência e tensão, podem ser aplicadas para melhorar a eficiência 
energética em sistemas SMP.
```

_Refrigeração e Confiabilidade:_

```
Em um sistema AMP, como cada processador pode ter suas próprias características de desempenho e capacidades, pode ser mais fácil 
gerenciar a dissipação de calor de forma localizada, usando técnicas de refrigeração adequadas em cada processador 
individualmente. Além disso, a confiabilidade dos componentes também pode ser gerenciada de forma individualizada em cada 
processador, permitindo a substituição ou manutenção de componentes específicos sem afetar o funcionamento dos outros 
processadores. Em um sistema SMP, a refrigeração e confiabilidade podem ser mais desafiadoras, uma vez que todos os processadores 
compartilham a mesma memória e barramento de sistema. Isso pode levar a uma maior concentração de calor em determinadas áreas do 
sistema e requerer técnicas de refrigeração mais avançadas, como resfriamento líquido ou dissipadores de calor maiores. 
Além disso, a confiabilidade dos componentes pode ser mais crítica em sistemas SMP, uma vez que a falha de um componente pode 
afetar o funcionamento de todos os processadores no sistema.
```

_Código Aberto ou Fechado:_

```
A arquitetura AMP pode ser implementada tanto em sistemas de código aberto quanto fechado, dependendo dos componentes e 
tecnologias utilizadas. Por exemplo, sistemas baseados em processadores RISC-V, que é uma arquitetura de código aberto, 
podem ser usados em sistemas AMP. No entanto, também existem sistemas AMP baseados em arquiteturas fechadas, como processadores 
ARM ou x86, que são amplamente utilizados em dispositivos comerciais. A arquitetura SMP também pode ser implementada em sistemas 
de código aberto ou fechado, dependendo das escolhas feitas pelos fabricantes e desenvolvedores. Por exemplo, sistemas baseados 
em processadores x86, que é uma arquitetura fechada, são amplamente utilizados em servidores e estações de trabalho comerciais. 
No entanto, também existem sistemas SMP baseados em arquiteturas de código aberto, como o OpenPOWER, que é uma arquitetura 
aberta baseada em processadores POWER.
```

_Desempenho:_

```
Em termos de desempenho, a arquitetura SMP oferece melhor desempenho do que a arquitetura AMP. Isto é porque
A arquitetura SMP permite que vários processadores ou núcleos acessem uma única memória compartilhada e barramento do
sistema, o que permite uma melhor coordenação e sincronização entre os processadores. Em contraste, a arquitetura AMP opera
com elementos de processamento separados ou núcleos que operam independentemente, que podem não ser otimizados para desempenho.
```

_Sincronismo:_

```
A arquitetura SMP oferece melhor previsibilidade de tempo do que a arquitetura AMP. Isso ocorre porque o SMP
arquitetura é projetada para sincronizar vários processadores ou núcleos, o que permite um melhor controle sobre o tempo
e sincronização. Em contraste, a arquitetura AMP opera de forma independente, o que pode resultar em imprevisíveis
comportamento do tempo.
```

_Concorrência por Recursos:_

```
Na arquitetura SMP, todos os processadores ou núcleos competem por recursos compartilhados como memória e interfaces 
de E/S, o que pode resultar em contenção de recursos e degradação do desempenho. Em contraste,na arquitetura AMP, 
cada elemento ou núcleo de processamento opera de forma independente e possui recursos próprios, que reduz a 
competição por recursos.
```

_Comunicação entre Processos e Processadores:_

```
Na arquitetura AMP, a comunicação entre elementos de processamento ou núcleos é normalmente executado usando passagem de 
mensagem, que pode ser menos eficiente do que a comunicação de memória compartilhada usada na arquitetura SMP. 
Isso ocorre porque a passagem de mensagens requer sobrecarga adicional para a criação de mensagens, transmissão e recepção. 
Em contraste, na arquitetura SMP, os processos podem se comunicar uns com os outros usando memória compartilhada, 
que fornece comunicação mais rápida e eficiente.
```

_Gerenciamento de Recursos:_

```
Em termos de logística e aspectos de gestão de recursos, o SMP a arquitetura requer hardware e software mais complexos 
do que a arquitetura AMP. Isso ocorre porque a arquitetura SMP requer um sistema de memória compartilhada, que requer 
componentes adicionais de hardware e software, como memória controladores, caches de memória e mecanismos de sincronização.
Em contraste, a arquitetura AMP é mais simples e requer componentes de hardware e software menos complexos.
```

_Resumo Final:_

```
Em resumo, a arquitetura SMP fornece melhor desempenho e previsibilidade de tempo, mas pode resultar em perda de recursos
contenção e requer hardware e software mais complexos. A arquitetura AMP é mais simples e tem menos concorrência
para recursos, mas pode resultar em comunicação menos eficiente e menos otimização de desempenho. Em última análise, o
a escolha entre a arquitetura AMP e SMP depende dos requisitos e restrições específicos do sistema sendo projetado.
```

**A DIFEREÇA ENTRE AS DUAS ARQUITETURAS**

```
A diferença entre a arquitetura AMP (Multiprocessamento Assimétrico) e SMP (Multiprocessamento Simétrico)
reside na forma como os elementos ou núcleos de processamento são conectados e como eles compartilham os recursos do sistema.

Na arquitetura AMP, cada elemento ou núcleo de processamento é projetado para executar uma tarefa específica ou conjunto de 
tarefas e eles operam independentemente sem qualquer memória compartilhada ou barramento de sistema. Nesta arquitetura, cada 
processamento elemento tem sua própria memória, interfaces de E/S e recursos do sistema, e eles se comunicam entre si
através de um mecanismo de comunicação como a passagem de mensagens.

Em contraste, a arquitetura SMP é projetada para maximizar o desempenho do sistema, permitindo que vários processadores
ou núcleos para acessar uma única memória compartilhada e barramento do sistema. Na arquitetura SMP, cada elemento de 
processamento tem igual acesso aos recursos do sistema, e eles podem se comunicar uns com os outros através da memória 
compartilhada. Isso significa que todos os elementos ou núcleos de processamento podem trabalhar juntos em uma única 
tarefa ou conjunto de tarefas, o que permite uma melhor desempenho e escalabilidade.

Uma das principais vantagens da arquitetura AMP é sua simplicidade, que permite a fácil integração de novos processamentos
elementos ou núcleos no sistema. Além disso, como cada elemento de processamento opera de forma independente, a falha de
um elemento de processamento não afeta a operação dos outros elementos de processamento.

Por outro lado, a arquitetura SMP oferece melhor desempenho e escalabilidade, pois permite processamento múltiplo
elementos para trabalhar juntos em uma única tarefa. Essa arquitetura é comumente usada em processadores multi-core modernos,
onde vários núcleos compartilham um cache comum e um controlador de memória.

Em resumo, a diferença entre a arquitetura AMP e SMP está na forma como os elementos ou núcleos de processamento são
conectados e como eles compartilham recursos do sistema. Embora o AMP seja simples e permita a fácil integração de novos processos 
de processamento elementos, o SMP fornece melhor desempenho e escalabilidade, permitindo que vários processadores acessem um único
memória e barramento do sistema.
```

_Resumo Breve das duas Arquiteturas:_

```
A arquitetura AMP é caracterizada pelo uso de diferentes tipos de processadores ou núcleos de processamento com capacidades 
diferentes em um sistema multiprocessado. Cada processador ou núcleo pode ser otimizado para executar tarefas específicas e 
pode ter diferentes níveis de desempenho, recursos e consumo de energia. Isso permite a especialização dos processadores em 
funções específicas, como processamento de gráficos, processamento de sinal, controle de periféricos, entre outros. 
No entanto, a comunicação e coordenação entre os diferentes processadores pode ser mais complexa devido às diferenças de 
arquitetura, e a distribuição de carga de trabalho entre os processadores pode ser desafiadora.

Por outro lado, a arquitetura SMP é caracterizada pelo uso de múltiplos processadores ou núcleos de processamento idênticos, 
que compartilham a mesma memória e são capazes de executar a mesma instrução ao mesmo tempo. Isso permite uma distribuição 
mais uniforme da carga de trabalho entre os processadores e uma coordenação mais simples, já que todos os processadores têm 
a mesma arquitetura e recursos. No entanto, a gestão de recursos, como acesso à memória compartilhada e coordenação de 
acesso a dispositivos periféricos, pode ser mais complexa devido à natureza compartilhada dos recursos.

Em resumo, a arquitetura AMP é caracterizada pela utilização de processadores ou núcleos de processamento com capacidades 
diferentes, otimizados para funções específicas, enquanto a arquitetura SMP utiliza múltiplos processadores ou núcleos de 
processamento idênticos que compartilham a mesma memória e executam a mesma instrução. A escolha entre AMP e SMP dependerá 
das necessidades específicas de um sistema multiprocessado, levando em consideração fatores como a natureza das tarefas a 
serem executadas, a coordenação de recursos, a distribuição de carga de trabalho e a eficiência do sistema como um todo.
```

- Ricardo André, 2023.
