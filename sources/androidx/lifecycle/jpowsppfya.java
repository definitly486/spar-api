package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya implements agtfadlqog, AutoCloseable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f9488jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pkzmftpjix f9489yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f9490zdlpuopuiu;

    public jpowsppfya(String key, pkzmftpjix handle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handle, "handle");
        this.f9490zdlpuopuiu = key;
        this.f9489yggfygwlhe = handle;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    public final boolean dxjokdxxww() {
        return this.f9488jyumaefscl;
    }

    public final void iobyxmoadg(q5.gxszxtbevo registry, gtknphoqwx lifecycle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(registry, "registry");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycle, "lifecycle");
        if (this.f9488jyumaefscl) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f9488jyumaefscl = true;
        lifecycle.iobyxmoadg(this);
        registry.ppxfxbqfkf(this.f9490zdlpuopuiu, this.f9489yggfygwlhe.ppxfxbqfkf());
    }

    @Override // androidx.lifecycle.agtfadlqog
    public void nufgyqmvbu(vdvldrhtss source, gtknphoqwx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event == gtknphoqwx.iobyxmoadg.ON_DESTROY) {
            this.f9488jyumaefscl = false;
            source.getLifecycle().wkgbmnqykc(this);
        }
    }

    public final pkzmftpjix wkgbmnqykc() {
        return this.f9489yggfygwlhe;
    }
}
