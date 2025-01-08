# Machine Learning Project: Iris Classifier

This project is a simple **Machine Learning** application written in **Java**, using the **Weka** library. It builds a decision tree model to classify the Iris dataset into three classes: *Iris-setosa*, *Iris-versicolor*, and *Iris-virginica*.

---

## Features
- **Dataset**: Uses the Iris dataset in ARFF format.
- **Model**: Decision tree classifier (J48) from Weka.
- **Output**:
  - Trains a model on the Iris dataset.
  - Saves the trained model as `iris_model.model`.
  - Predicts class labels for each instance in the dataset.

---

## Requirements
### Software
- **Java JDK** (version 8 or above)
- **Weka** (latest version)
- **IDE**: IntelliJ IDEA, Eclipse, or Visual Studio Code (optional)

### Libraries
- `weka.jar` (download from the [Weka Official Website](https://www.cs.waikato.ac.nz/ml/weka/))

---

## Dataset
The Iris dataset is provided in `iris.arff` format. It includes the following attributes:
1. **Sepal length** (numeric)
2. **Sepal width** (numeric)
3. **Petal length** (numeric)
4. **Petal width** (numeric)
5. **Class**: {Iris-setosa, Iris-versicolor, Iris-virginica}

You can find the dataset in the file `iris.arff`.

---

## Installation and Usage

### 1. Clone or Download the Project
```bash
git clone https://github.com/yourusername/iris-classifier-java.git
cd iris-classifier-java
```

### 2. Add weka.jar to the Project
Place the weka.jar file in the project directory.

### 3. Compile and Run
1. Compile the code:
```bash
javac -cp weka.jar IrisClassifier.java
```
2. Run the program:
```bash
java -cp .:weka.jar IrisClassifier
```
(Use ; as a classpath separator on Windows.)

