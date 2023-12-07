public class Principal {
    public static void main(String[] args) {
        SistemaDeMidiaFacade fachada = new SistemaDeMidiaFacade();
        System.out.println("      ## Iniciando Subsistemas ##      ");
        fachada.iniciarSubsistemas();
        System.out.println();
        System.out.println("      ## Reproduzindo midias ##      ");
        fachada.reproduzirAudio("teste.mp3");
        fachada.reproduzirVideo("imagem.png");
        System.out.println();
        System.out.println("      ## Desligando Subsistemas ##     ");
        fachada.desligarSubsistemas();
        System.out.println();
    }
    
}