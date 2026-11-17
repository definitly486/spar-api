package mh;

/* JADX INFO: loaded from: classes3.dex */
public class zdlpuopuiu extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ti.eablkybsjg f67186iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final jh.eablkybsjg f67187jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdlpuopuiu(jh.eablkybsjg eablkybsjgVar) {
        super(kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow());
        if (eablkybsjgVar == null) {
            metgxyhuhe(0);
        }
        this.f67187jyumaefscl = eablkybsjgVar;
        this.f67186iwizpuwonk = new ti.eablkybsjg(eablkybsjgVar, null);
    }

    private static /* synthetic */ void metgxyhuhe(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i13 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i13 == 1) {
            objArr[1] = "getValue";
        } else if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // jh.vipkmwdibw
    public ti.lqeggnwhkg getValue() {
        ti.eablkybsjg eablkybsjgVar = this.f67186iwizpuwonk;
        if (eablkybsjgVar == null) {
            metgxyhuhe(1);
        }
        return eablkybsjgVar;
    }

    @Override // mh.wflxmlrfwp
    public String toString() {
        return "class " + this.f67187jyumaefscl.getName() + "::this";
    }

    @Override // jh.wflxmlrfwp
    public jh.wflxmlrfwp zoijcleaow() {
        jh.eablkybsjg eablkybsjgVar = this.f67187jyumaefscl;
        if (eablkybsjgVar == null) {
            metgxyhuhe(2);
        }
        return eablkybsjgVar;
    }
}
