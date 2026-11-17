package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ojitshcjhn f13826iobyxmoadg = new ojitshcjhn();

    private ojitshcjhn() {
    }

    private final boolean ppxfxbqfkf(Activity activity, f6.zoijcleaow zoijcleaowVar) {
        Rect rectIobyxmoadg = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).iobyxmoadg();
        if (zoijcleaowVar.eablkybsjg()) {
            return false;
        }
        if (zoijcleaowVar.wkgbmnqykc() != rectIobyxmoadg.width() && zoijcleaowVar.iobyxmoadg() != rectIobyxmoadg.height()) {
            return false;
        }
        if (zoijcleaowVar.wkgbmnqykc() >= rectIobyxmoadg.width() || zoijcleaowVar.iobyxmoadg() >= rectIobyxmoadg.height()) {
            return (zoijcleaowVar.wkgbmnqykc() == rectIobyxmoadg.width() && zoijcleaowVar.iobyxmoadg() == rectIobyxmoadg.height()) ? false : true;
        }
        return false;
    }

    public final FoldingFeature iobyxmoadg(Activity activity, androidx.window.extensions.layout.FoldingFeature oemFeature) {
        HardwareFoldingFeature.zoijcleaow zoijcleaowVarIobyxmoadg;
        FoldingFeature.ppxfxbqfkf ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            zoijcleaowVarIobyxmoadg = HardwareFoldingFeature.zoijcleaow.f13794zoijcleaow.iobyxmoadg();
        } else {
            if (type != 2) {
                return null;
            }
            zoijcleaowVarIobyxmoadg = HardwareFoldingFeature.zoijcleaow.f13794zoijcleaow.zoijcleaow();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            ppxfxbqfkfVar = FoldingFeature.ppxfxbqfkf.f13784ppxfxbqfkf;
        } else {
            if (state != 2) {
                return null;
            }
            ppxfxbqfkfVar = FoldingFeature.ppxfxbqfkf.f13785wkgbmnqykc;
        }
        Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bounds, "oemFeature.bounds");
        if (!ppxfxbqfkf(activity, new f6.zoijcleaow(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bounds2, "oemFeature.bounds");
        return new HardwareFoldingFeature(new f6.zoijcleaow(bounds2), zoijcleaowVarIobyxmoadg, ppxfxbqfkfVar);
    }

    public final iwizpuwonk zoijcleaow(Activity activity, WindowLayoutInfo info) {
        FoldingFeature foldingFeatureIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                ojitshcjhn ojitshcjhnVar = f13826iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(feature, "feature");
                foldingFeatureIobyxmoadg = ojitshcjhnVar.iobyxmoadg(activity, feature);
            } else {
                foldingFeatureIobyxmoadg = null;
            }
            if (foldingFeatureIobyxmoadg != null) {
                arrayList.add(foldingFeatureIobyxmoadg);
            }
        }
        return new iwizpuwonk(arrayList);
    }
}
