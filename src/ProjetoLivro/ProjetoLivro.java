package ProjetoLivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cassiano", 24, "Masculino");
        Livro l1 = new Livro ("Harry Potter", "JK Rowling", 200, p1);
        l1.detalhes();
        l1.abrir();
        l1.folhear(1);
        l1.voltarPag();
        
        
        
    }
    
}
