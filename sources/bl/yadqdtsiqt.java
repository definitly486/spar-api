package bl;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class yadqdtsiqt extends gxszxtbevo {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final transient byte[][] f16753esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final transient int[] f16754lereixgezr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yadqdtsiqt(byte[][] segments, int[] directory) {
        super(gxszxtbevo.f16673cqumvgiudr.agtfadlqog());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(segments, "segments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(directory, "directory");
        this.f16753esjtqupxsv = segments;
        this.f16754lereixgezr = directory;
    }

    private final gxszxtbevo ntlheqmsrt() {
        return new gxszxtbevo(mbcevpiqjq());
    }

    private final Object writeReplace() {
        gxszxtbevo gxszxtbevoVarNtlheqmsrt = ntlheqmsrt();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVarNtlheqmsrt, "null cannot be cast to non-null type java.lang.Object");
        return gxszxtbevoVarNtlheqmsrt;
    }

    @Override // bl.gxszxtbevo
    public gxszxtbevo dsvhmnatus() {
        return ntlheqmsrt().dsvhmnatus();
    }

    @Override // bl.gxszxtbevo
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxszxtbevo) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            if (gxszxtbevoVar.hcddaimhww() == hcddaimhww() && yadqdtsiqt(0, gxszxtbevoVar, 0, hcddaimhww())) {
                return true;
            }
        }
        return false;
    }

    @Override // bl.gxszxtbevo
    public int hashCode() {
        int iOjitshcjhn = ojitshcjhn();
        if (iOjitshcjhn != 0) {
            return iOjitshcjhn;
        }
        int length = tzroggbefp().length;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        while (i13 < length) {
            int i16 = kegysxyocb()[length + i13];
            int i17 = kegysxyocb()[i13];
            byte[] bArr = tzroggbefp()[i13];
            int i18 = (i17 - i15) + i16;
            while (i16 < i18) {
                i14 = (i14 * 31) + bArr[i16];
                i16++;
            }
            i13++;
            i15 = i17;
        }
        wwaezpbzkn(i14);
        return i14;
    }

    @Override // bl.gxszxtbevo
    public gxszxtbevo hkdspvbjdz(int i13, int i14) {
        int iWkgbmnqykc = cllcsxoeiz.wkgbmnqykc(this, i14);
        if (i13 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i13 + " < 0").toString());
        }
        if (iWkgbmnqykc > hcddaimhww()) {
            throw new IllegalArgumentException(("endIndex=" + iWkgbmnqykc + " > length(" + hcddaimhww() + ')').toString());
        }
        int i15 = iWkgbmnqykc - i13;
        if (i15 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iWkgbmnqykc + " < beginIndex=" + i13).toString());
        }
        if (i13 == 0 && iWkgbmnqykc == hcddaimhww()) {
            return this;
        }
        if (i13 == iWkgbmnqykc) {
            return gxszxtbevo.f16673cqumvgiudr;
        }
        int iZoijcleaow = cl.btonecajqb.zoijcleaow(this, i13);
        int iZoijcleaow2 = cl.btonecajqb.zoijcleaow(this, iWkgbmnqykc - 1);
        byte[][] bArr = (byte[][]) hg.agtfadlqog.yggfygwlhe(tzroggbefp(), iZoijcleaow, iZoijcleaow2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iZoijcleaow <= iZoijcleaow2) {
            int i16 = iZoijcleaow;
            int i17 = 0;
            while (true) {
                iArr[i17] = Math.min(kegysxyocb()[i16] - i13, i15);
                int i18 = i17 + 1;
                iArr[i17 + bArr.length] = kegysxyocb()[tzroggbefp().length + i16];
                if (i16 == iZoijcleaow2) {
                    break;
                }
                i16++;
                i17 = i18;
            }
        }
        int i19 = iZoijcleaow != 0 ? kegysxyocb()[iZoijcleaow - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i13 - i19);
        return new yadqdtsiqt(bArr, iArr);
    }

    @Override // bl.gxszxtbevo
    public ByteBuffer iobyxmoadg() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(mbcevpiqjq()).asReadOnlyBuffer();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(byteBufferAsReadOnlyBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // bl.gxszxtbevo
    public int istkbnxepw(byte[] other, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return ntlheqmsrt().istkbnxepw(other, i13);
    }

    @Override // bl.gxszxtbevo
    public int jyumaefscl(byte[] other, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return ntlheqmsrt().jyumaefscl(other, i13);
    }

    @Override // bl.gxszxtbevo
    public String kcexrzcfyt() {
        return ntlheqmsrt().kcexrzcfyt();
    }

    public final int[] kegysxyocb() {
        return this.f16754lereixgezr;
    }

    @Override // bl.gxszxtbevo
    public byte[] lereixgezr() {
        return mbcevpiqjq();
    }

    @Override // bl.gxszxtbevo
    public boolean lmojexxdyd(int i13, byte[] other, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (i13 < 0 || i13 > hcddaimhww() - i15 || i14 < 0 || i14 > other.length - i15) {
            return false;
        }
        int i16 = i15 + i13;
        int iZoijcleaow = cl.btonecajqb.zoijcleaow(this, i13);
        while (i13 < i16) {
            int i17 = iZoijcleaow == 0 ? 0 : kegysxyocb()[iZoijcleaow - 1];
            int i18 = kegysxyocb()[iZoijcleaow] - i17;
            int i19 = kegysxyocb()[tzroggbefp().length + iZoijcleaow];
            int iMin = Math.min(i16, i18 + i17) - i13;
            if (!cllcsxoeiz.iobyxmoadg(tzroggbefp()[iZoijcleaow], i19 + (i13 - i17), other, i14, iMin)) {
                return false;
            }
            i14 += iMin;
            i13 += iMin;
            iZoijcleaow++;
        }
        return true;
    }

    public byte[] mbcevpiqjq() {
        byte[] bArr = new byte[hcddaimhww()];
        int length = tzroggbefp().length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int i16 = kegysxyocb()[length + i13];
            int i17 = kegysxyocb()[i13];
            int i18 = i17 - i14;
            hg.agtfadlqog.dxjokdxxww(tzroggbefp()[i13], bArr, i15, i16, i16 + i18);
            i15 += i18;
            i13++;
            i14 = i17;
        }
        return bArr;
    }

    @Override // bl.gxszxtbevo
    public gxszxtbevo nufgyqmvbu(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = tzroggbefp().length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = kegysxyocb()[length + i13];
            int i16 = kegysxyocb()[i13];
            messageDigest.update(tzroggbefp()[i13], i15, i16 - i14);
            i13++;
            i14 = i16;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(digestBytes, "digestBytes");
        return new gxszxtbevo(digestBytes);
    }

    @Override // bl.gxszxtbevo
    public byte pmvmpeiblj(int i13) {
        cllcsxoeiz.zoijcleaow(kegysxyocb()[tzroggbefp().length - 1], i13, 1L);
        int iZoijcleaow = cl.btonecajqb.zoijcleaow(this, i13);
        return tzroggbefp()[iZoijcleaow][(i13 - (iZoijcleaow == 0 ? 0 : kegysxyocb()[iZoijcleaow - 1])) + kegysxyocb()[tzroggbefp().length + iZoijcleaow]];
    }

    @Override // bl.gxszxtbevo
    public int rgvfuqvkyq() {
        return kegysxyocb()[tzroggbefp().length - 1];
    }

    @Override // bl.gxszxtbevo
    public void stevsuqkhv(ppxfxbqfkf buffer, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        int i15 = i13 + i14;
        int iZoijcleaow = cl.btonecajqb.zoijcleaow(this, i13);
        while (i13 < i15) {
            int i16 = iZoijcleaow == 0 ? 0 : kegysxyocb()[iZoijcleaow - 1];
            int i17 = kegysxyocb()[iZoijcleaow] - i16;
            int i18 = kegysxyocb()[tzroggbefp().length + iZoijcleaow];
            int iMin = Math.min(i15, i17 + i16) - i13;
            int i19 = i18 + (i13 - i16);
            istkbnxepw istkbnxepwVar = new istkbnxepw(tzroggbefp()[iZoijcleaow], i19, i19 + iMin, true, false);
            istkbnxepw istkbnxepwVar2 = buffer.f16740zdlpuopuiu;
            if (istkbnxepwVar2 == null) {
                istkbnxepwVar.f16701lqeggnwhkg = istkbnxepwVar;
                istkbnxepwVar.f16699gxszxtbevo = istkbnxepwVar;
                buffer.f16740zdlpuopuiu = istkbnxepwVar;
            } else {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
                istkbnxepw istkbnxepwVar3 = istkbnxepwVar2.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
                istkbnxepwVar3.ppxfxbqfkf(istkbnxepwVar);
            }
            i13 += iMin;
            iZoijcleaow++;
        }
        buffer.hkdspvbjdz(buffer.dsvhmnatus() + ((long) i14));
    }

    @Override // bl.gxszxtbevo
    public String toString() {
        return ntlheqmsrt().toString();
    }

    public final byte[][] tzroggbefp() {
        return this.f16753esjtqupxsv;
    }

    @Override // bl.gxszxtbevo
    public String wkgbmnqykc() {
        return ntlheqmsrt().wkgbmnqykc();
    }

    @Override // bl.gxszxtbevo
    public boolean yadqdtsiqt(int i13, gxszxtbevo other, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (i13 < 0 || i13 > hcddaimhww() - i15) {
            return false;
        }
        int i16 = i15 + i13;
        int iZoijcleaow = cl.btonecajqb.zoijcleaow(this, i13);
        while (i13 < i16) {
            int i17 = iZoijcleaow == 0 ? 0 : kegysxyocb()[iZoijcleaow - 1];
            int i18 = kegysxyocb()[iZoijcleaow] - i17;
            int i19 = kegysxyocb()[tzroggbefp().length + iZoijcleaow];
            int iMin = Math.min(i16, i18 + i17) - i13;
            if (!other.lmojexxdyd(i14, tzroggbefp()[iZoijcleaow], i19 + (i13 - i17), iMin)) {
                return false;
            }
            i14 += iMin;
            i13 += iMin;
            iZoijcleaow++;
        }
        return true;
    }
}
