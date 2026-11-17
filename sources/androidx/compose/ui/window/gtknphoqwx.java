package androidx.compose.ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import gg.wwaezpbzkn;
import java.util.List;
import v1.bfopjjpdmp;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx extends androidx.compose.ui.platform.iobyxmoadg implements pkzmftpjix {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f7369cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f7370iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final iwxlajgraz f7371istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f7372lmojexxdyd;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f7373yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Window f7374zynmafqrjb;

    public static final class iobyxmoadg extends bfopjjpdmp.zoijcleaow {
        iobyxmoadg() {
            super(1);
        }

        @Override // v1.bfopjjpdmp.zoijcleaow
        public skhdrjzrfn eablkybsjg(skhdrjzrfn skhdrjzrfnVar, List list) {
            gtknphoqwx gtknphoqwxVar = gtknphoqwx.this;
            if (gtknphoqwxVar.f7373yadqdtsiqt) {
                return skhdrjzrfnVar;
            }
            View childAt = gtknphoqwxVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, gtknphoqwxVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, gtknphoqwxVar.getHeight() - childAt.getBottom());
            return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? skhdrjzrfnVar : skhdrjzrfnVar.ojitshcjhn(iMax, iMax2, iMax3, iMax4);
        }

        @Override // v1.bfopjjpdmp.zoijcleaow
        public bfopjjpdmp.iobyxmoadg gxszxtbevo(bfopjjpdmp bfopjjpdmpVar, bfopjjpdmp.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwx gtknphoqwxVar = gtknphoqwx.this;
            if (gtknphoqwxVar.f7373yadqdtsiqt) {
                return iobyxmoadgVar;
            }
            View childAt = gtknphoqwxVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, gtknphoqwxVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, gtknphoqwxVar.getHeight() - childAt.getBottom());
            return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? iobyxmoadgVar : iobyxmoadgVar.ppxfxbqfkf(j1.wkgbmnqykc.zoijcleaow(iMax, iMax2, iMax3, iMax4));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f7376yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(int i13) {
            super(2);
            this.f7376yggfygwlhe = i13;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            gtknphoqwx.this.zoijcleaow(draadjrbmkVar, f.iobyxmoadg(this.f7376yggfygwlhe | 1));
        }
    }

    public gtknphoqwx(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f7374zynmafqrjb = window;
        this.f7371istkbnxepw = c1.ppxfxbqfkf(dxjokdxxww.f7365iobyxmoadg.iobyxmoadg(), null, 2, null);
        jhduphickx.igdgnonuha(this, this);
        jhduphickx.grlcpdaxtj(this, new iobyxmoadg());
    }

    private final tg.rgvfuqvkyq getContent() {
        return (tg.rgvfuqvkyq) this.f7371istkbnxepw.getValue();
    }

    private final void setContent(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f7371istkbnxepw.setValue(rgvfuqvkyqVar);
    }

    public final boolean agtfadlqog(MotionEvent motionEvent) {
        View childAt;
        int iWkgbmnqykc;
        float x13 = motionEvent.getX();
        if (Float.isInfinite(x13) || Float.isNaN(x13)) {
            return false;
        }
        float y13 = motionEvent.getY();
        if (Float.isInfinite(y13) || Float.isNaN(y13) || (childAt = getChildAt(0)) == null) {
            return false;
        }
        int left = getLeft() + childAt.getLeft();
        int width = childAt.getWidth() + left;
        int top = getTop() + childAt.getTop();
        int height = childAt.getHeight() + top;
        int iWkgbmnqykc2 = vg.iobyxmoadg.wkgbmnqykc(motionEvent.getX());
        return left <= iWkgbmnqykc2 && iWkgbmnqykc2 <= width && top <= (iWkgbmnqykc = vg.iobyxmoadg.wkgbmnqykc(motionEvent.getY())) && iWkgbmnqykc <= height;
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    public void dxjokdxxww(int i13, int i14) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.dxjokdxxww(i13, i14);
            return;
        }
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i14);
        int i15 = (mode != Integer.MIN_VALUE || this.f7369cdpycssgdh || this.f7373yadqdtsiqt || wflxmlrfwp().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i16 = size - paddingLeft;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = i15 - paddingTop;
        int i18 = i17 >= 0 ? i17 : 0;
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode2 != 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE);
        }
        childAt.measure(i13, i14);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, iMin);
        if (this.f7373yadqdtsiqt || childAt.getMeasuredHeight() + paddingTop <= size2 || wflxmlrfwp().getAttributes().height != -2) {
            return;
        }
        wflxmlrfwp().addFlags(Integer.MIN_VALUE);
        if (this.f7369cdpycssgdh) {
            return;
        }
        wflxmlrfwp().setLayout(-1, -1);
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7372lmojexxdyd;
    }

    @Override // v1.pkzmftpjix
    public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
        if (this.f7373yadqdtsiqt) {
            return skhdrjzrfnVar;
        }
        View childAt = getChildAt(0);
        int iMax = Math.max(0, childAt.getLeft());
        int iMax2 = Math.max(0, childAt.getTop());
        int iMax3 = Math.max(0, getWidth() - childAt.getRight());
        int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
        return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? skhdrjzrfnVar : skhdrjzrfnVar.ojitshcjhn(iMax, iMax2, iMax3, iMax4);
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    public void nufgyqmvbu(boolean z13, int i13, int i14, int i15, int i16) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i17 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i18 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    public final void ojitshcjhn(cqumvgiudr cqumvgiudrVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        setParentCompositionContext(cqumvgiudrVar);
        setContent(rgvfuqvkyqVar);
        this.f7372lmojexxdyd = true;
        eablkybsjg();
    }

    public final void rgvfuqvkyq(boolean z13, boolean z14) {
        boolean z15 = (this.f7370iozdgvuglv && z13 == this.f7369cdpycssgdh && z14 == this.f7373yadqdtsiqt) ? false : true;
        this.f7369cdpycssgdh = z13;
        this.f7373yadqdtsiqt = z14;
        if (z15) {
            WindowManager.LayoutParams attributes = wflxmlrfwp().getAttributes();
            int i13 = z13 ? -2 : -1;
            if (i13 == attributes.width && this.f7370iozdgvuglv) {
                return;
            }
            wflxmlrfwp().setLayout(i13, -2);
            this.f7370iozdgvuglv = true;
        }
    }

    public Window wflxmlrfwp() {
        return this.f7374zynmafqrjb;
    }

    @Override // androidx.compose.ui.platform.iobyxmoadg
    public void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1735448596);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 3) != 2, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1735448596, i14, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:432)");
            }
            getContent().invoke(draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new zoijcleaow(i13));
        }
    }
}
