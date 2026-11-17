package androidx.transition;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.dsvhmnatus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg extends dsvhmnatus {

    /* JADX INFO: renamed from: androidx.transition.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    class C0200eablkybsjg extends gtknphoqwx.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Rect f13442iobyxmoadg;

        C0200eablkybsjg(Rect rect) {
            this.f13442iobyxmoadg = rect;
        }
    }

    class iobyxmoadg extends gtknphoqwx.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Rect f13444iobyxmoadg;

        iobyxmoadg(Rect rect) {
            this.f13444iobyxmoadg = rect;
        }
    }

    class ppxfxbqfkf extends oxmwwwfdhm {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ Object f13446eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ ArrayList f13447gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Object f13448iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Object f13450ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ ArrayList f13451wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ArrayList f13452zoijcleaow;

        ppxfxbqfkf(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f13448iobyxmoadg = obj;
            this.f13452zoijcleaow = arrayList;
            this.f13450ppxfxbqfkf = obj2;
            this.f13451wkgbmnqykc = arrayList2;
            this.f13446eablkybsjg = obj3;
            this.f13447gxszxtbevo = arrayList3;
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            gtknphoqwxVar.ikoacuggdj(this);
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            Object obj = this.f13448iobyxmoadg;
            if (obj != null) {
                eablkybsjg.this.iozdgvuglv(obj, this.f13452zoijcleaow, null);
            }
            Object obj2 = this.f13450ppxfxbqfkf;
            if (obj2 != null) {
                eablkybsjg.this.iozdgvuglv(obj2, this.f13451wkgbmnqykc, null);
            }
            Object obj3 = this.f13446eablkybsjg;
            if (obj3 != null) {
                eablkybsjg.this.iozdgvuglv(obj3, this.f13447gxszxtbevo, null);
            }
        }
    }

    class wkgbmnqykc implements gtknphoqwx.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Runnable f13453iobyxmoadg;

        wkgbmnqykc(Runnable runnable) {
            this.f13453iobyxmoadg = runnable;
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            this.f13453iobyxmoadg.run();
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        }
    }

    class zoijcleaow implements gtknphoqwx.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ View f13455iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ArrayList f13457zoijcleaow;

        zoijcleaow(View view, ArrayList arrayList) {
            this.f13455iobyxmoadg = view;
            this.f13457zoijcleaow = arrayList;
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            gtknphoqwxVar.ikoacuggdj(this);
            this.f13455iobyxmoadg.setVisibility(8);
            int size = this.f13457zoijcleaow.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((View) this.f13457zoijcleaow.get(i13)).setVisibility(0);
            }
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            gtknphoqwxVar.ikoacuggdj(this);
            gtknphoqwxVar.ppxfxbqfkf(this);
        }
    }

    private static boolean cdpycssgdh(gtknphoqwx gtknphoqwxVar) {
        return (dsvhmnatus.draadjrbmk(gtknphoqwxVar.yadqdtsiqt()) && dsvhmnatus.draadjrbmk(gtknphoqwxVar.iozdgvuglv()) && dsvhmnatus.draadjrbmk(gtknphoqwxVar.lmojexxdyd())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void yadqdtsiqt(Runnable runnable, gtknphoqwx gtknphoqwxVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            gtknphoqwxVar.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public boolean agtfadlqog(Object obj) {
        boolean zCllcsxoeiz = ((gtknphoqwx) obj).cllcsxoeiz();
        if (!zCllcsxoeiz) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zCllcsxoeiz;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object btonecajqb(ViewGroup viewGroup, Object obj) {
        return kcexrzcfyt.zoijcleaow(viewGroup, (gtknphoqwx) obj);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void cqumvgiudr(Fragment fragment, Object obj, q1.wkgbmnqykc wkgbmnqykcVar, final Runnable runnable, final Runnable runnable2) {
        final gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        wkgbmnqykcVar.ppxfxbqfkf(new q1.wkgbmnqykc.iobyxmoadg() { // from class: androidx.transition.wkgbmnqykc
            @Override // q1.wkgbmnqykc.iobyxmoadg
            public final void onCancel() {
                eablkybsjg.yadqdtsiqt(runnable, gtknphoqwxVar, runnable2);
            }
        });
        gtknphoqwxVar.ppxfxbqfkf(new wkgbmnqykc(runnable2));
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void eablkybsjg(ViewGroup viewGroup, Object obj) {
        kcexrzcfyt.iobyxmoadg(viewGroup, (gtknphoqwx) obj);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void iobyxmoadg(Object obj, View view) {
        if (obj != null) {
            ((gtknphoqwx) obj).wkgbmnqykc(view);
        }
    }

    public void iozdgvuglv(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        int i13 = 0;
        if (gtknphoqwxVar instanceof jyumaefscl) {
            jyumaefscl jyumaefsclVar = (jyumaefscl) gtknphoqwxVar;
            int iNuxfzjnpeb = jyumaefsclVar.nuxfzjnpeb();
            while (i13 < iNuxfzjnpeb) {
                iozdgvuglv(jyumaefsclVar.zeieaojujs(i13), arrayList, arrayList2);
                i13++;
            }
            return;
        }
        if (cdpycssgdh(gtknphoqwxVar)) {
            return;
        }
        List listYlkuphrtab = gtknphoqwxVar.ylkuphrtab();
        if (listYlkuphrtab.size() == arrayList.size() && listYlkuphrtab.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i13 < size) {
                gtknphoqwxVar.wkgbmnqykc((View) arrayList2.get(i13));
                i13++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                gtknphoqwxVar.okpsazkaxt((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void iwizpuwonk(Fragment fragment, Object obj, q1.wkgbmnqykc wkgbmnqykcVar, Runnable runnable) {
        cqumvgiudr(fragment, obj, wkgbmnqykcVar, null, runnable);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void jyumaefscl(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            gtknphoqwx(view, rect);
            ((gtknphoqwx) obj).uwvvkdfqfp(new iobyxmoadg(rect));
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void kcexrzcfyt(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((gtknphoqwx) obj).ppxfxbqfkf(new ppxfxbqfkf(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void lereixgezr(Object obj, View view, ArrayList arrayList) {
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        List listYlkuphrtab = jyumaefsclVar.ylkuphrtab();
        listYlkuphrtab.clear();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            dsvhmnatus.gxszxtbevo(listYlkuphrtab, (View) arrayList.get(i13));
        }
        listYlkuphrtab.add(view);
        arrayList.add(view);
        zoijcleaow(jyumaefsclVar, arrayList);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public boolean lqeggnwhkg(Object obj) {
        return obj instanceof gtknphoqwx;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object nufgyqmvbu(Object obj) {
        if (obj != null) {
            return ((gtknphoqwx) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object ojitshcjhn(Object obj, Object obj2, Object obj3) {
        gtknphoqwx gtknphoqwxVarDvvnrvtcbc = (gtknphoqwx) obj;
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj2;
        gtknphoqwx gtknphoqwxVar2 = (gtknphoqwx) obj3;
        if (gtknphoqwxVarDvvnrvtcbc != null && gtknphoqwxVar != null) {
            gtknphoqwxVarDvvnrvtcbc = new jyumaefscl().weqkydbzbr(gtknphoqwxVarDvvnrvtcbc).weqkydbzbr(gtknphoqwxVar).dvvnrvtcbc(1);
        } else if (gtknphoqwxVarDvvnrvtcbc == null) {
            gtknphoqwxVarDvvnrvtcbc = gtknphoqwxVar != null ? gtknphoqwxVar : null;
        }
        if (gtknphoqwxVar2 == null) {
            return gtknphoqwxVarDvvnrvtcbc;
        }
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        if (gtknphoqwxVarDvvnrvtcbc != null) {
            jyumaefsclVar.weqkydbzbr(gtknphoqwxVarDvvnrvtcbc);
        }
        jyumaefsclVar.weqkydbzbr(gtknphoqwxVar2);
        return jyumaefsclVar;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void oxmwwwfdhm(Object obj, View view, ArrayList arrayList) {
        ((gtknphoqwx) obj).ppxfxbqfkf(new zoijcleaow(view, arrayList));
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void pmvmpeiblj(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        if (jyumaefsclVar != null) {
            jyumaefsclVar.ylkuphrtab().clear();
            jyumaefsclVar.ylkuphrtab().addAll(arrayList2);
            iozdgvuglv(jyumaefsclVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void ppxfxbqfkf(Object obj) {
        ((yggfygwlhe) obj).eablkybsjg();
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object rgvfuqvkyq(Object obj, Object obj2, Object obj3) {
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        if (obj != null) {
            jyumaefsclVar.weqkydbzbr((gtknphoqwx) obj);
        }
        if (obj2 != null) {
            jyumaefsclVar.weqkydbzbr((gtknphoqwx) obj2);
        }
        if (obj3 != null) {
            jyumaefsclVar.weqkydbzbr((gtknphoqwx) obj3);
        }
        return jyumaefsclVar;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public boolean wflxmlrfwp() {
        return true;
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void wkgbmnqykc(Object obj, Runnable runnable) {
        ((yggfygwlhe) obj).btonecajqb(runnable);
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void yggfygwlhe(Object obj, Rect rect) {
        if (obj != null) {
            ((gtknphoqwx) obj).uwvvkdfqfp(new C0200eablkybsjg(rect));
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void zdlpuopuiu(Object obj, float f13) {
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        if (yggfygwlheVar.ppxfxbqfkf()) {
            long jWkgbmnqykc = (long) (f13 * yggfygwlheVar.wkgbmnqykc());
            if (jWkgbmnqykc == 0) {
                jWkgbmnqykc = 1;
            }
            if (jWkgbmnqykc == yggfygwlheVar.wkgbmnqykc()) {
                jWkgbmnqykc = yggfygwlheVar.wkgbmnqykc() - 1;
            }
            yggfygwlheVar.lqeggnwhkg(jWkgbmnqykc);
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public void zoijcleaow(Object obj, ArrayList arrayList) {
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        if (gtknphoqwxVar == null) {
            return;
        }
        int i13 = 0;
        if (gtknphoqwxVar instanceof jyumaefscl) {
            jyumaefscl jyumaefsclVar = (jyumaefscl) gtknphoqwxVar;
            int iNuxfzjnpeb = jyumaefsclVar.nuxfzjnpeb();
            while (i13 < iNuxfzjnpeb) {
                zoijcleaow(jyumaefsclVar.zeieaojujs(i13), arrayList);
                i13++;
            }
            return;
        }
        if (cdpycssgdh(gtknphoqwxVar) || !dsvhmnatus.draadjrbmk(gtknphoqwxVar.ylkuphrtab())) {
            return;
        }
        int size = arrayList.size();
        while (i13 < size) {
            gtknphoqwxVar.wkgbmnqykc((View) arrayList.get(i13));
            i13++;
        }
    }

    @Override // androidx.fragment.app.dsvhmnatus
    public Object zynmafqrjb(Object obj) {
        if (obj == null) {
            return null;
        }
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        jyumaefsclVar.weqkydbzbr((gtknphoqwx) obj);
        return jyumaefsclVar;
    }
}
