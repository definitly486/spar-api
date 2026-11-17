package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ylkuphrtab implements draadjrbmk.eablkybsjg {

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private static Method f3457ribwqtqdhb;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private static Method f3458vipkmwdibw;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f3459cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private AdapterView.OnItemClickListener f3460cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f3461cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f3462crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f3463dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f3464esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private DataSetObserver f3465hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private Drawable f3466hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f3467iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f3468istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f3469iwizpuwonk;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    PopupWindow f3470jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private View f3471jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    iozdgvuglv f3472jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final lqeggnwhkg f3473kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f3474lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f3475lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private Runnable f3476mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    final Handler f3477ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f3478pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f3479pmvmpeiblj;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private Rect f3480sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final nufgyqmvbu f3481stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final eablkybsjg f3482tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final Rect f3483ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    int f3484wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    final dxjokdxxww f3485wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f3486yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ListAdapter f3487yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private View f3488ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Context f3489zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f3490zynmafqrjb;

    private class dxjokdxxww implements Runnable {
        dxjokdxxww() {
        }

        @Override // java.lang.Runnable
        public void run() {
            iozdgvuglv iozdgvuglvVar = ylkuphrtab.this.f3472jyumaefscl;
            if (iozdgvuglvVar == null || !iozdgvuglvVar.isAttachedToWindow() || ylkuphrtab.this.f3472jyumaefscl.getCount() <= ylkuphrtab.this.f3472jyumaefscl.getChildCount()) {
                return;
            }
            int childCount = ylkuphrtab.this.f3472jyumaefscl.getChildCount();
            ylkuphrtab ylkuphrtabVar = ylkuphrtab.this;
            if (childCount <= ylkuphrtabVar.f3484wwaezpbzkn) {
                ylkuphrtabVar.f3470jlmebxxoox.setInputMethodMode(2);
                ylkuphrtab.this.iobyxmoadg();
            }
        }
    }

    private class eablkybsjg implements Runnable {
        eablkybsjg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ylkuphrtab.this.oxmwwwfdhm();
        }
    }

    private class gxszxtbevo extends DataSetObserver {
        gxszxtbevo() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ylkuphrtab.this.zoijcleaow()) {
                ylkuphrtab.this.iobyxmoadg();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ylkuphrtab.this.dismiss();
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewZdlpuopuiu = ylkuphrtab.this.zdlpuopuiu();
            if (viewZdlpuopuiu == null || viewZdlpuopuiu.getWindowToken() == null) {
                return;
            }
            ylkuphrtab.this.iobyxmoadg();
        }
    }

    private class lqeggnwhkg implements AbsListView.OnScrollListener {
        lqeggnwhkg() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i13, int i14, int i15) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i13) {
            if (i13 != 1 || ylkuphrtab.this.pmvmpeiblj() || ylkuphrtab.this.f3470jlmebxxoox.getContentView() == null) {
                return;
            }
            ylkuphrtab ylkuphrtabVar = ylkuphrtab.this;
            ylkuphrtabVar.f3477ntlheqmsrt.removeCallbacks(ylkuphrtabVar.f3485wypolnanlu);
            ylkuphrtab.this.f3485wypolnanlu.run();
        }
    }

    private class nufgyqmvbu implements View.OnTouchListener {
        nufgyqmvbu() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x13 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ylkuphrtab.this.f3470jlmebxxoox) != null && popupWindow.isShowing() && x13 >= 0 && x13 < ylkuphrtab.this.f3470jlmebxxoox.getWidth() && y13 >= 0 && y13 < ylkuphrtab.this.f3470jlmebxxoox.getHeight()) {
                ylkuphrtab ylkuphrtabVar = ylkuphrtab.this;
                ylkuphrtabVar.f3477ntlheqmsrt.postDelayed(ylkuphrtabVar.f3485wypolnanlu, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ylkuphrtab ylkuphrtabVar2 = ylkuphrtab.this;
            ylkuphrtabVar2.f3477ntlheqmsrt.removeCallbacks(ylkuphrtabVar2.f3485wypolnanlu);
            return false;
        }
    }

    static class ppxfxbqfkf {
        static int iobyxmoadg(PopupWindow popupWindow, View view, int i13, boolean z13) {
            return popupWindow.getMaxAvailableHeight(view, i13, z13);
        }
    }

    static class wkgbmnqykc {
        static void iobyxmoadg(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void zoijcleaow(PopupWindow popupWindow, boolean z13) {
            popupWindow.setIsClippedToScreen(z13);
        }
    }

    class zoijcleaow implements AdapterView.OnItemSelectedListener {
        zoijcleaow() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i13, long j13) {
            iozdgvuglv iozdgvuglvVar;
            if (i13 == -1 || (iozdgvuglvVar = ylkuphrtab.this.f3472jyumaefscl) == null) {
                return;
            }
            iozdgvuglvVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3457ribwqtqdhb = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3458vipkmwdibw = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ylkuphrtab(Context context) {
        this(context, null, lqeggnwhkg.iobyxmoadg.listPopupWindowStyle);
    }

    private void dsvhmnatus(boolean z13) {
        if (Build.VERSION.SDK_INT > 28) {
            wkgbmnqykc.zoijcleaow(this.f3470jlmebxxoox, z13);
            return;
        }
        Method method = f3457ribwqtqdhb;
        if (method != null) {
            try {
                method.invoke(this.f3470jlmebxxoox, Boolean.valueOf(z13));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private void istkbnxepw() {
        View view = this.f3488ylkuphrtab;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3488ylkuphrtab);
            }
        }
    }

    private int vdvldrhtss() {
        int measuredHeight;
        int i13;
        int iMakeMeasureSpec;
        View view;
        int i14;
        if (this.f3472jyumaefscl == null) {
            Context context = this.f3489zdlpuopuiu;
            this.f3476mbcevpiqjq = new iobyxmoadg();
            iozdgvuglv iozdgvuglvVarKcexrzcfyt = kcexrzcfyt(context, !this.f3462crxdokpmqz);
            this.f3472jyumaefscl = iozdgvuglvVarKcexrzcfyt;
            Drawable drawable = this.f3466hkdspvbjdz;
            if (drawable != null) {
                iozdgvuglvVarKcexrzcfyt.setSelector(drawable);
            }
            this.f3472jyumaefscl.setAdapter(this.f3487yggfygwlhe);
            this.f3472jyumaefscl.setOnItemClickListener(this.f3460cllcsxoeiz);
            this.f3472jyumaefscl.setFocusable(true);
            this.f3472jyumaefscl.setFocusableInTouchMode(true);
            this.f3472jyumaefscl.setOnItemSelectedListener(new zoijcleaow());
            this.f3472jyumaefscl.setOnScrollListener(this.f3473kegysxyocb);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3463dsvhmnatus;
            if (onItemSelectedListener != null) {
                this.f3472jyumaefscl.setOnItemSelectedListener(onItemSelectedListener);
            }
            iozdgvuglv iozdgvuglvVar = this.f3472jyumaefscl;
            View view2 = this.f3488ylkuphrtab;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i15 = this.f3478pkzmftpjix;
                if (i15 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(iozdgvuglvVar, layoutParams);
                } else if (i15 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f3478pkzmftpjix);
                } else {
                    linearLayout.addView(iozdgvuglvVar, layoutParams);
                    linearLayout.addView(view2);
                }
                int i16 = this.f3461cqumvgiudr;
                if (i16 >= 0) {
                    i14 = Integer.MIN_VALUE;
                } else {
                    i16 = 0;
                    i14 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i16, i14), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = iozdgvuglvVar;
            }
            this.f3470jlmebxxoox.setContentView(view);
        } else {
            View view3 = this.f3488ylkuphrtab;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f3470jlmebxxoox.getBackground();
        if (background != null) {
            background.getPadding(this.f3483ulzqkzuiru);
            Rect rect = this.f3483ulzqkzuiru;
            int i17 = rect.top;
            i13 = rect.bottom + i17;
            if (!this.f3490zynmafqrjb) {
                this.f3474lereixgezr = -i17;
            }
        } else {
            this.f3483ulzqkzuiru.setEmpty();
            i13 = 0;
        }
        int iYggfygwlhe = yggfygwlhe(zdlpuopuiu(), this.f3474lereixgezr, this.f3470jlmebxxoox.getInputMethodMode() == 2);
        if (this.f3467iozdgvuglv || this.f3469iwizpuwonk == -1) {
            return iYggfygwlhe + i13;
        }
        int i18 = this.f3461cqumvgiudr;
        if (i18 == -2) {
            int i19 = this.f3489zdlpuopuiu.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f3483ulzqkzuiru;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i18 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
        } else {
            int i23 = this.f3489zdlpuopuiu.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f3483ulzqkzuiru;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - (rect3.left + rect3.right), 1073741824);
        }
        int iWkgbmnqykc = this.f3472jyumaefscl.wkgbmnqykc(iMakeMeasureSpec, 0, -1, iYggfygwlhe - measuredHeight, -1);
        if (iWkgbmnqykc > 0) {
            measuredHeight += i13 + this.f3472jyumaefscl.getPaddingTop() + this.f3472jyumaefscl.getPaddingBottom();
        }
        return iWkgbmnqykc + measuredHeight;
    }

    private int yggfygwlhe(View view, int i13, boolean z13) {
        return ppxfxbqfkf.iobyxmoadg(this.f3470jlmebxxoox, view, i13, z13);
    }

    public void agtfadlqog(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3465hcddaimhww;
        if (dataSetObserver == null) {
            this.f3465hcddaimhww = new gxszxtbevo();
        } else {
            ListAdapter listAdapter2 = this.f3487yggfygwlhe;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3487yggfygwlhe = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3465hcddaimhww);
        }
        iozdgvuglv iozdgvuglvVar = this.f3472jyumaefscl;
        if (iozdgvuglvVar != null) {
            iozdgvuglvVar.setAdapter(this.f3487yggfygwlhe);
        }
    }

    public void btonecajqb(int i13) {
        this.f3474lereixgezr = i13;
        this.f3490zynmafqrjb = true;
    }

    public void cdpycssgdh(View view) {
        this.f3471jpowsppfya = view;
    }

    public void cllcsxoeiz(boolean z13) {
        this.f3459cdpycssgdh = true;
        this.f3468istkbnxepw = z13;
    }

    public int cqumvgiudr() {
        if (zoijcleaow()) {
            return this.f3472jyumaefscl.getSelectedItemPosition();
        }
        return -1;
    }

    @Override // draadjrbmk.eablkybsjg
    public void dismiss() {
        this.f3470jlmebxxoox.dismiss();
        istkbnxepw();
        this.f3470jlmebxxoox.setContentView(null);
        this.f3472jyumaefscl = null;
        this.f3477ntlheqmsrt.removeCallbacks(this.f3485wypolnanlu);
    }

    public View esjtqupxsv() {
        if (zoijcleaow()) {
            return this.f3472jyumaefscl.getSelectedView();
        }
        return null;
    }

    public void gxszxtbevo(int i13) {
        this.f3464esjtqupxsv = i13;
    }

    public void hcddaimhww(PopupWindow.OnDismissListener onDismissListener) {
        this.f3470jlmebxxoox.setOnDismissListener(onDismissListener);
    }

    public void hkdspvbjdz(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f3463dsvhmnatus = onItemSelectedListener;
    }

    @Override // draadjrbmk.eablkybsjg
    public void iobyxmoadg() {
        int iVdvldrhtss = vdvldrhtss();
        boolean zPmvmpeiblj = pmvmpeiblj();
        androidx.core.widget.nufgyqmvbu.zoijcleaow(this.f3470jlmebxxoox, this.f3479pmvmpeiblj);
        if (this.f3470jlmebxxoox.isShowing()) {
            if (zdlpuopuiu().isAttachedToWindow()) {
                int width = this.f3461cqumvgiudr;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = zdlpuopuiu().getWidth();
                }
                int i13 = this.f3469iwizpuwonk;
                if (i13 == -1) {
                    if (!zPmvmpeiblj) {
                        iVdvldrhtss = -1;
                    }
                    if (zPmvmpeiblj) {
                        this.f3470jlmebxxoox.setWidth(this.f3461cqumvgiudr == -1 ? -1 : 0);
                        this.f3470jlmebxxoox.setHeight(0);
                    } else {
                        this.f3470jlmebxxoox.setWidth(this.f3461cqumvgiudr == -1 ? -1 : 0);
                        this.f3470jlmebxxoox.setHeight(-1);
                    }
                } else if (i13 != -2) {
                    iVdvldrhtss = i13;
                }
                this.f3470jlmebxxoox.setOutsideTouchable((this.f3475lmojexxdyd || this.f3467iozdgvuglv) ? false : true);
                this.f3470jlmebxxoox.update(zdlpuopuiu(), this.f3464esjtqupxsv, this.f3474lereixgezr, width < 0 ? -1 : width, iVdvldrhtss < 0 ? -1 : iVdvldrhtss);
                return;
            }
            return;
        }
        int width2 = this.f3461cqumvgiudr;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = zdlpuopuiu().getWidth();
        }
        int i14 = this.f3469iwizpuwonk;
        if (i14 == -1) {
            iVdvldrhtss = -1;
        } else if (i14 != -2) {
            iVdvldrhtss = i14;
        }
        this.f3470jlmebxxoox.setWidth(width2);
        this.f3470jlmebxxoox.setHeight(iVdvldrhtss);
        dsvhmnatus(true);
        this.f3470jlmebxxoox.setOutsideTouchable((this.f3475lmojexxdyd || this.f3467iozdgvuglv) ? false : true);
        this.f3470jlmebxxoox.setTouchInterceptor(this.f3481stevsuqkhv);
        if (this.f3459cdpycssgdh) {
            androidx.core.widget.nufgyqmvbu.iobyxmoadg(this.f3470jlmebxxoox, this.f3468istkbnxepw);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3458vipkmwdibw;
            if (method != null) {
                try {
                    method.invoke(this.f3470jlmebxxoox, this.f3480sopmlzcsov);
                } catch (Exception e13) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e13);
                }
            }
        } else {
            wkgbmnqykc.iobyxmoadg(this.f3470jlmebxxoox, this.f3480sopmlzcsov);
        }
        androidx.core.widget.nufgyqmvbu.ppxfxbqfkf(this.f3470jlmebxxoox, zdlpuopuiu(), this.f3464esjtqupxsv, this.f3474lereixgezr, this.f3486yadqdtsiqt);
        this.f3472jyumaefscl.setSelection(-1);
        if (!this.f3462crxdokpmqz || this.f3472jyumaefscl.isInTouchMode()) {
            oxmwwwfdhm();
        }
        if (this.f3462crxdokpmqz) {
            return;
        }
        this.f3477ntlheqmsrt.post(this.f3482tzroggbefp);
    }

    public void iozdgvuglv(int i13) {
        Drawable background = this.f3470jlmebxxoox.getBackground();
        if (background == null) {
            kegysxyocb(i13);
            return;
        }
        background.getPadding(this.f3483ulzqkzuiru);
        Rect rect = this.f3483ulzqkzuiru;
        this.f3461cqumvgiudr = rect.left + rect.right + i13;
    }

    public long iwizpuwonk() {
        if (zoijcleaow()) {
            return this.f3472jyumaefscl.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public void jpowsppfya(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3460cllcsxoeiz = onItemClickListener;
    }

    public Object jyumaefscl() {
        if (zoijcleaow()) {
            return this.f3472jyumaefscl.getSelectedItem();
        }
        return null;
    }

    iozdgvuglv kcexrzcfyt(Context context, boolean z13) {
        return new iozdgvuglv(context, z13);
    }

    public void kegysxyocb(int i13) {
        this.f3461cqumvgiudr = i13;
    }

    public int lereixgezr() {
        return this.f3461cqumvgiudr;
    }

    public void lmojexxdyd(int i13) {
        this.f3486yadqdtsiqt = i13;
    }

    public Drawable nufgyqmvbu() {
        return this.f3470jlmebxxoox.getBackground();
    }

    public void oxmwwwfdhm() {
        iozdgvuglv iozdgvuglvVar = this.f3472jyumaefscl;
        if (iozdgvuglvVar != null) {
            iozdgvuglvVar.setListSelectionHidden(true);
            iozdgvuglvVar.requestLayout();
        }
    }

    public void pkzmftpjix(boolean z13) {
        this.f3462crxdokpmqz = z13;
        this.f3470jlmebxxoox.setFocusable(z13);
    }

    public boolean pmvmpeiblj() {
        return this.f3470jlmebxxoox.getInputMethodMode() == 2;
    }

    public void ppxfxbqfkf(Drawable drawable) {
        this.f3470jlmebxxoox.setBackgroundDrawable(drawable);
    }

    @Override // draadjrbmk.eablkybsjg
    public ListView rgvfuqvkyq() {
        return this.f3472jyumaefscl;
    }

    public void stevsuqkhv(int i13) {
        iozdgvuglv iozdgvuglvVar = this.f3472jyumaefscl;
        if (!zoijcleaow() || iozdgvuglvVar == null) {
            return;
        }
        iozdgvuglvVar.setListSelectionHidden(false);
        iozdgvuglvVar.setSelection(i13);
        if (iozdgvuglvVar.getChoiceMode() != 0) {
            iozdgvuglvVar.setItemChecked(i13, true);
        }
    }

    public int wflxmlrfwp() {
        if (this.f3490zynmafqrjb) {
            return this.f3474lereixgezr;
        }
        return 0;
    }

    public int wkgbmnqykc() {
        return this.f3464esjtqupxsv;
    }

    public void wwaezpbzkn(Rect rect) {
        this.f3480sopmlzcsov = rect != null ? new Rect(rect) : null;
    }

    public void wypolnanlu(int i13) {
        this.f3478pkzmftpjix = i13;
    }

    public void yadqdtsiqt(int i13) {
        this.f3470jlmebxxoox.setAnimationStyle(i13);
    }

    public void ylkuphrtab(int i13) {
        this.f3470jlmebxxoox.setInputMethodMode(i13);
    }

    public View zdlpuopuiu() {
        return this.f3471jpowsppfya;
    }

    @Override // draadjrbmk.eablkybsjg
    public boolean zoijcleaow() {
        return this.f3470jlmebxxoox.isShowing();
    }

    public boolean zynmafqrjb() {
        return this.f3462crxdokpmqz;
    }

    public ylkuphrtab(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public ylkuphrtab(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f3469iwizpuwonk = -2;
        this.f3461cqumvgiudr = -2;
        this.f3479pmvmpeiblj = 1002;
        this.f3486yadqdtsiqt = 0;
        this.f3467iozdgvuglv = false;
        this.f3475lmojexxdyd = false;
        this.f3484wwaezpbzkn = Integer.MAX_VALUE;
        this.f3478pkzmftpjix = 0;
        this.f3485wypolnanlu = new dxjokdxxww();
        this.f3481stevsuqkhv = new nufgyqmvbu();
        this.f3473kegysxyocb = new lqeggnwhkg();
        this.f3482tzroggbefp = new eablkybsjg();
        this.f3483ulzqkzuiru = new Rect();
        this.f3489zdlpuopuiu = context;
        this.f3477ntlheqmsrt = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.ListPopupWindow, i13, i14);
        this.f3464esjtqupxsv = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lqeggnwhkg.btonecajqb.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lqeggnwhkg.btonecajqb.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f3474lereixgezr = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3490zynmafqrjb = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        agtfadlqog agtfadlqogVar = new agtfadlqog(context, attributeSet, i13, i14);
        this.f3470jlmebxxoox = agtfadlqogVar;
        agtfadlqogVar.setInputMethodMode(1);
    }
}
