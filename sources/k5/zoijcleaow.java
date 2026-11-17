package k5;

import androidx.navigation.wflxmlrfwp;
import bk.agtfadlqog;
import ek.gxszxtbevo;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends ek.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f53837eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f53838iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ik.zoijcleaow f53839ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f53840wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f53841zoijcleaow;

    public zoijcleaow(bk.zoijcleaow serializer, Map typeMap) {
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        zdlpuopuiu.btonecajqb(typeMap, "typeMap");
        this.f53838iobyxmoadg = serializer;
        this.f53841zoijcleaow = typeMap;
        this.f53839ppxfxbqfkf = ik.ppxfxbqfkf.iobyxmoadg();
        this.f53840wkgbmnqykc = new LinkedHashMap();
        this.f53837eablkybsjg = -1;
    }

    private final void jpowsppfya(Object obj) {
        String strEablkybsjg = this.f53838iobyxmoadg.iobyxmoadg().eablkybsjg(this.f53837eablkybsjg);
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) this.f53841zoijcleaow.get(strEablkybsjg);
        if (wflxmlrfwpVar != null) {
            this.f53840wkgbmnqykc.put(strEablkybsjg, wflxmlrfwpVar instanceof h5.zoijcleaow ? ((h5.zoijcleaow) wflxmlrfwpVar).draadjrbmk(obj) : jyumaefscl.eablkybsjg(wflxmlrfwpVar.dxjokdxxww(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strEablkybsjg + ". Please provide NavType through typeMap.").toString());
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public gxszxtbevo agtfadlqog(dk.gxszxtbevo descriptor) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (ppxfxbqfkf.wkgbmnqykc(descriptor)) {
            this.f53837eablkybsjg = 0;
        }
        return super.agtfadlqog(descriptor);
    }

    public final Map hcddaimhww(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        super.rgvfuqvkyq(this.f53838iobyxmoadg, value);
        return tzroggbefp.yggfygwlhe(this.f53840wkgbmnqykc);
    }

    @Override // ek.gxszxtbevo
    public ik.zoijcleaow iobyxmoadg() {
        return this.f53839ppxfxbqfkf;
    }

    @Override // ek.gxszxtbevo
    public void jyumaefscl() {
        jpowsppfya(null);
    }

    @Override // ek.zoijcleaow
    public void pkzmftpjix(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        jpowsppfya(value);
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void rgvfuqvkyq(agtfadlqog serializer, Object obj) {
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        jpowsppfya(obj);
    }

    @Override // ek.zoijcleaow
    public boolean wwaezpbzkn(dk.gxszxtbevo descriptor, int i13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        this.f53837eablkybsjg = i13;
        return true;
    }
}
