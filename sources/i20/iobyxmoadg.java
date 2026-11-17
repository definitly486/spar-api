package i20;

import ca2.wkgbmnqykc;
import ft.zoijcleaow;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final l40.zoijcleaow f41711iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f41712zoijcleaow;

    public iobyxmoadg(l40.zoijcleaow apiEndPointsProvider, wkgbmnqykc userSharedPreferences) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        this.f41711iobyxmoadg = apiEndPointsProvider;
        this.f41712zoijcleaow = userSharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(wwaezpbzkn parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        String strEablkybsjg = this.f41711iobyxmoadg.eablkybsjg();
        String strLqeggnwhkg = this.f41712zoijcleaow.lqeggnwhkg();
        if (strLqeggnwhkg == null) {
            strLqeggnwhkg = "";
        }
        return strEablkybsjg + "?token=" + strLqeggnwhkg;
    }
}
