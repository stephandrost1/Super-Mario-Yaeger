module Super.Mario.Yaeger {
    requires hanyaeger;

    exports org.example;

    opens backgrounds;
    opens audio;
    opens fonts;
    opens sprites.characters;
}