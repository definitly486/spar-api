package androidx.compose.animation;

import hg.tzroggbefp;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ribwqtqdhb.iwizpuwonk;
import ribwqtqdhb.kcexrzcfyt;
import ribwqtqdhb.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f4487iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wkgbmnqykc f4488zoijcleaow = new eablkybsjg(new iwizpuwonk(null, null, null, null, false, null, 63, null));

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wkgbmnqykc iobyxmoadg() {
            return wkgbmnqykc.f4488zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(((wkgbmnqykc) obj).zoijcleaow(), zoijcleaow());
    }

    public int hashCode() {
        return zoijcleaow().hashCode();
    }

    public final wkgbmnqykc ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
        ribwqtqdhb.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = wkgbmnqykcVar.zoijcleaow().ppxfxbqfkf();
        if (gtknphoqwxVarPpxfxbqfkf == null) {
            gtknphoqwxVarPpxfxbqfkf = zoijcleaow().ppxfxbqfkf();
        }
        ribwqtqdhb.gtknphoqwx gtknphoqwxVar = gtknphoqwxVarPpxfxbqfkf;
        kcexrzcfyt kcexrzcfytVarGxszxtbevo = wkgbmnqykcVar.zoijcleaow().gxszxtbevo();
        if (kcexrzcfytVarGxszxtbevo == null) {
            kcexrzcfytVarGxszxtbevo = zoijcleaow().gxszxtbevo();
        }
        kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarGxszxtbevo;
        ribwqtqdhb.gxszxtbevo gxszxtbevoVarIobyxmoadg = wkgbmnqykcVar.zoijcleaow().iobyxmoadg();
        if (gxszxtbevoVarIobyxmoadg == null) {
            gxszxtbevoVarIobyxmoadg = zoijcleaow().iobyxmoadg();
        }
        ribwqtqdhb.gxszxtbevo gxszxtbevoVar = gxszxtbevoVarIobyxmoadg;
        vdvldrhtss vdvldrhtssVarEablkybsjg = wkgbmnqykcVar.zoijcleaow().eablkybsjg();
        if (vdvldrhtssVarEablkybsjg == null) {
            vdvldrhtssVarEablkybsjg = zoijcleaow().eablkybsjg();
        }
        return new eablkybsjg(new iwizpuwonk(gtknphoqwxVar, kcexrzcfytVar, gxszxtbevoVar, vdvldrhtssVarEablkybsjg, false, tzroggbefp.rgvfuqvkyq(zoijcleaow().zoijcleaow(), wkgbmnqykcVar.zoijcleaow().zoijcleaow()), 16, null));
    }

    public String toString() {
        if (zdlpuopuiu.eablkybsjg(this, f4488zoijcleaow)) {
            return "EnterTransition.None";
        }
        iwizpuwonk iwizpuwonkVarZoijcleaow = zoijcleaow();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("EnterTransition: \nFade - ");
        ribwqtqdhb.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = iwizpuwonkVarZoijcleaow.ppxfxbqfkf();
        sb3.append(gtknphoqwxVarPpxfxbqfkf != null ? gtknphoqwxVarPpxfxbqfkf.toString() : null);
        sb3.append(",\nSlide - ");
        kcexrzcfyt kcexrzcfytVarGxszxtbevo = iwizpuwonkVarZoijcleaow.gxszxtbevo();
        sb3.append(kcexrzcfytVarGxszxtbevo != null ? kcexrzcfytVarGxszxtbevo.toString() : null);
        sb3.append(",\nShrink - ");
        ribwqtqdhb.gxszxtbevo gxszxtbevoVarIobyxmoadg = iwizpuwonkVarZoijcleaow.iobyxmoadg();
        sb3.append(gxszxtbevoVarIobyxmoadg != null ? gxszxtbevoVarIobyxmoadg.toString() : null);
        sb3.append(",\nScale - ");
        vdvldrhtss vdvldrhtssVarEablkybsjg = iwizpuwonkVarZoijcleaow.eablkybsjg();
        sb3.append(vdvldrhtssVarEablkybsjg != null ? vdvldrhtssVarEablkybsjg.toString() : null);
        return sb3.toString();
    }

    public abstract iwizpuwonk zoijcleaow();

    private wkgbmnqykc() {
    }
}
