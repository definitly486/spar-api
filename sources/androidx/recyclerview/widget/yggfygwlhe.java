package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final RecyclerView.rgvfuqvkyq f13151iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Rect f13152ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f13153zoijcleaow;

    class iobyxmoadg extends yggfygwlhe {
        iobyxmoadg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            super(rgvfuqvkyqVar, null);
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int agtfadlqog() {
            return this.f13151iobyxmoadg.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int btonecajqb() {
            return this.f13151iobyxmoadg.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int draadjrbmk() {
            return this.f13151iobyxmoadg.dvvnrvtcbc();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int dxjokdxxww() {
            return this.f13151iobyxmoadg.iwxlajgraz() - this.f13151iobyxmoadg.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int eablkybsjg(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return this.f13151iobyxmoadg.uwvvkdfqfp(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int gxszxtbevo(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return this.f13151iobyxmoadg.czzsidtyhn(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public void kcexrzcfyt(int i13) {
            this.f13151iobyxmoadg.fmlbqenlif(i13);
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int lqeggnwhkg(View view) {
            return this.f13151iobyxmoadg.rlfsiqarku(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int nufgyqmvbu() {
            return this.f13151iobyxmoadg.iwxlajgraz();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int ojitshcjhn() {
            return (this.f13151iobyxmoadg.iwxlajgraz() - this.f13151iobyxmoadg.getPaddingLeft()) - this.f13151iobyxmoadg.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int oxmwwwfdhm(View view) {
            this.f13151iobyxmoadg.auzgnhcxok(view, true, this.f13152ppxfxbqfkf);
            return this.f13152ppxfxbqfkf.left;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int vdvldrhtss(View view) {
            this.f13151iobyxmoadg.auzgnhcxok(view, true, this.f13152ppxfxbqfkf);
            return this.f13152ppxfxbqfkf.right;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int wflxmlrfwp() {
            return this.f13151iobyxmoadg.oipsdeybqn();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int wkgbmnqykc(View view) {
            return this.f13151iobyxmoadg.yfnezrywwk(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).rightMargin;
        }
    }

    class zoijcleaow extends yggfygwlhe {
        zoijcleaow(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
            super(rgvfuqvkyqVar, null);
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int agtfadlqog() {
            return this.f13151iobyxmoadg.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int btonecajqb() {
            return this.f13151iobyxmoadg.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int draadjrbmk() {
            return this.f13151iobyxmoadg.oipsdeybqn();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int dxjokdxxww() {
            return this.f13151iobyxmoadg.zfvoamnweg() - this.f13151iobyxmoadg.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int eablkybsjg(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return this.f13151iobyxmoadg.czzsidtyhn(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int gxszxtbevo(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return this.f13151iobyxmoadg.uwvvkdfqfp(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public void kcexrzcfyt(int i13) {
            this.f13151iobyxmoadg.ezmngbhpjk(i13);
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int lqeggnwhkg(View view) {
            return this.f13151iobyxmoadg.ydmasvzmpa(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int nufgyqmvbu() {
            return this.f13151iobyxmoadg.zfvoamnweg();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int ojitshcjhn() {
            return (this.f13151iobyxmoadg.zfvoamnweg() - this.f13151iobyxmoadg.getPaddingTop()) - this.f13151iobyxmoadg.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int oxmwwwfdhm(View view) {
            this.f13151iobyxmoadg.auzgnhcxok(view, true, this.f13152ppxfxbqfkf);
            return this.f13152ppxfxbqfkf.top;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int vdvldrhtss(View view) {
            this.f13151iobyxmoadg.auzgnhcxok(view, true, this.f13152ppxfxbqfkf);
            return this.f13152ppxfxbqfkf.bottom;
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int wflxmlrfwp() {
            return this.f13151iobyxmoadg.dvvnrvtcbc();
        }

        @Override // androidx.recyclerview.widget.yggfygwlhe
        public int wkgbmnqykc(View view) {
            return this.f13151iobyxmoadg.xrmfcynszj(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).bottomMargin;
        }
    }

    /* synthetic */ yggfygwlhe(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, iobyxmoadg iobyxmoadgVar) {
        this(rgvfuqvkyqVar);
    }

    public static yggfygwlhe iobyxmoadg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        return new iobyxmoadg(rgvfuqvkyqVar);
    }

    public static yggfygwlhe ppxfxbqfkf(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        return new zoijcleaow(rgvfuqvkyqVar);
    }

    public static yggfygwlhe zoijcleaow(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        if (i13 == 0) {
            return iobyxmoadg(rgvfuqvkyqVar);
        }
        if (i13 == 1) {
            return ppxfxbqfkf(rgvfuqvkyqVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int agtfadlqog();

    public abstract int btonecajqb();

    public abstract int draadjrbmk();

    public abstract int dxjokdxxww();

    public abstract int eablkybsjg(View view);

    public RecyclerView.rgvfuqvkyq gtknphoqwx() {
        return this.f13151iobyxmoadg;
    }

    public abstract int gxszxtbevo(View view);

    public abstract void kcexrzcfyt(int i13);

    public abstract int lqeggnwhkg(View view);

    public abstract int nufgyqmvbu();

    public abstract int ojitshcjhn();

    public abstract int oxmwwwfdhm(View view);

    public int rgvfuqvkyq() {
        if (Integer.MIN_VALUE == this.f13153zoijcleaow) {
            return 0;
        }
        return ojitshcjhn() - this.f13153zoijcleaow;
    }

    public abstract int vdvldrhtss(View view);

    public abstract int wflxmlrfwp();

    public abstract int wkgbmnqykc(View view);

    public void zdlpuopuiu() {
        this.f13153zoijcleaow = ojitshcjhn();
    }

    private yggfygwlhe(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f13153zoijcleaow = Integer.MIN_VALUE;
        this.f13152ppxfxbqfkf = new Rect();
        this.f13151iobyxmoadg = rgvfuqvkyqVar;
    }
}
