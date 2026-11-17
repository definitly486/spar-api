package androidx.compose.animation;

import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ribwqtqdhb.iwizpuwonk;
import ribwqtqdhb.kcexrzcfyt;
import ribwqtqdhb.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f4433iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gxszxtbevo f4434ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gxszxtbevo f4435zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gxszxtbevo iobyxmoadg() {
            return gxszxtbevo.f4435zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    static {
        gtknphoqwx gtknphoqwxVar = null;
        ribwqtqdhb.gtknphoqwx gtknphoqwxVar2 = null;
        kcexrzcfyt kcexrzcfytVar = null;
        ribwqtqdhb.gxszxtbevo gxszxtbevoVar = null;
        vdvldrhtss vdvldrhtssVar = null;
        Map map = null;
        f4435zoijcleaow = new lqeggnwhkg(new iwizpuwonk(gtknphoqwxVar2, kcexrzcfytVar, gxszxtbevoVar, vdvldrhtssVar, false, map, 63, gtknphoqwxVar));
        f4434ppxfxbqfkf = new lqeggnwhkg(new iwizpuwonk(gtknphoqwxVar2, kcexrzcfytVar, gxszxtbevoVar, vdvldrhtssVar, true, map, 47, gtknphoqwxVar));
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(((gxszxtbevo) obj).zoijcleaow(), zoijcleaow());
    }

    public int hashCode() {
        return zoijcleaow().hashCode();
    }

    public final gxszxtbevo ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        ribwqtqdhb.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = gxszxtbevoVar.zoijcleaow().ppxfxbqfkf();
        if (gtknphoqwxVarPpxfxbqfkf == null) {
            gtknphoqwxVarPpxfxbqfkf = zoijcleaow().ppxfxbqfkf();
        }
        ribwqtqdhb.gtknphoqwx gtknphoqwxVar = gtknphoqwxVarPpxfxbqfkf;
        kcexrzcfyt kcexrzcfytVarGxszxtbevo = gxszxtbevoVar.zoijcleaow().gxszxtbevo();
        if (kcexrzcfytVarGxszxtbevo == null) {
            kcexrzcfytVarGxszxtbevo = zoijcleaow().gxszxtbevo();
        }
        kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarGxszxtbevo;
        ribwqtqdhb.gxszxtbevo gxszxtbevoVarIobyxmoadg = gxszxtbevoVar.zoijcleaow().iobyxmoadg();
        if (gxszxtbevoVarIobyxmoadg == null) {
            gxszxtbevoVarIobyxmoadg = zoijcleaow().iobyxmoadg();
        }
        ribwqtqdhb.gxszxtbevo gxszxtbevoVar2 = gxszxtbevoVarIobyxmoadg;
        vdvldrhtss vdvldrhtssVarEablkybsjg = gxszxtbevoVar.zoijcleaow().eablkybsjg();
        if (vdvldrhtssVarEablkybsjg == null) {
            vdvldrhtssVarEablkybsjg = zoijcleaow().eablkybsjg();
        }
        return new lqeggnwhkg(new iwizpuwonk(gtknphoqwxVar, kcexrzcfytVar, gxszxtbevoVar2, vdvldrhtssVarEablkybsjg, gxszxtbevoVar.zoijcleaow().wkgbmnqykc() || zoijcleaow().wkgbmnqykc(), tzroggbefp.rgvfuqvkyq(zoijcleaow().zoijcleaow(), gxszxtbevoVar.zoijcleaow().zoijcleaow())));
    }

    public String toString() {
        if (zdlpuopuiu.eablkybsjg(this, f4435zoijcleaow)) {
            return "ExitTransition.None";
        }
        if (zdlpuopuiu.eablkybsjg(this, f4434ppxfxbqfkf)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        iwizpuwonk iwizpuwonkVarZoijcleaow = zoijcleaow();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ExitTransition: \nFade - ");
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
        sb3.append(",\nKeepUntilTransitionsFinished - ");
        sb3.append(iwizpuwonkVarZoijcleaow.wkgbmnqykc());
        return sb3.toString();
    }

    public abstract iwizpuwonk zoijcleaow();

    private gxszxtbevo() {
    }
}
