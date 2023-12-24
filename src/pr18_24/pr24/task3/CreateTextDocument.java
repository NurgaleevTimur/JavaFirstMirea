package pr18_24.pr24.task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        // Ћогика создани€ нового текстового документа
        System.out.println("Creating a new text document.");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        // Ћогика открыти€ существующего текстового документа
        System.out.println("Opening an existing text document.");
        return new TextDocument();
    }
}
