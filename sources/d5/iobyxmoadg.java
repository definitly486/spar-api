package d5;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f27055lqeggnwhkg = new iobyxmoadg(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f27056eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Typeface f27057gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f27058iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f27059ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f27060wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f27061zoijcleaow;

    public iobyxmoadg(int i13, int i14, int i15, int i16, int i17, Typeface typeface) {
        this.f27058iobyxmoadg = i13;
        this.f27061zoijcleaow = i14;
        this.f27059ppxfxbqfkf = i15;
        this.f27060wkgbmnqykc = i16;
        this.f27056eablkybsjg = i17;
        this.f27057gxszxtbevo = typeface;
    }

    public static iobyxmoadg iobyxmoadg(CaptioningManager.CaptionStyle captionStyle) {
        return new iobyxmoadg(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f27055lqeggnwhkg.f27058iobyxmoadg, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f27055lqeggnwhkg.f27061zoijcleaow, captionStyle.hasWindowColor() ? captionStyle.windowColor : f27055lqeggnwhkg.f27059ppxfxbqfkf, captionStyle.hasEdgeType() ? captionStyle.edgeType : f27055lqeggnwhkg.f27060wkgbmnqykc, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f27055lqeggnwhkg.f27056eablkybsjg, captionStyle.getTypeface());
    }
}
