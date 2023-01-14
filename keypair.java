public class keypair {
    String classifier;
    int data;
    public keypair(String classifier_, int data_){
        classifier = classifier_;
        data = data_;

    }
    public String getClassifier(){return classifier;
    }
    public int getdata(){return data;}
    public String toString(){
        return "classifer = " +getClassifier() + " data = " + getdata();

    }
}


