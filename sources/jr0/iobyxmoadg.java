package jr0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final void iobyxmoadg(androidx.appcompat.app.wkgbmnqykc wkgbmnqykcVar, View view) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        zdlpuopuiu.btonecajqb(view, "view");
        Object systemService = wkgbmnqykcVar.getSystemService("input_method");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        view.clearFocus();
    }

    public static final Fragment zoijcleaow(androidx.appcompat.app.wkgbmnqykc wkgbmnqykcVar) {
        Object obj;
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        List listIgdgnonuha = wkgbmnqykcVar.getSupportFragmentManager().igdgnonuha();
        zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        Iterator it = listIgdgnonuha.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible()) {
                String name = fragment.getClass().getName();
                zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                if (kcexrzcfyt.stevsuqkhv(name, "ru.myspar", false, 2, null)) {
                    obj = next;
                    break;
                }
            }
        }
        return (Fragment) obj;
    }
}
