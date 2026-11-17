package t21;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.network.model.WarningDto;
import sj.kegysxyocb;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww implements iwizpuwonk, gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yy0.iobyxmoadg f109330iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sj.lqeggnwhkg f109331ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f109332zoijcleaow;

    public dxjokdxxww(yy0.iobyxmoadg debugPanelLocalSource) {
        zdlpuopuiu.btonecajqb(debugPanelLocalSource, "debugPanelLocalSource");
        this.f109330iobyxmoadg = debugPanelLocalSource;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(lqeggnwhkg.iobyxmoadg.f109333iobyxmoadg);
        this.f109332zoijcleaow = zynmafqrjbVarIobyxmoadg;
        this.f109331ppxfxbqfkf = sj.dxjokdxxww.oxmwwwfdhm(zynmafqrjbVarIobyxmoadg, new rgvfuqvkyq() { // from class: t21.nufgyqmvbu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(dxjokdxxww.wkgbmnqykc((lqeggnwhkg) obj, (lqeggnwhkg) obj2));
            }
        });
    }

    private final lqeggnwhkg eablkybsjg(String str) {
        return new lqeggnwhkg.zoijcleaow(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(lqeggnwhkg old, lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(old, "old");
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "new");
        if ((old instanceof lqeggnwhkg.zoijcleaow) && (lqeggnwhkgVar instanceof lqeggnwhkg.zoijcleaow)) {
            return true;
        }
        return (old instanceof lqeggnwhkg.iobyxmoadg) && (lqeggnwhkgVar instanceof lqeggnwhkg.iobyxmoadg);
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        Object value;
        String message;
        zdlpuopuiu.btonecajqb(chain, "chain");
        cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(chain.dxjokdxxww());
        List<WarningDto> warnings = ppxfxbqfkf.zoijcleaow(cdpycssgdhVarZoijcleaow).getWarnings();
        WarningDto warningDto = null;
        Object obj = null;
        if (warnings != null) {
            for (Object obj2 : warnings) {
                if (kcexrzcfyt.cdpycssgdh(((WarningDto) obj2).getCode(), "vpnError", false, 2, null)) {
                    obj = obj2;
                    break;
                }
            }
            warningDto = (WarningDto) obj;
        }
        if (warningDto != null && this.f109330iobyxmoadg.iobyxmoadg()) {
            zynmafqrjb zynmafqrjbVar = this.f109332zoijcleaow;
            do {
                value = zynmafqrjbVar.getValue();
                message = warningDto.getMessage();
                if (message == null) {
                    message = "";
                }
            } while (!zynmafqrjbVar.compareAndSet(value, eablkybsjg(message)));
        }
        return cdpycssgdhVarZoijcleaow;
    }

    @Override // t21.gxszxtbevo
    public sj.lqeggnwhkg iobyxmoadg() {
        return this.f109331ppxfxbqfkf;
    }

    @Override // t21.gxszxtbevo
    public void zoijcleaow() {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f109332zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, lqeggnwhkg.iobyxmoadg.f109333iobyxmoadg));
    }
}
