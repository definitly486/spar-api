package ntlheqmsrt;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final C1533iobyxmoadg f71052gtknphoqwx = new C1533iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private GestureDetector f71053btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f71054dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f71055eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f71056gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f71057iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f71058lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f71059nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f71060ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f71061wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f71062zoijcleaow;

    /* JADX INFO: renamed from: ntlheqmsrt.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1533iobyxmoadg {
        public /* synthetic */ C1533iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1533iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf extends GestureDetector.SimpleOnGestureListener {
        ppxfxbqfkf() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e13) {
            zdlpuopuiu.btonecajqb(e13, "e");
            iobyxmoadg.this.f71058lqeggnwhkg = e13.getX();
            iobyxmoadg.this.f71059nufgyqmvbu = e13.getY();
            iobyxmoadg.this.f71054dxjokdxxww = 1;
            return true;
        }
    }

    public interface zoijcleaow {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, zoijcleaow listener) {
        this(context, 0, 0, listener, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(listener, "listener");
    }

    public iobyxmoadg(Context context, int i13, int i14, zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f71057iobyxmoadg = context;
        this.f71062zoijcleaow = i13;
        this.f71060ppxfxbqfkf = i14;
        this.f71061wkgbmnqykc = listener;
        this.f71055eablkybsjg = true;
        this.f71056gxszxtbevo = true;
        this.f71053btonecajqb = new GestureDetector(context, new ppxfxbqfkf());
    }

    public /* synthetic */ iobyxmoadg(Context context, int i13, int i14, zoijcleaow zoijcleaowVar, int i15, gtknphoqwx gtknphoqwxVar) {
        this(context, (i15 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i13, (i15 & 4) != 0 ? 0 : i14, zoijcleaowVar);
    }
}
