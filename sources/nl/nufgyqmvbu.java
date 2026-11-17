package nl;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ll.ojitshcjhn;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;
import org.jose4j.lang.UncheckedJoseException;
import ql.iozdgvuglv;
import ql.jyumaefscl;

/* JADX INFO: loaded from: classes3.dex */
public class nufgyqmvbu extends gtknphoqwx {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final Set f70292wwaezpbzkn = new HashSet(Arrays.asList("Ed448", "Ed25519", "EdDSA", "X25519", "X448", "XDH"));

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final String f70293lmojexxdyd;

    public nufgyqmvbu(PublicKey publicKey) {
        super(publicKey);
        if (iozdgvuglv.wflxmlrfwp(publicKey)) {
            this.f70293lmojexxdyd = ojitshcjhn.iobyxmoadg(wkgbmnqykc.iobyxmoadg(publicKey).getParams()).getName();
        } else {
            if (ql.ojitshcjhn.draadjrbmk(publicKey)) {
                this.f70293lmojexxdyd = gxszxtbevo.iobyxmoadg(publicKey).getParams().getName();
                return;
            }
            throw new UncheckedJoseException("Unable to determine OKP subtype from " + publicKey);
        }
    }

    static boolean ylkuphrtab(Key key) {
        return f70292wwaezpbzkn.contains(key.getAlgorithm());
    }

    @Override // nl.gtknphoqwx
    protected void cqumvgiudr(Map map) {
        if (this.f70289pmvmpeiblj != null) {
            map.put("d", el.zoijcleaow.nufgyqmvbu(pkzmftpjix().btonecajqb(this.f70289pmvmpeiblj)));
        }
    }

    @Override // nl.gtknphoqwx
    protected void lereixgezr(Map map) {
        byte[] bArrGtknphoqwx = pkzmftpjix().gtknphoqwx(this.f70295esjtqupxsv);
        map.put("crv", this.f70293lmojexxdyd);
        map.put("x", el.zoijcleaow.nufgyqmvbu(bArrGtknphoqwx));
    }

    @Override // nl.ppxfxbqfkf
    public String nufgyqmvbu() {
        return "OKP";
    }

    jyumaefscl pkzmftpjix() {
        return jyumaefscl.lqeggnwhkg(this.f70293lmojexxdyd, this.f70291zynmafqrjb, null);
    }

    public nufgyqmvbu(Map map) {
        this(map, null);
    }

    public nufgyqmvbu(Map map, String str) throws JoseException {
        super(map, str);
        String strBtonecajqb = ppxfxbqfkf.btonecajqb(map, "crv", true);
        this.f70293lmojexxdyd = strBtonecajqb;
        try {
            jyumaefscl jyumaefsclVarPkzmftpjix = pkzmftpjix();
            if (jyumaefsclVarPkzmftpjix != null) {
                this.f70295esjtqupxsv = jyumaefsclVarPkzmftpjix.dxjokdxxww(el.zoijcleaow.lqeggnwhkg(ppxfxbqfkf.btonecajqb(map, "x", true)), strBtonecajqb);
                jyumaefscl();
                if (map.containsKey("d")) {
                    this.f70289pmvmpeiblj = jyumaefsclVarPkzmftpjix.nufgyqmvbu(el.zoijcleaow.lqeggnwhkg(ppxfxbqfkf.btonecajqb(map, "d", false)), strBtonecajqb);
                }
                rgvfuqvkyq("crv", "x", "d");
                return;
            }
            throw new InvalidKeyException("\"" + strBtonecajqb + "\" is an unknown or unsupported subtype value for the \"crv\" parameter.");
        } catch (NoClassDefFoundError e13) {
            throw new JoseException("Unable to instantiate key for OKP JWK with " + this.f70293lmojexxdyd + ". " + rl.zoijcleaow.iobyxmoadg(e13));
        }
    }
}
