package m0;

import android.graphics.Paint;
import android.text.Layout;
import k0.uwvvkdfqfp;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f64845iobyxmoadg;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f64845iobyxmoadg = iArr;
        }
    }

    public static final float iobyxmoadg(Layout layout, int i13, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i13);
        if (!uwvvkdfqfp.wflxmlrfwp(layout, i13) || layout.getParagraphDirection(i13) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i13) + layout.getEllipsisStart(i13)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i13);
        if ((paragraphAlignment == null ? -1 : iobyxmoadg.f64845iobyxmoadg[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static final float ppxfxbqfkf(Layout layout, int i13, Paint paint) {
        float width;
        float width2;
        if (!uwvvkdfqfp.wflxmlrfwp(layout, i13)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i13) != -1 || layout.getWidth() >= layout.getLineRight(i13)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i13) - layout.getPrimaryHorizontal(layout.getLineStart(i13) + layout.getEllipsisStart(i13))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i13);
        if ((paragraphAlignment != null ? iobyxmoadg.f64845iobyxmoadg[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i13);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i13);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float wkgbmnqykc(Layout layout, int i13, Paint paint, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            paint = layout.getPaint();
        }
        return ppxfxbqfkf(layout, i13, paint);
    }

    public static /* synthetic */ float zoijcleaow(Layout layout, int i13, Paint paint, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            paint = layout.getPaint();
        }
        return iobyxmoadg(layout, i13, paint);
    }
}
