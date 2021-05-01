import java.io.*;



public class SaveManage {
    //A dar save para .txt e objeto
    public void save(String filename) throws FileNotFoundException,IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);// guarda-setodo o objecto de uma vez
        oos.flush();
        oos.close();
    }

    //Nota: o tipo gameState ainda não existe
    public static gameState load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fos = new FileInputStream(filename);
        ObjectInputStream oos = new ObjectInputStream(fos);
        gamestate l = (gamestate) ois.readObject();
        ois.close();
        return l;
    }
}
