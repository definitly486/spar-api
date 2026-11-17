package sh;

import jh.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojitshcjhn {
    public static boolean eablkybsjg(crxdokpmqz crxdokpmqzVar) {
        if (crxdokpmqzVar == null) {
            iobyxmoadg(0);
        }
        if (crxdokpmqzVar.getKind() == jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE) {
            return false;
        }
        if (ppxfxbqfkf(crxdokpmqzVar.zoijcleaow())) {
            return true;
        }
        return li.dxjokdxxww.cqumvgiudr(crxdokpmqzVar.zoijcleaow()) && zoijcleaow(crxdokpmqzVar);
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "companionObject";
        } else if (i13 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i13 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i13 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i13 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean ppxfxbqfkf(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(1);
        }
        return li.dxjokdxxww.cqumvgiudr(wflxmlrfwpVar) && li.dxjokdxxww.iwizpuwonk(wflxmlrfwpVar.zoijcleaow()) && !wkgbmnqykc((jh.eablkybsjg) wflxmlrfwpVar);
    }

    public static boolean wkgbmnqykc(jh.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            iobyxmoadg(2);
        }
        return gh.eablkybsjg.iobyxmoadg(gh.wkgbmnqykc.f37385iobyxmoadg, eablkybsjgVar);
    }

    public static boolean zoijcleaow(jh.zoijcleaow zoijcleaowVar) {
        jh.iwizpuwonk iwizpuwonkVarLrnfpwlwnk;
        if (zoijcleaowVar == null) {
            iobyxmoadg(3);
        }
        if ((zoijcleaowVar instanceof crxdokpmqz) && (iwizpuwonkVarLrnfpwlwnk = ((crxdokpmqz) zoijcleaowVar).lrnfpwlwnk()) != null && iwizpuwonkVarLrnfpwlwnk.getAnnotations().wizcaqwiak(wwaezpbzkn.f106639zoijcleaow)) {
            return true;
        }
        return zoijcleaowVar.getAnnotations().wizcaqwiak(wwaezpbzkn.f106639zoijcleaow);
    }
}
