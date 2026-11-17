package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class esjtqupxsv {

    public static final class iobyxmoadg extends jyumaefscl {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f2294wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(boolean z13, tg.draadjrbmk draadjrbmkVar) {
            super(z13);
            this.f2294wkgbmnqykc = draadjrbmkVar;
        }

        @Override // androidx.activity.jyumaefscl
        public void lqeggnwhkg() {
            this.f2294wkgbmnqykc.invoke(this);
        }
    }

    public static final jyumaefscl iobyxmoadg(iwizpuwonk iwizpuwonkVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, boolean z13, tg.draadjrbmk onBackPressed) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iwizpuwonkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressed, "onBackPressed");
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(z13, onBackPressed);
        if (vdvldrhtssVar != null) {
            iwizpuwonkVar.dxjokdxxww(vdvldrhtssVar, iobyxmoadgVar);
        } else {
            iwizpuwonkVar.nufgyqmvbu(iobyxmoadgVar);
        }
        return iobyxmoadgVar;
    }

    public static /* synthetic */ jyumaefscl zoijcleaow(iwizpuwonk iwizpuwonkVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, boolean z13, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            vdvldrhtssVar = null;
        }
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadg(iwizpuwonkVar, vdvldrhtssVar, z13, draadjrbmkVar);
    }
}
