class mainMethod{
    public static void main(String[] args) {
        writeFile writeObject = new writeFile();
        writeObject.openFile();
        writeObject.writeToFile();
        writeObject.fileClose();

        readFile readObject = new readFile();
        readObject.openFile();
        readObject.readThingsFile();
        readObject.fileClose();
    }
}