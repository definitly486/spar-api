package nl;

import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jose4j.lang.JoseException;
import ql.cqumvgiudr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx extends ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private String f70285cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private String f70286iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private List f70287istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected boolean f70288lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    protected PrivateKey f70289pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private String f70290yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    protected String f70291zynmafqrjb;

    public static class iobyxmoadg {
        public static gtknphoqwx iobyxmoadg(String str) {
            return zoijcleaow(str, null);
        }

        public static gtknphoqwx ppxfxbqfkf(Key key) {
            return (gtknphoqwx) ppxfxbqfkf.iobyxmoadg.zoijcleaow(key);
        }

        public static gtknphoqwx wkgbmnqykc(Map map, String str) throws JoseException {
            String strDraadjrbmk = ppxfxbqfkf.draadjrbmk(map, "kty");
            strDraadjrbmk.hashCode();
            switch (strDraadjrbmk) {
                case "EC":
                    return new zoijcleaow(map, str);
                case "OKP":
                    return new nufgyqmvbu(map, str);
                case "RSA":
                    return new draadjrbmk(map, str);
                default:
                    throw new JoseException("Unknown key type (for public keys): '" + strDraadjrbmk + "'");
            }
        }

        public static gtknphoqwx zoijcleaow(String str, String str2) {
            return wkgbmnqykc(hl.iobyxmoadg.iobyxmoadg(str), str2);
        }
    }

    protected gtknphoqwx(PublicKey publicKey) {
        super(publicKey);
    }

    public PublicKey cdpycssgdh() {
        return (PublicKey) this.f70295esjtqupxsv;
    }

    protected abstract void cqumvgiudr(Map map);

    @Override // nl.ppxfxbqfkf
    protected void iobyxmoadg(Map map, ppxfxbqfkf.zoijcleaow zoijcleaowVar) {
        lereixgezr(map);
        if (this.f70287istkbnxepw != null) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr();
            ArrayList arrayList = new ArrayList(this.f70287istkbnxepw.size());
            Iterator it = this.f70287istkbnxepw.iterator();
            while (it.hasNext()) {
                arrayList.add(cqumvgiudrVar.ppxfxbqfkf((X509Certificate) it.next()));
            }
            map.put("x5c", arrayList);
        }
        ojitshcjhn("x5t", this.f70285cdpycssgdh, map);
        ojitshcjhn("x5t#S256", this.f70290yadqdtsiqt, map);
        ojitshcjhn("x5u", this.f70286iozdgvuglv, map);
        if (this.f70288lereixgezr || zoijcleaowVar == ppxfxbqfkf.zoijcleaow.INCLUDE_PRIVATE) {
            cqumvgiudr(map);
        }
    }

    public PrivateKey istkbnxepw() {
        return this.f70289pmvmpeiblj;
    }

    void jyumaefscl() {
        X509Certificate x509CertificateZynmafqrjb = zynmafqrjb();
        if (x509CertificateZynmafqrjb == null || x509CertificateZynmafqrjb.getPublicKey().equals(cdpycssgdh())) {
            return;
        }
        throw new IllegalArgumentException("The key in the first certificate MUST match the bare public key represented by other members of the JWK. Public key = " + cdpycssgdh() + " cert = " + x509CertificateZynmafqrjb);
    }

    protected abstract void lereixgezr(Map map);

    void lmojexxdyd(Map map, String str, BigInteger bigInteger, int i13) {
        map.put(str, ql.zoijcleaow.wkgbmnqykc(bigInteger, i13));
    }

    BigInteger pmvmpeiblj(Map map, String str, boolean z13) {
        return ql.zoijcleaow.iobyxmoadg(ppxfxbqfkf.btonecajqb(map, str, z13));
    }

    public void wwaezpbzkn(PrivateKey privateKey) {
        this.f70289pmvmpeiblj = privateKey;
    }

    void yadqdtsiqt(Map map, String str, BigInteger bigInteger) {
        map.put(str, ql.zoijcleaow.ppxfxbqfkf(bigInteger));
    }

    public X509Certificate zynmafqrjb() {
        List list = this.f70287istkbnxepw;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (X509Certificate) this.f70287istkbnxepw.get(0);
    }

    protected gtknphoqwx(Map map, String str) throws JoseException {
        super(map);
        this.f70291zynmafqrjb = str;
        if (map.containsKey("x5c")) {
            List listPpxfxbqfkf = rl.wkgbmnqykc.ppxfxbqfkf(map, "x5c");
            this.f70287istkbnxepw = new ArrayList(listPpxfxbqfkf.size());
            cqumvgiudr cqumvgiudrVarZoijcleaow = cqumvgiudr.zoijcleaow(str);
            Iterator it = listPpxfxbqfkf.iterator();
            while (it.hasNext()) {
                this.f70287istkbnxepw.add(cqumvgiudrVarZoijcleaow.iobyxmoadg((String) it.next()));
            }
        }
        this.f70285cdpycssgdh = ppxfxbqfkf.dxjokdxxww(map, "x5t");
        this.f70290yadqdtsiqt = ppxfxbqfkf.dxjokdxxww(map, "x5t#S256");
        this.f70286iozdgvuglv = ppxfxbqfkf.dxjokdxxww(map, "x5u");
        rgvfuqvkyq("x5c", "x5t#S256", "x5t", "x5u");
    }
}
