package ob;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog implements mb.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f72468eablkybsjg = gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ThreadLocal f72469iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Key f72470ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f72471wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72472zoijcleaow;

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) dxjokdxxww.f72478ppxfxbqfkf.iobyxmoadg(agtfadlqog.this.f72472zoijcleaow);
                mac.init(agtfadlqog.this.f72470ppxfxbqfkf);
                return mac;
            } catch (GeneralSecurityException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public agtfadlqog(String str, Key key) throws GeneralSecurityException {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f72469iobyxmoadg = iobyxmoadgVar;
        if (!f72468eablkybsjg.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f72472zoijcleaow = str;
        this.f72470ppxfxbqfkf = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.f72471wkgbmnqykc = 20;
                break;
            case "HMACSHA224":
                this.f72471wkgbmnqykc = 28;
                break;
            case "HMACSHA256":
                this.f72471wkgbmnqykc = 32;
                break;
            case "HMACSHA384":
                this.f72471wkgbmnqykc = 48;
                break;
            case "HMACSHA512":
                this.f72471wkgbmnqykc = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        iobyxmoadgVar.get();
    }

    @Override // mb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, int i13) throws InvalidAlgorithmParameterException {
        if (i13 > this.f72471wkgbmnqykc) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f72469iobyxmoadg.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f72469iobyxmoadg.get()).doFinal(), i13);
    }
}
