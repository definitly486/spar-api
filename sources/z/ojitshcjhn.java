package z;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Comparator f127114iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(pkzmftpjix pkzmftpjixVar, pkzmftpjix pkzmftpjixVar2) {
            int iDraadjrbmk = kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(pkzmftpjixVar.tzroggbefp(), pkzmftpjixVar2.tzroggbefp());
            return iDraadjrbmk != 0 ? iDraadjrbmk : kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(pkzmftpjixVar.hashCode(), pkzmftpjixVar2.hashCode());
        }
    }
}
