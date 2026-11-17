package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public abstract class dsvhmnatus {

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ ArrayList f9208cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ArrayList f9210iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ArrayList f9211jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ArrayList f9212yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f9213zdlpuopuiu;

        iobyxmoadg(int i13, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f9213zdlpuopuiu = i13;
            this.f9212yggfygwlhe = arrayList;
            this.f9211jyumaefscl = arrayList2;
            this.f9210iwizpuwonk = arrayList3;
            this.f9208cqumvgiudr = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i13 = 0; i13 < this.f9213zdlpuopuiu; i13++) {
                jhduphickx.fyldjkxazc((View) this.f9212yggfygwlhe.get(i13), (String) this.f9211jyumaefscl.get(i13));
                jhduphickx.fyldjkxazc((View) this.f9210iwizpuwonk.get(i13), (String) this.f9208cqumvgiudr.get(i13));
            }
        }
    }

    protected static boolean draadjrbmk(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean dxjokdxxww(List list, View view, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (list.get(i14) == view) {
                return true;
            }
        }
        return false;
    }

    protected static void gxszxtbevo(List list, View view) {
        int size = list.size();
        if (dxjokdxxww(list, view, size)) {
            return;
        }
        if (jhduphickx.ylkuphrtab(view) != null) {
            list.add(view);
        }
        for (int i13 = size; i13 < list.size(); i13++) {
            View view2 = (View) list.get(i13);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    if (!dxjokdxxww(list, childAt, size) && jhduphickx.ylkuphrtab(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public abstract boolean agtfadlqog(Object obj);

    public Object btonecajqb(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public void cqumvgiudr(Fragment fragment, Object obj, q1.wkgbmnqykc wkgbmnqykcVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public abstract void eablkybsjg(ViewGroup viewGroup, Object obj);

    void esjtqupxsv(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList.get(i13);
            String strYlkuphrtab = jhduphickx.ylkuphrtab(view2);
            arrayList4.add(strYlkuphrtab);
            if (strYlkuphrtab != null) {
                jhduphickx.fyldjkxazc(view2, null);
                String str = (String) map.get(strYlkuphrtab);
                for (int i14 = 0; i14 < size; i14++) {
                    if (str.equals(arrayList3.get(i14))) {
                        jhduphickx.fyldjkxazc((View) arrayList2.get(i14), strYlkuphrtab);
                        break;
                    }
                }
            }
        }
        v1.hkdspvbjdz.iobyxmoadg(view, new iobyxmoadg(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    protected void gtknphoqwx(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract void iobyxmoadg(Object obj, View view);

    public abstract void iwizpuwonk(Fragment fragment, Object obj, q1.wkgbmnqykc wkgbmnqykcVar, Runnable runnable);

    public abstract void jyumaefscl(Object obj, View view);

    public abstract void kcexrzcfyt(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void lereixgezr(Object obj, View view, ArrayList arrayList);

    public abstract boolean lqeggnwhkg(Object obj);

    public abstract Object nufgyqmvbu(Object obj);

    public abstract Object ojitshcjhn(Object obj, Object obj2, Object obj3);

    public abstract void oxmwwwfdhm(Object obj, View view, ArrayList arrayList);

    public abstract void pmvmpeiblj(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public void ppxfxbqfkf(Object obj) {
    }

    public abstract Object rgvfuqvkyq(Object obj, Object obj2, Object obj3);

    ArrayList vdvldrhtss(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            arrayList2.add(jhduphickx.ylkuphrtab(view));
            jhduphickx.fyldjkxazc(view, null);
        }
        return arrayList2;
    }

    public abstract boolean wflxmlrfwp();

    public void wkgbmnqykc(Object obj, Runnable runnable) {
    }

    public abstract void yggfygwlhe(Object obj, Rect rect);

    public void zdlpuopuiu(Object obj, float f13) {
    }

    public abstract void zoijcleaow(Object obj, ArrayList arrayList);

    public abstract Object zynmafqrjb(Object obj);
}
