import java.security.SecureRandom;
import java.util.Arrays;

public class exercico {

    public static void main(String[] args) {
        
       // Cria o vetor de senhas
    String[] senhas = new String[5];

    // 1 caractere especial ['.', '#', '/', '?', '@']
    // # -> 35
    // . -> 46
    // / -> 47
    // ? -> 63
    // @ -> 64
    // ^ -> 94
    int[] caracteresEspeciais = { 35, 46, 47, 63, 64, 94 };
    SecureRandom random = new SecureRandom();
    // 3 letras maiusculas [A-Z]
    // 3 letras minusculas [a-z]
    // 3 numeros [0-9]

    for (int i = 0; i < senhas.length; i++) {
      char[] letrasMaiusculas = new char[3];
      for (int index = 0; index < 3; index++) {
        letrasMaiusculas[index] = (char) random.nextInt(65, 90);
      }

      char[] letrasMinusculas = new char[3];
      for (int index = 0; index < 3; index++) {
        letrasMinusculas[index] = (char) random.nextInt(97, 122);
      }

      // gerar os números
      char[] numeros = new char[3];
      for (int index = 0; index < 3; index++) {
        int codigoAscii = random.nextInt(48, 57);
        numeros[index] = (char) codigoAscii;
      }

      // gerar o caracter especial
      char[] caracterEspecial = new char[1];
      int indiceCaracteresEspeciais = random.nextInt(0, (caracteresEspeciais.length - 1));
      int codigoAscii = caracteresEspeciais[indiceCaracteresEspeciais];
      caracterEspecial[0] = (char) codigoAscii;

      senhas[i] = String.valueOf(letrasMaiusculas) +
          String.valueOf(numeros) +
          String.valueOf(caracterEspecial) +
          String.valueOf(letrasMinusculas);
    }

    System.out.println("Senhas: " + Arrays.toString(senhas));

    
  }
}
