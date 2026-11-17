package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
final class oxmwwwfdhm implements n8.ppxfxbqfkf, h9.iobyxmoadg.gxszxtbevo {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final u1.eablkybsjg f20987cqumvgiudr = h9.iobyxmoadg.wkgbmnqykc(20, new iobyxmoadg());

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f20988iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f20989jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private n8.ppxfxbqfkf f20990yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final h9.ppxfxbqfkf f20991zdlpuopuiu = h9.ppxfxbqfkf.iobyxmoadg();

    class iobyxmoadg implements h9.iobyxmoadg.wkgbmnqykc {
        iobyxmoadg() {
        }

        @Override // h9.iobyxmoadg.wkgbmnqykc
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public oxmwwwfdhm iobyxmoadg() {
            return new oxmwwwfdhm();
        }
    }

    oxmwwwfdhm() {
    }

    private void gxszxtbevo() {
        this.f20990yggfygwlhe = null;
        f20987cqumvgiudr.iobyxmoadg(this);
    }

    private void iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f20988iwizpuwonk = false;
        this.f20989jyumaefscl = true;
        this.f20990yggfygwlhe = ppxfxbqfkfVar;
    }

    static oxmwwwfdhm wkgbmnqykc(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) g9.gtknphoqwx.eablkybsjg((oxmwwwfdhm) f20987cqumvgiudr.zoijcleaow());
        oxmwwwfdhmVar.iobyxmoadg(ppxfxbqfkfVar);
        return oxmwwwfdhmVar;
    }

    @Override // h9.iobyxmoadg.gxszxtbevo
    public h9.ppxfxbqfkf eablkybsjg() {
        return this.f20991zdlpuopuiu;
    }

    @Override // n8.ppxfxbqfkf
    public Object get() {
        return this.f20990yggfygwlhe.get();
    }

    @Override // n8.ppxfxbqfkf
    public int getSize() {
        return this.f20990yggfygwlhe.getSize();
    }

    synchronized void lqeggnwhkg() {
        this.f20991zdlpuopuiu.ppxfxbqfkf();
        if (!this.f20989jyumaefscl) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f20989jyumaefscl = false;
        if (this.f20988iwizpuwonk) {
            zoijcleaow();
        }
    }

    @Override // n8.ppxfxbqfkf
    public Class ppxfxbqfkf() {
        return this.f20990yggfygwlhe.ppxfxbqfkf();
    }

    @Override // n8.ppxfxbqfkf
    public synchronized void zoijcleaow() {
        this.f20991zdlpuopuiu.ppxfxbqfkf();
        this.f20988iwizpuwonk = true;
        if (!this.f20989jyumaefscl) {
            this.f20990yggfygwlhe.zoijcleaow();
            gxszxtbevo();
        }
    }
}
