package org.jsoup.select;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import xl.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static zl.zoijcleaow iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, wflxmlrfwp wflxmlrfwpVar) {
        return (zl.zoijcleaow) (wkgbmnqykcVar.draadjrbmk() ? wkgbmnqykc(wkgbmnqykcVar, wflxmlrfwpVar, wflxmlrfwp.class) : ppxfxbqfkf(wkgbmnqykcVar, wflxmlrfwpVar)).collect(Collectors.toCollection(new Supplier() { // from class: zl.iobyxmoadg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new zoijcleaow();
            }
        }));
    }

    public static Stream ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, wflxmlrfwp wflxmlrfwpVar) {
        wkgbmnqykcVar.gtknphoqwx();
        return wflxmlrfwpVar.stream().filter(wkgbmnqykcVar.wkgbmnqykc(wflxmlrfwpVar));
    }

    public static Stream wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, wflxmlrfwp wflxmlrfwpVar, Class cls) {
        wkgbmnqykcVar.gtknphoqwx();
        return wflxmlrfwpVar.yadqdtsiqt(cls).filter(wkgbmnqykcVar.ppxfxbqfkf(wflxmlrfwpVar));
    }

    public static wflxmlrfwp zoijcleaow(wkgbmnqykc wkgbmnqykcVar, wflxmlrfwp wflxmlrfwpVar) {
        return (wflxmlrfwp) ppxfxbqfkf(wkgbmnqykcVar, wflxmlrfwpVar).findFirst().orElse(null);
    }
}
