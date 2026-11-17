package ol;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import ql.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc extends kl.gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f73154gxszxtbevo;

    public static class iobyxmoadg extends wkgbmnqykc {
        public iobyxmoadg() {
            super("HS256", "HmacSHA256", UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
    }

    public static class ppxfxbqfkf extends wkgbmnqykc {
        public ppxfxbqfkf() {
            super("HS512", "HmacSHA512", UserVerificationMethods.USER_VERIFY_NONE);
        }
    }

    public static class zoijcleaow extends wkgbmnqykc {
        public zoijcleaow() {
            super("HS384", "HmacSHA384", 384);
        }
    }

    public wkgbmnqykc(String str, String str2, int i13) {
        wflxmlrfwp(str);
        agtfadlqog(str2);
        ojitshcjhn(kcexrzcfyt.SYMMETRIC);
        rgvfuqvkyq("oct");
        this.f73154gxszxtbevo = i13;
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        try {
            Mac.getInstance(draadjrbmk());
            return true;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }
}
