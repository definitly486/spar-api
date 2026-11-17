package czzsidtyhn;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss implements rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final vdvldrhtss f26487iobyxmoadg = new vdvldrhtss();

    private vdvldrhtss() {
    }

    @Override // czzsidtyhn.rgvfuqvkyq
    public androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, boolean z13) {
        if (!(((double) f13) > 0.0d)) {
            uwvvkdfqfp.iobyxmoadg.iobyxmoadg("invalid weight; must be greater than zero");
        }
        return wkgbmnqykcVar.eablkybsjg(new LayoutWeightElement(zg.gtknphoqwx.dxjokdxxww(f13, Float.MAX_VALUE), z13));
    }

    @Override // czzsidtyhn.rgvfuqvkyq
    public androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, a.eablkybsjg.zoijcleaow zoijcleaowVar) {
        return wkgbmnqykcVar.eablkybsjg(new HorizontalAlignElement(zoijcleaowVar));
    }
}
