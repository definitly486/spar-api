package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.wkgbmnqykc;
import r.eablkybsjg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends wkgbmnqykc.ppxfxbqfkf implements eablkybsjg {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private draadjrbmk f6386pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private draadjrbmk f6387ylkuphrtab;

    public zoijcleaow(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) {
        this.f6387ylkuphrtab = draadjrbmkVar;
        this.f6386pkzmftpjix = draadjrbmkVar2;
    }

    public final void H0(draadjrbmk draadjrbmkVar) {
        this.f6387ylkuphrtab = draadjrbmkVar;
    }

    public final void I0(draadjrbmk draadjrbmkVar) {
        this.f6386pkzmftpjix = draadjrbmkVar;
    }

    @Override // r.eablkybsjg
    public boolean p(KeyEvent keyEvent) {
        draadjrbmk draadjrbmkVar = this.f6387ylkuphrtab;
        if (draadjrbmkVar != null) {
            return ((Boolean) draadjrbmkVar.invoke(r.zoijcleaow.iobyxmoadg(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // r.eablkybsjg
    public boolean rhgxfdycjh(KeyEvent keyEvent) {
        draadjrbmk draadjrbmkVar = this.f6386pkzmftpjix;
        if (draadjrbmkVar != null) {
            return ((Boolean) draadjrbmkVar.invoke(r.zoijcleaow.iobyxmoadg(keyEvent))).booleanValue();
        }
        return false;
    }
}
