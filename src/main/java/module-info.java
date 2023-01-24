module UltimoTRyEnClase.Calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens UltimoTRyEnClase.Calculadora to javafx.fxml;
    exports UltimoTRyEnClase.Calculadora;
}
