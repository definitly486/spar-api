package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.rgvfuqvkyq;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.ojitshcjhn;
import da.gtknphoqwx;
import da.nufgyqmvbu;
import ra.lqeggnwhkg;
import v1.jhduphickx;
import v1.oipsdeybqn;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends rgvfuqvkyq {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    boolean f22240cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private BottomSheetBehavior f22241esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f22242iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    boolean f22243istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private FrameLayout f22244lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private gxszxtbevo f22245lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private BottomSheetBehavior.lqeggnwhkg f22246pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private CoordinatorLayout f22247pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f22248wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f22249yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private na.ppxfxbqfkf f22250ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private FrameLayout f22251zynmafqrjb;

    class eablkybsjg extends BottomSheetBehavior.lqeggnwhkg {
        eablkybsjg() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void ppxfxbqfkf(View view, int i13) {
            if (i13 == 5) {
                ppxfxbqfkf.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void zoijcleaow(View view, float f13) {
        }
    }

    private static class gxszxtbevo extends BottomSheetBehavior.lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Boolean f22253iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Window f22254ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f22255wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final skhdrjzrfn f22256zoijcleaow;

        /* synthetic */ gxszxtbevo(View view, skhdrjzrfn skhdrjzrfnVar, iobyxmoadg iobyxmoadgVar) {
            this(view, skhdrjzrfnVar);
        }

        private void wkgbmnqykc(View view) {
            if (view.getTop() < this.f22256zoijcleaow.wflxmlrfwp()) {
                Window window = this.f22254ppxfxbqfkf;
                if (window != null) {
                    Boolean bool = this.f22253iobyxmoadg;
                    com.google.android.material.internal.ppxfxbqfkf.gxszxtbevo(window, bool == null ? this.f22255wkgbmnqykc : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f22256zoijcleaow.wflxmlrfwp() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f22254ppxfxbqfkf;
                if (window2 != null) {
                    com.google.android.material.internal.ppxfxbqfkf.gxszxtbevo(window2, this.f22255wkgbmnqykc);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        void eablkybsjg(Window window) {
            if (this.f22254ppxfxbqfkf == window) {
                return;
            }
            this.f22254ppxfxbqfkf = window;
            if (window != null) {
                this.f22255wkgbmnqykc = oipsdeybqn.iobyxmoadg(window, window.getDecorView()).zoijcleaow();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        void iobyxmoadg(View view) {
            wkgbmnqykc(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void ppxfxbqfkf(View view, int i13) {
            wkgbmnqykc(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void zoijcleaow(View view, float f13) {
            wkgbmnqykc(view);
        }

        private gxszxtbevo(View view, skhdrjzrfn skhdrjzrfnVar) {
            this.f22256zoijcleaow = skhdrjzrfnVar;
            lqeggnwhkg lqeggnwhkgVarZeieaojujs = BottomSheetBehavior.iyctptxqzt(view).zeieaojujs();
            ColorStateList colorStateListCqumvgiudr = lqeggnwhkgVarZeieaojujs != null ? lqeggnwhkgVarZeieaojujs.cqumvgiudr() : jhduphickx.oxmwwwfdhm(view);
            if (colorStateListCqumvgiudr != null) {
                this.f22253iobyxmoadg = Boolean.valueOf(ia.iobyxmoadg.nufgyqmvbu(colorStateListCqumvgiudr.getDefaultColor()));
                return;
            }
            Integer numWkgbmnqykc = ojitshcjhn.wkgbmnqykc(view);
            if (numWkgbmnqykc != null) {
                this.f22253iobyxmoadg = Boolean.valueOf(ia.iobyxmoadg.nufgyqmvbu(numWkgbmnqykc.intValue()));
            } else {
                this.f22253iobyxmoadg = null;
            }
        }
    }

    class iobyxmoadg implements pkzmftpjix {
        iobyxmoadg() {
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            if (ppxfxbqfkf.this.f22245lmojexxdyd != null) {
                ppxfxbqfkf.this.f22241esjtqupxsv.wizcaqwiak(ppxfxbqfkf.this.f22245lmojexxdyd);
            }
            if (skhdrjzrfnVar != null) {
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                ppxfxbqfkfVar.f22245lmojexxdyd = new gxszxtbevo(ppxfxbqfkfVar.f22251zynmafqrjb, skhdrjzrfnVar, null);
                ppxfxbqfkf.this.f22245lmojexxdyd.eablkybsjg(ppxfxbqfkf.this.getWindow());
                ppxfxbqfkf.this.f22241esjtqupxsv.ikoacuggdj(ppxfxbqfkf.this.f22245lmojexxdyd);
            }
            return skhdrjzrfnVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    class C0396ppxfxbqfkf extends v1.iobyxmoadg {
        C0396ppxfxbqfkf() {
        }

        @Override // v1.iobyxmoadg
        public boolean btonecajqb(View view, int i13, Bundle bundle) {
            if (i13 == 1048576) {
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                if (ppxfxbqfkfVar.f22240cdpycssgdh) {
                    ppxfxbqfkfVar.cancel();
                    return true;
                }
            }
            return super.btonecajqb(view, i13, bundle);
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            if (!ppxfxbqfkf.this.f22240cdpycssgdh) {
                zdlpuopuiuVar.bfopjjpdmp(false);
            } else {
                zdlpuopuiuVar.iobyxmoadg(1048576);
                zdlpuopuiuVar.bfopjjpdmp(true);
            }
        }
    }

    class wkgbmnqykc implements View.OnTouchListener {
        wkgbmnqykc() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class zoijcleaow implements View.OnClickListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
            if (ppxfxbqfkfVar.f22240cdpycssgdh && ppxfxbqfkfVar.isShowing() && ppxfxbqfkf.this.oxmwwwfdhm()) {
                ppxfxbqfkf.this.cancel();
            }
        }
    }

    public ppxfxbqfkf(Context context, int i13) {
        super(context, gxszxtbevo(context, i13));
        this.f22240cdpycssgdh = true;
        this.f22249yadqdtsiqt = true;
        this.f22246pkzmftpjix = new eablkybsjg();
        dxjokdxxww(1);
        this.f22248wwaezpbzkn = getContext().getTheme().obtainStyledAttributes(new int[]{da.zoijcleaow.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout agtfadlqog() {
        if (this.f22244lereixgezr == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), nufgyqmvbu.design_bottom_sheet_dialog, null);
            this.f22244lereixgezr = frameLayout;
            this.f22247pmvmpeiblj = (CoordinatorLayout) frameLayout.findViewById(da.gxszxtbevo.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f22244lereixgezr.findViewById(da.gxszxtbevo.design_bottom_sheet);
            this.f22251zynmafqrjb = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorIyctptxqzt = BottomSheetBehavior.iyctptxqzt(frameLayout2);
            this.f22241esjtqupxsv = bottomSheetBehaviorIyctptxqzt;
            bottomSheetBehaviorIyctptxqzt.ikoacuggdj(this.f22246pkzmftpjix);
            this.f22241esjtqupxsv.fmlbqenlif(this.f22240cdpycssgdh);
            this.f22250ylkuphrtab = new na.ppxfxbqfkf(this.f22241esjtqupxsv, this.f22251zynmafqrjb);
        }
        return this.f22244lereixgezr;
    }

    private static int gxszxtbevo(Context context, int i13) {
        if (i13 != 0) {
            return i13;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(da.zoijcleaow.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : gtknphoqwx.Theme_Design_Light_BottomSheetDialog;
    }

    private void kcexrzcfyt() {
        na.ppxfxbqfkf ppxfxbqfkfVar = this.f22250ylkuphrtab;
        if (ppxfxbqfkfVar == null) {
            return;
        }
        if (this.f22240cdpycssgdh) {
            ppxfxbqfkfVar.zoijcleaow();
        } else {
            ppxfxbqfkfVar.wkgbmnqykc();
        }
    }

    private View zdlpuopuiu(int i13, View view, ViewGroup.LayoutParams layoutParams) {
        agtfadlqog();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f22244lereixgezr.findViewById(da.gxszxtbevo.coordinator);
        if (i13 != 0 && view == null) {
            view = getLayoutInflater().inflate(i13, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f22248wwaezpbzkn) {
            jhduphickx.igdgnonuha(this.f22251zynmafqrjb, new iobyxmoadg());
        }
        this.f22251zynmafqrjb.removeAllViews();
        if (layoutParams == null) {
            this.f22251zynmafqrjb.addView(view);
        } else {
            this.f22251zynmafqrjb.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(da.gxszxtbevo.touch_outside).setOnClickListener(new zoijcleaow());
        jhduphickx.oipsdeybqn(this.f22251zynmafqrjb, new C0396ppxfxbqfkf());
        this.f22251zynmafqrjb.setOnTouchListener(new wkgbmnqykc());
        return this.f22244lereixgezr;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorOjitshcjhn = ojitshcjhn();
        if (!this.f22243istkbnxepw || bottomSheetBehaviorOjitshcjhn.nuxfzjnpeb() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorOjitshcjhn.c(5);
        }
    }

    public BottomSheetBehavior ojitshcjhn() {
        if (this.f22241esjtqupxsv == null) {
            agtfadlqog();
        }
        return this.f22241esjtqupxsv;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z13 = this.f22248wwaezpbzkn && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f22244lereixgezr;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z13);
            }
            CoordinatorLayout coordinatorLayout = this.f22247pmvmpeiblj;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z13);
            }
            oipsdeybqn.zoijcleaow(window, !z13);
            gxszxtbevo gxszxtbevoVar = this.f22245lmojexxdyd;
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.eablkybsjg(window);
            }
        }
        kcexrzcfyt();
    }

    @Override // androidx.appcompat.app.rgvfuqvkyq, androidx.activity.draadjrbmk, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        gxszxtbevo gxszxtbevoVar = this.f22245lmojexxdyd;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.eablkybsjg(null);
        }
        na.ppxfxbqfkf ppxfxbqfkfVar = this.f22250ylkuphrtab;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.wkgbmnqykc();
        }
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f22241esjtqupxsv;
        if (bottomSheetBehavior == null || bottomSheetBehavior.nuxfzjnpeb() != 5) {
            return;
        }
        this.f22241esjtqupxsv.c(4);
    }

    boolean oxmwwwfdhm() {
        if (!this.f22242iozdgvuglv) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f22249yadqdtsiqt = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f22242iozdgvuglv = true;
        }
        return this.f22249yadqdtsiqt;
    }

    public boolean rgvfuqvkyq() {
        return this.f22243istkbnxepw;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z13) {
        super.setCancelable(z13);
        if (this.f22240cdpycssgdh != z13) {
            this.f22240cdpycssgdh = z13;
            BottomSheetBehavior bottomSheetBehavior = this.f22241esjtqupxsv;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.fmlbqenlif(z13);
            }
            if (getWindow() != null) {
                kcexrzcfyt();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z13) {
        super.setCanceledOnTouchOutside(z13);
        if (z13 && !this.f22240cdpycssgdh) {
            this.f22240cdpycssgdh = true;
        }
        this.f22249yadqdtsiqt = z13;
        this.f22242iozdgvuglv = true;
    }

    @Override // androidx.appcompat.app.rgvfuqvkyq, androidx.activity.draadjrbmk, android.app.Dialog
    public void setContentView(int i13) {
        super.setContentView(zdlpuopuiu(i13, null, null));
    }

    void vdvldrhtss() {
        this.f22241esjtqupxsv.wizcaqwiak(this.f22246pkzmftpjix);
    }

    @Override // androidx.appcompat.app.rgvfuqvkyq, androidx.activity.draadjrbmk, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(zdlpuopuiu(0, view, null));
    }

    @Override // androidx.appcompat.app.rgvfuqvkyq, androidx.activity.draadjrbmk, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(zdlpuopuiu(0, view, layoutParams));
    }
}
