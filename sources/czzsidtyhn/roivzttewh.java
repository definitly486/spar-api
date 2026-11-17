package czzsidtyhn;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: loaded from: classes.dex */
public final class roivzttewh implements tbqsvytpvh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final roivzttewh f26469iobyxmoadg = new roivzttewh();

    private roivzttewh() {
    }

    @Override // czzsidtyhn.tbqsvytpvh
    public androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, boolean z13) {
        if (!(((double) f13) > 0.0d)) {
            uwvvkdfqfp.iobyxmoadg.iobyxmoadg("invalid weight; must be greater than zero");
        }
        return wkgbmnqykcVar.eablkybsjg(new LayoutWeightElement(zg.gtknphoqwx.dxjokdxxww(f13, Float.MAX_VALUE), z13));
    }

    @Override // czzsidtyhn.tbqsvytpvh
    public androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
        return wkgbmnqykcVar.eablkybsjg(new VerticalAlignElement(ppxfxbqfkfVar));
    }
}
