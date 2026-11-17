package kk;

import android.content.SharedPreferences;
import npi.spay.Hn;
import npi.spay.In;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ef {
    public static Object iobyxmoadg(gg ggVar, String key, String str) {
        String string;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        SharedPreferences sharedPreferencesA = ggVar.a();
        if (sharedPreferencesA == null || (string = sharedPreferencesA.getString(key, str)) == null) {
            throw In.f70551zdlpuopuiu;
        }
        return string;
    }

    public static void zoijcleaow(gg ggVar, String key, String str) {
        gg.wwaezpbzkn wwaezpbzknVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        SharedPreferences sharedPreferencesA = ggVar.a();
        if (sharedPreferencesA != null) {
            SharedPreferences.Editor editor = sharedPreferencesA.edit();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(editor, "editor");
            if (str != null) {
                editor.putString(key, str);
            } else if (str != null) {
                throw Hn.f70548zdlpuopuiu;
            }
            editor.apply();
            editor.apply();
            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            throw In.f70551zdlpuopuiu;
        }
    }
}
