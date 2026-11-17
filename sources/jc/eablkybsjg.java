package jc;

import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f51075iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final StackTraceElement[] f51076ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final eablkybsjg f51077wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f51078zoijcleaow;

    private eablkybsjg(String str, String str2, StackTraceElement[] stackTraceElementArr, eablkybsjg eablkybsjgVar) {
        this.f51075iobyxmoadg = str;
        this.f51078zoijcleaow = str2;
        this.f51076ppxfxbqfkf = stackTraceElementArr;
        this.f51077wkgbmnqykc = eablkybsjgVar;
    }

    public static eablkybsjg iobyxmoadg(Throwable th2, wkgbmnqykc wkgbmnqykcVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        eablkybsjg eablkybsjgVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eablkybsjgVar = new eablkybsjg(th3.getLocalizedMessage(), th3.getClass().getName(), wkgbmnqykcVar.iobyxmoadg(th3.getStackTrace()), eablkybsjgVar);
        }
        return eablkybsjgVar;
    }
}
