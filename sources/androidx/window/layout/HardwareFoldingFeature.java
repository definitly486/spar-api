package androidx.window.layout;

import android.graphics.Rect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "Lf6/zoijcleaow;", "featureBounds", "Landroidx/window/layout/HardwareFoldingFeature$zoijcleaow;", "type", "Landroidx/window/layout/FoldingFeature$ppxfxbqfkf;", "state", "<init>", "(Lf6/zoijcleaow;Landroidx/window/layout/HardwareFoldingFeature$zoijcleaow;Landroidx/window/layout/FoldingFeature$ppxfxbqfkf;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lf6/zoijcleaow;", "Landroidx/window/layout/HardwareFoldingFeature$zoijcleaow;", "getType$window_release", "()Landroidx/window/layout/HardwareFoldingFeature$zoijcleaow;", "Landroidx/window/layout/FoldingFeature$ppxfxbqfkf;", "getState", "()Landroidx/window/layout/FoldingFeature$ppxfxbqfkf;", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "isSeparating", "()Z", "Landroidx/window/layout/FoldingFeature$iobyxmoadg;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$iobyxmoadg;", "occlusionType", "Landroidx/window/layout/FoldingFeature$zoijcleaow;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$zoijcleaow;", "orientation", "Companion", "iobyxmoadg", "zoijcleaow", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HardwareFoldingFeature implements FoldingFeature {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final f6.zoijcleaow featureBounds;
    private final FoldingFeature.ppxfxbqfkf state;
    private final zoijcleaow type;

    /* JADX INFO: renamed from: androidx.window.layout.HardwareFoldingFeature$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final void iobyxmoadg(f6.zoijcleaow bounds) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bounds, "bounds");
            if (bounds.wkgbmnqykc() == 0 && bounds.iobyxmoadg() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.zoijcleaow() != 0 && bounds.ppxfxbqfkf() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f13795iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f13794zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final zoijcleaow f13792ppxfxbqfkf = new zoijcleaow("FOLD");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final zoijcleaow f13793wkgbmnqykc = new zoijcleaow("HINGE");

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final zoijcleaow iobyxmoadg() {
                return zoijcleaow.f13792ppxfxbqfkf;
            }

            public final zoijcleaow zoijcleaow() {
                return zoijcleaow.f13793wkgbmnqykc;
            }

            private iobyxmoadg() {
            }
        }

        private zoijcleaow(String str) {
            this.f13795iobyxmoadg = str;
        }

        public String toString() {
            return this.f13795iobyxmoadg;
        }
    }

    public HardwareFoldingFeature(f6.zoijcleaow featureBounds, zoijcleaow type, FoldingFeature.ppxfxbqfkf state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureBounds, "featureBounds");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        INSTANCE.iobyxmoadg(featureBounds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(HardwareFoldingFeature.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.featureBounds, hardwareFoldingFeature.featureBounds) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.type, hardwareFoldingFeature.type) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getState(), hardwareFoldingFeature.getState());
    }

    @Override // androidx.window.layout.FoldingFeature
    public Rect getBounds() {
        return this.featureBounds.gxszxtbevo();
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.iobyxmoadg getOcclusionType() {
        return (this.featureBounds.wkgbmnqykc() == 0 || this.featureBounds.iobyxmoadg() == 0) ? FoldingFeature.iobyxmoadg.f13780ppxfxbqfkf : FoldingFeature.iobyxmoadg.f13781wkgbmnqykc;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.zoijcleaow getOrientation() {
        return this.featureBounds.wkgbmnqykc() > this.featureBounds.iobyxmoadg() ? FoldingFeature.zoijcleaow.f13789wkgbmnqykc : FoldingFeature.zoijcleaow.f13788ppxfxbqfkf;
    }

    @Override // androidx.window.layout.FoldingFeature
    public FoldingFeature.ppxfxbqfkf getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: getType$window_release, reason: from getter */
    public final zoijcleaow getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        zoijcleaow zoijcleaowVar = this.type;
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f13794zoijcleaow;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, iobyxmoadgVar.zoijcleaow())) {
            return true;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.type, iobyxmoadgVar.iobyxmoadg()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getState(), FoldingFeature.ppxfxbqfkf.f13785wkgbmnqykc);
    }

    public String toString() {
        return ((Object) HardwareFoldingFeature.class.getSimpleName()) + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
