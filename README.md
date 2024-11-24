# ClassDiagram-javaConsole

## Description

ClassDiagram-javaConsole est une application console Java qui permet de générer des diagrammes de classes à partir de fichiers d'entrée et de les convertir en formats PDF ou image (PNG). L'application utilise la bibliothèque Apache PDFBox pour créer des fichiers PDF contenant des images de diagrammes.

## Résultat 

Lors de l'exécution de l'application, les fichiers PDF générés à partir des diagrammes de classes seront enregistrés dans le répertoire suivant :

<chemin_du_projet>/src/main/resources/outputPdf/

## Installation

### Prérequis

Assurez-vous que vous avez les éléments suivants installés sur votre système :

- **Java Development Kit (JDK)** : Vous pouvez télécharger et installer le JDK à partir du site officiel : [JDK Download](https://www.oracle.com/java/technologies/javase-downloads.html).

### Installation du fichier JAR

1. Téléchargez le fichier JAR de l'application **ClassDiagram-javaConsole** dans le répertoire de votre choix.
   
2. Si vous utilisez **Maven** ou **Gradle**, vous pouvez également cloner le dépôt GitHub et compiler le projet en local.

### Exécution de l'application

1. Ouvrez un terminal ou une invite de commande.

2. Allez dans le répertoire où se trouve le fichier **ClassDiagram-javaConsole.jar**.

3. Exécutez le fichier JAR avec la commande suivante :

    ```bash
    java -jar ClassDiagram-javaConsole.jar
    ```

Cela démarrera l'application, vous permettant de générer des diagrammes de classes.

## Comment Contribuer à ce Projet

### Forker le dépôt :

1. Allez sur le dépôt GitHub du projet.
2. Cliquez sur le bouton **Fork** en haut à droite de la page du dépôt pour créer une copie (fork) du projet dans votre compte GitHub.

### Cloner votre fork :

1. Ouvrez un terminal ou Git Bash.
2. Clonez votre fork localement en utilisant la commande suivante :

    ```bash
    git clone https://github.com/your-username/ClassDiagram-javaConsole.git
    ```

   Remplacez `your-username` par votre nom d'utilisateur GitHub.

### Créer une branche :

1. Allez dans le répertoire du projet cloné :

    ```bash
    cd ClassDiagram-javaConsole
    ```

2. Créez une nouvelle branche pour vos modifications :

    ```bash
    git checkout -b votre-nom-de-branche
    ```

   Remplacez `votre-nom-de-branche` par un nom descriptif pour votre branche.

### Effectuer des modifications :

1. Faites les modifications nécessaires ou ajoutez de nouvelles fonctionnalités à votre branche.

### Commiter les modifications :

1. Ajoutez vos modifications à l'index :

    ```bash
    git add .
    ```

2. Commitez vos modifications avec un message significatif :

    ```bash
    git commit -m "Description des modifications"
    ```

### Pousser vos modifications :

1. Poussez vos modifications vers votre dépôt forké sur GitHub :

    ```bash
    git push origin votre-nom-de-branche
    ```

### Créer une Pull Request (PR) :

1. Allez sur la page GitHub de votre fork.
2. Cliquez sur **Compare & Pull Request**.
3. Créez la Pull Request pour proposer vos modifications au projet principal.

---

## License

Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.

