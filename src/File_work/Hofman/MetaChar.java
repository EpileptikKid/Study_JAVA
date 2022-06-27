package File_work.Hofman;

public class MetaChar {
    private final String ch;
    private Integer num;
    private MetaChar leftChild = null;
    private MetaChar rightChild = null;

    public String code = "";

    public MetaChar getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MetaChar leftChild) {
        this.leftChild = leftChild;
    }

    public MetaChar getRightChild() {
        return rightChild;
    }

    public void setRightChild(MetaChar rightChild) {
        this.rightChild = rightChild;
    }

    public String getCh() {
        return ch;
    }
    public Integer getNum() {
        return num;
    }
    public MetaChar(String ch, Integer num) {
        this.ch = ch;
        this.num = num;
    }

    public void NumPlus() {
        this.num++;
    }
}
