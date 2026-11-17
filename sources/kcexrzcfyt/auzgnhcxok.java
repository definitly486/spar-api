package kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
class auzgnhcxok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f54605iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f54606ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54607zoijcleaow;

    auzgnhcxok(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, int i13) {
        this.f54607zoijcleaow = pmvmpeibljVar;
        this.f54606ppxfxbqfkf = i13;
    }

    public int iobyxmoadg() {
        int i13;
        synchronized (this.f54605iobyxmoadg) {
            i13 = this.f54606ppxfxbqfkf;
        }
        return i13;
    }

    void zoijcleaow(int i13) {
        synchronized (this.f54605iobyxmoadg) {
            this.f54606ppxfxbqfkf = i13;
        }
    }
}
