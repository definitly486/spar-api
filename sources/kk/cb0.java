package kk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cb0 {
    public static SharedPreferences iobyxmoadg(mc0 mc0Var, Context context, int i13, tg.iobyxmoadg sharedPreferencesCreation) {
        Object objWkgbmnqykc;
        Object objWkgbmnqykc2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferencesCreation, "sharedPreferencesCreation");
        int i14 = i13 + 1;
        if (i14 > 1) {
            jc2.iobyxmoadg.f51100iobyxmoadg.zoijcleaow("Seamless SP count of try - " + i14, new Object[0]);
        }
        if (10 == i14) {
            return null;
        }
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((SharedPreferences) sharedPreferencesCreation.invoke());
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) && i14 > 3) {
            try {
                context.getSharedPreferences(context.getPackageName() + mc0Var.a(), 0).edit().clear().apply();
                objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th3) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th3));
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                jc2.iobyxmoadg.f51100iobyxmoadg.zoijcleaow("SP result --- " + gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2), new Object[0]);
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        return sharedPreferences == null ? mc0Var.iobyxmoadg(context, i14, sharedPreferencesCreation) : sharedPreferences;
    }
}
