package istkbnxepw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb implements pmvmpeiblj.iobyxmoadg.InterfaceC1704iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f49450eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f49451gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final StringBuilder f49452iobyxmoadg = new StringBuilder();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f49453ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final pmvmpeiblj.iobyxmoadg f49454wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f49455zoijcleaow;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private iwizpuwonk.iobyxmoadg f49456iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final zoijcleaow f49457ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final ppxfxbqfkf f49458wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f49459zoijcleaow;

        iobyxmoadg(iwizpuwonk.iobyxmoadg iobyxmoadgVar, Executor executor, zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f49456iobyxmoadg = iobyxmoadgVar;
            this.f49459zoijcleaow = executor;
            this.f49457ppxfxbqfkf = zoijcleaowVar;
            this.f49458wkgbmnqykc = ppxfxbqfkfVar;
        }

        iwizpuwonk.iobyxmoadg iobyxmoadg() {
            return this.f49456iobyxmoadg;
        }

        void ppxfxbqfkf() {
            try {
                Executor executor = this.f49459zoijcleaow;
                final ppxfxbqfkf ppxfxbqfkfVar = this.f49458wkgbmnqykc;
                Objects.requireNonNull(ppxfxbqfkfVar);
                executor.execute(new Runnable() { // from class: istkbnxepw.lereixgezr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ppxfxbqfkfVar.iobyxmoadg();
                    }
                });
            } catch (RejectedExecutionException e13) {
                lereixgezr.sopmlzcsov.wkgbmnqykc("CameraStateRegistry", "Unable to notify camera to open.", e13);
            }
        }

        iwizpuwonk.iobyxmoadg wkgbmnqykc(iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
            iwizpuwonk.iobyxmoadg iobyxmoadgVar2 = this.f49456iobyxmoadg;
            this.f49456iobyxmoadg = iobyxmoadgVar;
            return iobyxmoadgVar2;
        }

        void zoijcleaow() {
            try {
                Executor executor = this.f49459zoijcleaow;
                final zoijcleaow zoijcleaowVar = this.f49457ppxfxbqfkf;
                Objects.requireNonNull(zoijcleaowVar);
                executor.execute(new Runnable() { // from class: istkbnxepw.pmvmpeiblj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zoijcleaowVar.iobyxmoadg();
                    }
                });
            } catch (RejectedExecutionException e13) {
                lereixgezr.sopmlzcsov.wkgbmnqykc("CameraStateRegistry", "Unable to notify camera to configure.", e13);
            }
        }
    }

    public interface ppxfxbqfkf {
        void iobyxmoadg();
    }

    public interface zoijcleaow {
        void iobyxmoadg();
    }

    public zynmafqrjb(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, int i13) {
        Object obj = new Object();
        this.f49455zoijcleaow = obj;
        this.f49450eablkybsjg = new HashMap();
        this.f49453ppxfxbqfkf = i13;
        synchronized (obj) {
            this.f49454wkgbmnqykc = iobyxmoadgVar;
            this.f49451gxszxtbevo = this.f49453ppxfxbqfkf;
        }
    }

    private iwizpuwonk.iobyxmoadg draadjrbmk(lereixgezr.dxjokdxxww dxjokdxxwwVar, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
        iwizpuwonk.iobyxmoadg iobyxmoadgVarWkgbmnqykc = ((iobyxmoadg) u1.nufgyqmvbu.lqeggnwhkg((iobyxmoadg) this.f49450eablkybsjg.get(dxjokdxxwwVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).wkgbmnqykc(iobyxmoadgVar);
        iwizpuwonk.iobyxmoadg iobyxmoadgVar2 = iwizpuwonk.iobyxmoadg.OPENING;
        if (iobyxmoadgVar == iobyxmoadgVar2) {
            u1.nufgyqmvbu.dxjokdxxww(wkgbmnqykc(iobyxmoadgVar) || iobyxmoadgVarWkgbmnqykc == iobyxmoadgVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (iobyxmoadgVarWkgbmnqykc != iobyxmoadgVar) {
            nufgyqmvbu(dxjokdxxwwVar, iobyxmoadgVar);
            gxszxtbevo();
        }
        return iobyxmoadgVarWkgbmnqykc;
    }

    private iwizpuwonk.iobyxmoadg gtknphoqwx(lereixgezr.dxjokdxxww dxjokdxxwwVar) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f49450eablkybsjg.remove(dxjokdxxwwVar);
        if (iobyxmoadgVar == null) {
            return null;
        }
        gxszxtbevo();
        return iobyxmoadgVar.iobyxmoadg();
    }

    private void gxszxtbevo() {
        if (lereixgezr.sopmlzcsov.gxszxtbevo("CameraStateRegistry")) {
            this.f49452iobyxmoadg.setLength(0);
            this.f49452iobyxmoadg.append("Recalculating open cameras:\n");
            this.f49452iobyxmoadg.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f49452iobyxmoadg.append("-------------------------------------------------------------------\n");
        }
        int i13 = 0;
        for (Map.Entry entry : this.f49450eablkybsjg.entrySet()) {
            if (lereixgezr.sopmlzcsov.gxszxtbevo("CameraStateRegistry")) {
                this.f49452iobyxmoadg.append(String.format(Locale.US, "%-45s%-22s\n", ((lereixgezr.dxjokdxxww) entry.getKey()).toString(), ((iobyxmoadg) entry.getValue()).iobyxmoadg() != null ? ((iobyxmoadg) entry.getValue()).iobyxmoadg().toString() : "UNKNOWN"));
            }
            if (wkgbmnqykc(((iobyxmoadg) entry.getValue()).iobyxmoadg())) {
                i13++;
            }
        }
        if (lereixgezr.sopmlzcsov.gxszxtbevo("CameraStateRegistry")) {
            this.f49452iobyxmoadg.append("-------------------------------------------------------------------\n");
            this.f49452iobyxmoadg.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i13), Integer.valueOf(this.f49453ppxfxbqfkf)));
            lereixgezr.sopmlzcsov.iobyxmoadg("CameraStateRegistry", this.f49452iobyxmoadg.toString());
        }
        this.f49451gxszxtbevo = Math.max(this.f49453ppxfxbqfkf - i13, 0);
    }

    private static void nufgyqmvbu(lereixgezr.dxjokdxxww dxjokdxxwwVar, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
        if (y5.iobyxmoadg.nufgyqmvbu()) {
            y5.iobyxmoadg.btonecajqb("CX:State[" + dxjokdxxwwVar + "]", iobyxmoadgVar.ordinal());
        }
    }

    private static boolean wkgbmnqykc(iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar != null && iobyxmoadgVar.wkgbmnqykc();
    }

    private iobyxmoadg zoijcleaow(String str) {
        for (lereixgezr.dxjokdxxww dxjokdxxwwVar : this.f49450eablkybsjg.keySet()) {
            if (str.equals(((jyumaefscl) dxjokdxxwwVar.zoijcleaow()).zoijcleaow())) {
                return (iobyxmoadg) this.f49450eablkybsjg.get(dxjokdxxwwVar);
            }
        }
        return null;
    }

    public boolean btonecajqb(String str, String str2) {
        synchronized (this.f49455zoijcleaow) {
            try {
                boolean z13 = true;
                if (this.f49454wkgbmnqykc.ppxfxbqfkf() != 2) {
                    return true;
                }
                iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(str);
                iwizpuwonk.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVarZoijcleaow != null ? iobyxmoadgVarZoijcleaow.iobyxmoadg() : null;
                iobyxmoadg iobyxmoadgVarZoijcleaow2 = str2 != null ? zoijcleaow(str2) : null;
                iwizpuwonk.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVarZoijcleaow2 != null ? iobyxmoadgVarZoijcleaow2.iobyxmoadg() : null;
                iwizpuwonk.iobyxmoadg iobyxmoadgVar = iwizpuwonk.iobyxmoadg.OPEN;
                boolean z14 = iobyxmoadgVar.equals(iobyxmoadgVarIobyxmoadg) || iwizpuwonk.iobyxmoadg.CONFIGURED.equals(iobyxmoadgVarIobyxmoadg);
                boolean z15 = iobyxmoadgVar.equals(iobyxmoadgVarIobyxmoadg2) || iwizpuwonk.iobyxmoadg.CONFIGURED.equals(iobyxmoadgVarIobyxmoadg2);
                if (!z14 || !z15) {
                    z13 = false;
                }
                return z13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean dxjokdxxww(lereixgezr.dxjokdxxww dxjokdxxwwVar) {
        boolean z13;
        synchronized (this.f49455zoijcleaow) {
            try {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) u1.nufgyqmvbu.lqeggnwhkg((iobyxmoadg) this.f49450eablkybsjg.get(dxjokdxxwwVar), "Camera must first be registered with registerCamera()");
                z13 = false;
                if (lereixgezr.sopmlzcsov.gxszxtbevo("CameraStateRegistry")) {
                    this.f49452iobyxmoadg.setLength(0);
                    this.f49452iobyxmoadg.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", dxjokdxxwwVar, Integer.valueOf(this.f49451gxszxtbevo), Boolean.valueOf(wkgbmnqykc(iobyxmoadgVar.iobyxmoadg())), iobyxmoadgVar.iobyxmoadg()));
                }
                if (this.f49451gxszxtbevo > 0 || wkgbmnqykc(iobyxmoadgVar.iobyxmoadg())) {
                    iwizpuwonk.iobyxmoadg iobyxmoadgVar2 = iwizpuwonk.iobyxmoadg.OPENING;
                    iobyxmoadgVar.wkgbmnqykc(iobyxmoadgVar2);
                    nufgyqmvbu(dxjokdxxwwVar, iobyxmoadgVar2);
                    z13 = true;
                }
                if (lereixgezr.sopmlzcsov.gxszxtbevo("CameraStateRegistry")) {
                    this.f49452iobyxmoadg.append(String.format(Locale.US, " --> %s", z13 ? "SUCCESS" : "FAIL"));
                    lereixgezr.sopmlzcsov.iobyxmoadg("CameraStateRegistry", this.f49452iobyxmoadg.toString());
                }
                if (z13) {
                    gxszxtbevo();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public void eablkybsjg(lereixgezr.dxjokdxxww dxjokdxxwwVar, iwizpuwonk.iobyxmoadg iobyxmoadgVar, boolean z13) {
        iobyxmoadg iobyxmoadgVarZoijcleaow;
        synchronized (this.f49455zoijcleaow) {
            try {
                int i13 = this.f49451gxszxtbevo;
                if ((iobyxmoadgVar == iwizpuwonk.iobyxmoadg.RELEASED ? gtknphoqwx(dxjokdxxwwVar) : draadjrbmk(dxjokdxxwwVar, iobyxmoadgVar)) == iobyxmoadgVar) {
                    return;
                }
                HashMap map = null;
                if (this.f49454wkgbmnqykc.ppxfxbqfkf() == 2 && iobyxmoadgVar == iwizpuwonk.iobyxmoadg.CONFIGURED) {
                    String strIobyxmoadg = this.f49454wkgbmnqykc.iobyxmoadg(((jyumaefscl) dxjokdxxwwVar.zoijcleaow()).zoijcleaow());
                    if (strIobyxmoadg != null) {
                        iobyxmoadgVarZoijcleaow = zoijcleaow(strIobyxmoadg);
                    } else {
                        iobyxmoadgVarZoijcleaow = null;
                    }
                } else {
                    iobyxmoadgVarZoijcleaow = null;
                }
                if (i13 < 1 && this.f49451gxszxtbevo > 0) {
                    map = new HashMap();
                    for (Map.Entry entry : this.f49450eablkybsjg.entrySet()) {
                        if (((iobyxmoadg) entry.getValue()).iobyxmoadg() == iwizpuwonk.iobyxmoadg.PENDING_OPEN) {
                            map.put((lereixgezr.dxjokdxxww) entry.getKey(), (iobyxmoadg) entry.getValue());
                        }
                    }
                } else if (iobyxmoadgVar == iwizpuwonk.iobyxmoadg.PENDING_OPEN && this.f49451gxszxtbevo > 0) {
                    map = new HashMap();
                    map.put(dxjokdxxwwVar, (iobyxmoadg) this.f49450eablkybsjg.get(dxjokdxxwwVar));
                }
                if (map != null && !z13) {
                    map.remove(dxjokdxxwwVar);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((iobyxmoadg) it.next()).ppxfxbqfkf();
                    }
                }
                if (iobyxmoadgVarZoijcleaow != null) {
                    iobyxmoadgVarZoijcleaow.zoijcleaow();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pmvmpeiblj.iobyxmoadg.InterfaceC1704iobyxmoadg
    public void iobyxmoadg(int i13, int i14) {
        synchronized (this.f49455zoijcleaow) {
            boolean z13 = true;
            this.f49453ppxfxbqfkf = i14 == 2 ? 2 : 1;
            boolean z14 = i13 != 2 && i14 == 2;
            if (i13 != 2 || i14 == 2) {
                z13 = false;
            }
            if (z14 || z13) {
                gxszxtbevo();
            }
        }
    }

    public void lqeggnwhkg(lereixgezr.dxjokdxxww dxjokdxxwwVar, Executor executor, zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        synchronized (this.f49455zoijcleaow) {
            u1.nufgyqmvbu.dxjokdxxww(!this.f49450eablkybsjg.containsKey(dxjokdxxwwVar), "Camera is already registered: " + dxjokdxxwwVar);
            this.f49450eablkybsjg.put(dxjokdxxwwVar, new iobyxmoadg(null, executor, zoijcleaowVar, ppxfxbqfkfVar));
        }
    }

    public boolean ppxfxbqfkf() {
        synchronized (this.f49455zoijcleaow) {
            try {
                Iterator it = this.f49450eablkybsjg.entrySet().iterator();
                while (it.hasNext()) {
                    if (((iobyxmoadg) ((Map.Entry) it.next()).getValue()).iobyxmoadg() == iwizpuwonk.iobyxmoadg.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
