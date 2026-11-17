package bl;

/* JADX INFO: loaded from: classes3.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f16697nufgyqmvbu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public boolean f16698eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public istkbnxepw f16699gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final byte[] f16700iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public istkbnxepw f16701lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f16702ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public boolean f16703wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f16704zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public istkbnxepw() {
        this.f16700iobyxmoadg = new byte[8192];
        this.f16698eablkybsjg = true;
        this.f16703wkgbmnqykc = false;
    }

    public final istkbnxepw eablkybsjg(int i13) {
        istkbnxepw istkbnxepwVarPpxfxbqfkf;
        if (i13 <= 0 || i13 > this.f16702ppxfxbqfkf - this.f16704zoijcleaow) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i13 >= 1024) {
            istkbnxepwVarPpxfxbqfkf = wkgbmnqykc();
        } else {
            istkbnxepwVarPpxfxbqfkf = cdpycssgdh.ppxfxbqfkf();
            byte[] bArr = this.f16700iobyxmoadg;
            byte[] bArr2 = istkbnxepwVarPpxfxbqfkf.f16700iobyxmoadg;
            int i14 = this.f16704zoijcleaow;
            hg.agtfadlqog.ojitshcjhn(bArr, bArr2, 0, i14, i14 + i13, 2, null);
        }
        istkbnxepwVarPpxfxbqfkf.f16702ppxfxbqfkf = istkbnxepwVarPpxfxbqfkf.f16704zoijcleaow + i13;
        this.f16704zoijcleaow += i13;
        istkbnxepw istkbnxepwVar = this.f16701lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        istkbnxepwVar.ppxfxbqfkf(istkbnxepwVarPpxfxbqfkf);
        return istkbnxepwVarPpxfxbqfkf;
    }

    public final void gxszxtbevo(istkbnxepw sink, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        if (!sink.f16698eablkybsjg) {
            throw new IllegalStateException("only owner can write");
        }
        int i14 = sink.f16702ppxfxbqfkf;
        if (i14 + i13 > 8192) {
            if (sink.f16703wkgbmnqykc) {
                throw new IllegalArgumentException();
            }
            int i15 = sink.f16704zoijcleaow;
            if ((i14 + i13) - i15 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f16700iobyxmoadg;
            hg.agtfadlqog.ojitshcjhn(bArr, bArr, 0, i15, i14, 2, null);
            sink.f16702ppxfxbqfkf -= sink.f16704zoijcleaow;
            sink.f16704zoijcleaow = 0;
        }
        byte[] bArr2 = this.f16700iobyxmoadg;
        byte[] bArr3 = sink.f16700iobyxmoadg;
        int i16 = sink.f16702ppxfxbqfkf;
        int i17 = this.f16704zoijcleaow;
        hg.agtfadlqog.dxjokdxxww(bArr2, bArr3, i16, i17, i17 + i13);
        sink.f16702ppxfxbqfkf += i13;
        this.f16704zoijcleaow += i13;
    }

    public final void iobyxmoadg() {
        int i13;
        istkbnxepw istkbnxepwVar = this.f16701lqeggnwhkg;
        if (istkbnxepwVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        if (istkbnxepwVar.f16698eablkybsjg) {
            int i14 = this.f16702ppxfxbqfkf - this.f16704zoijcleaow;
            istkbnxepw istkbnxepwVar2 = this.f16701lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
            int i15 = 8192 - istkbnxepwVar2.f16702ppxfxbqfkf;
            istkbnxepw istkbnxepwVar3 = this.f16701lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
            if (istkbnxepwVar3.f16703wkgbmnqykc) {
                i13 = 0;
            } else {
                istkbnxepw istkbnxepwVar4 = this.f16701lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar4);
                i13 = istkbnxepwVar4.f16704zoijcleaow;
            }
            if (i14 > i15 + i13) {
                return;
            }
            istkbnxepw istkbnxepwVar5 = this.f16701lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar5);
            gxszxtbevo(istkbnxepwVar5, i14);
            zoijcleaow();
            cdpycssgdh.zoijcleaow(this);
        }
    }

    public final istkbnxepw ppxfxbqfkf(istkbnxepw segment) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(segment, "segment");
        segment.f16701lqeggnwhkg = this;
        segment.f16699gxszxtbevo = this.f16699gxszxtbevo;
        istkbnxepw istkbnxepwVar = this.f16699gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
        istkbnxepwVar.f16701lqeggnwhkg = segment;
        this.f16699gxszxtbevo = segment;
        return segment;
    }

    public final istkbnxepw wkgbmnqykc() {
        this.f16703wkgbmnqykc = true;
        return new istkbnxepw(this.f16700iobyxmoadg, this.f16704zoijcleaow, this.f16702ppxfxbqfkf, true, false);
    }

    public final istkbnxepw zoijcleaow() {
        istkbnxepw istkbnxepwVar = this.f16699gxszxtbevo;
        if (istkbnxepwVar == this) {
            istkbnxepwVar = null;
        }
        istkbnxepw istkbnxepwVar2 = this.f16701lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar2);
        istkbnxepwVar2.f16699gxszxtbevo = this.f16699gxszxtbevo;
        istkbnxepw istkbnxepwVar3 = this.f16699gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
        istkbnxepwVar3.f16701lqeggnwhkg = this.f16701lqeggnwhkg;
        this.f16699gxszxtbevo = null;
        this.f16701lqeggnwhkg = null;
        return istkbnxepwVar;
    }

    public istkbnxepw(byte[] data, int i13, int i14, boolean z13, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f16700iobyxmoadg = data;
        this.f16704zoijcleaow = i13;
        this.f16702ppxfxbqfkf = i14;
        this.f16703wkgbmnqykc = z13;
        this.f16698eablkybsjg = z14;
    }
}
