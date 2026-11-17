package ql;

import java.security.Key;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.EdECPrivateKey;
import java.security.interfaces.EdECPublicKey;
import java.security.spec.EdECPoint;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public class ojitshcjhn extends jyumaefscl {
    public ojitshcjhn(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public static boolean draadjrbmk(Key key) {
        try {
            return eablkybsjg.iobyxmoadg(key);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    @Override // ql.jyumaefscl
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public EdECPublicKey dxjokdxxww(byte[] bArr, String str) throws JoseException {
        byte[] bArr2 = (byte[]) bArr.clone();
        byte b13 = bArr2[bArr2.length - 1];
        int length = bArr2.length - 1;
        bArr2[length] = (byte) (bArr2[length] & 127);
        try {
            return lqeggnwhkg.iobyxmoadg(zoijcleaow().generatePublic(agtfadlqog.iobyxmoadg(gxszxtbevo(str), wflxmlrfwp.iobyxmoadg((b13 & (-128)) != 0, zoijcleaow.zoijcleaow(rl.iobyxmoadg.draadjrbmk(bArr2))))));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }

    @Override // ql.jyumaefscl
    public byte[] btonecajqb(PrivateKey privateKey) {
        return (byte[]) wkgbmnqykc.iobyxmoadg(privateKey).getBytes().orElse(rl.iobyxmoadg.f83021iobyxmoadg);
    }

    @Override // ql.jyumaefscl
    public byte[] gtknphoqwx(Key key) {
        EdECPublicKey edECPublicKeyIobyxmoadg = lqeggnwhkg.iobyxmoadg(key);
        EdECPoint point = edECPublicKeyIobyxmoadg.getPoint();
        byte[] bArrDraadjrbmk = rl.iobyxmoadg.draadjrbmk(point.getY().toByteArray());
        int i13 = edECPublicKeyIobyxmoadg.getParams().getName().equals("Ed25519") ? 32 : 57;
        if (bArrDraadjrbmk.length != i13) {
            bArrDraadjrbmk = Arrays.copyOf(bArrDraadjrbmk, i13);
        }
        byte b13 = point.isXOdd() ? (byte) -128 : (byte) 0;
        int length = bArrDraadjrbmk.length - 1;
        bArrDraadjrbmk[length] = (byte) (b13 | bArrDraadjrbmk[length]);
        return bArrDraadjrbmk;
    }

    @Override // ql.oxmwwwfdhm
    String iobyxmoadg() {
        return "EDDSA";
    }

    @Override // ql.jyumaefscl
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public EdECPrivateKey nufgyqmvbu(byte[] bArr, String str) throws JoseException {
        try {
            return wkgbmnqykc.iobyxmoadg(zoijcleaow().generatePrivate(draadjrbmk.iobyxmoadg(gxszxtbevo(str), bArr)));
        } catch (InvalidKeySpecException e13) {
            throw new JoseException("Invalid key spec: " + e13, e13);
        }
    }
}
