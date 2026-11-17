package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class ppxfxbqfkf extends wkgbmnqykc implements esjtqupxsv {
    private static final long serialVersionUID = 6588350623831699109L;

    protected ppxfxbqfkf(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.wkgbmnqykc, com.google.common.collect.istkbnxepw
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.gxszxtbevo
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.wkgbmnqykc
    Collection hcddaimhww(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.wkgbmnqykc
    Collection jpowsppfya(Object obj, Collection collection) {
        return hkdspvbjdz(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.wkgbmnqykc, com.google.common.collect.istkbnxepw
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.gxszxtbevo, com.google.common.collect.istkbnxepw
    public Map wkgbmnqykc() {
        return super.wkgbmnqykc();
    }
}
