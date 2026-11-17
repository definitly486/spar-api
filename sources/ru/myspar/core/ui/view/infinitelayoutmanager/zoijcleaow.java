package ru.myspar.core.ui.view.infinitelayoutmanager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final int iobyxmoadg(int i13, int i14, int i15) {
        int i16 = (i13 + i14) % i15;
        return i16 < 0 ? i16 + i15 : i16;
    }

    public static final int ppxfxbqfkf(int i13, int i14) {
        return iobyxmoadg(i13, 1, i14);
    }

    public static final int zoijcleaow(int i13, int i14) {
        return iobyxmoadg(i13, -1, i14);
    }
}
