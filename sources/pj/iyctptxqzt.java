package pj;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iyctptxqzt {
    public static final Executor iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
        Executor executorXrmfcynszj;
        bfopjjpdmp bfopjjpdmpVar = pkzmftpjixVar instanceof bfopjjpdmp ? (bfopjjpdmp) pkzmftpjixVar : null;
        return (bfopjjpdmpVar == null || (executorXrmfcynszj = bfopjjpdmpVar.xrmfcynszj()) == null) ? new jhduphickx(pkzmftpjixVar) : executorXrmfcynszj;
    }

    public static final pkzmftpjix zoijcleaow(Executor executor) {
        pkzmftpjix pkzmftpjixVar;
        jhduphickx jhduphickxVar = executor instanceof jhduphickx ? (jhduphickx) executor : null;
        return (jhduphickxVar == null || (pkzmftpjixVar = jhduphickxVar.f76727zdlpuopuiu) == null) ? new opjhrmiecq(executor) : pkzmftpjixVar;
    }
}
