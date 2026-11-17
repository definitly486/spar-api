package ti;

import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final kegysxyocb f110551iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f110552zoijcleaow;

    public iobyxmoadg(kegysxyocb kegysxyocbVar, lqeggnwhkg lqeggnwhkgVar) {
        if (kegysxyocbVar == null) {
            zoijcleaow(0);
        }
        this.f110551iobyxmoadg = kegysxyocbVar;
        this.f110552zoijcleaow = lqeggnwhkgVar == null ? this : lqeggnwhkgVar;
    }

    private static /* synthetic */ void zoijcleaow(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i13 == 1) {
            objArr[1] = "getType";
        } else if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i13 != 1 && i13 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ti.lqeggnwhkg
    public kegysxyocb getType() {
        kegysxyocb kegysxyocbVar = this.f110551iobyxmoadg;
        if (kegysxyocbVar == null) {
            zoijcleaow(1);
        }
        return kegysxyocbVar;
    }
}
