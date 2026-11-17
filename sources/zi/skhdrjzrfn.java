package zi;

/* JADX INFO: loaded from: classes3.dex */
public class skhdrjzrfn extends dvvnrvtcbc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mhtqkkgtqm f130128iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final kegysxyocb f130129zoijcleaow;

    public skhdrjzrfn(mhtqkkgtqm mhtqkkgtqmVar, kegysxyocb kegysxyocbVar) {
        if (mhtqkkgtqmVar == null) {
            wkgbmnqykc(0);
        }
        if (kegysxyocbVar == null) {
            wkgbmnqykc(1);
        }
        this.f130128iobyxmoadg = mhtqkkgtqmVar;
        this.f130129zoijcleaow = kegysxyocbVar;
    }

    private static /* synthetic */ void wkgbmnqykc(int i13) {
        String str = (i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i13 == 3) {
            objArr[2] = "replaceType";
        } else if (i13 != 4 && i13 != 5) {
            if (i13 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zi.iwxlajgraz
    public kegysxyocb getType() {
        kegysxyocb kegysxyocbVar = this.f130129zoijcleaow;
        if (kegysxyocbVar == null) {
            wkgbmnqykc(5);
        }
        return kegysxyocbVar;
    }

    @Override // zi.iwxlajgraz
    public iwxlajgraz iobyxmoadg(aj.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            wkgbmnqykc(6);
        }
        return new skhdrjzrfn(this.f130128iobyxmoadg, lqeggnwhkgVar.iobyxmoadg(this.f130129zoijcleaow));
    }

    @Override // zi.iwxlajgraz
    public mhtqkkgtqm ppxfxbqfkf() {
        mhtqkkgtqm mhtqkkgtqmVar = this.f130128iobyxmoadg;
        if (mhtqkkgtqmVar == null) {
            wkgbmnqykc(4);
        }
        return mhtqkkgtqmVar;
    }

    @Override // zi.iwxlajgraz
    public boolean zoijcleaow() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public skhdrjzrfn(kegysxyocb kegysxyocbVar) {
        this(mhtqkkgtqm.INVARIANT, kegysxyocbVar);
        if (kegysxyocbVar == null) {
            wkgbmnqykc(2);
        }
    }
}
