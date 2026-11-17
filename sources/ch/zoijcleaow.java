package ch;

import ah.eablkybsjg;
import ah.ojitshcjhn;
import ah.rgvfuqvkyq;
import dh.c;
import dh.eslsurpljm;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import jh.gxszxtbevo;
import jh.nufgyqmvbu;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final ah.wkgbmnqykc iobyxmoadg(eablkybsjg eablkybsjgVar) {
        Object obj;
        ah.wkgbmnqykc wkgbmnqykcVarZoijcleaow;
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        if (eablkybsjgVar instanceof ah.wkgbmnqykc) {
            return (ah.wkgbmnqykc) eablkybsjgVar;
        }
        if (!(eablkybsjgVar instanceof rgvfuqvkyq)) {
            throw new c("Cannot calculate JVM erasure for type: " + eablkybsjgVar);
        }
        List upperBounds = ((rgvfuqvkyq) eablkybsjgVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) next;
            zdlpuopuiu.nufgyqmvbu(ojitshcjhnVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ((eslsurpljm) ojitshcjhnVar).oxmwwwfdhm().grlcpdaxtj().ylkuphrtab();
            jh.eablkybsjg eablkybsjgVar2 = nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc : null;
            if (eablkybsjgVar2 != null && eablkybsjgVar2.getKind() != gxszxtbevo.INTERFACE && eablkybsjgVar2.getKind() != gxszxtbevo.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        ojitshcjhn ojitshcjhnVar2 = (ojitshcjhn) obj;
        if (ojitshcjhnVar2 == null) {
            ojitshcjhnVar2 = (ojitshcjhn) jyumaefscl.weqkydbzbr(upperBounds);
        }
        return (ojitshcjhnVar2 == null || (wkgbmnqykcVarZoijcleaow = zoijcleaow(ojitshcjhnVar2)) == null) ? cllcsxoeiz.zoijcleaow(Object.class) : wkgbmnqykcVarZoijcleaow;
    }

    public static final ah.wkgbmnqykc zoijcleaow(ojitshcjhn ojitshcjhnVar) {
        ah.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(ojitshcjhnVar, "<this>");
        eablkybsjg eablkybsjgVarAgtfadlqog = ojitshcjhnVar.agtfadlqog();
        if (eablkybsjgVarAgtfadlqog != null && (wkgbmnqykcVarIobyxmoadg = iobyxmoadg(eablkybsjgVarAgtfadlqog)) != null) {
            return wkgbmnqykcVarIobyxmoadg;
        }
        throw new c("Cannot calculate JVM erasure for type: " + ojitshcjhnVar);
    }
}
