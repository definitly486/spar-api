package nl;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;
import ql.iwizpuwonk;

/* JADX INFO: loaded from: classes3.dex */
public class draadjrbmk extends gtknphoqwx {
    public draadjrbmk(RSAPublicKey rSAPublicKey) {
        super(rSAPublicKey);
    }

    @Override // nl.gtknphoqwx
    protected void cqumvgiudr(Map map) {
        RSAPrivateKey rSAPrivateKeyYlkuphrtab = ylkuphrtab();
        if (rSAPrivateKeyYlkuphrtab != null) {
            yadqdtsiqt(map, "d", rSAPrivateKeyYlkuphrtab.getPrivateExponent());
            if (rSAPrivateKeyYlkuphrtab instanceof RSAPrivateCrtKey) {
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKeyYlkuphrtab;
                yadqdtsiqt(map, "p", rSAPrivateCrtKey.getPrimeP());
                yadqdtsiqt(map, "q", rSAPrivateCrtKey.getPrimeQ());
                yadqdtsiqt(map, "dp", rSAPrivateCrtKey.getPrimeExponentP());
                yadqdtsiqt(map, "dq", rSAPrivateCrtKey.getPrimeExponentQ());
                yadqdtsiqt(map, "qi", rSAPrivateCrtKey.getCrtCoefficient());
            }
        }
    }

    @Override // nl.gtknphoqwx
    protected void lereixgezr(Map map) {
        RSAPublicKey rSAPublicKeyPkzmftpjix = pkzmftpjix();
        yadqdtsiqt(map, "n", rSAPublicKeyPkzmftpjix.getModulus());
        yadqdtsiqt(map, "e", rSAPublicKeyPkzmftpjix.getPublicExponent());
    }

    @Override // nl.ppxfxbqfkf
    public String nufgyqmvbu() {
        return "RSA";
    }

    public RSAPublicKey pkzmftpjix() {
        return (RSAPublicKey) this.f70295esjtqupxsv;
    }

    public RSAPrivateKey ylkuphrtab() {
        return (RSAPrivateKey) this.f70289pmvmpeiblj;
    }

    public draadjrbmk(Map map) {
        this(map, null);
    }

    public draadjrbmk(Map map, String str) {
        super(map, str);
        BigInteger bigIntegerPmvmpeiblj = pmvmpeiblj(map, "n", true);
        BigInteger bigIntegerPmvmpeiblj2 = pmvmpeiblj(map, "e", true);
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk(str, null);
        this.f70295esjtqupxsv = iwizpuwonkVar.nufgyqmvbu(bigIntegerPmvmpeiblj, bigIntegerPmvmpeiblj2);
        jyumaefscl();
        if (map.containsKey("d")) {
            BigInteger bigIntegerPmvmpeiblj3 = pmvmpeiblj(map, "d", false);
            if (map.containsKey("p")) {
                this.f70289pmvmpeiblj = iwizpuwonkVar.lqeggnwhkg(bigIntegerPmvmpeiblj, bigIntegerPmvmpeiblj2, bigIntegerPmvmpeiblj3, pmvmpeiblj(map, "p", false), pmvmpeiblj(map, "q", false), pmvmpeiblj(map, "dp", false), pmvmpeiblj(map, "dq", false), pmvmpeiblj(map, "qi", false));
            } else {
                this.f70289pmvmpeiblj = iwizpuwonkVar.gxszxtbevo(bigIntegerPmvmpeiblj, bigIntegerPmvmpeiblj3);
            }
        }
        rgvfuqvkyq("n", "e", "d", "p", "q", "dp", "dq", "qi");
    }
}
