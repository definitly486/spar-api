package aj;

import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
class jyumaefscl implements cqumvgiudr {
    jyumaefscl() {
    }

    private static /* synthetic */ void zoijcleaow(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i13) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // aj.cqumvgiudr
    public boolean iobyxmoadg(zeieaojujs zeieaojujsVar, zeieaojujs zeieaojujsVar2) {
        if (zeieaojujsVar == null) {
            zoijcleaow(3);
        }
        if (zeieaojujsVar2 == null) {
            zoijcleaow(4);
        }
        return zeieaojujsVar.equals(zeieaojujsVar2);
    }
}
