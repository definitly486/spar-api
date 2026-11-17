package org.xbill.DNS;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f74606eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ByteBuffer f74607iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f74608ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f74609wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f74610zoijcleaow;

    public zdlpuopuiu(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
    }

    private void draadjrbmk(int i13) throws WireParseException {
        if (i13 > gtknphoqwx()) {
            throw new WireParseException("end of input");
        }
    }

    public void agtfadlqog(int i13) {
        int i14 = this.f74610zoijcleaow;
        if (i13 + i14 > this.f74608ppxfxbqfkf) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        this.f74607iobyxmoadg.limit(i13 + i14);
    }

    public int btonecajqb() throws WireParseException {
        draadjrbmk(1);
        return this.f74607iobyxmoadg.get() & 255;
    }

    public long dxjokdxxww() throws WireParseException {
        draadjrbmk(4);
        return ((long) this.f74607iobyxmoadg.getInt()) & 4294967295L;
    }

    public byte[] eablkybsjg() {
        int iGtknphoqwx = gtknphoqwx();
        byte[] bArr = new byte[iGtknphoqwx];
        this.f74607iobyxmoadg.get(bArr, 0, iGtknphoqwx);
        return bArr;
    }

    public int gtknphoqwx() {
        return this.f74607iobyxmoadg.remaining();
    }

    public byte[] gxszxtbevo(int i13) throws WireParseException {
        draadjrbmk(i13);
        byte[] bArr = new byte[i13];
        this.f74607iobyxmoadg.get(bArr, 0, i13);
        return bArr;
    }

    public void iobyxmoadg() {
        this.f74607iobyxmoadg.limit(this.f74608ppxfxbqfkf);
    }

    public byte[] lqeggnwhkg() {
        return gxszxtbevo(btonecajqb());
    }

    public int nufgyqmvbu() throws WireParseException {
        draadjrbmk(2);
        return this.f74607iobyxmoadg.getShort() & 65535;
    }

    public void ojitshcjhn() {
        this.f74609wkgbmnqykc = this.f74607iobyxmoadg.position();
        this.f74606eablkybsjg = this.f74607iobyxmoadg.limit();
    }

    public void ppxfxbqfkf(int i13) {
        int i14 = this.f74610zoijcleaow;
        if (i13 + i14 >= this.f74608ppxfxbqfkf) {
            throw new IllegalArgumentException("cannot jump past end of input");
        }
        this.f74607iobyxmoadg.position(i14 + i13);
        this.f74607iobyxmoadg.limit(this.f74608ppxfxbqfkf);
    }

    public int rgvfuqvkyq() {
        return this.f74607iobyxmoadg.limit() - this.f74610zoijcleaow;
    }

    public void vdvldrhtss(int i13) {
        if (i13 > this.f74608ppxfxbqfkf - this.f74607iobyxmoadg.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        ByteBuffer byteBuffer = this.f74607iobyxmoadg;
        byteBuffer.limit(byteBuffer.position() + i13);
    }

    public void wflxmlrfwp() {
        int i13 = this.f74609wkgbmnqykc;
        if (i13 < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.f74607iobyxmoadg.position(i13);
        this.f74607iobyxmoadg.limit(this.f74606eablkybsjg);
        this.f74609wkgbmnqykc = -1;
        this.f74606eablkybsjg = -1;
    }

    public void wkgbmnqykc(byte[] bArr, int i13, int i14) throws WireParseException {
        draadjrbmk(i14);
        this.f74607iobyxmoadg.get(bArr, i13, i14);
    }

    public int zoijcleaow() {
        return this.f74607iobyxmoadg.position() - this.f74610zoijcleaow;
    }

    public zdlpuopuiu(ByteBuffer byteBuffer) {
        this.f74607iobyxmoadg = byteBuffer;
        this.f74610zoijcleaow = byteBuffer.position();
        this.f74608ppxfxbqfkf = byteBuffer.limit();
        this.f74609wkgbmnqykc = -1;
        this.f74606eablkybsjg = -1;
    }
}
