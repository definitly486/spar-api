package xrmfcynszj;

import androidx.compose.foundation.lazy.layout.cllcsxoeiz;
import androidx.compose.runtime.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import jztzpxfvev.hkdspvbjdz;
import jztzpxfvev.jlmebxxoox;
import jztzpxfvev.roivzttewh;
import yfnezrywwk.cqumvgiudr;
import yfnezrywwk.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f123163iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn f123164zoijcleaow;

        iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, ojitshcjhn ojitshcjhnVar) {
            this.f123163iobyxmoadg = mbcevpiqjqVar;
            this.f123164zoijcleaow = ojitshcjhnVar;
        }

        private final int ppxfxbqfkf() {
            cqumvgiudr cqumvgiudrVarWkgbmnqykc = wkgbmnqykc();
            int size = 0;
            if (cqumvgiudrVarWkgbmnqykc.nufgyqmvbu().isEmpty()) {
                return 0;
            }
            int size2 = cqumvgiudrVarWkgbmnqykc.nufgyqmvbu().size();
            Iterator it = cqumvgiudrVarWkgbmnqykc.nufgyqmvbu().iterator();
            while (it.hasNext()) {
                size += ((yfnezrywwk.agtfadlqog) it.next()).getSize();
            }
            return size / size2;
        }

        private final cqumvgiudr wkgbmnqykc() {
            return this.f123163iobyxmoadg.cdpycssgdh();
        }

        @Override // xrmfcynszj.agtfadlqog
        public float iobyxmoadg(float f13) {
            List listNufgyqmvbu = wkgbmnqykc().nufgyqmvbu();
            ojitshcjhn ojitshcjhnVar = this.f123164zoijcleaow;
            int size = listNufgyqmvbu.size();
            float f14 = Float.NEGATIVE_INFINITY;
            float f15 = Float.POSITIVE_INFINITY;
            for (int i13 = 0; i13 < size; i13++) {
                yfnezrywwk.agtfadlqog agtfadlqogVar = (yfnezrywwk.agtfadlqog) listNufgyqmvbu.get(i13);
                cllcsxoeiz cllcsxoeizVar = agtfadlqogVar instanceof cllcsxoeiz ? (cllcsxoeiz) agtfadlqogVar : null;
                if (cllcsxoeizVar == null || !cllcsxoeizVar.eablkybsjg()) {
                    float fIobyxmoadg = rgvfuqvkyq.iobyxmoadg(gxszxtbevo.ppxfxbqfkf(wkgbmnqykc()), wkgbmnqykc().wkgbmnqykc(), wkgbmnqykc().zoijcleaow(), agtfadlqogVar.getSize(), agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.getIndex(), ojitshcjhnVar, wkgbmnqykc().gxszxtbevo());
                    if (fIobyxmoadg <= 0.0f && fIobyxmoadg > f14) {
                        f14 = fIobyxmoadg;
                    }
                    if (fIobyxmoadg >= 0.0f && fIobyxmoadg < f15) {
                        f15 = fIobyxmoadg;
                    }
                }
            }
            return wflxmlrfwp.draadjrbmk(gxszxtbevo.zoijcleaow(this.f123163iobyxmoadg.cqumvgiudr(), f13), f14, f15);
        }

        @Override // xrmfcynszj.agtfadlqog
        public float zoijcleaow(float f13, float f14) {
            return zg.gtknphoqwx.eablkybsjg(Math.abs(f14) - ppxfxbqfkf(), 0.0f) * Math.signum(f14);
        }
    }

    public static final agtfadlqog iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, ojitshcjhn ojitshcjhnVar) {
        return new iobyxmoadg(mbcevpiqjqVar, ojitshcjhnVar);
    }

    public static final int ppxfxbqfkf(cqumvgiudr cqumvgiudrVar) {
        return (int) (cqumvgiudrVar.getOrientation() == jlmebxxoox.Vertical ? cqumvgiudrVar.iobyxmoadg() & 4294967295L : cqumvgiudrVar.iobyxmoadg() >> 32);
    }

    public static final hkdspvbjdz wkgbmnqykc(mbcevpiqjq mbcevpiqjqVar, ojitshcjhn ojitshcjhnVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 2) != 0) {
            ojitshcjhnVar = ojitshcjhn.iobyxmoadg.f123190iobyxmoadg;
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-338621290, i13, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z13 = (((i13 & 14) ^ 6) > 4 && draadjrbmkVar.ulzqkzuiru(mbcevpiqjqVar)) || (i13 & 6) == 4;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = iobyxmoadg(mbcevpiqjqVar, ojitshcjhnVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        roivzttewh roivzttewhVarRgvfuqvkyq = wflxmlrfwp.rgvfuqvkyq((agtfadlqog) objYadqdtsiqt, draadjrbmkVar, 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return roivzttewhVarRgvfuqvkyq;
    }

    public static final int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, float f13) {
        if (Math.abs(f13) < wkgbmnqykcVar.I(wflxmlrfwp.ojitshcjhn())) {
            return wkgbmnqykc.f123206iobyxmoadg.iobyxmoadg();
        }
        return f13 > 0.0f ? wkgbmnqykc.f123206iobyxmoadg.zoijcleaow() : wkgbmnqykc.f123206iobyxmoadg.ppxfxbqfkf();
    }
}
