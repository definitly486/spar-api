package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class metgxyhuhe {
    metgxyhuhe() {
    }

    abstract Object agtfadlqog();

    abstract void btonecajqb(Object obj);

    final void draadjrbmk(Object obj, vipkmwdibw vipkmwdibwVar) {
        while (vipkmwdibwVar.getFieldNumber() != Integer.MAX_VALUE && wflxmlrfwp(obj, vipkmwdibwVar)) {
        }
    }

    abstract int dxjokdxxww(Object obj);

    abstract void eablkybsjg(Object obj, int i13, long j13);

    abstract Object gtknphoqwx(Object obj, Object obj2);

    abstract Object gxszxtbevo(Object obj);

    abstract void iobyxmoadg(Object obj, int i13, int i14);

    abstract void kcexrzcfyt(Object obj, zfvoamnweg zfvoamnwegVar);

    abstract Object lqeggnwhkg(Object obj);

    abstract int nufgyqmvbu(Object obj);

    abstract void ojitshcjhn(Object obj, Object obj2);

    abstract Object oxmwwwfdhm(Object obj);

    abstract void ppxfxbqfkf(Object obj, int i13, Object obj2);

    abstract void rgvfuqvkyq(Object obj, Object obj2);

    abstract boolean vdvldrhtss(vipkmwdibw vipkmwdibwVar);

    final boolean wflxmlrfwp(Object obj, vipkmwdibw vipkmwdibwVar) throws InvalidProtocolBufferException {
        int tag = vipkmwdibwVar.getTag();
        int iIobyxmoadg = sflfametgt.iobyxmoadg(tag);
        int iZoijcleaow = sflfametgt.zoijcleaow(tag);
        if (iZoijcleaow == 0) {
            eablkybsjg(obj, iIobyxmoadg, vipkmwdibwVar.readInt64());
            return true;
        }
        if (iZoijcleaow == 1) {
            zoijcleaow(obj, iIobyxmoadg, vipkmwdibwVar.readFixed64());
            return true;
        }
        if (iZoijcleaow == 2) {
            wkgbmnqykc(obj, iIobyxmoadg, vipkmwdibwVar.readBytes());
            return true;
        }
        if (iZoijcleaow != 3) {
            if (iZoijcleaow == 4) {
                return false;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            iobyxmoadg(obj, iIobyxmoadg, vipkmwdibwVar.readFixed32());
            return true;
        }
        Object objAgtfadlqog = agtfadlqog();
        int iPpxfxbqfkf = sflfametgt.ppxfxbqfkf(iIobyxmoadg, 4);
        draadjrbmk(objAgtfadlqog, vipkmwdibwVar);
        if (iPpxfxbqfkf != vipkmwdibwVar.getTag()) {
            throw InvalidProtocolBufferException.wkgbmnqykc();
        }
        ppxfxbqfkf(obj, iIobyxmoadg, oxmwwwfdhm(objAgtfadlqog));
        return true;
    }

    abstract void wkgbmnqykc(Object obj, int i13, nufgyqmvbu nufgyqmvbuVar);

    abstract void zdlpuopuiu(Object obj, zfvoamnweg zfvoamnwegVar);

    abstract void zoijcleaow(Object obj, int i13, long j13);
}
