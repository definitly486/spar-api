package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.rgvfuqvkyq implements RecyclerView.pmvmpeiblj.zoijcleaow {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    yggfygwlhe f12824cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    yggfygwlhe f12827dsvhmnatus;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    wkgbmnqykc[] f12828hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private int f12829ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private SavedState f12830jhduphickx;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final ojitshcjhn f12834kegysxyocb;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private BitSet f12837ntlheqmsrt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f12839ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private int[] f12840rlfsiqarku;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private int f12842stevsuqkhv;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f12845vipkmwdibw;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f12846wypolnanlu;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f12832jpowsppfya = -1;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    boolean f12843tzroggbefp = false;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    boolean f12835mbcevpiqjq = false;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    int f12844ulzqkzuiru = -1;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    int f12841sopmlzcsov = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    LazySpanLookup f12825crxdokpmqz = new LazySpanLookup();

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private int f12831jlmebxxoox = 2;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private final Rect f12838okpsazkaxt = new Rect();

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private final zoijcleaow f12833jztzpxfvev = new zoijcleaow();

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f12847xrmfcynszj = false;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f12836metgxyhuhe = true;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private final Runnable f12826czzsidtyhn = new iobyxmoadg();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f12854cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int[] f12855esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        boolean f12856istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int[] f12857iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f12858jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        List f12859lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        boolean f12860pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f12861yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f12862zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f12863zynmafqrjb;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void ppxfxbqfkf() {
            this.f12857iwizpuwonk = null;
            this.f12858jyumaefscl = 0;
            this.f12854cqumvgiudr = 0;
            this.f12855esjtqupxsv = null;
            this.f12859lereixgezr = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f12862zdlpuopuiu);
            parcel.writeInt(this.f12861yggfygwlhe);
            parcel.writeInt(this.f12858jyumaefscl);
            if (this.f12858jyumaefscl > 0) {
                parcel.writeIntArray(this.f12857iwizpuwonk);
            }
            parcel.writeInt(this.f12854cqumvgiudr);
            if (this.f12854cqumvgiudr > 0) {
                parcel.writeIntArray(this.f12855esjtqupxsv);
            }
            parcel.writeInt(this.f12860pmvmpeiblj ? 1 : 0);
            parcel.writeInt(this.f12863zynmafqrjb ? 1 : 0);
            parcel.writeInt(this.f12856istkbnxepw ? 1 : 0);
            parcel.writeList(this.f12859lereixgezr);
        }

        void zoijcleaow() {
            this.f12857iwizpuwonk = null;
            this.f12858jyumaefscl = 0;
            this.f12862zdlpuopuiu = -1;
            this.f12861yggfygwlhe = -1;
        }

        SavedState(Parcel parcel) {
            this.f12862zdlpuopuiu = parcel.readInt();
            this.f12861yggfygwlhe = parcel.readInt();
            int i13 = parcel.readInt();
            this.f12858jyumaefscl = i13;
            if (i13 > 0) {
                int[] iArr = new int[i13];
                this.f12857iwizpuwonk = iArr;
                parcel.readIntArray(iArr);
            }
            int i14 = parcel.readInt();
            this.f12854cqumvgiudr = i14;
            if (i14 > 0) {
                int[] iArr2 = new int[i14];
                this.f12855esjtqupxsv = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f12860pmvmpeiblj = parcel.readInt() == 1;
            this.f12863zynmafqrjb = parcel.readInt() == 1;
            this.f12856istkbnxepw = parcel.readInt() == 1;
            this.f12859lereixgezr = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f12858jyumaefscl = savedState.f12858jyumaefscl;
            this.f12862zdlpuopuiu = savedState.f12862zdlpuopuiu;
            this.f12861yggfygwlhe = savedState.f12861yggfygwlhe;
            this.f12857iwizpuwonk = savedState.f12857iwizpuwonk;
            this.f12854cqumvgiudr = savedState.f12854cqumvgiudr;
            this.f12855esjtqupxsv = savedState.f12855esjtqupxsv;
            this.f12860pmvmpeiblj = savedState.f12860pmvmpeiblj;
            this.f12863zynmafqrjb = savedState.f12863zynmafqrjb;
            this.f12856istkbnxepw = savedState.f12856istkbnxepw;
            this.f12859lereixgezr = savedState.f12859lereixgezr;
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.l0();
        }
    }

    public static class ppxfxbqfkf extends RecyclerView.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        wkgbmnqykc f12865cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f12866esjtqupxsv;

        public ppxfxbqfkf(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean lqeggnwhkg() {
            return this.f12866esjtqupxsv;
        }

        public ppxfxbqfkf(int i13, int i14) {
            super(i13, i14);
        }

        public ppxfxbqfkf(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public ppxfxbqfkf(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final int f12867eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        ArrayList f12869iobyxmoadg = new ArrayList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f12872zoijcleaow = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f12870ppxfxbqfkf = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f12871wkgbmnqykc = 0;

        wkgbmnqykc(int i13) {
            this.f12867eablkybsjg = i13;
        }

        int agtfadlqog() {
            int i13 = this.f12870ppxfxbqfkf;
            if (i13 != Integer.MIN_VALUE) {
                return i13;
            }
            ppxfxbqfkf();
            return this.f12870ppxfxbqfkf;
        }

        int btonecajqb(int i13, int i14, boolean z13, boolean z14, boolean z15) {
            int iAgtfadlqog = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.agtfadlqog();
            int iDxjokdxxww = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.dxjokdxxww();
            int i15 = i14 > i13 ? 1 : -1;
            while (i13 != i14) {
                View view = (View) this.f12869iobyxmoadg.get(i13);
                int iLqeggnwhkg = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.lqeggnwhkg(view);
                int iWkgbmnqykc = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.wkgbmnqykc(view);
                boolean z16 = false;
                boolean z17 = !z15 ? iLqeggnwhkg >= iDxjokdxxww : iLqeggnwhkg > iDxjokdxxww;
                if (!z15 ? iWkgbmnqykc > iAgtfadlqog : iWkgbmnqykc >= iAgtfadlqog) {
                    z16 = true;
                }
                if (z17 && z16) {
                    if (z13 && z14) {
                        if (iLqeggnwhkg >= iAgtfadlqog && iWkgbmnqykc <= iDxjokdxxww) {
                            return StaggeredGridLayoutManager.this.lrnfpwlwnk(view);
                        }
                    } else {
                        if (z14) {
                            return StaggeredGridLayoutManager.this.lrnfpwlwnk(view);
                        }
                        if (iLqeggnwhkg < iAgtfadlqog || iWkgbmnqykc > iDxjokdxxww) {
                            return StaggeredGridLayoutManager.this.lrnfpwlwnk(view);
                        }
                    }
                }
                i13 += i15;
            }
            return -1;
        }

        void cqumvgiudr(View view) {
            ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = vdvldrhtss(view);
            ppxfxbqfkfVarVdvldrhtss.f12865cqumvgiudr = this;
            this.f12869iobyxmoadg.add(0, view);
            this.f12872zoijcleaow = Integer.MIN_VALUE;
            if (this.f12869iobyxmoadg.size() == 1) {
                this.f12870ppxfxbqfkf = Integer.MIN_VALUE;
            }
            if (ppxfxbqfkfVarVdvldrhtss.eablkybsjg() || ppxfxbqfkfVarVdvldrhtss.ppxfxbqfkf()) {
                this.f12871wkgbmnqykc += StaggeredGridLayoutManager.this.f12824cllcsxoeiz.eablkybsjg(view);
            }
        }

        int draadjrbmk(int i13, int i14, boolean z13) {
            return btonecajqb(i13, i14, z13, true, false);
        }

        public int dxjokdxxww() {
            return StaggeredGridLayoutManager.this.f12843tzroggbefp ? draadjrbmk(0, this.f12869iobyxmoadg.size(), false) : draadjrbmk(this.f12869iobyxmoadg.size() - 1, -1, false);
        }

        void eablkybsjg() {
            this.f12869iobyxmoadg.clear();
            zdlpuopuiu();
            this.f12871wkgbmnqykc = 0;
        }

        void esjtqupxsv(int i13) {
            this.f12872zoijcleaow = i13;
            this.f12870ppxfxbqfkf = i13;
        }

        int gtknphoqwx(int i13, int i14, boolean z13) {
            return btonecajqb(i13, i14, false, false, z13);
        }

        public int gxszxtbevo() {
            return StaggeredGridLayoutManager.this.f12843tzroggbefp ? gtknphoqwx(this.f12869iobyxmoadg.size() - 1, -1, true) : gtknphoqwx(0, this.f12869iobyxmoadg.size(), true);
        }

        void iobyxmoadg(View view) {
            ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = vdvldrhtss(view);
            ppxfxbqfkfVarVdvldrhtss.f12865cqumvgiudr = this;
            this.f12869iobyxmoadg.add(view);
            this.f12870ppxfxbqfkf = Integer.MIN_VALUE;
            if (this.f12869iobyxmoadg.size() == 1) {
                this.f12872zoijcleaow = Integer.MIN_VALUE;
            }
            if (ppxfxbqfkfVarVdvldrhtss.eablkybsjg() || ppxfxbqfkfVarVdvldrhtss.ppxfxbqfkf()) {
                this.f12871wkgbmnqykc += StaggeredGridLayoutManager.this.f12824cllcsxoeiz.eablkybsjg(view);
            }
        }

        void iwizpuwonk() {
            View view = (View) this.f12869iobyxmoadg.remove(0);
            ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = vdvldrhtss(view);
            ppxfxbqfkfVarVdvldrhtss.f12865cqumvgiudr = null;
            if (this.f12869iobyxmoadg.size() == 0) {
                this.f12870ppxfxbqfkf = Integer.MIN_VALUE;
            }
            if (ppxfxbqfkfVarVdvldrhtss.eablkybsjg() || ppxfxbqfkfVarVdvldrhtss.ppxfxbqfkf()) {
                this.f12871wkgbmnqykc -= StaggeredGridLayoutManager.this.f12824cllcsxoeiz.eablkybsjg(view);
            }
            this.f12872zoijcleaow = Integer.MIN_VALUE;
        }

        void jyumaefscl() {
            int size = this.f12869iobyxmoadg.size();
            View view = (View) this.f12869iobyxmoadg.remove(size - 1);
            ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = vdvldrhtss(view);
            ppxfxbqfkfVarVdvldrhtss.f12865cqumvgiudr = null;
            if (ppxfxbqfkfVarVdvldrhtss.eablkybsjg() || ppxfxbqfkfVarVdvldrhtss.ppxfxbqfkf()) {
                this.f12871wkgbmnqykc -= StaggeredGridLayoutManager.this.f12824cllcsxoeiz.eablkybsjg(view);
            }
            if (size == 1) {
                this.f12872zoijcleaow = Integer.MIN_VALUE;
            }
            this.f12870ppxfxbqfkf = Integer.MIN_VALUE;
        }

        int kcexrzcfyt(int i13) {
            int i14 = this.f12872zoijcleaow;
            if (i14 != Integer.MIN_VALUE) {
                return i14;
            }
            if (this.f12869iobyxmoadg.size() == 0) {
                return i13;
            }
            wkgbmnqykc();
            return this.f12872zoijcleaow;
        }

        public int lqeggnwhkg() {
            return StaggeredGridLayoutManager.this.f12843tzroggbefp ? draadjrbmk(this.f12869iobyxmoadg.size() - 1, -1, false) : draadjrbmk(0, this.f12869iobyxmoadg.size(), false);
        }

        public int nufgyqmvbu() {
            return StaggeredGridLayoutManager.this.f12843tzroggbefp ? gtknphoqwx(0, this.f12869iobyxmoadg.size(), true) : gtknphoqwx(this.f12869iobyxmoadg.size() - 1, -1, true);
        }

        int ojitshcjhn(int i13) {
            int i14 = this.f12870ppxfxbqfkf;
            if (i14 != Integer.MIN_VALUE) {
                return i14;
            }
            if (this.f12869iobyxmoadg.size() == 0) {
                return i13;
            }
            ppxfxbqfkf();
            return this.f12870ppxfxbqfkf;
        }

        int oxmwwwfdhm() {
            int i13 = this.f12872zoijcleaow;
            if (i13 != Integer.MIN_VALUE) {
                return i13;
            }
            wkgbmnqykc();
            return this.f12872zoijcleaow;
        }

        void ppxfxbqfkf() {
            LazySpanLookup.FullSpanItem fullSpanItemGxszxtbevo;
            ArrayList arrayList = this.f12869iobyxmoadg;
            View view = (View) arrayList.get(arrayList.size() - 1);
            ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = vdvldrhtss(view);
            this.f12870ppxfxbqfkf = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.wkgbmnqykc(view);
            if (ppxfxbqfkfVarVdvldrhtss.f12866esjtqupxsv && (fullSpanItemGxszxtbevo = StaggeredGridLayoutManager.this.f12825crxdokpmqz.gxszxtbevo(ppxfxbqfkfVarVdvldrhtss.zoijcleaow())) != null && fullSpanItemGxszxtbevo.f12852yggfygwlhe == 1) {
                this.f12870ppxfxbqfkf += fullSpanItemGxszxtbevo.zoijcleaow(this.f12867eablkybsjg);
            }
        }

        public View rgvfuqvkyq(int i13, int i14) {
            View view = null;
            if (i14 != -1) {
                int size = this.f12869iobyxmoadg.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f12869iobyxmoadg.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f12843tzroggbefp && staggeredGridLayoutManager.lrnfpwlwnk(view2) >= i13) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f12843tzroggbefp && staggeredGridLayoutManager2.lrnfpwlwnk(view2) <= i13) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f12869iobyxmoadg.size();
                int i15 = 0;
                while (i15 < size2) {
                    View view3 = (View) this.f12869iobyxmoadg.get(i15);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f12843tzroggbefp && staggeredGridLayoutManager3.lrnfpwlwnk(view3) <= i13) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f12843tzroggbefp && staggeredGridLayoutManager4.lrnfpwlwnk(view3) >= i13) || !view3.hasFocusable()) {
                        break;
                    }
                    i15++;
                    view = view3;
                }
            }
            return view;
        }

        ppxfxbqfkf vdvldrhtss(View view) {
            return (ppxfxbqfkf) view.getLayoutParams();
        }

        public int wflxmlrfwp() {
            return this.f12871wkgbmnqykc;
        }

        void wkgbmnqykc() {
            LazySpanLookup.FullSpanItem fullSpanItemGxszxtbevo;
            View view = (View) this.f12869iobyxmoadg.get(0);
            ppxfxbqfkf ppxfxbqfkfVarVdvldrhtss = vdvldrhtss(view);
            this.f12872zoijcleaow = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.lqeggnwhkg(view);
            if (ppxfxbqfkfVarVdvldrhtss.f12866esjtqupxsv && (fullSpanItemGxszxtbevo = StaggeredGridLayoutManager.this.f12825crxdokpmqz.gxszxtbevo(ppxfxbqfkfVarVdvldrhtss.zoijcleaow())) != null && fullSpanItemGxszxtbevo.f12852yggfygwlhe == -1) {
                this.f12872zoijcleaow -= fullSpanItemGxszxtbevo.zoijcleaow(this.f12867eablkybsjg);
            }
        }

        void yggfygwlhe(int i13) {
            int i14 = this.f12872zoijcleaow;
            if (i14 != Integer.MIN_VALUE) {
                this.f12872zoijcleaow = i14 + i13;
            }
            int i15 = this.f12870ppxfxbqfkf;
            if (i15 != Integer.MIN_VALUE) {
                this.f12870ppxfxbqfkf = i15 + i13;
            }
        }

        void zdlpuopuiu() {
            this.f12872zoijcleaow = Integer.MIN_VALUE;
            this.f12870ppxfxbqfkf = Integer.MIN_VALUE;
        }

        void zoijcleaow(boolean z13, int i13) {
            int iOjitshcjhn = z13 ? ojitshcjhn(Integer.MIN_VALUE) : kcexrzcfyt(Integer.MIN_VALUE);
            eablkybsjg();
            if (iOjitshcjhn == Integer.MIN_VALUE) {
                return;
            }
            if (!z13 || iOjitshcjhn >= StaggeredGridLayoutManager.this.f12824cllcsxoeiz.dxjokdxxww()) {
                if (z13 || iOjitshcjhn <= StaggeredGridLayoutManager.this.f12824cllcsxoeiz.agtfadlqog()) {
                    if (i13 != Integer.MIN_VALUE) {
                        iOjitshcjhn += i13;
                    }
                    this.f12870ppxfxbqfkf = iOjitshcjhn;
                    this.f12872zoijcleaow = iOjitshcjhn;
                }
            }
        }
    }

    class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        boolean f12873eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int[] f12874gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f12875iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f12877ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f12878wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f12879zoijcleaow;

        zoijcleaow() {
            ppxfxbqfkf();
        }

        void iobyxmoadg() {
            this.f12879zoijcleaow = this.f12877ppxfxbqfkf ? StaggeredGridLayoutManager.this.f12824cllcsxoeiz.dxjokdxxww() : StaggeredGridLayoutManager.this.f12824cllcsxoeiz.agtfadlqog();
        }

        void ppxfxbqfkf() {
            this.f12875iobyxmoadg = -1;
            this.f12879zoijcleaow = Integer.MIN_VALUE;
            this.f12877ppxfxbqfkf = false;
            this.f12878wkgbmnqykc = false;
            this.f12873eablkybsjg = false;
            int[] iArr = this.f12874gxszxtbevo;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void wkgbmnqykc(wkgbmnqykc[] wkgbmnqykcVarArr) {
            int length = wkgbmnqykcVarArr.length;
            int[] iArr = this.f12874gxszxtbevo;
            if (iArr == null || iArr.length < length) {
                this.f12874gxszxtbevo = new int[StaggeredGridLayoutManager.this.f12828hkdspvbjdz.length];
            }
            for (int i13 = 0; i13 < length; i13++) {
                this.f12874gxszxtbevo[i13] = wkgbmnqykcVarArr[i13].kcexrzcfyt(Integer.MIN_VALUE);
            }
        }

        void zoijcleaow(int i13) {
            if (this.f12877ppxfxbqfkf) {
                this.f12879zoijcleaow = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.dxjokdxxww() - i13;
            } else {
                this.f12879zoijcleaow = StaggeredGridLayoutManager.this.f12824cllcsxoeiz.agtfadlqog() + i13;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        RecyclerView.rgvfuqvkyq.wkgbmnqykc wkgbmnqykcVarZeieaojujs = RecyclerView.rgvfuqvkyq.zeieaojujs(context, attributeSet, i13, i14);
        c1(wkgbmnqykcVarZeieaojujs.f12779iobyxmoadg);
        e1(wkgbmnqykcVarZeieaojujs.f12782zoijcleaow);
        d1(wkgbmnqykcVarZeieaojujs.f12780ppxfxbqfkf);
        this.f12834kegysxyocb = new ojitshcjhn();
        t0();
    }

    private int A0(int i13) {
        for (int iVipkmwdibw = vipkmwdibw() - 1; iVipkmwdibw >= 0; iVipkmwdibw--) {
            int iLrnfpwlwnk = lrnfpwlwnk(ribwqtqdhb(iVipkmwdibw));
            if (iLrnfpwlwnk >= 0 && iLrnfpwlwnk < i13) {
                return iLrnfpwlwnk;
            }
        }
        return 0;
    }

    private void C0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int iDxjokdxxww;
        int iG0 = G0(Integer.MIN_VALUE);
        if (iG0 != Integer.MIN_VALUE && (iDxjokdxxww = this.f12824cllcsxoeiz.dxjokdxxww() - iG0) > 0) {
            int i13 = iDxjokdxxww - (-a1(-iDxjokdxxww, iwizpuwonkVar, zynmafqrjbVar));
            if (!z13 || i13 <= 0) {
                return;
            }
            this.f12824cllcsxoeiz.kcexrzcfyt(i13);
        }
    }

    private void D0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int iAgtfadlqog;
        int iJ0 = J0(Integer.MAX_VALUE);
        if (iJ0 != Integer.MAX_VALUE && (iAgtfadlqog = iJ0 - this.f12824cllcsxoeiz.agtfadlqog()) > 0) {
            int iA1 = iAgtfadlqog - a1(iAgtfadlqog, iwizpuwonkVar, zynmafqrjbVar);
            if (!z13 || iA1 <= 0) {
                return;
            }
            this.f12824cllcsxoeiz.kcexrzcfyt(-iA1);
        }
    }

    private int G0(int i13) {
        int iOjitshcjhn = this.f12828hkdspvbjdz[0].ojitshcjhn(i13);
        for (int i14 = 1; i14 < this.f12832jpowsppfya; i14++) {
            int iOjitshcjhn2 = this.f12828hkdspvbjdz[i14].ojitshcjhn(i13);
            if (iOjitshcjhn2 > iOjitshcjhn) {
                iOjitshcjhn = iOjitshcjhn2;
            }
        }
        return iOjitshcjhn;
    }

    private int H0(int i13) {
        int iKcexrzcfyt = this.f12828hkdspvbjdz[0].kcexrzcfyt(i13);
        for (int i14 = 1; i14 < this.f12832jpowsppfya; i14++) {
            int iKcexrzcfyt2 = this.f12828hkdspvbjdz[i14].kcexrzcfyt(i13);
            if (iKcexrzcfyt2 > iKcexrzcfyt) {
                iKcexrzcfyt = iKcexrzcfyt2;
            }
        }
        return iKcexrzcfyt;
    }

    private int I0(int i13) {
        int iOjitshcjhn = this.f12828hkdspvbjdz[0].ojitshcjhn(i13);
        for (int i14 = 1; i14 < this.f12832jpowsppfya; i14++) {
            int iOjitshcjhn2 = this.f12828hkdspvbjdz[i14].ojitshcjhn(i13);
            if (iOjitshcjhn2 < iOjitshcjhn) {
                iOjitshcjhn = iOjitshcjhn2;
            }
        }
        return iOjitshcjhn;
    }

    private int J0(int i13) {
        int iKcexrzcfyt = this.f12828hkdspvbjdz[0].kcexrzcfyt(i13);
        for (int i14 = 1; i14 < this.f12832jpowsppfya; i14++) {
            int iKcexrzcfyt2 = this.f12828hkdspvbjdz[i14].kcexrzcfyt(i13);
            if (iKcexrzcfyt2 < iKcexrzcfyt) {
                iKcexrzcfyt = iKcexrzcfyt2;
            }
        }
        return iKcexrzcfyt;
    }

    private wkgbmnqykc K0(ojitshcjhn ojitshcjhnVar) {
        int i13;
        int i14;
        int i15;
        if (S0(ojitshcjhnVar.f13108eablkybsjg)) {
            i14 = this.f12832jpowsppfya - 1;
            i13 = -1;
            i15 = -1;
        } else {
            i13 = this.f12832jpowsppfya;
            i14 = 0;
            i15 = 1;
        }
        wkgbmnqykc wkgbmnqykcVar = null;
        if (ojitshcjhnVar.f13108eablkybsjg == 1) {
            int iAgtfadlqog = this.f12824cllcsxoeiz.agtfadlqog();
            int i16 = Integer.MAX_VALUE;
            while (i14 != i13) {
                wkgbmnqykc wkgbmnqykcVar2 = this.f12828hkdspvbjdz[i14];
                int iOjitshcjhn = wkgbmnqykcVar2.ojitshcjhn(iAgtfadlqog);
                if (iOjitshcjhn < i16) {
                    wkgbmnqykcVar = wkgbmnqykcVar2;
                    i16 = iOjitshcjhn;
                }
                i14 += i15;
            }
            return wkgbmnqykcVar;
        }
        int iDxjokdxxww = this.f12824cllcsxoeiz.dxjokdxxww();
        int i17 = Integer.MIN_VALUE;
        while (i14 != i13) {
            wkgbmnqykc wkgbmnqykcVar3 = this.f12828hkdspvbjdz[i14];
            int iKcexrzcfyt = wkgbmnqykcVar3.kcexrzcfyt(iDxjokdxxww);
            if (iKcexrzcfyt > i17) {
                wkgbmnqykcVar = wkgbmnqykcVar3;
                i17 = iKcexrzcfyt;
            }
            i14 += i15;
        }
        return wkgbmnqykcVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    private void L0(int i13, int i14, int i15) {
        int i16;
        int i17;
        int iF0;
        int iF1 = this.f12835mbcevpiqjq ? F0() : E0();
        if (i15 == 8) {
            if (i13 < i14) {
                i16 = i14 + 1;
            } else {
                i16 = i13 + 1;
                i17 = i14;
            }
            this.f12825crxdokpmqz.nufgyqmvbu(i17);
            if (i15 != 1) {
                this.f12825crxdokpmqz.btonecajqb(i13, i14);
            } else if (i15 != 2) {
                this.f12825crxdokpmqz.gtknphoqwx(i13, i14);
            } else if (i15 == 8) {
                this.f12825crxdokpmqz.gtknphoqwx(i13, 1);
                this.f12825crxdokpmqz.btonecajqb(i14, 1);
            }
            if (i16 <= iF1) {
                return;
            }
            if (this.f12835mbcevpiqjq) {
                iF0 = E0();
            } else {
                iF0 = F0();
            }
            if (i17 <= iF0) {
                M();
            }
        }
        i16 = i13 + i14;
        i17 = i13;
        this.f12825crxdokpmqz.nufgyqmvbu(i17);
        if (i15 != 1) {
            this.f12825crxdokpmqz.btonecajqb(i13, i14);
        } else if (i15 != 2) {
            this.f12825crxdokpmqz.gtknphoqwx(i13, i14);
        } else if (i15 == 8) {
            this.f12825crxdokpmqz.gtknphoqwx(i13, 1);
            this.f12825crxdokpmqz.btonecajqb(i14, 1);
        }
        if (i16 <= iF1) {
            return;
        }
        if (this.f12835mbcevpiqjq) {
            iF0 = E0();
        } else {
            iF0 = F0();
        }
        if (i17 <= iF0) {
            M();
        }
    }

    private void P0(View view, int i13, int i14, boolean z13) {
        lereixgezr(view, this.f12838okpsazkaxt);
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).leftMargin;
        Rect rect = this.f12838okpsazkaxt;
        int iM1 = m1(i13, i15 + rect.left, ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).rightMargin + rect.right);
        int i16 = ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).topMargin;
        Rect rect2 = this.f12838okpsazkaxt;
        int iM2 = m1(i14, i16 + rect2.top, ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).bottomMargin + rect2.bottom);
        if (z13 ? a0(view, iM1, iM2, ppxfxbqfkfVar) : Y(view, iM1, iM2, ppxfxbqfkfVar)) {
            view.measure(iM1, iM2);
        }
    }

    private void Q0(View view, ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        if (ppxfxbqfkfVar.f12866esjtqupxsv) {
            if (this.f12846wypolnanlu == 1) {
                P0(view, this.f12829ikoacuggdj, RecyclerView.rgvfuqvkyq.jhduphickx(zfvoamnweg(), oipsdeybqn(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).height, true), z13);
                return;
            } else {
                P0(view, RecyclerView.rgvfuqvkyq.jhduphickx(iwxlajgraz(), dvvnrvtcbc(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).width, true), this.f12829ikoacuggdj, z13);
                return;
            }
        }
        if (this.f12846wypolnanlu == 1) {
            P0(view, RecyclerView.rgvfuqvkyq.jhduphickx(this.f12842stevsuqkhv, dvvnrvtcbc(), 0, ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).width, false), RecyclerView.rgvfuqvkyq.jhduphickx(zfvoamnweg(), oipsdeybqn(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).height, true), z13);
        } else {
            P0(view, RecyclerView.rgvfuqvkyq.jhduphickx(iwxlajgraz(), dvvnrvtcbc(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).width, true), RecyclerView.rgvfuqvkyq.jhduphickx(this.f12842stevsuqkhv, oipsdeybqn(), 0, ((ViewGroup.MarginLayoutParams) ppxfxbqfkfVar).height, false), z13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    private void R0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        boolean z14;
        SavedState savedState;
        zoijcleaow zoijcleaowVar = this.f12833jztzpxfvev;
        if (!(this.f12830jhduphickx == null && this.f12844ulzqkzuiru == -1) && zynmafqrjbVar.zoijcleaow() == 0) {
            D(iwizpuwonkVar);
            zoijcleaowVar.ppxfxbqfkf();
            return;
        }
        boolean z15 = (zoijcleaowVar.f12873eablkybsjg && this.f12844ulzqkzuiru == -1 && this.f12830jhduphickx == null) ? false : true;
        if (z15) {
            zoijcleaowVar.ppxfxbqfkf();
            if (this.f12830jhduphickx != null) {
                g0(zoijcleaowVar);
            } else {
                Z0();
                zoijcleaowVar.f12877ppxfxbqfkf = this.f12835mbcevpiqjq;
            }
            i1(zynmafqrjbVar, zoijcleaowVar);
            zoijcleaowVar.f12873eablkybsjg = true;
        }
        if (this.f12830jhduphickx == null && this.f12844ulzqkzuiru == -1 && (zoijcleaowVar.f12877ppxfxbqfkf != this.f12839ribwqtqdhb || O0() != this.f12845vipkmwdibw)) {
            this.f12825crxdokpmqz.zoijcleaow();
            zoijcleaowVar.f12878wkgbmnqykc = true;
        }
        if (vipkmwdibw() > 0 && ((savedState = this.f12830jhduphickx) == null || savedState.f12858jyumaefscl < 1)) {
            if (zoijcleaowVar.f12878wkgbmnqykc) {
                for (int i13 = 0; i13 < this.f12832jpowsppfya; i13++) {
                    this.f12828hkdspvbjdz[i13].eablkybsjg();
                    int i14 = zoijcleaowVar.f12879zoijcleaow;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f12828hkdspvbjdz[i13].esjtqupxsv(i14);
                    }
                }
            } else if (z15 || this.f12833jztzpxfvev.f12874gxszxtbevo == null) {
                for (int i15 = 0; i15 < this.f12832jpowsppfya; i15++) {
                    this.f12828hkdspvbjdz[i15].zoijcleaow(this.f12835mbcevpiqjq, zoijcleaowVar.f12879zoijcleaow);
                }
                this.f12833jztzpxfvev.wkgbmnqykc(this.f12828hkdspvbjdz);
            } else {
                for (int i16 = 0; i16 < this.f12832jpowsppfya; i16++) {
                    wkgbmnqykc wkgbmnqykcVar = this.f12828hkdspvbjdz[i16];
                    wkgbmnqykcVar.eablkybsjg();
                    wkgbmnqykcVar.esjtqupxsv(this.f12833jztzpxfvev.f12874gxszxtbevo[i16]);
                }
            }
        }
        hkdspvbjdz(iwizpuwonkVar);
        this.f12834kegysxyocb.f13110iobyxmoadg = false;
        this.f12847xrmfcynszj = false;
        k1(this.f12827dsvhmnatus.ojitshcjhn());
        j1(zoijcleaowVar.f12875iobyxmoadg, zynmafqrjbVar);
        if (zoijcleaowVar.f12877ppxfxbqfkf) {
            b1(-1);
            u0(iwizpuwonkVar, this.f12834kegysxyocb, zynmafqrjbVar);
            b1(1);
            ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
            ojitshcjhnVar.f13113ppxfxbqfkf = zoijcleaowVar.f12875iobyxmoadg + ojitshcjhnVar.f13114wkgbmnqykc;
            u0(iwizpuwonkVar, ojitshcjhnVar, zynmafqrjbVar);
        } else {
            b1(1);
            u0(iwizpuwonkVar, this.f12834kegysxyocb, zynmafqrjbVar);
            b1(-1);
            ojitshcjhn ojitshcjhnVar2 = this.f12834kegysxyocb;
            ojitshcjhnVar2.f13113ppxfxbqfkf = zoijcleaowVar.f12875iobyxmoadg + ojitshcjhnVar2.f13114wkgbmnqykc;
            u0(iwizpuwonkVar, ojitshcjhnVar2, zynmafqrjbVar);
        }
        Y0();
        if (vipkmwdibw() > 0) {
            if (this.f12835mbcevpiqjq) {
                C0(iwizpuwonkVar, zynmafqrjbVar, true);
                D0(iwizpuwonkVar, zynmafqrjbVar, false);
            } else {
                D0(iwizpuwonkVar, zynmafqrjbVar, true);
                C0(iwizpuwonkVar, zynmafqrjbVar, false);
            }
        }
        if (z13 && !zynmafqrjbVar.eablkybsjg() && this.f12831jlmebxxoox != 0 && vipkmwdibw() > 0 && (this.f12847xrmfcynszj || M0() != null)) {
            H(this.f12826czzsidtyhn);
            z14 = l0();
        }
        if (zynmafqrjbVar.eablkybsjg()) {
            this.f12833jztzpxfvev.ppxfxbqfkf();
        }
        this.f12839ribwqtqdhb = zoijcleaowVar.f12877ppxfxbqfkf;
        this.f12845vipkmwdibw = O0();
        if (z14) {
            this.f12833jztzpxfvev.ppxfxbqfkf();
            R0(iwizpuwonkVar, zynmafqrjbVar, false);
        }
    }

    private boolean S0(int i13) {
        if (this.f12846wypolnanlu == 0) {
            return (i13 == -1) != this.f12835mbcevpiqjq;
        }
        return ((i13 == -1) == this.f12835mbcevpiqjq) == O0();
    }

    private void U0(View view) {
        for (int i13 = this.f12832jpowsppfya - 1; i13 >= 0; i13--) {
            this.f12828hkdspvbjdz[i13].cqumvgiudr(view);
        }
    }

    private void V0(RecyclerView.iwizpuwonk iwizpuwonkVar, ojitshcjhn ojitshcjhnVar) {
        int iMin;
        if (!ojitshcjhnVar.f13110iobyxmoadg || ojitshcjhnVar.f13107dxjokdxxww) {
            return;
        }
        if (ojitshcjhnVar.f13115zoijcleaow == 0) {
            if (ojitshcjhnVar.f13108eablkybsjg == -1) {
                W0(iwizpuwonkVar, ojitshcjhnVar.f13111lqeggnwhkg);
                return;
            } else {
                X0(iwizpuwonkVar, ojitshcjhnVar.f13109gxszxtbevo);
                return;
            }
        }
        if (ojitshcjhnVar.f13108eablkybsjg == -1) {
            int i13 = ojitshcjhnVar.f13109gxszxtbevo;
            int iH0 = i13 - H0(i13);
            W0(iwizpuwonkVar, iH0 < 0 ? ojitshcjhnVar.f13111lqeggnwhkg : ojitshcjhnVar.f13111lqeggnwhkg - Math.min(iH0, ojitshcjhnVar.f13115zoijcleaow));
        } else {
            int iI0 = I0(ojitshcjhnVar.f13111lqeggnwhkg) - ojitshcjhnVar.f13111lqeggnwhkg;
            if (iI0 < 0) {
                iMin = ojitshcjhnVar.f13109gxszxtbevo;
            } else {
                iMin = Math.min(iI0, ojitshcjhnVar.f13115zoijcleaow) + ojitshcjhnVar.f13109gxszxtbevo;
            }
            X0(iwizpuwonkVar, iMin);
        }
    }

    private void W0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13) {
        for (int iVipkmwdibw = vipkmwdibw() - 1; iVipkmwdibw >= 0; iVipkmwdibw--) {
            View viewRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            if (this.f12824cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb) < i13 || this.f12824cllcsxoeiz.oxmwwwfdhm(viewRibwqtqdhb) < i13) {
                return;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) viewRibwqtqdhb.getLayoutParams();
            if (ppxfxbqfkfVar.f12866esjtqupxsv) {
                for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
                    if (this.f12828hkdspvbjdz[i14].f12869iobyxmoadg.size() == 1) {
                        return;
                    }
                }
                for (int i15 = 0; i15 < this.f12832jpowsppfya; i15++) {
                    this.f12828hkdspvbjdz[i15].jyumaefscl();
                }
            } else if (ppxfxbqfkfVar.f12865cqumvgiudr.f12869iobyxmoadg.size() == 1) {
                return;
            } else {
                ppxfxbqfkfVar.f12865cqumvgiudr.jyumaefscl();
            }
            F(viewRibwqtqdhb, iwizpuwonkVar);
        }
    }

    private void X0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13) {
        while (vipkmwdibw() > 0) {
            View viewRibwqtqdhb = ribwqtqdhb(0);
            if (this.f12824cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb) > i13 || this.f12824cllcsxoeiz.vdvldrhtss(viewRibwqtqdhb) > i13) {
                return;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) viewRibwqtqdhb.getLayoutParams();
            if (ppxfxbqfkfVar.f12866esjtqupxsv) {
                for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
                    if (this.f12828hkdspvbjdz[i14].f12869iobyxmoadg.size() == 1) {
                        return;
                    }
                }
                for (int i15 = 0; i15 < this.f12832jpowsppfya; i15++) {
                    this.f12828hkdspvbjdz[i15].iwizpuwonk();
                }
            } else if (ppxfxbqfkfVar.f12865cqumvgiudr.f12869iobyxmoadg.size() == 1) {
                return;
            } else {
                ppxfxbqfkfVar.f12865cqumvgiudr.iwizpuwonk();
            }
            F(viewRibwqtqdhb, iwizpuwonkVar);
        }
    }

    private void Y0() {
        if (this.f12827dsvhmnatus.draadjrbmk() == 1073741824) {
            return;
        }
        int iVipkmwdibw = vipkmwdibw();
        float fMax = 0.0f;
        for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            float fEablkybsjg = this.f12827dsvhmnatus.eablkybsjg(viewRibwqtqdhb);
            if (fEablkybsjg >= fMax) {
                if (((ppxfxbqfkf) viewRibwqtqdhb.getLayoutParams()).lqeggnwhkg()) {
                    fEablkybsjg = (fEablkybsjg * 1.0f) / this.f12832jpowsppfya;
                }
                fMax = Math.max(fMax, fEablkybsjg);
            }
        }
        int i14 = this.f12842stevsuqkhv;
        int iRound = Math.round(fMax * this.f12832jpowsppfya);
        if (this.f12827dsvhmnatus.draadjrbmk() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f12827dsvhmnatus.ojitshcjhn());
        }
        k1(iRound);
        if (this.f12842stevsuqkhv == i14) {
            return;
        }
        for (int i15 = 0; i15 < iVipkmwdibw; i15++) {
            View viewRibwqtqdhb2 = ribwqtqdhb(i15);
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) viewRibwqtqdhb2.getLayoutParams();
            if (!ppxfxbqfkfVar.f12866esjtqupxsv) {
                if (O0() && this.f12846wypolnanlu == 1) {
                    int i16 = this.f12832jpowsppfya;
                    int i17 = ppxfxbqfkfVar.f12865cqumvgiudr.f12867eablkybsjg;
                    viewRibwqtqdhb2.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f12842stevsuqkhv) - ((-((i16 - 1) - i17)) * i14));
                } else {
                    int i18 = ppxfxbqfkfVar.f12865cqumvgiudr.f12867eablkybsjg;
                    int i19 = this.f12842stevsuqkhv * i18;
                    int i23 = i18 * i14;
                    if (this.f12846wypolnanlu == 1) {
                        viewRibwqtqdhb2.offsetLeftAndRight(i19 - i23);
                    } else {
                        viewRibwqtqdhb2.offsetTopAndBottom(i19 - i23);
                    }
                }
            }
        }
    }

    private void Z0() {
        if (this.f12846wypolnanlu == 1 || !O0()) {
            this.f12835mbcevpiqjq = this.f12843tzroggbefp;
        } else {
            this.f12835mbcevpiqjq = !this.f12843tzroggbefp;
        }
    }

    private void b1(int i13) {
        ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
        ojitshcjhnVar.f13108eablkybsjg = i13;
        ojitshcjhnVar.f13114wkgbmnqykc = this.f12835mbcevpiqjq != (i13 == -1) ? -1 : 1;
    }

    private void f0(View view) {
        for (int i13 = this.f12832jpowsppfya - 1; i13 >= 0; i13--) {
            this.f12828hkdspvbjdz[i13].iobyxmoadg(view);
        }
    }

    private void f1(int i13, int i14) {
        for (int i15 = 0; i15 < this.f12832jpowsppfya; i15++) {
            if (!this.f12828hkdspvbjdz[i15].f12869iobyxmoadg.isEmpty()) {
                l1(this.f12828hkdspvbjdz[i15], i13, i14);
            }
        }
    }

    private void g0(zoijcleaow zoijcleaowVar) {
        SavedState savedState = this.f12830jhduphickx;
        int i13 = savedState.f12858jyumaefscl;
        if (i13 > 0) {
            if (i13 == this.f12832jpowsppfya) {
                for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
                    this.f12828hkdspvbjdz[i14].eablkybsjg();
                    SavedState savedState2 = this.f12830jhduphickx;
                    int iDxjokdxxww = savedState2.f12857iwizpuwonk[i14];
                    if (iDxjokdxxww != Integer.MIN_VALUE) {
                        iDxjokdxxww += savedState2.f12863zynmafqrjb ? this.f12824cllcsxoeiz.dxjokdxxww() : this.f12824cllcsxoeiz.agtfadlqog();
                    }
                    this.f12828hkdspvbjdz[i14].esjtqupxsv(iDxjokdxxww);
                }
            } else {
                savedState.ppxfxbqfkf();
                SavedState savedState3 = this.f12830jhduphickx;
                savedState3.f12862zdlpuopuiu = savedState3.f12861yggfygwlhe;
            }
        }
        SavedState savedState4 = this.f12830jhduphickx;
        this.f12845vipkmwdibw = savedState4.f12856istkbnxepw;
        d1(savedState4.f12860pmvmpeiblj);
        Z0();
        SavedState savedState5 = this.f12830jhduphickx;
        int i15 = savedState5.f12862zdlpuopuiu;
        if (i15 != -1) {
            this.f12844ulzqkzuiru = i15;
            zoijcleaowVar.f12877ppxfxbqfkf = savedState5.f12863zynmafqrjb;
        } else {
            zoijcleaowVar.f12877ppxfxbqfkf = this.f12835mbcevpiqjq;
        }
        if (savedState5.f12854cqumvgiudr > 1) {
            LazySpanLookup lazySpanLookup = this.f12825crxdokpmqz;
            lazySpanLookup.f12848iobyxmoadg = savedState5.f12855esjtqupxsv;
            lazySpanLookup.f12849zoijcleaow = savedState5.f12859lereixgezr;
        }
    }

    private boolean g1(RecyclerView.zynmafqrjb zynmafqrjbVar, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.f12875iobyxmoadg = this.f12839ribwqtqdhb ? A0(zynmafqrjbVar.zoijcleaow()) : v0(zynmafqrjbVar.zoijcleaow());
        zoijcleaowVar.f12879zoijcleaow = Integer.MIN_VALUE;
        return true;
    }

    private void j0(View view, ppxfxbqfkf ppxfxbqfkfVar, ojitshcjhn ojitshcjhnVar) {
        if (ojitshcjhnVar.f13108eablkybsjg == 1) {
            if (ppxfxbqfkfVar.f12866esjtqupxsv) {
                f0(view);
                return;
            } else {
                ppxfxbqfkfVar.f12865cqumvgiudr.iobyxmoadg(view);
                return;
            }
        }
        if (ppxfxbqfkfVar.f12866esjtqupxsv) {
            U0(view);
        } else {
            ppxfxbqfkfVar.f12865cqumvgiudr.cqumvgiudr(view);
        }
    }

    private void j1(int i13, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int iOjitshcjhn;
        int iOjitshcjhn2;
        int iPpxfxbqfkf;
        ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
        boolean z13 = false;
        ojitshcjhnVar.f13115zoijcleaow = 0;
        ojitshcjhnVar.f13113ppxfxbqfkf = i13;
        if (!ipoelvxyzq() || (iPpxfxbqfkf = zynmafqrjbVar.ppxfxbqfkf()) == -1) {
            iOjitshcjhn = 0;
            iOjitshcjhn2 = 0;
        } else {
            if (this.f12835mbcevpiqjq == (iPpxfxbqfkf < i13)) {
                iOjitshcjhn = this.f12824cllcsxoeiz.ojitshcjhn();
                iOjitshcjhn2 = 0;
            } else {
                iOjitshcjhn2 = this.f12824cllcsxoeiz.ojitshcjhn();
                iOjitshcjhn = 0;
            }
        }
        if (okpsazkaxt()) {
            this.f12834kegysxyocb.f13109gxszxtbevo = this.f12824cllcsxoeiz.agtfadlqog() - iOjitshcjhn2;
            this.f12834kegysxyocb.f13111lqeggnwhkg = this.f12824cllcsxoeiz.dxjokdxxww() + iOjitshcjhn;
        } else {
            this.f12834kegysxyocb.f13111lqeggnwhkg = this.f12824cllcsxoeiz.nufgyqmvbu() + iOjitshcjhn;
            this.f12834kegysxyocb.f13109gxszxtbevo = -iOjitshcjhn2;
        }
        ojitshcjhn ojitshcjhnVar2 = this.f12834kegysxyocb;
        ojitshcjhnVar2.f13112nufgyqmvbu = false;
        ojitshcjhnVar2.f13110iobyxmoadg = true;
        if (this.f12824cllcsxoeiz.draadjrbmk() == 0 && this.f12824cllcsxoeiz.nufgyqmvbu() == 0) {
            z13 = true;
        }
        ojitshcjhnVar2.f13107dxjokdxxww = z13;
    }

    private int k0(int i13) {
        if (vipkmwdibw() == 0) {
            return this.f12835mbcevpiqjq ? 1 : -1;
        }
        return (i13 < E0()) != this.f12835mbcevpiqjq ? -1 : 1;
    }

    private void l1(wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
        int iWflxmlrfwp = wkgbmnqykcVar.wflxmlrfwp();
        if (i13 == -1) {
            if (wkgbmnqykcVar.oxmwwwfdhm() + iWflxmlrfwp <= i14) {
                this.f12837ntlheqmsrt.set(wkgbmnqykcVar.f12867eablkybsjg, false);
            }
        } else if (wkgbmnqykcVar.agtfadlqog() - iWflxmlrfwp >= i14) {
            this.f12837ntlheqmsrt.set(wkgbmnqykcVar.f12867eablkybsjg, false);
        }
    }

    private boolean m0(wkgbmnqykc wkgbmnqykcVar) {
        if (this.f12835mbcevpiqjq) {
            if (wkgbmnqykcVar.agtfadlqog() < this.f12824cllcsxoeiz.dxjokdxxww()) {
                ArrayList arrayList = wkgbmnqykcVar.f12869iobyxmoadg;
                return !wkgbmnqykcVar.vdvldrhtss((View) arrayList.get(arrayList.size() - 1)).f12866esjtqupxsv;
            }
        } else if (wkgbmnqykcVar.oxmwwwfdhm() > this.f12824cllcsxoeiz.agtfadlqog()) {
            return !wkgbmnqykcVar.vdvldrhtss((View) wkgbmnqykcVar.f12869iobyxmoadg.get(0)).f12866esjtqupxsv;
        }
        return false;
    }

    private int m1(int i13, int i14, int i15) {
        if (i14 == 0 && i15 == 0) {
            return i13;
        }
        int mode = View.MeasureSpec.getMode(i13);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - i14) - i15), mode) : i13;
    }

    private int n0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        return cqumvgiudr.iobyxmoadg(zynmafqrjbVar, this.f12824cllcsxoeiz, x0(!this.f12836metgxyhuhe), w0(!this.f12836metgxyhuhe), this, this.f12836metgxyhuhe);
    }

    private int o0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        return cqumvgiudr.zoijcleaow(zynmafqrjbVar, this.f12824cllcsxoeiz, x0(!this.f12836metgxyhuhe), w0(!this.f12836metgxyhuhe), this, this.f12836metgxyhuhe, this.f12835mbcevpiqjq);
    }

    private int p0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        return cqumvgiudr.ppxfxbqfkf(zynmafqrjbVar, this.f12824cllcsxoeiz, x0(!this.f12836metgxyhuhe), w0(!this.f12836metgxyhuhe), this, this.f12836metgxyhuhe);
    }

    private int q0(int i13) {
        if (i13 == 1) {
            return (this.f12846wypolnanlu != 1 && O0()) ? 1 : -1;
        }
        if (i13 == 2) {
            return (this.f12846wypolnanlu != 1 && O0()) ? -1 : 1;
        }
        if (i13 == 17) {
            return this.f12846wypolnanlu == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 == 33) {
            return this.f12846wypolnanlu == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 != 66) {
            return (i13 == 130 && this.f12846wypolnanlu == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f12846wypolnanlu == 0 ? 1 : Integer.MIN_VALUE;
    }

    private LazySpanLookup.FullSpanItem r0(int i13) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f12851jyumaefscl = new int[this.f12832jpowsppfya];
        for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
            fullSpanItem.f12851jyumaefscl[i14] = i13 - this.f12828hkdspvbjdz[i14].ojitshcjhn(i13);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem s0(int i13) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f12851jyumaefscl = new int[this.f12832jpowsppfya];
        for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
            fullSpanItem.f12851jyumaefscl[i14] = this.f12828hkdspvbjdz[i14].kcexrzcfyt(i13) - i13;
        }
        return fullSpanItem;
    }

    private void t0() {
        this.f12824cllcsxoeiz = yggfygwlhe.zoijcleaow(this, this.f12846wypolnanlu);
        this.f12827dsvhmnatus = yggfygwlhe.zoijcleaow(this, 1 - this.f12846wypolnanlu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$rgvfuqvkyq, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int u0(RecyclerView.iwizpuwonk iwizpuwonkVar, ojitshcjhn ojitshcjhnVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int i13;
        int iG0;
        wkgbmnqykc wkgbmnqykcVarK0;
        int iEablkybsjg;
        int i14;
        int iEablkybsjg2;
        int iEablkybsjg3;
        boolean z13;
        ?? r13 = 0;
        this.f12837ntlheqmsrt.set(0, this.f12832jpowsppfya, true);
        if (this.f12834kegysxyocb.f13107dxjokdxxww) {
            i13 = ojitshcjhnVar.f13108eablkybsjg == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i13 = ojitshcjhnVar.f13108eablkybsjg == 1 ? ojitshcjhnVar.f13111lqeggnwhkg + ojitshcjhnVar.f13115zoijcleaow : ojitshcjhnVar.f13109gxszxtbevo - ojitshcjhnVar.f13115zoijcleaow;
        }
        int i15 = i13;
        f1(ojitshcjhnVar.f13108eablkybsjg, i15);
        int iDxjokdxxww = this.f12835mbcevpiqjq ? this.f12824cllcsxoeiz.dxjokdxxww() : this.f12824cllcsxoeiz.agtfadlqog();
        ?? r14 = false;
        while (ojitshcjhnVar.iobyxmoadg(zynmafqrjbVar) && (this.f12834kegysxyocb.f13107dxjokdxxww || !this.f12837ntlheqmsrt.isEmpty())) {
            View viewZoijcleaow = ojitshcjhnVar.zoijcleaow(iwizpuwonkVar);
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) viewZoijcleaow.getLayoutParams();
            int iZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            int iLqeggnwhkg = this.f12825crxdokpmqz.lqeggnwhkg(iZoijcleaow);
            ?? r15 = iLqeggnwhkg == -1 ? 1 : r13;
            if (r15 != 0) {
                wkgbmnqykcVarK0 = ppxfxbqfkfVar.f12866esjtqupxsv ? this.f12828hkdspvbjdz[r13] : K0(ojitshcjhnVar);
                this.f12825crxdokpmqz.agtfadlqog(iZoijcleaow, wkgbmnqykcVarK0);
            } else {
                wkgbmnqykcVarK0 = this.f12828hkdspvbjdz[iLqeggnwhkg];
            }
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykcVarK0;
            ppxfxbqfkfVar.f12865cqumvgiudr = wkgbmnqykcVar;
            if (ojitshcjhnVar.f13108eablkybsjg == 1) {
                zdlpuopuiu(viewZoijcleaow);
            } else {
                yggfygwlhe(viewZoijcleaow, r13);
            }
            Q0(viewZoijcleaow, ppxfxbqfkfVar, r13);
            if (ojitshcjhnVar.f13108eablkybsjg == 1) {
                int iG1 = ppxfxbqfkfVar.f12866esjtqupxsv ? G0(iDxjokdxxww) : wkgbmnqykcVar.ojitshcjhn(iDxjokdxxww);
                int iEablkybsjg4 = this.f12824cllcsxoeiz.eablkybsjg(viewZoijcleaow) + iG1;
                if (r15 != 0 && ppxfxbqfkfVar.f12866esjtqupxsv) {
                    LazySpanLookup.FullSpanItem fullSpanItemR0 = r0(iG1);
                    fullSpanItemR0.f12852yggfygwlhe = -1;
                    fullSpanItemR0.f12853zdlpuopuiu = iZoijcleaow;
                    this.f12825crxdokpmqz.iobyxmoadg(fullSpanItemR0);
                }
                i14 = iEablkybsjg4;
                iEablkybsjg = iG1;
            } else {
                int iJ0 = ppxfxbqfkfVar.f12866esjtqupxsv ? J0(iDxjokdxxww) : wkgbmnqykcVar.kcexrzcfyt(iDxjokdxxww);
                iEablkybsjg = iJ0 - this.f12824cllcsxoeiz.eablkybsjg(viewZoijcleaow);
                if (r15 != 0 && ppxfxbqfkfVar.f12866esjtqupxsv) {
                    LazySpanLookup.FullSpanItem fullSpanItemS0 = s0(iJ0);
                    fullSpanItemS0.f12852yggfygwlhe = 1;
                    fullSpanItemS0.f12853zdlpuopuiu = iZoijcleaow;
                    this.f12825crxdokpmqz.iobyxmoadg(fullSpanItemS0);
                }
                i14 = iJ0;
            }
            if (ppxfxbqfkfVar.f12866esjtqupxsv && ojitshcjhnVar.f13114wkgbmnqykc == -1) {
                if (r15 != 0) {
                    this.f12847xrmfcynszj = true;
                } else {
                    if (!(ojitshcjhnVar.f13108eablkybsjg == 1 ? h0() : i0())) {
                        LazySpanLookup.FullSpanItem fullSpanItemGxszxtbevo = this.f12825crxdokpmqz.gxszxtbevo(iZoijcleaow);
                        if (fullSpanItemGxszxtbevo != null) {
                            fullSpanItemGxszxtbevo.f12850iwizpuwonk = true;
                        }
                        this.f12847xrmfcynszj = true;
                    }
                }
            }
            j0(viewZoijcleaow, ppxfxbqfkfVar, ojitshcjhnVar);
            if (O0() && this.f12846wypolnanlu == 1) {
                int iDxjokdxxww2 = ppxfxbqfkfVar.f12866esjtqupxsv ? this.f12827dsvhmnatus.dxjokdxxww() : this.f12827dsvhmnatus.dxjokdxxww() - (((this.f12832jpowsppfya - 1) - wkgbmnqykcVar.f12867eablkybsjg) * this.f12842stevsuqkhv);
                iEablkybsjg3 = iDxjokdxxww2;
                iEablkybsjg2 = iDxjokdxxww2 - this.f12827dsvhmnatus.eablkybsjg(viewZoijcleaow);
            } else {
                int iAgtfadlqog = ppxfxbqfkfVar.f12866esjtqupxsv ? this.f12827dsvhmnatus.agtfadlqog() : (wkgbmnqykcVar.f12867eablkybsjg * this.f12842stevsuqkhv) + this.f12827dsvhmnatus.agtfadlqog();
                iEablkybsjg2 = iAgtfadlqog;
                iEablkybsjg3 = this.f12827dsvhmnatus.eablkybsjg(viewZoijcleaow) + iAgtfadlqog;
            }
            if (this.f12846wypolnanlu == 1) {
                mhtqkkgtqm(viewZoijcleaow, iEablkybsjg2, iEablkybsjg, iEablkybsjg3, i14);
            } else {
                mhtqkkgtqm(viewZoijcleaow, iEablkybsjg, iEablkybsjg2, i14, iEablkybsjg3);
            }
            if (ppxfxbqfkfVar.f12866esjtqupxsv) {
                f1(this.f12834kegysxyocb.f13108eablkybsjg, i15);
            } else {
                l1(wkgbmnqykcVar, this.f12834kegysxyocb.f13108eablkybsjg, i15);
            }
            V0(iwizpuwonkVar, this.f12834kegysxyocb);
            if (!this.f12834kegysxyocb.f13112nufgyqmvbu || !viewZoijcleaow.hasFocusable()) {
                z13 = false;
            } else if (ppxfxbqfkfVar.f12866esjtqupxsv) {
                this.f12837ntlheqmsrt.clear();
                z13 = false;
            } else {
                z13 = false;
                this.f12837ntlheqmsrt.set(wkgbmnqykcVar.f12867eablkybsjg, false);
            }
            r13 = z13;
            r14 = true;
        }
        ?? r16 = r13;
        if (r14 == false) {
            V0(iwizpuwonkVar, this.f12834kegysxyocb);
        }
        if (this.f12834kegysxyocb.f13108eablkybsjg == -1) {
            iG0 = this.f12824cllcsxoeiz.agtfadlqog() - J0(this.f12824cllcsxoeiz.agtfadlqog());
        } else {
            iG0 = G0(this.f12824cllcsxoeiz.dxjokdxxww()) - this.f12824cllcsxoeiz.dxjokdxxww();
        }
        return iG0 > 0 ? Math.min(ojitshcjhnVar.f13115zoijcleaow, iG0) : r16 == true ? 1 : 0;
    }

    private int v0(int i13) {
        int iVipkmwdibw = vipkmwdibw();
        for (int i14 = 0; i14 < iVipkmwdibw; i14++) {
            int iLrnfpwlwnk = lrnfpwlwnk(ribwqtqdhb(i14));
            if (iLrnfpwlwnk >= 0 && iLrnfpwlwnk < i13) {
                return iLrnfpwlwnk;
            }
        }
        return 0;
    }

    public int[] B0(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f12832jpowsppfya];
        } else if (iArr.length < this.f12832jpowsppfya) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f12832jpowsppfya + ", array size:" + iArr.length);
        }
        for (int i13 = 0; i13 < this.f12832jpowsppfya; i13++) {
            iArr[i13] = this.f12828hkdspvbjdz[i13].dxjokdxxww();
        }
        return iArr;
    }

    int E0() {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        return lrnfpwlwnk(ribwqtqdhb(0));
    }

    int F0() {
        int iVipkmwdibw = vipkmwdibw();
        if (iVipkmwdibw == 0) {
            return 0;
        }
        return lrnfpwlwnk(ribwqtqdhb(iVipkmwdibw - 1));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    View M0() {
        int i13;
        boolean z13;
        boolean z14;
        int iVipkmwdibw = vipkmwdibw();
        int i14 = iVipkmwdibw - 1;
        BitSet bitSet = new BitSet(this.f12832jpowsppfya);
        bitSet.set(0, this.f12832jpowsppfya, true);
        byte b13 = (this.f12846wypolnanlu == 1 && O0()) ? (byte) 1 : (byte) -1;
        if (this.f12835mbcevpiqjq) {
            iVipkmwdibw = -1;
        } else {
            i14 = 0;
        }
        int i15 = i14 < iVipkmwdibw ? 1 : -1;
        while (i14 != iVipkmwdibw) {
            View viewRibwqtqdhb = ribwqtqdhb(i14);
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) viewRibwqtqdhb.getLayoutParams();
            if (bitSet.get(ppxfxbqfkfVar.f12865cqumvgiudr.f12867eablkybsjg)) {
                if (m0(ppxfxbqfkfVar.f12865cqumvgiudr)) {
                    return viewRibwqtqdhb;
                }
                bitSet.clear(ppxfxbqfkfVar.f12865cqumvgiudr.f12867eablkybsjg);
            }
            if (!ppxfxbqfkfVar.f12866esjtqupxsv && (i13 = i14 + i15) != iVipkmwdibw) {
                View viewRibwqtqdhb2 = ribwqtqdhb(i13);
                if (this.f12835mbcevpiqjq) {
                    int iWkgbmnqykc = this.f12824cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb);
                    int iWkgbmnqykc2 = this.f12824cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb2);
                    if (iWkgbmnqykc < iWkgbmnqykc2) {
                        return viewRibwqtqdhb;
                    }
                    if (iWkgbmnqykc == iWkgbmnqykc2) {
                        if (ppxfxbqfkfVar.f12865cqumvgiudr.f12867eablkybsjg - ((ppxfxbqfkf) viewRibwqtqdhb2.getLayoutParams()).f12865cqumvgiudr.f12867eablkybsjg < 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (b13 < 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13 != z14) {
                            return viewRibwqtqdhb;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iLqeggnwhkg = this.f12824cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb);
                    int iLqeggnwhkg2 = this.f12824cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb2);
                    if (iLqeggnwhkg > iLqeggnwhkg2) {
                        return viewRibwqtqdhb;
                    }
                    if (iLqeggnwhkg == iLqeggnwhkg2) {
                        if (ppxfxbqfkfVar.f12865cqumvgiudr.f12867eablkybsjg - ((ppxfxbqfkf) viewRibwqtqdhb2.getLayoutParams()).f12865cqumvgiudr.f12867eablkybsjg < 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (b13 < 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13 != z14) {
                            return viewRibwqtqdhb;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i14 += i15;
        }
        return null;
    }

    public void N0() {
        this.f12825crxdokpmqz.zoijcleaow();
        M();
    }

    boolean O0() {
        return bfopjjpdmp() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return a1(i13, iwizpuwonkVar, zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void Q(int i13) {
        SavedState savedState = this.f12830jhduphickx;
        if (savedState != null && savedState.f12862zdlpuopuiu != i13) {
            savedState.zoijcleaow();
        }
        this.f12844ulzqkzuiru = i13;
        this.f12841sopmlzcsov = Integer.MIN_VALUE;
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int R(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return a1(i13, iwizpuwonkVar, zynmafqrjbVar);
    }

    void T0(int i13, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int iE0;
        int i14;
        if (i13 > 0) {
            iE0 = F0();
            i14 = 1;
        } else {
            iE0 = E0();
            i14 = -1;
        }
        this.f12834kegysxyocb.f13110iobyxmoadg = true;
        j1(iE0, zynmafqrjbVar);
        b1(i14);
        ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
        ojitshcjhnVar.f13113ppxfxbqfkf = iE0 + ojitshcjhnVar.f13114wkgbmnqykc;
        ojitshcjhnVar.f13115zoijcleaow = Math.abs(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void V(Rect rect, int i13, int i14) {
        int iCdpycssgdh;
        int iCdpycssgdh2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f12846wypolnanlu == 1) {
            iCdpycssgdh2 = RecyclerView.rgvfuqvkyq.cdpycssgdh(i14, rect.height() + paddingTop, iyctptxqzt());
            iCdpycssgdh = RecyclerView.rgvfuqvkyq.cdpycssgdh(i13, (this.f12842stevsuqkhv * this.f12832jpowsppfya) + paddingLeft, weqkydbzbr());
        } else {
            iCdpycssgdh = RecyclerView.rgvfuqvkyq.cdpycssgdh(i13, rect.width() + paddingLeft, weqkydbzbr());
            iCdpycssgdh2 = RecyclerView.rgvfuqvkyq.cdpycssgdh(i14, (this.f12842stevsuqkhv * this.f12832jpowsppfya) + paddingTop, iyctptxqzt());
        }
        U(iCdpycssgdh, iCdpycssgdh2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void a(RecyclerView recyclerView, RecyclerView.iwizpuwonk iwizpuwonkVar) {
        super.a(recyclerView, iwizpuwonkVar);
        H(this.f12826czzsidtyhn);
        for (int i13 = 0; i13 < this.f12832jpowsppfya; i13++) {
            this.f12828hkdspvbjdz[i13].eablkybsjg();
        }
        recyclerView.requestLayout();
    }

    int a1(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0 || i13 == 0) {
            return 0;
        }
        T0(i13, zynmafqrjbVar);
        int iU0 = u0(iwizpuwonkVar, this.f12834kegysxyocb, zynmafqrjbVar);
        if (this.f12834kegysxyocb.f13115zoijcleaow >= iU0) {
            i13 = i13 < 0 ? -iU0 : iU0;
        }
        this.f12824cllcsxoeiz.kcexrzcfyt(-i13);
        this.f12839ribwqtqdhb = this.f12835mbcevpiqjq;
        ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
        ojitshcjhnVar.f13115zoijcleaow = 0;
        V0(iwizpuwonkVar, ojitshcjhnVar);
        return i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public View b(View view, int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        View viewTzroggbefp;
        View viewRgvfuqvkyq;
        if (vipkmwdibw() == 0 || (viewTzroggbefp = tzroggbefp(view)) == null) {
            return null;
        }
        Z0();
        int iQ0 = q0(i13);
        if (iQ0 == Integer.MIN_VALUE) {
            return null;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) viewTzroggbefp.getLayoutParams();
        boolean z13 = ppxfxbqfkfVar.f12866esjtqupxsv;
        wkgbmnqykc wkgbmnqykcVar = ppxfxbqfkfVar.f12865cqumvgiudr;
        int iF0 = iQ0 == 1 ? F0() : E0();
        j1(iF0, zynmafqrjbVar);
        b1(iQ0);
        ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
        ojitshcjhnVar.f13113ppxfxbqfkf = ojitshcjhnVar.f13114wkgbmnqykc + iF0;
        ojitshcjhnVar.f13115zoijcleaow = (int) (this.f12824cllcsxoeiz.ojitshcjhn() * 0.33333334f);
        ojitshcjhn ojitshcjhnVar2 = this.f12834kegysxyocb;
        ojitshcjhnVar2.f13112nufgyqmvbu = true;
        ojitshcjhnVar2.f13110iobyxmoadg = false;
        u0(iwizpuwonkVar, ojitshcjhnVar2, zynmafqrjbVar);
        this.f12839ribwqtqdhb = this.f12835mbcevpiqjq;
        if (!z13 && (viewRgvfuqvkyq = wkgbmnqykcVar.rgvfuqvkyq(iF0, iQ0)) != null && viewRgvfuqvkyq != viewTzroggbefp) {
            return viewRgvfuqvkyq;
        }
        if (S0(iQ0)) {
            for (int i14 = this.f12832jpowsppfya - 1; i14 >= 0; i14--) {
                View viewRgvfuqvkyq2 = this.f12828hkdspvbjdz[i14].rgvfuqvkyq(iF0, iQ0);
                if (viewRgvfuqvkyq2 != null && viewRgvfuqvkyq2 != viewTzroggbefp) {
                    return viewRgvfuqvkyq2;
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f12832jpowsppfya; i15++) {
                View viewRgvfuqvkyq3 = this.f12828hkdspvbjdz[i15].rgvfuqvkyq(iF0, iQ0);
                if (viewRgvfuqvkyq3 != null && viewRgvfuqvkyq3 != viewTzroggbefp) {
                    return viewRgvfuqvkyq3;
                }
            }
        }
        boolean z14 = (this.f12843tzroggbefp ^ true) == (iQ0 == -1);
        if (!z13) {
            View viewMbcevpiqjq = mbcevpiqjq(z14 ? wkgbmnqykcVar.gxszxtbevo() : wkgbmnqykcVar.nufgyqmvbu());
            if (viewMbcevpiqjq != null && viewMbcevpiqjq != viewTzroggbefp) {
                return viewMbcevpiqjq;
            }
        }
        if (S0(iQ0)) {
            for (int i16 = this.f12832jpowsppfya - 1; i16 >= 0; i16--) {
                if (i16 != wkgbmnqykcVar.f12867eablkybsjg) {
                    View viewMbcevpiqjq2 = mbcevpiqjq(z14 ? this.f12828hkdspvbjdz[i16].gxszxtbevo() : this.f12828hkdspvbjdz[i16].nufgyqmvbu());
                    if (viewMbcevpiqjq2 != null && viewMbcevpiqjq2 != viewTzroggbefp) {
                        return viewMbcevpiqjq2;
                    }
                }
            }
        } else {
            for (int i17 = 0; i17 < this.f12832jpowsppfya; i17++) {
                View viewMbcevpiqjq3 = mbcevpiqjq(z14 ? this.f12828hkdspvbjdz[i17].gxszxtbevo() : this.f12828hkdspvbjdz[i17].nufgyqmvbu());
                if (viewMbcevpiqjq3 != null && viewMbcevpiqjq3 != viewTzroggbefp) {
                    return viewMbcevpiqjq3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void b0(RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(recyclerView.getContext());
        rgvfuqvkyqVar.setTargetPosition(i13);
        c0(rgvfuqvkyqVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void c(AccessibilityEvent accessibilityEvent) {
        super.c(accessibilityEvent);
        if (vipkmwdibw() > 0) {
            View viewX0 = x0(false);
            View viewW0 = w0(false);
            if (viewX0 == null || viewW0 == null) {
                return;
            }
            int iLrnfpwlwnk = lrnfpwlwnk(viewX0);
            int iLrnfpwlwnk2 = lrnfpwlwnk(viewW0);
            if (iLrnfpwlwnk < iLrnfpwlwnk2) {
                accessibilityEvent.setFromIndex(iLrnfpwlwnk);
                accessibilityEvent.setToIndex(iLrnfpwlwnk2);
            } else {
                accessibilityEvent.setFromIndex(iLrnfpwlwnk2);
                accessibilityEvent.setToIndex(iLrnfpwlwnk);
            }
        }
    }

    public void c1(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        iwizpuwonk(null);
        if (i13 == this.f12846wypolnanlu) {
            return;
        }
        this.f12846wypolnanlu = i13;
        yggfygwlhe yggfygwlheVar = this.f12824cllcsxoeiz;
        this.f12824cllcsxoeiz = this.f12827dsvhmnatus;
        this.f12827dsvhmnatus = yggfygwlheVar;
        M();
    }

    public void d1(boolean z13) {
        iwizpuwonk(null);
        SavedState savedState = this.f12830jhduphickx;
        if (savedState != null && savedState.f12860pmvmpeiblj != z13) {
            savedState.f12860pmvmpeiblj = z13;
        }
        this.f12843tzroggbefp = z13;
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean e0() {
        return this.f12830jhduphickx == null;
    }

    public void e1(int i13) {
        iwizpuwonk(null);
        if (i13 != this.f12832jpowsppfya) {
            N0();
            this.f12832jpowsppfya = i13;
            this.f12837ntlheqmsrt = new BitSet(this.f12832jpowsppfya);
            this.f12828hkdspvbjdz = new wkgbmnqykc[this.f12832jpowsppfya];
            for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
                this.f12828hkdspvbjdz[i14] = new wkgbmnqykc(i14);
            }
            M();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void ezmngbhpjk(int i13) {
        super.ezmngbhpjk(i13);
        for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
            this.f12828hkdspvbjdz[i14].yggfygwlhe(i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void fmlbqenlif(int i13) {
        super.fmlbqenlif(i13);
        for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
            this.f12828hkdspvbjdz[i14].yggfygwlhe(i13);
        }
    }

    boolean h0() {
        int iOjitshcjhn = this.f12828hkdspvbjdz[0].ojitshcjhn(Integer.MIN_VALUE);
        for (int i13 = 1; i13 < this.f12832jpowsppfya; i13++) {
            if (this.f12828hkdspvbjdz[i13].ojitshcjhn(Integer.MIN_VALUE) != iOjitshcjhn) {
                return false;
            }
        }
        return true;
    }

    boolean h1(RecyclerView.zynmafqrjb zynmafqrjbVar, zoijcleaow zoijcleaowVar) {
        int i13;
        if (!zynmafqrjbVar.eablkybsjg() && (i13 = this.f12844ulzqkzuiru) != -1) {
            if (i13 >= 0 && i13 < zynmafqrjbVar.zoijcleaow()) {
                SavedState savedState = this.f12830jhduphickx;
                if (savedState == null || savedState.f12862zdlpuopuiu == -1 || savedState.f12858jyumaefscl < 1) {
                    View viewMbcevpiqjq = mbcevpiqjq(this.f12844ulzqkzuiru);
                    if (viewMbcevpiqjq != null) {
                        zoijcleaowVar.f12875iobyxmoadg = this.f12835mbcevpiqjq ? F0() : E0();
                        if (this.f12841sopmlzcsov != Integer.MIN_VALUE) {
                            if (zoijcleaowVar.f12877ppxfxbqfkf) {
                                zoijcleaowVar.f12879zoijcleaow = (this.f12824cllcsxoeiz.dxjokdxxww() - this.f12841sopmlzcsov) - this.f12824cllcsxoeiz.wkgbmnqykc(viewMbcevpiqjq);
                            } else {
                                zoijcleaowVar.f12879zoijcleaow = (this.f12824cllcsxoeiz.agtfadlqog() + this.f12841sopmlzcsov) - this.f12824cllcsxoeiz.lqeggnwhkg(viewMbcevpiqjq);
                            }
                            return true;
                        }
                        if (this.f12824cllcsxoeiz.eablkybsjg(viewMbcevpiqjq) > this.f12824cllcsxoeiz.ojitshcjhn()) {
                            zoijcleaowVar.f12879zoijcleaow = zoijcleaowVar.f12877ppxfxbqfkf ? this.f12824cllcsxoeiz.dxjokdxxww() : this.f12824cllcsxoeiz.agtfadlqog();
                            return true;
                        }
                        int iLqeggnwhkg = this.f12824cllcsxoeiz.lqeggnwhkg(viewMbcevpiqjq) - this.f12824cllcsxoeiz.agtfadlqog();
                        if (iLqeggnwhkg < 0) {
                            zoijcleaowVar.f12879zoijcleaow = -iLqeggnwhkg;
                            return true;
                        }
                        int iDxjokdxxww = this.f12824cllcsxoeiz.dxjokdxxww() - this.f12824cllcsxoeiz.wkgbmnqykc(viewMbcevpiqjq);
                        if (iDxjokdxxww < 0) {
                            zoijcleaowVar.f12879zoijcleaow = iDxjokdxxww;
                            return true;
                        }
                        zoijcleaowVar.f12879zoijcleaow = Integer.MIN_VALUE;
                    } else {
                        int i14 = this.f12844ulzqkzuiru;
                        zoijcleaowVar.f12875iobyxmoadg = i14;
                        int i15 = this.f12841sopmlzcsov;
                        if (i15 == Integer.MIN_VALUE) {
                            zoijcleaowVar.f12877ppxfxbqfkf = k0(i14) == 1;
                            zoijcleaowVar.iobyxmoadg();
                        } else {
                            zoijcleaowVar.zoijcleaow(i15);
                        }
                        zoijcleaowVar.f12878wkgbmnqykc = true;
                    }
                } else {
                    zoijcleaowVar.f12879zoijcleaow = Integer.MIN_VALUE;
                    zoijcleaowVar.f12875iobyxmoadg = this.f12844ulzqkzuiru;
                }
                return true;
            }
            this.f12844ulzqkzuiru = -1;
            this.f12841sopmlzcsov = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int hcddaimhww(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return o0(zynmafqrjbVar);
    }

    boolean i0() {
        int iKcexrzcfyt = this.f12828hkdspvbjdz[0].kcexrzcfyt(Integer.MIN_VALUE);
        for (int i13 = 1; i13 < this.f12832jpowsppfya; i13++) {
            if (this.f12828hkdspvbjdz[i13].kcexrzcfyt(Integer.MIN_VALUE) != iKcexrzcfyt) {
                return false;
            }
        }
        return true;
    }

    void i1(RecyclerView.zynmafqrjb zynmafqrjbVar, zoijcleaow zoijcleaowVar) {
        if (h1(zynmafqrjbVar, zoijcleaowVar) || g1(zynmafqrjbVar, zoijcleaowVar)) {
            return;
        }
        zoijcleaowVar.iobyxmoadg();
        zoijcleaowVar.f12875iobyxmoadg = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean istkbnxepw(RecyclerView.vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar instanceof ppxfxbqfkf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void iwizpuwonk(String str) {
        if (this.f12830jhduphickx == null) {
            super.iwizpuwonk(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void j(RecyclerView recyclerView, int i13, int i14) {
        L0(i13, i14, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jpowsppfya(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return p0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void k(RecyclerView recyclerView) {
        this.f12825crxdokpmqz.zoijcleaow();
        M();
    }

    void k1(int i13) {
        this.f12842stevsuqkhv = i13 / this.f12832jpowsppfya;
        this.f12829ikoacuggdj = View.MeasureSpec.makeMeasureSpec(i13, this.f12827dsvhmnatus.draadjrbmk());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void l(RecyclerView recyclerView, int i13, int i14, int i15) {
        L0(i13, i14, 8);
    }

    boolean l0() {
        int iE0;
        int iF0;
        if (vipkmwdibw() == 0 || this.f12831jlmebxxoox == 0 || !igdgnonuha()) {
            return false;
        }
        if (this.f12835mbcevpiqjq) {
            iE0 = F0();
            iF0 = E0();
        } else {
            iE0 = E0();
            iF0 = F0();
        }
        if (iE0 == 0 && M0() != null) {
            this.f12825crxdokpmqz.zoijcleaow();
            N();
            M();
            return true;
        }
        if (!this.f12847xrmfcynszj) {
            return false;
        }
        int i13 = this.f12835mbcevpiqjq ? -1 : 1;
        int i14 = iF0 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemEablkybsjg = this.f12825crxdokpmqz.eablkybsjg(iE0, i14, i13, true);
        if (fullSpanItemEablkybsjg == null) {
            this.f12847xrmfcynszj = false;
            this.f12825crxdokpmqz.wkgbmnqykc(i14);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemEablkybsjg2 = this.f12825crxdokpmqz.eablkybsjg(iE0, fullSpanItemEablkybsjg.f12853zdlpuopuiu, i13 * (-1), true);
        if (fullSpanItemEablkybsjg2 == null) {
            this.f12825crxdokpmqz.wkgbmnqykc(fullSpanItemEablkybsjg.f12853zdlpuopuiu);
        } else {
            this.f12825crxdokpmqz.wkgbmnqykc(fullSpanItemEablkybsjg2.f12853zdlpuopuiu + 1);
        }
        N();
        M();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int lmojexxdyd(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return n0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean lxfrhoxuzk() {
        return this.f12831jlmebxxoox != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void m(RecyclerView recyclerView, int i13, int i14) {
        L0(i13, i14, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ntlheqmsrt() {
        return this.f12846wypolnanlu == 0 ? new ppxfxbqfkf(-2, -1) : new ppxfxbqfkf(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void o(RecyclerView recyclerView, int i13, int i14, Object obj) {
        L0(i13, i14, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        R0(iwizpuwonkVar, zynmafqrjbVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int pkzmftpjix(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return n0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean pmvmpeiblj() {
        return this.f12846wypolnanlu == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        super.q(zynmafqrjbVar);
        this.f12844ulzqkzuiru = -1;
        this.f12841sopmlzcsov = Integer.MIN_VALUE;
        this.f12830jhduphickx = null;
        this.f12833jztzpxfvev.ppxfxbqfkf();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void rhgxfdycjh(RecyclerView.nufgyqmvbu nufgyqmvbuVar, RecyclerView.nufgyqmvbu nufgyqmvbuVar2) {
        this.f12825crxdokpmqz.zoijcleaow();
        for (int i13 = 0; i13 < this.f12832jpowsppfya; i13++) {
            this.f12828hkdspvbjdz[i13].eablkybsjg();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss sopmlzcsov(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ppxfxbqfkf((ViewGroup.MarginLayoutParams) layoutParams) : new ppxfxbqfkf(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void u(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f12830jhduphickx = savedState;
            if (this.f12844ulzqkzuiru != -1) {
                savedState.zoijcleaow();
                this.f12830jhduphickx.ppxfxbqfkf();
            }
            M();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ulzqkzuiru(Context context, AttributeSet attributeSet) {
        return new ppxfxbqfkf(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public Parcelable v() {
        int iKcexrzcfyt;
        int iAgtfadlqog;
        int[] iArr;
        if (this.f12830jhduphickx != null) {
            return new SavedState(this.f12830jhduphickx);
        }
        SavedState savedState = new SavedState();
        savedState.f12860pmvmpeiblj = this.f12843tzroggbefp;
        savedState.f12863zynmafqrjb = this.f12839ribwqtqdhb;
        savedState.f12856istkbnxepw = this.f12845vipkmwdibw;
        LazySpanLookup lazySpanLookup = this.f12825crxdokpmqz;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f12848iobyxmoadg) == null) {
            savedState.f12854cqumvgiudr = 0;
        } else {
            savedState.f12855esjtqupxsv = iArr;
            savedState.f12854cqumvgiudr = iArr.length;
            savedState.f12859lereixgezr = lazySpanLookup.f12849zoijcleaow;
        }
        if (vipkmwdibw() > 0) {
            savedState.f12862zdlpuopuiu = this.f12839ribwqtqdhb ? F0() : E0();
            savedState.f12861yggfygwlhe = y0();
            int i13 = this.f12832jpowsppfya;
            savedState.f12858jyumaefscl = i13;
            savedState.f12857iwizpuwonk = new int[i13];
            for (int i14 = 0; i14 < this.f12832jpowsppfya; i14++) {
                if (this.f12839ribwqtqdhb) {
                    iKcexrzcfyt = this.f12828hkdspvbjdz[i14].ojitshcjhn(Integer.MIN_VALUE);
                    if (iKcexrzcfyt != Integer.MIN_VALUE) {
                        iAgtfadlqog = this.f12824cllcsxoeiz.dxjokdxxww();
                        iKcexrzcfyt -= iAgtfadlqog;
                    }
                } else {
                    iKcexrzcfyt = this.f12828hkdspvbjdz[i14].kcexrzcfyt(Integer.MIN_VALUE);
                    if (iKcexrzcfyt != Integer.MIN_VALUE) {
                        iAgtfadlqog = this.f12824cllcsxoeiz.agtfadlqog();
                        iKcexrzcfyt -= iAgtfadlqog;
                    }
                }
                savedState.f12857iwizpuwonk[i14] = iKcexrzcfyt;
            }
        } else {
            savedState.f12862zdlpuopuiu = -1;
            savedState.f12861yggfygwlhe = -1;
            savedState.f12858jyumaefscl = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void w(int i13) {
        if (i13 == 0) {
            l0();
        }
    }

    View w0(boolean z13) {
        int iAgtfadlqog = this.f12824cllcsxoeiz.agtfadlqog();
        int iDxjokdxxww = this.f12824cllcsxoeiz.dxjokdxxww();
        View view = null;
        for (int iVipkmwdibw = vipkmwdibw() - 1; iVipkmwdibw >= 0; iVipkmwdibw--) {
            View viewRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            int iLqeggnwhkg = this.f12824cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb);
            int iWkgbmnqykc = this.f12824cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb);
            if (iWkgbmnqykc > iAgtfadlqog && iLqeggnwhkg < iDxjokdxxww) {
                if (iWkgbmnqykc <= iDxjokdxxww || !z13) {
                    return viewRibwqtqdhb;
                }
                if (view == null) {
                    view = viewRibwqtqdhb;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int wwaezpbzkn(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return o0(zynmafqrjbVar);
    }

    View x0(boolean z13) {
        int iAgtfadlqog = this.f12824cllcsxoeiz.agtfadlqog();
        int iDxjokdxxww = this.f12824cllcsxoeiz.dxjokdxxww();
        int iVipkmwdibw = vipkmwdibw();
        View view = null;
        for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            int iLqeggnwhkg = this.f12824cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb);
            if (this.f12824cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb) > iAgtfadlqog && iLqeggnwhkg < iDxjokdxxww) {
                if (iLqeggnwhkg >= iAgtfadlqog || !z13) {
                    return viewRibwqtqdhb;
                }
                if (view == null) {
                    view = viewRibwqtqdhb;
                }
            }
        }
        return view;
    }

    int y0() {
        View viewW0 = this.f12835mbcevpiqjq ? w0(true) : x0(true);
        if (viewW0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewW0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void yadqdtsiqt(int i13, int i14, RecyclerView.zynmafqrjb zynmafqrjbVar, RecyclerView.rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar) {
        int iOjitshcjhn;
        int iKcexrzcfyt;
        if (this.f12846wypolnanlu != 0) {
            i13 = i14;
        }
        if (vipkmwdibw() == 0 || i13 == 0) {
            return;
        }
        T0(i13, zynmafqrjbVar);
        int[] iArr = this.f12840rlfsiqarku;
        if (iArr == null || iArr.length < this.f12832jpowsppfya) {
            this.f12840rlfsiqarku = new int[this.f12832jpowsppfya];
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f12832jpowsppfya; i16++) {
            ojitshcjhn ojitshcjhnVar = this.f12834kegysxyocb;
            if (ojitshcjhnVar.f13114wkgbmnqykc == -1) {
                iOjitshcjhn = ojitshcjhnVar.f13109gxszxtbevo;
                iKcexrzcfyt = this.f12828hkdspvbjdz[i16].kcexrzcfyt(iOjitshcjhn);
            } else {
                iOjitshcjhn = this.f12828hkdspvbjdz[i16].ojitshcjhn(ojitshcjhnVar.f13111lqeggnwhkg);
                iKcexrzcfyt = this.f12834kegysxyocb.f13111lqeggnwhkg;
            }
            int i17 = iOjitshcjhn - iKcexrzcfyt;
            if (i17 >= 0) {
                this.f12840rlfsiqarku[i15] = i17;
                i15++;
            }
        }
        Arrays.sort(this.f12840rlfsiqarku, 0, i15);
        for (int i18 = 0; i18 < i15 && this.f12834kegysxyocb.iobyxmoadg(zynmafqrjbVar); i18++) {
            ppxfxbqfkfVar.iobyxmoadg(this.f12834kegysxyocb.f13113ppxfxbqfkf, this.f12840rlfsiqarku[i18]);
            ojitshcjhn ojitshcjhnVar2 = this.f12834kegysxyocb;
            ojitshcjhnVar2.f13113ppxfxbqfkf += ojitshcjhnVar2.f13114wkgbmnqykc;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int ylkuphrtab(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return p0(zynmafqrjbVar);
    }

    public int[] z0(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f12832jpowsppfya];
        } else if (iArr.length < this.f12832jpowsppfya) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f12832jpowsppfya + ", array size:" + iArr.length);
        }
        for (int i13 = 0; i13 < this.f12832jpowsppfya; i13++) {
            iArr[i13] = this.f12828hkdspvbjdz[i13].lqeggnwhkg();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj.zoijcleaow
    public PointF zoijcleaow(int i13) {
        int iK0 = k0(i13);
        PointF pointF = new PointF();
        if (iK0 == 0) {
            return null;
        }
        if (this.f12846wypolnanlu == 0) {
            pointF.x = iK0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iK0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean zynmafqrjb() {
        return this.f12846wypolnanlu == 1;
    }

    static class LazySpanLookup {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int[] f12848iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        List f12849zoijcleaow;

        LazySpanLookup() {
        }

        private void draadjrbmk(int i13, int i14) {
            List list = this.f12849zoijcleaow;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12849zoijcleaow.get(size);
                int i15 = fullSpanItem.f12853zdlpuopuiu;
                if (i15 >= i13) {
                    fullSpanItem.f12853zdlpuopuiu = i15 + i14;
                }
            }
        }

        private int dxjokdxxww(int i13) {
            if (this.f12849zoijcleaow == null) {
                return -1;
            }
            FullSpanItem fullSpanItemGxszxtbevo = gxszxtbevo(i13);
            if (fullSpanItemGxszxtbevo != null) {
                this.f12849zoijcleaow.remove(fullSpanItemGxszxtbevo);
            }
            int size = this.f12849zoijcleaow.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    i14 = -1;
                    break;
                }
                if (((FullSpanItem) this.f12849zoijcleaow.get(i14)).f12853zdlpuopuiu >= i13) {
                    break;
                }
                i14++;
            }
            if (i14 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f12849zoijcleaow.get(i14);
            this.f12849zoijcleaow.remove(i14);
            return fullSpanItem.f12853zdlpuopuiu;
        }

        private void wflxmlrfwp(int i13, int i14) {
            List list = this.f12849zoijcleaow;
            if (list == null) {
                return;
            }
            int i15 = i13 + i14;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12849zoijcleaow.get(size);
                int i16 = fullSpanItem.f12853zdlpuopuiu;
                if (i16 >= i13) {
                    if (i16 < i15) {
                        this.f12849zoijcleaow.remove(size);
                    } else {
                        fullSpanItem.f12853zdlpuopuiu = i16 - i14;
                    }
                }
            }
        }

        void agtfadlqog(int i13, wkgbmnqykc wkgbmnqykcVar) {
            ppxfxbqfkf(i13);
            this.f12848iobyxmoadg[i13] = wkgbmnqykcVar.f12867eablkybsjg;
        }

        void btonecajqb(int i13, int i14) {
            int[] iArr = this.f12848iobyxmoadg;
            if (iArr == null || i13 >= iArr.length) {
                return;
            }
            int i15 = i13 + i14;
            ppxfxbqfkf(i15);
            int[] iArr2 = this.f12848iobyxmoadg;
            System.arraycopy(iArr2, i13, iArr2, i15, (iArr2.length - i13) - i14);
            Arrays.fill(this.f12848iobyxmoadg, i13, i15, -1);
            draadjrbmk(i13, i14);
        }

        public FullSpanItem eablkybsjg(int i13, int i14, int i15, boolean z13) {
            List list = this.f12849zoijcleaow;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12849zoijcleaow.get(i16);
                int i17 = fullSpanItem.f12853zdlpuopuiu;
                if (i17 >= i14) {
                    return null;
                }
                if (i17 >= i13 && (i15 == 0 || fullSpanItem.f12852yggfygwlhe == i15 || (z13 && fullSpanItem.f12850iwizpuwonk))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        void gtknphoqwx(int i13, int i14) {
            int[] iArr = this.f12848iobyxmoadg;
            if (iArr == null || i13 >= iArr.length) {
                return;
            }
            int i15 = i13 + i14;
            ppxfxbqfkf(i15);
            int[] iArr2 = this.f12848iobyxmoadg;
            System.arraycopy(iArr2, i15, iArr2, i13, (iArr2.length - i13) - i14);
            int[] iArr3 = this.f12848iobyxmoadg;
            Arrays.fill(iArr3, iArr3.length - i14, iArr3.length, -1);
            wflxmlrfwp(i13, i14);
        }

        public FullSpanItem gxszxtbevo(int i13) {
            List list = this.f12849zoijcleaow;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12849zoijcleaow.get(size);
                if (fullSpanItem.f12853zdlpuopuiu == i13) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public void iobyxmoadg(FullSpanItem fullSpanItem) {
            if (this.f12849zoijcleaow == null) {
                this.f12849zoijcleaow = new ArrayList();
            }
            int size = this.f12849zoijcleaow.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f12849zoijcleaow.get(i13);
                if (fullSpanItem2.f12853zdlpuopuiu == fullSpanItem.f12853zdlpuopuiu) {
                    this.f12849zoijcleaow.remove(i13);
                }
                if (fullSpanItem2.f12853zdlpuopuiu >= fullSpanItem.f12853zdlpuopuiu) {
                    this.f12849zoijcleaow.add(i13, fullSpanItem);
                    return;
                }
            }
            this.f12849zoijcleaow.add(fullSpanItem);
        }

        int lqeggnwhkg(int i13) {
            int[] iArr = this.f12848iobyxmoadg;
            if (iArr == null || i13 >= iArr.length) {
                return -1;
            }
            return iArr[i13];
        }

        int nufgyqmvbu(int i13) {
            int[] iArr = this.f12848iobyxmoadg;
            if (iArr == null || i13 >= iArr.length) {
                return -1;
            }
            int iDxjokdxxww = dxjokdxxww(i13);
            if (iDxjokdxxww == -1) {
                int[] iArr2 = this.f12848iobyxmoadg;
                Arrays.fill(iArr2, i13, iArr2.length, -1);
                return this.f12848iobyxmoadg.length;
            }
            int iMin = Math.min(iDxjokdxxww + 1, this.f12848iobyxmoadg.length);
            Arrays.fill(this.f12848iobyxmoadg, i13, iMin, -1);
            return iMin;
        }

        int ojitshcjhn(int i13) {
            int length = this.f12848iobyxmoadg.length;
            while (length <= i13) {
                length *= 2;
            }
            return length;
        }

        void ppxfxbqfkf(int i13) {
            int[] iArr = this.f12848iobyxmoadg;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i13, 10) + 1];
                this.f12848iobyxmoadg = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[ojitshcjhn(i13)];
                this.f12848iobyxmoadg = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f12848iobyxmoadg;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int wkgbmnqykc(int i13) {
            List list = this.f12849zoijcleaow;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f12849zoijcleaow.get(size)).f12853zdlpuopuiu >= i13) {
                        this.f12849zoijcleaow.remove(size);
                    }
                }
            }
            return nufgyqmvbu(i13);
        }

        void zoijcleaow() {
            int[] iArr = this.f12848iobyxmoadg;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f12849zoijcleaow = null;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            boolean f12850iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int[] f12851jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f12852yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f12853zdlpuopuiu;

            class iobyxmoadg implements Parcelable.Creator {
                iobyxmoadg() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i13) {
                    return new FullSpanItem[i13];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f12853zdlpuopuiu = parcel.readInt();
                this.f12852yggfygwlhe = parcel.readInt();
                this.f12850iwizpuwonk = parcel.readInt() == 1;
                int i13 = parcel.readInt();
                if (i13 > 0) {
                    int[] iArr = new int[i13];
                    this.f12851jyumaefscl = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f12853zdlpuopuiu + ", mGapDir=" + this.f12852yggfygwlhe + ", mHasUnwantedGapAfter=" + this.f12850iwizpuwonk + ", mGapPerSpan=" + Arrays.toString(this.f12851jyumaefscl) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i13) {
                parcel.writeInt(this.f12853zdlpuopuiu);
                parcel.writeInt(this.f12852yggfygwlhe);
                parcel.writeInt(this.f12850iwizpuwonk ? 1 : 0);
                int[] iArr = this.f12851jyumaefscl;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f12851jyumaefscl);
                }
            }

            int zoijcleaow(int i13) {
                int[] iArr = this.f12851jyumaefscl;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i13];
            }

            FullSpanItem() {
            }
        }
    }
}
