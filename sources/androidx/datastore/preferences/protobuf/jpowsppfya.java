package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class jpowsppfya implements sopmlzcsov {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wwaezpbzkn f8677iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f8678ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wflxmlrfwp f8679wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ikoacuggdj f8680zoijcleaow;

    private jpowsppfya(ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, wwaezpbzkn wwaezpbzknVar) {
        this.f8680zoijcleaow = ikoacuggdjVar;
        this.f8678ppxfxbqfkf = wflxmlrfwpVar.eablkybsjg(wwaezpbzknVar);
        this.f8679wkgbmnqykc = wflxmlrfwpVar;
        this.f8677iobyxmoadg = wwaezpbzknVar;
    }

    static jpowsppfya eablkybsjg(ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, wwaezpbzkn wwaezpbzknVar) {
        return new jpowsppfya(ikoacuggdjVar, wflxmlrfwpVar, wwaezpbzknVar);
    }

    private boolean gxszxtbevo(ulzqkzuiru ulzqkzuiruVar, draadjrbmk draadjrbmkVar, wflxmlrfwp wflxmlrfwpVar, rgvfuqvkyq rgvfuqvkyqVar, ikoacuggdj ikoacuggdjVar, Object obj) throws InvalidProtocolBufferException {
        int tag = ulzqkzuiruVar.getTag();
        if (tag != czzsidtyhn.f8589iobyxmoadg) {
            if (czzsidtyhn.zoijcleaow(tag) != 2) {
                return ulzqkzuiruVar.skipField();
            }
            Object objZoijcleaow = wflxmlrfwpVar.zoijcleaow(draadjrbmkVar, this.f8677iobyxmoadg, czzsidtyhn.iobyxmoadg(tag));
            if (objZoijcleaow == null) {
                return ikoacuggdjVar.wflxmlrfwp(obj, ulzqkzuiruVar);
            }
            wflxmlrfwpVar.nufgyqmvbu(ulzqkzuiruVar, objZoijcleaow, draadjrbmkVar, rgvfuqvkyqVar);
            return true;
        }
        Object objZoijcleaow2 = null;
        int uInt32 = 0;
        gxszxtbevo bytes = null;
        while (ulzqkzuiruVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = ulzqkzuiruVar.getTag();
            if (tag2 == czzsidtyhn.f8590ppxfxbqfkf) {
                uInt32 = ulzqkzuiruVar.readUInt32();
                objZoijcleaow2 = wflxmlrfwpVar.zoijcleaow(draadjrbmkVar, this.f8677iobyxmoadg, uInt32);
            } else if (tag2 == czzsidtyhn.f8591wkgbmnqykc) {
                if (objZoijcleaow2 != null) {
                    wflxmlrfwpVar.nufgyqmvbu(ulzqkzuiruVar, objZoijcleaow2, draadjrbmkVar, rgvfuqvkyqVar);
                } else {
                    bytes = ulzqkzuiruVar.readBytes();
                }
            } else if (!ulzqkzuiruVar.skipField()) {
                break;
            }
        }
        if (ulzqkzuiruVar.getTag() != czzsidtyhn.f8592zoijcleaow) {
            throw InvalidProtocolBufferException.iobyxmoadg();
        }
        if (bytes != null) {
            if (objZoijcleaow2 != null) {
                wflxmlrfwpVar.dxjokdxxww(bytes, objZoijcleaow2, draadjrbmkVar, rgvfuqvkyqVar);
            } else {
                ikoacuggdjVar.wkgbmnqykc(obj, uInt32, bytes);
            }
        }
        return true;
    }

    private void lqeggnwhkg(ikoacuggdj ikoacuggdjVar, Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        ikoacuggdjVar.kcexrzcfyt(ikoacuggdjVar.lqeggnwhkg(obj), uwvvkdfqfpVar);
    }

    private int ppxfxbqfkf(ikoacuggdj ikoacuggdjVar, Object obj) {
        return ikoacuggdjVar.dxjokdxxww(ikoacuggdjVar.lqeggnwhkg(obj));
    }

    private void wkgbmnqykc(ikoacuggdj ikoacuggdjVar, wflxmlrfwp wflxmlrfwpVar, Object obj, ulzqkzuiru ulzqkzuiruVar, draadjrbmk draadjrbmkVar) {
        Object objGxszxtbevo = ikoacuggdjVar.gxszxtbevo(obj);
        rgvfuqvkyq rgvfuqvkyqVarWkgbmnqykc = wflxmlrfwpVar.wkgbmnqykc(obj);
        while (ulzqkzuiruVar.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!gxszxtbevo(ulzqkzuiruVar, draadjrbmkVar, wflxmlrfwpVar, rgvfuqvkyqVarWkgbmnqykc, ikoacuggdjVar, objGxszxtbevo)) {
                    return;
                }
            } finally {
                ikoacuggdjVar.ojitshcjhn(obj, objGxszxtbevo);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public boolean equals(Object obj, Object obj2) {
        if (!this.f8680zoijcleaow.lqeggnwhkg(obj).equals(this.f8680zoijcleaow.lqeggnwhkg(obj2))) {
            return false;
        }
        if (this.f8678ppxfxbqfkf) {
            return this.f8679wkgbmnqykc.ppxfxbqfkf(obj).equals(this.f8679wkgbmnqykc.ppxfxbqfkf(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public int getSerializedSize(Object obj) {
        int iPpxfxbqfkf = ppxfxbqfkf(this.f8680zoijcleaow, obj);
        return this.f8678ppxfxbqfkf ? iPpxfxbqfkf + this.f8679wkgbmnqykc.ppxfxbqfkf(obj).gxszxtbevo() : iPpxfxbqfkf;
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public int hashCode(Object obj) {
        int iHashCode = this.f8680zoijcleaow.lqeggnwhkg(obj).hashCode();
        return this.f8678ppxfxbqfkf ? (iHashCode * 53) + this.f8679wkgbmnqykc.ppxfxbqfkf(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void iobyxmoadg(Object obj, ulzqkzuiru ulzqkzuiruVar, draadjrbmk draadjrbmkVar) {
        wkgbmnqykc(this.f8680zoijcleaow, this.f8679wkgbmnqykc, obj, ulzqkzuiruVar, draadjrbmkVar);
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public final boolean isInitialized(Object obj) {
        return this.f8679wkgbmnqykc.ppxfxbqfkf(obj).gtknphoqwx();
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void makeImmutable(Object obj) {
        this.f8680zoijcleaow.btonecajqb(obj);
        this.f8679wkgbmnqykc.gxszxtbevo(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void mergeFrom(Object obj, Object obj2) {
        jlmebxxoox.iozdgvuglv(this.f8680zoijcleaow, obj, obj2);
        if (this.f8678ppxfxbqfkf) {
            jlmebxxoox.cdpycssgdh(this.f8679wkgbmnqykc, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public Object newInstance() {
        return this.f8677iobyxmoadg.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.sopmlzcsov
    public void zoijcleaow(Object obj, uwvvkdfqfp uwvvkdfqfpVar) {
        Iterator itAgtfadlqog = this.f8679wkgbmnqykc.ppxfxbqfkf(obj).agtfadlqog();
        if (itAgtfadlqog.hasNext()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(((Map.Entry) itAgtfadlqog.next()).getKey());
            throw null;
        }
        lqeggnwhkg(this.f8680zoijcleaow, obj, uwvvkdfqfpVar);
    }
}
