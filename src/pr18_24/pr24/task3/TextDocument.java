package pr18_24.pr24.task3;

public class TextDocument implements IDocument {
    @Override
    public void save() {
        // Логика сохранения текстового документа
        System.out.println("Text document saved.");
    }
}
