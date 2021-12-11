package decorator.java.decorators;

import java.util.Base64;

// Конкретные декораторы добавляют что-то своё к базовому поведению обёрнутого компонента.
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // 1. Зашифровать поданные данные.
        // 2. Передать зашифрованные данные в метод writeData обёрнутого объекта (wrapper).
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        // 1. Получить данные из метода readData обёрнутого объекта (wrapper)
        // 2. Расшифровать их, если они зашифрованы.
        // 3. Вернуть результат.
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
