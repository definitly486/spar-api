package zi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class yggfygwlhe extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f130162eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Collection f130163gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jh.eablkybsjg f130164wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(jh.eablkybsjg eablkybsjgVar, List list, Collection collection, yi.agtfadlqog agtfadlqogVar) {
        super(agtfadlqogVar);
        if (eablkybsjgVar == null) {
            wwaezpbzkn(0);
        }
        if (list == null) {
            wwaezpbzkn(1);
        }
        if (collection == null) {
            wwaezpbzkn(2);
        }
        if (agtfadlqogVar == null) {
            wwaezpbzkn(3);
        }
        this.f130164wkgbmnqykc = eablkybsjgVar;
        this.f130162eablkybsjg = Collections.unmodifiableList(new ArrayList(list));
        this.f130163gxszxtbevo = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void wwaezpbzkn(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getParameters";
        } else if (i13 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i13 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i13 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zi.zeieaojujs
    public boolean eablkybsjg() {
        return true;
    }

    @Override // zi.zeieaojujs
    public List getParameters() {
        List list = this.f130162eablkybsjg;
        if (list == null) {
            wwaezpbzkn(4);
        }
        return list;
    }

    @Override // zi.rgvfuqvkyq
    protected jh.czzsidtyhn jyumaefscl() {
        jh.czzsidtyhn.iobyxmoadg iobyxmoadgVar = jh.czzsidtyhn.iobyxmoadg.f51297iobyxmoadg;
        if (iobyxmoadgVar == null) {
            wwaezpbzkn(7);
        }
        return iobyxmoadgVar;
    }

    @Override // zi.rgvfuqvkyq
    protected Collection oxmwwwfdhm() {
        Collection collection = this.f130163gxszxtbevo;
        if (collection == null) {
            wwaezpbzkn(6);
        }
        return collection;
    }

    public String toString() {
        return li.dxjokdxxww.wflxmlrfwp(this.f130164wkgbmnqykc).zoijcleaow();
    }

    @Override // zi.jyumaefscl, zi.zeieaojujs
    public jh.eablkybsjg ylkuphrtab() {
        jh.eablkybsjg eablkybsjgVar = this.f130164wkgbmnqykc;
        if (eablkybsjgVar == null) {
            wwaezpbzkn(5);
        }
        return eablkybsjgVar;
    }
}
