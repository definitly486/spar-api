package igdgnonuha;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class w3 {
    public static final String iobyxmoadg(int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        String string;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-726638443, i14, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gxszxtbevo());
        Resources resources = ((Context) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg())).getResources();
        v3.iobyxmoadg iobyxmoadgVar = v3.f43979iobyxmoadg;
        if (v3.btonecajqb(i13, iobyxmoadgVar.eablkybsjg())) {
            string = resources.getString(a.draadjrbmk.navigation_menu);
        } else if (v3.btonecajqb(i13, iobyxmoadgVar.iobyxmoadg())) {
            string = resources.getString(a.draadjrbmk.close_drawer);
        } else if (v3.btonecajqb(i13, iobyxmoadgVar.zoijcleaow())) {
            string = resources.getString(a.draadjrbmk.close_sheet);
        } else if (v3.btonecajqb(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            string = resources.getString(a.draadjrbmk.default_error_message);
        } else if (v3.btonecajqb(i13, iobyxmoadgVar.wkgbmnqykc())) {
            string = resources.getString(a.draadjrbmk.dropdown_menu);
        } else if (v3.btonecajqb(i13, iobyxmoadgVar.lqeggnwhkg())) {
            string = resources.getString(a.draadjrbmk.range_start);
        } else if (v3.btonecajqb(i13, iobyxmoadgVar.gxszxtbevo())) {
            string = resources.getString(a.draadjrbmk.range_end);
        } else {
            string = v3.btonecajqb(i13, iobyxmoadgVar.nufgyqmvbu()) ? resources.getString(a2.mc2_snackbar_pane_title) : "";
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return string;
    }
}
