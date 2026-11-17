package androidx.fragment.app;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final hkdspvbjdz f9230iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final dsvhmnatus f9231ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final dsvhmnatus f9232zoijcleaow;

    static {
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        f9230iobyxmoadg = hkdspvbjdzVar;
        f9232zoijcleaow = new cllcsxoeiz();
        f9231ppxfxbqfkf = hkdspvbjdzVar.zoijcleaow();
    }

    private hkdspvbjdz() {
    }

    public static final boolean eablkybsjg() {
        return (f9232zoijcleaow == null && f9231ppxfxbqfkf == null) ? false : true;
    }

    public static final void iobyxmoadg(Fragment inFragment, Fragment outFragment, boolean z13, androidx.collection.iobyxmoadg sharedElements, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inFragment, "inFragment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outFragment, "outFragment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedElements, "sharedElements");
        if (z13) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    public static final void ppxfxbqfkf(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg namedViews) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(namedViews, "namedViews");
        int size = iobyxmoadgVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) iobyxmoadgVar.gtknphoqwx(size))) {
                iobyxmoadgVar.dxjokdxxww(size);
            }
        }
    }

    public static final void wkgbmnqykc(List views, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i13);
        }
    }

    private final dsvhmnatus zoijcleaow() {
        try {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(androidx.transition.eablkybsjg.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (dsvhmnatus) androidx.transition.eablkybsjg.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
