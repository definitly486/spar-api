package ci0;

import bl.ppxfxbqfkf;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.io.EOFException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import lk.yadqdtsiqt;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fi0.iobyxmoadg f19906iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private AtomicInteger f19907ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Charset f19908zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C0368iobyxmoadg f19905wkgbmnqykc = new C0368iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f19904eablkybsjg = 8;

    /* JADX INFO: renamed from: ci0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0368iobyxmoadg {
        public /* synthetic */ C0368iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0368iobyxmoadg() {
        }
    }

    public iobyxmoadg(fi0.iobyxmoadg networkItemsRepository) {
        zdlpuopuiu.btonecajqb(networkItemsRepository, "networkItemsRepository");
        this.f19906iobyxmoadg = networkItemsRepository;
        this.f19908zoijcleaow = Charset.forName("UTF-8");
        this.f19907ppxfxbqfkf = new AtomicInteger();
    }

    private final boolean iobyxmoadg(yggfygwlhe yggfygwlheVar) {
        String strIobyxmoadg = yggfygwlheVar.iobyxmoadg("Content-Encoding");
        return (strIobyxmoadg == null || kcexrzcfyt.istkbnxepw(strIobyxmoadg, "identity", true) || kcexrzcfyt.istkbnxepw(strIobyxmoadg, "gzip", true)) ? false : true;
    }

    private final boolean ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        try {
            ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
            ppxfxbqfkfVar.draadjrbmk(ppxfxbqfkfVar2, 0L, zg.gtknphoqwx.gtknphoqwx(ppxfxbqfkfVar.dsvhmnatus(), 64L));
            for (int i13 = 0; i13 < 16; i13++) {
                if (!ppxfxbqfkfVar2.n()) {
                    int iCdpycssgdh = ppxfxbqfkfVar2.cdpycssgdh();
                    if (Character.isISOControl(iCdpycssgdh) && !Character.isWhitespace(iCdpycssgdh)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private final boolean zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
        try {
            ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
            ppxfxbqfkfVar.draadjrbmk(ppxfxbqfkfVar2, 0L, ppxfxbqfkfVar.dsvhmnatus() < 64 ? ppxfxbqfkfVar.dsvhmnatus() : 64L);
            for (int i13 = 0; i13 < 16; i13++) {
                if (!ppxfxbqfkfVar2.n()) {
                    int iCdpycssgdh = ppxfxbqfkfVar2.cdpycssgdh();
                    if (Character.isISOControl(iCdpycssgdh) && !Character.isWhitespace(iCdpycssgdh)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        String strF;
        Charset charsetIobyxmoadg;
        yadqdtsiqt yadqdtsiqtVarZoijcleaow;
        zdlpuopuiu.btonecajqb(chain, "chain");
        zynmafqrjb zynmafqrjbVarDxjokdxxww = chain.dxjokdxxww();
        String strValueOf = String.valueOf(this.f19907ppxfxbqfkf.incrementAndGet());
        istkbnxepw istkbnxepwVarIobyxmoadg = zynmafqrjbVarDxjokdxxww.iobyxmoadg();
        String strAgtfadlqog = null;
        if (istkbnxepwVarIobyxmoadg == null) {
            strF = "No payload";
        } else if (iobyxmoadg(zynmafqrjbVarDxjokdxxww.eablkybsjg())) {
            strF = "Encoded payload";
        } else if (istkbnxepwVarIobyxmoadg.iobyxmoadg() > 4096) {
            strF = "Payload too large";
        } else {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            istkbnxepwVarIobyxmoadg.dxjokdxxww(ppxfxbqfkfVar);
            if (zoijcleaow(ppxfxbqfkfVar)) {
                cqumvgiudr cqumvgiudrVarZoijcleaow = istkbnxepwVarIobyxmoadg.zoijcleaow();
                if (cqumvgiudrVarZoijcleaow == null || (charsetIobyxmoadg = cqumvgiudrVarZoijcleaow.iobyxmoadg(this.f19908zoijcleaow)) == null) {
                    charsetIobyxmoadg = this.f19908zoijcleaow;
                }
                strF = charsetIobyxmoadg != null ? ppxfxbqfkfVar.F(charsetIobyxmoadg) : null;
                if (strF == null) {
                    strF = "";
                }
            } else {
                strF = "Binary payload, " + istkbnxepwVarIobyxmoadg.iobyxmoadg() + "-byte body";
            }
        }
        fi0.iobyxmoadg iobyxmoadgVar = this.f19906iobyxmoadg;
        URI uriYggfygwlhe = zynmafqrjbVarDxjokdxxww.gtknphoqwx().yggfygwlhe();
        yggfygwlhe<vdvldrhtss> yggfygwlheVarEablkybsjg = zynmafqrjbVarDxjokdxxww.eablkybsjg();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(yggfygwlheVarEablkybsjg, 10));
        for (vdvldrhtss vdvldrhtssVar : yggfygwlheVarEablkybsjg) {
            arrayList.add("[" + vdvldrhtssVar.lqeggnwhkg() + "] " + vdvldrhtssVar.nufgyqmvbu());
        }
        iobyxmoadgVar.wkgbmnqykc(strValueOf, uriYggfygwlhe, strF, arrayList);
        cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(zynmafqrjbVarDxjokdxxww);
        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVarZoijcleaow.wkgbmnqykc();
        cqumvgiudr cqumvgiudrVarDxjokdxxww = yadqdtsiqtVarWkgbmnqykc.dxjokdxxww();
        if (ppxfxbqfkf(yadqdtsiqtVarWkgbmnqykc.draadjrbmk().zoijcleaow()) && (cqumvgiudrVarDxjokdxxww == null || zdlpuopuiu.eablkybsjg(cqumvgiudrVarDxjokdxxww.lqeggnwhkg(), "json"))) {
            strAgtfadlqog = yadqdtsiqtVarWkgbmnqykc.agtfadlqog();
        }
        fi0.iobyxmoadg iobyxmoadgVar2 = this.f19906iobyxmoadg;
        yggfygwlhe<vdvldrhtss> yggfygwlheVarKcexrzcfyt = cdpycssgdhVarZoijcleaow.kcexrzcfyt();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(yggfygwlheVarKcexrzcfyt, 10));
        for (vdvldrhtss vdvldrhtssVar2 : yggfygwlheVarKcexrzcfyt) {
            arrayList2.add("[" + vdvldrhtssVar2.lqeggnwhkg() + "] " + vdvldrhtssVar2.nufgyqmvbu());
        }
        iobyxmoadgVar2.gxszxtbevo(strValueOf, strAgtfadlqog, arrayList2);
        cdpycssgdh.iobyxmoadg iobyxmoadgVarCqumvgiudr = cdpycssgdhVarZoijcleaow.cqumvgiudr();
        if (strAgtfadlqog != null && (yadqdtsiqtVarZoijcleaow = yadqdtsiqt.f63238yggfygwlhe.zoijcleaow(strAgtfadlqog, cqumvgiudrVarDxjokdxxww)) != null) {
            yadqdtsiqtVarWkgbmnqykc = yadqdtsiqtVarZoijcleaow;
        }
        return iobyxmoadgVarCqumvgiudr.zoijcleaow(yadqdtsiqtVarWkgbmnqykc).ppxfxbqfkf();
    }
}
