package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends RecyclerView.yggfygwlhe {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f13752btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f13753draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f13754dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f13755eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f13756gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f13757gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ViewPager2.dxjokdxxww f13758iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private iobyxmoadg f13759lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f13760nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final RecyclerView f13761ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f13762wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final LinearLayoutManager f13763wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ViewPager2 f13764zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13765iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f13766ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f13767zoijcleaow;

        iobyxmoadg() {
        }

        void iobyxmoadg() {
            this.f13765iobyxmoadg = -1;
            this.f13767zoijcleaow = 0.0f;
            this.f13766ppxfxbqfkf = 0;
        }
    }

    eablkybsjg(ViewPager2 viewPager2) {
        this.f13764zoijcleaow = viewPager2;
        RecyclerView recyclerView = viewPager2.f13717istkbnxepw;
        this.f13761ppxfxbqfkf = recyclerView;
        this.f13763wkgbmnqykc = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f13759lqeggnwhkg = new iobyxmoadg();
        draadjrbmk();
    }

    private void agtfadlqog(boolean z13) {
        this.f13762wflxmlrfwp = z13;
        this.f13755eablkybsjg = z13 ? 4 : 1;
        int i13 = this.f13754dxjokdxxww;
        if (i13 != -1) {
            this.f13760nufgyqmvbu = i13;
            this.f13754dxjokdxxww = -1;
        } else if (this.f13760nufgyqmvbu == -1) {
            this.f13760nufgyqmvbu = wkgbmnqykc();
        }
        ppxfxbqfkf(1);
    }

    private void draadjrbmk() {
        this.f13755eablkybsjg = 0;
        this.f13757gxszxtbevo = 0;
        this.f13759lqeggnwhkg.iobyxmoadg();
        this.f13760nufgyqmvbu = -1;
        this.f13754dxjokdxxww = -1;
        this.f13752btonecajqb = false;
        this.f13756gtknphoqwx = false;
        this.f13762wflxmlrfwp = false;
        this.f13753draadjrbmk = false;
    }

    private boolean dxjokdxxww() {
        int i13 = this.f13755eablkybsjg;
        return i13 == 1 || i13 == 4;
    }

    private void iobyxmoadg(int i13, float f13, int i14) {
        ViewPager2.dxjokdxxww dxjokdxxwwVar = this.f13758iobyxmoadg;
        if (dxjokdxxwwVar != null) {
            dxjokdxxwwVar.zoijcleaow(i13, f13, i14);
        }
    }

    private void ojitshcjhn() {
        int top;
        iobyxmoadg iobyxmoadgVar = this.f13759lqeggnwhkg;
        int iS0 = this.f13763wkgbmnqykc.s0();
        iobyxmoadgVar.f13765iobyxmoadg = iS0;
        if (iS0 == -1) {
            iobyxmoadgVar.iobyxmoadg();
            return;
        }
        View viewMbcevpiqjq = this.f13763wkgbmnqykc.mbcevpiqjq(iS0);
        if (viewMbcevpiqjq == null) {
            iobyxmoadgVar.iobyxmoadg();
            return;
        }
        int iOpjhrmiecq = this.f13763wkgbmnqykc.opjhrmiecq(viewMbcevpiqjq);
        int iNuxfzjnpeb = this.f13763wkgbmnqykc.nuxfzjnpeb(viewMbcevpiqjq);
        int iUawqvzlxes = this.f13763wkgbmnqykc.uawqvzlxes(viewMbcevpiqjq);
        int iJlmebxxoox = this.f13763wkgbmnqykc.jlmebxxoox(viewMbcevpiqjq);
        ViewGroup.LayoutParams layoutParams = viewMbcevpiqjq.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iOpjhrmiecq += marginLayoutParams.leftMargin;
            iNuxfzjnpeb += marginLayoutParams.rightMargin;
            iUawqvzlxes += marginLayoutParams.topMargin;
            iJlmebxxoox += marginLayoutParams.bottomMargin;
        }
        int height = viewMbcevpiqjq.getHeight() + iUawqvzlxes + iJlmebxxoox;
        int width = viewMbcevpiqjq.getWidth() + iOpjhrmiecq + iNuxfzjnpeb;
        if (this.f13763wkgbmnqykc.G0() == 0) {
            top = (viewMbcevpiqjq.getLeft() - iOpjhrmiecq) - this.f13761ppxfxbqfkf.getPaddingLeft();
            if (this.f13764zoijcleaow.wkgbmnqykc()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMbcevpiqjq.getTop() - iUawqvzlxes) - this.f13761ppxfxbqfkf.getPaddingTop();
        }
        int i13 = -top;
        iobyxmoadgVar.f13766ppxfxbqfkf = i13;
        if (i13 >= 0) {
            iobyxmoadgVar.f13767zoijcleaow = height == 0 ? 0.0f : i13 / height;
        } else {
            if (!new androidx.viewpager2.widget.iobyxmoadg(this.f13763wkgbmnqykc).wkgbmnqykc()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(iobyxmoadgVar.f13766ppxfxbqfkf)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    private void ppxfxbqfkf(int i13) {
        if ((this.f13755eablkybsjg == 3 && this.f13757gxszxtbevo == 0) || this.f13757gxszxtbevo == i13) {
            return;
        }
        this.f13757gxszxtbevo = i13;
        ViewPager2.dxjokdxxww dxjokdxxwwVar = this.f13758iobyxmoadg;
        if (dxjokdxxwwVar != null) {
            dxjokdxxwwVar.iobyxmoadg(i13);
        }
    }

    private int wkgbmnqykc() {
        return this.f13763wkgbmnqykc.s0();
    }

    private void zoijcleaow(int i13) {
        ViewPager2.dxjokdxxww dxjokdxxwwVar = this.f13758iobyxmoadg;
        if (dxjokdxxwwVar != null) {
            dxjokdxxwwVar.ppxfxbqfkf(i13);
        }
    }

    void btonecajqb() {
        this.f13753draadjrbmk = true;
    }

    double eablkybsjg() {
        ojitshcjhn();
        iobyxmoadg iobyxmoadgVar = this.f13759lqeggnwhkg;
        return ((double) iobyxmoadgVar.f13765iobyxmoadg) + ((double) iobyxmoadgVar.f13767zoijcleaow);
    }

    void gtknphoqwx(int i13, boolean z13) {
        this.f13755eablkybsjg = z13 ? 2 : 3;
        this.f13762wflxmlrfwp = false;
        boolean z14 = this.f13754dxjokdxxww != i13;
        this.f13754dxjokdxxww = i13;
        ppxfxbqfkf(2);
        if (z14) {
            zoijcleaow(i13);
        }
    }

    int gxszxtbevo() {
        return this.f13757gxszxtbevo;
    }

    boolean lqeggnwhkg() {
        return this.f13762wflxmlrfwp;
    }

    boolean nufgyqmvbu() {
        return this.f13757gxszxtbevo == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
    public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
        if (!(this.f13755eablkybsjg == 1 && this.f13757gxszxtbevo == 1) && i13 == 1) {
            agtfadlqog(false);
            return;
        }
        if (dxjokdxxww() && i13 == 2) {
            if (this.f13756gtknphoqwx) {
                ppxfxbqfkf(2);
                this.f13752btonecajqb = true;
                return;
            }
            return;
        }
        if (dxjokdxxww() && i13 == 0) {
            ojitshcjhn();
            if (this.f13756gtknphoqwx) {
                iobyxmoadg iobyxmoadgVar = this.f13759lqeggnwhkg;
                if (iobyxmoadgVar.f13766ppxfxbqfkf == 0) {
                    int i14 = this.f13760nufgyqmvbu;
                    int i15 = iobyxmoadgVar.f13765iobyxmoadg;
                    if (i14 != i15) {
                        zoijcleaow(i15);
                    }
                }
            } else {
                int i16 = this.f13759lqeggnwhkg.f13765iobyxmoadg;
                if (i16 != -1) {
                    iobyxmoadg(i16, 0.0f, 0);
                }
            }
            ppxfxbqfkf(0);
            draadjrbmk();
        }
        if (this.f13755eablkybsjg == 2 && i13 == 0 && this.f13753draadjrbmk) {
            ojitshcjhn();
            iobyxmoadg iobyxmoadgVar2 = this.f13759lqeggnwhkg;
            if (iobyxmoadgVar2.f13766ppxfxbqfkf == 0) {
                int i17 = this.f13754dxjokdxxww;
                int i18 = iobyxmoadgVar2.f13765iobyxmoadg;
                if (i17 != i18) {
                    if (i18 == -1) {
                        i18 = 0;
                    }
                    zoijcleaow(i18);
                }
                ppxfxbqfkf(0);
                draadjrbmk();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
    public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
        iobyxmoadg iobyxmoadgVar;
        int i15;
        this.f13756gtknphoqwx = true;
        ojitshcjhn();
        if (this.f13752btonecajqb) {
            this.f13752btonecajqb = false;
            if (i14 > 0) {
                iobyxmoadgVar = this.f13759lqeggnwhkg;
                if (iobyxmoadgVar.f13766ppxfxbqfkf != 0) {
                    i15 = iobyxmoadgVar.f13765iobyxmoadg + 1;
                } else {
                    i15 = this.f13759lqeggnwhkg.f13765iobyxmoadg;
                }
            } else {
                if (i14 == 0) {
                    if ((i13 < 0) == this.f13764zoijcleaow.wkgbmnqykc()) {
                        iobyxmoadgVar = this.f13759lqeggnwhkg;
                        if (iobyxmoadgVar.f13766ppxfxbqfkf != 0) {
                            i15 = iobyxmoadgVar.f13765iobyxmoadg + 1;
                        }
                    }
                }
                i15 = this.f13759lqeggnwhkg.f13765iobyxmoadg;
            }
            this.f13754dxjokdxxww = i15;
            if (this.f13760nufgyqmvbu != i15) {
                zoijcleaow(i15);
            }
        } else if (this.f13755eablkybsjg == 0) {
            int i16 = this.f13759lqeggnwhkg.f13765iobyxmoadg;
            if (i16 == -1) {
                i16 = 0;
            }
            zoijcleaow(i16);
        }
        iobyxmoadg iobyxmoadgVar2 = this.f13759lqeggnwhkg;
        int i17 = iobyxmoadgVar2.f13765iobyxmoadg;
        if (i17 == -1) {
            i17 = 0;
        }
        iobyxmoadg(i17, iobyxmoadgVar2.f13767zoijcleaow, iobyxmoadgVar2.f13766ppxfxbqfkf);
        iobyxmoadg iobyxmoadgVar3 = this.f13759lqeggnwhkg;
        int i18 = iobyxmoadgVar3.f13765iobyxmoadg;
        int i19 = this.f13754dxjokdxxww;
        if ((i18 == i19 || i19 == -1) && iobyxmoadgVar3.f13766ppxfxbqfkf == 0 && this.f13757gxszxtbevo != 1) {
            ppxfxbqfkf(0);
            draadjrbmk();
        }
    }

    void wflxmlrfwp(ViewPager2.dxjokdxxww dxjokdxxwwVar) {
        this.f13758iobyxmoadg = dxjokdxxwwVar;
    }
}
