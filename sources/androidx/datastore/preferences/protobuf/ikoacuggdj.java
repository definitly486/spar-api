package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class ikoacuggdj {
    ikoacuggdj() {
    }

    abstract Object agtfadlqog();

    abstract void btonecajqb(Object obj);

    final void draadjrbmk(Object obj, ulzqkzuiru ulzqkzuiruVar) {
        while (ulzqkzuiruVar.getFieldNumber() != Integer.MAX_VALUE && wflxmlrfwp(obj, ulzqkzuiruVar)) {
        }
    }

    abstract int dxjokdxxww(Object obj);

    abstract void eablkybsjg(Object obj, int i13, long j13);

    abstract Object gtknphoqwx(Object obj, Object obj2);

    abstract Object gxszxtbevo(Object obj);

    abstract void iobyxmoadg(Object obj, int i13, int i14);

    abstract void kcexrzcfyt(Object obj, uwvvkdfqfp uwvvkdfqfpVar);

    abstract Object lqeggnwhkg(Object obj);

    abstract int nufgyqmvbu(Object obj);

    abstract void ojitshcjhn(Object obj, Object obj2);

    abstract Object oxmwwwfdhm(Object obj);

    abstract void ppxfxbqfkf(Object obj, int i13, Object obj2);

    abstract void rgvfuqvkyq(Object obj, Object obj2);

    abstract boolean vdvldrhtss(ulzqkzuiru ulzqkzuiruVar);

    final boolean wflxmlrfwp(Object obj, ulzqkzuiru ulzqkzuiruVar) throws InvalidProtocolBufferException {
        int tag = ulzqkzuiruVar.getTag();
        int iIobyxmoadg = czzsidtyhn.iobyxmoadg(tag);
        int iZoijcleaow = czzsidtyhn.zoijcleaow(tag);
        if (iZoijcleaow == 0) {
            eablkybsjg(obj, iIobyxmoadg, ulzqkzuiruVar.readInt64());
            return true;
        }
        if (iZoijcleaow == 1) {
            zoijcleaow(obj, iIobyxmoadg, ulzqkzuiruVar.readFixed64());
            return true;
        }
        if (iZoijcleaow == 2) {
            wkgbmnqykc(obj, iIobyxmoadg, ulzqkzuiruVar.readBytes());
            return true;
        }
        if (iZoijcleaow != 3) {
            if (iZoijcleaow == 4) {
                return false;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.nufgyqmvbu();
            }
            iobyxmoadg(obj, iIobyxmoadg, ulzqkzuiruVar.readFixed32());
            return true;
        }
        Object objAgtfadlqog = agtfadlqog();
        int iPpxfxbqfkf = czzsidtyhn.ppxfxbqfkf(iIobyxmoadg, 4);
        draadjrbmk(objAgtfadlqog, ulzqkzuiruVar);
        if (iPpxfxbqfkf != ulzqkzuiruVar.getTag()) {
            throw InvalidProtocolBufferException.iobyxmoadg();
        }
        ppxfxbqfkf(obj, iIobyxmoadg, oxmwwwfdhm(objAgtfadlqog));
        return true;
    }

    abstract void wkgbmnqykc(Object obj, int i13, gxszxtbevo gxszxtbevoVar);

    abstract void zdlpuopuiu(Object obj, uwvvkdfqfp uwvvkdfqfpVar);

    abstract void zoijcleaow(Object obj, int i13, long j13);
}
