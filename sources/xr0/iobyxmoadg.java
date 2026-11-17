package xr0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg extends Dialog {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f123133jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f123134yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected a6.iobyxmoadg f123135zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final C3107iobyxmoadg f123132iwizpuwonk = new C3107iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f123131cqumvgiudr = 8;

    /* JADX INFO: renamed from: xr0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3107iobyxmoadg {
        public /* synthetic */ C3107iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3107iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final int f123136gxszxtbevo = 0;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f123137eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f123138iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f123139ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f123140wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f123141zoijcleaow;

        public zoijcleaow(float f13, int i13, int i14, boolean z13, boolean z14) {
            this.f123138iobyxmoadg = f13;
            this.f123141zoijcleaow = i13;
            this.f123139ppxfxbqfkf = i14;
            this.f123140wkgbmnqykc = z13;
            this.f123137eablkybsjg = z14;
        }

        public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, float f13, int i13, int i14, boolean z13, boolean z14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                f13 = zoijcleaowVar.f123138iobyxmoadg;
            }
            if ((i15 & 2) != 0) {
                i13 = zoijcleaowVar.f123141zoijcleaow;
            }
            int i16 = i13;
            if ((i15 & 4) != 0) {
                i14 = zoijcleaowVar.f123139ppxfxbqfkf;
            }
            int i17 = i14;
            if ((i15 & 8) != 0) {
                z13 = zoijcleaowVar.f123140wkgbmnqykc;
            }
            boolean z15 = z13;
            if ((i15 & 16) != 0) {
                z14 = zoijcleaowVar.f123137eablkybsjg;
            }
            return zoijcleaowVar.iobyxmoadg(f13, i16, i17, z15, z14);
        }

        public final boolean eablkybsjg() {
            return this.f123137eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return Float.compare(this.f123138iobyxmoadg, zoijcleaowVar.f123138iobyxmoadg) == 0 && this.f123141zoijcleaow == zoijcleaowVar.f123141zoijcleaow && this.f123139ppxfxbqfkf == zoijcleaowVar.f123139ppxfxbqfkf && this.f123140wkgbmnqykc == zoijcleaowVar.f123140wkgbmnqykc && this.f123137eablkybsjg == zoijcleaowVar.f123137eablkybsjg;
        }

        public final int gxszxtbevo() {
            return this.f123141zoijcleaow;
        }

        public int hashCode() {
            return (((((((Float.hashCode(this.f123138iobyxmoadg) * 31) + Integer.hashCode(this.f123141zoijcleaow)) * 31) + Integer.hashCode(this.f123139ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f123140wkgbmnqykc)) * 31) + Boolean.hashCode(this.f123137eablkybsjg);
        }

        public final zoijcleaow iobyxmoadg(float f13, int i13, int i14, boolean z13, boolean z14) {
            return new zoijcleaow(f13, i13, i14, z13, z14);
        }

        public final boolean lqeggnwhkg() {
            return this.f123140wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return this.f123139ppxfxbqfkf;
        }

        public String toString() {
            return "Config(dimAmount=" + this.f123138iobyxmoadg + ", width=" + this.f123141zoijcleaow + ", backgroundColor=" + this.f123139ppxfxbqfkf + ", isCancelable=" + this.f123140wkgbmnqykc + ", noTitle=" + this.f123137eablkybsjg + ")";
        }

        public final float wkgbmnqykc() {
            return this.f123138iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f123134yggfygwlhe = new ArrayList();
        this.f123133jyumaefscl = new zoijcleaow(0.85f, -1, 0, true, true);
    }

    private final void zoijcleaow() {
        Iterator it = this.f123134yggfygwlhe.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(this);
        }
        this.f123134yggfygwlhe.clear();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        zoijcleaow();
        super.dismiss();
    }

    protected final void eablkybsjg(a6.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<set-?>");
        this.f123135zdlpuopuiu = iobyxmoadgVar;
    }

    protected abstract a6.iobyxmoadg iobyxmoadg();

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (wkgbmnqykc().eablkybsjg()) {
            requestWindowFeature(1);
        }
        eablkybsjg(iobyxmoadg());
        setContentView(ppxfxbqfkf().getRoot());
        setCancelable(wkgbmnqykc().lqeggnwhkg());
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(wkgbmnqykc().ppxfxbqfkf()));
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = wkgbmnqykc().wkgbmnqykc();
            }
            if (attributes != null) {
                attributes.width = wkgbmnqykc().gxszxtbevo();
            }
            window.setAttributes(attributes);
        }
    }

    protected final a6.iobyxmoadg ppxfxbqfkf() {
        a6.iobyxmoadg iobyxmoadgVar = this.f123135zdlpuopuiu;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("baseBinding");
        return null;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.f123134yggfygwlhe.add(onDismissListener);
        }
    }

    protected zoijcleaow wkgbmnqykc() {
        return this.f123133jyumaefscl;
    }
}
