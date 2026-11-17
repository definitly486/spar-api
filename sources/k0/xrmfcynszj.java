package k0;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class xrmfcynszj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final xrmfcynszj f53380iobyxmoadg = new xrmfcynszj();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Layout.Alignment f53381ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Layout.Alignment f53382zoijcleaow;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f53382zoijcleaow = alignment;
        f53381ppxfxbqfkf = alignment2;
    }

    private xrmfcynszj() {
    }

    public final Layout.Alignment iobyxmoadg(int i13) {
        if (i13 == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i13 == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i13 == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i13 != 3) {
            return i13 != 4 ? Layout.Alignment.ALIGN_NORMAL : f53381ppxfxbqfkf;
        }
        return f53382zoijcleaow;
    }
}
