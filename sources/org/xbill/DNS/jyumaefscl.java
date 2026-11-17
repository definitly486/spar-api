package org.xbill.DNS;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private byte[] f74431iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f74432ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f74433zoijcleaow;

    public jyumaefscl(int i13) {
        this.f74431iobyxmoadg = new byte[i13];
        this.f74433zoijcleaow = 0;
        this.f74432ppxfxbqfkf = -1;
    }

    private void iobyxmoadg(long j13, int i13) {
        long j14 = 1 << i13;
        if (j13 < 0 || j13 > j14) {
            throw new IllegalArgumentException(j13 + " out of range for " + i13 + " bit value");
        }
    }

    private void wkgbmnqykc(int i13) {
        byte[] bArr = this.f74431iobyxmoadg;
        int length = bArr.length;
        int i14 = this.f74433zoijcleaow;
        if (length - i14 >= i13) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i14 + i13) {
            length2 = i14 + i13;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, i14);
        this.f74431iobyxmoadg = bArr2;
    }

    public void btonecajqb(int i13, int i14) {
        iobyxmoadg(i13, 16);
        if (i14 > this.f74433zoijcleaow - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.f74431iobyxmoadg;
        bArr[i14] = (byte) ((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i14 + 1] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void draadjrbmk(int i13) {
        iobyxmoadg(i13, 8);
        wkgbmnqykc(1);
        byte[] bArr = this.f74431iobyxmoadg;
        int i14 = this.f74433zoijcleaow;
        this.f74433zoijcleaow = i14 + 1;
        bArr[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void dxjokdxxww(int i13) {
        iobyxmoadg(i13, 16);
        wkgbmnqykc(2);
        byte[] bArr = this.f74431iobyxmoadg;
        int i14 = this.f74433zoijcleaow;
        int i15 = i14 + 1;
        this.f74433zoijcleaow = i15;
        bArr[i14] = (byte) ((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f74433zoijcleaow = i14 + 2;
        bArr[i15] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public byte[] eablkybsjg() {
        int i13 = this.f74433zoijcleaow;
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f74431iobyxmoadg, 0, bArr, 0, i13);
        return bArr;
    }

    public void gtknphoqwx(long j13) {
        iobyxmoadg(j13, 32);
        wkgbmnqykc(4);
        byte[] bArr = this.f74431iobyxmoadg;
        int i13 = this.f74433zoijcleaow;
        int i14 = i13 + 1;
        this.f74433zoijcleaow = i14;
        bArr[i13] = (byte) ((j13 >>> 24) & 255);
        int i15 = i13 + 2;
        this.f74433zoijcleaow = i15;
        bArr[i14] = (byte) ((j13 >>> 16) & 255);
        int i16 = i13 + 3;
        this.f74433zoijcleaow = i16;
        bArr[i15] = (byte) ((j13 >>> 8) & 255);
        this.f74433zoijcleaow = i13 + 4;
        bArr[i16] = (byte) (j13 & 255);
    }

    public void gxszxtbevo(byte[] bArr) {
        lqeggnwhkg(bArr, 0, bArr.length);
    }

    public void lqeggnwhkg(byte[] bArr, int i13, int i14) {
        wkgbmnqykc(i14);
        System.arraycopy(bArr, i13, this.f74431iobyxmoadg, this.f74433zoijcleaow, i14);
        this.f74433zoijcleaow += i14;
    }

    public void nufgyqmvbu(byte[] bArr) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("Invalid counted string");
        }
        wkgbmnqykc(bArr.length + 1);
        byte[] bArr2 = this.f74431iobyxmoadg;
        int i13 = this.f74433zoijcleaow;
        this.f74433zoijcleaow = i13 + 1;
        bArr2[i13] = (byte) (255 & bArr.length);
        lqeggnwhkg(bArr, 0, bArr.length);
    }

    public void ppxfxbqfkf(int i13) {
        if (i13 > this.f74433zoijcleaow) {
            throw new IllegalArgumentException("cannot jump past end of data");
        }
        this.f74433zoijcleaow = i13;
    }

    public int zoijcleaow() {
        return this.f74433zoijcleaow;
    }

    public jyumaefscl() {
        this(32);
    }
}
