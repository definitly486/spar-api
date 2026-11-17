package t6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uawqvzlxes implements jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final mbcevpiqjq f109885iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected Object f109886zoijcleaow;

    public uawqvzlxes(mbcevpiqjq mbcevpiqjqVar) {
        this.f109885iobyxmoadg = mbcevpiqjqVar;
    }

    private void wkgbmnqykc(Class cls) {
        this.f109885iobyxmoadg.zoijcleaow(cls);
    }

    @Override // t6.jhduphickx
    public Object iobyxmoadg() {
        if (this.f109886zoijcleaow == null) {
            this.f109886zoijcleaow = zoijcleaow();
        }
        return this.f109886zoijcleaow;
    }

    protected Object ppxfxbqfkf(Class cls) {
        wkgbmnqykc(cls);
        return this.f109885iobyxmoadg.iobyxmoadg(cls);
    }

    protected abstract Object zoijcleaow();
}
