package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.cdpycssgdh;
import androidx.lifecycle.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class rgvfuqvkyq extends androidx.activity.draadjrbmk implements eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final v1.yggfygwlhe.iobyxmoadg f2674cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private lqeggnwhkg f2675iwizpuwonk;

    public rgvfuqvkyq(Context context, int i13) {
        super(context, gxszxtbevo(context, i13));
        this.f2674cqumvgiudr = new v1.yggfygwlhe.iobyxmoadg() { // from class: androidx.appcompat.app.ojitshcjhn
            @Override // v1.yggfygwlhe.iobyxmoadg
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f2670zdlpuopuiu.nufgyqmvbu(keyEvent);
            }
        };
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = eablkybsjg();
        lqeggnwhkgVarEablkybsjg.stevsuqkhv(gxszxtbevo(context, i13));
        lqeggnwhkgVarEablkybsjg.pmvmpeiblj(null);
    }

    private static int gxszxtbevo(Context context, int i13) {
        if (i13 != 0) {
            return i13;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private void lqeggnwhkg() {
        vipkmwdibw.zoijcleaow(getWindow().getDecorView(), this);
        q5.wflxmlrfwp.zoijcleaow(getWindow().getDecorView(), this);
        cdpycssgdh.zoijcleaow(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        eablkybsjg().eablkybsjg(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        eablkybsjg().zynmafqrjb();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v1.yggfygwlhe.eablkybsjg(this.f2674cqumvgiudr, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean dxjokdxxww(int i13) {
        return eablkybsjg().pkzmftpjix(i13);
    }

    public lqeggnwhkg eablkybsjg() {
        if (this.f2675iwizpuwonk == null) {
            this.f2675iwizpuwonk = lqeggnwhkg.gtknphoqwx(this, this);
        }
        return this.f2675iwizpuwonk;
    }

    @Override // android.app.Dialog
    public View findViewById(int i13) {
        return eablkybsjg().draadjrbmk(i13);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        eablkybsjg().iwizpuwonk();
    }

    boolean nufgyqmvbu(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        eablkybsjg().jyumaefscl();
        super.onCreate(bundle);
        eablkybsjg().pmvmpeiblj(bundle);
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    protected void onStop() {
        super.onStop();
        eablkybsjg().lmojexxdyd();
    }

    @Override // androidx.appcompat.app.eablkybsjg
    public void onSupportActionModeFinished(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
    }

    @Override // androidx.appcompat.app.eablkybsjg
    public void onSupportActionModeStarted(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
    }

    @Override // androidx.appcompat.app.eablkybsjg
    public androidx.appcompat.view.zoijcleaow onWindowStartingSupportActionMode(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return null;
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    public void setContentView(int i13) {
        lqeggnwhkg();
        eablkybsjg().hcddaimhww(i13);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        eablkybsjg().kegysxyocb(charSequence);
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    public void setContentView(View view) {
        lqeggnwhkg();
        eablkybsjg().jpowsppfya(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        super.setTitle(i13);
        eablkybsjg().kegysxyocb(getContext().getString(i13));
    }

    @Override // androidx.activity.draadjrbmk, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        lqeggnwhkg();
        eablkybsjg().hkdspvbjdz(view, layoutParams);
    }
}
