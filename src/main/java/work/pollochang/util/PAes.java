package work.pollochang.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.validation.constraints.NotNull;

/**
 * 文字加解密
 */
public class PAes {

    private static SecretKeySpec secretKey;

    private static void setKey(final String myKey) {
        MessageDigest sha;
        try {
            byte[] key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 文字加密
     * @param strToEncrypt 要加密的文字
     * @param secret 鹽巴
     * @return 加密結果
     */
    public static String encrypt(
            @NotNull final String strToEncrypt,
            @NotNull final String secret
    ) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder()
                    .encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.getMessage());
        }
        return null;
    }

    /**
     * 解密方法
     * @param strToDecrypt 要解密的文字
     * @param secret 鹽巴
     * @return 解密結果
     */
    public static String decrypt(
            @NotNull final String strToDecrypt,
            @NotNull final String secret
    ) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder()
                    .decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.getMessage());
            return null;
        }
    }
}



