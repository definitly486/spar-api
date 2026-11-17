package ll;

import java.security.Key;
import org.jose4j.lang.InvalidAlgorithmException;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class zdlpuopuiu extends pl.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final kl.ppxfxbqfkf f63328zdlpuopuiu = new kl.ppxfxbqfkf(kl.ppxfxbqfkf.zoijcleaow.BLOCK, "RSA1_5", "PBES2-HS256+A128KW", "PBES2-HS384+A192KW", "PBES2-HS512+A256KW");

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    byte[] f63329agtfadlqog;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private kl.lqeggnwhkg f63332kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    byte[] f63333ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    byte[] f63335rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    byte[] f63336vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private byte[] f63337wflxmlrfwp;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private el.zoijcleaow f63331gtknphoqwx = new el.zoijcleaow();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private String f63330draadjrbmk = "UTF-8";

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private kl.ppxfxbqfkf f63334oxmwwwfdhm = kl.ppxfxbqfkf.f59733ppxfxbqfkf;

    public zdlpuopuiu() {
        agtfadlqog(f63328zdlpuopuiu);
    }

    private kl.lqeggnwhkg cqumvgiudr() {
        yggfygwlhe yggfygwlheVarLmojexxdyd = lmojexxdyd();
        Key keyDxjokdxxww = dxjokdxxww();
        if (gtknphoqwx()) {
            yggfygwlheVarLmojexxdyd.nufgyqmvbu(keyDxjokdxxww, zynmafqrjb());
        }
        return yggfygwlheVarLmojexxdyd.ppxfxbqfkf(keyDxjokdxxww, this.f76896zoijcleaow, btonecajqb());
    }

    private void jyumaefscl(lqeggnwhkg lqeggnwhkgVar, dxjokdxxww dxjokdxxwwVar, byte[] bArr) throws InvalidKeyException {
        int iZoijcleaow = dxjokdxxwwVar.zoijcleaow();
        if (bArr.length == iZoijcleaow) {
            return;
        }
        throw new InvalidKeyException(rl.iobyxmoadg.zoijcleaow(bArr) + " bit content encryption key is not the correct size for the " + lqeggnwhkgVar.eablkybsjg() + " content encryption algorithm (" + rl.iobyxmoadg.iobyxmoadg(iZoijcleaow) + ").");
    }

    private void lereixgezr() throws JoseException {
        yggfygwlhe yggfygwlheVarLmojexxdyd = lmojexxdyd();
        lqeggnwhkg lqeggnwhkgVarZynmafqrjb = zynmafqrjb();
        dxjokdxxww dxjokdxxwwVarWkgbmnqykc = lqeggnwhkgVarZynmafqrjb.wkgbmnqykc();
        iobyxmoadg();
        kl.lqeggnwhkg lqeggnwhkgVarCqumvgiudr = this.f63332kcexrzcfyt;
        if (lqeggnwhkgVarCqumvgiudr == null) {
            lqeggnwhkgVarCqumvgiudr = cqumvgiudr();
        }
        Key keyLqeggnwhkg = yggfygwlheVarLmojexxdyd.lqeggnwhkg(lqeggnwhkgVarCqumvgiudr, cdpycssgdh(), dxjokdxxwwVarWkgbmnqykc, lqeggnwhkg(), btonecajqb());
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx(this.f63333ojitshcjhn, this.f63335rgvfuqvkyq, nufgyqmvbu());
        byte[] bArrIstkbnxepw = istkbnxepw();
        byte[] encoded = keyLqeggnwhkg.getEncoded();
        jyumaefscl(lqeggnwhkgVarZynmafqrjb, dxjokdxxwwVarWkgbmnqykc, encoded);
        stevsuqkhv(esjtqupxsv(lqeggnwhkg(), lqeggnwhkgVarZynmafqrjb.dxjokdxxww(gtknphoqwxVar, bArrIstkbnxepw, encoded, lqeggnwhkg(), btonecajqb())));
    }

    public byte[] cdpycssgdh() {
        return this.f63329agtfadlqog;
    }

    public void cllcsxoeiz(String str) {
        kcexrzcfyt("enc", str);
    }

    public void dsvhmnatus(byte[] bArr) {
        this.f63333ojitshcjhn = bArr;
    }

    byte[] esjtqupxsv(pl.zoijcleaow zoijcleaowVar, byte[] bArr) {
        String strGxszxtbevo = zoijcleaowVar.gxszxtbevo("zip");
        return strGxszxtbevo != null ? ((tl.iobyxmoadg) kl.eablkybsjg.zoijcleaow().iobyxmoadg().iobyxmoadg(strGxszxtbevo)).iobyxmoadg(bArr) : bArr;
    }

    public void hcddaimhww(kl.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f63334oxmwwwfdhm = ppxfxbqfkfVar;
    }

    public void hkdspvbjdz(String str) {
        dsvhmnatus(this.f63331gtknphoqwx.iobyxmoadg(str));
    }

    public byte[] iozdgvuglv() {
        return this.f63333ojitshcjhn;
    }

    byte[] istkbnxepw() {
        return rl.eablkybsjg.iobyxmoadg(eablkybsjg());
    }

    byte[] iwizpuwonk(pl.zoijcleaow zoijcleaowVar, byte[] bArr) {
        String strGxszxtbevo = zoijcleaowVar.gxszxtbevo("zip");
        return strGxszxtbevo != null ? ((tl.iobyxmoadg) kl.eablkybsjg.zoijcleaow().iobyxmoadg().iobyxmoadg(strGxszxtbevo)).compress(bArr) : bArr;
    }

    public void jpowsppfya(byte[] bArr) {
        this.f63336vdvldrhtss = bArr;
    }

    public yggfygwlhe lmojexxdyd() {
        return wwaezpbzkn(true);
    }

    public String pkzmftpjix() {
        return rl.eablkybsjg.eablkybsjg(ylkuphrtab(), this.f63330draadjrbmk);
    }

    public String pmvmpeiblj() throws InvalidKeyException, InvalidAlgorithmException {
        yggfygwlhe yggfygwlheVarLmojexxdyd = lmojexxdyd();
        lqeggnwhkg lqeggnwhkgVarZynmafqrjb = zynmafqrjb();
        dxjokdxxww dxjokdxxwwVarWkgbmnqykc = lqeggnwhkgVarZynmafqrjb.wkgbmnqykc();
        Key keyDxjokdxxww = dxjokdxxww();
        if (gtknphoqwx()) {
            yggfygwlheVarLmojexxdyd.gxszxtbevo(dxjokdxxww(), lqeggnwhkgVarZynmafqrjb);
        }
        btonecajqb btonecajqbVarZoijcleaow = yggfygwlheVarLmojexxdyd.zoijcleaow(keyDxjokdxxww, dxjokdxxwwVarWkgbmnqykc, lqeggnwhkg(), this.f63336vdvldrhtss, btonecajqb());
        jpowsppfya(btonecajqbVarZoijcleaow.iobyxmoadg());
        this.f63329agtfadlqog = btonecajqbVarZoijcleaow.zoijcleaow();
        byte[] bArrIstkbnxepw = istkbnxepw();
        byte[] bArrIobyxmoadg = btonecajqbVarZoijcleaow.iobyxmoadg();
        byte[] bArr = this.f63337wflxmlrfwp;
        if (bArr == null) {
            throw new NullPointerException("The plaintext payload for the JWE has not been set.");
        }
        byte[] bArrIwizpuwonk = iwizpuwonk(lqeggnwhkg(), bArr);
        jyumaefscl(lqeggnwhkgVarZynmafqrjb, dxjokdxxwwVarWkgbmnqykc, bArrIobyxmoadg);
        gtknphoqwx gtknphoqwxVarGtknphoqwx = lqeggnwhkgVarZynmafqrjb.gtknphoqwx(bArrIwizpuwonk, bArrIstkbnxepw, bArrIobyxmoadg, lqeggnwhkg(), iozdgvuglv(), btonecajqb());
        dsvhmnatus(gtknphoqwxVarGtknphoqwx.ppxfxbqfkf());
        this.f63335rgvfuqvkyq = gtknphoqwxVarGtknphoqwx.zoijcleaow();
        String strEablkybsjg = this.f63331gtknphoqwx.eablkybsjg(gtknphoqwxVarGtknphoqwx.ppxfxbqfkf());
        String strEablkybsjg2 = this.f63331gtknphoqwx.eablkybsjg(gtknphoqwxVarGtknphoqwx.zoijcleaow());
        String strEablkybsjg3 = this.f63331gtknphoqwx.eablkybsjg(gtknphoqwxVarGtknphoqwx.iobyxmoadg());
        return pl.iobyxmoadg.zoijcleaow(eablkybsjg(), this.f63331gtknphoqwx.eablkybsjg(btonecajqbVarZoijcleaow.zoijcleaow()), strEablkybsjg, strEablkybsjg2, strEablkybsjg3);
    }

    public void stevsuqkhv(byte[] bArr) {
        this.f63337wflxmlrfwp = bArr;
    }

    @Override // pl.ppxfxbqfkf
    protected void vdvldrhtss(String[] strArr) throws JoseException {
        if (strArr.length != 5) {
            throw new JoseException("A JWE Compact Serialization must have exactly 5 parts separated by period ('.') characters");
        }
        oxmwwwfdhm(strArr[0]);
        this.f63329agtfadlqog = this.f63331gtknphoqwx.iobyxmoadg(strArr[1]);
        hkdspvbjdz(strArr[2]);
        String str = strArr[3];
        zoijcleaow(str, "Encoded JWE Ciphertext");
        this.f63335rgvfuqvkyq = this.f63331gtknphoqwx.iobyxmoadg(str);
        String str2 = strArr[4];
        zoijcleaow(str2, "Encoded JWE Authentication Tag");
        zdlpuopuiu(this.f63331gtknphoqwx.iobyxmoadg(str2));
    }

    yggfygwlhe wwaezpbzkn(boolean z13) throws InvalidAlgorithmException {
        String strWkgbmnqykc = wkgbmnqykc();
        if (strWkgbmnqykc == null) {
            throw new InvalidAlgorithmException("Encryption key management algorithm header (alg) not set.");
        }
        if (z13) {
            ppxfxbqfkf().iobyxmoadg(strWkgbmnqykc);
        }
        return (yggfygwlhe) kl.eablkybsjg.zoijcleaow().wkgbmnqykc().iobyxmoadg(strWkgbmnqykc);
    }

    public void wypolnanlu(String str) {
        this.f63337wflxmlrfwp = rl.eablkybsjg.zoijcleaow(str, this.f63330draadjrbmk);
    }

    public String yadqdtsiqt() {
        return gxszxtbevo("enc");
    }

    public byte[] ylkuphrtab() throws JoseException {
        if (this.f63337wflxmlrfwp == null) {
            lereixgezr();
        }
        return this.f63337wflxmlrfwp;
    }

    public lqeggnwhkg zynmafqrjb() throws InvalidAlgorithmException {
        String strYadqdtsiqt = yadqdtsiqt();
        if (strYadqdtsiqt == null) {
            throw new InvalidAlgorithmException("Content encryption header (enc) not set.");
        }
        this.f63334oxmwwwfdhm.iobyxmoadg(strYadqdtsiqt);
        return (lqeggnwhkg) kl.eablkybsjg.zoijcleaow().ppxfxbqfkf().iobyxmoadg(strYadqdtsiqt);
    }
}
