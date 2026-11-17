package q6;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f77990iobyxmoadg = g6.yggfygwlhe.dxjokdxxww("PackageManagerHelper");

    private static int iobyxmoadg(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static void ppxfxbqfkf(Context context, Class cls, boolean z13) {
        try {
            if (z13 == zoijcleaow(iobyxmoadg(context, cls.getName()), false)) {
                g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f77990iobyxmoadg, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z13 ? 1 : 2, 1);
            g6.yggfygwlhe yggfygwlheVarEablkybsjg = g6.yggfygwlhe.eablkybsjg();
            String str = f77990iobyxmoadg;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append(" ");
            sb3.append(z13 ? "enabled" : "disabled");
            yggfygwlheVarEablkybsjg.iobyxmoadg(str, sb3.toString());
        } catch (Exception e13) {
            g6.yggfygwlhe yggfygwlheVarEablkybsjg2 = g6.yggfygwlhe.eablkybsjg();
            String str2 = f77990iobyxmoadg;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(cls.getName());
            sb4.append("could not be ");
            sb4.append(z13 ? "enabled" : "disabled");
            yggfygwlheVarEablkybsjg2.zoijcleaow(str2, sb4.toString(), e13);
        }
    }

    private static boolean zoijcleaow(int i13, boolean z13) {
        if (i13 == 0) {
            return z13;
        }
        return i13 == 1;
    }
}
