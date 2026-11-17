package androidx.compose.ui.platform;

import android.content.res.Resources;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class esjtqupxsv {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f6876iobyxmoadg;

        static {
            int[] iArr = new int[i0.iobyxmoadg.values().length];
            try {
                iArr[i0.iobyxmoadg.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.iobyxmoadg.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.iobyxmoadg.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6876iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.collection.ojitshcjhn f6877zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(androidx.collection.ojitshcjhn ojitshcjhnVar) {
            super(1);
            this.f6877zdlpuopuiu = ojitshcjhnVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(g0.zdlpuopuiu zdlpuopuiuVar) {
            return Boolean.valueOf(this.f6877zdlpuopuiu.iobyxmoadg(zdlpuopuiuVar.vdvldrhtss()));
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Resources f6878zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(Resources resources) {
            super(1);
            this.f6878zdlpuopuiu = resources;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(g0.zdlpuopuiu zdlpuopuiuVar) {
            return Boolean.valueOf(esjtqupxsv.yggfygwlhe(zdlpuopuiuVar, this.f6878zdlpuopuiu));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f6879zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z.pkzmftpjix pkzmftpjixVar) {
            boolean z13;
            g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = pkzmftpjixVar.wkgbmnqykc();
            if (wflxmlrfwpVarWkgbmnqykc != null) {
                z13 = wflxmlrfwpVarWkgbmnqykc.agtfadlqog() && wflxmlrfwpVarWkgbmnqykc.ppxfxbqfkf(g0.esjtqupxsv.f35662iobyxmoadg.lqeggnwhkg());
            }
            return Boolean.valueOf(z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean agtfadlqog(g0.zdlpuopuiu zdlpuopuiuVar) {
        return !zdlpuopuiuVar.rgvfuqvkyq().ppxfxbqfkf(g0.esjtqupxsv.f35662iobyxmoadg.gxszxtbevo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean draadjrbmk(g0.iobyxmoadg iobyxmoadgVar, Object obj) {
        if (iobyxmoadgVar == obj) {
            return true;
        }
        if (!(obj instanceof g0.iobyxmoadg)) {
            return false;
        }
        g0.iobyxmoadg iobyxmoadgVar2 = (g0.iobyxmoadg) obj;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar2.zoijcleaow())) {
            return false;
        }
        if (iobyxmoadgVar.iobyxmoadg() != null || iobyxmoadgVar2.iobyxmoadg() == null) {
            return iobyxmoadgVar.iobyxmoadg() == null || iobyxmoadgVar2.iobyxmoadg() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(androidx.collection.ojitshcjhn ojitshcjhnVar, androidx.collection.cdpycssgdh cdpycssgdhVar, androidx.collection.cdpycssgdh cdpycssgdhVar2, Resources resources) {
        cdpycssgdhVar.dxjokdxxww();
        cdpycssgdhVar2.dxjokdxxww();
        g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) ojitshcjhnVar.zoijcleaow(-1);
        g0.zdlpuopuiu zdlpuopuiuVarZoijcleaow = jyumaefsclVar != null ? jyumaefsclVar.zoijcleaow() : null;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zdlpuopuiuVarZoijcleaow);
        List listGxszxtbevo = g0.ylkuphrtab.gxszxtbevo(zdlpuopuiuVarZoijcleaow, new ppxfxbqfkf(ojitshcjhnVar), new wkgbmnqykc(resources), hg.jyumaefscl.eablkybsjg(zdlpuopuiuVarZoijcleaow));
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(listGxszxtbevo);
        int i13 = 1;
        if (1 > iOjitshcjhn) {
            return;
        }
        while (true) {
            int iVdvldrhtss = ((g0.zdlpuopuiu) listGxszxtbevo.get(i13 - 1)).vdvldrhtss();
            int iVdvldrhtss2 = ((g0.zdlpuopuiu) listGxszxtbevo.get(i13)).vdvldrhtss();
            cdpycssgdhVar.oxmwwwfdhm(iVdvldrhtss, iVdvldrhtss2);
            cdpycssgdhVar2.oxmwwwfdhm(iVdvldrhtss2, iVdvldrhtss);
            if (i13 == iOjitshcjhn) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean jyumaefscl(g0.zdlpuopuiu zdlpuopuiuVar, g0.wflxmlrfwp wflxmlrfwpVar) {
        Iterator it = wflxmlrfwpVar.iterator();
        while (it.hasNext()) {
            if (!zdlpuopuiuVar.rgvfuqvkyq().ppxfxbqfkf((g0.cdpycssgdh) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0.eablkybsjg kcexrzcfyt(g0.zdlpuopuiu zdlpuopuiuVar) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        j0.eablkybsjg eablkybsjgVar = (j0.eablkybsjg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.lqeggnwhkg());
        List list = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.pkzmftpjix());
        return eablkybsjgVar == null ? list != null ? (j0.eablkybsjg) hg.jyumaefscl.weqkydbzbr(list) : null : eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ojitshcjhn(g0.zdlpuopuiu zdlpuopuiuVar) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.lqeggnwhkg()) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.dxjokdxxww()), Boolean.TRUE)) {
            return true;
        }
        z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq = rgvfuqvkyq(zdlpuopuiuVar.kcexrzcfyt(), zoijcleaow.f6879zdlpuopuiu);
        if (pkzmftpjixVarRgvfuqvkyq != null) {
            g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = pkzmftpjixVarRgvfuqvkyq.wkgbmnqykc();
            if (!(wflxmlrfwpVarWkgbmnqykc != null ? kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarWkgbmnqykc, esjtqupxsvVar.dxjokdxxww()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String oxmwwwfdhm(g0.zdlpuopuiu zdlpuopuiuVar, Resources resources) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        Object objIobyxmoadg = g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.wwaezpbzkn());
        i0.iobyxmoadg iobyxmoadgVar = (i0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.hkdspvbjdz());
        g0.nufgyqmvbu nufgyqmvbuVar = (g0.nufgyqmvbu) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.cdpycssgdh());
        int iAgtfadlqog = 0;
        if (iobyxmoadgVar != null) {
            int i13 = iobyxmoadg.f6876iobyxmoadg[iobyxmoadgVar.ordinal()];
            if (i13 == 1) {
                if ((nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), g0.nufgyqmvbu.f35737zoijcleaow.lqeggnwhkg())) && objIobyxmoadg == null) {
                    objIobyxmoadg = resources.getString(a.draadjrbmk.state_on);
                }
            } else if (i13 == 2) {
                if ((nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), g0.nufgyqmvbu.f35737zoijcleaow.lqeggnwhkg())) && objIobyxmoadg == null) {
                    objIobyxmoadg = resources.getString(a.draadjrbmk.state_off);
                }
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (objIobyxmoadg == null) {
                    objIobyxmoadg = resources.getString(a.draadjrbmk.indeterminate);
                }
            }
        }
        Boolean bool = (Boolean) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.iozdgvuglv());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), g0.nufgyqmvbu.f35737zoijcleaow.nufgyqmvbu())) && objIobyxmoadg == null) {
                objIobyxmoadg = zBooleanValue ? resources.getString(a.draadjrbmk.selected) : resources.getString(a.draadjrbmk.not_selected);
            }
        }
        g0.lqeggnwhkg lqeggnwhkgVar = (g0.lqeggnwhkg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.istkbnxepw());
        if (lqeggnwhkgVar != null) {
            if (lqeggnwhkgVar != g0.lqeggnwhkg.f35724wkgbmnqykc.iobyxmoadg()) {
                if (objIobyxmoadg == null) {
                    zg.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
                    float fZoijcleaow = ((((Number) gxszxtbevoVarPpxfxbqfkf.ppxfxbqfkf()).floatValue() - ((Number) gxszxtbevoVarPpxfxbqfkf.getStart()).floatValue()) > 0.0f ? 1 : ((((Number) gxszxtbevoVarPpxfxbqfkf.ppxfxbqfkf()).floatValue() - ((Number) gxszxtbevoVarPpxfxbqfkf.getStart()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (lqeggnwhkgVar.zoijcleaow() - ((Number) gxszxtbevoVarPpxfxbqfkf.getStart()).floatValue()) / (((Number) gxszxtbevoVarPpxfxbqfkf.ppxfxbqfkf()).floatValue() - ((Number) gxszxtbevoVarPpxfxbqfkf.getStart()).floatValue());
                    if (fZoijcleaow < 0.0f) {
                        fZoijcleaow = 0.0f;
                    }
                    if (fZoijcleaow > 1.0f) {
                        fZoijcleaow = 1.0f;
                    }
                    if (!(fZoijcleaow == 0.0f)) {
                        iAgtfadlqog = (fZoijcleaow == 1.0f ? 1 : 0) != 0 ? 100 : zg.gtknphoqwx.agtfadlqog(Math.round(fZoijcleaow * 100), 1, 99);
                    }
                    objIobyxmoadg = resources.getString(a.draadjrbmk.template_percent, Integer.valueOf(iAgtfadlqog));
                }
            } else if (objIobyxmoadg == null) {
                objIobyxmoadg = resources.getString(a.draadjrbmk.in_progress);
            }
        }
        if (zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.lqeggnwhkg())) {
            objIobyxmoadg = wflxmlrfwp(zdlpuopuiuVar, resources);
        }
        return (String) objIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z.pkzmftpjix rgvfuqvkyq(z.pkzmftpjix pkzmftpjixVar, tg.draadjrbmk draadjrbmkVar) {
        for (z.pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok(); pkzmftpjixVarAuzgnhcxok != null; pkzmftpjixVarAuzgnhcxok = pkzmftpjixVarAuzgnhcxok.auzgnhcxok()) {
            if (((Boolean) draadjrbmkVar.invoke(pkzmftpjixVarAuzgnhcxok)).booleanValue()) {
                return pkzmftpjixVarAuzgnhcxok;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean vdvldrhtss(g0.zdlpuopuiu zdlpuopuiuVar) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        i0.iobyxmoadg iobyxmoadgVar = (i0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, esjtqupxsvVar.hkdspvbjdz());
        g0.nufgyqmvbu nufgyqmvbuVar = (g0.nufgyqmvbu) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.cdpycssgdh());
        boolean z13 = iobyxmoadgVar != null;
        if (((Boolean) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.iozdgvuglv())) != null) {
            return nufgyqmvbuVar != null ? g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), g0.nufgyqmvbu.f35737zoijcleaow.nufgyqmvbu()) : false ? z13 : true;
        }
        return z13;
    }

    private static final String wflxmlrfwp(g0.zdlpuopuiu zdlpuopuiuVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        g0.wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = zdlpuopuiuVar.zoijcleaow().rgvfuqvkyq();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        Collection collection2 = (Collection) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, esjtqupxsvVar.wkgbmnqykc());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, esjtqupxsvVar.pkzmftpjix())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, esjtqupxsvVar.lqeggnwhkg())) == null || charSequence.length() == 0))) {
            return resources.getString(a.draadjrbmk.state_empty);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yggfygwlhe(g0.zdlpuopuiu zdlpuopuiuVar, Resources resources) {
        List list = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), g0.esjtqupxsv.f35662iobyxmoadg.wkgbmnqykc());
        boolean z13 = ((list != null ? (String) hg.jyumaefscl.weqkydbzbr(list) : null) == null && kcexrzcfyt(zdlpuopuiuVar) == null && oxmwwwfdhm(zdlpuopuiuVar, resources) == null && !vdvldrhtss(zdlpuopuiuVar)) ? false : true;
        if (!g0.cqumvgiudr.ppxfxbqfkf(zdlpuopuiuVar)) {
            if (zdlpuopuiuVar.esjtqupxsv().agtfadlqog()) {
                return true;
            }
            if (zdlpuopuiuVar.istkbnxepw() && z13) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zdlpuopuiu(g0.zdlpuopuiu zdlpuopuiuVar) {
        return zdlpuopuiuVar.oxmwwwfdhm().getLayoutDirection() == w0.zdlpuopuiu.Rtl;
    }
}
