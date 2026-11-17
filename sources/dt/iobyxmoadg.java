package dt;

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

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends Dialog {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f29485jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f29486yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected a6.iobyxmoadg f29487zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final C0599iobyxmoadg f29484iwizpuwonk = new C0599iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f29483cqumvgiudr = 8;

    /* JADX INFO: renamed from: dt.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0599iobyxmoadg {
        public /* synthetic */ C0599iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0599iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final int f29488gxszxtbevo = 0;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f29489eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f29490iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f29491ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f29492wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f29493zoijcleaow;

        public zoijcleaow(float f13, int i13, int i14, boolean z13, boolean z14) {
            this.f29490iobyxmoadg = f13;
            this.f29493zoijcleaow = i13;
            this.f29491ppxfxbqfkf = i14;
            this.f29492wkgbmnqykc = z13;
            this.f29489eablkybsjg = z14;
        }

        public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, float f13, int i13, int i14, boolean z13, boolean z14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                f13 = zoijcleaowVar.f29490iobyxmoadg;
            }
            if ((i15 & 2) != 0) {
                i13 = zoijcleaowVar.f29493zoijcleaow;
            }
            int i16 = i13;
            if ((i15 & 4) != 0) {
                i14 = zoijcleaowVar.f29491ppxfxbqfkf;
            }
            int i17 = i14;
            if ((i15 & 8) != 0) {
                z13 = zoijcleaowVar.f29492wkgbmnqykc;
            }
            boolean z15 = z13;
            if ((i15 & 16) != 0) {
                z14 = zoijcleaowVar.f29489eablkybsjg;
            }
            return zoijcleaowVar.iobyxmoadg(f13, i16, i17, z15, z14);
        }

        public final boolean eablkybsjg() {
            return this.f29489eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return Float.compare(this.f29490iobyxmoadg, zoijcleaowVar.f29490iobyxmoadg) == 0 && this.f29493zoijcleaow == zoijcleaowVar.f29493zoijcleaow && this.f29491ppxfxbqfkf == zoijcleaowVar.f29491ppxfxbqfkf && this.f29492wkgbmnqykc == zoijcleaowVar.f29492wkgbmnqykc && this.f29489eablkybsjg == zoijcleaowVar.f29489eablkybsjg;
        }

        public final int gxszxtbevo() {
            return this.f29493zoijcleaow;
        }

        public int hashCode() {
            return (((((((Float.hashCode(this.f29490iobyxmoadg) * 31) + Integer.hashCode(this.f29493zoijcleaow)) * 31) + Integer.hashCode(this.f29491ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f29492wkgbmnqykc)) * 31) + Boolean.hashCode(this.f29489eablkybsjg);
        }

        public final zoijcleaow iobyxmoadg(float f13, int i13, int i14, boolean z13, boolean z14) {
            return new zoijcleaow(f13, i13, i14, z13, z14);
        }

        public final boolean lqeggnwhkg() {
            return this.f29492wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return this.f29491ppxfxbqfkf;
        }

        public String toString() {
            return "Config(dimAmount=" + this.f29490iobyxmoadg + ", width=" + this.f29493zoijcleaow + ", backgroundColor=" + this.f29491ppxfxbqfkf + ", isCancelable=" + this.f29492wkgbmnqykc + ", noTitle=" + this.f29489eablkybsjg + ")";
        }

        public final float wkgbmnqykc() {
            return this.f29490iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f29486yggfygwlhe = new ArrayList();
        this.f29485jyumaefscl = new zoijcleaow(0.85f, -1, 0, true, true);
    }

    private final void zoijcleaow() {
        Iterator it = this.f29486yggfygwlhe.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(this);
        }
        this.f29486yggfygwlhe.clear();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        zoijcleaow();
        super.dismiss();
    }

    protected final void eablkybsjg(a6.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<set-?>");
        this.f29487zdlpuopuiu = iobyxmoadgVar;
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
        a6.iobyxmoadg iobyxmoadgVar = this.f29487zdlpuopuiu;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("baseBinding");
        return null;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.f29486yggfygwlhe.add(onDismissListener);
        }
    }

    protected zoijcleaow wkgbmnqykc() {
        return this.f29485jyumaefscl;
    }
}
