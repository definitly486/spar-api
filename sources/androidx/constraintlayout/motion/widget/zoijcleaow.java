package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final HashMap f7983gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final HashMap f7984lqeggnwhkg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MotionLayout f7986iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f7989zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f7987ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f7988wkgbmnqykc = -1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f7985eablkybsjg = -1;

    static {
        HashMap map = new HashMap();
        f7983gxszxtbevo = map;
        HashMap map2 = new HashMap();
        f7984lqeggnwhkg = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public zoijcleaow(MotionLayout motionLayout) {
        this.f7986iobyxmoadg = motionLayout;
    }
}
