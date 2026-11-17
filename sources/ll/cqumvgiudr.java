package ll;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f63298iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f63299zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private byte[] f63300iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private byte[] f63301zoijcleaow;

        public byte[] ppxfxbqfkf() {
            return this.f63300iobyxmoadg;
        }

        public byte[] wkgbmnqykc() {
            return this.f63301zoijcleaow;
        }
    }

    public cqumvgiudr(String str, int i13) {
        this.f63298iobyxmoadg = str;
        this.f63299zoijcleaow = i13;
    }

    private void gxszxtbevo(Cipher cipher, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        cipher.updateAAD(bArr);
    }

    public boolean eablkybsjg(am.iobyxmoadg iobyxmoadgVar, int i13, int i14, String str) {
        if (eablkybsjg.iobyxmoadg(this.f63298iobyxmoadg, i13)) {
            byte[] bArr = {112, 108, 97, 105, 110, 116, 101, 120, 116};
            byte[] bArr2 = {97, 97, 100};
            byte[] bArrBtonecajqb = rl.iobyxmoadg.btonecajqb(i13);
            try {
                ppxfxbqfkf(new ql.iobyxmoadg(bArrBtonecajqb), rl.iobyxmoadg.btonecajqb(i14), bArr, bArr2, null);
                return true;
            } catch (Throwable th2) {
                iobyxmoadgVar.lqeggnwhkg("{} is not available ({}).", str, rl.zoijcleaow.iobyxmoadg(th2));
            }
        }
        return false;
    }

    public byte[] iobyxmoadg(Key key, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str) {
        return zoijcleaow(bArr2, bArr3, bArr4, wkgbmnqykc(key, bArr, 2, str));
    }

    public iobyxmoadg ppxfxbqfkf(Key key, byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws JoseException {
        Cipher cipherWkgbmnqykc = wkgbmnqykc(key, bArr, 1, str);
        gxszxtbevo(cipherWkgbmnqykc, bArr3);
        try {
            byte[] bArrDoFinal = cipherWkgbmnqykc.doFinal(bArr2);
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            int length = bArrDoFinal.length - this.f63299zoijcleaow;
            iobyxmoadgVar.f63300iobyxmoadg = rl.iobyxmoadg.ojitshcjhn(bArrDoFinal, 0, length);
            iobyxmoadgVar.f63301zoijcleaow = rl.iobyxmoadg.ojitshcjhn(bArrDoFinal, length, this.f63299zoijcleaow);
            return iobyxmoadgVar;
        } catch (BadPaddingException | IllegalBlockSizeException e13) {
            throw new JoseException(e13.toString(), e13);
        }
    }

    public Cipher wkgbmnqykc(Key key, byte[] bArr, int i13, String str) throws JoseException {
        Cipher cipherIobyxmoadg = gxszxtbevo.iobyxmoadg(this.f63298iobyxmoadg, str);
        try {
            cipherIobyxmoadg.init(i13, key, new GCMParameterSpec(rl.iobyxmoadg.iobyxmoadg(this.f63299zoijcleaow), bArr));
            return cipherIobyxmoadg;
        } catch (InvalidAlgorithmParameterException e13) {
            throw new JoseException(e13.toString(), e13);
        } catch (InvalidKeyException e14) {
            throw new JoseException("Invalid key for " + this.f63298iobyxmoadg, e14);
        }
    }

    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2, byte[] bArr3, Cipher cipher) throws JoseException {
        gxszxtbevo(cipher, bArr3);
        try {
            return cipher.doFinal(rl.iobyxmoadg.wkgbmnqykc(bArr, bArr2));
        } catch (BadPaddingException | IllegalBlockSizeException e13) {
            throw new JoseException(e13.toString(), e13);
        }
    }
}
