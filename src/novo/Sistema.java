public class Sistema {

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;

        double media = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(media);

        apresentarResultado(nomeAluno, media, situacao);
    }

    public static double calcularMedia(double primeiraNota, double segundaNota) {
        return (primeiraNota + segundaNota) / 2;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        }

        return "Reprovado";
    }

    public static void apresentarResultado(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}
