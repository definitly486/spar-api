package t3;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements vdvldrhtss {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f109388gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f109390lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f109391ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f109392wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v2.btonecajqb f109393zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private byte[] f109387eablkybsjg = new byte[65536];

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f109389iobyxmoadg = new byte[4096];

    static {
        v2.zdlpuopuiu.iobyxmoadg("media3.extractor");
    }

    public dxjokdxxww(v2.btonecajqb btonecajqbVar, long j13, long j14) {
        this.f109393zoijcleaow = btonecajqbVar;
        this.f109392wkgbmnqykc = j13;
        this.f109391ppxfxbqfkf = j14;
    }

    private void jyumaefscl(int i13) {
        int i14 = this.f109390lqeggnwhkg - i13;
        this.f109390lqeggnwhkg = i14;
        this.f109388gxszxtbevo = 0;
        byte[] bArr = this.f109387eablkybsjg;
        byte[] bArr2 = i14 < bArr.length - 524288 ? new byte[65536 + i14] : bArr;
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        this.f109387eablkybsjg = bArr2;
    }

    private int kcexrzcfyt(byte[] bArr, int i13, int i14, int i15, boolean z13) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZoijcleaow = this.f109393zoijcleaow.zoijcleaow(bArr, i13 + i15, i14 - i15);
        if (iZoijcleaow != -1) {
            return i15 + iZoijcleaow;
        }
        if (i15 == 0 && z13) {
            return -1;
        }
        throw new EOFException();
    }

    private int oxmwwwfdhm(byte[] bArr, int i13, int i14) {
        int i15 = this.f109390lqeggnwhkg;
        if (i15 == 0) {
            return 0;
        }
        int iMin = Math.min(i15, i14);
        System.arraycopy(this.f109387eablkybsjg, 0, bArr, i13, iMin);
        jyumaefscl(iMin);
        return iMin;
    }

    private void rgvfuqvkyq(int i13) {
        if (i13 != -1) {
            this.f109392wkgbmnqykc += (long) i13;
        }
    }

    private void vdvldrhtss(int i13) {
        int i14 = this.f109388gxszxtbevo + i13;
        byte[] bArr = this.f109387eablkybsjg;
        if (i14 > bArr.length) {
            this.f109387eablkybsjg = Arrays.copyOf(this.f109387eablkybsjg, y2.stevsuqkhv.ojitshcjhn(bArr.length * 2, 65536 + i14, i14 + 524288));
        }
    }

    private int zdlpuopuiu(int i13) {
        int iMin = Math.min(this.f109390lqeggnwhkg, i13);
        jyumaefscl(iMin);
        return iMin;
    }

    @Override // t3.vdvldrhtss
    public int btonecajqb(int i13) throws EOFException, InterruptedIOException {
        int iZdlpuopuiu = zdlpuopuiu(i13);
        if (iZdlpuopuiu == 0) {
            byte[] bArr = this.f109389iobyxmoadg;
            iZdlpuopuiu = kcexrzcfyt(bArr, 0, Math.min(i13, bArr.length), 0, true);
        }
        rgvfuqvkyq(iZdlpuopuiu);
        return iZdlpuopuiu;
    }

    @Override // t3.vdvldrhtss
    public void draadjrbmk(int i13) throws EOFException, InterruptedIOException {
        yggfygwlhe(i13, false);
    }

    @Override // t3.vdvldrhtss
    public void dxjokdxxww(int i13) throws EOFException, InterruptedIOException {
        wflxmlrfwp(i13, false);
    }

    @Override // t3.vdvldrhtss
    public long getLength() {
        return this.f109391ppxfxbqfkf;
    }

    @Override // t3.vdvldrhtss
    public long getPosition() {
        return this.f109392wkgbmnqykc;
    }

    @Override // t3.vdvldrhtss
    public int gtknphoqwx(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        int iMin;
        vdvldrhtss(i14);
        int i15 = this.f109390lqeggnwhkg;
        int i16 = this.f109388gxszxtbevo;
        int i17 = i15 - i16;
        if (i17 == 0) {
            iMin = kcexrzcfyt(this.f109387eablkybsjg, i16, i14, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f109390lqeggnwhkg += iMin;
        } else {
            iMin = Math.min(i14, i17);
        }
        System.arraycopy(this.f109387eablkybsjg, this.f109388gxszxtbevo, bArr, i13, iMin);
        this.f109388gxszxtbevo += iMin;
        return iMin;
    }

    @Override // t3.vdvldrhtss
    public void gxszxtbevo() {
        this.f109388gxszxtbevo = 0;
    }

    @Override // t3.vdvldrhtss
    public boolean lqeggnwhkg(byte[] bArr, int i13, int i14, boolean z13) throws EOFException, InterruptedIOException {
        int iOxmwwwfdhm = oxmwwwfdhm(bArr, i13, i14);
        while (iOxmwwwfdhm < i14 && iOxmwwwfdhm != -1) {
            iOxmwwwfdhm = kcexrzcfyt(bArr, i13, i14, iOxmwwwfdhm, z13);
        }
        rgvfuqvkyq(iOxmwwwfdhm);
        return iOxmwwwfdhm != -1;
    }

    @Override // t3.vdvldrhtss
    public long nufgyqmvbu() {
        return this.f109392wkgbmnqykc + ((long) this.f109388gxszxtbevo);
    }

    @Override // t3.vdvldrhtss
    public void ojitshcjhn(byte[] bArr, int i13, int i14) {
        ppxfxbqfkf(bArr, i13, i14, false);
    }

    @Override // t3.vdvldrhtss
    public boolean ppxfxbqfkf(byte[] bArr, int i13, int i14, boolean z13) {
        if (!wflxmlrfwp(i14, z13)) {
            return false;
        }
        System.arraycopy(this.f109387eablkybsjg, this.f109388gxszxtbevo - i14, bArr, i13, i14);
        return true;
    }

    @Override // t3.vdvldrhtss
    public void readFully(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        lqeggnwhkg(bArr, i13, i14, false);
    }

    @Override // t3.vdvldrhtss
    public boolean wflxmlrfwp(int i13, boolean z13) throws EOFException, InterruptedIOException {
        vdvldrhtss(i13);
        int iKcexrzcfyt = this.f109390lqeggnwhkg - this.f109388gxszxtbevo;
        while (iKcexrzcfyt < i13) {
            iKcexrzcfyt = kcexrzcfyt(this.f109387eablkybsjg, this.f109388gxszxtbevo, i13, iKcexrzcfyt, z13);
            if (iKcexrzcfyt == -1) {
                return false;
            }
            this.f109390lqeggnwhkg = this.f109388gxszxtbevo + iKcexrzcfyt;
        }
        this.f109388gxszxtbevo += i13;
        return true;
    }

    public boolean yggfygwlhe(int i13, boolean z13) throws EOFException, InterruptedIOException {
        int iZdlpuopuiu = zdlpuopuiu(i13);
        while (iZdlpuopuiu < i13 && iZdlpuopuiu != -1) {
            iZdlpuopuiu = kcexrzcfyt(this.f109389iobyxmoadg, -iZdlpuopuiu, Math.min(i13, this.f109389iobyxmoadg.length + iZdlpuopuiu), iZdlpuopuiu, z13);
        }
        rgvfuqvkyq(iZdlpuopuiu);
        return iZdlpuopuiu != -1;
    }

    @Override // t3.vdvldrhtss, v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        int iOxmwwwfdhm = oxmwwwfdhm(bArr, i13, i14);
        if (iOxmwwwfdhm == 0) {
            iOxmwwwfdhm = kcexrzcfyt(bArr, i13, i14, 0, true);
        }
        rgvfuqvkyq(iOxmwwwfdhm);
        return iOxmwwwfdhm;
    }
}
