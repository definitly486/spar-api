package dh;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class o {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WeakReference f28288iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ClassLoader f28289ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f28290zoijcleaow;

    public o(ClassLoader classLoader) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classLoader, "classLoader");
        this.f28288iobyxmoadg = new WeakReference(classLoader);
        this.f28290zoijcleaow = System.identityHashCode(classLoader);
        this.f28289ppxfxbqfkf = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && this.f28288iobyxmoadg.get() == ((o) obj).f28288iobyxmoadg.get();
    }

    public int hashCode() {
        return this.f28290zoijcleaow;
    }

    public final void iobyxmoadg(ClassLoader classLoader) {
        this.f28289ppxfxbqfkf = classLoader;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f28288iobyxmoadg.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
