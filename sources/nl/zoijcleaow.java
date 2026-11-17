package nl;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Map;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;
import ql.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow extends gtknphoqwx {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private String f70304lmojexxdyd;

    public zoijcleaow(ECPublicKey eCPublicKey) {
        super(eCPublicKey);
        this.f70304lmojexxdyd = rgvfuqvkyq.zoijcleaow(eCPublicKey.getParams().getCurve());
    }

    private int ylkuphrtab() {
        return (int) Math.ceil(((double) rgvfuqvkyq.ppxfxbqfkf(pkzmftpjix()).getCurve().getField().getFieldSize()) / 8.0d);
    }

    @Override // nl.gtknphoqwx
    protected void cqumvgiudr(Map map) {
        ECPrivateKey eCPrivateKeyJpowsppfya = jpowsppfya();
        if (eCPrivateKeyJpowsppfya != null) {
            lmojexxdyd(map, "d", eCPrivateKeyJpowsppfya.getS(), ylkuphrtab());
        }
    }

    public ECPublicKey hcddaimhww() {
        return (ECPublicKey) this.f70295esjtqupxsv;
    }

    public ECPrivateKey jpowsppfya() {
        return (ECPrivateKey) this.f70289pmvmpeiblj;
    }

    @Override // nl.gtknphoqwx
    protected void lereixgezr(Map map) {
        ECPoint w13 = hcddaimhww().getW();
        int iYlkuphrtab = ylkuphrtab();
        lmojexxdyd(map, "x", w13.getAffineX(), iYlkuphrtab);
        lmojexxdyd(map, "y", w13.getAffineY(), iYlkuphrtab);
        map.put("crv", pkzmftpjix());
    }

    @Override // nl.ppxfxbqfkf
    public String nufgyqmvbu() {
        return "EC";
    }

    public String pkzmftpjix() {
        return this.f70304lmojexxdyd;
    }

    public zoijcleaow(Map map) {
        this(map, null);
    }

    public zoijcleaow(Map map, String str) throws JoseException {
        super(map, str);
        String strBtonecajqb = ppxfxbqfkf.btonecajqb(map, "crv", true);
        this.f70304lmojexxdyd = strBtonecajqb;
        ECParameterSpec eCParameterSpecPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(strBtonecajqb);
        if (eCParameterSpecPpxfxbqfkf != null) {
            BigInteger bigIntegerPmvmpeiblj = pmvmpeiblj(map, "x", true);
            BigInteger bigIntegerPmvmpeiblj2 = pmvmpeiblj(map, "y", true);
            ql.ppxfxbqfkf ppxfxbqfkfVar = new ql.ppxfxbqfkf(str, null);
            this.f70295esjtqupxsv = ppxfxbqfkfVar.lqeggnwhkg(bigIntegerPmvmpeiblj, bigIntegerPmvmpeiblj2, eCParameterSpecPpxfxbqfkf);
            jyumaefscl();
            if (map.containsKey("d")) {
                this.f70289pmvmpeiblj = ppxfxbqfkfVar.gxszxtbevo(pmvmpeiblj(map, "d", false), eCParameterSpecPpxfxbqfkf);
            }
            rgvfuqvkyq("crv", "x", "y", "d");
            return;
        }
        throw new InvalidKeyException("\"" + this.f70304lmojexxdyd + "\" is an unknown or unsupported value for the \"crv\" parameter.");
    }
}
