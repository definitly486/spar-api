package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu implements ulzqkzuiru {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f8754iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f8755ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f8756wkgbmnqykc = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f8757zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f8758iobyxmoadg;

        static {
            int[] iArr = new int[czzsidtyhn.zoijcleaow.values().length];
            f8758iobyxmoadg = iArr;
            try {
                iArr[czzsidtyhn.zoijcleaow.f8611istkbnxepw.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8616lmojexxdyd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8614jyumaefscl.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8621ylkuphrtab.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8622zynmafqrjb.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8618pmvmpeiblj.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8612iwizpuwonk.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8615lereixgezr.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8606cqumvgiudr.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8610iozdgvuglv.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8617pkzmftpjix.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8608hcddaimhww.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8613jpowsppfya.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8609hkdspvbjdz.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8604cdpycssgdh.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8619wwaezpbzkn.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8758iobyxmoadg[czzsidtyhn.zoijcleaow.f8607esjtqupxsv.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) zdlpuopuiu.zoijcleaow(lqeggnwhkgVar, "input");
        this.f8754iobyxmoadg = lqeggnwhkgVar2;
        lqeggnwhkgVar2.f8703wkgbmnqykc = this;
    }

    private void agtfadlqog(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
    }

    private void draadjrbmk(int i13) throws InvalidProtocolBufferException {
        if (this.f8754iobyxmoadg.wkgbmnqykc() != i13) {
            throw InvalidProtocolBufferException.vdvldrhtss();
        }
    }

    private Object dxjokdxxww(sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException {
        int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
        lqeggnwhkg lqeggnwhkgVar = this.f8754iobyxmoadg;
        if (lqeggnwhkgVar.f8701iobyxmoadg >= lqeggnwhkgVar.f8704zoijcleaow) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
        int iDraadjrbmk = lqeggnwhkgVar.draadjrbmk(iIstkbnxepw);
        Object objNewInstance = sopmlzcsovVar.newInstance();
        this.f8754iobyxmoadg.f8701iobyxmoadg++;
        sopmlzcsovVar.iobyxmoadg(objNewInstance, this, draadjrbmkVar);
        sopmlzcsovVar.makeImmutable(objNewInstance);
        this.f8754iobyxmoadg.iobyxmoadg(0);
        lqeggnwhkg lqeggnwhkgVar2 = this.f8754iobyxmoadg;
        lqeggnwhkgVar2.f8701iobyxmoadg--;
        lqeggnwhkgVar2.gtknphoqwx(iDraadjrbmk);
        return objNewInstance;
    }

    public static nufgyqmvbu gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) {
        nufgyqmvbu nufgyqmvbuVar = lqeggnwhkgVar.f8703wkgbmnqykc;
        return nufgyqmvbuVar != null ? nufgyqmvbuVar : new nufgyqmvbu(lqeggnwhkgVar);
    }

    private Object lqeggnwhkg(czzsidtyhn.zoijcleaow zoijcleaowVar, Class cls, draadjrbmk draadjrbmkVar) {
        switch (iobyxmoadg.f8758iobyxmoadg[zoijcleaowVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return btonecajqb(cls, draadjrbmkVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object nufgyqmvbu(sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) {
        int i13 = this.f8755ppxfxbqfkf;
        this.f8755ppxfxbqfkf = czzsidtyhn.ppxfxbqfkf(czzsidtyhn.iobyxmoadg(this.f8757zoijcleaow), 4);
        try {
            Object objNewInstance = sopmlzcsovVar.newInstance();
            sopmlzcsovVar.iobyxmoadg(objNewInstance, this, draadjrbmkVar);
            sopmlzcsovVar.makeImmutable(objNewInstance);
            if (this.f8757zoijcleaow != this.f8755ppxfxbqfkf) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            this.f8755ppxfxbqfkf = i13;
            return objNewInstance;
        } catch (Throwable th2) {
            this.f8755ppxfxbqfkf = i13;
            throw th2;
        }
    }

    private void ojitshcjhn(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
    }

    private void wflxmlrfwp(int i13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (czzsidtyhn.zoijcleaow(this.f8757zoijcleaow) != i13) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
    }

    public Object btonecajqb(Class cls, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return dxjokdxxww(tzroggbefp.iobyxmoadg().ppxfxbqfkf(cls), draadjrbmkVar);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void eablkybsjg(List list, sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        if (czzsidtyhn.zoijcleaow(this.f8757zoijcleaow) != 3) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int i13 = this.f8757zoijcleaow;
        do {
            list.add(nufgyqmvbu(sopmlzcsovVar, draadjrbmkVar));
            if (this.f8754iobyxmoadg.eablkybsjg() || this.f8756wkgbmnqykc != 0) {
                return;
            } else {
                iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == i13);
        this.f8756wkgbmnqykc = iZynmafqrjb;
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int getFieldNumber() {
        int i13 = this.f8756wkgbmnqykc;
        if (i13 != 0) {
            this.f8757zoijcleaow = i13;
            this.f8756wkgbmnqykc = 0;
        } else {
            this.f8757zoijcleaow = this.f8754iobyxmoadg.zynmafqrjb();
        }
        int i14 = this.f8757zoijcleaow;
        if (i14 == 0 || i14 == this.f8755ppxfxbqfkf) {
            return Integer.MAX_VALUE;
        }
        return czzsidtyhn.iobyxmoadg(i14);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int getTag() {
        return this.f8757zoijcleaow;
    }

    public void gtknphoqwx(List list, boolean z13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (czzsidtyhn.zoijcleaow(this.f8757zoijcleaow) != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        if (!(list instanceof cqumvgiudr) || z13) {
            do {
                list.add(z13 ? readStringRequireUtf8() : readString());
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        do {
            cqumvgiudrVar.r(readBytes());
            if (this.f8754iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb2 = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb2 == this.f8757zoijcleaow);
        this.f8756wkgbmnqykc = iZynmafqrjb2;
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public Object iobyxmoadg(sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return dxjokdxxww(sopmlzcsovVar, draadjrbmkVar);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public Object ppxfxbqfkf(sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(3);
        return nufgyqmvbu(sopmlzcsovVar, draadjrbmkVar);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.wflxmlrfwp();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Boolean.valueOf(this.f8754iobyxmoadg.wflxmlrfwp()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Boolean.valueOf(this.f8754iobyxmoadg.wflxmlrfwp()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public gxszxtbevo readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return this.f8754iobyxmoadg.agtfadlqog();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        if (czzsidtyhn.zoijcleaow(this.f8757zoijcleaow) != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        do {
            list.add(readBytes());
            if (this.f8754iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == this.f8757zoijcleaow);
        this.f8756wkgbmnqykc = iZynmafqrjb;
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(1);
        return this.f8754iobyxmoadg.ojitshcjhn();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 1) {
            do {
                list.add(Double.valueOf(this.f8754iobyxmoadg.ojitshcjhn()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
        ojitshcjhn(iIstkbnxepw);
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
        do {
            list.add(Double.valueOf(this.f8754iobyxmoadg.ojitshcjhn()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.rgvfuqvkyq();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Integer.valueOf(this.f8754iobyxmoadg.rgvfuqvkyq()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Integer.valueOf(this.f8754iobyxmoadg.rgvfuqvkyq()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(5);
        return this.f8754iobyxmoadg.vdvldrhtss();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 2) {
            int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
            agtfadlqog(iIstkbnxepw);
            int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
            do {
                list.add(Integer.valueOf(this.f8754iobyxmoadg.vdvldrhtss()));
            } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            return;
        }
        if (iZoijcleaow != 5) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        do {
            list.add(Integer.valueOf(this.f8754iobyxmoadg.vdvldrhtss()));
            if (this.f8754iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == this.f8757zoijcleaow);
        this.f8756wkgbmnqykc = iZynmafqrjb;
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(1);
        return this.f8754iobyxmoadg.oxmwwwfdhm();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 1) {
            do {
                list.add(Long.valueOf(this.f8754iobyxmoadg.oxmwwwfdhm()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
        ojitshcjhn(iIstkbnxepw);
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
        do {
            list.add(Long.valueOf(this.f8754iobyxmoadg.oxmwwwfdhm()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(5);
        return this.f8754iobyxmoadg.kcexrzcfyt();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 2) {
            int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
            agtfadlqog(iIstkbnxepw);
            int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
            do {
                list.add(Float.valueOf(this.f8754iobyxmoadg.kcexrzcfyt()));
            } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            return;
        }
        if (iZoijcleaow != 5) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        do {
            list.add(Float.valueOf(this.f8754iobyxmoadg.kcexrzcfyt()));
            if (this.f8754iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == this.f8757zoijcleaow);
        this.f8756wkgbmnqykc = iZynmafqrjb;
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.zdlpuopuiu();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Integer.valueOf(this.f8754iobyxmoadg.zdlpuopuiu()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Integer.valueOf(this.f8754iobyxmoadg.zdlpuopuiu()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.yggfygwlhe();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Long.valueOf(this.f8754iobyxmoadg.yggfygwlhe()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Long.valueOf(this.f8754iobyxmoadg.yggfygwlhe()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(5);
        return this.f8754iobyxmoadg.jyumaefscl();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 2) {
            int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
            agtfadlqog(iIstkbnxepw);
            int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
            do {
                list.add(Integer.valueOf(this.f8754iobyxmoadg.jyumaefscl()));
            } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            return;
        }
        if (iZoijcleaow != 5) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        do {
            list.add(Integer.valueOf(this.f8754iobyxmoadg.jyumaefscl()));
            if (this.f8754iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == this.f8757zoijcleaow);
        this.f8756wkgbmnqykc = iZynmafqrjb;
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(1);
        return this.f8754iobyxmoadg.iwizpuwonk();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 1) {
            do {
                list.add(Long.valueOf(this.f8754iobyxmoadg.iwizpuwonk()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iIstkbnxepw = this.f8754iobyxmoadg.istkbnxepw();
        ojitshcjhn(iIstkbnxepw);
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
        do {
            list.add(Long.valueOf(this.f8754iobyxmoadg.iwizpuwonk()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.cqumvgiudr();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Integer.valueOf(this.f8754iobyxmoadg.cqumvgiudr()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Integer.valueOf(this.f8754iobyxmoadg.cqumvgiudr()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.esjtqupxsv();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Long.valueOf(this.f8754iobyxmoadg.esjtqupxsv()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Long.valueOf(this.f8754iobyxmoadg.esjtqupxsv()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return this.f8754iobyxmoadg.lereixgezr();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        gtknphoqwx(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        gtknphoqwx(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return this.f8754iobyxmoadg.pmvmpeiblj();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.istkbnxepw();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Integer.valueOf(this.f8754iobyxmoadg.istkbnxepw()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Integer.valueOf(this.f8754iobyxmoadg.istkbnxepw()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f8754iobyxmoadg.cdpycssgdh();
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZoijcleaow = czzsidtyhn.zoijcleaow(this.f8757zoijcleaow);
        if (iZoijcleaow == 0) {
            do {
                list.add(Long.valueOf(this.f8754iobyxmoadg.cdpycssgdh()));
                if (this.f8754iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f8757zoijcleaow);
            this.f8756wkgbmnqykc = iZynmafqrjb;
            return;
        }
        if (iZoijcleaow != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int iWkgbmnqykc = this.f8754iobyxmoadg.wkgbmnqykc() + this.f8754iobyxmoadg.istkbnxepw();
        do {
            list.add(Long.valueOf(this.f8754iobyxmoadg.cdpycssgdh()));
        } while (this.f8754iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
        draadjrbmk(iWkgbmnqykc);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public boolean skipField() {
        int i13;
        if (this.f8754iobyxmoadg.eablkybsjg() || (i13 = this.f8757zoijcleaow) == this.f8755ppxfxbqfkf) {
            return false;
        }
        return this.f8754iobyxmoadg.yadqdtsiqt(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void wkgbmnqykc(Map map, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        int iDraadjrbmk = this.f8754iobyxmoadg.draadjrbmk(this.f8754iobyxmoadg.istkbnxepw());
        Object objLqeggnwhkg = iobyxmoadgVar.f8774zoijcleaow;
        Object objLqeggnwhkg2 = iobyxmoadgVar.f8773wkgbmnqykc;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f8754iobyxmoadg.eablkybsjg()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar.f8771iobyxmoadg, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objLqeggnwhkg2 = lqeggnwhkg(iobyxmoadgVar.f8772ppxfxbqfkf, iobyxmoadgVar.f8773wkgbmnqykc.getClass(), draadjrbmkVar);
                }
            } catch (Throwable th2) {
                this.f8754iobyxmoadg.gtknphoqwx(iDraadjrbmk);
                throw th2;
            }
        }
        map.put(objLqeggnwhkg, objLqeggnwhkg2);
        this.f8754iobyxmoadg.gtknphoqwx(iDraadjrbmk);
    }

    @Override // androidx.datastore.preferences.protobuf.ulzqkzuiru
    public void zoijcleaow(List list, sopmlzcsov sopmlzcsovVar, draadjrbmk draadjrbmkVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        if (czzsidtyhn.zoijcleaow(this.f8757zoijcleaow) != 2) {
            throw InvalidProtocolBufferException.nufgyqmvbu();
        }
        int i13 = this.f8757zoijcleaow;
        do {
            list.add(dxjokdxxww(sopmlzcsovVar, draadjrbmkVar));
            if (this.f8754iobyxmoadg.eablkybsjg() || this.f8756wkgbmnqykc != 0) {
                return;
            } else {
                iZynmafqrjb = this.f8754iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == i13);
        this.f8756wkgbmnqykc = iZynmafqrjb;
    }
}
