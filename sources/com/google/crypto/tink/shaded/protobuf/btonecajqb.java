package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class btonecajqb implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f23888iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f23889ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f23890wkgbmnqykc = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f23891zoijcleaow;

    private btonecajqb(dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) esjtqupxsv.zoijcleaow(dxjokdxxwwVar, "input");
        this.f23888iobyxmoadg = dxjokdxxwwVar2;
        dxjokdxxwwVar2.f23900wkgbmnqykc = this;
    }

    private void agtfadlqog(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
    }

    private Object btonecajqb(jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException {
        Object objNewInstance = jhduphickxVar.newInstance();
        nufgyqmvbu(objNewInstance, jhduphickxVar, ojitshcjhnVar);
        jhduphickxVar.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private void draadjrbmk(int i13) throws InvalidProtocolBufferException {
        if (this.f23888iobyxmoadg.wkgbmnqykc() != i13) {
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }
    }

    private Object dxjokdxxww(jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) {
        Object objNewInstance = jhduphickxVar.newInstance();
        lqeggnwhkg(objNewInstance, jhduphickxVar, ojitshcjhnVar);
        jhduphickxVar.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    public static btonecajqb gxszxtbevo(dxjokdxxww dxjokdxxwwVar) {
        btonecajqb btonecajqbVar = dxjokdxxwwVar.f23900wkgbmnqykc;
        return btonecajqbVar != null ? btonecajqbVar : new btonecajqb(dxjokdxxwwVar);
    }

    private void lqeggnwhkg(Object obj, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) {
        int i13 = this.f23889ppxfxbqfkf;
        this.f23889ppxfxbqfkf = sflfametgt.ppxfxbqfkf(sflfametgt.iobyxmoadg(this.f23891zoijcleaow), 4);
        try {
            jhduphickxVar.zoijcleaow(obj, this, ojitshcjhnVar);
            if (this.f23891zoijcleaow != this.f23889ppxfxbqfkf) {
                throw InvalidProtocolBufferException.agtfadlqog();
            }
            this.f23889ppxfxbqfkf = i13;
        } catch (Throwable th2) {
            this.f23889ppxfxbqfkf = i13;
            throw th2;
        }
    }

    private void nufgyqmvbu(Object obj, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException {
        int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
        dxjokdxxww dxjokdxxwwVar = this.f23888iobyxmoadg;
        if (dxjokdxxwwVar.f23898iobyxmoadg >= dxjokdxxwwVar.f23901zoijcleaow) {
            throw InvalidProtocolBufferException.ojitshcjhn();
        }
        int iDraadjrbmk = dxjokdxxwwVar.draadjrbmk(iIstkbnxepw);
        this.f23888iobyxmoadg.f23898iobyxmoadg++;
        jhduphickxVar.zoijcleaow(obj, this, ojitshcjhnVar);
        this.f23888iobyxmoadg.iobyxmoadg(0);
        dxjokdxxww dxjokdxxwwVar2 = this.f23888iobyxmoadg;
        dxjokdxxwwVar2.f23898iobyxmoadg--;
        dxjokdxxwwVar2.gtknphoqwx(iDraadjrbmk);
    }

    private void ojitshcjhn(int i13) throws InvalidProtocolBufferException {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
    }

    private void wflxmlrfwp(int i13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (sflfametgt.zoijcleaow(this.f23891zoijcleaow) != i13) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void eablkybsjg(List list, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        if (sflfametgt.zoijcleaow(this.f23891zoijcleaow) != 3) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int i13 = this.f23891zoijcleaow;
        do {
            list.add(dxjokdxxww(jhduphickxVar, ojitshcjhnVar));
            if (this.f23888iobyxmoadg.eablkybsjg() || this.f23890wkgbmnqykc != 0) {
                return;
            } else {
                iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == i13);
        this.f23890wkgbmnqykc = iZynmafqrjb;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int getFieldNumber() {
        int i13 = this.f23890wkgbmnqykc;
        if (i13 != 0) {
            this.f23891zoijcleaow = i13;
            this.f23890wkgbmnqykc = 0;
        } else {
            this.f23891zoijcleaow = this.f23888iobyxmoadg.zynmafqrjb();
        }
        int i14 = this.f23891zoijcleaow;
        if (i14 == 0 || i14 == this.f23889ppxfxbqfkf) {
            return Integer.MAX_VALUE;
        }
        return sflfametgt.iobyxmoadg(i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int getTag() {
        return this.f23891zoijcleaow;
    }

    public void gtknphoqwx(List list, boolean z13) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (sflfametgt.zoijcleaow(this.f23891zoijcleaow) != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        if (!(list instanceof zynmafqrjb) || z13) {
            do {
                list.add(z13 ? readStringRequireUtf8() : readString());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb;
            return;
        }
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) list;
        do {
            zynmafqrjbVar.T(readBytes());
            if (this.f23888iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb2 == this.f23891zoijcleaow);
        this.f23890wkgbmnqykc = iZynmafqrjb2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void iobyxmoadg(Object obj, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(3);
        lqeggnwhkg(obj, jhduphickxVar, ojitshcjhnVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void ppxfxbqfkf(Object obj, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException {
        wflxmlrfwp(2);
        nufgyqmvbu(obj, jhduphickxVar, ojitshcjhnVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.wflxmlrfwp();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof gxszxtbevo)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Boolean.valueOf(this.f23888iobyxmoadg.wflxmlrfwp()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Boolean.valueOf(this.f23888iobyxmoadg.wflxmlrfwp()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                gxszxtbevoVar.addBoolean(this.f23888iobyxmoadg.wflxmlrfwp());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            gxszxtbevoVar.addBoolean(this.f23888iobyxmoadg.wflxmlrfwp());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public nufgyqmvbu readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return this.f23888iobyxmoadg.agtfadlqog();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        if (sflfametgt.zoijcleaow(this.f23891zoijcleaow) != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        do {
            list.add(readBytes());
            if (this.f23888iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == this.f23891zoijcleaow);
        this.f23890wkgbmnqykc = iZynmafqrjb;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(1);
        return this.f23888iobyxmoadg.ojitshcjhn();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof draadjrbmk)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 1) {
                do {
                    list.add(Double.valueOf(this.f23888iobyxmoadg.ojitshcjhn()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
            ojitshcjhn(iIstkbnxepw);
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
            do {
                list.add(Double.valueOf(this.f23888iobyxmoadg.ojitshcjhn()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            return;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 1) {
            do {
                draadjrbmkVar.addDouble(this.f23888iobyxmoadg.ojitshcjhn());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iIstkbnxepw2 = this.f23888iobyxmoadg.istkbnxepw();
        ojitshcjhn(iIstkbnxepw2);
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw2;
        do {
            draadjrbmkVar.addDouble(this.f23888iobyxmoadg.ojitshcjhn());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.rgvfuqvkyq();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cqumvgiudr)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Integer.valueOf(this.f23888iobyxmoadg.rgvfuqvkyq()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Integer.valueOf(this.f23888iobyxmoadg.rgvfuqvkyq()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cqumvgiudrVar.addInt(this.f23888iobyxmoadg.rgvfuqvkyq());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cqumvgiudrVar.addInt(this.f23888iobyxmoadg.rgvfuqvkyq());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(5);
        return this.f23888iobyxmoadg.vdvldrhtss();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cqumvgiudr)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 2) {
                int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
                agtfadlqog(iIstkbnxepw);
                int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
                do {
                    list.add(Integer.valueOf(this.f23888iobyxmoadg.vdvldrhtss()));
                } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
                return;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            do {
                list.add(Integer.valueOf(this.f23888iobyxmoadg.vdvldrhtss()));
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb;
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 2) {
            int iIstkbnxepw2 = this.f23888iobyxmoadg.istkbnxepw();
            agtfadlqog(iIstkbnxepw2);
            int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw2;
            do {
                cqumvgiudrVar.addInt(this.f23888iobyxmoadg.vdvldrhtss());
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
            return;
        }
        if (iZoijcleaow2 != 5) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        do {
            cqumvgiudrVar.addInt(this.f23888iobyxmoadg.vdvldrhtss());
            if (this.f23888iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb2 == this.f23891zoijcleaow);
        this.f23890wkgbmnqykc = iZynmafqrjb2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(1);
        return this.f23888iobyxmoadg.oxmwwwfdhm();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cdpycssgdh)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 1) {
                do {
                    list.add(Long.valueOf(this.f23888iobyxmoadg.oxmwwwfdhm()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
            ojitshcjhn(iIstkbnxepw);
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
            do {
                list.add(Long.valueOf(this.f23888iobyxmoadg.oxmwwwfdhm()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            return;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 1) {
            do {
                cdpycssgdhVar.addLong(this.f23888iobyxmoadg.oxmwwwfdhm());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iIstkbnxepw2 = this.f23888iobyxmoadg.istkbnxepw();
        ojitshcjhn(iIstkbnxepw2);
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw2;
        do {
            cdpycssgdhVar.addLong(this.f23888iobyxmoadg.oxmwwwfdhm());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(5);
        return this.f23888iobyxmoadg.kcexrzcfyt();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof yggfygwlhe)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 2) {
                int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
                agtfadlqog(iIstkbnxepw);
                int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
                do {
                    list.add(Float.valueOf(this.f23888iobyxmoadg.kcexrzcfyt()));
                } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
                return;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            do {
                list.add(Float.valueOf(this.f23888iobyxmoadg.kcexrzcfyt()));
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb;
            return;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 2) {
            int iIstkbnxepw2 = this.f23888iobyxmoadg.istkbnxepw();
            agtfadlqog(iIstkbnxepw2);
            int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw2;
            do {
                yggfygwlheVar.addFloat(this.f23888iobyxmoadg.kcexrzcfyt());
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
            return;
        }
        if (iZoijcleaow2 != 5) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        do {
            yggfygwlheVar.addFloat(this.f23888iobyxmoadg.kcexrzcfyt());
            if (this.f23888iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb2 == this.f23891zoijcleaow);
        this.f23890wkgbmnqykc = iZynmafqrjb2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.zdlpuopuiu();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cqumvgiudr)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Integer.valueOf(this.f23888iobyxmoadg.zdlpuopuiu()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Integer.valueOf(this.f23888iobyxmoadg.zdlpuopuiu()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cqumvgiudrVar.addInt(this.f23888iobyxmoadg.zdlpuopuiu());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cqumvgiudrVar.addInt(this.f23888iobyxmoadg.zdlpuopuiu());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.yggfygwlhe();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cdpycssgdh)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Long.valueOf(this.f23888iobyxmoadg.yggfygwlhe()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Long.valueOf(this.f23888iobyxmoadg.yggfygwlhe()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cdpycssgdhVar.addLong(this.f23888iobyxmoadg.yggfygwlhe());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cdpycssgdhVar.addLong(this.f23888iobyxmoadg.yggfygwlhe());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(5);
        return this.f23888iobyxmoadg.jyumaefscl();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cqumvgiudr)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 2) {
                int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
                agtfadlqog(iIstkbnxepw);
                int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
                do {
                    list.add(Integer.valueOf(this.f23888iobyxmoadg.jyumaefscl()));
                } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
                return;
            }
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            do {
                list.add(Integer.valueOf(this.f23888iobyxmoadg.jyumaefscl()));
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb;
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 2) {
            int iIstkbnxepw2 = this.f23888iobyxmoadg.istkbnxepw();
            agtfadlqog(iIstkbnxepw2);
            int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw2;
            do {
                cqumvgiudrVar.addInt(this.f23888iobyxmoadg.jyumaefscl());
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
            return;
        }
        if (iZoijcleaow2 != 5) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        do {
            cqumvgiudrVar.addInt(this.f23888iobyxmoadg.jyumaefscl());
            if (this.f23888iobyxmoadg.eablkybsjg()) {
                return;
            } else {
                iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb2 == this.f23891zoijcleaow);
        this.f23890wkgbmnqykc = iZynmafqrjb2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(1);
        return this.f23888iobyxmoadg.iwizpuwonk();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cdpycssgdh)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 1) {
                do {
                    list.add(Long.valueOf(this.f23888iobyxmoadg.iwizpuwonk()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iIstkbnxepw = this.f23888iobyxmoadg.istkbnxepw();
            ojitshcjhn(iIstkbnxepw);
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw;
            do {
                list.add(Long.valueOf(this.f23888iobyxmoadg.iwizpuwonk()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            return;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 1) {
            do {
                cdpycssgdhVar.addLong(this.f23888iobyxmoadg.iwizpuwonk());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iIstkbnxepw2 = this.f23888iobyxmoadg.istkbnxepw();
        ojitshcjhn(iIstkbnxepw2);
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + iIstkbnxepw2;
        do {
            cdpycssgdhVar.addLong(this.f23888iobyxmoadg.iwizpuwonk());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.cqumvgiudr();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cqumvgiudr)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Integer.valueOf(this.f23888iobyxmoadg.cqumvgiudr()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Integer.valueOf(this.f23888iobyxmoadg.cqumvgiudr()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cqumvgiudrVar.addInt(this.f23888iobyxmoadg.cqumvgiudr());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cqumvgiudrVar.addInt(this.f23888iobyxmoadg.cqumvgiudr());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.esjtqupxsv();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cdpycssgdh)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Long.valueOf(this.f23888iobyxmoadg.esjtqupxsv()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Long.valueOf(this.f23888iobyxmoadg.esjtqupxsv()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cdpycssgdhVar.addLong(this.f23888iobyxmoadg.esjtqupxsv());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cdpycssgdhVar.addLong(this.f23888iobyxmoadg.esjtqupxsv());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return this.f23888iobyxmoadg.lereixgezr();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        gtknphoqwx(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        gtknphoqwx(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        return this.f23888iobyxmoadg.pmvmpeiblj();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.istkbnxepw();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cqumvgiudr)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Integer.valueOf(this.f23888iobyxmoadg.istkbnxepw()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Integer.valueOf(this.f23888iobyxmoadg.istkbnxepw()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cqumvgiudrVar.addInt(this.f23888iobyxmoadg.istkbnxepw());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cqumvgiudrVar.addInt(this.f23888iobyxmoadg.istkbnxepw());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(0);
        return this.f23888iobyxmoadg.cdpycssgdh();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iZynmafqrjb;
        int iZynmafqrjb2;
        if (!(list instanceof cdpycssgdh)) {
            int iZoijcleaow = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
            if (iZoijcleaow == 0) {
                do {
                    list.add(Long.valueOf(this.f23888iobyxmoadg.cdpycssgdh()));
                    if (this.f23888iobyxmoadg.eablkybsjg()) {
                        return;
                    } else {
                        iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
                    }
                } while (iZynmafqrjb == this.f23891zoijcleaow);
                this.f23890wkgbmnqykc = iZynmafqrjb;
                return;
            }
            if (iZoijcleaow != 2) {
                throw InvalidProtocolBufferException.dxjokdxxww();
            }
            int iWkgbmnqykc = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
            do {
                list.add(Long.valueOf(this.f23888iobyxmoadg.cdpycssgdh()));
            } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc);
            draadjrbmk(iWkgbmnqykc);
            return;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
        int iZoijcleaow2 = sflfametgt.zoijcleaow(this.f23891zoijcleaow);
        if (iZoijcleaow2 == 0) {
            do {
                cdpycssgdhVar.addLong(this.f23888iobyxmoadg.cdpycssgdh());
                if (this.f23888iobyxmoadg.eablkybsjg()) {
                    return;
                } else {
                    iZynmafqrjb2 = this.f23888iobyxmoadg.zynmafqrjb();
                }
            } while (iZynmafqrjb2 == this.f23891zoijcleaow);
            this.f23890wkgbmnqykc = iZynmafqrjb2;
            return;
        }
        if (iZoijcleaow2 != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int iWkgbmnqykc2 = this.f23888iobyxmoadg.wkgbmnqykc() + this.f23888iobyxmoadg.istkbnxepw();
        do {
            cdpycssgdhVar.addLong(this.f23888iobyxmoadg.cdpycssgdh());
        } while (this.f23888iobyxmoadg.wkgbmnqykc() < iWkgbmnqykc2);
        draadjrbmk(iWkgbmnqykc2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public boolean skipField() {
        int i13;
        if (this.f23888iobyxmoadg.eablkybsjg() || (i13 = this.f23891zoijcleaow) == this.f23889ppxfxbqfkf) {
            return false;
        }
        return this.f23888iobyxmoadg.yadqdtsiqt(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void wkgbmnqykc(List list, jhduphickx jhduphickxVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZynmafqrjb;
        if (sflfametgt.zoijcleaow(this.f23891zoijcleaow) != 2) {
            throw InvalidProtocolBufferException.dxjokdxxww();
        }
        int i13 = this.f23891zoijcleaow;
        do {
            list.add(btonecajqb(jhduphickxVar, ojitshcjhnVar));
            if (this.f23888iobyxmoadg.eablkybsjg() || this.f23890wkgbmnqykc != 0) {
                return;
            } else {
                iZynmafqrjb = this.f23888iobyxmoadg.zynmafqrjb();
            }
        } while (iZynmafqrjb == i13);
        this.f23890wkgbmnqykc = iZynmafqrjb;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.vipkmwdibw
    public void zoijcleaow(Map map, iozdgvuglv.iobyxmoadg iobyxmoadgVar, ojitshcjhn ojitshcjhnVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        wflxmlrfwp(2);
        this.f23888iobyxmoadg.draadjrbmk(this.f23888iobyxmoadg.istkbnxepw());
        throw null;
    }
}
