package ql;

import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.XECPrivateKey;
import java.security.interfaces.XECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.NamedParameterSpec;
import java.util.Arrays;
import kotlin.KotlinVersion;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class iozdgvuglv extends jyumaefscl {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final BigInteger f79082ppxfxbqfkf = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564819949");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final BigInteger f79083wkgbmnqykc = new BigInteger("726838724295606890549323807888004534353641360687318060281490199180612328166730772686396383698676545930088884461843637361053498018365439");

    public iozdgvuglv(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public static boolean draadjrbmk(Key key) {
        try {
            return lereixgezr.iobyxmoadg(key);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean wflxmlrfwp(Key key) {
        try {
            return pmvmpeiblj.iobyxmoadg(key);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    @Override // ql.jyumaefscl
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public XECPrivateKey nufgyqmvbu(byte[] bArr, String str) throws JoseException {
        try {
            return esjtqupxsv.iobyxmoadg(zoijcleaow().generatePrivate(cdpycssgdh.iobyxmoadg(gxszxtbevo(str), bArr)));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }

    @Override // ql.jyumaefscl
    public byte[] btonecajqb(PrivateKey privateKey) {
        return (byte[]) esjtqupxsv.iobyxmoadg(privateKey).getScalar().orElse(rl.iobyxmoadg.f83021iobyxmoadg);
    }

    @Override // ql.jyumaefscl
    public byte[] gtknphoqwx(Key key) {
        XECPublicKey xECPublicKeyIobyxmoadg = ll.wflxmlrfwp.iobyxmoadg(key);
        BigInteger u13 = xECPublicKeyIobyxmoadg.getU();
        boolean zEquals = "X25519".equals(ll.ojitshcjhn.iobyxmoadg(xECPublicKeyIobyxmoadg.getParams()).getName());
        byte[] bArrDraadjrbmk = rl.iobyxmoadg.draadjrbmk(u13.mod(zEquals ? f79082ppxfxbqfkf : f79083wkgbmnqykc).toByteArray());
        int i13 = zEquals ? 32 : 57;
        return bArrDraadjrbmk.length != i13 ? Arrays.copyOf(bArrDraadjrbmk, i13) : bArrDraadjrbmk;
    }

    @Override // ql.oxmwwwfdhm
    String iobyxmoadg() {
        return "XDH";
    }

    @Override // ql.jyumaefscl
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public XECPublicKey dxjokdxxww(byte[] bArr, String str) throws JoseException {
        NamedParameterSpec namedParameterSpecGxszxtbevo = gxszxtbevo(str);
        byte[] bArrDraadjrbmk = rl.iobyxmoadg.draadjrbmk(bArr);
        int i13 = ("X25519".equals(str) ? KotlinVersion.MAX_COMPONENT_VALUE : 448) % 8;
        if (i13 != 0) {
            bArrDraadjrbmk[0] = (byte) (((1 << i13) - 1) & bArrDraadjrbmk[0]);
        }
        try {
            return ll.wflxmlrfwp.iobyxmoadg(zoijcleaow().generatePublic(yadqdtsiqt.iobyxmoadg(namedParameterSpecGxszxtbevo, new BigInteger(1, bArrDraadjrbmk))));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }
}
