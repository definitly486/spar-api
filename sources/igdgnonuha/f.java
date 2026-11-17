package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f42887iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.vdvldrhtss f42888zoijcleaow;

    public f(Object obj, tg.vdvldrhtss vdvldrhtssVar) {
        this.f42887iobyxmoadg = obj;
        this.f42888zoijcleaow = vdvldrhtssVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42887iobyxmoadg, fVar.f42887iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42888zoijcleaow, fVar.f42888zoijcleaow);
    }

    public int hashCode() {
        Object obj = this.f42887iobyxmoadg;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f42888zoijcleaow.hashCode();
    }

    public final Object iobyxmoadg() {
        return this.f42887iobyxmoadg;
    }

    public final Object ppxfxbqfkf() {
        return this.f42887iobyxmoadg;
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f42887iobyxmoadg + ", transition=" + this.f42888zoijcleaow + ')';
    }

    public final tg.vdvldrhtss zoijcleaow() {
        return this.f42888zoijcleaow;
    }
}
