package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.hcddaimhww;
import androidx.appcompat.widget.pkzmftpjix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends nufgyqmvbu implements btonecajqb, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private static final int f2907ntlheqmsrt = lqeggnwhkg.lqeggnwhkg.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f2909cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f2910cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f2912esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f2913hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f2914hkdspvbjdz;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f2917iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f2918jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f2919jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    ViewTreeObserver f2920kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final Handler f2921lereixgezr;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    boolean f2923mbcevpiqjq;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private btonecajqb.iobyxmoadg f2926stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2927tzroggbefp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private View f2928wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f2929wypolnanlu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Context f2931yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    View f2932ylkuphrtab;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final List f2925pmvmpeiblj = new ArrayList();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final List f2933zynmafqrjb = new ArrayList();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2916istkbnxepw = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2908cdpycssgdh = new ViewOnAttachStateChangeListenerC0068zoijcleaow();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final pkzmftpjix f2930yadqdtsiqt = new ppxfxbqfkf();

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f2915iozdgvuglv = 0;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f2922lmojexxdyd = 0;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f2911dsvhmnatus = false;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f2924pkzmftpjix = cdpycssgdh();

    class iobyxmoadg implements ViewTreeObserver.OnGlobalLayoutListener {
        iobyxmoadg() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!zoijcleaow.this.zoijcleaow() || zoijcleaow.this.f2933zynmafqrjb.size() <= 0 || ((wkgbmnqykc) zoijcleaow.this.f2933zynmafqrjb.get(0)).f2940iobyxmoadg.zynmafqrjb()) {
                return;
            }
            View view = zoijcleaow.this.f2932ylkuphrtab;
            if (view == null || !view.isShown()) {
                zoijcleaow.this.dismiss();
                return;
            }
            Iterator it = zoijcleaow.this.f2933zynmafqrjb.iterator();
            while (it.hasNext()) {
                ((wkgbmnqykc) it.next()).f2940iobyxmoadg.iobyxmoadg();
            }
        }
    }

    class ppxfxbqfkf implements pkzmftpjix {

        class iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f2937jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MenuItem f2938yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f2939zdlpuopuiu;

            iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, MenuItem menuItem, eablkybsjg eablkybsjgVar) {
                this.f2939zdlpuopuiu = wkgbmnqykcVar;
                this.f2938yggfygwlhe = menuItem;
                this.f2937jyumaefscl = eablkybsjgVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                wkgbmnqykc wkgbmnqykcVar = this.f2939zdlpuopuiu;
                if (wkgbmnqykcVar != null) {
                    zoijcleaow.this.f2923mbcevpiqjq = true;
                    wkgbmnqykcVar.f2942zoijcleaow.eablkybsjg(false);
                    zoijcleaow.this.f2923mbcevpiqjq = false;
                }
                if (this.f2938yggfygwlhe.isEnabled() && this.f2938yggfygwlhe.hasSubMenu()) {
                    this.f2937jyumaefscl.hkdspvbjdz(this.f2938yggfygwlhe, 4);
                }
            }
        }

        ppxfxbqfkf() {
        }

        @Override // androidx.appcompat.widget.pkzmftpjix
        public void eablkybsjg(eablkybsjg eablkybsjgVar, MenuItem menuItem) {
            zoijcleaow.this.f2921lereixgezr.removeCallbacksAndMessages(null);
            int size = zoijcleaow.this.f2933zynmafqrjb.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    i13 = -1;
                    break;
                } else if (eablkybsjgVar == ((wkgbmnqykc) zoijcleaow.this.f2933zynmafqrjb.get(i13)).f2942zoijcleaow) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 == -1) {
                return;
            }
            int i14 = i13 + 1;
            zoijcleaow.this.f2921lereixgezr.postAtTime(new iobyxmoadg(i14 < zoijcleaow.this.f2933zynmafqrjb.size() ? (wkgbmnqykc) zoijcleaow.this.f2933zynmafqrjb.get(i14) : null, menuItem, eablkybsjgVar), eablkybsjgVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.pkzmftpjix
        public void ojitshcjhn(eablkybsjg eablkybsjgVar, MenuItem menuItem) {
            zoijcleaow.this.f2921lereixgezr.removeCallbacksAndMessages(eablkybsjgVar);
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final hcddaimhww f2940iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f2941ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final eablkybsjg f2942zoijcleaow;

        public wkgbmnqykc(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar, int i13) {
            this.f2940iobyxmoadg = hcddaimhwwVar;
            this.f2942zoijcleaow = eablkybsjgVar;
            this.f2941ppxfxbqfkf = i13;
        }

        public ListView iobyxmoadg() {
            return this.f2940iobyxmoadg.rgvfuqvkyq();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0068zoijcleaow implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0068zoijcleaow() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = zoijcleaow.this.f2920kegysxyocb;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    zoijcleaow.this.f2920kegysxyocb = view.getViewTreeObserver();
                }
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                zoijcleaowVar.f2920kegysxyocb.removeGlobalOnLayoutListener(zoijcleaowVar.f2916istkbnxepw);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public zoijcleaow(Context context, View view, int i13, int i14, boolean z13) {
        this.f2931yggfygwlhe = context;
        this.f2928wwaezpbzkn = view;
        this.f2917iwizpuwonk = i13;
        this.f2910cqumvgiudr = i14;
        this.f2912esjtqupxsv = z13;
        Resources resources = context.getResources();
        this.f2919jyumaefscl = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(lqeggnwhkg.wkgbmnqykc.abc_config_prefDialogWidth));
        this.f2921lereixgezr = new Handler();
    }

    private int cdpycssgdh() {
        return this.f2928wwaezpbzkn.getLayoutDirection() == 1 ? 0 : 1;
    }

    private void iozdgvuglv(eablkybsjg eablkybsjgVar) {
        wkgbmnqykc wkgbmnqykcVar;
        View viewIstkbnxepw;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2931yggfygwlhe);
        androidx.appcompat.view.menu.wkgbmnqykc wkgbmnqykcVar2 = new androidx.appcompat.view.menu.wkgbmnqykc(eablkybsjgVar, layoutInflaterFrom, this.f2912esjtqupxsv, f2907ntlheqmsrt);
        if (!zoijcleaow() && this.f2911dsvhmnatus) {
            wkgbmnqykcVar2.wkgbmnqykc(true);
        } else if (zoijcleaow()) {
            wkgbmnqykcVar2.wkgbmnqykc(nufgyqmvbu.cqumvgiudr(eablkybsjgVar));
        }
        int iAgtfadlqog = nufgyqmvbu.agtfadlqog(wkgbmnqykcVar2, null, this.f2931yggfygwlhe, this.f2919jyumaefscl);
        hcddaimhww hcddaimhwwVarLereixgezr = lereixgezr();
        hcddaimhwwVarLereixgezr.agtfadlqog(wkgbmnqykcVar2);
        hcddaimhwwVarLereixgezr.iozdgvuglv(iAgtfadlqog);
        hcddaimhwwVarLereixgezr.lmojexxdyd(this.f2922lmojexxdyd);
        if (this.f2933zynmafqrjb.size() > 0) {
            List list = this.f2933zynmafqrjb;
            wkgbmnqykcVar = (wkgbmnqykc) list.get(list.size() - 1);
            viewIstkbnxepw = istkbnxepw(wkgbmnqykcVar, eablkybsjgVar);
        } else {
            wkgbmnqykcVar = null;
            viewIstkbnxepw = null;
        }
        if (viewIstkbnxepw != null) {
            hcddaimhwwVarLereixgezr.ulzqkzuiru(false);
            hcddaimhwwVarLereixgezr.tzroggbefp(null);
            int iYadqdtsiqt = yadqdtsiqt(iAgtfadlqog);
            boolean z13 = iYadqdtsiqt == 1;
            this.f2924pkzmftpjix = iYadqdtsiqt;
            hcddaimhwwVarLereixgezr.cdpycssgdh(viewIstkbnxepw);
            if ((this.f2922lmojexxdyd & 5) != 5) {
                iAgtfadlqog = z13 ? viewIstkbnxepw.getWidth() : 0 - iAgtfadlqog;
            } else if (!z13) {
                iAgtfadlqog = 0 - viewIstkbnxepw.getWidth();
            }
            hcddaimhwwVarLereixgezr.gxszxtbevo(iAgtfadlqog);
            hcddaimhwwVarLereixgezr.cllcsxoeiz(true);
            hcddaimhwwVarLereixgezr.btonecajqb(0);
        } else {
            if (this.f2913hcddaimhww) {
                hcddaimhwwVarLereixgezr.gxszxtbevo(this.f2914hkdspvbjdz);
            }
            if (this.f2918jpowsppfya) {
                hcddaimhwwVarLereixgezr.btonecajqb(this.f2909cllcsxoeiz);
            }
            hcddaimhwwVarLereixgezr.wwaezpbzkn(wflxmlrfwp());
        }
        this.f2933zynmafqrjb.add(new wkgbmnqykc(hcddaimhwwVarLereixgezr, eablkybsjgVar, this.f2924pkzmftpjix));
        hcddaimhwwVarLereixgezr.iobyxmoadg();
        ListView listViewRgvfuqvkyq = hcddaimhwwVarLereixgezr.rgvfuqvkyq();
        listViewRgvfuqvkyq.setOnKeyListener(this);
        if (wkgbmnqykcVar == null && this.f2929wypolnanlu && eablkybsjgVar.cqumvgiudr() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(lqeggnwhkg.lqeggnwhkg.abc_popup_menu_header_item_layout, (ViewGroup) listViewRgvfuqvkyq, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eablkybsjgVar.cqumvgiudr());
            listViewRgvfuqvkyq.addHeaderView(frameLayout, null, false);
            hcddaimhwwVarLereixgezr.iobyxmoadg();
        }
    }

    private View istkbnxepw(wkgbmnqykc wkgbmnqykcVar, eablkybsjg eablkybsjgVar) {
        androidx.appcompat.view.menu.wkgbmnqykc wkgbmnqykcVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemZynmafqrjb = zynmafqrjb(wkgbmnqykcVar.f2942zoijcleaow, eablkybsjgVar);
        if (menuItemZynmafqrjb == null) {
            return null;
        }
        ListView listViewIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        ListAdapter adapter = listViewIobyxmoadg.getAdapter();
        int i13 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            wkgbmnqykcVar2 = (androidx.appcompat.view.menu.wkgbmnqykc) headerViewListAdapter.getWrappedAdapter();
        } else {
            wkgbmnqykcVar2 = (androidx.appcompat.view.menu.wkgbmnqykc) adapter;
            headersCount = 0;
        }
        int count = wkgbmnqykcVar2.getCount();
        while (true) {
            if (i13 >= count) {
                i13 = -1;
                break;
            }
            if (menuItemZynmafqrjb == wkgbmnqykcVar2.getItem(i13)) {
                break;
            }
            i13++;
        }
        if (i13 != -1 && (firstVisiblePosition = (i13 + headersCount) - listViewIobyxmoadg.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewIobyxmoadg.getChildCount()) {
            return listViewIobyxmoadg.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private hcddaimhww lereixgezr() {
        hcddaimhww hcddaimhwwVar = new hcddaimhww(this.f2931yggfygwlhe, null, this.f2917iwizpuwonk, this.f2910cqumvgiudr);
        hcddaimhwwVar.ntlheqmsrt(this.f2930yadqdtsiqt);
        hcddaimhwwVar.jpowsppfya(this);
        hcddaimhwwVar.hcddaimhww(this);
        hcddaimhwwVar.cdpycssgdh(this.f2928wwaezpbzkn);
        hcddaimhwwVar.lmojexxdyd(this.f2922lmojexxdyd);
        hcddaimhwwVar.pkzmftpjix(true);
        hcddaimhwwVar.ylkuphrtab(2);
        return hcddaimhwwVar;
    }

    private int pmvmpeiblj(eablkybsjg eablkybsjgVar) {
        int size = this.f2933zynmafqrjb.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (eablkybsjgVar == ((wkgbmnqykc) this.f2933zynmafqrjb.get(i13)).f2942zoijcleaow) {
                return i13;
            }
        }
        return -1;
    }

    private int yadqdtsiqt(int i13) {
        List list = this.f2933zynmafqrjb;
        ListView listViewIobyxmoadg = ((wkgbmnqykc) list.get(list.size() - 1)).iobyxmoadg();
        int[] iArr = new int[2];
        listViewIobyxmoadg.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2932ylkuphrtab.getWindowVisibleDisplayFrame(rect);
        if (this.f2924pkzmftpjix == 1) {
            return (iArr[0] + listViewIobyxmoadg.getWidth()) + i13 > rect.right ? 0 : 1;
        }
        return iArr[0] - i13 < 0 ? 1 : 0;
    }

    private MenuItem zynmafqrjb(eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
        int size = eablkybsjgVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = eablkybsjgVar.getItem(i13);
            if (item.hasSubMenu() && eablkybsjgVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // draadjrbmk.eablkybsjg
    public void dismiss() {
        int size = this.f2933zynmafqrjb.size();
        if (size > 0) {
            wkgbmnqykc[] wkgbmnqykcVarArr = (wkgbmnqykc[]) this.f2933zynmafqrjb.toArray(new wkgbmnqykc[size]);
            for (int i13 = size - 1; i13 >= 0; i13--) {
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykcVarArr[i13];
                if (wkgbmnqykcVar.f2940iobyxmoadg.zoijcleaow()) {
                    wkgbmnqykcVar.f2940iobyxmoadg.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    protected boolean draadjrbmk() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void eablkybsjg(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        this.f2926stevsuqkhv = iobyxmoadgVar;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void gtknphoqwx(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(this, this.f2931yggfygwlhe);
        if (zoijcleaow()) {
            iozdgvuglv(eablkybsjgVar);
        } else {
            this.f2925pmvmpeiblj.add(eablkybsjgVar);
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean gxszxtbevo(wflxmlrfwp wflxmlrfwpVar) {
        for (wkgbmnqykc wkgbmnqykcVar : this.f2933zynmafqrjb) {
            if (wflxmlrfwpVar == wkgbmnqykcVar.f2942zoijcleaow) {
                wkgbmnqykcVar.iobyxmoadg().requestFocus();
                return true;
            }
        }
        if (!wflxmlrfwpVar.hasVisibleItems()) {
            return false;
        }
        gtknphoqwx(wflxmlrfwpVar);
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2926stevsuqkhv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.wkgbmnqykc(wflxmlrfwpVar);
        }
        return true;
    }

    @Override // draadjrbmk.eablkybsjg
    public void iobyxmoadg() {
        if (zoijcleaow()) {
            return;
        }
        Iterator it = this.f2925pmvmpeiblj.iterator();
        while (it.hasNext()) {
            iozdgvuglv((eablkybsjg) it.next());
        }
        this.f2925pmvmpeiblj.clear();
        View view = this.f2928wwaezpbzkn;
        this.f2932ylkuphrtab = view;
        if (view != null) {
            boolean z13 = this.f2920kegysxyocb == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2920kegysxyocb = viewTreeObserver;
            if (z13) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2916istkbnxepw);
            }
            this.f2932ylkuphrtab.addOnAttachStateChangeListener(this.f2908cdpycssgdh);
        }
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void iwizpuwonk(int i13) {
        this.f2918jpowsppfya = true;
        this.f2909cllcsxoeiz = i13;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void jyumaefscl(boolean z13) {
        this.f2929wypolnanlu = z13;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void kcexrzcfyt(int i13) {
        if (this.f2915iozdgvuglv != i13) {
            this.f2915iozdgvuglv = i13;
            this.f2922lmojexxdyd = zdlpuopuiu.zoijcleaow(i13, this.f2928wwaezpbzkn.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void lqeggnwhkg(boolean z13) {
        Iterator it = this.f2933zynmafqrjb.iterator();
        while (it.hasNext()) {
            nufgyqmvbu.esjtqupxsv(((wkgbmnqykc) it.next()).iobyxmoadg().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean nufgyqmvbu() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void ojitshcjhn(View view) {
        if (this.f2928wwaezpbzkn != view) {
            this.f2928wwaezpbzkn = view;
            this.f2922lmojexxdyd = zdlpuopuiu.zoijcleaow(this.f2915iozdgvuglv, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        wkgbmnqykc wkgbmnqykcVar;
        int size = this.f2933zynmafqrjb.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                wkgbmnqykcVar = null;
                break;
            }
            wkgbmnqykcVar = (wkgbmnqykc) this.f2933zynmafqrjb.get(i13);
            if (!wkgbmnqykcVar.f2940iobyxmoadg.zoijcleaow()) {
                break;
            } else {
                i13++;
            }
        }
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.f2942zoijcleaow.eablkybsjg(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i13, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i13 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void oxmwwwfdhm(boolean z13) {
        this.f2911dsvhmnatus = z13;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, boolean z13) {
        int iPmvmpeiblj = pmvmpeiblj(eablkybsjgVar);
        if (iPmvmpeiblj < 0) {
            return;
        }
        int i13 = iPmvmpeiblj + 1;
        if (i13 < this.f2933zynmafqrjb.size()) {
            ((wkgbmnqykc) this.f2933zynmafqrjb.get(i13)).f2942zoijcleaow.eablkybsjg(false);
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f2933zynmafqrjb.remove(iPmvmpeiblj);
        wkgbmnqykcVar.f2942zoijcleaow.wypolnanlu(this);
        if (this.f2923mbcevpiqjq) {
            wkgbmnqykcVar.f2940iobyxmoadg.mbcevpiqjq(null);
            wkgbmnqykcVar.f2940iobyxmoadg.yadqdtsiqt(0);
        }
        wkgbmnqykcVar.f2940iobyxmoadg.dismiss();
        int size = this.f2933zynmafqrjb.size();
        if (size > 0) {
            this.f2924pkzmftpjix = ((wkgbmnqykc) this.f2933zynmafqrjb.get(size - 1)).f2941ppxfxbqfkf;
        } else {
            this.f2924pkzmftpjix = cdpycssgdh();
        }
        if (size != 0) {
            if (z13) {
                ((wkgbmnqykc) this.f2933zynmafqrjb.get(0)).f2942zoijcleaow.eablkybsjg(false);
                return;
            }
            return;
        }
        dismiss();
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2926stevsuqkhv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2920kegysxyocb;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2920kegysxyocb.removeGlobalOnLayoutListener(this.f2916istkbnxepw);
            }
            this.f2920kegysxyocb = null;
        }
        this.f2932ylkuphrtab.removeOnAttachStateChangeListener(this.f2908cdpycssgdh);
        this.f2927tzroggbefp.onDismiss();
    }

    @Override // draadjrbmk.eablkybsjg
    public ListView rgvfuqvkyq() {
        if (this.f2933zynmafqrjb.isEmpty()) {
            return null;
        }
        List list = this.f2933zynmafqrjb;
        return ((wkgbmnqykc) list.get(list.size() - 1)).iobyxmoadg();
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void yggfygwlhe(PopupWindow.OnDismissListener onDismissListener) {
        this.f2927tzroggbefp = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.nufgyqmvbu
    public void zdlpuopuiu(int i13) {
        this.f2913hcddaimhww = true;
        this.f2914hkdspvbjdz = i13;
    }

    @Override // draadjrbmk.eablkybsjg
    public boolean zoijcleaow() {
        return this.f2933zynmafqrjb.size() > 0 && ((wkgbmnqykc) this.f2933zynmafqrjb.get(0)).f2940iobyxmoadg.zoijcleaow();
    }
}
