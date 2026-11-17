package h3;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix extends androidx.media3.common.audio.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f39256agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final short f39257btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final long f39258draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final float f39259dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f39260gtknphoqwx;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private byte[] f39261jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private byte[] f39262kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f39263ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f39264oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f39265rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private long f39266vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final long f39267wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f39268yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f39269zdlpuopuiu;

    public pkzmftpjix() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private int agtfadlqog(int i13) {
        int i14 = this.f39256agtfadlqog;
        return (i13 / i14) * i14;
    }

    private void cqumvgiudr(ByteBuffer byteBuffer) {
        draadjrbmk(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void esjtqupxsv(byte[] bArr, int i13, int i14) {
        y2.iobyxmoadg.zoijcleaow(i13 % this.f39256agtfadlqog == 0, "byteOutput size is not aligned to frame size " + i13);
        iwizpuwonk(bArr, i13, i14);
        draadjrbmk(i13).put(bArr, 0, i13).flip();
    }

    private static int iozdgvuglv(byte b13, byte b14) {
        return (b13 << 8) | (b14 & 255);
    }

    private static void istkbnxepw(byte[] bArr, int i13, int i14) {
        if (i14 >= 32767) {
            bArr[i13] = -1;
            bArr[i13 + 1] = 127;
        } else if (i14 <= -32768) {
            bArr[i13] = 0;
            bArr[i13 + 1] = -128;
        } else {
            bArr[i13] = (byte) (i14 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i13 + 1] = (byte) (i14 >> 8);
        }
    }

    private void iwizpuwonk(byte[] bArr, int i13, int i14) {
        if (i14 == 3) {
            return;
        }
        for (int i15 = 0; i15 < i13; i15 += 2) {
            istkbnxepw(bArr, i15, (iozdgvuglv(bArr[i15 + 1], bArr[i15]) * (i14 == 0 ? rgvfuqvkyq(i15, i13 - 1) : i14 == 2 ? ojitshcjhn(i15, i13 - 1) : this.f39260gtknphoqwx)) / 100);
        }
    }

    private boolean jyumaefscl(byte b13, byte b14) {
        return Math.abs(iozdgvuglv(b13, b14)) > this.f39257btonecajqb;
    }

    private int kcexrzcfyt(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (jyumaefscl(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i13 = this.f39256agtfadlqog;
                return ((iLimit / i13) * i13) + i13;
            }
        }
        return byteBuffer.position();
    }

    private void lereixgezr(boolean z13) {
        int length;
        int iVdvldrhtss;
        int i13 = this.f39268yggfygwlhe;
        byte[] bArr = this.f39262kcexrzcfyt;
        if (i13 == bArr.length || z13) {
            if (this.f39264oxmwwwfdhm == 0) {
                if (z13) {
                    pmvmpeiblj(i13, 3);
                    length = i13;
                } else {
                    y2.iobyxmoadg.lqeggnwhkg(i13 >= bArr.length / 2);
                    length = this.f39262kcexrzcfyt.length / 2;
                    pmvmpeiblj(length, 0);
                }
                iVdvldrhtss = length;
            } else if (z13) {
                int length2 = i13 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iVdvldrhtss2 = vdvldrhtss(length2) + (this.f39262kcexrzcfyt.length / 2);
                pmvmpeiblj(iVdvldrhtss2, 2);
                iVdvldrhtss = iVdvldrhtss2;
                length = length3;
            } else {
                length = i13 - (bArr.length / 2);
                iVdvldrhtss = vdvldrhtss(length);
                pmvmpeiblj(iVdvldrhtss, 1);
            }
            y2.iobyxmoadg.nufgyqmvbu(length % this.f39256agtfadlqog == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            y2.iobyxmoadg.lqeggnwhkg(i13 >= iVdvldrhtss);
            this.f39268yggfygwlhe -= length;
            int i14 = this.f39269zdlpuopuiu + length;
            this.f39269zdlpuopuiu = i14;
            this.f39269zdlpuopuiu = i14 % this.f39262kcexrzcfyt.length;
            int i15 = this.f39264oxmwwwfdhm;
            int i16 = this.f39256agtfadlqog;
            this.f39264oxmwwwfdhm = i15 + (iVdvldrhtss / i16);
            this.f39266vdvldrhtss += (long) ((length - iVdvldrhtss) / i16);
        }
    }

    private int ojitshcjhn(int i13, int i14) {
        int i15 = this.f39260gtknphoqwx;
        return i15 + ((((100 - i15) * (i13 * 1000)) / i14) / 1000);
    }

    private int oxmwwwfdhm(long j13) {
        return (int) ((j13 * ((long) this.f9707zoijcleaow.f9652iobyxmoadg)) / 1000000);
    }

    private void pmvmpeiblj(int i13, int i14) {
        if (i13 == 0) {
            return;
        }
        y2.iobyxmoadg.iobyxmoadg(this.f39268yggfygwlhe >= i13);
        if (i14 == 2) {
            int i15 = this.f39269zdlpuopuiu;
            int i16 = this.f39268yggfygwlhe;
            int i17 = i15 + i16;
            byte[] bArr = this.f39262kcexrzcfyt;
            if (i17 <= bArr.length) {
                System.arraycopy(bArr, (i15 + i16) - i13, this.f39261jyumaefscl, 0, i13);
            } else {
                int length = i16 - (bArr.length - i15);
                if (length >= i13) {
                    System.arraycopy(bArr, length - i13, this.f39261jyumaefscl, 0, i13);
                } else {
                    int i18 = i13 - length;
                    System.arraycopy(bArr, bArr.length - i18, this.f39261jyumaefscl, 0, i18);
                    System.arraycopy(this.f39262kcexrzcfyt, 0, this.f39261jyumaefscl, i18, length);
                }
            }
        } else {
            int i19 = this.f39269zdlpuopuiu;
            int i23 = i19 + i13;
            byte[] bArr2 = this.f39262kcexrzcfyt;
            if (i23 <= bArr2.length) {
                System.arraycopy(bArr2, i19, this.f39261jyumaefscl, 0, i13);
            } else {
                int length2 = bArr2.length - i19;
                System.arraycopy(bArr2, i19, this.f39261jyumaefscl, 0, length2);
                System.arraycopy(this.f39262kcexrzcfyt, 0, this.f39261jyumaefscl, length2, i13 - length2);
            }
        }
        y2.iobyxmoadg.zoijcleaow(i13 % this.f39256agtfadlqog == 0, "sizeToOutput is not aligned to frame size: " + i13);
        y2.iobyxmoadg.lqeggnwhkg(this.f39269zdlpuopuiu < this.f39262kcexrzcfyt.length);
        esjtqupxsv(this.f39261jyumaefscl, i13, i14);
    }

    private int rgvfuqvkyq(int i13, int i14) {
        return (((this.f39260gtknphoqwx - 100) * ((i13 * 1000) / i14)) / 1000) + 100;
    }

    private int vdvldrhtss(int i13) {
        int iOxmwwwfdhm = ((oxmwwwfdhm(this.f39267wflxmlrfwp) - this.f39264oxmwwwfdhm) * this.f39256agtfadlqog) - (this.f39262kcexrzcfyt.length / 2);
        y2.iobyxmoadg.lqeggnwhkg(iOxmwwwfdhm >= 0);
        return wflxmlrfwp(Math.min((i13 * this.f39259dxjokdxxww) + 0.5f, iOxmwwwfdhm));
    }

    private int wflxmlrfwp(float f13) {
        return agtfadlqog((int) f13);
    }

    private void yadqdtsiqt(ByteBuffer byteBuffer) {
        int length;
        int i13;
        y2.iobyxmoadg.lqeggnwhkg(this.f39269zdlpuopuiu < this.f39262kcexrzcfyt.length);
        int iLimit = byteBuffer.limit();
        int iZdlpuopuiu = zdlpuopuiu(byteBuffer);
        int iPosition = iZdlpuopuiu - byteBuffer.position();
        int i14 = this.f39269zdlpuopuiu;
        int i15 = this.f39268yggfygwlhe;
        int i16 = i14 + i15;
        byte[] bArr = this.f39262kcexrzcfyt;
        if (i16 < bArr.length) {
            length = bArr.length - (i15 + i14);
            i13 = i14 + i15;
        } else {
            int length2 = i15 - (bArr.length - i14);
            length = i14 - length2;
            i13 = length2;
        }
        boolean z13 = iZdlpuopuiu < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f39262kcexrzcfyt, i13, iMin);
        int i17 = this.f39268yggfygwlhe + iMin;
        this.f39268yggfygwlhe = i17;
        y2.iobyxmoadg.lqeggnwhkg(i17 <= this.f39262kcexrzcfyt.length);
        boolean z14 = z13 && iPosition < length;
        lereixgezr(z14);
        if (z14) {
            this.f39265rgvfuqvkyq = 0;
            this.f39264oxmwwwfdhm = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private int zdlpuopuiu(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (jyumaefscl(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i13 = this.f39256agtfadlqog;
                return i13 * (iPosition / i13);
            }
        }
        return byteBuffer.limit();
    }

    private void zynmafqrjb(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f39262kcexrzcfyt.length));
        int iKcexrzcfyt = kcexrzcfyt(byteBuffer);
        if (iKcexrzcfyt == byteBuffer.position()) {
            this.f39265rgvfuqvkyq = 1;
        } else {
            byteBuffer.limit(Math.min(iKcexrzcfyt, byteBuffer.capacity()));
            cqumvgiudr(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public void btonecajqb() {
        if (this.f39268yggfygwlhe > 0) {
            lereixgezr(true);
            this.f39264oxmwwwfdhm = 0;
        }
    }

    public void cdpycssgdh(boolean z13) {
        this.f39263ojitshcjhn = z13;
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public void dxjokdxxww() {
        if (isActive()) {
            this.f39256agtfadlqog = this.f9707zoijcleaow.f9655zoijcleaow * 2;
            int iAgtfadlqog = agtfadlqog(oxmwwwfdhm(this.f39258draadjrbmk) / 2) * 2;
            if (this.f39262kcexrzcfyt.length != iAgtfadlqog) {
                this.f39262kcexrzcfyt = new byte[iAgtfadlqog];
                this.f39261jyumaefscl = new byte[iAgtfadlqog];
            }
        }
        this.f39265rgvfuqvkyq = 0;
        this.f39266vdvldrhtss = 0L;
        this.f39264oxmwwwfdhm = 0;
        this.f39269zdlpuopuiu = 0;
        this.f39268yggfygwlhe = 0;
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public void gtknphoqwx() {
        this.f39263ojitshcjhn = false;
        byte[] bArr = stevsuqkhv.f123601gxszxtbevo;
        this.f39262kcexrzcfyt = bArr;
        this.f39261jyumaefscl = bArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void gxszxtbevo(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !iobyxmoadg()) {
            int i13 = this.f39265rgvfuqvkyq;
            if (i13 == 0) {
                zynmafqrjb(byteBuffer);
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException();
                }
                yadqdtsiqt(byteBuffer);
            }
        }
    }

    @Override // androidx.media3.common.audio.zoijcleaow, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.f39263ojitshcjhn;
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    protected AudioProcessor.iobyxmoadg ppxfxbqfkf(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (iobyxmoadgVar.f9653ppxfxbqfkf == 2) {
            return iobyxmoadgVar.f9652iobyxmoadg == -1 ? AudioProcessor.iobyxmoadg.f9651eablkybsjg : iobyxmoadgVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
    }

    public long yggfygwlhe() {
        return this.f39266vdvldrhtss;
    }

    public pkzmftpjix(long j13, float f13, long j14, int i13, short s13) {
        boolean z13 = false;
        this.f39264oxmwwwfdhm = 0;
        this.f39269zdlpuopuiu = 0;
        this.f39268yggfygwlhe = 0;
        if (f13 >= 0.0f && f13 <= 1.0f) {
            z13 = true;
        }
        y2.iobyxmoadg.iobyxmoadg(z13);
        this.f39258draadjrbmk = j13;
        this.f39259dxjokdxxww = f13;
        this.f39267wflxmlrfwp = j14;
        this.f39260gtknphoqwx = i13;
        this.f39257btonecajqb = s13;
        byte[] bArr = stevsuqkhv.f123601gxszxtbevo;
        this.f39262kcexrzcfyt = bArr;
        this.f39261jyumaefscl = bArr;
    }
}
