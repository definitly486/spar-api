package ll;

import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxmwwwfdhm extends kl.gxszxtbevo implements yggfygwlhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc f63321gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dxjokdxxww f63322lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private vdvldrhtss f63323nufgyqmvbu;

    public static class iobyxmoadg extends oxmwwwfdhm implements yggfygwlhe {
        public iobyxmoadg() {
            super("ECDH-ES+A128KW", new wkgbmnqykc.iobyxmoadg().iwizpuwonk());
        }
    }

    public static class ppxfxbqfkf extends oxmwwwfdhm implements yggfygwlhe {
        public ppxfxbqfkf() {
            super("ECDH-ES+A256KW", new wkgbmnqykc.ppxfxbqfkf().iwizpuwonk());
        }
    }

    public static class zoijcleaow extends oxmwwwfdhm implements yggfygwlhe {
        public zoijcleaow() {
            super("ECDH-ES+A192KW", new wkgbmnqykc.zoijcleaow().iwizpuwonk());
        }
    }

    public oxmwwwfdhm(String str, wkgbmnqykc wkgbmnqykcVar) {
        wflxmlrfwp(str);
        agtfadlqog("N/A");
        rgvfuqvkyq("EC");
        ojitshcjhn(ql.kcexrzcfyt.ASYMMETRIC);
        this.f63321gxszxtbevo = wkgbmnqykcVar;
        this.f63323nufgyqmvbu = new vdvldrhtss("alg");
        this.f63322lqeggnwhkg = new dxjokdxxww(wkgbmnqykcVar.jyumaefscl(), "AES");
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return this.f63323nufgyqmvbu.btonecajqb() && this.f63321gxszxtbevo.btonecajqb();
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        this.f63323nufgyqmvbu.gxszxtbevo(key, lqeggnwhkgVar);
    }

    @Override // ll.yggfygwlhe
    public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        return this.f63321gxszxtbevo.lqeggnwhkg(this.f63321gxszxtbevo.ppxfxbqfkf(this.f63323nufgyqmvbu.lqeggnwhkg(lqeggnwhkgVar, rl.iobyxmoadg.f83021iobyxmoadg, this.f63322lqeggnwhkg, zoijcleaowVar, iobyxmoadgVar), zoijcleaowVar, iobyxmoadgVar), bArr, dxjokdxxwwVar, zoijcleaowVar, iobyxmoadgVar);
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        this.f63323nufgyqmvbu.nufgyqmvbu(key, lqeggnwhkgVar);
    }

    @Override // ll.yggfygwlhe
    public kl.lqeggnwhkg ppxfxbqfkf(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
        return this.f63323nufgyqmvbu.ppxfxbqfkf(key, zoijcleaowVar, iobyxmoadgVar);
    }

    @Override // ll.yggfygwlhe
    public btonecajqb zoijcleaow(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) throws JoseException {
        btonecajqb btonecajqbVarZoijcleaow = this.f63323nufgyqmvbu.zoijcleaow(key, this.f63322lqeggnwhkg, zoijcleaowVar, null, iobyxmoadgVar);
        return this.f63321gxszxtbevo.zoijcleaow(new SecretKeySpec(btonecajqbVarZoijcleaow.iobyxmoadg(), this.f63322lqeggnwhkg.iobyxmoadg()), dxjokdxxwwVar, zoijcleaowVar, bArr, iobyxmoadgVar);
    }
}
