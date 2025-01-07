import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.SerializationHelper;

public class IrisClassifier {
    public static void main(String[] args) {
        try {
            DataSource source = new DataSource("iris.arff");
            Instances dataset = source.getDataSet();
            
            if (dataset.classIndex() == -1) {
                dataset.setClassIndex(dataset.numAttributes() - 1);
            }
            
            Classifier classifier = new J48();
            classifier.buildClassifier(dataset);
            
            SerializationHelper.write("iris_model.model", classifier);
            System.out.println("Model trained and saved successfully.");
            
            Instances testDataset = dataset
            for (int i = 0; i < testDataset.numInstances(); i++) {
                double label = classifier.classifyInstance(testDataset.instance(i));
                System.out.println("Instance " + (i + 1) + ": Predicted = " +
                        testDataset.classAttribute().value((int) label) +
                        ", Actual = " + testDataset.instance(i).stringValue(testDataset.classIndex()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
