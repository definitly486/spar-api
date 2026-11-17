package org.jsoup.select;

import xl.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Selector {

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str) {
            super(str);
        }

        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static wkgbmnqykc iobyxmoadg(String str) {
        return nufgyqmvbu.wwaezpbzkn(str);
    }

    public static zl.zoijcleaow ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, wflxmlrfwp wflxmlrfwpVar) {
        vl.zoijcleaow.btonecajqb(wkgbmnqykcVar);
        vl.zoijcleaow.btonecajqb(wflxmlrfwpVar);
        return iobyxmoadg.iobyxmoadg(wkgbmnqykcVar, wflxmlrfwpVar);
    }

    public static zl.zoijcleaow zoijcleaow(String str, wflxmlrfwp wflxmlrfwpVar) {
        vl.zoijcleaow.lqeggnwhkg(str);
        return ppxfxbqfkf(iobyxmoadg(str), wflxmlrfwpVar);
    }
}
