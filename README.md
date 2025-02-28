## Principe d'inversion de contrôle
Dans ce Tp nous avons mis en application le principe d'injection des dépendances a travers une  petite  applicain calculatrice. Le but est de proposer une application fermée  à la modification et ouverte  à l'extension. Pour cela nous  optons  pour un couplage faible plutôt qu'un couplage fort en dépendant des interface plutôt que des classes.  Nous   partons initilalement avec une première version et nous allons essayer de  d'ajouter de nouvelles fonctionnalites sans modifier   les classe de départ pour mettre en  évidence le principe de fermerture   à  la modificaion  et l'ouverture   à  l'extension.   Nous avons la  conception  suivante : 

## Conception de l'application.

![image de la conception](https://github.com/Believer2001/TP1_Inversion_de_Controle/raw/dynamique/src/main/img.png)

### Structure et organisation du  projet. 
Nous avons commencer par  des fonctionnalités basiques  qui est l'implémentation de l injection des dépendances  par instannciation statique qui  est héberger sur cette présente branche **master**. Ensuite , une deuxième version qui sera la mise en évidence du principe d'injection des dépendances par instanciation dynamique en utilisant un fichier de configuration il est dans la branche **dynamique** . Après nous avons fait la même chose  en utilisant le framework spring  notament une version **XML** et une version **anotaion** cette version est dans la branche **FrameWorkSpring**. 

-  **Implémentatioon de la l'injection des dépendances par instanciation Dynamique**
  
-  **Implémentation de l'injection des dépendances par instanciation  par  statique**
  
-  **Implémenttation de l'injection des dépendances en utilisant le Frame Spring notament***:
   - Version  XML
   - Version anotation

Nous avons terminé par un  Mini Projet (Framework Injection des dépendance)  dans lequel nous avons développé un mini Framework qui permet de faire l'injection des dépendances avec ses deux version XML et Annotations. Nous avons la conception suivante : 

 ![image de conception de dependence](./)
 
Nous créons  un mini Framework d'injection des dépendances similaire à Spring IOC. Le Framework  permet à un programmeur de faire l'injection des dépendances entre les différents composant de son application respectant les possibilités suivantes : 

- **1- A travers un fichier XML de configuration en utilisant Jax Binding (OXM : Mapping Objet XML)**
- **2- En utilisant les annotations**
- **3- Possibilité d'injection via :**
    **a- Le constructeur**
    **b- Le Setter**
    **c- Attribut (accès direct à l'attribut : Field)**
    
