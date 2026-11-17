package ll;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.spec.SecretKeySpec;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf extends kl.gxszxtbevo implements yggfygwlhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private cqumvgiudr f63324gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f63325lqeggnwhkg;

    public static class iobyxmoadg extends ppxfxbqfkf {
        public iobyxmoadg() {
            super("A128GCMKW", rl.iobyxmoadg.ppxfxbqfkf(UserVerificationMethods.USER_VERIFY_PATTERN));
        }
    }

    /* JADX INFO: renamed from: ll.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static class C1287ppxfxbqfkf extends ppxfxbqfkf {
        public C1287ppxfxbqfkf() {
            super("A256GCMKW", rl.iobyxmoadg.ppxfxbqfkf(UserVerificationMethods.USER_VERIFY_HANDPRINT));
        }
    }

    public static class zoijcleaow extends ppxfxbqfkf {
        public zoijcleaow() {
            super("A192GCMKW", rl.iobyxmoadg.ppxfxbqfkf(192));
        }
    }

    public ppxfxbqfkf(String str, int i13) {
        wflxmlrfwp(str);
        agtfadlqog("AES/GCM/NoPadding");
        ojitshcjhn(ql.kcexrzcfyt.SYMMETRIC);
        rgvfuqvkyq("oct");
        this.f63324gxszxtbevo = new cqumvgiudr(draadjrbmk(), 16);
        this.f63325lqeggnwhkg = i13;
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return this.f63324gxszxtbevo.eablkybsjg(this.f59723iobyxmoadg, this.f63325lqeggnwhkg, 12, eablkybsjg());
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        vdvldrhtss(key);
    }

    @Override // ll.yggfygwlhe
    public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
        return new SecretKeySpec(this.f63324gxszxtbevo.zoijcleaow(bArr, new el.zoijcleaow().iobyxmoadg(zoijcleaowVar.gxszxtbevo("tag")), null, lqeggnwhkgVar.iobyxmoadg()), dxjokdxxwwVar.iobyxmoadg());
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        vdvldrhtss(key);
    }

    @Override // ll.yggfygwlhe
    public kl.lqeggnwhkg ppxfxbqfkf(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
        return new kl.lqeggnwhkg(this.f63324gxszxtbevo.wkgbmnqykc(key, new el.zoijcleaow().iobyxmoadg(zoijcleaowVar.gxszxtbevo("iv")), 2, iobyxmoadgVar.ppxfxbqfkf().iobyxmoadg()));
    }

    void vdvldrhtss(Key key) throws InvalidKeyException {
        pl.wkgbmnqykc.eablkybsjg(key, eablkybsjg(), this.f63325lqeggnwhkg);
    }

    @Override // ll.yggfygwlhe
    public btonecajqb zoijcleaow(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        byte[] bArrIobyxmoadg;
        SecureRandom secureRandomZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (bArr == null) {
            bArr = rl.iobyxmoadg.gtknphoqwx(dxjokdxxwwVar.zoijcleaow(), secureRandomZoijcleaow);
        }
        el.zoijcleaow zoijcleaowVar2 = new el.zoijcleaow();
        String strGxszxtbevo = zoijcleaowVar.gxszxtbevo("iv");
        if (strGxszxtbevo == null) {
            bArrIobyxmoadg = rl.iobyxmoadg.gtknphoqwx(12, secureRandomZoijcleaow);
            zoijcleaowVar.btonecajqb("iv", zoijcleaowVar2.eablkybsjg(bArrIobyxmoadg));
        } else {
            bArrIobyxmoadg = zoijcleaowVar2.iobyxmoadg(strGxszxtbevo);
        }
        byte[] bArr2 = bArrIobyxmoadg;
        cqumvgiudr.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = this.f63324gxszxtbevo.ppxfxbqfkf(key, bArr2, bArr, null, iobyxmoadgVar.ppxfxbqfkf().iobyxmoadg());
        byte[] bArrPpxfxbqfkf = iobyxmoadgVarPpxfxbqfkf.ppxfxbqfkf();
        zoijcleaowVar.btonecajqb("tag", zoijcleaowVar2.eablkybsjg(iobyxmoadgVarPpxfxbqfkf.wkgbmnqykc()));
        return new btonecajqb(bArr, bArrPpxfxbqfkf);
    }
}
