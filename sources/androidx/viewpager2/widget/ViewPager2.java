package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.jyumaefscl;
import v1.jhduphickx;
import w1.iwizpuwonk;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    static boolean f13710cllcsxoeiz = true;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private jyumaefscl f13711cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    boolean f13712cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private RecyclerView.btonecajqb f13713esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f13714hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    eablkybsjg f13715hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private androidx.viewpager2.widget.zoijcleaow f13716iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    RecyclerView f13717istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f13718iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f13719jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private androidx.viewpager2.widget.zoijcleaow f13720jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    LinearLayoutManager f13721lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private androidx.viewpager2.widget.ppxfxbqfkf f13722lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f13723pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f13724pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private androidx.viewpager2.widget.wkgbmnqykc f13725wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    androidx.viewpager2.widget.eablkybsjg f13726yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Rect f13727yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private RecyclerView.wflxmlrfwp f13728ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Rect f13729zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Parcelable f13730zynmafqrjb;

    private static class agtfadlqog implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final RecyclerView f13734yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f13735zdlpuopuiu;

        agtfadlqog(int i13, RecyclerView recyclerView) {
            this.f13735zdlpuopuiu = i13;
            this.f13734yggfygwlhe = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13734yggfygwlhe.J(this.f13735zdlpuopuiu);
        }
    }

    class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final iwizpuwonk f13737ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private RecyclerView.btonecajqb f13738wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final iwizpuwonk f13739zoijcleaow;

        class iobyxmoadg implements iwizpuwonk {
            iobyxmoadg() {
            }

            @Override // w1.iwizpuwonk
            public boolean iobyxmoadg(View view, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
                btonecajqb.this.cqumvgiudr(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class ppxfxbqfkf extends lqeggnwhkg {
            ppxfxbqfkf() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.lqeggnwhkg, androidx.recyclerview.widget.RecyclerView.btonecajqb
            public void iobyxmoadg() {
                btonecajqb.this.esjtqupxsv();
            }
        }

        class zoijcleaow implements iwizpuwonk {
            zoijcleaow() {
            }

            @Override // w1.iwizpuwonk
            public boolean iobyxmoadg(View view, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
                btonecajqb.this.cqumvgiudr(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        btonecajqb() {
            super(ViewPager2.this, null);
            this.f13739zoijcleaow = new iobyxmoadg();
            this.f13737ppxfxbqfkf = new zoijcleaow();
        }

        private void iwizpuwonk(zdlpuopuiu zdlpuopuiuVar) {
            int itemCount;
            RecyclerView.nufgyqmvbu adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.eablkybsjg()) {
                return;
            }
            if (ViewPager2.this.f13718iwizpuwonk > 0) {
                zdlpuopuiuVar.iobyxmoadg(8192);
            }
            if (ViewPager2.this.f13718iwizpuwonk < itemCount - 1) {
                zdlpuopuiuVar.iobyxmoadg(4096);
            }
            zdlpuopuiuVar.mhtqkkgtqm(true);
        }

        private void jyumaefscl(View view, zdlpuopuiu zdlpuopuiuVar) {
            zdlpuopuiuVar.sflfametgt(zdlpuopuiu.gxszxtbevo.iobyxmoadg(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f13721lereixgezr.lrnfpwlwnk(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f13721lereixgezr.lrnfpwlwnk(view) : 0, 1, false, false));
        }

        private void yggfygwlhe(zdlpuopuiu zdlpuopuiuVar) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            zdlpuopuiuVar.ydmasvzmpa(zdlpuopuiu.eablkybsjg.iobyxmoadg(itemCount2, itemCount, false, 0));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void agtfadlqog() {
            esjtqupxsv();
        }

        void cqumvgiudr(int i13) {
            if (ViewPager2.this.eablkybsjg()) {
                ViewPager2.this.gtknphoqwx(i13, true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void dxjokdxxww(AccessibilityNodeInfo accessibilityNodeInfo) {
            zdlpuopuiu zdlpuopuiuVarG = zdlpuopuiu.g(accessibilityNodeInfo);
            yggfygwlhe(zdlpuopuiuVarG);
            iwizpuwonk(zdlpuopuiuVarG);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void eablkybsjg(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
            esjtqupxsv();
            if (nufgyqmvbuVar != null) {
                nufgyqmvbuVar.registerAdapterDataObserver(this.f13738wkgbmnqykc);
            }
        }

        void esjtqupxsv() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i13 = R.id.accessibilityActionPageLeft;
            jhduphickx.czzsidtyhn(viewPager2, R.id.accessibilityActionPageLeft);
            jhduphickx.czzsidtyhn(viewPager2, R.id.accessibilityActionPageRight);
            jhduphickx.czzsidtyhn(viewPager2, R.id.accessibilityActionPageUp);
            jhduphickx.czzsidtyhn(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.eablkybsjg()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f13718iwizpuwonk < itemCount - 1) {
                    jhduphickx.yfnezrywwk(viewPager2, new zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionPageDown, null), null, this.f13739zoijcleaow);
                }
                if (ViewPager2.this.f13718iwizpuwonk > 0) {
                    jhduphickx.yfnezrywwk(viewPager2, new zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionPageUp, null), null, this.f13737ppxfxbqfkf);
                    return;
                }
                return;
            }
            boolean zWkgbmnqykc = ViewPager2.this.wkgbmnqykc();
            int i14 = zWkgbmnqykc ? 16908360 : 16908361;
            if (zWkgbmnqykc) {
                i13 = 16908361;
            }
            if (ViewPager2.this.f13718iwizpuwonk < itemCount - 1) {
                jhduphickx.yfnezrywwk(viewPager2, new zdlpuopuiu.iobyxmoadg(i14, null), null, this.f13739zoijcleaow);
            }
            if (ViewPager2.this.f13718iwizpuwonk > 0) {
                jhduphickx.yfnezrywwk(viewPager2, new zdlpuopuiu.iobyxmoadg(i13, null), null, this.f13737ppxfxbqfkf);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        void gtknphoqwx(View view, zdlpuopuiu zdlpuopuiuVar) {
            jyumaefscl(view, zdlpuopuiuVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void gxszxtbevo(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
            if (nufgyqmvbuVar != null) {
                nufgyqmvbuVar.unregisterAdapterDataObserver(this.f13738wkgbmnqykc);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public boolean iobyxmoadg() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void kcexrzcfyt() {
            esjtqupxsv();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public String lqeggnwhkg() {
            if (iobyxmoadg()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void nufgyqmvbu(androidx.viewpager2.widget.zoijcleaow zoijcleaowVar, RecyclerView recyclerView) {
            jhduphickx.uawqvzlxes(recyclerView, 2);
            this.f13738wkgbmnqykc = new ppxfxbqfkf();
            if (jhduphickx.cqumvgiudr(ViewPager2.this) == 0) {
                jhduphickx.uawqvzlxes(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void oxmwwwfdhm() {
            esjtqupxsv();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public boolean ppxfxbqfkf(int i13, Bundle bundle) {
            return i13 == 8192 || i13 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void rgvfuqvkyq(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(lqeggnwhkg());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void vdvldrhtss() {
            esjtqupxsv();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public boolean wflxmlrfwp(int i13, Bundle bundle) {
            if (!ppxfxbqfkf(i13, bundle)) {
                throw new IllegalStateException();
            }
            cqumvgiudr(i13 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void zdlpuopuiu() {
            esjtqupxsv();
        }
    }

    private class draadjrbmk extends jyumaefscl {
        draadjrbmk() {
        }

        @Override // androidx.recyclerview.widget.jyumaefscl, androidx.recyclerview.widget.lereixgezr
        public View findSnapView(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            if (ViewPager2.this.ppxfxbqfkf()) {
                return null;
            }
            return super.findSnapView(rgvfuqvkyqVar);
        }
    }

    public static abstract class dxjokdxxww {
        public void iobyxmoadg(int i13) {
        }

        public void ppxfxbqfkf(int i13) {
        }

        public void zoijcleaow(int i13, float f13, int i14) {
        }
    }

    private abstract class eablkybsjg {
        private eablkybsjg() {
        }

        void agtfadlqog() {
        }

        void btonecajqb(zdlpuopuiu zdlpuopuiuVar) {
        }

        boolean draadjrbmk(int i13) {
            throw new IllegalStateException("Not implemented.");
        }

        void dxjokdxxww(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void eablkybsjg(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
        }

        void gtknphoqwx(View view, zdlpuopuiu zdlpuopuiuVar) {
        }

        void gxszxtbevo(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
        }

        boolean iobyxmoadg() {
            return false;
        }

        void kcexrzcfyt() {
        }

        String lqeggnwhkg() {
            throw new IllegalStateException("Not implemented.");
        }

        void nufgyqmvbu(androidx.viewpager2.widget.zoijcleaow zoijcleaowVar, RecyclerView recyclerView) {
        }

        CharSequence ojitshcjhn() {
            throw new IllegalStateException("Not implemented.");
        }

        void oxmwwwfdhm() {
        }

        boolean ppxfxbqfkf(int i13, Bundle bundle) {
            return false;
        }

        void rgvfuqvkyq(AccessibilityEvent accessibilityEvent) {
        }

        void vdvldrhtss() {
        }

        boolean wflxmlrfwp(int i13, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean wkgbmnqykc() {
            return false;
        }

        void zdlpuopuiu() {
        }

        boolean zoijcleaow(int i13) {
            return false;
        }

        /* synthetic */ eablkybsjg(ViewPager2 viewPager2, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    public interface gtknphoqwx {
    }

    class gxszxtbevo extends eablkybsjg {
        gxszxtbevo() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public void btonecajqb(zdlpuopuiu zdlpuopuiuVar) {
            if (ViewPager2.this.eablkybsjg()) {
                return;
            }
            zdlpuopuiuVar.vipkmwdibw(zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
            zdlpuopuiuVar.vipkmwdibw(zdlpuopuiu.iobyxmoadg.f118545vdvldrhtss);
            zdlpuopuiuVar.mhtqkkgtqm(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public boolean draadjrbmk(int i13) {
            if (zoijcleaow(i13)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public CharSequence ojitshcjhn() {
            if (wkgbmnqykc()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public boolean wkgbmnqykc() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.eablkybsjg
        public boolean zoijcleaow(int i13) {
            return (i13 == 8192 || i13 == 4096) && !ViewPager2.this.eablkybsjg();
        }
    }

    class iobyxmoadg extends lqeggnwhkg {
        iobyxmoadg() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.lqeggnwhkg, androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void iobyxmoadg() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f13712cqumvgiudr = true;
            viewPager2.f13726yadqdtsiqt.btonecajqb();
        }
    }

    private static abstract class lqeggnwhkg extends RecyclerView.btonecajqb {
        private lqeggnwhkg() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public final void eablkybsjg(int i13, int i14) {
            iobyxmoadg();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public abstract void iobyxmoadg();

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public final void ppxfxbqfkf(int i13, int i14) {
            iobyxmoadg();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public final void wkgbmnqykc(int i13, int i14, int i15) {
            iobyxmoadg();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public final void zoijcleaow(int i13, int i14, Object obj) {
            iobyxmoadg();
        }

        /* synthetic */ lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private class nufgyqmvbu extends LinearLayoutManager {
        nufgyqmvbu(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
        public boolean L(RecyclerView recyclerView, View view, Rect rect, boolean z13, boolean z14) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
        public void e(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, zdlpuopuiu zdlpuopuiuVar) {
            super.e(iwizpuwonkVar, zynmafqrjbVar, zdlpuopuiuVar);
            ViewPager2.this.f13715hkdspvbjdz.btonecajqb(zdlpuopuiuVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void f0(RecyclerView.zynmafqrjb zynmafqrjbVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.f0(zynmafqrjbVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
        public void h(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, View view, zdlpuopuiu zdlpuopuiuVar) {
            ViewPager2.this.f13715hkdspvbjdz.gtknphoqwx(view, zdlpuopuiuVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
        public boolean z(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13, Bundle bundle) {
            return ViewPager2.this.f13715hkdspvbjdz.zoijcleaow(i13) ? ViewPager2.this.f13715hkdspvbjdz.draadjrbmk(i13) : super.z(iwizpuwonkVar, zynmafqrjbVar, i13, bundle);
        }
    }

    class ppxfxbqfkf extends dxjokdxxww {
        ppxfxbqfkf() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void ppxfxbqfkf(int i13) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f13717istkbnxepw.requestFocus(2);
            }
        }
    }

    private class wflxmlrfwp extends RecyclerView {
        wflxmlrfwp(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f13715hkdspvbjdz.wkgbmnqykc() ? ViewPager2.this.f13715hkdspvbjdz.ojitshcjhn() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f13718iwizpuwonk);
            accessibilityEvent.setToIndex(ViewPager2.this.f13718iwizpuwonk);
            ViewPager2.this.f13715hkdspvbjdz.rgvfuqvkyq(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.eablkybsjg() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.eablkybsjg() && super.onTouchEvent(motionEvent);
        }
    }

    class wkgbmnqykc implements RecyclerView.oxmwwwfdhm {
        wkgbmnqykc() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.oxmwwwfdhm
        public void wkgbmnqykc(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) vdvldrhtssVar).width != -1 || ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.oxmwwwfdhm
        public void zoijcleaow(View view) {
        }
    }

    class zoijcleaow extends dxjokdxxww {
        zoijcleaow() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void iobyxmoadg(int i13) {
            if (i13 == 0) {
                ViewPager2.this.ojitshcjhn();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void ppxfxbqfkf(int i13) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f13718iwizpuwonk != i13) {
                viewPager2.f13718iwizpuwonk = i13;
                viewPager2.f13715hkdspvbjdz.oxmwwwfdhm();
            }
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13729zdlpuopuiu = new Rect();
        this.f13727yggfygwlhe = new Rect();
        this.f13720jyumaefscl = new androidx.viewpager2.widget.zoijcleaow(3);
        this.f13712cqumvgiudr = false;
        this.f13713esjtqupxsv = new iobyxmoadg();
        this.f13724pmvmpeiblj = -1;
        this.f13728ylkuphrtab = null;
        this.f13723pkzmftpjix = false;
        this.f13714hcddaimhww = true;
        this.f13719jpowsppfya = -1;
        zoijcleaow(context, attributeSet);
    }

    private void draadjrbmk(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c6.iobyxmoadg.ViewPager2);
        jhduphickx.sflfametgt(this, context, c6.iobyxmoadg.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(c6.iobyxmoadg.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void dxjokdxxww() {
        RecyclerView.nufgyqmvbu adapter;
        if (this.f13724pmvmpeiblj == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f13730zynmafqrjb != null) {
            this.f13730zynmafqrjb = null;
        }
        int iMax = Math.max(0, Math.min(this.f13724pmvmpeiblj, adapter.getItemCount() - 1));
        this.f13718iwizpuwonk = iMax;
        this.f13724pmvmpeiblj = -1;
        this.f13717istkbnxepw.A(iMax);
        this.f13715hkdspvbjdz.agtfadlqog();
    }

    private void gxszxtbevo(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.registerAdapterDataObserver(this.f13713esjtqupxsv);
        }
    }

    private RecyclerView.oxmwwwfdhm iobyxmoadg() {
        return new wkgbmnqykc();
    }

    private void wflxmlrfwp(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.unregisterAdapterDataObserver(this.f13713esjtqupxsv);
        }
    }

    private void zoijcleaow(Context context, AttributeSet attributeSet) {
        this.f13715hkdspvbjdz = f13710cllcsxoeiz ? new btonecajqb() : new gxszxtbevo();
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(context);
        this.f13717istkbnxepw = wflxmlrfwpVar;
        wflxmlrfwpVar.setId(jhduphickx.gtknphoqwx());
        this.f13717istkbnxepw.setDescendantFocusability(131072);
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(context);
        this.f13721lereixgezr = nufgyqmvbuVar;
        this.f13717istkbnxepw.setLayoutManager(nufgyqmvbuVar);
        this.f13717istkbnxepw.setScrollingTouchSlop(1);
        draadjrbmk(context, attributeSet);
        this.f13717istkbnxepw.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f13717istkbnxepw.draadjrbmk(iobyxmoadg());
        androidx.viewpager2.widget.eablkybsjg eablkybsjgVar = new androidx.viewpager2.widget.eablkybsjg(this);
        this.f13726yadqdtsiqt = eablkybsjgVar;
        this.f13722lmojexxdyd = new androidx.viewpager2.widget.ppxfxbqfkf(this, eablkybsjgVar, this.f13717istkbnxepw);
        draadjrbmk draadjrbmkVar = new draadjrbmk();
        this.f13711cdpycssgdh = draadjrbmkVar;
        draadjrbmkVar.attachToRecyclerView(this.f13717istkbnxepw);
        this.f13717istkbnxepw.agtfadlqog(this.f13726yadqdtsiqt);
        androidx.viewpager2.widget.zoijcleaow zoijcleaowVar = new androidx.viewpager2.widget.zoijcleaow(3);
        this.f13716iozdgvuglv = zoijcleaowVar;
        this.f13726yadqdtsiqt.wflxmlrfwp(zoijcleaowVar);
        zoijcleaow zoijcleaowVar2 = new zoijcleaow();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        this.f13716iozdgvuglv.wkgbmnqykc(zoijcleaowVar2);
        this.f13716iozdgvuglv.wkgbmnqykc(ppxfxbqfkfVar);
        this.f13715hkdspvbjdz.nufgyqmvbu(this.f13716iozdgvuglv, this.f13717istkbnxepw);
        this.f13716iozdgvuglv.wkgbmnqykc(this.f13720jyumaefscl);
        androidx.viewpager2.widget.wkgbmnqykc wkgbmnqykcVar = new androidx.viewpager2.widget.wkgbmnqykc(this.f13721lereixgezr);
        this.f13725wwaezpbzkn = wkgbmnqykcVar;
        this.f13716iozdgvuglv.wkgbmnqykc(wkgbmnqykcVar);
        RecyclerView recyclerView = this.f13717istkbnxepw;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public void agtfadlqog(dxjokdxxww dxjokdxxwwVar) {
        this.f13720jyumaefscl.eablkybsjg(dxjokdxxwwVar);
    }

    public void btonecajqb(int i13, boolean z13) {
        if (ppxfxbqfkf()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        gtknphoqwx(i13, z13);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i13) {
        return this.f13717istkbnxepw.canScrollHorizontally(i13);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i13) {
        return this.f13717istkbnxepw.canScrollVertically(i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i13 = ((SavedState) parcelable).f13733zdlpuopuiu;
            sparseArray.put(this.f13717istkbnxepw.getId(), (Parcelable) sparseArray.get(i13));
            sparseArray.remove(i13);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        dxjokdxxww();
    }

    public boolean eablkybsjg() {
        return this.f13714hcddaimhww;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f13715hkdspvbjdz.iobyxmoadg() ? this.f13715hkdspvbjdz.lqeggnwhkg() : super.getAccessibilityClassName();
    }

    public RecyclerView.nufgyqmvbu getAdapter() {
        return this.f13717istkbnxepw.getAdapter();
    }

    public int getCurrentItem() {
        return this.f13718iwizpuwonk;
    }

    public int getItemDecorationCount() {
        return this.f13717istkbnxepw.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f13719jpowsppfya;
    }

    public int getOrientation() {
        return this.f13721lereixgezr.G0() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f13717istkbnxepw;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f13726yadqdtsiqt.gxszxtbevo();
    }

    void gtknphoqwx(int i13, boolean z13) {
        RecyclerView.nufgyqmvbu adapter = getAdapter();
        if (adapter == null) {
            if (this.f13724pmvmpeiblj != -1) {
                this.f13724pmvmpeiblj = Math.max(i13, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i13, 0), adapter.getItemCount() - 1);
        if (iMin == this.f13718iwizpuwonk && this.f13726yadqdtsiqt.nufgyqmvbu()) {
            return;
        }
        int i14 = this.f13718iwizpuwonk;
        if (iMin == i14 && z13) {
            return;
        }
        double dEablkybsjg = i14;
        this.f13718iwizpuwonk = iMin;
        this.f13715hkdspvbjdz.oxmwwwfdhm();
        if (!this.f13726yadqdtsiqt.nufgyqmvbu()) {
            dEablkybsjg = this.f13726yadqdtsiqt.eablkybsjg();
        }
        this.f13726yadqdtsiqt.gtknphoqwx(iMin, z13);
        if (!z13) {
            this.f13717istkbnxepw.A(iMin);
            return;
        }
        double d13 = iMin;
        if (Math.abs(d13 - dEablkybsjg) <= 3.0d) {
            this.f13717istkbnxepw.J(iMin);
            return;
        }
        this.f13717istkbnxepw.A(d13 > dEablkybsjg ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f13717istkbnxepw;
        recyclerView.post(new agtfadlqog(iMin, recyclerView));
    }

    public void lqeggnwhkg(dxjokdxxww dxjokdxxwwVar) {
        this.f13720jyumaefscl.wkgbmnqykc(dxjokdxxwwVar);
    }

    public void nufgyqmvbu() {
        this.f13725wwaezpbzkn.wkgbmnqykc();
    }

    void ojitshcjhn() {
        jyumaefscl jyumaefsclVar = this.f13711cdpycssgdh;
        if (jyumaefsclVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = jyumaefsclVar.findSnapView(this.f13721lereixgezr);
        if (viewFindSnapView == null) {
            return;
        }
        int iLrnfpwlwnk = this.f13721lereixgezr.lrnfpwlwnk(viewFindSnapView);
        if (iLrnfpwlwnk != this.f13718iwizpuwonk && getScrollState() == 0) {
            this.f13716iozdgvuglv.ppxfxbqfkf(iLrnfpwlwnk);
        }
        this.f13712cqumvgiudr = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f13715hkdspvbjdz.dxjokdxxww(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int measuredWidth = this.f13717istkbnxepw.getMeasuredWidth();
        int measuredHeight = this.f13717istkbnxepw.getMeasuredHeight();
        this.f13729zdlpuopuiu.left = getPaddingLeft();
        this.f13729zdlpuopuiu.right = (i15 - i13) - getPaddingRight();
        this.f13729zdlpuopuiu.top = getPaddingTop();
        this.f13729zdlpuopuiu.bottom = (i16 - i14) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f13729zdlpuopuiu, this.f13727yggfygwlhe);
        RecyclerView recyclerView = this.f13717istkbnxepw;
        Rect rect = this.f13727yggfygwlhe;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f13712cqumvgiudr) {
            ojitshcjhn();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        measureChild(this.f13717istkbnxepw, i13, i14);
        int measuredWidth = this.f13717istkbnxepw.getMeasuredWidth();
        int measuredHeight = this.f13717istkbnxepw.getMeasuredHeight();
        int measuredState = this.f13717istkbnxepw.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i13, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i14, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f13724pmvmpeiblj = savedState.f13732yggfygwlhe;
        this.f13730zynmafqrjb = savedState.f13731jyumaefscl;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13733zdlpuopuiu = this.f13717istkbnxepw.getId();
        int i13 = this.f13724pmvmpeiblj;
        if (i13 == -1) {
            i13 = this.f13718iwizpuwonk;
        }
        savedState.f13732yggfygwlhe = i13;
        Parcelable parcelable = this.f13730zynmafqrjb;
        if (parcelable != null) {
            savedState.f13731jyumaefscl = parcelable;
        } else {
            this.f13717istkbnxepw.getAdapter();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i13, Bundle bundle) {
        return this.f13715hkdspvbjdz.ppxfxbqfkf(i13, bundle) ? this.f13715hkdspvbjdz.wflxmlrfwp(i13, bundle) : super.performAccessibilityAction(i13, bundle);
    }

    public boolean ppxfxbqfkf() {
        return this.f13722lmojexxdyd.iobyxmoadg();
    }

    public void setAdapter(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
        RecyclerView.nufgyqmvbu adapter = this.f13717istkbnxepw.getAdapter();
        this.f13715hkdspvbjdz.gxszxtbevo(adapter);
        wflxmlrfwp(adapter);
        this.f13717istkbnxepw.setAdapter(nufgyqmvbuVar);
        this.f13718iwizpuwonk = 0;
        dxjokdxxww();
        this.f13715hkdspvbjdz.eablkybsjg(nufgyqmvbuVar);
        gxszxtbevo(nufgyqmvbuVar);
    }

    public void setCurrentItem(int i13) {
        btonecajqb(i13, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i13) {
        super.setLayoutDirection(i13);
        this.f13715hkdspvbjdz.vdvldrhtss();
    }

    public void setOffscreenPageLimit(int i13) {
        if (i13 < 1 && i13 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f13719jpowsppfya = i13;
        this.f13717istkbnxepw.requestLayout();
    }

    public void setOrientation(int i13) {
        this.f13721lereixgezr.V0(i13);
        this.f13715hkdspvbjdz.kcexrzcfyt();
    }

    public void setPageTransformer(gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar != null) {
            if (!this.f13723pkzmftpjix) {
                this.f13728ylkuphrtab = this.f13717istkbnxepw.getItemAnimator();
                this.f13723pkzmftpjix = true;
            }
            this.f13717istkbnxepw.setItemAnimator(null);
        } else if (this.f13723pkzmftpjix) {
            this.f13717istkbnxepw.setItemAnimator(this.f13728ylkuphrtab);
            this.f13728ylkuphrtab = null;
            this.f13723pkzmftpjix = false;
        }
        this.f13725wwaezpbzkn.wkgbmnqykc();
        if (gtknphoqwxVar == null) {
            return;
        }
        this.f13725wwaezpbzkn.eablkybsjg(gtknphoqwxVar);
        nufgyqmvbu();
    }

    public void setUserInputEnabled(boolean z13) {
        this.f13714hcddaimhww = z13;
        this.f13715hkdspvbjdz.zdlpuopuiu();
    }

    boolean wkgbmnqykc() {
        return this.f13721lereixgezr.bfopjjpdmp() == 1;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Parcelable f13731jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f13732yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f13733zdlpuopuiu;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            zoijcleaow(parcel, classLoader);
        }

        private void zoijcleaow(Parcel parcel, ClassLoader classLoader) {
            this.f13733zdlpuopuiu = parcel.readInt();
            this.f13732yggfygwlhe = parcel.readInt();
            this.f13731jyumaefscl = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f13733zdlpuopuiu);
            parcel.writeInt(this.f13732yggfygwlhe);
            parcel.writeParcelable(this.f13731jyumaefscl, i13);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
