package oh;

import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ph.vdvldrhtss;
import ph.zynmafqrjb;
import sh.yggfygwlhe;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ClassLoader f72860iobyxmoadg;

    public wkgbmnqykc(ClassLoader classLoader) {
        zdlpuopuiu.btonecajqb(classLoader, "classLoader");
        this.f72860iobyxmoadg = classLoader;
    }

    @Override // sh.yggfygwlhe
    public Set iobyxmoadg(ii.ppxfxbqfkf packageFqName) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        return null;
    }

    @Override // sh.yggfygwlhe
    public zh.lqeggnwhkg ppxfxbqfkf(yggfygwlhe.iobyxmoadg request) {
        zdlpuopuiu.btonecajqb(request, "request");
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = request.iobyxmoadg();
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = zoijcleaowVarIobyxmoadg.gxszxtbevo();
        String strZoijcleaow = zoijcleaowVarIobyxmoadg.lqeggnwhkg().zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        String strPkzmftpjix = kcexrzcfyt.pkzmftpjix(strZoijcleaow, '.', '$', false, 4, null);
        if (!ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc()) {
            strPkzmftpjix = ppxfxbqfkfVarGxszxtbevo.zoijcleaow() + '.' + strPkzmftpjix;
        }
        Class clsIobyxmoadg = eablkybsjg.iobyxmoadg(this.f72860iobyxmoadg, strPkzmftpjix);
        if (clsIobyxmoadg != null) {
            return new vdvldrhtss(clsIobyxmoadg);
        }
        return null;
    }

    @Override // sh.yggfygwlhe
    public zh.yggfygwlhe zoijcleaow(ii.ppxfxbqfkf fqName, boolean z13) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        return new zynmafqrjb(fqName);
    }
}
