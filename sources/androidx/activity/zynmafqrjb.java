package androidx.activity;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f2374eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f2375iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f2376ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.draadjrbmk f2377wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f2378zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: androidx.activity.zynmafqrjb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0065iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0065iobyxmoadg f2379zdlpuopuiu = new C0065iobyxmoadg();

            C0065iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final ppxfxbqfkf f2380zdlpuopuiu = new ppxfxbqfkf();

            ppxfxbqfkf() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final zoijcleaow f2381zdlpuopuiu = new zoijcleaow();

            zoijcleaow() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ zynmafqrjb zoijcleaow(iobyxmoadg iobyxmoadgVar, int i13, int i14, tg.draadjrbmk draadjrbmkVar, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                draadjrbmkVar = C0065iobyxmoadg.f2379zdlpuopuiu;
            }
            return iobyxmoadgVar.iobyxmoadg(i13, i14, draadjrbmkVar);
        }

        public final zynmafqrjb iobyxmoadg(int i13, int i14, tg.draadjrbmk detectDarkMode) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(detectDarkMode, "detectDarkMode");
            return new zynmafqrjb(i13, i14, 0, detectDarkMode, null);
        }

        public final zynmafqrjb ppxfxbqfkf(int i13) {
            return new zynmafqrjb(i13, i13, 2, zoijcleaow.f2381zdlpuopuiu, null);
        }

        public final zynmafqrjb wkgbmnqykc(int i13, int i14) {
            return new zynmafqrjb(i13, i14, 1, ppxfxbqfkf.f2380zdlpuopuiu, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ zynmafqrjb(int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, i14, i15, draadjrbmkVar);
    }

    public final tg.draadjrbmk iobyxmoadg() {
        return this.f2377wkgbmnqykc;
    }

    public final int ppxfxbqfkf(boolean z13) {
        return z13 ? this.f2378zoijcleaow : this.f2375iobyxmoadg;
    }

    public final int wkgbmnqykc(boolean z13) {
        if (this.f2376ppxfxbqfkf == 0) {
            return 0;
        }
        return z13 ? this.f2378zoijcleaow : this.f2375iobyxmoadg;
    }

    public final int zoijcleaow() {
        return this.f2376ppxfxbqfkf;
    }

    private zynmafqrjb(int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar) {
        this.f2375iobyxmoadg = i13;
        this.f2378zoijcleaow = i14;
        this.f2376ppxfxbqfkf = i15;
        this.f2377wkgbmnqykc = draadjrbmkVar;
    }
}
