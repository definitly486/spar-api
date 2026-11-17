package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class stevsuqkhv implements jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hkdspvbjdz f24046iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f24047ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rgvfuqvkyq f24048wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final metgxyhuhe f24049zoijcleaow;

    private stevsuqkhv(metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, hkdspvbjdz hkdspvbjdzVar) {
        this.f24049zoijcleaow = metgxyhuheVar;
        this.f24047ppxfxbqfkf = rgvfuqvkyqVar.eablkybsjg(hkdspvbjdzVar);
        this.f24048wkgbmnqykc = rgvfuqvkyqVar;
        this.f24046iobyxmoadg = hkdspvbjdzVar;
    }

    private void eablkybsjg(metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, Object obj, vipkmwdibw vipkmwdibwVar, ojitshcjhn ojitshcjhnVar) {
        Object objGxszxtbevo = metgxyhuheVar.gxszxtbevo(obj);
        kcexrzcfyt kcexrzcfytVarWkgbmnqykc = rgvfuqvkyqVar.wkgbmnqykc(obj);
        while (vipkmwdibwVar.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!lqeggnwhkg(vipkmwdibwVar, ojitshcjhnVar, rgvfuqvkyqVar, kcexrzcfytVarWkgbmnqykc, metgxyhuheVar, objGxszxtbevo)) {
                    return;
                }
            } finally {
                metgxyhuheVar.ojitshcjhn(obj, objGxszxtbevo);
            }
        }
    }

    static stevsuqkhv gxszxtbevo(metgxyhuhe metgxyhuheVar, rgvfuqvkyq rgvfuqvkyqVar, hkdspvbjdz hkdspvbjdzVar) {
        return new stevsuqkhv(metgxyhuheVar, rgvfuqvkyqVar, hkdspvbjdzVar);
    }

    private boolean lqeggnwhkg(vipkmwdibw vipkmwdibwVar, ojitshcjhn ojitshcjhnVar, rgvfuqvkyq rgvfuqvkyqVar, kcexrzcfyt kcexrzcfytVar, metgxyhuhe metgxyhuheVar, Object obj) throws InvalidProtocolBufferException {
        int tag = vipkmwdibwVar.getTag();
        if (tag != sflfametgt.f24007iobyxmoadg) {
            if (sflfametgt.zoijcleaow(tag) != 2) {
                return vipkmwdibwVar.skipField();
            }
            Object objZoijcleaow = rgvfuqvkyqVar.zoijcleaow(ojitshcjhnVar, this.f24046iobyxmoadg, sflfametgt.iobyxmoadg(tag));
            if (objZoijcleaow == null) {
                return metgxyhuheVar.wflxmlrfwp(obj, vipkmwdibwVar);
            }
            rgvfuqvkyqVar.nufgyqmvbu(vipkmwdibwVar, objZoijcleaow, ojitshcjhnVar, kcexrzcfytVar);
            return true;
        }
        Object objZoijcleaow2 = null;
        int uInt32 = 0;
        nufgyqmvbu bytes = null;
        while (vipkmwdibwVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = vipkmwdibwVar.getTag();
            if (tag2 == sflfametgt.f24008ppxfxbqfkf) {
                uInt32 = vipkmwdibwVar.readUInt32();
                objZoijcleaow2 = rgvfuqvkyqVar.zoijcleaow(ojitshcjhnVar, this.f24046iobyxmoadg, uInt32);
            } else if (tag2 == sflfametgt.f24009wkgbmnqykc) {
                if (objZoijcleaow2 != null) {
                    rgvfuqvkyqVar.nufgyqmvbu(vipkmwdibwVar, objZoijcleaow2, ojitshcjhnVar, kcexrzcfytVar);
                } else {
                    bytes = vipkmwdibwVar.readBytes();
                }
            } else if (!vipkmwdibwVar.skipField()) {
                break;
            }
        }
        if (vipkmwdibwVar.getTag() != sflfametgt.f24010zoijcleaow) {
            throw InvalidProtocolBufferException.wkgbmnqykc();
        }
        if (bytes != null) {
            if (objZoijcleaow2 != null) {
                rgvfuqvkyqVar.dxjokdxxww(bytes, objZoijcleaow2, ojitshcjhnVar, kcexrzcfytVar);
            } else {
                metgxyhuheVar.wkgbmnqykc(obj, uInt32, bytes);
            }
        }
        return true;
    }

    private void nufgyqmvbu(metgxyhuhe metgxyhuheVar, Object obj, zfvoamnweg zfvoamnwegVar) {
        metgxyhuheVar.kcexrzcfyt(metgxyhuheVar.lqeggnwhkg(obj), zfvoamnwegVar);
    }

    private int wkgbmnqykc(metgxyhuhe metgxyhuheVar, Object obj) {
        return metgxyhuheVar.dxjokdxxww(metgxyhuheVar.lqeggnwhkg(obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public boolean equals(Object obj, Object obj2) {
        if (!this.f24049zoijcleaow.lqeggnwhkg(obj).equals(this.f24049zoijcleaow.lqeggnwhkg(obj2))) {
            return false;
        }
        if (this.f24047ppxfxbqfkf) {
            return this.f24048wkgbmnqykc.ppxfxbqfkf(obj).equals(this.f24048wkgbmnqykc.ppxfxbqfkf(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public int getSerializedSize(Object obj) {
        int iWkgbmnqykc = wkgbmnqykc(this.f24049zoijcleaow, obj);
        return this.f24047ppxfxbqfkf ? iWkgbmnqykc + this.f24048wkgbmnqykc.ppxfxbqfkf(obj).zoijcleaow() : iWkgbmnqykc;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public int hashCode(Object obj) {
        int iHashCode = this.f24049zoijcleaow.lqeggnwhkg(obj).hashCode();
        return this.f24047ppxfxbqfkf ? (iHashCode * 53) + this.f24048wkgbmnqykc.ppxfxbqfkf(obj).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void iobyxmoadg(Object obj, byte[] bArr, int i13, int i14, eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        if (iwizpuwonkVar.unknownFields == rlfsiqarku.ppxfxbqfkf()) {
            iwizpuwonkVar.unknownFields = rlfsiqarku.gtknphoqwx();
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public final boolean isInitialized(Object obj) {
        return this.f24048wkgbmnqykc.ppxfxbqfkf(obj).eablkybsjg();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void makeImmutable(Object obj) {
        this.f24049zoijcleaow.btonecajqb(obj);
        this.f24048wkgbmnqykc.gxszxtbevo(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void mergeFrom(Object obj, Object obj2) {
        okpsazkaxt.iozdgvuglv(this.f24049zoijcleaow, obj, obj2);
        if (this.f24047ppxfxbqfkf) {
            okpsazkaxt.cdpycssgdh(this.f24048wkgbmnqykc, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public Object newInstance() {
        hkdspvbjdz hkdspvbjdzVar = this.f24046iobyxmoadg;
        return hkdspvbjdzVar instanceof iwizpuwonk ? ((iwizpuwonk) hkdspvbjdzVar).cdpycssgdh() : hkdspvbjdzVar.newBuilderForType().buildPartial();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void ppxfxbqfkf(Object obj, zfvoamnweg zfvoamnwegVar) {
        Iterator itGxszxtbevo = this.f24048wkgbmnqykc.ppxfxbqfkf(obj).gxszxtbevo();
        if (itGxszxtbevo.hasNext()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(((Map.Entry) itGxszxtbevo.next()).getKey());
            throw null;
        }
        nufgyqmvbu(this.f24049zoijcleaow, obj, zfvoamnwegVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.jhduphickx
    public void zoijcleaow(Object obj, vipkmwdibw vipkmwdibwVar, ojitshcjhn ojitshcjhnVar) {
        eablkybsjg(this.f24049zoijcleaow, this.f24048wkgbmnqykc, obj, vipkmwdibwVar, ojitshcjhnVar);
    }
}
