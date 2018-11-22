package by.bsuir.yaremchuk.task13.programmerBook;

public class ProgrammerBook {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook)obj;
        if (level != programmerBook.level) {
            return false;
        }
        if (language == null) {
            return (language == programmerBook.language);
        } else {
            if (!language.equals(programmerBook.language)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 31 * level +
                ((language == null) ? 0 : language.hashCode());
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language = " + language +
                "level = " + level +
                "}";
    }
}
