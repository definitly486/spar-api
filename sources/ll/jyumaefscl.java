package ll;

import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl extends kl.gxszxtbevo implements yggfygwlhe {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final byte[] f63314draadjrbmk = {0};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc f63318gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dxjokdxxww f63319lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ml.eablkybsjg f63320nufgyqmvbu;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f63316dxjokdxxww = 65536;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f63315btonecajqb = 12;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f63317gtknphoqwx = 2499999;

    public static class iobyxmoadg extends jyumaefscl {
        public iobyxmoadg() {
            super("PBES2-HS256+A128KW", "HmacSHA256", new wkgbmnqykc.iobyxmoadg().iwizpuwonk());
        }
    }

    public static class ppxfxbqfkf extends jyumaefscl {
        public ppxfxbqfkf() {
            super("PBES2-HS512+A256KW", "HmacSHA512", new wkgbmnqykc.ppxfxbqfkf().iwizpuwonk());
        }
    }

    public static class zoijcleaow extends jyumaefscl {
        public zoijcleaow() {
            super("PBES2-HS384+A192KW", "HmacSHA384", new wkgbmnqykc.zoijcleaow().iwizpuwonk());
        }
    }

    public jyumaefscl(String str, String str2, wkgbmnqykc wkgbmnqykcVar) {
        wflxmlrfwp(str);
        agtfadlqog("n/a");
        this.f63320nufgyqmvbu = new ml.eablkybsjg(str2);
        ojitshcjhn(ql.kcexrzcfyt.SYMMETRIC);
        rgvfuqvkyq("PBKDF2");
        this.f63318gxszxtbevo = wkgbmnqykcVar;
        this.f63319lqeggnwhkg = new dxjokdxxww(wkgbmnqykcVar.jyumaefscl(), "AES");
    }

    private Key oxmwwwfdhm(Key key, Long l13, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) {
        return new SecretKeySpec(this.f63320nufgyqmvbu.iobyxmoadg(key.getEncoded(), rl.iobyxmoadg.wkgbmnqykc(rl.eablkybsjg.ppxfxbqfkf(eablkybsjg()), f63314draadjrbmk, bArr), l13.intValue(), this.f63319lqeggnwhkg.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf().gxszxtbevo()), this.f63319lqeggnwhkg.iobyxmoadg());
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return this.f63318gxszxtbevo.btonecajqb();
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        kcexrzcfyt(key);
    }

    public void kcexrzcfyt(Key key) throws InvalidKeyException {
        pl.wkgbmnqykc.wkgbmnqykc(key);
    }

    @Override // ll.yggfygwlhe
    public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        return this.f63318gxszxtbevo.lqeggnwhkg(this.f63318gxszxtbevo.ppxfxbqfkf(lqeggnwhkgVar.zoijcleaow(), zoijcleaowVar, iobyxmoadgVar), bArr, dxjokdxxwwVar, zoijcleaowVar, iobyxmoadgVar);
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        kcexrzcfyt(key);
    }

    @Override // ll.yggfygwlhe
    public kl.lqeggnwhkg ppxfxbqfkf(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        Long lPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf("p2c");
        if (lPpxfxbqfkf.longValue() <= this.f63317gtknphoqwx) {
            return new kl.lqeggnwhkg(oxmwwwfdhm(key, lPpxfxbqfkf, new el.zoijcleaow().iobyxmoadg(zoijcleaowVar.gxszxtbevo("p2s")), iobyxmoadgVar));
        }
        throw new JoseException("PBES2 iteration count (p2c=" + lPpxfxbqfkf + ") cannot be more than " + this.f63317gtknphoqwx + " to avoid excessive resource utilization.");
    }

    protected Key vdvldrhtss(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        byte[] bArrIobyxmoadg;
        Long lPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf("p2c");
        if (lPpxfxbqfkf == null) {
            lPpxfxbqfkf = Long.valueOf(this.f63316dxjokdxxww);
            zoijcleaowVar.dxjokdxxww("p2c", lPpxfxbqfkf);
        }
        if (lPpxfxbqfkf.longValue() < 1000) {
            throw new JoseException("iteration count (p2c=" + lPpxfxbqfkf + ") cannot be less than 1000 (and should probably be considerably more)");
        }
        String strGxszxtbevo = zoijcleaowVar.gxszxtbevo("p2s");
        el.zoijcleaow zoijcleaowVar2 = new el.zoijcleaow();
        if (strGxszxtbevo == null) {
            bArrIobyxmoadg = rl.iobyxmoadg.gtknphoqwx(this.f63315btonecajqb, iobyxmoadgVar.zoijcleaow());
            zoijcleaowVar.btonecajqb("p2s", zoijcleaowVar2.eablkybsjg(bArrIobyxmoadg));
        } else {
            bArrIobyxmoadg = zoijcleaowVar2.iobyxmoadg(strGxszxtbevo);
        }
        if (bArrIobyxmoadg.length >= 8) {
            return oxmwwwfdhm(key, lPpxfxbqfkf, bArrIobyxmoadg, iobyxmoadgVar);
        }
        throw new JoseException("A p2s salt input value containing 8 or more octets MUST be used.");
    }

    @Override // ll.yggfygwlhe
    public btonecajqb zoijcleaow(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        return this.f63318gxszxtbevo.zoijcleaow(vdvldrhtss(key, zoijcleaowVar, iobyxmoadgVar), dxjokdxxwwVar, zoijcleaowVar, bArr, iobyxmoadgVar);
    }
}
