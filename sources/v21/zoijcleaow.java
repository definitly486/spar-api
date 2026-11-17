package v21;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.zdlpuopuiu;
import uw0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f115852iobyxmoadg;

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f115852iobyxmoadg = context.getSharedPreferences("NetworkSharedPreferences", 0);
    }

    @Override // v21.iobyxmoadg
    public String eablkybsjg() {
        String string = this.f115852iobyxmoadg.getString("NetworkSharedPreferencesCurrentApiVersion", null);
        return string == null ? ppxfxbqfkf.f114521iobyxmoadg.btonecajqb().getVersion() : string;
    }

    @Override // v21.iobyxmoadg
    public s21.zoijcleaow iobyxmoadg() {
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.f114521iobyxmoadg;
        String strIobyxmoadg = ppxfxbqfkfVar.cqumvgiudr() ? ppxfxbqfkfVar.iobyxmoadg() : s21.zoijcleaow.TEST.wkgbmnqykc();
        String string = this.f115852iobyxmoadg.getString("NetworkSharedPreferencesCurrentEndPoint", null);
        if (string != null) {
            strIobyxmoadg = string;
        }
        return s21.zoijcleaow.f105221yggfygwlhe.iobyxmoadg(strIobyxmoadg);
    }
}
