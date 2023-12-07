public class SistemaDeMidiaFacade {
    private ReprodutorDeAudio audioPlayer;
    private ReprodutorDeVideo videoPlayer;
    private Amplificador amplificador;
    
    public void iniciarSubsistemas(){
        audioPlayer = new ReprodutorDeAudio();
        audioPlayer.ligar();

        videoPlayer = new ReprodutorDeVideo();
        videoPlayer.ligar();

        amplificador = new Amplificador();
        amplificador.ligar();
        amplificador.definirStereo();
    }

    public void reproduzirAudio(String arquivo){
        audioPlayer.reproduzirAudio(arquivo);
    }

    public void reproduzirVideo(String imagem){
        videoPlayer.reproduzirVideo(imagem);
    }

    public void desligarSubsistemas(){
        audioPlayer.desligar();
        amplificador.desligar();
        videoPlayer.desligar();
    }

}