package jh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kegysxyocb {
    public static final void iobyxmoadg(cllcsxoeiz cllcsxoeizVar, ii.ppxfxbqfkf fqName, Collection packageFragments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cllcsxoeizVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragments, "packageFragments");
        if (cllcsxoeizVar instanceof tzroggbefp) {
            ((tzroggbefp) cllcsxoeizVar).ppxfxbqfkf(fqName, packageFragments);
        } else {
            packageFragments.addAll(cllcsxoeizVar.zoijcleaow(fqName));
        }
    }

    public static final List ppxfxbqfkf(cllcsxoeiz cllcsxoeizVar, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cllcsxoeizVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        iobyxmoadg(cllcsxoeizVar, fqName, arrayList);
        return arrayList;
    }

    public static final boolean zoijcleaow(cllcsxoeiz cllcsxoeizVar, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cllcsxoeizVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return cllcsxoeizVar instanceof tzroggbefp ? ((tzroggbefp) cllcsxoeizVar).iobyxmoadg(fqName) : ppxfxbqfkf(cllcsxoeizVar, fqName).isEmpty();
    }
}
