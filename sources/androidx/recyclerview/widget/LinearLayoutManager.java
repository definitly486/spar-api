package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.rgvfuqvkyq implements draadjrbmk.dxjokdxxww, RecyclerView.pmvmpeiblj.zoijcleaow {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    yggfygwlhe f12596cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    final iobyxmoadg f12597crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f12598dsvhmnatus;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private ppxfxbqfkf f12599hkdspvbjdz;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final zoijcleaow f12600jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    int f12601jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f12602kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    int f12603mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    int f12604ntlheqmsrt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private int f12605ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    SavedState f12606sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    boolean f12607stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f12608tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f12609ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private int[] f12610vipkmwdibw;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f12611wypolnanlu;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f12612jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f12613yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f12614zdlpuopuiu;

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
            this.f12614zdlpuopuiu = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f12614zdlpuopuiu);
            parcel.writeInt(this.f12613yggfygwlhe);
            parcel.writeInt(this.f12612jyumaefscl ? 1 : 0);
        }

        boolean zoijcleaow() {
            return this.f12614zdlpuopuiu >= 0;
        }

        SavedState(Parcel parcel) {
            this.f12614zdlpuopuiu = parcel.readInt();
            this.f12613yggfygwlhe = parcel.readInt();
            this.f12612jyumaefscl = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f12614zdlpuopuiu = savedState.f12614zdlpuopuiu;
            this.f12613yggfygwlhe = savedState.f12613yggfygwlhe;
            this.f12612jyumaefscl = savedState.f12612jyumaefscl;
        }
    }

    static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        boolean f12615eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        yggfygwlhe f12616iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f12617ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f12618wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f12619zoijcleaow;

        iobyxmoadg() {
            eablkybsjg();
        }

        void eablkybsjg() {
            this.f12619zoijcleaow = -1;
            this.f12617ppxfxbqfkf = Integer.MIN_VALUE;
            this.f12618wkgbmnqykc = false;
            this.f12615eablkybsjg = false;
        }

        void iobyxmoadg() {
            this.f12617ppxfxbqfkf = this.f12618wkgbmnqykc ? this.f12616iobyxmoadg.dxjokdxxww() : this.f12616iobyxmoadg.agtfadlqog();
        }

        public void ppxfxbqfkf(View view, int i13) {
            int iRgvfuqvkyq = this.f12616iobyxmoadg.rgvfuqvkyq();
            if (iRgvfuqvkyq >= 0) {
                zoijcleaow(view, i13);
                return;
            }
            this.f12619zoijcleaow = i13;
            if (this.f12618wkgbmnqykc) {
                int iDxjokdxxww = (this.f12616iobyxmoadg.dxjokdxxww() - iRgvfuqvkyq) - this.f12616iobyxmoadg.wkgbmnqykc(view);
                this.f12617ppxfxbqfkf = this.f12616iobyxmoadg.dxjokdxxww() - iDxjokdxxww;
                if (iDxjokdxxww > 0) {
                    int iEablkybsjg = this.f12617ppxfxbqfkf - this.f12616iobyxmoadg.eablkybsjg(view);
                    int iAgtfadlqog = this.f12616iobyxmoadg.agtfadlqog();
                    int iMin = iEablkybsjg - (iAgtfadlqog + Math.min(this.f12616iobyxmoadg.lqeggnwhkg(view) - iAgtfadlqog, 0));
                    if (iMin < 0) {
                        this.f12617ppxfxbqfkf += Math.min(iDxjokdxxww, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iLqeggnwhkg = this.f12616iobyxmoadg.lqeggnwhkg(view);
            int iAgtfadlqog2 = iLqeggnwhkg - this.f12616iobyxmoadg.agtfadlqog();
            this.f12617ppxfxbqfkf = iLqeggnwhkg;
            if (iAgtfadlqog2 > 0) {
                int iDxjokdxxww2 = (this.f12616iobyxmoadg.dxjokdxxww() - Math.min(0, (this.f12616iobyxmoadg.dxjokdxxww() - iRgvfuqvkyq) - this.f12616iobyxmoadg.wkgbmnqykc(view))) - (iLqeggnwhkg + this.f12616iobyxmoadg.eablkybsjg(view));
                if (iDxjokdxxww2 < 0) {
                    this.f12617ppxfxbqfkf -= Math.min(iAgtfadlqog2, -iDxjokdxxww2);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f12619zoijcleaow + ", mCoordinate=" + this.f12617ppxfxbqfkf + ", mLayoutFromEnd=" + this.f12618wkgbmnqykc + ", mValid=" + this.f12615eablkybsjg + '}';
        }

        boolean wkgbmnqykc(View view, RecyclerView.zynmafqrjb zynmafqrjbVar) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return !vdvldrhtssVar.eablkybsjg() && vdvldrhtssVar.zoijcleaow() >= 0 && vdvldrhtssVar.zoijcleaow() < zynmafqrjbVar.zoijcleaow();
        }

        public void zoijcleaow(View view, int i13) {
            if (this.f12618wkgbmnqykc) {
                this.f12617ppxfxbqfkf = this.f12616iobyxmoadg.wkgbmnqykc(view) + this.f12616iobyxmoadg.rgvfuqvkyq();
            } else {
                this.f12617ppxfxbqfkf = this.f12616iobyxmoadg.lqeggnwhkg(view);
            }
            this.f12619zoijcleaow = i13;
        }
    }

    static class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f12623eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        int f12624gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f12625gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f12627lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f12629ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        boolean f12630wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f12631wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f12632zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f12626iobyxmoadg = true;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        int f12628nufgyqmvbu = 0;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        int f12622dxjokdxxww = 0;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        boolean f12620btonecajqb = false;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        List f12621draadjrbmk = null;

        ppxfxbqfkf() {
        }

        private View eablkybsjg() {
            int size = this.f12621draadjrbmk.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((RecyclerView.iozdgvuglv) this.f12621draadjrbmk.get(i13)).itemView;
                RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
                if (!vdvldrhtssVar.eablkybsjg() && this.f12631wkgbmnqykc == vdvldrhtssVar.zoijcleaow()) {
                    zoijcleaow(view);
                    return view;
                }
            }
            return null;
        }

        public View gxszxtbevo(View view) {
            int iZoijcleaow;
            int size = this.f12621draadjrbmk.size();
            View view2 = null;
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < size; i14++) {
                View view3 = ((RecyclerView.iozdgvuglv) this.f12621draadjrbmk.get(i14)).itemView;
                RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view3.getLayoutParams();
                if (view3 != view && !vdvldrhtssVar.eablkybsjg() && (iZoijcleaow = (vdvldrhtssVar.zoijcleaow() - this.f12631wkgbmnqykc) * this.f12623eablkybsjg) >= 0 && iZoijcleaow < i13) {
                    view2 = view3;
                    if (iZoijcleaow == 0) {
                        break;
                    }
                    i13 = iZoijcleaow;
                }
            }
            return view2;
        }

        public void iobyxmoadg() {
            zoijcleaow(null);
        }

        boolean ppxfxbqfkf(RecyclerView.zynmafqrjb zynmafqrjbVar) {
            int i13 = this.f12631wkgbmnqykc;
            return i13 >= 0 && i13 < zynmafqrjbVar.zoijcleaow();
        }

        View wkgbmnqykc(RecyclerView.iwizpuwonk iwizpuwonkVar) {
            if (this.f12621draadjrbmk != null) {
                return eablkybsjg();
            }
            View viewOjitshcjhn = iwizpuwonkVar.ojitshcjhn(this.f12631wkgbmnqykc);
            this.f12631wkgbmnqykc += this.f12623eablkybsjg;
            return viewOjitshcjhn;
        }

        public void zoijcleaow(View view) {
            View viewGxszxtbevo = gxszxtbevo(view);
            if (viewGxszxtbevo == null) {
                this.f12631wkgbmnqykc = -1;
            } else {
                this.f12631wkgbmnqykc = ((RecyclerView.vdvldrhtss) viewGxszxtbevo.getLayoutParams()).zoijcleaow();
            }
        }
    }

    protected static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f12633iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public boolean f12634ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public boolean f12635wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public boolean f12636zoijcleaow;

        protected zoijcleaow() {
        }

        void iobyxmoadg() {
            this.f12633iobyxmoadg = 0;
            this.f12636zoijcleaow = false;
            this.f12634ppxfxbqfkf = false;
            this.f12635wkgbmnqykc = false;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int B0(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int iDxjokdxxww;
        int iDxjokdxxww2 = this.f12596cllcsxoeiz.dxjokdxxww() - i13;
        if (iDxjokdxxww2 <= 0) {
            return 0;
        }
        int i14 = -T0(-iDxjokdxxww2, iwizpuwonkVar, zynmafqrjbVar);
        int i15 = i13 + i14;
        if (!z13 || (iDxjokdxxww = this.f12596cllcsxoeiz.dxjokdxxww() - i15) <= 0) {
            return i14;
        }
        this.f12596cllcsxoeiz.kcexrzcfyt(iDxjokdxxww);
        return iDxjokdxxww + i14;
    }

    private int C0(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int iAgtfadlqog;
        int iAgtfadlqog2 = i13 - this.f12596cllcsxoeiz.agtfadlqog();
        if (iAgtfadlqog2 <= 0) {
            return 0;
        }
        int i14 = -T0(iAgtfadlqog2, iwizpuwonkVar, zynmafqrjbVar);
        int i15 = i13 + i14;
        if (!z13 || (iAgtfadlqog = i15 - this.f12596cllcsxoeiz.agtfadlqog()) <= 0) {
            return i14;
        }
        this.f12596cllcsxoeiz.kcexrzcfyt(-iAgtfadlqog);
        return i14 - iAgtfadlqog;
    }

    private View D0() {
        return ribwqtqdhb(this.f12607stevsuqkhv ? 0 : vipkmwdibw() - 1);
    }

    private View E0() {
        return ribwqtqdhb(this.f12607stevsuqkhv ? vipkmwdibw() - 1 : 0);
    }

    private void L0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13, int i14) {
        if (!zynmafqrjbVar.lqeggnwhkg() || vipkmwdibw() == 0 || zynmafqrjbVar.eablkybsjg() || !e0()) {
            return;
        }
        List listGtknphoqwx = iwizpuwonkVar.gtknphoqwx();
        int size = listGtknphoqwx.size();
        int iLrnfpwlwnk = lrnfpwlwnk(ribwqtqdhb(0));
        int iEablkybsjg = 0;
        int iEablkybsjg2 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            RecyclerView.iozdgvuglv iozdgvuglvVar = (RecyclerView.iozdgvuglv) listGtknphoqwx.get(i15);
            if (!iozdgvuglvVar.isRemoved()) {
                if ((iozdgvuglvVar.getLayoutPosition() < iLrnfpwlwnk) != this.f12607stevsuqkhv) {
                    iEablkybsjg += this.f12596cllcsxoeiz.eablkybsjg(iozdgvuglvVar.itemView);
                } else {
                    iEablkybsjg2 += this.f12596cllcsxoeiz.eablkybsjg(iozdgvuglvVar.itemView);
                }
            }
        }
        this.f12599hkdspvbjdz.f12621draadjrbmk = listGtknphoqwx;
        if (iEablkybsjg > 0) {
            e1(lrnfpwlwnk(E0()), i13);
            ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar.f12628nufgyqmvbu = iEablkybsjg;
            ppxfxbqfkfVar.f12629ppxfxbqfkf = 0;
            ppxfxbqfkfVar.iobyxmoadg();
            n0(iwizpuwonkVar, this.f12599hkdspvbjdz, zynmafqrjbVar, false);
        }
        if (iEablkybsjg2 > 0) {
            c1(lrnfpwlwnk(D0()), i14);
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar2.f12628nufgyqmvbu = iEablkybsjg2;
            ppxfxbqfkfVar2.f12629ppxfxbqfkf = 0;
            ppxfxbqfkfVar2.iobyxmoadg();
            n0(iwizpuwonkVar, this.f12599hkdspvbjdz, zynmafqrjbVar, false);
        }
        this.f12599hkdspvbjdz.f12621draadjrbmk = null;
    }

    private void N0(RecyclerView.iwizpuwonk iwizpuwonkVar, ppxfxbqfkf ppxfxbqfkfVar) {
        if (!ppxfxbqfkfVar.f12626iobyxmoadg || ppxfxbqfkfVar.f12630wflxmlrfwp) {
            return;
        }
        int i13 = ppxfxbqfkfVar.f12627lqeggnwhkg;
        int i14 = ppxfxbqfkfVar.f12622dxjokdxxww;
        if (ppxfxbqfkfVar.f12625gxszxtbevo == -1) {
            P0(iwizpuwonkVar, i13, i14);
        } else {
            Q0(iwizpuwonkVar, i13, i14);
        }
    }

    private void O0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        if (i14 <= i13) {
            while (i13 > i14) {
                G(i13, iwizpuwonkVar);
                i13--;
            }
        } else {
            for (int i15 = i14 - 1; i15 >= i13; i15--) {
                G(i15, iwizpuwonkVar);
            }
        }
    }

    private void P0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13, int i14) {
        int iVipkmwdibw = vipkmwdibw();
        if (i13 < 0) {
            return;
        }
        int iNufgyqmvbu = (this.f12596cllcsxoeiz.nufgyqmvbu() - i13) + i14;
        if (this.f12607stevsuqkhv) {
            for (int i15 = 0; i15 < iVipkmwdibw; i15++) {
                View viewRibwqtqdhb = ribwqtqdhb(i15);
                if (this.f12596cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb) < iNufgyqmvbu || this.f12596cllcsxoeiz.oxmwwwfdhm(viewRibwqtqdhb) < iNufgyqmvbu) {
                    O0(iwizpuwonkVar, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = iVipkmwdibw - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View viewRibwqtqdhb2 = ribwqtqdhb(i17);
            if (this.f12596cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb2) < iNufgyqmvbu || this.f12596cllcsxoeiz.oxmwwwfdhm(viewRibwqtqdhb2) < iNufgyqmvbu) {
                O0(iwizpuwonkVar, i16, i17);
                return;
            }
        }
    }

    private void Q0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13, int i14) {
        if (i13 < 0) {
            return;
        }
        int i15 = i13 - i14;
        int iVipkmwdibw = vipkmwdibw();
        if (!this.f12607stevsuqkhv) {
            for (int i16 = 0; i16 < iVipkmwdibw; i16++) {
                View viewRibwqtqdhb = ribwqtqdhb(i16);
                if (this.f12596cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb) > i15 || this.f12596cllcsxoeiz.vdvldrhtss(viewRibwqtqdhb) > i15) {
                    O0(iwizpuwonkVar, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iVipkmwdibw - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewRibwqtqdhb2 = ribwqtqdhb(i18);
            if (this.f12596cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb2) > i15 || this.f12596cllcsxoeiz.vdvldrhtss(viewRibwqtqdhb2) > i15) {
                O0(iwizpuwonkVar, i17, i18);
                return;
            }
        }
    }

    private void S0() {
        if (this.f12601jpowsppfya == 1 || !I0()) {
            this.f12607stevsuqkhv = this.f12611wypolnanlu;
        } else {
            this.f12607stevsuqkhv = !this.f12611wypolnanlu;
        }
    }

    private boolean Y0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, iobyxmoadg iobyxmoadgVar) {
        View viewA0;
        boolean z13 = false;
        if (vipkmwdibw() == 0) {
            return false;
        }
        View viewSflfametgt = sflfametgt();
        if (viewSflfametgt != null && iobyxmoadgVar.wkgbmnqykc(viewSflfametgt, zynmafqrjbVar)) {
            iobyxmoadgVar.ppxfxbqfkf(viewSflfametgt, lrnfpwlwnk(viewSflfametgt));
            return true;
        }
        boolean z14 = this.f12598dsvhmnatus;
        boolean z15 = this.f12602kegysxyocb;
        if (z14 != z15 || (viewA0 = A0(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar.f12618wkgbmnqykc, z15)) == null) {
            return false;
        }
        iobyxmoadgVar.zoijcleaow(viewA0, lrnfpwlwnk(viewA0));
        if (!zynmafqrjbVar.eablkybsjg() && e0()) {
            int iLqeggnwhkg = this.f12596cllcsxoeiz.lqeggnwhkg(viewA0);
            int iWkgbmnqykc = this.f12596cllcsxoeiz.wkgbmnqykc(viewA0);
            int iAgtfadlqog = this.f12596cllcsxoeiz.agtfadlqog();
            int iDxjokdxxww = this.f12596cllcsxoeiz.dxjokdxxww();
            boolean z16 = iWkgbmnqykc <= iAgtfadlqog && iLqeggnwhkg < iAgtfadlqog;
            if (iLqeggnwhkg >= iDxjokdxxww && iWkgbmnqykc > iDxjokdxxww) {
                z13 = true;
            }
            if (z16 || z13) {
                if (iobyxmoadgVar.f12618wkgbmnqykc) {
                    iAgtfadlqog = iDxjokdxxww;
                }
                iobyxmoadgVar.f12617ppxfxbqfkf = iAgtfadlqog;
            }
        }
        return true;
    }

    private boolean Z0(RecyclerView.zynmafqrjb zynmafqrjbVar, iobyxmoadg iobyxmoadgVar) {
        int i13;
        if (!zynmafqrjbVar.eablkybsjg() && (i13 = this.f12603mbcevpiqjq) != -1) {
            if (i13 >= 0 && i13 < zynmafqrjbVar.zoijcleaow()) {
                iobyxmoadgVar.f12619zoijcleaow = this.f12603mbcevpiqjq;
                SavedState savedState = this.f12606sopmlzcsov;
                if (savedState != null && savedState.zoijcleaow()) {
                    boolean z13 = this.f12606sopmlzcsov.f12612jyumaefscl;
                    iobyxmoadgVar.f12618wkgbmnqykc = z13;
                    if (z13) {
                        iobyxmoadgVar.f12617ppxfxbqfkf = this.f12596cllcsxoeiz.dxjokdxxww() - this.f12606sopmlzcsov.f12613yggfygwlhe;
                    } else {
                        iobyxmoadgVar.f12617ppxfxbqfkf = this.f12596cllcsxoeiz.agtfadlqog() + this.f12606sopmlzcsov.f12613yggfygwlhe;
                    }
                    return true;
                }
                if (this.f12604ntlheqmsrt != Integer.MIN_VALUE) {
                    boolean z14 = this.f12607stevsuqkhv;
                    iobyxmoadgVar.f12618wkgbmnqykc = z14;
                    if (z14) {
                        iobyxmoadgVar.f12617ppxfxbqfkf = this.f12596cllcsxoeiz.dxjokdxxww() - this.f12604ntlheqmsrt;
                    } else {
                        iobyxmoadgVar.f12617ppxfxbqfkf = this.f12596cllcsxoeiz.agtfadlqog() + this.f12604ntlheqmsrt;
                    }
                    return true;
                }
                View viewMbcevpiqjq = mbcevpiqjq(this.f12603mbcevpiqjq);
                if (viewMbcevpiqjq == null) {
                    if (vipkmwdibw() > 0) {
                        iobyxmoadgVar.f12618wkgbmnqykc = (this.f12603mbcevpiqjq < lrnfpwlwnk(ribwqtqdhb(0))) == this.f12607stevsuqkhv;
                    }
                    iobyxmoadgVar.iobyxmoadg();
                } else {
                    if (this.f12596cllcsxoeiz.eablkybsjg(viewMbcevpiqjq) > this.f12596cllcsxoeiz.ojitshcjhn()) {
                        iobyxmoadgVar.iobyxmoadg();
                        return true;
                    }
                    if (this.f12596cllcsxoeiz.lqeggnwhkg(viewMbcevpiqjq) - this.f12596cllcsxoeiz.agtfadlqog() < 0) {
                        iobyxmoadgVar.f12617ppxfxbqfkf = this.f12596cllcsxoeiz.agtfadlqog();
                        iobyxmoadgVar.f12618wkgbmnqykc = false;
                        return true;
                    }
                    if (this.f12596cllcsxoeiz.dxjokdxxww() - this.f12596cllcsxoeiz.wkgbmnqykc(viewMbcevpiqjq) < 0) {
                        iobyxmoadgVar.f12617ppxfxbqfkf = this.f12596cllcsxoeiz.dxjokdxxww();
                        iobyxmoadgVar.f12618wkgbmnqykc = true;
                        return true;
                    }
                    iobyxmoadgVar.f12617ppxfxbqfkf = iobyxmoadgVar.f12618wkgbmnqykc ? this.f12596cllcsxoeiz.wkgbmnqykc(viewMbcevpiqjq) + this.f12596cllcsxoeiz.rgvfuqvkyq() : this.f12596cllcsxoeiz.lqeggnwhkg(viewMbcevpiqjq);
                }
                return true;
            }
            this.f12603mbcevpiqjq = -1;
            this.f12604ntlheqmsrt = Integer.MIN_VALUE;
        }
        return false;
    }

    private void a1(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, iobyxmoadg iobyxmoadgVar) {
        if (Z0(zynmafqrjbVar, iobyxmoadgVar) || Y0(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar)) {
            return;
        }
        iobyxmoadgVar.iobyxmoadg();
        iobyxmoadgVar.f12619zoijcleaow = this.f12602kegysxyocb ? zynmafqrjbVar.zoijcleaow() - 1 : 0;
    }

    private void b1(int i13, int i14, boolean z13, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int iAgtfadlqog;
        this.f12599hkdspvbjdz.f12630wflxmlrfwp = R0();
        this.f12599hkdspvbjdz.f12625gxszxtbevo = i13;
        int[] iArr = this.f12610vipkmwdibw;
        iArr[0] = 0;
        iArr[1] = 0;
        f0(zynmafqrjbVar, iArr);
        int iMax = Math.max(0, this.f12610vipkmwdibw[0]);
        int iMax2 = Math.max(0, this.f12610vipkmwdibw[1]);
        boolean z14 = i13 == 1;
        ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
        int i15 = z14 ? iMax2 : iMax;
        ppxfxbqfkfVar.f12628nufgyqmvbu = i15;
        if (!z14) {
            iMax = iMax2;
        }
        ppxfxbqfkfVar.f12622dxjokdxxww = iMax;
        if (z14) {
            ppxfxbqfkfVar.f12628nufgyqmvbu = i15 + this.f12596cllcsxoeiz.btonecajqb();
            View viewD0 = D0();
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar2.f12623eablkybsjg = this.f12607stevsuqkhv ? -1 : 1;
            int iLrnfpwlwnk = lrnfpwlwnk(viewD0);
            ppxfxbqfkf ppxfxbqfkfVar3 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar2.f12631wkgbmnqykc = iLrnfpwlwnk + ppxfxbqfkfVar3.f12623eablkybsjg;
            ppxfxbqfkfVar3.f12632zoijcleaow = this.f12596cllcsxoeiz.wkgbmnqykc(viewD0);
            iAgtfadlqog = this.f12596cllcsxoeiz.wkgbmnqykc(viewD0) - this.f12596cllcsxoeiz.dxjokdxxww();
        } else {
            View viewE0 = E0();
            this.f12599hkdspvbjdz.f12628nufgyqmvbu += this.f12596cllcsxoeiz.agtfadlqog();
            ppxfxbqfkf ppxfxbqfkfVar4 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar4.f12623eablkybsjg = this.f12607stevsuqkhv ? 1 : -1;
            int iLrnfpwlwnk2 = lrnfpwlwnk(viewE0);
            ppxfxbqfkf ppxfxbqfkfVar5 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar4.f12631wkgbmnqykc = iLrnfpwlwnk2 + ppxfxbqfkfVar5.f12623eablkybsjg;
            ppxfxbqfkfVar5.f12632zoijcleaow = this.f12596cllcsxoeiz.lqeggnwhkg(viewE0);
            iAgtfadlqog = (-this.f12596cllcsxoeiz.lqeggnwhkg(viewE0)) + this.f12596cllcsxoeiz.agtfadlqog();
        }
        ppxfxbqfkf ppxfxbqfkfVar6 = this.f12599hkdspvbjdz;
        ppxfxbqfkfVar6.f12629ppxfxbqfkf = i14;
        if (z13) {
            ppxfxbqfkfVar6.f12629ppxfxbqfkf = i14 - iAgtfadlqog;
        }
        ppxfxbqfkfVar6.f12627lqeggnwhkg = iAgtfadlqog;
    }

    private void c1(int i13, int i14) {
        this.f12599hkdspvbjdz.f12629ppxfxbqfkf = this.f12596cllcsxoeiz.dxjokdxxww() - i14;
        ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
        ppxfxbqfkfVar.f12623eablkybsjg = this.f12607stevsuqkhv ? -1 : 1;
        ppxfxbqfkfVar.f12631wkgbmnqykc = i13;
        ppxfxbqfkfVar.f12625gxszxtbevo = 1;
        ppxfxbqfkfVar.f12632zoijcleaow = i14;
        ppxfxbqfkfVar.f12627lqeggnwhkg = Integer.MIN_VALUE;
    }

    private void d1(iobyxmoadg iobyxmoadgVar) {
        c1(iobyxmoadgVar.f12619zoijcleaow, iobyxmoadgVar.f12617ppxfxbqfkf);
    }

    private void e1(int i13, int i14) {
        this.f12599hkdspvbjdz.f12629ppxfxbqfkf = i14 - this.f12596cllcsxoeiz.agtfadlqog();
        ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
        ppxfxbqfkfVar.f12631wkgbmnqykc = i13;
        ppxfxbqfkfVar.f12623eablkybsjg = this.f12607stevsuqkhv ? 1 : -1;
        ppxfxbqfkfVar.f12625gxszxtbevo = -1;
        ppxfxbqfkfVar.f12632zoijcleaow = i14;
        ppxfxbqfkfVar.f12627lqeggnwhkg = Integer.MIN_VALUE;
    }

    private void f1(iobyxmoadg iobyxmoadgVar) {
        e1(iobyxmoadgVar.f12619zoijcleaow, iobyxmoadgVar.f12617ppxfxbqfkf);
    }

    private int h0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        m0();
        return cqumvgiudr.iobyxmoadg(zynmafqrjbVar, this.f12596cllcsxoeiz, r0(!this.f12608tzroggbefp, true), q0(!this.f12608tzroggbefp, true), this, this.f12608tzroggbefp);
    }

    private int i0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        m0();
        return cqumvgiudr.zoijcleaow(zynmafqrjbVar, this.f12596cllcsxoeiz, r0(!this.f12608tzroggbefp, true), q0(!this.f12608tzroggbefp, true), this, this.f12608tzroggbefp, this.f12607stevsuqkhv);
    }

    private int j0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        m0();
        return cqumvgiudr.ppxfxbqfkf(zynmafqrjbVar, this.f12596cllcsxoeiz, r0(!this.f12608tzroggbefp, true), q0(!this.f12608tzroggbefp, true), this, this.f12608tzroggbefp);
    }

    private View p0() {
        return w0(0, vipkmwdibw());
    }

    private View u0() {
        return w0(vipkmwdibw() - 1, -1);
    }

    private View y0() {
        return this.f12607stevsuqkhv ? p0() : u0();
    }

    private View z0() {
        return this.f12607stevsuqkhv ? u0() : p0();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View A0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13, boolean z14) {
        int i13;
        int iVipkmwdibw;
        int i14;
        m0();
        int iVipkmwdibw2 = vipkmwdibw();
        if (z14) {
            iVipkmwdibw = vipkmwdibw() - 1;
            i13 = -1;
            i14 = -1;
        } else {
            i13 = iVipkmwdibw2;
            iVipkmwdibw = 0;
            i14 = 1;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        int iAgtfadlqog = this.f12596cllcsxoeiz.agtfadlqog();
        int iDxjokdxxww = this.f12596cllcsxoeiz.dxjokdxxww();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iVipkmwdibw != i13) {
            View viewRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            int iLrnfpwlwnk = lrnfpwlwnk(viewRibwqtqdhb);
            int iLqeggnwhkg = this.f12596cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb);
            int iWkgbmnqykc = this.f12596cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb);
            if (iLrnfpwlwnk >= 0 && iLrnfpwlwnk < iZoijcleaow) {
                if (!((RecyclerView.vdvldrhtss) viewRibwqtqdhb.getLayoutParams()).eablkybsjg()) {
                    boolean z15 = iWkgbmnqykc <= iAgtfadlqog && iLqeggnwhkg < iAgtfadlqog;
                    boolean z16 = iLqeggnwhkg >= iDxjokdxxww && iWkgbmnqykc > iDxjokdxxww;
                    if (!z15 && !z16) {
                        return viewRibwqtqdhb;
                    }
                    if (z13) {
                        if (z16) {
                            view2 = viewRibwqtqdhb;
                        } else if (view == null) {
                            view = viewRibwqtqdhb;
                        }
                    } else if (z15) {
                        view2 = viewRibwqtqdhb;
                    } else if (view == null) {
                        view = viewRibwqtqdhb;
                    }
                } else if (view3 == null) {
                    view3 = viewRibwqtqdhb;
                }
            }
            iVipkmwdibw += i14;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    protected int F0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (zynmafqrjbVar.wkgbmnqykc()) {
            return this.f12596cllcsxoeiz.ojitshcjhn();
        }
        return 0;
    }

    public int G0() {
        return this.f12601jpowsppfya;
    }

    public boolean H0() {
        return this.f12611wypolnanlu;
    }

    protected boolean I0() {
        return bfopjjpdmp() == 1;
    }

    public boolean J0() {
        return this.f12608tzroggbefp;
    }

    void K0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar) {
        int i13;
        int i14;
        int i15;
        int paddingLeft;
        int iGxszxtbevo;
        View viewWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc(iwizpuwonkVar);
        if (viewWkgbmnqykc == null) {
            zoijcleaowVar.f12636zoijcleaow = true;
            return;
        }
        RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) viewWkgbmnqykc.getLayoutParams();
        if (ppxfxbqfkfVar.f12621draadjrbmk == null) {
            if (this.f12607stevsuqkhv == (ppxfxbqfkfVar.f12625gxszxtbevo == -1)) {
                zdlpuopuiu(viewWkgbmnqykc);
            } else {
                yggfygwlhe(viewWkgbmnqykc, 0);
            }
        } else {
            if (this.f12607stevsuqkhv == (ppxfxbqfkfVar.f12625gxszxtbevo == -1)) {
                oxmwwwfdhm(viewWkgbmnqykc);
            } else {
                kcexrzcfyt(viewWkgbmnqykc, 0);
            }
        }
        ixidwrxhsl(viewWkgbmnqykc, 0, 0);
        zoijcleaowVar.f12633iobyxmoadg = this.f12596cllcsxoeiz.eablkybsjg(viewWkgbmnqykc);
        if (this.f12601jpowsppfya == 1) {
            if (I0()) {
                iGxszxtbevo = iwxlajgraz() - getPaddingRight();
                paddingLeft = iGxszxtbevo - this.f12596cllcsxoeiz.gxszxtbevo(viewWkgbmnqykc);
            } else {
                paddingLeft = getPaddingLeft();
                iGxszxtbevo = this.f12596cllcsxoeiz.gxszxtbevo(viewWkgbmnqykc) + paddingLeft;
            }
            if (ppxfxbqfkfVar.f12625gxszxtbevo == -1) {
                int i16 = ppxfxbqfkfVar.f12632zoijcleaow;
                i15 = i16;
                i14 = iGxszxtbevo;
                i13 = i16 - zoijcleaowVar.f12633iobyxmoadg;
            } else {
                int i17 = ppxfxbqfkfVar.f12632zoijcleaow;
                i13 = i17;
                i14 = iGxszxtbevo;
                i15 = zoijcleaowVar.f12633iobyxmoadg + i17;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iGxszxtbevo2 = this.f12596cllcsxoeiz.gxszxtbevo(viewWkgbmnqykc) + paddingTop;
            if (ppxfxbqfkfVar.f12625gxszxtbevo == -1) {
                int i18 = ppxfxbqfkfVar.f12632zoijcleaow;
                i14 = i18;
                i13 = paddingTop;
                i15 = iGxszxtbevo2;
                paddingLeft = i18 - zoijcleaowVar.f12633iobyxmoadg;
            } else {
                int i19 = ppxfxbqfkfVar.f12632zoijcleaow;
                i13 = paddingTop;
                i14 = zoijcleaowVar.f12633iobyxmoadg + i19;
                i15 = iGxszxtbevo2;
                paddingLeft = i19;
            }
        }
        mhtqkkgtqm(viewWkgbmnqykc, paddingLeft, i13, i14, i15);
        if (vdvldrhtssVar.eablkybsjg() || vdvldrhtssVar.ppxfxbqfkf()) {
            zoijcleaowVar.f12634ppxfxbqfkf = true;
        }
        zoijcleaowVar.f12635wkgbmnqykc = viewWkgbmnqykc.hasFocusable();
    }

    void M0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, iobyxmoadg iobyxmoadgVar, int i13) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (this.f12601jpowsppfya == 1) {
            return 0;
        }
        return T0(i13, iwizpuwonkVar, zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void Q(int i13) {
        this.f12603mbcevpiqjq = i13;
        this.f12604ntlheqmsrt = Integer.MIN_VALUE;
        SavedState savedState = this.f12606sopmlzcsov;
        if (savedState != null) {
            savedState.ppxfxbqfkf();
        }
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int R(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (this.f12601jpowsppfya == 0) {
            return 0;
        }
        return T0(i13, iwizpuwonkVar, zynmafqrjbVar);
    }

    boolean R0() {
        return this.f12596cllcsxoeiz.draadjrbmk() == 0 && this.f12596cllcsxoeiz.nufgyqmvbu() == 0;
    }

    int T0(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0 || i13 == 0) {
            return 0;
        }
        m0();
        this.f12599hkdspvbjdz.f12626iobyxmoadg = true;
        int i14 = i13 > 0 ? 1 : -1;
        int iAbs = Math.abs(i13);
        b1(i14, iAbs, true, zynmafqrjbVar);
        ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
        int iN0 = ppxfxbqfkfVar.f12627lqeggnwhkg + n0(iwizpuwonkVar, ppxfxbqfkfVar, zynmafqrjbVar, false);
        if (iN0 < 0) {
            return 0;
        }
        if (iAbs > iN0) {
            i13 = i14 * iN0;
        }
        this.f12596cllcsxoeiz.kcexrzcfyt(-i13);
        this.f12599hkdspvbjdz.f12624gtknphoqwx = i13;
        return i13;
    }

    public void U0(int i13, int i14) {
        this.f12603mbcevpiqjq = i13;
        this.f12604ntlheqmsrt = i14;
        SavedState savedState = this.f12606sopmlzcsov;
        if (savedState != null) {
            savedState.ppxfxbqfkf();
        }
        M();
    }

    public void V0(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i13);
        }
        iwizpuwonk(null);
        if (i13 != this.f12601jpowsppfya || this.f12596cllcsxoeiz == null) {
            yggfygwlhe yggfygwlheVarZoijcleaow = yggfygwlhe.zoijcleaow(this, i13);
            this.f12596cllcsxoeiz = yggfygwlheVarZoijcleaow;
            this.f12597crxdokpmqz.f12616iobyxmoadg = yggfygwlheVarZoijcleaow;
            this.f12601jpowsppfya = i13;
            M();
        }
    }

    public void W0(boolean z13) {
        iwizpuwonk(null);
        if (z13 == this.f12611wypolnanlu) {
            return;
        }
        this.f12611wypolnanlu = z13;
        M();
    }

    public void X0(boolean z13) {
        iwizpuwonk(null);
        if (this.f12602kegysxyocb == z13) {
            return;
        }
        this.f12602kegysxyocb = z13;
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    boolean Z() {
        return (oipsdeybqn() == 1073741824 || dvvnrvtcbc() == 1073741824 || !skhdrjzrfn()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void a(RecyclerView recyclerView, RecyclerView.iwizpuwonk iwizpuwonkVar) {
        super.a(recyclerView, iwizpuwonkVar);
        if (this.f12609ulzqkzuiru) {
            D(iwizpuwonkVar);
            iwizpuwonkVar.ppxfxbqfkf();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public View b(View view, int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int iK0;
        S0();
        if (vipkmwdibw() == 0 || (iK0 = k0(i13)) == Integer.MIN_VALUE) {
            return null;
        }
        m0();
        b1(iK0, (int) (this.f12596cllcsxoeiz.ojitshcjhn() * 0.33333334f), false, zynmafqrjbVar);
        ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
        ppxfxbqfkfVar.f12627lqeggnwhkg = Integer.MIN_VALUE;
        ppxfxbqfkfVar.f12626iobyxmoadg = false;
        n0(iwizpuwonkVar, ppxfxbqfkfVar, zynmafqrjbVar, true);
        View viewZ0 = iK0 == -1 ? z0() : y0();
        View viewE0 = iK0 == -1 ? E0() : D0();
        if (!viewE0.hasFocusable()) {
            return viewZ0;
        }
        if (viewZ0 == null) {
            return null;
        }
        return viewE0;
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
            accessibilityEvent.setFromIndex(s0());
            accessibilityEvent.setToIndex(v0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean e0() {
        return this.f12606sopmlzcsov == null && this.f12598dsvhmnatus == this.f12602kegysxyocb;
    }

    protected void f0(RecyclerView.zynmafqrjb zynmafqrjbVar, int[] iArr) {
        int i13;
        int iF0 = F0(zynmafqrjbVar);
        if (this.f12599hkdspvbjdz.f12625gxszxtbevo == -1) {
            i13 = 0;
        } else {
            i13 = iF0;
            iF0 = 0;
        }
        iArr[0] = iF0;
        iArr[1] = i13;
    }

    void g0(RecyclerView.zynmafqrjb zynmafqrjbVar, ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar2) {
        int i13 = ppxfxbqfkfVar.f12631wkgbmnqykc;
        if (i13 < 0 || i13 >= zynmafqrjbVar.zoijcleaow()) {
            return;
        }
        ppxfxbqfkfVar2.iobyxmoadg(i13, Math.max(0, ppxfxbqfkfVar.f12627lqeggnwhkg));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int hcddaimhww(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return i0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void iozdgvuglv(int i13, RecyclerView.rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13;
        int i14;
        SavedState savedState = this.f12606sopmlzcsov;
        if (savedState == null || !savedState.zoijcleaow()) {
            S0();
            z13 = this.f12607stevsuqkhv;
            i14 = this.f12603mbcevpiqjq;
            if (i14 == -1) {
                i14 = z13 ? i13 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f12606sopmlzcsov;
            z13 = savedState2.f12612jyumaefscl;
            i14 = savedState2.f12614zdlpuopuiu;
        }
        int i15 = z13 ? -1 : 1;
        for (int i16 = 0; i16 < this.f12605ribwqtqdhb && i14 >= 0 && i14 < i13; i16++) {
            ppxfxbqfkfVar.iobyxmoadg(i14, 0);
            i14 += i15;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void iwizpuwonk(String str) {
        if (this.f12606sopmlzcsov == null) {
            super.iwizpuwonk(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jpowsppfya(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return j0(zynmafqrjbVar);
    }

    int k0(int i13) {
        if (i13 == 1) {
            return (this.f12601jpowsppfya != 1 && I0()) ? 1 : -1;
        }
        if (i13 == 2) {
            return (this.f12601jpowsppfya != 1 && I0()) ? -1 : 1;
        }
        if (i13 == 17) {
            return this.f12601jpowsppfya == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 == 33) {
            return this.f12601jpowsppfya == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 != 66) {
            return (i13 == 130 && this.f12601jpowsppfya == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f12601jpowsppfya == 0 ? 1 : Integer.MIN_VALUE;
    }

    ppxfxbqfkf l0() {
        return new ppxfxbqfkf();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int lmojexxdyd(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return h0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean lxfrhoxuzk() {
        return true;
    }

    void m0() {
        if (this.f12599hkdspvbjdz == null) {
            this.f12599hkdspvbjdz = l0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public View mbcevpiqjq(int i13) {
        int iVipkmwdibw = vipkmwdibw();
        if (iVipkmwdibw == 0) {
            return null;
        }
        int iLrnfpwlwnk = i13 - lrnfpwlwnk(ribwqtqdhb(0));
        if (iLrnfpwlwnk >= 0 && iLrnfpwlwnk < iVipkmwdibw) {
            View viewRibwqtqdhb = ribwqtqdhb(iLrnfpwlwnk);
            if (lrnfpwlwnk(viewRibwqtqdhb) == i13) {
                return viewRibwqtqdhb;
            }
        }
        return super.mbcevpiqjq(i13);
    }

    int n0(RecyclerView.iwizpuwonk iwizpuwonkVar, ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int i13 = ppxfxbqfkfVar.f12629ppxfxbqfkf;
        int i14 = ppxfxbqfkfVar.f12627lqeggnwhkg;
        if (i14 != Integer.MIN_VALUE) {
            if (i13 < 0) {
                ppxfxbqfkfVar.f12627lqeggnwhkg = i14 + i13;
            }
            N0(iwizpuwonkVar, ppxfxbqfkfVar);
        }
        int i15 = ppxfxbqfkfVar.f12629ppxfxbqfkf + ppxfxbqfkfVar.f12628nufgyqmvbu;
        zoijcleaow zoijcleaowVar = this.f12600jlmebxxoox;
        while (true) {
            if ((!ppxfxbqfkfVar.f12630wflxmlrfwp && i15 <= 0) || !ppxfxbqfkfVar.ppxfxbqfkf(zynmafqrjbVar)) {
                break;
            }
            zoijcleaowVar.iobyxmoadg();
            K0(iwizpuwonkVar, zynmafqrjbVar, ppxfxbqfkfVar, zoijcleaowVar);
            if (!zoijcleaowVar.f12636zoijcleaow) {
                ppxfxbqfkfVar.f12632zoijcleaow += zoijcleaowVar.f12633iobyxmoadg * ppxfxbqfkfVar.f12625gxszxtbevo;
                if (!zoijcleaowVar.f12634ppxfxbqfkf || ppxfxbqfkfVar.f12621draadjrbmk != null || !zynmafqrjbVar.eablkybsjg()) {
                    int i16 = ppxfxbqfkfVar.f12629ppxfxbqfkf;
                    int i17 = zoijcleaowVar.f12633iobyxmoadg;
                    ppxfxbqfkfVar.f12629ppxfxbqfkf = i16 - i17;
                    i15 -= i17;
                }
                int i18 = ppxfxbqfkfVar.f12627lqeggnwhkg;
                if (i18 != Integer.MIN_VALUE) {
                    int i19 = i18 + zoijcleaowVar.f12633iobyxmoadg;
                    ppxfxbqfkfVar.f12627lqeggnwhkg = i19;
                    int i23 = ppxfxbqfkfVar.f12629ppxfxbqfkf;
                    if (i23 < 0) {
                        ppxfxbqfkfVar.f12627lqeggnwhkg = i19 + i23;
                    }
                    N0(iwizpuwonkVar, ppxfxbqfkfVar);
                }
                if (z13 && zoijcleaowVar.f12635wkgbmnqykc) {
                    break;
                }
            } else {
                break;
            }
        }
        return i13 - ppxfxbqfkfVar.f12629ppxfxbqfkf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ntlheqmsrt() {
        return new RecyclerView.vdvldrhtss(-2, -2);
    }

    @Override // androidx.recyclerview.widget.draadjrbmk.dxjokdxxww
    public void nufgyqmvbu(View view, View view2, int i13, int i14) {
        iwizpuwonk("Cannot drop a view during a scroll or layout calculation");
        m0();
        S0();
        int iLrnfpwlwnk = lrnfpwlwnk(view);
        int iLrnfpwlwnk2 = lrnfpwlwnk(view2);
        byte b13 = iLrnfpwlwnk < iLrnfpwlwnk2 ? (byte) 1 : (byte) -1;
        if (this.f12607stevsuqkhv) {
            if (b13 == 1) {
                U0(iLrnfpwlwnk2, this.f12596cllcsxoeiz.dxjokdxxww() - (this.f12596cllcsxoeiz.lqeggnwhkg(view2) + this.f12596cllcsxoeiz.eablkybsjg(view)));
                return;
            } else {
                U0(iLrnfpwlwnk2, this.f12596cllcsxoeiz.dxjokdxxww() - this.f12596cllcsxoeiz.wkgbmnqykc(view2));
                return;
            }
        }
        if (b13 == -1) {
            U0(iLrnfpwlwnk2, this.f12596cllcsxoeiz.lqeggnwhkg(view2));
        } else {
            U0(iLrnfpwlwnk2, this.f12596cllcsxoeiz.wkgbmnqykc(view2) - this.f12596cllcsxoeiz.eablkybsjg(view));
        }
    }

    public int o0() {
        View viewX0 = x0(0, vipkmwdibw(), true, false);
        if (viewX0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewX0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int iB0;
        int i17;
        View viewMbcevpiqjq;
        int iLqeggnwhkg;
        int iDxjokdxxww;
        int i18 = -1;
        if (!(this.f12606sopmlzcsov == null && this.f12603mbcevpiqjq == -1) && zynmafqrjbVar.zoijcleaow() == 0) {
            D(iwizpuwonkVar);
            return;
        }
        SavedState savedState = this.f12606sopmlzcsov;
        if (savedState != null && savedState.zoijcleaow()) {
            this.f12603mbcevpiqjq = this.f12606sopmlzcsov.f12614zdlpuopuiu;
        }
        m0();
        this.f12599hkdspvbjdz.f12626iobyxmoadg = false;
        S0();
        View viewSflfametgt = sflfametgt();
        iobyxmoadg iobyxmoadgVar = this.f12597crxdokpmqz;
        if (!iobyxmoadgVar.f12615eablkybsjg || this.f12603mbcevpiqjq != -1 || this.f12606sopmlzcsov != null) {
            iobyxmoadgVar.eablkybsjg();
            iobyxmoadg iobyxmoadgVar2 = this.f12597crxdokpmqz;
            iobyxmoadgVar2.f12618wkgbmnqykc = this.f12607stevsuqkhv ^ this.f12602kegysxyocb;
            a1(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar2);
            this.f12597crxdokpmqz.f12615eablkybsjg = true;
        } else if (viewSflfametgt != null && (this.f12596cllcsxoeiz.lqeggnwhkg(viewSflfametgt) >= this.f12596cllcsxoeiz.dxjokdxxww() || this.f12596cllcsxoeiz.wkgbmnqykc(viewSflfametgt) <= this.f12596cllcsxoeiz.agtfadlqog())) {
            this.f12597crxdokpmqz.ppxfxbqfkf(viewSflfametgt, lrnfpwlwnk(viewSflfametgt));
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.f12599hkdspvbjdz;
        ppxfxbqfkfVar.f12625gxszxtbevo = ppxfxbqfkfVar.f12624gtknphoqwx >= 0 ? 1 : -1;
        int[] iArr = this.f12610vipkmwdibw;
        iArr[0] = 0;
        iArr[1] = 0;
        f0(zynmafqrjbVar, iArr);
        int iMax = Math.max(0, this.f12610vipkmwdibw[0]) + this.f12596cllcsxoeiz.agtfadlqog();
        int iMax2 = Math.max(0, this.f12610vipkmwdibw[1]) + this.f12596cllcsxoeiz.btonecajqb();
        if (zynmafqrjbVar.eablkybsjg() && (i17 = this.f12603mbcevpiqjq) != -1 && this.f12604ntlheqmsrt != Integer.MIN_VALUE && (viewMbcevpiqjq = mbcevpiqjq(i17)) != null) {
            if (this.f12607stevsuqkhv) {
                iDxjokdxxww = this.f12596cllcsxoeiz.dxjokdxxww() - this.f12596cllcsxoeiz.wkgbmnqykc(viewMbcevpiqjq);
                iLqeggnwhkg = this.f12604ntlheqmsrt;
            } else {
                iLqeggnwhkg = this.f12596cllcsxoeiz.lqeggnwhkg(viewMbcevpiqjq) - this.f12596cllcsxoeiz.agtfadlqog();
                iDxjokdxxww = this.f12604ntlheqmsrt;
            }
            int i19 = iDxjokdxxww - iLqeggnwhkg;
            if (i19 > 0) {
                iMax += i19;
            } else {
                iMax2 -= i19;
            }
        }
        iobyxmoadg iobyxmoadgVar3 = this.f12597crxdokpmqz;
        if (!iobyxmoadgVar3.f12618wkgbmnqykc ? !this.f12607stevsuqkhv : this.f12607stevsuqkhv) {
            i18 = 1;
        }
        M0(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar3, i18);
        hkdspvbjdz(iwizpuwonkVar);
        this.f12599hkdspvbjdz.f12630wflxmlrfwp = R0();
        this.f12599hkdspvbjdz.f12620btonecajqb = zynmafqrjbVar.eablkybsjg();
        this.f12599hkdspvbjdz.f12622dxjokdxxww = 0;
        iobyxmoadg iobyxmoadgVar4 = this.f12597crxdokpmqz;
        if (iobyxmoadgVar4.f12618wkgbmnqykc) {
            f1(iobyxmoadgVar4);
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar2.f12628nufgyqmvbu = iMax;
            n0(iwizpuwonkVar, ppxfxbqfkfVar2, zynmafqrjbVar, false);
            ppxfxbqfkf ppxfxbqfkfVar3 = this.f12599hkdspvbjdz;
            i14 = ppxfxbqfkfVar3.f12632zoijcleaow;
            int i23 = ppxfxbqfkfVar3.f12631wkgbmnqykc;
            int i24 = ppxfxbqfkfVar3.f12629ppxfxbqfkf;
            if (i24 > 0) {
                iMax2 += i24;
            }
            d1(this.f12597crxdokpmqz);
            ppxfxbqfkf ppxfxbqfkfVar4 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar4.f12628nufgyqmvbu = iMax2;
            ppxfxbqfkfVar4.f12631wkgbmnqykc += ppxfxbqfkfVar4.f12623eablkybsjg;
            n0(iwizpuwonkVar, ppxfxbqfkfVar4, zynmafqrjbVar, false);
            ppxfxbqfkf ppxfxbqfkfVar5 = this.f12599hkdspvbjdz;
            i13 = ppxfxbqfkfVar5.f12632zoijcleaow;
            int i25 = ppxfxbqfkfVar5.f12629ppxfxbqfkf;
            if (i25 > 0) {
                e1(i23, i14);
                ppxfxbqfkf ppxfxbqfkfVar6 = this.f12599hkdspvbjdz;
                ppxfxbqfkfVar6.f12628nufgyqmvbu = i25;
                n0(iwizpuwonkVar, ppxfxbqfkfVar6, zynmafqrjbVar, false);
                i14 = this.f12599hkdspvbjdz.f12632zoijcleaow;
            }
        } else {
            d1(iobyxmoadgVar4);
            ppxfxbqfkf ppxfxbqfkfVar7 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar7.f12628nufgyqmvbu = iMax2;
            n0(iwizpuwonkVar, ppxfxbqfkfVar7, zynmafqrjbVar, false);
            ppxfxbqfkf ppxfxbqfkfVar8 = this.f12599hkdspvbjdz;
            i13 = ppxfxbqfkfVar8.f12632zoijcleaow;
            int i26 = ppxfxbqfkfVar8.f12631wkgbmnqykc;
            int i27 = ppxfxbqfkfVar8.f12629ppxfxbqfkf;
            if (i27 > 0) {
                iMax += i27;
            }
            f1(this.f12597crxdokpmqz);
            ppxfxbqfkf ppxfxbqfkfVar9 = this.f12599hkdspvbjdz;
            ppxfxbqfkfVar9.f12628nufgyqmvbu = iMax;
            ppxfxbqfkfVar9.f12631wkgbmnqykc += ppxfxbqfkfVar9.f12623eablkybsjg;
            n0(iwizpuwonkVar, ppxfxbqfkfVar9, zynmafqrjbVar, false);
            ppxfxbqfkf ppxfxbqfkfVar10 = this.f12599hkdspvbjdz;
            i14 = ppxfxbqfkfVar10.f12632zoijcleaow;
            int i28 = ppxfxbqfkfVar10.f12629ppxfxbqfkf;
            if (i28 > 0) {
                c1(i26, i13);
                ppxfxbqfkf ppxfxbqfkfVar11 = this.f12599hkdspvbjdz;
                ppxfxbqfkfVar11.f12628nufgyqmvbu = i28;
                n0(iwizpuwonkVar, ppxfxbqfkfVar11, zynmafqrjbVar, false);
                i13 = this.f12599hkdspvbjdz.f12632zoijcleaow;
            }
        }
        if (vipkmwdibw() > 0) {
            if (this.f12607stevsuqkhv ^ this.f12602kegysxyocb) {
                int iB1 = B0(i13, iwizpuwonkVar, zynmafqrjbVar, true);
                i15 = i14 + iB1;
                i16 = i13 + iB1;
                iB0 = C0(i15, iwizpuwonkVar, zynmafqrjbVar, false);
            } else {
                int iC0 = C0(i14, iwizpuwonkVar, zynmafqrjbVar, true);
                i15 = i14 + iC0;
                i16 = i13 + iC0;
                iB0 = B0(i16, iwizpuwonkVar, zynmafqrjbVar, false);
            }
            i14 = i15 + iB0;
            i13 = i16 + iB0;
        }
        L0(iwizpuwonkVar, zynmafqrjbVar, i14, i13);
        if (zynmafqrjbVar.eablkybsjg()) {
            this.f12597crxdokpmqz.eablkybsjg();
        } else {
            this.f12596cllcsxoeiz.zdlpuopuiu();
        }
        this.f12598dsvhmnatus = this.f12602kegysxyocb;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int pkzmftpjix(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return h0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean pmvmpeiblj() {
        return this.f12601jpowsppfya == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        super.q(zynmafqrjbVar);
        this.f12606sopmlzcsov = null;
        this.f12603mbcevpiqjq = -1;
        this.f12604ntlheqmsrt = Integer.MIN_VALUE;
        this.f12597crxdokpmqz.eablkybsjg();
    }

    View q0(boolean z13, boolean z14) {
        return this.f12607stevsuqkhv ? x0(0, vipkmwdibw(), z13, z14) : x0(vipkmwdibw() - 1, -1, z13, z14);
    }

    View r0(boolean z13, boolean z14) {
        return this.f12607stevsuqkhv ? x0(vipkmwdibw() - 1, -1, z13, z14) : x0(0, vipkmwdibw(), z13, z14);
    }

    public int s0() {
        View viewX0 = x0(0, vipkmwdibw(), false, true);
        if (viewX0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewX0);
    }

    public int t0() {
        View viewX0 = x0(vipkmwdibw() - 1, -1, true, false);
        if (viewX0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewX0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void u(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f12606sopmlzcsov = savedState;
            if (this.f12603mbcevpiqjq != -1) {
                savedState.ppxfxbqfkf();
            }
            M();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public Parcelable v() {
        if (this.f12606sopmlzcsov != null) {
            return new SavedState(this.f12606sopmlzcsov);
        }
        SavedState savedState = new SavedState();
        if (vipkmwdibw() > 0) {
            m0();
            boolean z13 = this.f12598dsvhmnatus ^ this.f12607stevsuqkhv;
            savedState.f12612jyumaefscl = z13;
            if (z13) {
                View viewD0 = D0();
                savedState.f12613yggfygwlhe = this.f12596cllcsxoeiz.dxjokdxxww() - this.f12596cllcsxoeiz.wkgbmnqykc(viewD0);
                savedState.f12614zdlpuopuiu = lrnfpwlwnk(viewD0);
            } else {
                View viewE0 = E0();
                savedState.f12614zdlpuopuiu = lrnfpwlwnk(viewE0);
                savedState.f12613yggfygwlhe = this.f12596cllcsxoeiz.lqeggnwhkg(viewE0) - this.f12596cllcsxoeiz.agtfadlqog();
            }
        } else {
            savedState.ppxfxbqfkf();
        }
        return savedState;
    }

    public int v0() {
        View viewX0 = x0(vipkmwdibw() - 1, -1, false, true);
        if (viewX0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewX0);
    }

    View w0(int i13, int i14) {
        int i15;
        int i16;
        m0();
        if (i14 <= i13 && i14 >= i13) {
            return ribwqtqdhb(i13);
        }
        if (this.f12596cllcsxoeiz.lqeggnwhkg(ribwqtqdhb(i13)) < this.f12596cllcsxoeiz.agtfadlqog()) {
            i15 = 16644;
            i16 = 16388;
        } else {
            i15 = 4161;
            i16 = 4097;
        }
        return this.f12601jpowsppfya == 0 ? this.f12761cqumvgiudr.iobyxmoadg(i13, i14, i15, i16) : this.f12762esjtqupxsv.iobyxmoadg(i13, i14, i15, i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int wwaezpbzkn(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return i0(zynmafqrjbVar);
    }

    View x0(int i13, int i14, boolean z13, boolean z14) {
        m0();
        int i15 = z13 ? 24579 : 320;
        int i16 = z14 ? 320 : 0;
        return this.f12601jpowsppfya == 0 ? this.f12761cqumvgiudr.iobyxmoadg(i13, i14, i15, i16) : this.f12762esjtqupxsv.iobyxmoadg(i13, i14, i15, i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void yadqdtsiqt(int i13, int i14, RecyclerView.zynmafqrjb zynmafqrjbVar, RecyclerView.rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f12601jpowsppfya != 0) {
            i13 = i14;
        }
        if (vipkmwdibw() == 0 || i13 == 0) {
            return;
        }
        m0();
        b1(i13 > 0 ? 1 : -1, Math.abs(i13), true, zynmafqrjbVar);
        g0(zynmafqrjbVar, this.f12599hkdspvbjdz, ppxfxbqfkfVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int ylkuphrtab(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return j0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj.zoijcleaow
    public PointF zoijcleaow(int i13) {
        if (vipkmwdibw() == 0) {
            return null;
        }
        int i14 = (i13 < lrnfpwlwnk(ribwqtqdhb(0))) != this.f12607stevsuqkhv ? -1 : 1;
        return this.f12601jpowsppfya == 0 ? new PointF(i14, 0.0f) : new PointF(0.0f, i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean zynmafqrjb() {
        return this.f12601jpowsppfya == 1;
    }

    public LinearLayoutManager(Context context, int i13, boolean z13) {
        this.f12601jpowsppfya = 1;
        this.f12611wypolnanlu = false;
        this.f12607stevsuqkhv = false;
        this.f12602kegysxyocb = false;
        this.f12608tzroggbefp = true;
        this.f12603mbcevpiqjq = -1;
        this.f12604ntlheqmsrt = Integer.MIN_VALUE;
        this.f12606sopmlzcsov = null;
        this.f12597crxdokpmqz = new iobyxmoadg();
        this.f12600jlmebxxoox = new zoijcleaow();
        this.f12605ribwqtqdhb = 2;
        this.f12610vipkmwdibw = new int[2];
        V0(i13);
        W0(z13);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f12601jpowsppfya = 1;
        this.f12611wypolnanlu = false;
        this.f12607stevsuqkhv = false;
        this.f12602kegysxyocb = false;
        this.f12608tzroggbefp = true;
        this.f12603mbcevpiqjq = -1;
        this.f12604ntlheqmsrt = Integer.MIN_VALUE;
        this.f12606sopmlzcsov = null;
        this.f12597crxdokpmqz = new iobyxmoadg();
        this.f12600jlmebxxoox = new zoijcleaow();
        this.f12605ribwqtqdhb = 2;
        this.f12610vipkmwdibw = new int[2];
        RecyclerView.rgvfuqvkyq.wkgbmnqykc wkgbmnqykcVarZeieaojujs = RecyclerView.rgvfuqvkyq.zeieaojujs(context, attributeSet, i13, i14);
        V0(wkgbmnqykcVarZeieaojujs.f12779iobyxmoadg);
        W0(wkgbmnqykcVarZeieaojujs.f12780ppxfxbqfkf);
        X0(wkgbmnqykcVarZeieaojujs.f12781wkgbmnqykc);
    }
}
