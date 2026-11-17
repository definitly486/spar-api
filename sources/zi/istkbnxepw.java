package zi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class istkbnxepw {
    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = i13 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 4 ? 3 : 2];
        switch (i13) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i13 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i13 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static wizcaqwiak ppxfxbqfkf(List list, igdgnonuha igdgnonuhaVar, jh.wflxmlrfwp wflxmlrfwpVar, List list2, boolean[] zArr) {
        if (list == null) {
            iobyxmoadg(5);
        }
        if (igdgnonuhaVar == null) {
            iobyxmoadg(6);
        }
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(7);
        }
        if (list2 == null) {
            iobyxmoadg(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            jh.yfnezrywwk yfnezrywwkVar = (jh.yfnezrywwk) it.next();
            mh.mbcevpiqjq mbcevpiqjqVarJrbgnlbqoe = mh.mbcevpiqjq.jrbgnlbqoe(wflxmlrfwpVar, yfnezrywwkVar.getAnnotations(), yfnezrywwkVar.cqumvgiudr(), yfnezrywwkVar.draadjrbmk(), yfnezrywwkVar.getName(), i13, jh.xrmfcynszj.f51348iobyxmoadg, yfnezrywwkVar.getStorageManager());
            map.put(yfnezrywwkVar.btonecajqb(), new skhdrjzrfn(mbcevpiqjqVarJrbgnlbqoe.ojitshcjhn()));
            map2.put(yfnezrywwkVar, mbcevpiqjqVarJrbgnlbqoe);
            list2.add(mbcevpiqjqVarJrbgnlbqoe);
            i13++;
        }
        nuxfzjnpeb nuxfzjnpebVarBtonecajqb = nuxfzjnpeb.btonecajqb(map);
        wizcaqwiak wizcaqwiakVarNufgyqmvbu = wizcaqwiak.nufgyqmvbu(igdgnonuhaVar, nuxfzjnpebVarBtonecajqb);
        wizcaqwiak wizcaqwiakVarNufgyqmvbu2 = wizcaqwiak.nufgyqmvbu(igdgnonuhaVar.nufgyqmvbu(), nuxfzjnpebVarBtonecajqb);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jh.yfnezrywwk yfnezrywwkVar2 = (jh.yfnezrywwk) it2.next();
            mh.mbcevpiqjq mbcevpiqjqVar = (mh.mbcevpiqjq) map2.get(yfnezrywwkVar2);
            for (kegysxyocb kegysxyocbVar : yfnezrywwkVar2.getUpperBounds()) {
                jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
                kegysxyocb kegysxyocbVarRgvfuqvkyq = (((nufgyqmvbuVarYlkuphrtab instanceof jh.yfnezrywwk) && ej.wkgbmnqykc.rgvfuqvkyq((jh.yfnezrywwk) nufgyqmvbuVarYlkuphrtab)) ? wizcaqwiakVarNufgyqmvbu : wizcaqwiakVarNufgyqmvbu2).rgvfuqvkyq(kegysxyocbVar, mhtqkkgtqm.OUT_VARIANCE);
                if (kegysxyocbVarRgvfuqvkyq == null) {
                    return null;
                }
                if (kegysxyocbVarRgvfuqvkyq != kegysxyocbVar && zArr != null) {
                    zArr[0] = true;
                }
                mbcevpiqjqVar.ipoelvxyzq(kegysxyocbVarRgvfuqvkyq);
            }
            mbcevpiqjqVar.eslsurpljm();
        }
        return wizcaqwiakVarNufgyqmvbu;
    }

    public static wizcaqwiak zoijcleaow(List list, igdgnonuha igdgnonuhaVar, jh.wflxmlrfwp wflxmlrfwpVar, List list2) {
        if (list == null) {
            iobyxmoadg(0);
        }
        if (igdgnonuhaVar == null) {
            iobyxmoadg(1);
        }
        if (wflxmlrfwpVar == null) {
            iobyxmoadg(2);
        }
        if (list2 == null) {
            iobyxmoadg(3);
        }
        wizcaqwiak wizcaqwiakVarPpxfxbqfkf = ppxfxbqfkf(list, igdgnonuhaVar, wflxmlrfwpVar, list2, null);
        if (wizcaqwiakVarPpxfxbqfkf != null) {
            return wizcaqwiakVarPpxfxbqfkf;
        }
        throw new AssertionError("Substitution failed");
    }
}
