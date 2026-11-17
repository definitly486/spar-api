package czzsidtyhn;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ulzqkzuiru extends v1.bfopjjpdmp.zoijcleaow implements Runnable, v1.pkzmftpjix, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f26482cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private v1.skhdrjzrfn f26483esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f26484iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final hszhottldk f26485jyumaefscl;

    public ulzqkzuiru(hszhottldk hszhottldkVar) {
        super(!hszhottldkVar.ppxfxbqfkf() ? 1 : 0);
        this.f26485jyumaefscl = hszhottldkVar;
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public v1.skhdrjzrfn eablkybsjg(v1.skhdrjzrfn skhdrjzrfnVar, List list) {
        hszhottldk.gtknphoqwx(this.f26485jyumaefscl, skhdrjzrfnVar, 0, 2, null);
        return this.f26485jyumaefscl.ppxfxbqfkf() ? v1.skhdrjzrfn.f115192zoijcleaow : skhdrjzrfnVar;
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public v1.bfopjjpdmp.iobyxmoadg gxszxtbevo(v1.bfopjjpdmp bfopjjpdmpVar, v1.bfopjjpdmp.iobyxmoadg iobyxmoadgVar) {
        this.f26484iwizpuwonk = false;
        return super.gxszxtbevo(bfopjjpdmpVar, iobyxmoadgVar);
    }

    @Override // v1.pkzmftpjix
    public v1.skhdrjzrfn iobyxmoadg(View view, v1.skhdrjzrfn skhdrjzrfnVar) {
        this.f26483esjtqupxsv = skhdrjzrfnVar;
        this.f26485jyumaefscl.wflxmlrfwp(skhdrjzrfnVar);
        if (this.f26484iwizpuwonk) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f26482cqumvgiudr) {
            this.f26485jyumaefscl.draadjrbmk(skhdrjzrfnVar);
            hszhottldk.gtknphoqwx(this.f26485jyumaefscl, skhdrjzrfnVar, 0, 2, null);
        }
        return this.f26485jyumaefscl.ppxfxbqfkf() ? v1.skhdrjzrfn.f115192zoijcleaow : skhdrjzrfnVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public void ppxfxbqfkf(v1.bfopjjpdmp bfopjjpdmpVar) {
        this.f26484iwizpuwonk = false;
        this.f26482cqumvgiudr = false;
        v1.skhdrjzrfn skhdrjzrfnVar = this.f26483esjtqupxsv;
        if (bfopjjpdmpVar.zoijcleaow() > 0 && skhdrjzrfnVar != null) {
            this.f26485jyumaefscl.draadjrbmk(skhdrjzrfnVar);
            this.f26485jyumaefscl.wflxmlrfwp(skhdrjzrfnVar);
            hszhottldk.gtknphoqwx(this.f26485jyumaefscl, skhdrjzrfnVar, 0, 2, null);
        }
        this.f26483esjtqupxsv = null;
        super.ppxfxbqfkf(bfopjjpdmpVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f26484iwizpuwonk) {
            this.f26484iwizpuwonk = false;
            this.f26482cqumvgiudr = false;
            v1.skhdrjzrfn skhdrjzrfnVar = this.f26483esjtqupxsv;
            if (skhdrjzrfnVar != null) {
                this.f26485jyumaefscl.draadjrbmk(skhdrjzrfnVar);
                hszhottldk.gtknphoqwx(this.f26485jyumaefscl, skhdrjzrfnVar, 0, 2, null);
                this.f26483esjtqupxsv = null;
            }
        }
    }

    @Override // v1.bfopjjpdmp.zoijcleaow
    public void wkgbmnqykc(v1.bfopjjpdmp bfopjjpdmpVar) {
        this.f26484iwizpuwonk = true;
        this.f26482cqumvgiudr = true;
        super.wkgbmnqykc(bfopjjpdmpVar);
    }
}
