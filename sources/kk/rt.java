package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class rt implements vu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58471iobyxmoadg;

    public rt(String text) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        this.f58471iobyxmoadg = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58471iobyxmoadg, ((rt) obj).f58471iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58471iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Text(text=" + ((Object) this.f58471iobyxmoadg) + ")";
    }
}
