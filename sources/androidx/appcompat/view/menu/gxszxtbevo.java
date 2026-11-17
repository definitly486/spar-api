package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class gxszxtbevo implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, btonecajqb.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private btonecajqb.iobyxmoadg f2841iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    ppxfxbqfkf f2842jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private androidx.appcompat.app.ppxfxbqfkf f2843yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private eablkybsjg f2844zdlpuopuiu;

    public gxszxtbevo(eablkybsjg eablkybsjgVar) {
        this.f2844zdlpuopuiu = eablkybsjgVar;
    }

    public void iobyxmoadg() {
        androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVar = this.f2843yggfygwlhe;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i13) {
        this.f2844zdlpuopuiu.hkdspvbjdz((lqeggnwhkg) this.f2842jyumaefscl.iobyxmoadg().getItem(i13), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f2842jyumaefscl.ppxfxbqfkf(this.f2844zdlpuopuiu, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i13, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i13 == 82 || i13 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2843yggfygwlhe.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2843yggfygwlhe.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2844zdlpuopuiu.eablkybsjg(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2844zdlpuopuiu.performShortcut(i13, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, boolean z13) {
        if (z13 || eablkybsjgVar == this.f2844zdlpuopuiu) {
            iobyxmoadg();
        }
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2841iwizpuwonk;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar, z13);
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
    public boolean wkgbmnqykc(eablkybsjg eablkybsjgVar) {
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2841iwizpuwonk;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.wkgbmnqykc(eablkybsjgVar);
        }
        return false;
    }

    public void zoijcleaow(IBinder iBinder) {
        eablkybsjg eablkybsjgVar = this.f2844zdlpuopuiu;
        androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = new androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg(eablkybsjgVar.yggfygwlhe());
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(iobyxmoadgVar.getContext(), lqeggnwhkg.lqeggnwhkg.abc_list_menu_item_layout);
        this.f2842jyumaefscl = ppxfxbqfkfVar;
        ppxfxbqfkfVar.eablkybsjg(this);
        this.f2844zdlpuopuiu.zoijcleaow(this.f2842jyumaefscl);
        iobyxmoadgVar.iobyxmoadg(this.f2842jyumaefscl.iobyxmoadg(), this);
        View viewEsjtqupxsv = eablkybsjgVar.esjtqupxsv();
        if (viewEsjtqupxsv != null) {
            iobyxmoadgVar.zoijcleaow(viewEsjtqupxsv);
        } else {
            iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar.iwizpuwonk()).setTitle(eablkybsjgVar.cqumvgiudr());
        }
        iobyxmoadgVar.nufgyqmvbu(this);
        androidx.appcompat.app.ppxfxbqfkf ppxfxbqfkfVarCreate = iobyxmoadgVar.create();
        this.f2843yggfygwlhe = ppxfxbqfkfVarCreate;
        ppxfxbqfkfVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2843yggfygwlhe.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2843yggfygwlhe.show();
    }
}
