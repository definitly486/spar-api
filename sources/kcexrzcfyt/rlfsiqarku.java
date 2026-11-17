package kcexrzcfyt;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class rlfsiqarku {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.zynmafqrjb f54976iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.lifecycle.pmvmpeiblj f54977zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f54978iobyxmoadg;

        static {
            int[] iArr = new int[istkbnxepw.iwizpuwonk.iobyxmoadg.values().length];
            f54978iobyxmoadg = iArr;
            try {
                iArr[istkbnxepw.iwizpuwonk.iobyxmoadg.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54978iobyxmoadg[istkbnxepw.iwizpuwonk.iobyxmoadg.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    rlfsiqarku(istkbnxepw.zynmafqrjb zynmafqrjbVar) {
        this.f54976iobyxmoadg = zynmafqrjbVar;
        androidx.lifecycle.pmvmpeiblj pmvmpeibljVar = new androidx.lifecycle.pmvmpeiblj();
        this.f54977zoijcleaow = pmvmpeibljVar;
        pmvmpeibljVar.wflxmlrfwp(lereixgezr.vdvldrhtss.iobyxmoadg(lereixgezr.vdvldrhtss.zoijcleaow.CLOSED));
    }

    private lereixgezr.vdvldrhtss zoijcleaow() {
        return this.f54976iobyxmoadg.ppxfxbqfkf() ? lereixgezr.vdvldrhtss.iobyxmoadg(lereixgezr.vdvldrhtss.zoijcleaow.OPENING) : lereixgezr.vdvldrhtss.iobyxmoadg(lereixgezr.vdvldrhtss.zoijcleaow.PENDING_OPEN);
    }

    public androidx.lifecycle.cqumvgiudr iobyxmoadg() {
        return this.f54977zoijcleaow;
    }

    public void ppxfxbqfkf(istkbnxepw.iwizpuwonk.iobyxmoadg iobyxmoadgVar, lereixgezr.vdvldrhtss.iobyxmoadg iobyxmoadgVar2) {
        lereixgezr.vdvldrhtss vdvldrhtssVarZoijcleaow;
        switch (iobyxmoadg.f54978iobyxmoadg[iobyxmoadgVar.ordinal()]) {
            case 1:
                vdvldrhtssVarZoijcleaow = zoijcleaow();
                break;
            case 2:
                vdvldrhtssVarZoijcleaow = lereixgezr.vdvldrhtss.zoijcleaow(lereixgezr.vdvldrhtss.zoijcleaow.OPENING, iobyxmoadgVar2);
                break;
            case 3:
            case 4:
                vdvldrhtssVarZoijcleaow = lereixgezr.vdvldrhtss.zoijcleaow(lereixgezr.vdvldrhtss.zoijcleaow.OPEN, iobyxmoadgVar2);
                break;
            case 5:
            case 6:
                vdvldrhtssVarZoijcleaow = lereixgezr.vdvldrhtss.zoijcleaow(lereixgezr.vdvldrhtss.zoijcleaow.CLOSING, iobyxmoadgVar2);
                break;
            case 7:
            case 8:
                vdvldrhtssVarZoijcleaow = lereixgezr.vdvldrhtss.zoijcleaow(lereixgezr.vdvldrhtss.zoijcleaow.CLOSED, iobyxmoadgVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + iobyxmoadgVar);
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("CameraStateMachine", "New public camera state " + vdvldrhtssVarZoijcleaow + " from " + iobyxmoadgVar + " and " + iobyxmoadgVar2);
        if (Objects.equals((lereixgezr.vdvldrhtss) this.f54977zoijcleaow.gxszxtbevo(), vdvldrhtssVarZoijcleaow)) {
            return;
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("CameraStateMachine", "Publishing new public camera state " + vdvldrhtssVarZoijcleaow);
        this.f54977zoijcleaow.wflxmlrfwp(vdvldrhtssVarZoijcleaow);
    }
}
