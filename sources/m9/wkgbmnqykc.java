package m9;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public interface wkgbmnqykc extends vdvldrhtss {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f66572zoijcleaow = iobyxmoadg.f66573iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f66573iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: m9.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1376iobyxmoadg implements wkgbmnqykc {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ String f66574eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f66575gxszxtbevo;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            final /* synthetic */ boolean f66576lqeggnwhkg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f66577ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final boolean f66578wkgbmnqykc;

            C1376iobyxmoadg(String str, ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
                this.f66574eablkybsjg = str;
                this.f66575gxszxtbevo = ppxfxbqfkfVar;
                this.f66576lqeggnwhkg = z13;
                this.f66577ppxfxbqfkf = str == null ? ppxfxbqfkfVar.getClass().getName() : str;
                this.f66578wkgbmnqykc = z13;
            }

            @Override // m9.wkgbmnqykc
            public boolean eablkybsjg() {
                return this.f66578wkgbmnqykc;
            }

            @Override // m9.wkgbmnqykc
            public Fragment iobyxmoadg(jyumaefscl factory) {
                zdlpuopuiu.btonecajqb(factory, "factory");
                return (Fragment) this.f66575gxszxtbevo.iobyxmoadg(factory);
            }

            @Override // l9.vdvldrhtss
            public String wkgbmnqykc() {
                return this.f66577ppxfxbqfkf;
            }
        }

        private iobyxmoadg() {
        }

        public static /* synthetic */ wkgbmnqykc zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, boolean z13, ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = null;
            }
            if ((i13 & 2) != 0) {
                z13 = true;
            }
            return iobyxmoadgVar.iobyxmoadg(str, z13, ppxfxbqfkfVar);
        }

        public final wkgbmnqykc iobyxmoadg(String str, boolean z13, ppxfxbqfkf fragmentCreator) {
            zdlpuopuiu.btonecajqb(fragmentCreator, "fragmentCreator");
            return new C1376iobyxmoadg(str, fragmentCreator, z13);
        }
    }

    boolean eablkybsjg();

    Fragment iobyxmoadg(jyumaefscl jyumaefsclVar);
}
