package vj;

import gg.kcexrzcfyt;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.nufgyqmvbu;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlinx.coroutines.TimeoutCancellationException;
import lg.btonecajqb;
import lg.gxszxtbevo;
import pj.istkbnxepw;
import pj.wizcaqwiak;
import tg.rgvfuqvkyq;
import uj.esjtqupxsv;
import uj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar, Object obj, gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(gxszxtbevoVar);
        try {
            btonecajqb context = gxszxtbevoVarIobyxmoadg.getContext();
            Object objDxjokdxxww = pkzmftpjix.dxjokdxxww(context, null);
            try {
                nufgyqmvbu.zoijcleaow(gxszxtbevoVarIobyxmoadg);
                Object objWkgbmnqykc = !(rgvfuqvkyqVar instanceof kotlin.coroutines.jvm.internal.iobyxmoadg) ? mg.zoijcleaow.wkgbmnqykc(rgvfuqvkyqVar, obj, gxszxtbevoVarIobyxmoadg) : ((rgvfuqvkyq) mbcevpiqjq.eablkybsjg(rgvfuqvkyqVar, 2)).invoke(obj, gxszxtbevoVarIobyxmoadg);
                pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                if (objWkgbmnqykc != mg.zoijcleaow.gxszxtbevo()) {
                    gxszxtbevoVarIobyxmoadg.resumeWith(kcexrzcfyt.wkgbmnqykc(objWkgbmnqykc));
                }
            } catch (Throwable th2) {
                pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                throw th2;
            }
        } catch (Throwable th3) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVarIobyxmoadg.resumeWith(kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th3)));
        }
    }

    public static final Object ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, Object obj, rgvfuqvkyq rgvfuqvkyqVar) throws Throwable {
        Object istkbnxepwVar;
        Object objTbqsvytpvh;
        try {
            istkbnxepwVar = !(rgvfuqvkyqVar instanceof kotlin.coroutines.jvm.internal.iobyxmoadg) ? mg.zoijcleaow.wkgbmnqykc(rgvfuqvkyqVar, obj, esjtqupxsvVar) : ((rgvfuqvkyq) mbcevpiqjq.eablkybsjg(rgvfuqvkyqVar, 2)).invoke(obj, esjtqupxsvVar);
        } catch (Throwable th2) {
            istkbnxepwVar = new istkbnxepw(th2, false, 2, null);
        }
        if (istkbnxepwVar != mg.zoijcleaow.gxszxtbevo() && (objTbqsvytpvh = esjtqupxsvVar.tbqsvytpvh(istkbnxepwVar)) != wizcaqwiak.f76797zoijcleaow) {
            if (objTbqsvytpvh instanceof istkbnxepw) {
                Throwable th3 = ((istkbnxepw) objTbqsvytpvh).f76725iobyxmoadg;
                if (!(th3 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th3).coroutine != esjtqupxsvVar) {
                    throw th3;
                }
                if (istkbnxepwVar instanceof istkbnxepw) {
                    throw ((istkbnxepw) istkbnxepwVar).f76725iobyxmoadg;
                }
            } else {
                istkbnxepwVar = wizcaqwiak.nufgyqmvbu(objTbqsvytpvh);
            }
            return istkbnxepwVar;
        }
        return mg.zoijcleaow.gxszxtbevo();
    }

    public static final Object zoijcleaow(esjtqupxsv esjtqupxsvVar, Object obj, rgvfuqvkyq rgvfuqvkyqVar) {
        Object istkbnxepwVar;
        Object objTbqsvytpvh;
        try {
            istkbnxepwVar = !(rgvfuqvkyqVar instanceof kotlin.coroutines.jvm.internal.iobyxmoadg) ? mg.zoijcleaow.wkgbmnqykc(rgvfuqvkyqVar, obj, esjtqupxsvVar) : ((rgvfuqvkyq) mbcevpiqjq.eablkybsjg(rgvfuqvkyqVar, 2)).invoke(obj, esjtqupxsvVar);
        } catch (Throwable th2) {
            istkbnxepwVar = new istkbnxepw(th2, false, 2, null);
        }
        if (istkbnxepwVar != mg.zoijcleaow.gxszxtbevo() && (objTbqsvytpvh = esjtqupxsvVar.tbqsvytpvh(istkbnxepwVar)) != wizcaqwiak.f76797zoijcleaow) {
            if (objTbqsvytpvh instanceof istkbnxepw) {
                throw ((istkbnxepw) objTbqsvytpvh).f76725iobyxmoadg;
            }
            return wizcaqwiak.nufgyqmvbu(objTbqsvytpvh);
        }
        return mg.zoijcleaow.gxszxtbevo();
    }
}
