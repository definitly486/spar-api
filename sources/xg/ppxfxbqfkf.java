package xg;

import java.io.Serializable;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f122316zdlpuopuiu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final ppxfxbqfkf f122315yggfygwlhe = og.zoijcleaow.f72829iobyxmoadg.zoijcleaow();

    public static final class iobyxmoadg extends ppxfxbqfkf implements Serializable {

        /* JADX INFO: renamed from: xg.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class C3080iobyxmoadg implements Serializable {
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C3080iobyxmoadg f122317zdlpuopuiu = new C3080iobyxmoadg();

            private C3080iobyxmoadg() {
            }

            private final Object readResolve() {
                return ppxfxbqfkf.f122316zdlpuopuiu;
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final Object writeReplace() {
            return C3080iobyxmoadg.f122317zdlpuopuiu;
        }

        @Override // xg.ppxfxbqfkf
        public int lqeggnwhkg(int i13) {
            return ppxfxbqfkf.f122315yggfygwlhe.lqeggnwhkg(i13);
        }

        @Override // xg.ppxfxbqfkf
        public int wkgbmnqykc() {
            return ppxfxbqfkf.f122315yggfygwlhe.wkgbmnqykc();
        }

        private iobyxmoadg() {
        }
    }

    public abstract int lqeggnwhkg(int i13);

    public abstract int wkgbmnqykc();
}
