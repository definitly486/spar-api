package zi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow extends rgvfuqvkyq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(yi.agtfadlqog agtfadlqogVar) {
        super(agtfadlqogVar);
        if (agtfadlqogVar == null) {
            wwaezpbzkn(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void wwaezpbzkn(int i13) {
        String str = (i13 == 1 || i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i13 == 2) {
            objArr[0] = "classifier";
        } else if (i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i13 == 3 || i13 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i13 != 1) {
            if (i13 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i13 != 3 && i13 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zi.rgvfuqvkyq
    protected kegysxyocb kcexrzcfyt() {
        if (gh.dxjokdxxww.zeieaojujs(ylkuphrtab())) {
            return null;
        }
        return wflxmlrfwp().dxjokdxxww();
    }

    @Override // zi.jyumaefscl
    protected boolean nufgyqmvbu(jh.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null) {
            wwaezpbzkn(2);
        }
        return (nufgyqmvbuVar instanceof jh.eablkybsjg) && gxszxtbevo(ylkuphrtab(), nufgyqmvbuVar);
    }

    @Override // zi.zeieaojujs
    public gh.dxjokdxxww wflxmlrfwp() {
        gh.dxjokdxxww dxjokdxxwwVarWflxmlrfwp = pi.eablkybsjg.wflxmlrfwp(ylkuphrtab());
        if (dxjokdxxwwVarWflxmlrfwp == null) {
            wwaezpbzkn(1);
        }
        return dxjokdxxwwVarWflxmlrfwp;
    }

    public abstract jh.eablkybsjg ylkuphrtab();

    @Override // zi.rgvfuqvkyq
    protected Collection zdlpuopuiu(boolean z13) {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = ylkuphrtab().zoijcleaow();
        if (!(wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                wwaezpbzkn(3);
            }
            return listEmptyList;
        }
        jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
        jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) wflxmlrfwpVarZoijcleaow;
        gtknphoqwxVar.add(eablkybsjgVar.ojitshcjhn());
        jh.eablkybsjg eablkybsjgVarYfnezrywwk = eablkybsjgVar.yfnezrywwk();
        if (z13 && eablkybsjgVarYfnezrywwk != null) {
            gtknphoqwxVar.add(eablkybsjgVarYfnezrywwk.ojitshcjhn());
        }
        return gtknphoqwxVar;
    }
}
