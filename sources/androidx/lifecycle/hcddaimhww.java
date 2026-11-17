package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww implements agtfadlqog {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dsvhmnatus f9475zdlpuopuiu;

    public hcddaimhww(dsvhmnatus provider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(provider, "provider");
        this.f9475zdlpuopuiu = provider;
    }

    @Override // androidx.lifecycle.agtfadlqog
    public void nufgyqmvbu(vdvldrhtss source, gtknphoqwx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event == gtknphoqwx.iobyxmoadg.ON_CREATE) {
            source.getLifecycle().wkgbmnqykc(this);
            this.f9475zdlpuopuiu.eablkybsjg();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
