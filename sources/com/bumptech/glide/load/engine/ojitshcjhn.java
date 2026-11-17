package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
class ojitshcjhn implements n8.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final l8.eablkybsjg f20980cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f20981esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final iobyxmoadg f20982iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final n8.ppxfxbqfkf f20983jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f20984lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f20985yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f20986zdlpuopuiu;

    interface iobyxmoadg {
        void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, ojitshcjhn ojitshcjhnVar);
    }

    ojitshcjhn(n8.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, boolean z14, l8.eablkybsjg eablkybsjgVar, iobyxmoadg iobyxmoadgVar) {
        this.f20983jyumaefscl = (n8.ppxfxbqfkf) g9.gtknphoqwx.eablkybsjg(ppxfxbqfkfVar);
        this.f20986zdlpuopuiu = z13;
        this.f20985yggfygwlhe = z14;
        this.f20980cqumvgiudr = eablkybsjgVar;
        this.f20982iwizpuwonk = (iobyxmoadg) g9.gtknphoqwx.eablkybsjg(iobyxmoadgVar);
    }

    boolean eablkybsjg() {
        return this.f20986zdlpuopuiu;
    }

    @Override // n8.ppxfxbqfkf
    public Object get() {
        return this.f20983jyumaefscl.get();
    }

    @Override // n8.ppxfxbqfkf
    public int getSize() {
        return this.f20983jyumaefscl.getSize();
    }

    void gxszxtbevo() {
        boolean z13;
        synchronized (this) {
            int i13 = this.f20981esjtqupxsv;
            if (i13 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z13 = true;
            int i14 = i13 - 1;
            this.f20981esjtqupxsv = i14;
            if (i14 != 0) {
                z13 = false;
            }
        }
        if (z13) {
            this.f20982iwizpuwonk.wkgbmnqykc(this.f20980cqumvgiudr, this);
        }
    }

    synchronized void iobyxmoadg() {
        if (this.f20984lereixgezr) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f20981esjtqupxsv++;
    }

    @Override // n8.ppxfxbqfkf
    public Class ppxfxbqfkf() {
        return this.f20983jyumaefscl.ppxfxbqfkf();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f20986zdlpuopuiu + ", listener=" + this.f20982iwizpuwonk + ", key=" + this.f20980cqumvgiudr + ", acquired=" + this.f20981esjtqupxsv + ", isRecycled=" + this.f20984lereixgezr + ", resource=" + this.f20983jyumaefscl + '}';
    }

    n8.ppxfxbqfkf wkgbmnqykc() {
        return this.f20983jyumaefscl;
    }

    @Override // n8.ppxfxbqfkf
    public synchronized void zoijcleaow() {
        if (this.f20981esjtqupxsv > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f20984lereixgezr) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f20984lereixgezr = true;
        if (this.f20985yggfygwlhe) {
            this.f20983jyumaefscl.zoijcleaow();
        }
    }
}
