package ti;

import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class dxjokdxxww extends iobyxmoadg {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(kegysxyocb kegysxyocbVar) {
        this(kegysxyocbVar, null);
        if (kegysxyocbVar == null) {
            zoijcleaow(0);
        }
    }

    private static /* synthetic */ void zoijcleaow(int i13) {
        Object[] objArr = new Object[3];
        if (i13 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i13 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private dxjokdxxww(kegysxyocb kegysxyocbVar, lqeggnwhkg lqeggnwhkgVar) {
        super(kegysxyocbVar, lqeggnwhkgVar);
        if (kegysxyocbVar == null) {
            zoijcleaow(1);
        }
    }
}
