package androidx.window.layout;

import android.graphics.Rect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/draadjrbmk;", "", "isSeparating", "()Z", "Landroidx/window/layout/FoldingFeature$iobyxmoadg;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$iobyxmoadg;", "occlusionType", "Landroidx/window/layout/FoldingFeature$zoijcleaow;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$zoijcleaow;", "orientation", "Landroidx/window/layout/FoldingFeature$ppxfxbqfkf;", "getState", "()Landroidx/window/layout/FoldingFeature$ppxfxbqfkf;", "state", "iobyxmoadg", "zoijcleaow", "ppxfxbqfkf", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FoldingFeature extends draadjrbmk {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f13783iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C0206iobyxmoadg f13782zoijcleaow = new C0206iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f13780ppxfxbqfkf = new iobyxmoadg("NONE");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final iobyxmoadg f13781wkgbmnqykc = new iobyxmoadg("FULL");

        /* JADX INFO: renamed from: androidx.window.layout.FoldingFeature$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0206iobyxmoadg {
            public /* synthetic */ C0206iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private C0206iobyxmoadg() {
            }
        }

        private iobyxmoadg(String str) {
            this.f13783iobyxmoadg = str;
        }

        public String toString() {
            return this.f13783iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f13787iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f13786zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f13784ppxfxbqfkf = new ppxfxbqfkf("FLAT");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f13785wkgbmnqykc = new ppxfxbqfkf("HALF_OPENED");

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private iobyxmoadg() {
            }
        }

        private ppxfxbqfkf(String str) {
            this.f13787iobyxmoadg = str;
        }

        public String toString() {
            return this.f13787iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f13791iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f13790zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final zoijcleaow f13788ppxfxbqfkf = new zoijcleaow("VERTICAL");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final zoijcleaow f13789wkgbmnqykc = new zoijcleaow("HORIZONTAL");

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private iobyxmoadg() {
            }
        }

        private zoijcleaow(String str) {
            this.f13791iobyxmoadg = str;
        }

        public String toString() {
            return this.f13791iobyxmoadg;
        }
    }

    /* synthetic */ Rect getBounds();

    iobyxmoadg getOcclusionType();

    zoijcleaow getOrientation();

    ppxfxbqfkf getState();

    boolean isSeparating();
}
