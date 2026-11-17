package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {
    public static final void iobyxmoadg(vdvldrhtss vdvldrhtssVar, gtknphoqwx.zoijcleaow current, gtknphoqwx.zoijcleaow next) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(current, "current");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(next, "next");
        if (current == gtknphoqwx.zoijcleaow.INITIALIZED && next == gtknphoqwx.zoijcleaow.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + gtknphoqwx.zoijcleaow.CREATED + "' to be moved to '" + next + "' in component " + vdvldrhtssVar).toString());
        }
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.DESTROYED;
        if (current != zoijcleaowVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + zoijcleaowVar + "' and cannot be moved to `" + next + "` in component " + vdvldrhtssVar).toString());
    }
}
