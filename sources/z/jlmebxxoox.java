package z;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f127035iobyxmoadg;

        static {
            int[] iArr = new int[pkzmftpjix.eablkybsjg.values().length];
            try {
                iArr[pkzmftpjix.eablkybsjg.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pkzmftpjix.eablkybsjg.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f127035iobyxmoadg = iArr;
        }
    }

    public static final List iobyxmoadg(x.wflxmlrfwp wflxmlrfwpVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        pkzmftpjix pkzmftpjixVarS = ((crxdokpmqz) wflxmlrfwpVar).S();
        boolean zZoijcleaow = zoijcleaow(pkzmftpjixVarS);
        List listMbcevpiqjq = pkzmftpjixVarS.mbcevpiqjq();
        ArrayList arrayList = new ArrayList(listMbcevpiqjq.size());
        int size = listMbcevpiqjq.size();
        for (int i13 = 0; i13 < size; i13++) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) listMbcevpiqjq.get(i13);
            arrayList.add(zZoijcleaow ? pkzmftpjixVar.cllcsxoeiz() : pkzmftpjixVar.dsvhmnatus());
        }
        return arrayList;
    }

    private static final boolean zoijcleaow(pkzmftpjix pkzmftpjixVar) {
        int i13 = iobyxmoadg.f127035iobyxmoadg[pkzmftpjixVar.xrmfcynszj().ordinal()];
        if (i13 == 1 || i13 == 2) {
            return true;
        }
        if (i13 == 3 || i13 == 4) {
            return false;
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        pkzmftpjix pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok();
        if (pkzmftpjixVarAuzgnhcxok != null) {
            return zoijcleaow(pkzmftpjixVarAuzgnhcxok);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
