package aj;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import zi.ageimvtcrz;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.nuxfzjnpeb;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pmvmpeiblj {
    private static final kegysxyocb iobyxmoadg(kegysxyocb kegysxyocbVar) {
        return (kegysxyocb) fj.ppxfxbqfkf.zoijcleaow(kegysxyocbVar).wkgbmnqykc();
    }

    private static final StringBuilder ppxfxbqfkf(String str, StringBuilder sb3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        sb3.append(str);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        sb3.append('\n');
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        return sb3;
    }

    public static final kegysxyocb wkgbmnqykc(kegysxyocb subtype, kegysxyocb supertype, cqumvgiudr typeCheckingProcedureCallbacks) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtype, "subtype");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supertype, "supertype");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new yggfygwlhe(subtype, null));
        zeieaojujs zeieaojujsVarGrlcpdaxtj = supertype.grlcpdaxtj();
        while (!arrayDeque.isEmpty()) {
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) arrayDeque.poll();
            kegysxyocb kegysxyocbVarZoijcleaow = yggfygwlheVar.zoijcleaow();
            zeieaojujs zeieaojujsVarGrlcpdaxtj2 = kegysxyocbVarZoijcleaow.grlcpdaxtj();
            if (typeCheckingProcedureCallbacks.iobyxmoadg(zeieaojujsVarGrlcpdaxtj2, zeieaojujsVarGrlcpdaxtj)) {
                boolean zMhtqkkgtqm = kegysxyocbVarZoijcleaow.mhtqkkgtqm();
                for (yggfygwlhe yggfygwlheVarIobyxmoadg = yggfygwlheVar.iobyxmoadg(); yggfygwlheVarIobyxmoadg != null; yggfygwlheVarIobyxmoadg = yggfygwlheVarIobyxmoadg.iobyxmoadg()) {
                    kegysxyocb kegysxyocbVarZoijcleaow2 = yggfygwlheVarIobyxmoadg.zoijcleaow();
                    List listFyldjkxazc = kegysxyocbVarZoijcleaow2.fyldjkxazc();
                    if (listFyldjkxazc != null && listFyldjkxazc.isEmpty()) {
                        kegysxyocbVarZoijcleaow = nuxfzjnpeb.f130098ppxfxbqfkf.iobyxmoadg(kegysxyocbVarZoijcleaow2).ppxfxbqfkf().agtfadlqog(kegysxyocbVarZoijcleaow, mhtqkkgtqm.INVARIANT);
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVarZoijcleaow);
                        break;
                    }
                    Iterator it = listFyldjkxazc.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            kegysxyocbVarZoijcleaow = nuxfzjnpeb.f130098ppxfxbqfkf.iobyxmoadg(kegysxyocbVarZoijcleaow2).ppxfxbqfkf().agtfadlqog(kegysxyocbVarZoijcleaow, mhtqkkgtqm.INVARIANT);
                            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVarZoijcleaow);
                            break;
                        }
                        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = ((iwxlajgraz) it.next()).ppxfxbqfkf();
                        mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.INVARIANT;
                        if (mhtqkkgtqmVarPpxfxbqfkf != mhtqkkgtqmVar) {
                            kegysxyocb kegysxyocbVarAgtfadlqog = mi.eablkybsjg.nufgyqmvbu(nuxfzjnpeb.f130098ppxfxbqfkf.iobyxmoadg(kegysxyocbVarZoijcleaow2), false, 1, null).ppxfxbqfkf().agtfadlqog(kegysxyocbVarZoijcleaow, mhtqkkgtqmVar);
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kegysxyocbVarAgtfadlqog, "safeSubstitute(...)");
                            kegysxyocbVarZoijcleaow = iobyxmoadg(kegysxyocbVarAgtfadlqog);
                            break;
                        }
                    }
                    zMhtqkkgtqm = zMhtqkkgtqm || kegysxyocbVarZoijcleaow2.mhtqkkgtqm();
                }
                zeieaojujs zeieaojujsVarGrlcpdaxtj3 = kegysxyocbVarZoijcleaow.grlcpdaxtj();
                if (typeCheckingProcedureCallbacks.iobyxmoadg(zeieaojujsVarGrlcpdaxtj3, zeieaojujsVarGrlcpdaxtj)) {
                    return ageimvtcrz.rgvfuqvkyq(kegysxyocbVarZoijcleaow, zMhtqkkgtqm);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + zoijcleaow(zeieaojujsVarGrlcpdaxtj3) + ", \n\nsupertype: " + zoijcleaow(zeieaojujsVarGrlcpdaxtj) + " \n" + typeCheckingProcedureCallbacks.iobyxmoadg(zeieaojujsVarGrlcpdaxtj3, zeieaojujsVarGrlcpdaxtj));
            }
            for (kegysxyocb kegysxyocbVar : zeieaojujsVarGrlcpdaxtj2.zoijcleaow()) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
                arrayDeque.add(new yggfygwlhe(kegysxyocbVar, yggfygwlheVar));
            }
        }
        return null;
    }

    private static final String zoijcleaow(zeieaojujs zeieaojujsVar) {
        StringBuilder sb3 = new StringBuilder();
        ppxfxbqfkf("type: " + zeieaojujsVar, sb3);
        ppxfxbqfkf("hashCode: " + zeieaojujsVar.hashCode(), sb3);
        ppxfxbqfkf("javaClass: " + zeieaojujsVar.getClass().getCanonicalName(), sb3);
        for (jh.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = zeieaojujsVar.wkgbmnqykc(); wflxmlrfwpVarWkgbmnqykc != null; wflxmlrfwpVarWkgbmnqykc = wflxmlrfwpVarWkgbmnqykc.zoijcleaow()) {
            ppxfxbqfkf("fqName: " + ki.agtfadlqog.f55536nufgyqmvbu.dsvhmnatus(wflxmlrfwpVarWkgbmnqykc), sb3);
            ppxfxbqfkf("javaClass: " + wflxmlrfwpVarWkgbmnqykc.getClass().getCanonicalName(), sb3);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }
}
