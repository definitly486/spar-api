package org.xbill.DNS.config;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.ptr.IntByReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo implements im.gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final am.iobyxmoadg f74273zoijcleaow = am.zoijcleaow.dxjokdxxww(gxszxtbevo.class);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private zoijcleaow f74274iobyxmoadg;

    private static final class zoijcleaow extends org.xbill.DNS.config.zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final am.iobyxmoadg f74275gxszxtbevo;

        static {
            am.iobyxmoadg iobyxmoadgVarDxjokdxxww = am.zoijcleaow.dxjokdxxww(zoijcleaow.class);
            f74275gxszxtbevo = iobyxmoadgVarDxjokdxxww;
            iobyxmoadgVarDxjokdxxww.lqeggnwhkg("Checking for JNA classes: {} and {}", Memory.class.getName(), Win32Exception.class.getName());
        }

        private zoijcleaow() {
        }

        @Override // im.gxszxtbevo
        public void iobyxmoadg() {
            wflxmlrfwp();
            new Memory(15360L);
            new IntByReference(0);
            int i13 = ppxfxbqfkf.f74278iobyxmoadg;
            Pointer pointer = Pointer.NULL;
            throw null;
        }
    }

    public gxszxtbevo() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                this.f74274iobyxmoadg = new zoijcleaow();
            } catch (NoClassDefFoundError unused) {
                f74273zoijcleaow.wkgbmnqykc("JNA not available");
            }
        }
    }

    @Override // im.gxszxtbevo
    public void iobyxmoadg() {
        this.f74274iobyxmoadg.iobyxmoadg();
    }

    @Override // im.gxszxtbevo
    public boolean isEnabled() {
        return this.f74274iobyxmoadg != null;
    }

    @Override // im.gxszxtbevo
    public List wkgbmnqykc() {
        return this.f74274iobyxmoadg.wkgbmnqykc();
    }

    @Override // im.gxszxtbevo
    public List zoijcleaow() {
        return this.f74274iobyxmoadg.zoijcleaow();
    }
}
