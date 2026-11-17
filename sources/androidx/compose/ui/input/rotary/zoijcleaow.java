package androidx.compose.ui.input.rotary;

import androidx.compose.ui.wkgbmnqykc;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends wkgbmnqykc.ppxfxbqfkf implements v.iobyxmoadg {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private draadjrbmk f6403pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private draadjrbmk f6404ylkuphrtab;

    public zoijcleaow(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) {
        this.f6404ylkuphrtab = draadjrbmkVar;
        this.f6403pkzmftpjix = draadjrbmkVar2;
    }

    public final void H0(draadjrbmk draadjrbmkVar) {
        this.f6404ylkuphrtab = draadjrbmkVar;
    }

    public final void I0(draadjrbmk draadjrbmkVar) {
        this.f6403pkzmftpjix = draadjrbmkVar;
    }

    @Override // v.iobyxmoadg
    public boolean c0(v.zoijcleaow zoijcleaowVar) {
        draadjrbmk draadjrbmkVar = this.f6403pkzmftpjix;
        if (draadjrbmkVar != null) {
            return ((Boolean) draadjrbmkVar.invoke(zoijcleaowVar)).booleanValue();
        }
        return false;
    }

    @Override // v.iobyxmoadg
    public boolean n(v.zoijcleaow zoijcleaowVar) {
        draadjrbmk draadjrbmkVar = this.f6404ylkuphrtab;
        if (draadjrbmkVar != null) {
            return ((Boolean) draadjrbmkVar.invoke(zoijcleaowVar)).booleanValue();
        }
        return false;
    }
}
