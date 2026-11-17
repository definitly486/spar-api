package ll;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.jose4j.lang.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc extends esjtqupxsv {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    int f63327dxjokdxxww;

    public static class iobyxmoadg extends wkgbmnqykc {
        public iobyxmoadg() {
            super("A128KW", 16);
        }
    }

    public static class ppxfxbqfkf extends wkgbmnqykc {
        public ppxfxbqfkf() {
            super("A256KW", 32);
        }
    }

    public static class zoijcleaow extends wkgbmnqykc {
        public zoijcleaow() {
            super("A192KW", 24);
        }
    }

    public wkgbmnqykc(String str, int i13) {
        super("AESWrap", str);
        rgvfuqvkyq("oct");
        ojitshcjhn(ql.kcexrzcfyt.SYMMETRIC);
        this.f63327dxjokdxxww = i13;
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        int iJyumaefscl = jyumaefscl();
        String strDraadjrbmk = draadjrbmk();
        try {
            Cipher.getInstance(strDraadjrbmk);
            return eablkybsjg.iobyxmoadg(strDraadjrbmk, iJyumaefscl);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e13) {
            this.f63305gxszxtbevo.agtfadlqog("{} for {} is not available ({}).", strDraadjrbmk, eablkybsjg(), rl.zoijcleaow.iobyxmoadg(e13));
            return false;
        }
    }

    void cqumvgiudr(Key key) throws InvalidKeyException {
        pl.wkgbmnqykc.eablkybsjg(key, eablkybsjg(), jyumaefscl());
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        cqumvgiudr(key);
    }

    wkgbmnqykc iwizpuwonk() {
        this.f63307nufgyqmvbu = false;
        return this;
    }

    int jyumaefscl() {
        return this.f63327dxjokdxxww;
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        cqumvgiudr(key);
    }
}
