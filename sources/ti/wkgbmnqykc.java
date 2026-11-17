package ti;

import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc extends iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jh.iobyxmoadg f110555ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(jh.iobyxmoadg iobyxmoadgVar, kegysxyocb kegysxyocbVar, lqeggnwhkg lqeggnwhkgVar) {
        super(kegysxyocbVar, lqeggnwhkgVar);
        if (iobyxmoadgVar == null) {
            zoijcleaow(0);
        }
        if (kegysxyocbVar == null) {
            zoijcleaow(1);
        }
        this.f110555ppxfxbqfkf = iobyxmoadgVar;
    }

    private static /* synthetic */ void zoijcleaow(int i13) {
        String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 2 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "receiverType";
        } else if (i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i13 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i13 != 2) {
            if (i13 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f110555ppxfxbqfkf + "}";
    }
}
