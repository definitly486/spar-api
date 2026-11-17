package d31;

import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg.zoijcleaow f26908iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f26907zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f26906ppxfxbqfkf = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(eablkybsjg.ppxfxbqfkf activityResultRegistry, final draadjrbmk onPermissionsResult) {
        zdlpuopuiu.btonecajqb(activityResultRegistry, "activityResultRegistry");
        zdlpuopuiu.btonecajqb(onPermissionsResult, "onPermissionsResult");
        eablkybsjg.zoijcleaow zoijcleaowVarBtonecajqb = activityResultRegistry.btonecajqb("PermissionsResultLauncher", new gxszxtbevo.gxszxtbevo(), new eablkybsjg.iobyxmoadg() { // from class: d31.ppxfxbqfkf
            @Override // eablkybsjg.iobyxmoadg
            public final void iobyxmoadg(Object obj) {
                wkgbmnqykc.ppxfxbqfkf(onPermissionsResult, (Map) obj);
            }
        });
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarBtonecajqb, "register(...)");
        this.f26908iobyxmoadg = zoijcleaowVarBtonecajqb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(draadjrbmk draadjrbmkVar, Map map) {
        zdlpuopuiu.lqeggnwhkg(map);
        draadjrbmkVar.invoke(map);
    }

    public final void zoijcleaow(String[] permissionsArray) {
        zdlpuopuiu.btonecajqb(permissionsArray, "permissionsArray");
        this.f26908iobyxmoadg.iobyxmoadg(permissionsArray);
    }
}
