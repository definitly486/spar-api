package jc;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f51083iobyxmoadg;

    public zoijcleaow(int i13) {
        this.f51083iobyxmoadg = i13;
    }

    @Override // jc.wkgbmnqykc
    public StackTraceElement[] iobyxmoadg(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i13 = this.f51083iobyxmoadg;
        if (length <= i13) {
            return stackTraceElementArr;
        }
        int i14 = i13 / 2;
        int i15 = i13 - i14;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i15);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i14, stackTraceElementArr2, i15, i14);
        return stackTraceElementArr2;
    }
}
