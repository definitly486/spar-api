package e0;

import android.content.res.Resources;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static final String iobyxmoadg(int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1784741530, i15, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:71)");
        }
        String quantityString = ((Resources) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.btonecajqb())).getQuantityString(i13, i14);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return quantityString;
    }

    public static final String ppxfxbqfkf(int i13, draadjrbmk draadjrbmkVar, int i14) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1223887937, i14, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.btonecajqb())).getString(i13);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return string;
    }

    public static final String wkgbmnqykc(int i13, Object[] objArr, draadjrbmk draadjrbmkVar, int i14) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(2071230100, i14, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = ((Resources) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.btonecajqb())).getString(i13, Arrays.copyOf(objArr, objArr.length));
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return string;
    }

    public static final String zoijcleaow(int i13, int i14, Object[] objArr, draadjrbmk draadjrbmkVar, int i15) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(523207213, i15, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:85)");
        }
        String quantityString = ((Resources) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.btonecajqb())).getQuantityString(i13, i14, Arrays.copyOf(objArr, objArr.length));
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return quantityString;
    }
}
