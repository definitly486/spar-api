package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f5679wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f5680iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object f5681ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayList f5682zoijcleaow = h1.ppxfxbqfkf(null, 1, null);

    public iobyxmoadg(Object obj) {
        this.f5680iobyxmoadg = obj;
        this.f5681ppxfxbqfkf = obj;
    }

    protected void agtfadlqog(Object obj) {
        this.f5681ppxfxbqfkf = obj;
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public final void clear() {
        h1.iobyxmoadg(this.f5682zoijcleaow);
        agtfadlqog(this.f5680iobyxmoadg);
        wflxmlrfwp();
    }

    public final Object draadjrbmk() {
        return this.f5680iobyxmoadg;
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void gtknphoqwx() {
        agtfadlqog(h1.dxjokdxxww(this.f5682zoijcleaow));
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public Object iobyxmoadg() {
        return this.f5681ppxfxbqfkf;
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void nufgyqmvbu(Object obj) {
        h1.btonecajqb(this.f5682zoijcleaow, iobyxmoadg());
        agtfadlqog(obj);
    }

    protected abstract void wflxmlrfwp();
}
