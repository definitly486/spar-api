package ll;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.jose4j.lang.InvalidKeyException;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk extends esjtqupxsv implements yggfygwlhe {

    public static class iobyxmoadg extends iwizpuwonk implements yggfygwlhe {
        public iobyxmoadg() {
            super("RSA/ECB/PKCS1Padding", "RSA1_5");
        }

        @Override // ll.esjtqupxsv, ll.yggfygwlhe
        public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
            String strIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
            int iZoijcleaow = dxjokdxxwwVar.zoijcleaow();
            SecretKeySpec secretKeySpec = new SecretKeySpec(rl.iobyxmoadg.btonecajqb(iZoijcleaow), strIobyxmoadg);
            try {
                Key keyYggfygwlhe = yggfygwlhe(lqeggnwhkgVar, bArr, iobyxmoadgVar, dxjokdxxwwVar);
                return keyYggfygwlhe.getEncoded().length != iZoijcleaow ? secretKeySpec : keyYggfygwlhe;
            } catch (Exception e13) {
                if (!this.f63305gxszxtbevo.nufgyqmvbu()) {
                    return secretKeySpec;
                }
                this.f63305gxszxtbevo.yggfygwlhe("Key unwrap/decrypt failed. Substituting a randomly generated CEK and proceeding. {}", rl.zoijcleaow.zoijcleaow(e13, zdlpuopuiu.class));
                return secretKeySpec;
            }
        }
    }

    public static class ppxfxbqfkf extends iwizpuwonk implements yggfygwlhe {
        public ppxfxbqfkf() {
            super("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", "RSA-OAEP");
        }
    }

    public static class zoijcleaow extends iwizpuwonk implements yggfygwlhe {
        public zoijcleaow() {
            super("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", "RSA-OAEP-256");
            zdlpuopuiu(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        }

        @Override // ll.iwizpuwonk, kl.iobyxmoadg
        public boolean btonecajqb() {
            try {
                return zoijcleaow(nl.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("{\"kty\":\"RSA\",\"n\":\"sXchDaQebHnPiGvyDOAT4saGEUetSyo9MKLOoWFsueri23bOdgWp4Dy1WlUzewbgBHod5pcM9H95GQRV3JDXboIRROSBigeC5yjU1hGzHHyXss8UDprecbAYxknTcQkhslANGRUZmdTOQ5qTRsLAt6BTYuyvVRdhS8exSZEy_c4gs_7svlJJQ4H9_NxsiIoLwAEk7-Q3UXERGYw_75IDrGA84-lA_-Ct4eTlXHBIY2EaV7t7LjJaynVJCpkv4LKjTTAumiGUIuQhrNhZLuF_RJLqHpM2kgWFLU7-VTdL1VbC2tejvcI2BlMkEpk1BzBZI0KQB0GaDWFLN-aEAw3vRw\",\"e\":\"AQAB\"}").wkgbmnqykc(), new dxjokdxxww(16, "AES"), null, null, new gl.iobyxmoadg()) != null;
            } catch (JoseException e13) {
                this.f63305gxszxtbevo.wkgbmnqykc(eablkybsjg() + " is not available due to " + rl.zoijcleaow.iobyxmoadg(e13));
                return false;
            }
        }
    }

    public iwizpuwonk(String str, String str2) {
        super(str, str2);
        rgvfuqvkyq("RSA");
        ojitshcjhn(ql.kcexrzcfyt.ASYMMETRIC);
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        try {
            return gxszxtbevo.iobyxmoadg(draadjrbmk(), null) != null;
        } catch (JoseException unused) {
            return false;
        }
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        pl.wkgbmnqykc.ppxfxbqfkf((PublicKey) pl.wkgbmnqykc.iobyxmoadg(key, PublicKey.class));
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        pl.wkgbmnqykc.ppxfxbqfkf((PrivateKey) pl.wkgbmnqykc.iobyxmoadg(key, PrivateKey.class));
    }
}
