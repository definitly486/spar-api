package fiwbwshyhd;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, vdvldrhtss.class, "onPull", "onPull$material(F)F", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).floatValue());
        }

        public final Float iobyxmoadg(float f13) {
            return Float.valueOf(((vdvldrhtss) this.receiver).oxmwwwfdhm(f13));
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        zoijcleaow(Object obj) {
            super(2, obj, vdvldrhtss.class, "onRelease", "onRelease$material(F)F", 4);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).floatValue(), (lg.gxszxtbevo) obj2);
        }

        public final Object iobyxmoadg(float f13, lg.gxszxtbevo gxszxtbevoVar) {
            return wflxmlrfwp.eablkybsjg((vdvldrhtss) this.f60022zdlpuopuiu, f13, gxszxtbevoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object eablkybsjg(vdvldrhtss vdvldrhtssVar, float f13, lg.gxszxtbevo gxszxtbevoVar) {
        return kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(vdvldrhtssVar.kcexrzcfyt(f13));
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        return androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(wkgbmnqykcVar, new agtfadlqog(draadjrbmkVar, rgvfuqvkyqVar, z13), null, 2, null);
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, vdvldrhtss vdvldrhtssVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return zoijcleaow(wkgbmnqykcVar, vdvldrhtssVar, z13);
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, vdvldrhtss vdvldrhtssVar, boolean z13) {
        return ppxfxbqfkf(wkgbmnqykcVar, new iobyxmoadg(vdvldrhtssVar), new zoijcleaow(vdvldrhtssVar), z13);
    }
}
