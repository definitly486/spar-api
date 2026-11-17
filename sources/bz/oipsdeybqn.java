package bz;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
class oipsdeybqn extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17543eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f17540gxszxtbevo = t6.iwizpuwonk.iobyxmoadg(new byte[]{-109, 96, -96, -60, 37, -55, -71, 73, 29, -59, -106, 51, -78, -35, 15, -120});

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f17541lqeggnwhkg = t6.iwizpuwonk.iobyxmoadg(new byte[]{49, -121, 68, 86, 88, 16, 105, -75, -57, -17, 26, 125, -19, -4, 125, -125});

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final String f17542nufgyqmvbu = t6.iwizpuwonk.iobyxmoadg(new byte[]{-37, -20, -40, 1, 37, -39, 25, 107, -15, -101, 10, 45, 97, -64, 54, -54});

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final String f17539dxjokdxxww = t6.iwizpuwonk.iobyxmoadg(new byte[]{104, -83, 114, -20, 65, 30, 83, -44, 69, 6, 60, -99, 18, 40, 101, -10});

    oipsdeybqn(Context context) {
        super(kc2.lqeggnwhkg.RdpConnection);
        this.f17543eablkybsjg = context;
    }

    protected static String cdpycssgdh() {
        return f17542nufgyqmvbu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        DisplayManager displayManager = (DisplayManager) this.f17543eablkybsjg.getSystemService("display");
        if (displayManager == null) {
            throw new jhduphickx(t6.iwizpuwonk.iobyxmoadg(new byte[]{-92, 9, -98, -107, 35, -121, 46, -112, 38, 118, 20, -22, -47, 18, 82, -15}));
        }
        for (Display display : displayManager.getDisplays()) {
            int flags = display.getFlags();
            String strValueOf = String.valueOf(display);
            boolean zContains = strValueOf.contains(f17540gxszxtbevo);
            boolean zContains2 = strValueOf.contains(f17541lqeggnwhkg);
            if (flags == 8 || zContains || zContains2) {
                return f17542nufgyqmvbu;
            }
        }
        return f17539dxjokdxxww;
    }
}
