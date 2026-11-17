package jr0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import gg.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final Bundle iobyxmoadg(Fragment fragment, Parcelable parcelable, vdvldrhtss vdvldrhtssVar) {
        zdlpuopuiu.btonecajqb(fragment, "<this>");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = q1.ppxfxbqfkf.iobyxmoadg();
        }
        if (parcelable != null) {
            arguments.remove("BUNDLE_INITIAL_ARGS");
            arguments.putParcelable("BUNDLE_INITIAL_ARGS", parcelable);
        }
        if (vdvldrhtssVar != null) {
            arguments.remove((String) vdvldrhtssVar.lqeggnwhkg());
            arguments.putAll(q1.ppxfxbqfkf.zoijcleaow(vdvldrhtssVar));
        }
        return arguments;
    }

    public static final void ppxfxbqfkf(Fragment fragment) {
        zdlpuopuiu.btonecajqb(fragment, "<this>");
        View view = fragment.getView();
        if (view != null) {
            Object systemService = fragment.requireContext().getSystemService("input_method");
            zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            view.clearFocus();
        }
    }

    public static final Parcelable wkgbmnqykc(Fragment fragment, ah.wkgbmnqykc argumentClass) {
        zdlpuopuiu.btonecajqb(fragment, "<this>");
        zdlpuopuiu.btonecajqb(argumentClass, "argumentClass");
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) fragment.requireArguments().getParcelable("BUNDLE_INITIAL_ARGS", sg.iobyxmoadg.zoijcleaow(argumentClass)) : fragment.requireArguments().getParcelable("BUNDLE_INITIAL_ARGS");
        if (parcelable != null) {
            return parcelable;
        }
        throw new IllegalArgumentException("Fragment doesn't contain initial args");
    }

    public static /* synthetic */ Bundle zoijcleaow(Fragment fragment, Parcelable parcelable, vdvldrhtss vdvldrhtssVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            parcelable = null;
        }
        if ((i13 & 2) != 0) {
            vdvldrhtssVar = null;
        }
        return iobyxmoadg(fragment, parcelable, vdvldrhtssVar);
    }
}
