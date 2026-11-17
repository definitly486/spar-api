package jc;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f51079iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f51080ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc[] f51081zoijcleaow;

    public iobyxmoadg(int i13, wkgbmnqykc... wkgbmnqykcVarArr) {
        this.f51079iobyxmoadg = i13;
        this.f51081zoijcleaow = wkgbmnqykcVarArr;
        this.f51080ppxfxbqfkf = new zoijcleaow(i13);
    }

    @Override // jc.wkgbmnqykc
    public StackTraceElement[] iobyxmoadg(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f51079iobyxmoadg) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrIobyxmoadg = stackTraceElementArr;
        for (wkgbmnqykc wkgbmnqykcVar : this.f51081zoijcleaow) {
            if (stackTraceElementArrIobyxmoadg.length <= this.f51079iobyxmoadg) {
                break;
            }
            stackTraceElementArrIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(stackTraceElementArr);
        }
        return stackTraceElementArrIobyxmoadg.length > this.f51079iobyxmoadg ? this.f51080ppxfxbqfkf.iobyxmoadg(stackTraceElementArrIobyxmoadg) : stackTraceElementArrIobyxmoadg;
    }
}
