package ol;

import java.io.IOException;
import kotlin.KotlinVersion;
import nl.gtknphoqwx;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow extends ol.iobyxmoadg implements eablkybsjg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f73155dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f73156nufgyqmvbu;

    public static class iobyxmoadg extends zoijcleaow {
        public iobyxmoadg() {
            super("ES256", "SHA256withECDSA", "P-256", 64);
        }
    }

    public static class ppxfxbqfkf extends zoijcleaow {
        public ppxfxbqfkf() {
            super("ES512", "SHA512withECDSA", "P-521", 132);
        }
    }

    public static class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        am.iobyxmoadg f73157btonecajqb;

        public wkgbmnqykc() {
            super("ES256K", "SHA256withECDSA", "secp256k1", 64);
            this.f73157btonecajqb = am.zoijcleaow.dxjokdxxww(getClass());
        }

        @Override // ol.iobyxmoadg, kl.iobyxmoadg
        public boolean btonecajqb() {
            if (super.btonecajqb()) {
                try {
                    return jyumaefscl(zdlpuopuiu(gtknphoqwx.iobyxmoadg.iobyxmoadg("{\"kty\":\"EC\",\"x\":\"gi0g9DzM2SvjVV7iD_upIU0urmZRjpoIc4Efu8563y8\",\"y\":\"Y5K6GofrdlWNLlfT8-AEyJyVZ3yJJcGgkGroHQCAhmk\",\"crv\":\"secp256k1\",\"d\":\"Vd99BKh6pxt3mXSDJzHuVrCq52xBXAKVahbuFb6dqBc\"}").istkbnxepw(), new gl.iobyxmoadg()), new byte[]{2, 6}) != null;
                } catch (JoseException e13) {
                    this.f73157btonecajqb.wkgbmnqykc(eablkybsjg() + " is not available due to " + rl.zoijcleaow.iobyxmoadg(e13));
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ol.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static class C1595zoijcleaow extends zoijcleaow {
        public C1595zoijcleaow() {
            super("ES384", "SHA384withECDSA", "P-384", 96);
        }
    }

    public zoijcleaow(String str, String str2, String str3, int i13) {
        super(str, str2, "EC");
        this.f73156nufgyqmvbu = str3;
        this.f73155dxjokdxxww = i13;
    }

    public static byte[] iwizpuwonk(byte[] bArr, int i13) throws IOException {
        int i14;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new IOException("Invalid format of ECDSA signature");
        }
        byte b13 = bArr[1];
        if (b13 > 0) {
            i14 = 2;
        } else {
            if (b13 != -127) {
                throw new IOException("Invalid format of ECDSA signature");
            }
            i14 = 3;
        }
        int i15 = bArr[i14 + 1];
        int i16 = i15;
        while (i16 > 0 && bArr[((i14 + 2) + i15) - i16] == 0) {
            i16--;
        }
        int i17 = i14 + 2 + i15;
        int i18 = bArr[i17 + 1];
        int i19 = i18;
        while (i19 > 0 && bArr[((i17 + 2) + i18) - i19] == 0) {
            i19--;
        }
        int iMax = Math.max(Math.max(i16, i19), i13 / 2);
        int i23 = bArr[i14 - 1];
        if ((i23 & KotlinVersion.MAX_COMPONENT_VALUE) != bArr.length - i14 || (i23 & KotlinVersion.MAX_COMPONENT_VALUE) != i15 + 4 + i18 || bArr[i14] != 2 || bArr[i17] != 2) {
            throw new IOException("Invalid format of ECDSA signature");
        }
        int i24 = iMax * 2;
        byte[] bArr2 = new byte[i24];
        System.arraycopy(bArr, i17 - i16, bArr2, iMax - i16, i16);
        System.arraycopy(bArr, ((i17 + 2) + i18) - i19, bArr2, i24 - i19, i19);
        return bArr2;
    }

    @Override // ol.iobyxmoadg
    public byte[] jyumaefscl(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr) throws JoseException {
        try {
            return iwizpuwonk(super.jyumaefscl(lqeggnwhkgVar, bArr), this.f73155dxjokdxxww);
        } catch (IOException e13) {
            throw new JoseException("Unable to convert DER encoding to R and S as a concatenated byte array.", e13);
        }
    }
}
