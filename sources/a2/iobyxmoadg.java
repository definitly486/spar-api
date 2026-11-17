package a2;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import v1.metgxyhuhe;
import v1.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f276iobyxmoadg = wkgbmnqykc.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f277zoijcleaow = wkgbmnqykc.is_pooling_container_tag;

    public static final boolean eablkybsjg(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        Object tag = view.getTag(f277zoijcleaow);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean gxszxtbevo(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        for (Object obj : rlfsiqarku.zoijcleaow(view)) {
            if ((obj instanceof View) && eablkybsjg((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void iobyxmoadg(View view, zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        zdlpuopuiu.btonecajqb(listener, "listener");
        wkgbmnqykc(view).iobyxmoadg(listener);
    }

    public static final void lqeggnwhkg(View view, zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        zdlpuopuiu.btonecajqb(listener, "listener");
        wkgbmnqykc(view).ppxfxbqfkf(listener);
    }

    public static final void nufgyqmvbu(View view, boolean z13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        view.setTag(f277zoijcleaow, Boolean.valueOf(z13));
    }

    public static final void ppxfxbqfkf(ViewGroup viewGroup) {
        zdlpuopuiu.btonecajqb(viewGroup, "<this>");
        Iterator it = metgxyhuhe.iobyxmoadg(viewGroup).iterator();
        while (it.hasNext()) {
            wkgbmnqykc((View) it.next()).zoijcleaow();
        }
    }

    private static final ppxfxbqfkf wkgbmnqykc(View view) {
        int i13 = f276iobyxmoadg;
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) view.getTag(i13);
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
        view.setTag(i13, ppxfxbqfkfVar2);
        return ppxfxbqfkfVar2;
    }

    public static final void zoijcleaow(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        Iterator it = rlfsiqarku.iobyxmoadg(view).iterator();
        while (it.hasNext()) {
            wkgbmnqykc((View) it.next()).zoijcleaow();
        }
    }
}
