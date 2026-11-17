package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class gtknphoqwx implements zfvoamnweg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CodedOutputStream f23929iobyxmoadg;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f23930iobyxmoadg;

        static {
            int[] iArr = new int[sflfametgt.zoijcleaow.values().length];
            f23930iobyxmoadg = iArr;
            try {
                iArr[sflfametgt.zoijcleaow.f24029istkbnxepw.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24040zynmafqrjb.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24033lereixgezr.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24035pkzmftpjix.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24031jpowsppfya.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24037wwaezpbzkn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24036pmvmpeiblj.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24024cqumvgiudr.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24026hcddaimhww.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24027hkdspvbjdz.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24025esjtqupxsv.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23930iobyxmoadg[sflfametgt.zoijcleaow.f24022cdpycssgdh.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private gtknphoqwx(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) esjtqupxsv.zoijcleaow(codedOutputStream, "output");
        this.f23929iobyxmoadg = codedOutputStream2;
        codedOutputStream2.f23878iobyxmoadg = this;
    }

    private void dxjokdxxww(int i13, Object obj) {
        if (obj instanceof String) {
            this.f23929iobyxmoadg.skhdrjzrfn(i13, (String) obj);
        } else {
            this.f23929iobyxmoadg.vipkmwdibw(i13, (nufgyqmvbu) obj);
        }
    }

    public static gtknphoqwx lqeggnwhkg(CodedOutputStream codedOutputStream) {
        gtknphoqwx gtknphoqwxVar = codedOutputStream.f23878iobyxmoadg;
        return gtknphoqwxVar != null ? gtknphoqwxVar : new gtknphoqwx(codedOutputStream);
    }

    private void nufgyqmvbu(int i13, iozdgvuglv.iobyxmoadg iobyxmoadgVar, Map map) {
        int[] iArr = iobyxmoadg.f23930iobyxmoadg;
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void eablkybsjg(int i13, Object obj, jhduphickx jhduphickxVar) {
        this.f23929iobyxmoadg.iyctptxqzt(i13, (hkdspvbjdz) obj, jhduphickxVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public zfvoamnweg.iobyxmoadg fieldOrder() {
        return zfvoamnweg.iobyxmoadg.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void gxszxtbevo(int i13, List list, jhduphickx jhduphickxVar) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            zoijcleaow(i13, list.get(i14), jhduphickxVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void iobyxmoadg(int i13, iozdgvuglv.iobyxmoadg iobyxmoadgVar, Map map) {
        if (this.f23929iobyxmoadg.mbcevpiqjq()) {
            nufgyqmvbu(i13, iobyxmoadgVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f23929iobyxmoadg.igdgnonuha(i13, 2);
            this.f23929iobyxmoadg.wizcaqwiak(iozdgvuglv.iobyxmoadg(iobyxmoadgVar, entry.getKey(), entry.getValue()));
            iozdgvuglv.zoijcleaow(this.f23929iobyxmoadg, iobyxmoadgVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void ppxfxbqfkf(int i13, List list, jhduphickx jhduphickxVar) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            eablkybsjg(i13, list.get(i14), jhduphickxVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void wkgbmnqykc(int i13, nufgyqmvbu nufgyqmvbuVar) {
        this.f23929iobyxmoadg.vipkmwdibw(i13, nufgyqmvbuVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeBool(int i13, boolean z13) {
        this.f23929iobyxmoadg.jlmebxxoox(i13, z13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeBoolList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.jlmebxxoox(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iEablkybsjg = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iEablkybsjg += CodedOutputStream.eablkybsjg(((Boolean) list.get(i15)).booleanValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iEablkybsjg);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.ribwqtqdhb(((Boolean) list.get(i14)).booleanValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeBytesList(int i13, List list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f23929iobyxmoadg.vipkmwdibw(i13, (nufgyqmvbu) list.get(i14));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeDouble(int i13, double d13) {
        this.f23929iobyxmoadg.jhduphickx(i13, d13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeDoubleList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.jhduphickx(i13, ((Double) list.get(i14)).doubleValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iDxjokdxxww = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iDxjokdxxww += CodedOutputStream.dxjokdxxww(((Double) list.get(i15)).doubleValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iDxjokdxxww);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.ikoacuggdj(((Double) list.get(i14)).doubleValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeEndGroup(int i13) {
        this.f23929iobyxmoadg.igdgnonuha(i13, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeEnum(int i13, int i14) {
        this.f23929iobyxmoadg.okpsazkaxt(i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeEnumList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.okpsazkaxt(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iGtknphoqwx = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iGtknphoqwx += CodedOutputStream.gtknphoqwx(((Integer) list.get(i15)).intValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iGtknphoqwx);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.jztzpxfvev(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeFixed32(int i13, int i14) {
        this.f23929iobyxmoadg.xrmfcynszj(i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeFixed32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.xrmfcynszj(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iWflxmlrfwp = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iWflxmlrfwp += CodedOutputStream.wflxmlrfwp(((Integer) list.get(i15)).intValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iWflxmlrfwp);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.metgxyhuhe(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeFixed64(int i13, long j13) {
        this.f23929iobyxmoadg.rlfsiqarku(i13, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeFixed64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.rlfsiqarku(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iOjitshcjhn = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(((Long) list.get(i15)).longValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iOjitshcjhn);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.czzsidtyhn(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeFloat(int i13, float f13) {
        this.f23929iobyxmoadg.uwvvkdfqfp(i13, f13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeFloatList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.uwvvkdfqfp(i13, ((Float) list.get(i14)).floatValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iVdvldrhtss = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iVdvldrhtss += CodedOutputStream.vdvldrhtss(((Float) list.get(i15)).floatValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iVdvldrhtss);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.yfnezrywwk(((Float) list.get(i14)).floatValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeInt32(int i13, int i14) {
        this.f23929iobyxmoadg.zfvoamnweg(i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeInt32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.zfvoamnweg(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iYggfygwlhe = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iYggfygwlhe += CodedOutputStream.yggfygwlhe(((Integer) list.get(i15)).intValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iYggfygwlhe);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.oipsdeybqn(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeInt64(int i13, long j13) {
        this.f23929iobyxmoadg.bfopjjpdmp(i13, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeInt64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.bfopjjpdmp(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iIwizpuwonk = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iIwizpuwonk += CodedOutputStream.iwizpuwonk(((Long) list.get(i15)).longValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iIwizpuwonk);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.opjhrmiecq(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public final void writeMessageSetItem(int i13, Object obj) {
        if (obj instanceof nufgyqmvbu) {
            this.f23929iobyxmoadg.lrnfpwlwnk(i13, (nufgyqmvbu) obj);
        } else {
            this.f23929iobyxmoadg.weqkydbzbr(i13, (hkdspvbjdz) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSFixed32(int i13, int i14) {
        this.f23929iobyxmoadg.zeieaojujs(i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSFixed32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.zeieaojujs(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iIstkbnxepw = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iIstkbnxepw += CodedOutputStream.istkbnxepw(((Integer) list.get(i15)).intValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iIstkbnxepw);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.nuxfzjnpeb(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSFixed64(int i13, long j13) {
        this.f23929iobyxmoadg.tbqsvytpvh(i13, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSFixed64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.tbqsvytpvh(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iYadqdtsiqt = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iYadqdtsiqt += CodedOutputStream.yadqdtsiqt(((Long) list.get(i15)).longValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iYadqdtsiqt);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.roivzttewh(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSInt32(int i13, int i14) {
        this.f23929iobyxmoadg.uawqvzlxes(i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSInt32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.uawqvzlxes(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iLmojexxdyd = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iLmojexxdyd += CodedOutputStream.lmojexxdyd(((Integer) list.get(i15)).intValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iLmojexxdyd);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.auzgnhcxok(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSInt64(int i13, long j13) {
        this.f23929iobyxmoadg.iwxlajgraz(i13, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeSInt64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.iwxlajgraz(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iYlkuphrtab = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iYlkuphrtab += CodedOutputStream.ylkuphrtab(((Long) list.get(i15)).longValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iYlkuphrtab);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.dvvnrvtcbc(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeStartGroup(int i13) {
        this.f23929iobyxmoadg.igdgnonuha(i13, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeString(int i13, String str) {
        this.f23929iobyxmoadg.skhdrjzrfn(i13, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeStringList(int i13, List list) {
        int i14 = 0;
        if (!(list instanceof zynmafqrjb)) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.skhdrjzrfn(i13, (String) list.get(i14));
                i14++;
            }
        } else {
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) list;
            while (i14 < list.size()) {
                dxjokdxxww(i13, zynmafqrjbVar.getRaw(i14));
                i14++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeUInt32(int i13, int i14) {
        this.f23929iobyxmoadg.lxfrhoxuzk(i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeUInt32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.lxfrhoxuzk(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iCllcsxoeiz = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iCllcsxoeiz += CodedOutputStream.cllcsxoeiz(((Integer) list.get(i15)).intValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iCllcsxoeiz);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.wizcaqwiak(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeUInt64(int i13, long j13) {
        this.f23929iobyxmoadg.hszhottldk(i13, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void writeUInt64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f23929iobyxmoadg.hszhottldk(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f23929iobyxmoadg.igdgnonuha(i13, 2);
        int iWypolnanlu = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iWypolnanlu += CodedOutputStream.wypolnanlu(((Long) list.get(i15)).longValue());
        }
        this.f23929iobyxmoadg.wizcaqwiak(iWypolnanlu);
        while (i14 < list.size()) {
            this.f23929iobyxmoadg.fiwbwshyhd(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zfvoamnweg
    public void zoijcleaow(int i13, Object obj, jhduphickx jhduphickxVar) {
        this.f23929iobyxmoadg.ydmasvzmpa(i13, (hkdspvbjdz) obj, jhduphickxVar);
    }
}
