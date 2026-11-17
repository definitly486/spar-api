package oh;

import bi.jyumaefscl;
import gh.ojitshcjhn;
import java.io.InputStream;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg implements jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ClassLoader f72856iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wi.wkgbmnqykc f72857zoijcleaow;

    public lqeggnwhkg(ClassLoader classLoader) {
        zdlpuopuiu.btonecajqb(classLoader, "classLoader");
        this.f72856iobyxmoadg = classLoader;
        this.f72857zoijcleaow = new wi.wkgbmnqykc();
    }

    private final jyumaefscl.iobyxmoadg wkgbmnqykc(String str) {
        gxszxtbevo gxszxtbevoVarIobyxmoadg;
        Class clsIobyxmoadg = eablkybsjg.iobyxmoadg(this.f72856iobyxmoadg, str);
        if (clsIobyxmoadg == null || (gxszxtbevoVarIobyxmoadg = gxszxtbevo.f72850ppxfxbqfkf.iobyxmoadg(clsIobyxmoadg)) == null) {
            return null;
        }
        return new jyumaefscl.iobyxmoadg.C0291iobyxmoadg(gxszxtbevoVarIobyxmoadg, null, 2, null);
    }

    @Override // bi.jyumaefscl
    public jyumaefscl.iobyxmoadg iobyxmoadg(ii.zoijcleaow classId, hi.eablkybsjg jvmMetadataVersion) {
        zdlpuopuiu.btonecajqb(classId, "classId");
        zdlpuopuiu.btonecajqb(jvmMetadataVersion, "jvmMetadataVersion");
        return wkgbmnqykc(nufgyqmvbu.zoijcleaow(classId));
    }

    @Override // vi.pmvmpeiblj
    public InputStream ppxfxbqfkf(ii.ppxfxbqfkf packageFqName) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        if (packageFqName.dxjokdxxww(ojitshcjhn.f37255lereixgezr)) {
            return this.f72857zoijcleaow.iobyxmoadg(wi.iobyxmoadg.f119905oxmwwwfdhm.oxmwwwfdhm(packageFqName));
        }
        return null;
    }

    @Override // bi.jyumaefscl
    public jyumaefscl.iobyxmoadg zoijcleaow(zh.lqeggnwhkg javaClass, hi.eablkybsjg jvmMetadataVersion) {
        String strZoijcleaow;
        zdlpuopuiu.btonecajqb(javaClass, "javaClass");
        zdlpuopuiu.btonecajqb(jvmMetadataVersion, "jvmMetadataVersion");
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = javaClass.gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo == null || (strZoijcleaow = ppxfxbqfkfVarGxszxtbevo.zoijcleaow()) == null) {
            return null;
        }
        return wkgbmnqykc(strZoijcleaow);
    }
}
