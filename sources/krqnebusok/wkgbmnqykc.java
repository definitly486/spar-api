package krqnebusok;

import androidx.compose.runtime.tooling.DiagnosticComposeException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r9
      0x0034: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:5:0x0021, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void iobyxmoadg(StringBuilder sb3, List list) {
        List listPpxfxbqfkf = hg.jyumaefscl.ppxfxbqfkf();
        List listMbcevpiqjq = hg.jyumaefscl.mbcevpiqjq(list);
        int size = listMbcevpiqjq.size();
        String str = null;
        String str2 = null;
        for (int i13 = 0; i13 < size; i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) listMbcevpiqjq.get(i13);
            jyumaefscl jyumaefsclVarWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
            String strIobyxmoadg = jyumaefsclVarWkgbmnqykc.iobyxmoadg();
            if (strIobyxmoadg != null) {
                str = strIobyxmoadg;
            } else {
                strIobyxmoadg = jyumaefsclVarWkgbmnqykc.eablkybsjg() ? "<lambda>" : null;
                if (strIobyxmoadg != null) {
                    str = strIobyxmoadg;
                } else if (str == null) {
                    str = "<unknown function>";
                }
            }
            String strWkgbmnqykc = jyumaefsclVarWkgbmnqykc.wkgbmnqykc();
            if (strWkgbmnqykc != null) {
                str2 = strWkgbmnqykc;
            } else if (str2 == null) {
                str2 = "<unknown file>";
            }
            List listZoijcleaow = jyumaefsclVarWkgbmnqykc.zoijcleaow();
            String str3 = str + '(' + str2 + ':' + ((ppxfxbqfkfVar.ppxfxbqfkf() == null || ppxfxbqfkfVar.ppxfxbqfkf().intValue() >= listZoijcleaow.size()) ? "<unknown line>" : String.valueOf(((ojitshcjhn) listZoijcleaow.get(ppxfxbqfkfVar.ppxfxbqfkf().intValue())).iobyxmoadg())) + ')';
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str3, "toString(...)");
            if (!jyumaefsclVarWkgbmnqykc.eablkybsjg()) {
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVarWkgbmnqykc.iobyxmoadg(), "rememberCompositionContext") || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVarWkgbmnqykc.ppxfxbqfkf(), "9igjgp")) {
                listPpxfxbqfkf.add(str3);
            }
        }
        List listMbcevpiqjq2 = hg.jyumaefscl.mbcevpiqjq(hg.jyumaefscl.iobyxmoadg(listPpxfxbqfkf));
        int size2 = listMbcevpiqjq2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            sb3.append("\tat " + ((String) listMbcevpiqjq2.get(i14)));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            sb3.append('\n');
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0023, B:15:0x0031), top: B:24:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    public static final boolean ppxfxbqfkf(Throwable th2, tg.iobyxmoadg iobyxmoadgVar) {
        DiagnosticComposeException diagnosticComposeException;
        List list;
        boolean zIsEmpty;
        List listZoijcleaow = gg.lqeggnwhkg.zoijcleaow(th2);
        boolean z13 = false;
        if (listZoijcleaow == null || !listZoijcleaow.isEmpty()) {
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                }
            }
            try {
                list = (List) iobyxmoadgVar.invoke();
                zIsEmpty = list.isEmpty();
                z13 = !zIsEmpty;
                if (zIsEmpty) {
                    diagnosticComposeException = null;
                } else {
                    diagnosticComposeException = new DiagnosticComposeException(list);
                }
            } catch (Throwable th3) {
                diagnosticComposeException = th3;
            }
            if (diagnosticComposeException != null) {
                gg.lqeggnwhkg.iobyxmoadg(th2, diagnosticComposeException);
            }
        } else {
            list = (List) iobyxmoadgVar.invoke();
            zIsEmpty = list.isEmpty();
            z13 = !zIsEmpty;
            if (zIsEmpty) {
                diagnosticComposeException = new DiagnosticComposeException(list);
            } else {
                diagnosticComposeException = null;
            }
            if (diagnosticComposeException != null) {
                gg.lqeggnwhkg.iobyxmoadg(th2, diagnosticComposeException);
            }
        }
        return z13;
    }

    public static final Throwable zoijcleaow(Throwable th2, tg.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(th2, iobyxmoadgVar);
        return th2;
    }
}
