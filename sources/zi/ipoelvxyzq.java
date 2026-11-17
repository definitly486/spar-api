package zi;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ipoelvxyzq {
    /* JADX WARN: Multi-variable type inference failed */
    public static final kegysxyocb iobyxmoadg(kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        if (kegysxyocbVar instanceof fyldjkxazc) {
            return ((fyldjkxazc) kegysxyocbVar).metgxyhuhe();
        }
        return null;
    }

    public static final grlcpdaxtj ppxfxbqfkf(grlcpdaxtj grlcpdaxtjVar, kegysxyocb origin, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(grlcpdaxtjVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(origin, "origin");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        kegysxyocb kegysxyocbVarIobyxmoadg = iobyxmoadg(origin);
        return wkgbmnqykc(grlcpdaxtjVar, kegysxyocbVarIobyxmoadg != null ? (kegysxyocb) transform.invoke(kegysxyocbVarIobyxmoadg) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final grlcpdaxtj wkgbmnqykc(grlcpdaxtj grlcpdaxtjVar, kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(grlcpdaxtjVar, "<this>");
        if (grlcpdaxtjVar instanceof fyldjkxazc) {
            return wkgbmnqykc(((fyldjkxazc) grlcpdaxtjVar).wizcaqwiak(), kegysxyocbVar);
        }
        if (kegysxyocbVar == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kegysxyocbVar, grlcpdaxtjVar)) {
            return grlcpdaxtjVar;
        }
        if (grlcpdaxtjVar instanceof ikoacuggdj) {
            return new xrmfcynszj((ikoacuggdj) grlcpdaxtjVar, kegysxyocbVar);
        }
        if (grlcpdaxtjVar instanceof ylkuphrtab) {
            return new hcddaimhww((ylkuphrtab) grlcpdaxtjVar, kegysxyocbVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final grlcpdaxtj zoijcleaow(grlcpdaxtj grlcpdaxtjVar, kegysxyocb origin) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(grlcpdaxtjVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(origin, "origin");
        return wkgbmnqykc(grlcpdaxtjVar, iobyxmoadg(origin));
    }
}
