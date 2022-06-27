package File_work.Hofman;

public class MetaCharTree {
    private MetaChar root = null;
    private MetaChar[] arrMetaCopy = null;
    private MetaChar[] arrMeta = new MetaChar[0];



    public void addCharacter(String ch) {
        if (this.chekConsist(ch)) {
            this.getPoint(ch).NumPlus();
        } else {
            MetaChar[] arr = new MetaChar[arrMeta.length + 1];
            System.arraycopy(arrMeta, 0, arr, 0, arrMeta.length);
            arrMeta = arr;
            arrMeta[arrMeta.length - 1] = new MetaChar(ch, 1);
        }
    }

    private boolean chekConsist(String ch) {
        for (MetaChar a : arrMeta) {
            if (a.getCh().equals(ch)) {
                return true;
            }
        }
        return false;
    }



    public MetaChar getPoint(String ch) {
        for (MetaChar m : arrMeta) {
            if (m.getCh().equals(ch)) {
                return m;
            }
        }
        return null;
    }

    private MetaChar getMin() {
        int minInd = 0;
        for (int i = 0; i < arrMeta.length; i++) {
            if (arrMeta[i].getNum() < arrMeta[minInd].getNum()) {
                minInd = i;
            }
        }
        MetaChar min = arrMeta[minInd];
        MetaChar[] arr = new MetaChar[arrMeta.length - 1];
        System.arraycopy(arrMeta, 0, arr, 0, minInd);
        if (minInd != arrMeta.length - 1) {
            System.arraycopy(arrMeta, minInd + 1, arr, minInd, arrMeta.length - (minInd + 1));
        }
        arrMeta = arr;
        return min;
    }

    private void addPoint(MetaChar point) {
        MetaChar[] arr = new MetaChar[arrMeta.length + 1];
        System.arraycopy(arrMeta, 0, arr, 0, arrMeta.length);
        arrMeta = arr;
        arrMeta[arrMeta.length - 1] = point;
    }

    private void deleteDoubleMin() {
        MetaChar m1 = this.getMin();
        MetaChar m2 = this.getMin();
        MetaChar m12 = new MetaChar(m1.getCh() + m2.getCh(), m1.getNum() + m2.getNum());
        m12.setLeftChild(m1);
        m12.setRightChild(m2);
        this.addPoint(m12);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (MetaChar m : arrMetaCopy) {
            s.append("char - ").append(m.getCh()).append(", num - ").append(m.getNum()).append(", code - ").append(m.code).append(";\n");
        }
        return s.toString();
    }


    public void deleteWhile() {
        arrMetaCopy = arrMeta;
        while (arrMeta.length != 1) {
            this.deleteDoubleMin();
        }
        root = arrMeta[0];
    }

    private String Code(MetaChar start, MetaChar finish) {
        String s = "";
        if (start != finish) {
            if (start.getLeftChild().getCh().contains(finish.getCh())) {
                s += "0" + this.Code(start.getLeftChild(), finish);
            } else {
                s += "1" + this.Code(start.getRightChild(), finish);
            }
        }
        return s;
    }

    public void setCode() {
        for (MetaChar m : arrMetaCopy) {
            m.code = this.Code(root, m);
        }
    }
}
