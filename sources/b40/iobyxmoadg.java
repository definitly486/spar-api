package b40;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final Fragment iobyxmoadg(Fragment fragment, Parcelable parcelable, boolean z13) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(fragment, "<this>");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            fragment.setArguments(qs.ppxfxbqfkf.iobyxmoadg(fragment, parcelable, cqumvgiudr.iobyxmoadg("BUNDLE_ANIMATION_ENABLED", Boolean.valueOf(z13))));
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            q30.iobyxmoadg.f77790iobyxmoadg.zoijcleaow(thDxjokdxxww);
        }
        return fragment;
    }

    public static /* synthetic */ Fragment zoijcleaow(Fragment fragment, Parcelable parcelable, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            parcelable = null;
        }
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadg(fragment, parcelable, z13);
    }
}
