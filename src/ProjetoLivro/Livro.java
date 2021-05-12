package ProjetoLivro;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodos publicos
    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Quem esta lendo? " + this.leitor.getNome());
        System.out.println("Sexo: " + this.leitor.getSexo());
        System.out.println("Idade: " + this.leitor.getIdade());
    }
    
    //Metodos especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(this.getAberto() == false){
            this.setAberto(true);
            this.setPagAtual(1);
            System.out.println("Livro aberto!");
        } else {
            System.out.println("Comando invalido!");
        }
    }

    @Override
    public void fechar() {
        if(this.getAberto() == true) {
            this.setAberto(false);
            System.out.println("Livro fechado!");
        } else {
            System.out.println("Comando invalido!");
        }
    }

    @Override
    public void folhear(int p) {
        if(this.getAberto() == true && p <= this.getTotPaginas() && p > 0) {
        this.pagAtual = p;
        System.out.println("Página: " + this.getPagAtual());
        }
        else {
            System.out.println("Comando invalido!");
        }
    }

    @Override
    public void avançarPag() {
        if(this.getAberto() == true && this.getPagAtual() < this.getTotPaginas() && this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Página: " + this.getPagAtual());
        } else {
            System.out.println("Comando invalido!");
        }
        
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() == true && this.getPagAtual() <= this.getTotPaginas() && this.getPagAtual() > 1) {
           this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página: " + this.getPagAtual());
        } else {
            System.out.println("Comando invalido!");
        }
    }
    
    
}
