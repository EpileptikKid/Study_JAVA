package AbstractImadinaryNumbers;

public abstract class AbstractPutativeNumbers {

    // Уведомляет об ошибке в случае нулевого размера недействительной части числа
     public static class ZeroException extends RuntimeException {
         private final double realNumber;

         // Конструктор исключения принимающий и сохраняющий действительную часть числа
         public ZeroException(double realNumber) {
             this.realNumber = realNumber;
         }

         // Возвращает действительную часть числа
         public double getRealNumber() {
             return realNumber;
         }
     }

    // Абстрактньіе методьі

    // Обеспечивают доступ к действительной и воображаемьім частям числа
    public abstract double getR();
    public abstract double getU();

    // Обеспечивает изменение значений действительной и воображаемой частей числа
    public abstract void setR(double R);
    public abstract void setU(double U);

    // Фабричньій метод создающий єкземпляр обьекта класса производньій от Abstract PutativeNumbers
    public abstract AbstractPutativeNumbers create(double R, double U) throws ZeroException;

    // Реализованньіе методьі

    // Возвращает строковое представление числа
    @Override
    public String toString() {
        if (getU() < 0) {
            return getR() + " - " + Math.abs(getU()) + "i\n";
        } else {
            return  getR() + " + " + getU() + "i\n";
        }
    }

    // Вьічисляет произведение двух чисел
    public static AbstractPutativeNumbers multiply(AbstractPutativeNumbers fist, AbstractPutativeNumbers two) {
        return fist.create(fist.getR() * two.getR() - fist.getU() * two.getU(), fist.getR() * two.getU() + fist.getU() * two.getR());
    }

    // Вьічисляет сложение двух чисел
    public static AbstractPutativeNumbers add(AbstractPutativeNumbers first, AbstractPutativeNumbers two) {
        return first.create(first.getR() + two.getR(), first.getU() + two.getU());
    }
}
