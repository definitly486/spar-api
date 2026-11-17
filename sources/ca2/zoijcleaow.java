package ca2;

import java.util.UUID;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f19387iobyxmoadg;

    public zoijcleaow(wkgbmnqykc userSharedPreferences) {
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        this.f19387iobyxmoadg = userSharedPreferences;
    }

    private final String zoijcleaow() {
        String string = UUID.randomUUID().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        this.f19387iobyxmoadg.ppxfxbqfkf(string);
        return string;
    }

    @Override // ca2.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        String strIobyxmoadg = this.f19387iobyxmoadg.iobyxmoadg();
        return kcexrzcfyt.zfvoamnweg(strIobyxmoadg) ? zoijcleaow() : strIobyxmoadg;
    }
}
