package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final OutputStream f60041eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f60042iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f60045zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f60044wkgbmnqykc = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f60043ppxfxbqfkf = 0;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f60041eablkybsjg = outputStream;
        this.f60042iobyxmoadg = bArr;
        this.f60045zoijcleaow = bArr.length;
    }

    public static int agtfadlqog(agtfadlqog agtfadlqogVar) {
        return agtfadlqogVar.getSerializedSize();
    }

    public static int btonecajqb(int i13) {
        return 4;
    }

    public static int cdpycssgdh(int i13) {
        return yggfygwlhe(i13);
    }

    public static int cqumvgiudr(long j13) {
        return 8;
    }

    public static int draadjrbmk(int i13, float f13) {
        return istkbnxepw(i13) + wflxmlrfwp(f13);
    }

    public static int dxjokdxxww(int i13) {
        return rgvfuqvkyq(i13);
    }

    public static int eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        return yggfygwlhe(wkgbmnqykcVar.size()) + wkgbmnqykcVar.size();
    }

    public static int esjtqupxsv(int i13) {
        return yggfygwlhe(iozdgvuglv(i13));
    }

    public static int gtknphoqwx(long j13) {
        return 8;
    }

    public static int gxszxtbevo(int i13, double d13) {
        return istkbnxepw(i13) + lqeggnwhkg(d13);
    }

    public static int iobyxmoadg(int i13, boolean z13) {
        return istkbnxepw(i13) + zoijcleaow(z13);
    }

    public static int iozdgvuglv(int i13) {
        return (i13 >> 31) ^ (i13 << 1);
    }

    public static int istkbnxepw(int i13) {
        return yggfygwlhe(jyumaefscl.ppxfxbqfkf(i13, 0));
    }

    public static int iwizpuwonk(int i13) {
        return 4;
    }

    public static int jyumaefscl(long j13) {
        if (((-128) & j13) == 0) {
            return 1;
        }
        if (((-16384) & j13) == 0) {
            return 2;
        }
        if (((-2097152) & j13) == 0) {
            return 3;
        }
        if (((-268435456) & j13) == 0) {
            return 4;
        }
        if (((-34359738368L) & j13) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j13) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j13) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j13) == 0) {
            return 8;
        }
        return (j13 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int kcexrzcfyt(agtfadlqog agtfadlqogVar) {
        int serializedSize = agtfadlqogVar.getSerializedSize();
        return yggfygwlhe(serializedSize) + serializedSize;
    }

    public static int lereixgezr(int i13, long j13) {
        return istkbnxepw(i13) + pmvmpeiblj(j13);
    }

    public static long lmojexxdyd(long j13) {
        return (j13 >> 63) ^ (j13 << 1);
    }

    public static int lqeggnwhkg(double d13) {
        return 8;
    }

    public static int nufgyqmvbu(int i13, int i14) {
        return istkbnxepw(i13) + dxjokdxxww(i14);
    }

    public static int ojitshcjhn(int i13, int i14) {
        return istkbnxepw(i13) + rgvfuqvkyq(i14);
    }

    public static int oxmwwwfdhm(int i13, agtfadlqog agtfadlqogVar) {
        return istkbnxepw(i13) + kcexrzcfyt(agtfadlqogVar);
    }

    private void pkzmftpjix() throws IOException {
        OutputStream outputStream = this.f60041eablkybsjg;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f60042iobyxmoadg, 0, this.f60043ppxfxbqfkf);
        this.f60043ppxfxbqfkf = 0;
    }

    public static int pmvmpeiblj(long j13) {
        return jyumaefscl(lmojexxdyd(j13));
    }

    public static int ppxfxbqfkf(byte[] bArr) {
        return yggfygwlhe(bArr.length) + bArr.length;
    }

    public static int rgvfuqvkyq(int i13) {
        if (i13 >= 0) {
            return yggfygwlhe(i13);
        }
        return 10;
    }

    public static int vdvldrhtss(long j13) {
        return jyumaefscl(j13);
    }

    public static int wflxmlrfwp(float f13) {
        return 4;
    }

    public static int wkgbmnqykc(int i13, wkgbmnqykc wkgbmnqykcVar) {
        return istkbnxepw(i13) + eablkybsjg(wkgbmnqykcVar);
    }

    public static int yadqdtsiqt(long j13) {
        return jyumaefscl(j13);
    }

    public static int yggfygwlhe(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    public static CodedOutputStream ylkuphrtab(OutputStream outputStream, int i13) {
        return new CodedOutputStream(outputStream, new byte[i13]);
    }

    static int zdlpuopuiu(int i13) {
        if (i13 > 4096) {
            return 4096;
        }
        return i13;
    }

    public static int zoijcleaow(boolean z13) {
        return 1;
    }

    public static int zynmafqrjb(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return yggfygwlhe(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported.", e13);
        }
    }

    public void bfopjjpdmp(int i13) throws IOException {
        ydmasvzmpa(i13);
    }

    public void cllcsxoeiz(int i13, wkgbmnqykc wkgbmnqykcVar) throws IOException {
        nuxfzjnpeb(i13, 2);
        dsvhmnatus(wkgbmnqykcVar);
    }

    public void crxdokpmqz(int i13, agtfadlqog agtfadlqogVar) throws IOException {
        nuxfzjnpeb(i13, 3);
        jlmebxxoox(agtfadlqogVar);
        nuxfzjnpeb(i13, 4);
    }

    public void czzsidtyhn(wkgbmnqykc wkgbmnqykcVar, int i13, int i14) throws IOException {
        int i15 = this.f60045zoijcleaow;
        int i16 = this.f60043ppxfxbqfkf;
        if (i15 - i16 >= i14) {
            wkgbmnqykcVar.dxjokdxxww(this.f60042iobyxmoadg, i13, i16, i14);
            this.f60043ppxfxbqfkf += i14;
            this.f60044wkgbmnqykc += i14;
            return;
        }
        int i17 = i15 - i16;
        wkgbmnqykcVar.dxjokdxxww(this.f60042iobyxmoadg, i13, i16, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f60043ppxfxbqfkf = this.f60045zoijcleaow;
        this.f60044wkgbmnqykc += i17;
        pkzmftpjix();
        if (i19 <= this.f60045zoijcleaow) {
            wkgbmnqykcVar.dxjokdxxww(this.f60042iobyxmoadg, i18, 0, i19);
            this.f60043ppxfxbqfkf = i19;
        } else {
            wkgbmnqykcVar.yggfygwlhe(this.f60041eablkybsjg, i18, i19);
        }
        this.f60044wkgbmnqykc += i19;
    }

    public void dsvhmnatus(wkgbmnqykc wkgbmnqykcVar) throws IOException {
        zfvoamnweg(wkgbmnqykcVar.size());
        rlfsiqarku(wkgbmnqykcVar);
    }

    public void hcddaimhww(int i13, boolean z13) throws IOException {
        nuxfzjnpeb(i13, 0);
        jpowsppfya(z13);
    }

    public void hkdspvbjdz(byte[] bArr) throws IOException {
        zfvoamnweg(bArr.length);
        uwvvkdfqfp(bArr);
    }

    public void ikoacuggdj(int i13, agtfadlqog agtfadlqogVar) throws IOException {
        nuxfzjnpeb(i13, 2);
        okpsazkaxt(agtfadlqogVar);
    }

    public void iyctptxqzt(int i13) throws IOException {
        zfvoamnweg(iozdgvuglv(i13));
    }

    public void jhduphickx(long j13) throws IOException {
        oipsdeybqn(j13);
    }

    public void jlmebxxoox(agtfadlqog agtfadlqogVar) {
        agtfadlqogVar.iobyxmoadg(this);
    }

    public void jpowsppfya(boolean z13) throws IOException {
        metgxyhuhe(z13 ? 1 : 0);
    }

    public void jztzpxfvev(int i13, agtfadlqog agtfadlqogVar) throws IOException {
        nuxfzjnpeb(1, 3);
        tbqsvytpvh(2, i13);
        ikoacuggdj(3, agtfadlqogVar);
        nuxfzjnpeb(1, 4);
    }

    public void kegysxyocb(int i13, int i14) throws IOException {
        nuxfzjnpeb(i13, 0);
        tzroggbefp(i14);
    }

    public void lrnfpwlwnk(long j13) throws IOException {
        oipsdeybqn(lmojexxdyd(j13));
    }

    public void mbcevpiqjq(int i13) throws IOException {
        ydmasvzmpa(i13);
    }

    public void metgxyhuhe(int i13) throws IOException {
        xrmfcynszj((byte) i13);
    }

    public void ntlheqmsrt(long j13) throws IOException {
        sflfametgt(j13);
    }

    public void nuxfzjnpeb(int i13, int i14) throws IOException {
        zfvoamnweg(jyumaefscl.ppxfxbqfkf(i13, i14));
    }

    public void oipsdeybqn(long j13) throws IOException {
        while (((-128) & j13) != 0) {
            metgxyhuhe((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j13 >>>= 7;
        }
        metgxyhuhe((int) j13);
    }

    public void okpsazkaxt(agtfadlqog agtfadlqogVar) throws IOException {
        zfvoamnweg(agtfadlqogVar.getSerializedSize());
        agtfadlqogVar.iobyxmoadg(this);
    }

    public void opjhrmiecq(long j13) throws IOException {
        sflfametgt(j13);
    }

    public void ribwqtqdhb(int i13, int i14) throws IOException {
        nuxfzjnpeb(i13, 0);
        vipkmwdibw(i14);
    }

    public void rlfsiqarku(wkgbmnqykc wkgbmnqykcVar) throws IOException {
        czzsidtyhn(wkgbmnqykcVar, 0, wkgbmnqykcVar.size());
    }

    public void roivzttewh(int i13) throws IOException {
        zfvoamnweg(i13);
    }

    public void sflfametgt(long j13) throws IOException {
        metgxyhuhe(((int) j13) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe(((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void sopmlzcsov(float f13) throws IOException {
        ydmasvzmpa(Float.floatToRawIntBits(f13));
    }

    public void stevsuqkhv(double d13) throws IOException {
        sflfametgt(Double.doubleToRawLongBits(d13));
    }

    public void tbqsvytpvh(int i13, int i14) throws IOException {
        nuxfzjnpeb(i13, 0);
        roivzttewh(i14);
    }

    public void tzroggbefp(int i13) throws IOException {
        vipkmwdibw(i13);
    }

    public void uawqvzlxes(long j13) throws IOException {
        oipsdeybqn(j13);
    }

    public void ulzqkzuiru(int i13, float f13) throws IOException {
        nuxfzjnpeb(i13, 5);
        sopmlzcsov(f13);
    }

    public void uwvvkdfqfp(byte[] bArr) throws IOException {
        yfnezrywwk(bArr, 0, bArr.length);
    }

    public void vipkmwdibw(int i13) throws IOException {
        if (i13 >= 0) {
            zfvoamnweg(i13);
        } else {
            oipsdeybqn(i13);
        }
    }

    public void weqkydbzbr(int i13, long j13) throws IOException {
        nuxfzjnpeb(i13, 0);
        lrnfpwlwnk(j13);
    }

    public void wwaezpbzkn() throws IOException {
        if (this.f60041eablkybsjg != null) {
            pkzmftpjix();
        }
    }

    public void wypolnanlu(int i13, double d13) throws IOException {
        nuxfzjnpeb(i13, 1);
        stevsuqkhv(d13);
    }

    public void xrmfcynszj(byte b13) throws IOException {
        if (this.f60043ppxfxbqfkf == this.f60045zoijcleaow) {
            pkzmftpjix();
        }
        byte[] bArr = this.f60042iobyxmoadg;
        int i13 = this.f60043ppxfxbqfkf;
        this.f60043ppxfxbqfkf = i13 + 1;
        bArr[i13] = b13;
        this.f60044wkgbmnqykc++;
    }

    public void ydmasvzmpa(int i13) throws IOException {
        metgxyhuhe(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        metgxyhuhe((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void yfnezrywwk(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f60045zoijcleaow;
        int i16 = this.f60043ppxfxbqfkf;
        if (i15 - i16 >= i14) {
            System.arraycopy(bArr, i13, this.f60042iobyxmoadg, i16, i14);
            this.f60043ppxfxbqfkf += i14;
            this.f60044wkgbmnqykc += i14;
            return;
        }
        int i17 = i15 - i16;
        System.arraycopy(bArr, i13, this.f60042iobyxmoadg, i16, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f60043ppxfxbqfkf = this.f60045zoijcleaow;
        this.f60044wkgbmnqykc += i17;
        pkzmftpjix();
        if (i19 <= this.f60045zoijcleaow) {
            System.arraycopy(bArr, i18, this.f60042iobyxmoadg, 0, i19);
            this.f60043ppxfxbqfkf = i19;
        } else {
            this.f60041eablkybsjg.write(bArr, i18, i19);
        }
        this.f60044wkgbmnqykc += i19;
    }

    public void zeieaojujs(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zfvoamnweg(bytes.length);
        uwvvkdfqfp(bytes);
    }

    public void zfvoamnweg(int i13) throws IOException {
        while ((i13 & (-128)) != 0) {
            metgxyhuhe((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i13 >>>= 7;
        }
        metgxyhuhe(i13);
    }
}
