package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static gtknphoqwx f13538iobyxmoadg = new androidx.transition.iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static ThreadLocal f13540zoijcleaow = new ThreadLocal();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static ArrayList f13539ppxfxbqfkf = new ArrayList();

    private static class iobyxmoadg implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        ViewGroup f13541yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        gtknphoqwx f13542zdlpuopuiu;

        /* JADX INFO: renamed from: androidx.transition.kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0201iobyxmoadg extends oxmwwwfdhm {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ androidx.collection.iobyxmoadg f13543iobyxmoadg;

            C0201iobyxmoadg(androidx.collection.iobyxmoadg iobyxmoadgVar) {
                this.f13543iobyxmoadg = iobyxmoadgVar;
            }

            @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
            public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
                ((ArrayList) this.f13543iobyxmoadg.get(iobyxmoadg.this.f13541yggfygwlhe)).remove(gtknphoqwxVar);
                gtknphoqwxVar.ikoacuggdj(this);
            }
        }

        iobyxmoadg(gtknphoqwx gtknphoqwxVar, ViewGroup viewGroup) {
            this.f13542zdlpuopuiu = gtknphoqwxVar;
            this.f13541yggfygwlhe = viewGroup;
        }

        private void iobyxmoadg() {
            this.f13541yggfygwlhe.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f13541yggfygwlhe.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            iobyxmoadg();
            if (!kcexrzcfyt.f13539ppxfxbqfkf.remove(this.f13541yggfygwlhe)) {
                return true;
            }
            androidx.collection.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = kcexrzcfyt.ppxfxbqfkf();
            ArrayList arrayList = (ArrayList) iobyxmoadgVarPpxfxbqfkf.get(this.f13541yggfygwlhe);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                iobyxmoadgVarPpxfxbqfkf.put(this.f13541yggfygwlhe, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f13542zdlpuopuiu);
            this.f13542zdlpuopuiu.ppxfxbqfkf(new C0201iobyxmoadg(iobyxmoadgVarPpxfxbqfkf));
            this.f13542zdlpuopuiu.agtfadlqog(this.f13541yggfygwlhe, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((gtknphoqwx) it.next()).jztzpxfvev(this.f13541yggfygwlhe);
                }
            }
            this.f13542zdlpuopuiu.vipkmwdibw(this.f13541yggfygwlhe);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            iobyxmoadg();
            kcexrzcfyt.f13539ppxfxbqfkf.remove(this.f13541yggfygwlhe);
            ArrayList arrayList = (ArrayList) kcexrzcfyt.ppxfxbqfkf().get(this.f13541yggfygwlhe);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((gtknphoqwx) it.next()).jztzpxfvev(this.f13541yggfygwlhe);
                }
            }
            this.f13542zdlpuopuiu.ojitshcjhn(true);
        }
    }

    private static void eablkybsjg(ViewGroup viewGroup, gtknphoqwx gtknphoqwxVar) {
        ArrayList arrayList = (ArrayList) ppxfxbqfkf().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gtknphoqwx) it.next()).ribwqtqdhb(viewGroup);
            }
        }
        if (gtknphoqwxVar != null) {
            gtknphoqwxVar.agtfadlqog(viewGroup, true);
        }
        btonecajqb.iobyxmoadg(viewGroup);
    }

    public static void iobyxmoadg(ViewGroup viewGroup, gtknphoqwx gtknphoqwxVar) {
        if (f13539ppxfxbqfkf.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f13539ppxfxbqfkf.add(viewGroup);
        if (gtknphoqwxVar == null) {
            gtknphoqwxVar = f13538iobyxmoadg;
        }
        gtknphoqwx gtknphoqwxVarClone = gtknphoqwxVar.clone();
        eablkybsjg(viewGroup, gtknphoqwxVarClone);
        btonecajqb.zoijcleaow(viewGroup, null);
        wkgbmnqykc(viewGroup, gtknphoqwxVarClone);
    }

    static androidx.collection.iobyxmoadg ppxfxbqfkf() {
        androidx.collection.iobyxmoadg iobyxmoadgVar;
        WeakReference weakReference = (WeakReference) f13540zoijcleaow.get();
        if (weakReference != null && (iobyxmoadgVar = (androidx.collection.iobyxmoadg) weakReference.get()) != null) {
            return iobyxmoadgVar;
        }
        androidx.collection.iobyxmoadg iobyxmoadgVar2 = new androidx.collection.iobyxmoadg();
        f13540zoijcleaow.set(new WeakReference(iobyxmoadgVar2));
        return iobyxmoadgVar2;
    }

    private static void wkgbmnqykc(ViewGroup viewGroup, gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar == null || viewGroup == null) {
            return;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gtknphoqwxVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(iobyxmoadgVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(iobyxmoadgVar);
    }

    public static yggfygwlhe zoijcleaow(ViewGroup viewGroup, gtknphoqwx gtknphoqwxVar) {
        if (f13539ppxfxbqfkf.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!gtknphoqwxVar.cllcsxoeiz()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f13539ppxfxbqfkf.add(viewGroup);
        gtknphoqwx gtknphoqwxVarClone = gtknphoqwxVar.clone();
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        jyumaefsclVar.weqkydbzbr(gtknphoqwxVarClone);
        eablkybsjg(viewGroup, jyumaefsclVar);
        btonecajqb.zoijcleaow(viewGroup, null);
        wkgbmnqykc(viewGroup, jyumaefsclVar);
        viewGroup.invalidate();
        return jyumaefsclVar.kcexrzcfyt();
    }
}
