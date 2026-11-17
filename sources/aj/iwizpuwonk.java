package aj;

import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk {
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = (i13 == 7 || i13 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 7 || i13 == 10) ? 2 : 3];
        switch (i13) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i13 == 7) {
            objArr[1] = "getOutType";
        } else if (i13 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i13) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 7 && i13 != 10) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static kegysxyocb ppxfxbqfkf(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2, cqumvgiudr cqumvgiudrVar) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(2);
        }
        if (kegysxyocbVar2 == null) {
            iobyxmoadg(3);
        }
        if (cqumvgiudrVar == null) {
            iobyxmoadg(4);
        }
        return pmvmpeiblj.wkgbmnqykc(kegysxyocbVar, kegysxyocbVar2, cqumvgiudrVar);
    }

    public static kegysxyocb zoijcleaow(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2) {
        if (kegysxyocbVar == null) {
            iobyxmoadg(0);
        }
        if (kegysxyocbVar2 == null) {
            iobyxmoadg(1);
        }
        return ppxfxbqfkf(kegysxyocbVar, kegysxyocbVar2, new jyumaefscl());
    }
}
