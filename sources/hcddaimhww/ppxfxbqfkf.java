package hcddaimhww;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Size f40069iobyxmoadg = new Size(0, 0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final Size f40073zoijcleaow = new Size(320, 240);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Size f40071ppxfxbqfkf = new Size(640, 480);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final Size f40072wkgbmnqykc = new Size(720, 480);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final Size f40067eablkybsjg = new Size(1280, 720);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final Size f40068gxszxtbevo = new Size(1920, 1080);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final Size f40070lqeggnwhkg = new Size(1920, 1440);

    public static int iobyxmoadg(int i13, int i14) {
        return i13 * i14;
    }

    public static boolean ppxfxbqfkf(Size size, Size size2) {
        return zoijcleaow(size) < zoijcleaow(size2);
    }

    public static int zoijcleaow(Size size) {
        return iobyxmoadg(size.getWidth(), size.getHeight());
    }
}
