package k0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f53304iobyxmoadg = new gxszxtbevo();

    private gxszxtbevo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, RectF rectF, RectF rectF2) {
        return ((Boolean) rgvfuqvkyqVar.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] ppxfxbqfkf(rlfsiqarku rlfsiqarkuVar, RectF rectF, int i13, final tg.rgvfuqvkyq rgvfuqvkyqVar) {
        SegmentFinder segmentFinderIobyxmoadg;
        if (i13 == 1) {
            segmentFinderIobyxmoadg = l0.iobyxmoadg.f61213iobyxmoadg.iobyxmoadg(new l0.btonecajqb(rlfsiqarkuVar.lmojexxdyd(), rlfsiqarkuVar.ylkuphrtab()));
        } else {
            wkgbmnqykc.iobyxmoadg();
            segmentFinderIobyxmoadg = iobyxmoadg.iobyxmoadg(ppxfxbqfkf.iobyxmoadg(rlfsiqarkuVar.lmojexxdyd(), rlfsiqarkuVar.wwaezpbzkn()));
        }
        return rlfsiqarkuVar.dxjokdxxww().getRangeForRect(rectF, segmentFinderIobyxmoadg, new Layout.TextInclusionStrategy() { // from class: k0.eablkybsjg
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return gxszxtbevo.zoijcleaow(rgvfuqvkyqVar, rectF2, rectF3);
            }
        });
    }
}
