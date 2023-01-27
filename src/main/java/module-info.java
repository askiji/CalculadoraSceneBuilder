module UltimoTRyEnClase.Calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens UltimoTRyEnClase.Calculadora to javafx.fxml;
    exports UltimoTRyEnClase.Calculadora;
}
