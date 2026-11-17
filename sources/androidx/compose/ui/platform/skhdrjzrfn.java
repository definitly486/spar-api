package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class skhdrjzrfn {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final zoijcleaow f7064gxszxtbevo = new zoijcleaow(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f7065lqeggnwhkg = 8;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final iobyxmoadg f7066nufgyqmvbu = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Rect f7068iobyxmoadg = new Rect();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Rect f7071zoijcleaow = new Rect();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Rect f7069ppxfxbqfkf = new Rect();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f7070wkgbmnqykc = new ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg() { // from class: androidx.compose.ui.platform.dvvnrvtcbc
        @Override // androidx.compose.ui.platform.skhdrjzrfn.ppxfxbqfkf.iobyxmoadg
        public final View iobyxmoadg(View view, View view2) {
            return skhdrjzrfn.rgvfuqvkyq(this.f6864iobyxmoadg, view, view2);
        }
    });

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ArrayList f7067eablkybsjg = new ArrayList();

    public static final class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public skhdrjzrfn initialValue() {
            return new skhdrjzrfn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf implements Comparator {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private View f7073esjtqupxsv;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final iobyxmoadg f7077zdlpuopuiu;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final androidx.collection.dsvhmnatus f7076yggfygwlhe = androidx.collection.ribwqtqdhb.zoijcleaow();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final androidx.collection.wypolnanlu f7075jyumaefscl = androidx.collection.jhduphickx.zoijcleaow();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final androidx.collection.dsvhmnatus f7074iwizpuwonk = androidx.collection.ribwqtqdhb.zoijcleaow();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final androidx.collection.hcddaimhww f7072cqumvgiudr = androidx.collection.tzroggbefp.zoijcleaow();

        public interface iobyxmoadg {
            View iobyxmoadg(View view, View view2);
        }

        public ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
            this.f7077zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = (View) this.f7074iwizpuwonk.eablkybsjg(view);
            View view4 = (View) this.f7074iwizpuwonk.eablkybsjg(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.f7076yggfygwlhe.eablkybsjg(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.f7072cqumvgiudr.ppxfxbqfkf(view) < this.f7072cqumvgiudr.ppxfxbqfkf(view2) ? -1 : 1;
        }

        public final void ppxfxbqfkf(ArrayList arrayList, View view) {
            this.f7073esjtqupxsv = view;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                this.f7072cqumvgiudr.yggfygwlhe((View) arrayList.get(i13), i13);
            }
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i14 = size2 - 1;
                    View view2 = (View) arrayList.get(size2);
                    View viewIobyxmoadg = this.f7077zdlpuopuiu.iobyxmoadg(view, view2);
                    if (viewIobyxmoadg != null && this.f7072cqumvgiudr.iobyxmoadg(viewIobyxmoadg)) {
                        this.f7076yggfygwlhe.cqumvgiudr(view2, viewIobyxmoadg);
                        this.f7075jyumaefscl.nufgyqmvbu(viewIobyxmoadg);
                    }
                    if (i14 < 0) {
                        break;
                    } else {
                        size2 = i14;
                    }
                }
            }
            int size3 = arrayList.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i15 = size3 - 1;
                View view3 = (View) arrayList.get(size3);
                if (((View) this.f7076yggfygwlhe.eablkybsjg(view3)) != null && !this.f7075jyumaefscl.iobyxmoadg(view3)) {
                    wkgbmnqykc(view3);
                }
                if (i15 < 0) {
                    return;
                } else {
                    size3 = i15;
                }
            }
        }

        public final void wkgbmnqykc(View view) {
            View view2 = view;
            while (view != null) {
                View view3 = (View) this.f7074iwizpuwonk.eablkybsjg(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.f7074iwizpuwonk.cqumvgiudr(view, view2);
                view = (View) this.f7076yggfygwlhe.eablkybsjg(view);
            }
        }

        public final void zoijcleaow() {
            this.f7073esjtqupxsv = null;
            this.f7074iwizpuwonk.gtknphoqwx();
            this.f7075jyumaefscl.wflxmlrfwp();
            this.f7072cqumvgiudr.btonecajqb();
            this.f7076yggfygwlhe.gtknphoqwx();
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final skhdrjzrfn iobyxmoadg() {
            Object obj = skhdrjzrfn.f7066nufgyqmvbu.get();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
            return (skhdrjzrfn) obj;
        }

        private zoijcleaow() {
        }
    }

    private final void agtfadlqog(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final ViewGroup btonecajqb(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (parent instanceof ViewGroup) {
                if (parent == viewGroup) {
                    return viewGroup2 == null ? viewGroup : viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    private final View draadjrbmk(View view, ArrayList arrayList, int i13) {
        int iIndexOf;
        if (i13 < 2) {
            return null;
        }
        return (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(i13 - 1) : (View) arrayList.get(iIndexOf - 1);
    }

    private final View dxjokdxxww(ViewGroup viewGroup, View view, int i13) {
        View viewEablkybsjg = igdgnonuha.eablkybsjg(view, viewGroup, i13);
        boolean z13 = true;
        View viewEablkybsjg2 = viewEablkybsjg;
        while (viewEablkybsjg != null) {
            if (viewEablkybsjg.isFocusable() && viewEablkybsjg.getVisibility() == 0 && (!viewEablkybsjg.isInTouchMode() || viewEablkybsjg.isFocusableInTouchMode())) {
                return viewEablkybsjg;
            }
            viewEablkybsjg = igdgnonuha.eablkybsjg(viewEablkybsjg, viewGroup, i13);
            boolean z14 = !z13;
            if (!z13) {
                viewEablkybsjg2 = viewEablkybsjg2 != null ? igdgnonuha.eablkybsjg(viewEablkybsjg2, viewGroup, i13) : null;
                if (viewEablkybsjg2 == viewEablkybsjg) {
                    break;
                }
            }
            z13 = z14;
        }
        return null;
    }

    private final View eablkybsjg(ViewGroup viewGroup, View view, Rect rect, int i13, ArrayList arrayList) {
        Rect rect2 = this.f7068iobyxmoadg;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 17 || i13 == 33) {
                    agtfadlqog(viewGroup, rect2);
                } else if (i13 == 66 || i13 == 130) {
                    ojitshcjhn(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                agtfadlqog(viewGroup, rect2);
            } else {
                ojitshcjhn(viewGroup, rect2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            ojitshcjhn(viewGroup, rect2);
        } else {
            agtfadlqog(viewGroup, rect2);
        }
        if (i13 == 1 || i13 == 2) {
            return nufgyqmvbu(arrayList, viewGroup, view, i13);
        }
        if (i13 == 17 || i13 == 33 || i13 == 66 || i13 == 130) {
            return lqeggnwhkg(viewGroup, view, rect2, arrayList, i13);
        }
        throw new IllegalArgumentException("Unknown direction: " + i13);
    }

    private final View gtknphoqwx(View view, ArrayList arrayList, int i13) {
        int iLastIndexOf;
        int i14;
        if (i13 < 2) {
            return null;
        }
        return (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i14 = iLastIndexOf + 1) >= i13) ? (View) arrayList.get(0) : (View) arrayList.get(i14);
    }

    private final View lqeggnwhkg(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i13) {
        this.f7071zoijcleaow.set(rect);
        if (i13 == 17) {
            this.f7071zoijcleaow.offset(rect.width() + 1, 0);
        } else if (i13 == 33) {
            this.f7071zoijcleaow.offset(0, rect.height() + 1);
        } else if (i13 == 66) {
            this.f7071zoijcleaow.offset((-rect.width()) - 1, 0);
        } else if (i13 == 130) {
            this.f7071zoijcleaow.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = (View) arrayList.get(i14);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(view3, view) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(view3, viewGroup)) {
                view3.getFocusedRect(this.f7069ppxfxbqfkf);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.f7069ppxfxbqfkf);
                g.lqeggnwhkg lqeggnwhkgVarEablkybsjg = h.yzdjzghtvl.eablkybsjg(this.f7069ppxfxbqfkf);
                g.lqeggnwhkg lqeggnwhkgVarEablkybsjg2 = h.yzdjzghtvl.eablkybsjg(this.f7071zoijcleaow);
                g.lqeggnwhkg lqeggnwhkgVarEablkybsjg3 = h.yzdjzghtvl.eablkybsjg(rect);
                androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.ui.focus.gxszxtbevo.wkgbmnqykc(i13);
                if (androidx.compose.ui.focus.cqumvgiudr.wflxmlrfwp(lqeggnwhkgVarEablkybsjg, lqeggnwhkgVarEablkybsjg2, lqeggnwhkgVarEablkybsjg3, wkgbmnqykcVarWkgbmnqykc != null ? wkgbmnqykcVarWkgbmnqykc.ojitshcjhn() : androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.eablkybsjg())) {
                    this.f7071zoijcleaow.set(this.f7069ppxfxbqfkf);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    private final View nufgyqmvbu(ArrayList arrayList, ViewGroup viewGroup, View view, int i13) {
        try {
            this.f7070wkgbmnqykc.ppxfxbqfkf(arrayList, viewGroup);
            Collections.sort(arrayList, this.f7070wkgbmnqykc);
            this.f7070wkgbmnqykc.zoijcleaow();
            int size = arrayList.size();
            View viewDraadjrbmk = null;
            if (size < 2) {
                return null;
            }
            if (i13 == 1) {
                viewDraadjrbmk = draadjrbmk(view, arrayList, size);
            } else if (i13 == 2) {
                viewDraadjrbmk = gtknphoqwx(view, arrayList, size);
            } else if (i13 == 17 || i13 == 33 || i13 == 66 || i13 == 130) {
                viewDraadjrbmk = lqeggnwhkg(viewGroup, view, this.f7068iobyxmoadg, arrayList, i13);
            }
            return viewDraadjrbmk == null ? (View) arrayList.get(size - 1) : viewDraadjrbmk;
        } catch (Throwable th2) {
            this.f7070wkgbmnqykc.zoijcleaow();
            throw th2;
        }
    }

    private final void ojitshcjhn(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final View ppxfxbqfkf(ViewGroup viewGroup, Rect rect, int i13) {
        ViewGroup viewGroupBtonecajqb = btonecajqb(viewGroup, null);
        ArrayList arrayList = this.f7067eablkybsjg;
        try {
            arrayList.clear();
            igdgnonuha.wkgbmnqykc(viewGroupBtonecajqb, arrayList, i13);
            if (arrayList.isEmpty()) {
                return null;
            }
            return eablkybsjg(viewGroupBtonecajqb, null, rect, i13, arrayList);
        } finally {
            arrayList.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rgvfuqvkyq(skhdrjzrfn skhdrjzrfnVar, View view, View view2) {
        if (skhdrjzrfnVar.wflxmlrfwp(view2.getNextFocusForwardId())) {
            return igdgnonuha.eablkybsjg(view2, view, 2);
        }
        return null;
    }

    private final boolean wflxmlrfwp(int i13) {
        return (i13 == 0 || i13 == -1) ? false : true;
    }

    public final View gxszxtbevo(ViewGroup viewGroup, Rect rect, int i13) {
        this.f7068iobyxmoadg.set(rect);
        return ppxfxbqfkf(viewGroup, this.f7068iobyxmoadg, i13);
    }

    public final View wkgbmnqykc(ViewGroup viewGroup, View view, int i13) {
        ViewGroup viewGroupBtonecajqb = btonecajqb(viewGroup, view);
        View viewDxjokdxxww = dxjokdxxww(viewGroupBtonecajqb, view, i13);
        if (viewDxjokdxxww != null) {
            return viewDxjokdxxww;
        }
        ArrayList arrayList = this.f7067eablkybsjg;
        try {
            arrayList.clear();
            igdgnonuha.wkgbmnqykc(viewGroupBtonecajqb, arrayList, i13);
            if (!arrayList.isEmpty()) {
                viewDxjokdxxww = eablkybsjg(viewGroupBtonecajqb, view, null, i13, arrayList);
            }
            return viewDxjokdxxww;
        } finally {
            arrayList.clear();
        }
    }
}
