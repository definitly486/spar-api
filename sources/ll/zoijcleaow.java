package ll;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow extends kl.gxszxtbevo implements lqeggnwhkg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private dxjokdxxww f63338gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private cqumvgiudr f63339lqeggnwhkg;

    public static class iobyxmoadg extends zoijcleaow {
        public iobyxmoadg() {
            super("A128GCM", UserVerificationMethods.USER_VERIFY_PATTERN);
        }
    }

    public static class ppxfxbqfkf extends zoijcleaow {
        public ppxfxbqfkf() {
            super("A256GCM", UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
    }

    /* JADX INFO: renamed from: ll.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static class C1288zoijcleaow extends zoijcleaow {
        public C1288zoijcleaow() {
            super("A192GCM", 192);
        }
    }

    public zoijcleaow(String str, int i13) {
        wflxmlrfwp(str);
        agtfadlqog("AES/GCM/NoPadding");
        ojitshcjhn(ql.kcexrzcfyt.SYMMETRIC);
        rgvfuqvkyq("AES");
        this.f63338gxszxtbevo = new dxjokdxxww(rl.iobyxmoadg.ppxfxbqfkf(i13), "AES");
        this.f63339lqeggnwhkg = new cqumvgiudr(draadjrbmk(), 16);
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return this.f63339lqeggnwhkg.eablkybsjg(this.f59723iobyxmoadg, wkgbmnqykc().zoijcleaow(), 12, eablkybsjg());
    }

    @Override // ll.lqeggnwhkg
    public byte[] dxjokdxxww(gtknphoqwx gtknphoqwxVar, byte[] bArr, byte[] bArr2, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
        byte[] bArrPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf();
        return this.f63339lqeggnwhkg.iobyxmoadg(new ql.iobyxmoadg(bArr2), bArrPpxfxbqfkf, gtknphoqwxVar.zoijcleaow(), gtknphoqwxVar.iobyxmoadg(), bArr, nufgyqmvbu.zoijcleaow(zoijcleaowVar, iobyxmoadgVar));
    }

    @Override // ll.lqeggnwhkg
    public gtknphoqwx gtknphoqwx(byte[] bArr, byte[] bArr2, byte[] bArr3, pl.zoijcleaow zoijcleaowVar, byte[] bArr4, gl.iobyxmoadg iobyxmoadgVar) {
        return vdvldrhtss(bArr, bArr2, bArr3, kcexrzcfyt.iobyxmoadg(12, bArr4, iobyxmoadgVar.zoijcleaow()), nufgyqmvbu.zoijcleaow(zoijcleaowVar, iobyxmoadgVar));
    }

    public gtknphoqwx vdvldrhtss(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str) throws JoseException {
        cqumvgiudr.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = this.f63339lqeggnwhkg.ppxfxbqfkf(new ql.iobyxmoadg(bArr3), bArr4, bArr, bArr2, str);
        return new gtknphoqwx(bArr4, iobyxmoadgVarPpxfxbqfkf.ppxfxbqfkf(), iobyxmoadgVarPpxfxbqfkf.wkgbmnqykc());
    }

    @Override // ll.lqeggnwhkg
    public dxjokdxxww wkgbmnqykc() {
        return this.f63338gxszxtbevo;
    }
}
