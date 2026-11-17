package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tzroggbefp implements istkbnxepw.jyumaefscl {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final istkbnxepw.jztzpxfvev f54999btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final zdlpuopuiu.cllcsxoeiz f55000draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private zdlpuopuiu f55002eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final istkbnxepw.pkzmftpjix f55003gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f55005iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f55007nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv.nufgyqmvbu f55008ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f55010zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f55009wkgbmnqykc = new Object();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private iobyxmoadg f55004gxszxtbevo = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private iobyxmoadg f55006lqeggnwhkg = null;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private List f55001dxjokdxxww = null;

    static class iobyxmoadg extends androidx.lifecycle.esjtqupxsv {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private final Object f55011agtfadlqog;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private androidx.lifecycle.cqumvgiudr f55012wflxmlrfwp;

        iobyxmoadg(Object obj) {
            this.f55011agtfadlqog = obj;
        }

        @Override // androidx.lifecycle.cqumvgiudr
        public Object gxszxtbevo() {
            androidx.lifecycle.cqumvgiudr cqumvgiudrVar = this.f55012wflxmlrfwp;
            return cqumvgiudrVar == null ? this.f55011agtfadlqog : cqumvgiudrVar.gxszxtbevo();
        }

        void oxmwwwfdhm(androidx.lifecycle.cqumvgiudr cqumvgiudrVar) {
            androidx.lifecycle.cqumvgiudr cqumvgiudrVar2 = this.f55012wflxmlrfwp;
            if (cqumvgiudrVar2 != null) {
                super.vdvldrhtss(cqumvgiudrVar2);
            }
            this.f55012wflxmlrfwp = cqumvgiudrVar;
            super.rgvfuqvkyq(cqumvgiudrVar, new androidx.lifecycle.zynmafqrjb() { // from class: kcexrzcfyt.kegysxyocb
                @Override // androidx.lifecycle.zynmafqrjb
                public final void iobyxmoadg(Object obj) {
                    this.f54844zdlpuopuiu.ojitshcjhn(obj);
                }
            });
        }

        @Override // androidx.lifecycle.esjtqupxsv
        public void rgvfuqvkyq(androidx.lifecycle.cqumvgiudr cqumvgiudrVar, androidx.lifecycle.zynmafqrjb zynmafqrjbVar) {
            throw new UnsupportedOperationException();
        }
    }

    public tzroggbefp(String str, zdlpuopuiu.cllcsxoeiz cllcsxoeizVar) {
        String str2 = (String) u1.nufgyqmvbu.gxszxtbevo(str);
        this.f55005iobyxmoadg = str2;
        this.f55000draadjrbmk = cllcsxoeizVar;
        zdlpuopuiu.pmvmpeiblj pmvmpeibljVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf(str2);
        this.f55010zoijcleaow = pmvmpeibljVarPpxfxbqfkf;
        this.f55008ppxfxbqfkf = new esjtqupxsv.nufgyqmvbu(this);
        istkbnxepw.jztzpxfvev jztzpxfvevVarIobyxmoadg = androidx.camera.camera2.internal.compat.quirk.iobyxmoadg.iobyxmoadg(str, pmvmpeibljVarPpxfxbqfkf);
        this.f54999btonecajqb = jztzpxfvevVarIobyxmoadg;
        this.f55003gtknphoqwx = new jlmebxxoox(str, jztzpxfvevVarIobyxmoadg);
        this.f55007nufgyqmvbu = new iobyxmoadg(lereixgezr.vdvldrhtss.iobyxmoadg(lereixgezr.vdvldrhtss.zoijcleaow.CLOSED));
    }

    private void jyumaefscl() {
        String str;
        int iKcexrzcfyt = kcexrzcfyt();
        if (iKcexrzcfyt == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iKcexrzcfyt == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iKcexrzcfyt == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iKcexrzcfyt == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iKcexrzcfyt != 4) {
            str = "Unknown value: " + iKcexrzcfyt;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        lereixgezr.sopmlzcsov.eablkybsjg("Camera2CameraInfo", "Device Level: " + str);
    }

    private void yggfygwlhe() {
        jyumaefscl();
    }

    @Override // lereixgezr.agtfadlqog
    public int agtfadlqog(int i13) {
        return cdpycssgdh.ppxfxbqfkf.iobyxmoadg(cdpycssgdh.ppxfxbqfkf.zoijcleaow(i13), oxmwwwfdhm(), 1 == ppxfxbqfkf());
    }

    @Override // istkbnxepw.jyumaefscl
    public void btonecajqb(Executor executor, istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        synchronized (this.f55009wkgbmnqykc) {
            try {
                zdlpuopuiu zdlpuopuiuVar = this.f55002eablkybsjg;
                if (zdlpuopuiuVar != null) {
                    zdlpuopuiuVar.kcexrzcfyt(executor, nufgyqmvbuVar);
                    return;
                }
                if (this.f55001dxjokdxxww == null) {
                    this.f55001dxjokdxxww = new ArrayList();
                }
                this.f55001dxjokdxxww.add(new Pair(nufgyqmvbuVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.jyumaefscl
    public List dxjokdxxww(int i13) {
        Size[] sizeArrPpxfxbqfkf = this.f55010zoijcleaow.ppxfxbqfkf().ppxfxbqfkf(i13);
        return sizeArrPpxfxbqfkf != null ? Arrays.asList(sizeArrPpxfxbqfkf) : Collections.emptyList();
    }

    @Override // istkbnxepw.jyumaefscl
    public Object eablkybsjg() {
        return this.f55010zoijcleaow.gxszxtbevo();
    }

    @Override // lereixgezr.agtfadlqog
    public androidx.lifecycle.cqumvgiudr gtknphoqwx() {
        synchronized (this.f55009wkgbmnqykc) {
            try {
                zdlpuopuiu zdlpuopuiuVar = this.f55002eablkybsjg;
                if (zdlpuopuiuVar == null) {
                    if (this.f55004gxszxtbevo == null) {
                        this.f55004gxszxtbevo = new iobyxmoadg(0);
                    }
                    return this.f55004gxszxtbevo;
                }
                iobyxmoadg iobyxmoadgVar = this.f55004gxszxtbevo;
                if (iobyxmoadgVar != null) {
                    return iobyxmoadgVar;
                }
                return zdlpuopuiuVar.iozdgvuglv().gxszxtbevo();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lereixgezr.agtfadlqog
    public boolean gxszxtbevo() {
        zdlpuopuiu.pmvmpeiblj pmvmpeibljVar = this.f55010zoijcleaow;
        Objects.requireNonNull(pmvmpeibljVar);
        return iwizpuwonk.lqeggnwhkg.iobyxmoadg(new stevsuqkhv(pmvmpeibljVar));
    }

    @Override // lereixgezr.agtfadlqog
    public int iobyxmoadg() {
        return agtfadlqog(0);
    }

    void iwizpuwonk(androidx.lifecycle.cqumvgiudr cqumvgiudrVar) {
        this.f55007nufgyqmvbu.oxmwwwfdhm(cqumvgiudrVar);
    }

    int kcexrzcfyt() {
        Integer num = (Integer) this.f55010zoijcleaow.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        u1.nufgyqmvbu.gxszxtbevo(num);
        return num.intValue();
    }

    @Override // istkbnxepw.jyumaefscl
    public void lqeggnwhkg(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        synchronized (this.f55009wkgbmnqykc) {
            try {
                zdlpuopuiu zdlpuopuiuVar = this.f55002eablkybsjg;
                if (zdlpuopuiuVar != null) {
                    zdlpuopuiuVar.ulzqkzuiru(nufgyqmvbuVar);
                    return;
                }
                List list = this.f55001dxjokdxxww;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == nufgyqmvbuVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.jyumaefscl
    public istkbnxepw.jztzpxfvev nufgyqmvbu() {
        return this.f54999btonecajqb;
    }

    @Override // istkbnxepw.jyumaefscl
    public Object ojitshcjhn(String str) {
        try {
            if (this.f55010zoijcleaow.zoijcleaow().contains(str)) {
                return this.f55000draadjrbmk.ppxfxbqfkf(str).gxszxtbevo();
            }
            return null;
        } catch (CameraAccessExceptionCompat e13) {
            lereixgezr.sopmlzcsov.wkgbmnqykc("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e13);
            return null;
        }
    }

    int oxmwwwfdhm() {
        Integer num = (Integer) this.f55010zoijcleaow.iobyxmoadg(CameraCharacteristics.SENSOR_ORIENTATION);
        u1.nufgyqmvbu.gxszxtbevo(num);
        return num.intValue();
    }

    @Override // lereixgezr.agtfadlqog
    public int ppxfxbqfkf() {
        Integer num = (Integer) this.f55010zoijcleaow.iobyxmoadg(CameraCharacteristics.LENS_FACING);
        u1.nufgyqmvbu.zoijcleaow(num != null, "Unable to get the lens facing of the camera.");
        return grlcpdaxtj.iobyxmoadg(num.intValue());
    }

    public esjtqupxsv.nufgyqmvbu rgvfuqvkyq() {
        return this.f55008ppxfxbqfkf;
    }

    public zdlpuopuiu.pmvmpeiblj vdvldrhtss() {
        return this.f55010zoijcleaow;
    }

    @Override // lereixgezr.agtfadlqog
    public String wflxmlrfwp() {
        return kcexrzcfyt() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // istkbnxepw.jyumaefscl
    public List wkgbmnqykc(int i13) {
        Size[] sizeArrIobyxmoadg = this.f55010zoijcleaow.ppxfxbqfkf().iobyxmoadg(i13);
        return sizeArrIobyxmoadg != null ? Arrays.asList(sizeArrIobyxmoadg) : Collections.emptyList();
    }

    void zdlpuopuiu(zdlpuopuiu zdlpuopuiuVar) {
        synchronized (this.f55009wkgbmnqykc) {
            try {
                this.f55002eablkybsjg = zdlpuopuiuVar;
                iobyxmoadg iobyxmoadgVar = this.f55006lqeggnwhkg;
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.oxmwwwfdhm(zdlpuopuiuVar.wwaezpbzkn().eablkybsjg());
                }
                iobyxmoadg iobyxmoadgVar2 = this.f55004gxszxtbevo;
                if (iobyxmoadgVar2 != null) {
                    iobyxmoadgVar2.oxmwwwfdhm(this.f55002eablkybsjg.iozdgvuglv().gxszxtbevo());
                }
                List<Pair> list = this.f55001dxjokdxxww;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f55002eablkybsjg.kcexrzcfyt((Executor) pair.second, (istkbnxepw.nufgyqmvbu) pair.first);
                    }
                    this.f55001dxjokdxxww = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        yggfygwlhe();
    }

    @Override // istkbnxepw.jyumaefscl
    public String zoijcleaow() {
        return this.f55005iobyxmoadg;
    }
}
