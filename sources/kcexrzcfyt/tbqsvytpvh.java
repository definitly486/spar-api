package kcexrzcfyt;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public class tbqsvytpvh {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static volatile tbqsvytpvh f54990dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Size f54991eablkybsjg = new Size(1920, 1080);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Size f54992gxszxtbevo = new Size(320, 240);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Size f54993lqeggnwhkg = new Size(640, 480);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Object f54994nufgyqmvbu = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DisplayManager f54995iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Size f54998zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iwizpuwonk.gtknphoqwx f54996ppxfxbqfkf = new iwizpuwonk.gtknphoqwx();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iwizpuwonk.wkgbmnqykc f54997wkgbmnqykc = new iwizpuwonk.wkgbmnqykc();

    private tbqsvytpvh(Context context) {
        this.f54995iobyxmoadg = (DisplayManager) context.getSystemService("display");
    }

    private Display eablkybsjg(Display[] displayArr, boolean z13) {
        Display display = null;
        int i13 = -1;
        for (Display display2 : displayArr) {
            if (!z13 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i14 = point.x;
                int i15 = point.y;
                if (i14 * i15 > i13) {
                    display = display2;
                    i13 = i14 * i15;
                }
            }
        }
        return display;
    }

    private Size iobyxmoadg() {
        Size sizeZoijcleaow = zoijcleaow();
        int width = sizeZoijcleaow.getWidth() * sizeZoijcleaow.getHeight();
        Size size = f54991eablkybsjg;
        if (width > size.getWidth() * size.getHeight()) {
            sizeZoijcleaow = size;
        }
        return this.f54996ppxfxbqfkf.iobyxmoadg(sizeZoijcleaow);
    }

    public static tbqsvytpvh ppxfxbqfkf(Context context) {
        if (f54990dxjokdxxww == null) {
            synchronized (f54994nufgyqmvbu) {
                try {
                    if (f54990dxjokdxxww == null) {
                        f54990dxjokdxxww = new tbqsvytpvh(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f54990dxjokdxxww;
    }

    private Size zoijcleaow() {
        Point point = new Point();
        wkgbmnqykc(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (hcddaimhww.ppxfxbqfkf.ppxfxbqfkf(size, f54992gxszxtbevo) && (size = this.f54997wkgbmnqykc.iobyxmoadg()) == null) {
            size = f54993lqeggnwhkg;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    Size gxszxtbevo() {
        if (this.f54998zoijcleaow != null) {
            return this.f54998zoijcleaow;
        }
        this.f54998zoijcleaow = iobyxmoadg();
        return this.f54998zoijcleaow;
    }

    void lqeggnwhkg() {
        this.f54998zoijcleaow = iobyxmoadg();
    }

    public Display wkgbmnqykc(boolean z13) {
        Display[] displays = this.f54995iobyxmoadg.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayEablkybsjg = eablkybsjg(displays, z13);
        if (displayEablkybsjg == null && z13) {
            displayEablkybsjg = eablkybsjg(displays, false);
        }
        if (displayEablkybsjg != null) {
            return displayEablkybsjg;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }
}
