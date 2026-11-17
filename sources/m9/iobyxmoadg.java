package m9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public interface iobyxmoadg extends vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1374iobyxmoadg f66565iobyxmoadg = C1374iobyxmoadg.f66566iobyxmoadg;

    /* JADX INFO: renamed from: m9.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1374iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C1374iobyxmoadg f66566iobyxmoadg = new C1374iobyxmoadg();

        /* JADX INFO: renamed from: m9.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1375iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ String f66567eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f66568gxszxtbevo;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            final /* synthetic */ Bundle f66569lqeggnwhkg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f66570ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final Bundle f66571wkgbmnqykc;

            C1375iobyxmoadg(String str, ppxfxbqfkf ppxfxbqfkfVar, Bundle bundle) {
                this.f66567eablkybsjg = str;
                this.f66568gxszxtbevo = ppxfxbqfkfVar;
                this.f66569lqeggnwhkg = bundle;
                this.f66570ppxfxbqfkf = str == null ? ppxfxbqfkfVar.getClass().getName() : str;
                this.f66571wkgbmnqykc = bundle;
            }

            @Override // m9.iobyxmoadg
            public Intent ppxfxbqfkf(Context context) {
                zdlpuopuiu.btonecajqb(context, "context");
                return (Intent) this.f66568gxszxtbevo.iobyxmoadg(context);
            }

            @Override // l9.vdvldrhtss
            public String wkgbmnqykc() {
                return this.f66570ppxfxbqfkf;
            }

            @Override // m9.iobyxmoadg
            public Bundle zoijcleaow() {
                return this.f66571wkgbmnqykc;
            }
        }

        private C1374iobyxmoadg() {
        }

        public static /* synthetic */ iobyxmoadg zoijcleaow(C1374iobyxmoadg c1374iobyxmoadg, String str, Bundle bundle, ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = null;
            }
            if ((i13 & 2) != 0) {
                bundle = null;
            }
            return c1374iobyxmoadg.iobyxmoadg(str, bundle, ppxfxbqfkfVar);
        }

        public final iobyxmoadg iobyxmoadg(String str, Bundle bundle, ppxfxbqfkf intentCreator) {
            zdlpuopuiu.btonecajqb(intentCreator, "intentCreator");
            return new C1375iobyxmoadg(str, intentCreator, bundle);
        }
    }

    Intent ppxfxbqfkf(Context context);

    Bundle zoijcleaow();
}
