public enum InstrumentType {
    STRING("String"),
    WOODWIND("Woodwind"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard"),
    BRASS("Brass");

    private String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
