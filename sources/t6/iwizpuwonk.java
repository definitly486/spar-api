package t6;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f109818iobyxmoadg = {56, 52, 98, 55, 98, 98, 101, 99, 100, 98, 56, 56, 49, 48, 99, 102, 49, 50, 100, 54, 57, 97, 53, 55, 55, 55, 53, 102, 52, 57, 53, 99, 55, 49, 101, 101, 50, 56, 100, 48};

    public static String iobyxmoadg(byte[] bArr) {
        try {
            return new String(zoijcleaow(ppxfxbqfkf(f109818iobyxmoadg), bArr));
        } catch (Exception e13) {
            e13.printStackTrace();
            return null;
        }
    }

    private static byte[] ppxfxbqfkf(int[] iArr) {
        int length = (iArr.length / 16) * 16;
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < length; i13++) {
            sb3.append((char) iArr[i13]);
        }
        return sb3.toString().getBytes();
    }

    private static byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }
}
